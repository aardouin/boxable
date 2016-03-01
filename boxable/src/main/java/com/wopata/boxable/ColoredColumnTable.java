package com.wopata.boxable;

import com.wopata.boxable.columns.ColoredColumn;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ardouin on 24/02/16.
 */
public class ColoredColumnTable extends BaseTable {

    public List<ColoredColumn> columns;

    public ColoredColumnTable(float yStart, float yStartNewPage, float bottomMargin, float width, float margin, PDDocument document, PDPage currentPage, List<ColoredColumn> columns) throws IOException {
        super(yStart, yStartNewPage, bottomMargin, width, margin, document, currentPage, true, true);
        this.columns = columns;
    }

    public Row<PDPage> createPrefilledRow(float height) {
        Row<PDPage> row = super.createRow(height);
        List<Cell<PDPage>> cells = new ArrayList<>();

        for (ColoredColumn column : columns) {
            Cell<PDPage> cell = row.createPercentCell(column.getWitdhPercent(),null);
            cell.setFillColor(column.getColor());
            cells.add(cell);
        }
        return row;
    }

    @Override
    public Row<PDPage> createRow(List<Cell<PDPage>> cells, float height) {
        throw new UnsupportedOperationException("please use createPrefilledRow instead");
    }

    @Override
    public Row<PDPage> createRow(float height) {
        throw new UnsupportedOperationException("please use createPrefilledRow instead");
    }
}