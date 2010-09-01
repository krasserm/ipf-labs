/*
 * Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.platform.camel.flow.admin.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLTable;
import com.google.gwt.user.client.ui.Label;

import java.util.Collections;
import java.util.List;

public class SelectableGrid {
    private Integer selectedRow;
    private String orgStyleName;
    private final Grid headerGrid;
    private final Grid grid;

    private static final String SELECTED_STYLE = "selected-grid-row";
    private static final String EVEN_STYLE = "even-grid-row";
    private static final String ODD_STYLE = "odd-grid-row";
    private static final String GRID_STYLE = "grid";
    private static final String HEADER_GRID_STYLE = "gridHeader";

    public SelectableGrid() {
        grid = new Grid();
        grid.setStyleName(GRID_STYLE);
        headerGrid = new Grid();
        headerGrid.setStyleName(HEADER_GRID_STYLE);

        grid.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                select(grid.getCellForEvent(event).getRowIndex());
            }
        });
    }

    public Grid getGrid() {
        return grid;
    }

    public Grid getHeaderGrid() {
        return headerGrid;
    }

    public void select(int row) {
        deselect();
        orgStyleName = grid.getRowFormatter().getStyleName(row);
        grid.getRowFormatter().setStyleName(row, SELECTED_STYLE);
        selectedRow = row;
    }

    public void deselect() {
        if (selectedRow != null) {
            grid.getRowFormatter().setStyleName(selectedRow, orgStyleName);
            selectedRow = null;
            orgStyleName = null;
        }
    }

    public void setContents(List<String> headers, List<List<String>> contents, List<String> widths) {
        setHeaders(headers, widths);
        setContents(contents, widths);
    }

    public void addContents(List<List<String>> contents) {
        int count = grid.getRowCount();
        grid.resize(count + contents.size(), grid.getColumnCount());
        addContents(count, contents);
    }

    private void setContents(List<List<String>> contents, List<String> widths) {
        grid.clear();
        grid.resize(contents.size(), getMaxColumns(contents));

        setColumnWidths(grid, widths);
        addContents(0, contents);
    }

    private void addContents(int rowIdx, List<List<String>> contents) {
        for (List<String> row : contents) {
            int cellIdx = 0;
            for (String cell : row) {
                Label label = new Label(cell);
                grid.setWidget(rowIdx, cellIdx, label);
                ++cellIdx;
            }
            ++rowIdx;
        }

        updateRowStyles();
    }

    private void updateRowStyles() {
        HTMLTable.RowFormatter formatter = grid.getRowFormatter();
        for (int idx = 0; idx < grid.getRowCount(); ++idx) {
            formatter.setStyleName(idx, (idx % 2) == 0 ? EVEN_STYLE : ODD_STYLE);
        }
        if (selectedRow != null) {
            grid.getRowFormatter().setStyleName(selectedRow, SELECTED_STYLE);
        }
    }

    public void replace(Integer rowIdx, List<String> contents) {
        addContents(rowIdx, Collections.singletonList(contents));
    }

    private void setColumnWidths(Grid grid, List<String> widths) {
        HTMLTable.ColumnFormatter formatter = grid.getColumnFormatter();
        int colCount = Math.min(grid.getColumnCount(), widths.size());
        for (int colIdx = 0; colIdx < colCount; ++colIdx) {
            formatter.setWidth(colIdx, widths.get(colIdx));
        }
    }

    private void setHeaders(List<String> headers, List<String> widths) {
        if (headers == null || headers.isEmpty()) {
            headerGrid.clear();
            headerGrid.setVisible(false);
            return;
        }

        headerGrid.clear();
        headerGrid.setVisible(true);
        headerGrid.resize(1, headers.size());

        int colIdx = 0;
        for (String column : headers) {
            Label label = new Label(column);
            headerGrid.setWidget(0, colIdx, label);
            ++colIdx;
        }

        setColumnWidths(headerGrid, widths);
    }

    private int getMaxColumns(List<List<String>> contents) {
        int maxCols = 0;
        for (List<String> row : contents) {
            maxCols = Math.max(maxCols, row.size());
        }
        return maxCols;
    }

    public void clear() {
        deselect();
        headerGrid.resize(0, 0);
        grid.resize(0, 0);
    }

    public void remove(int rowIdx) {
        grid.removeRow(rowIdx);
        updateRowStyles();
    }
}
