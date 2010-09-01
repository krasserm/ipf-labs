package org.openehealth.ipf.platform.camel.flow.admin.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.Response;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.*;

import java.util.*;

import static org.openehealth.ipf.platform.camel.flow.admin.client.JSONUtil.toStringList;

public class IpfFlowAdmin implements EntryPoint {
    private final SelectableGrid appsGrid = new SelectableGrid();
    private final SelectableGrid msgGrid = new SelectableGrid();
    private final SelectableGrid flowGrid = new SelectableGrid();
    private final InlineLabel msgDelete = new InlineLabel("delete");
    private final InlineLabel msgReplay = new InlineLabel("replay");
    private final FlowPanel msgButtons = new FlowPanel();
    private final FlowPanel msgAndFlowPanel = new FlowPanel();
    private final FlowPanel msgPanel = new FlowPanel();
    private final FlowPanel flowPanel = new FlowPanel();
    private Integer curMsgIdx;
    private Integer curAppIdx;
    private Panel appPanel;
    private Panel appHeader;
    private JSONObject lastMsgForPaging;
    private JSONObject lastFlowForPaging;
    private int pageSize = 10;

    public void onModuleLoad() {
        configureMsgButtons();
        configureAppsGrid();
        configureMsgGrid();
        configureFlowGrid();
        configureMsgAndFlowPanel();

        RootPanel.get().add(msgAndFlowPanel);
        RootPanel.get().add(appHeader);
        RootPanel.get().add(appPanel);
        RootPanel.get().add(msgButtons);
    }

    private void configureMsgAndFlowPanel() {
        msgAndFlowPanel.setStyleName("msgAndFlowPanel");
        msgAndFlowPanel.add(msgPanel);
        msgAndFlowPanel.add(flowPanel);
    }

