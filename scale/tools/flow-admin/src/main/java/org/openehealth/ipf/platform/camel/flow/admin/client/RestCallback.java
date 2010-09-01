package org.openehealth.ipf.platform.camel.flow.admin.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

public abstract class RestCallback implements RequestCallback {
    /**
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    protected static final String SERVER_ERROR = "An error occurred while attempting to contact the server. Please check your network connection and try again. Status was: ";

    public void onError(Request request, Throwable exception) {
        showErrorDialog("Caught exception: " + exception.getClass() + " with " + exception.getMessage());
    }

    protected void showErrorDialog(String errorText) {
        final DialogBox dialogBox = new DialogBox();
        dialogBox.setText("Error");
        dialogBox.setAnimationEnabled(true);
        final Button closeButton = new Button("Close");
        closeButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                dialogBox.hide();
            }
        });
        final HTML serverResponseLabel = new HTML(errorText);
        serverResponseLabel.addStyleName("serverResponseLabelError");
        VerticalPanel dialogVPanel = new VerticalPanel();
        dialogVPanel.addStyleName("dialogVPanel");
        dialogVPanel.add(serverResponseLabel);
        dialogVPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
        dialogVPanel.add(closeButton);
        dialogBox.setWidget(dialogVPanel);
        dialogBox.center();
        dialogBox.show();
        closeButton.setFocus(true);
    }
}