    private void configureMsgButtons() {
        msgButtons.setStyleName("msgButtons");
        msgButtons.add(msgDelete);
        msgButtons.add(msgReplay);
        msgDelete.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent clickEvent) {
                if (curMsgIdx != null) {
                    deleteCurMsg();
                }
            }
        });
        msgReplay.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent clickEvent) {
                if (curMsgIdx != null) {
                    replayCurMsg();
                }
            }
        });
        updateMsgsButtons();
    }

    private void updateMsgsButtons() {
        msgDelete.setStyleName(curMsgIdx == null ? "disabledTextButton" : "textButton");
        msgReplay.setStyleName(curMsgIdx == null ? "disabledTextButton" : "textButton");
    }

    private Panel wrap(Widget widget) {
        FlowPanel panel = new FlowPanel();
        panel.add(widget);
        return panel;
    }

    private void configureAppsGrid() {
        appPanel = wrap(appsGrid.getHeaderGrid());
        appHeader = wrap(appsGrid.getGrid());
        appPanel.setStyleName("appsGridHeader");
        appHeader.setStyleName("appsGrid");
        appsGrid.getGrid().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent clickEvent) {
                HTMLTable.Cell cell = appsGrid.getGrid().getCellForEvent(clickEvent);
                curAppIdx = cell.getRowIndex();
                updateMsgGrid();
            }
        });
        updateAppsGrid();
    }

    private void updateAppsGrid() {
        new Rest("/rest/applications").get(new GetCallback() {
            @Override
            protected void onSuccess(Response response) {
                JSONArray results = getResultsFromResponse(response);
                List<String> appIds = toStringList(results);
                List<List<String>> contents = new ArrayList<List<String>>();
                for (String appId : appIds) {
                    contents.add(Collections.singletonList(appId));
                }
                appsGrid.setContents(
                    Collections.singletonList("AppId"),
                    contents,
                    Collections.singletonList("100%"));
            }
        });
    }

    private void configureMsgGrid() {
        final Panel msgHeaderPanel = wrap(msgGrid.getHeaderGrid());
        final Panel msgGridPanel = wrap(msgGrid.getGrid());
        msgHeaderPanel.setStyleName("msgGridHeader");
        msgGridPanel.setStyleName("msgGrid");

        msgPanel.add(msgHeaderPanel);
        msgPanel.add(msgGridPanel);
        msgPanel.setStyleName("msgPanel");

        msgGrid.getGrid().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent clickEvent) {
                HTMLTable.Cell cell = msgGrid.getGrid().getCellForEvent(clickEvent);
                if (lastMsgForPaging != null && cell.getRowIndex() == msgGrid.getGrid().getRowCount() - 1) {
                    addMoreMsgsToGrid();
                }
                else {
                    curMsgIdx = cell.getRowIndex();
                    updateMsgsButtons();
                    updateFlowGrid();
                }
            }
        });
    }

    private String getCurAppId() {
        return appsGrid.getGrid().getText(curAppIdx, 0);
    }

    private String getCurMsgId() {
        return msgGrid.getGrid().getText(curMsgIdx, 1);
    }

    private void updateMsgGrid() {
        resetMsgGridSelection();
        String url = "/rest/messages?application=" + getCurAppId() + "&limit=" + pageSize;
        new Rest(url).get(new GetCallback() {
            @Override
            protected void onSuccess(Response response) {
                JSONArray results = getResultsFromResponse(response);
                lastMsgForPaging = getIteratorFromResponse(response);
                msgGrid.setContents(
                    Arrays.asList("Created", "MsgId", "Replayed"), getMsgGridContents(results),
                    Arrays.asList("30%", "40%", "30%"));
            }
        });
    }

    private void resetMsgGridSelection() {
        msgGrid.deselect();
        flowGrid.clear();
        curMsgIdx = null;
        updateMsgsButtons();
    }

    private void addMoreMsgsToGrid() {
        resetMsgGridSelection();
        String url = "/rest/messages?application=" + getCurAppId() + "&limit=" + pageSize + "&start=" + lastMsgForPaging;
        new Rest(url).get(new GetCallback() {
            @Override
            protected void onSuccess(Response response) {
                JSONArray jsonArray = getResultsFromResponse(response);
                lastMsgForPaging = getIteratorFromResponse(response);
                msgGrid.getGrid().resize(msgGrid.getGrid().getRowCount() - 1, msgGrid.getGrid().getColumnCount());
                msgGrid.addContents(getMsgGridContents(jsonArray));
            }
        });
    }

    private List<List<String>> getMsgGridContents(JSONArray jsonArray) {
        List<List<String>> contents = new ArrayList<List<String>>();
        for (int idx = 0; idx < jsonArray.size(); ++idx) {
            JSONObject jsonMsg = jsonArray.get(idx).isObject();
            contents.add(getMsgContent(jsonMsg));
        }

        if (lastMsgForPaging != null) {
            contents.add(Arrays.asList("...", "...", "..."));
        }
        return contents;
    }

    private List<String> getMsgContent(JSONObject jsonMsg) {
        return Arrays.asList(
            toDate(jsonMsg.get("creationDate").isNumber().toString()),
            jsonMsg.get("_id").isString().stringValue(),
            jsonMsg.get("replayCount").isNumber().toString()
        );
    }

    private void deleteCurMsg() {
        new Rest("/rest/messages/" + getCurMsgId()).delete(new DeleteCallback() {
            @Override
            protected void onSuccess(Response response) {
                msgGrid.remove(curMsgIdx);
                resetMsgGridSelection();
            }
        });
    }

    private void replayCurMsg() {
        final String curMsgId = getCurMsgId();
        new Rest("/rest/replayQueue").post("[\"" + curMsgId + "\"]", new PostCallback() {
            @Override
            protected void onSuccess(Response response) {
                new Rest("/rest/messages/" + curMsgId).get(new GetCallback() {
                    @Override
                    protected void onSuccess(Response response) {
                        JSONObject jsonMsg = JSONParser.parse(response.getText()).isObject();
                        List<String> content = getMsgContent(jsonMsg);
                        msgGrid.replace(curMsgIdx, content);
                        updateFlowGrid();
                    }
                });
            }
        });
    }

    private void configureFlowGrid() {
        final Panel flowHeaderPanel = wrap(flowGrid.getHeaderGrid());
        final Panel flowGridPanel = wrap(flowGrid.getGrid());
        flowHeaderPanel.setStyleName("flowGridHeader");
        flowGridPanel.setStyleName("flowGrid");

        flowPanel.add(flowHeaderPanel);
        flowPanel.add(flowGridPanel);
        flowPanel.setStyleName("flowPanel");

        flowGrid.getGrid().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent clickEvent) {
                HTMLTable.Cell cell = flowGrid.getGrid().getCellForEvent(clickEvent);
                if (lastFlowForPaging != null && cell.getRowIndex() == flowGrid.getGrid().getRowCount() - 1) {
                    addMoreFlowsToGrid();
                }
                else {
                    updateFlowButtons();
                }
            }
        });
    }

    private void updateFlowGrid() {
        resetFlowGridSelection();
        String url = "/rest/flows?message=" + getCurMsgId() + "&limit=" + pageSize;
        new Rest(url).get(new GetCallback() {
            @Override
            protected void onSuccess(Response response) {
                JSONArray jsonArray = getResultsFromResponse(response);
                lastFlowForPaging = getIteratorFromResponse(response);
                flowGrid.setContents(
                    Arrays.asList("Created", "FlowId", "Ack/Nak"),
                    getFlowGridContents(jsonArray),
                    Arrays.asList("30%", "40%", "30%"));
            }
        });
    }

    private List<List<String>> getFlowGridContents(JSONArray jsonArray) {
        List<List<String>> contents = new ArrayList<List<String>>();
        for (int idx = 0; idx < jsonArray.size(); ++idx) {
            JSONObject jsonFlow = jsonArray.get(idx).isObject();
            if (jsonFlow != null) {
                contents.add(getFlowContent(jsonFlow));
            }
        }

        if (lastFlowForPaging != null) {
            contents.add(Arrays.asList("...", "...", "..."));
        }
        return contents;
    }

    private List<String> getFlowContent(JSONObject jsonFlow) {
        boolean ack = jsonFlow.get("ack").isBoolean().booleanValue();
        boolean nak = jsonFlow.get("nak").isBoolean().booleanValue();
        return Arrays.asList(
            toDate(jsonFlow.get("creationDate").isNumber().toString()),
            jsonFlow.get("_id").isString().stringValue(),
            ack ? "ack" : nak ? "nak" : "-"
        );
    }

    private void resetFlowGridSelection() {
        flowGrid.deselect();
        updateFlowButtons();
    }

    private void updateFlowButtons() {
    }

    private void addMoreFlowsToGrid() {
        resetFlowGridSelection();
        String url = "/rest/flows?message=" + getCurMsgId() + "&limit=" + pageSize + "&start=" + lastFlowForPaging;
        new Rest(url).get(new GetCallback() {
            @Override
            protected void onSuccess(Response response) {
                JSONArray jsonArray = getResultsFromResponse(response);
                lastFlowForPaging = getIteratorFromResponse(response);
                flowGrid.getGrid().resize(flowGrid.getGrid().getRowCount() - 1, flowGrid.getGrid().getColumnCount());
                flowGrid.addContents(getFlowGridContents(jsonArray));
            }
        });
    }

    private String toDate(String value) {
        return DateTimeFormat.getMediumDateTimeFormat().format(new Date(Long.parseLong(value)));
    }

    private JSONArray getResultsFromResponse(Response response) {
        return JSONParser.parse(response.getText()).isObject().get("results").isArray();
    }

    private JSONObject getIteratorFromResponse(Response response) {
        JSONValue value = JSONParser.parse(response.getText()).isObject().get("iterator");
        return value != null ? value.isObject() : null;
    }
}
