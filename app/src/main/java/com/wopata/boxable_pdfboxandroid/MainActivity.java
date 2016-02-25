package com.wopata.boxable_pdfboxandroid;

import android.graphics.Color;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.common.io.Files;
import com.wopata.boxable.BaseTable;
import com.wopata.boxable.Cell;
import com.wopata.boxable.ColoredColumnTable;
import com.wopata.boxable.Paragraph;
import com.wopata.boxable.Row;
import com.wopata.boxable.columns.ColoredColumn;
import com.wopata.boxable.utils.ColorUtils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    doTest();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void doTest() throws IOException {

        //Set margins
        float margin = 10;

        //Initialize Document
        PDDocument doc = new PDDocument();
        PDPage page = addNewPage(doc);
        float yStartNewPage = page.getMediaBox().getHeight() - (2 * margin);

        //Initialize table
        float tableWidth = page.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        ArrayList<ColoredColumn> columns = new ArrayList<ColoredColumn>();
        columns.add(new ColoredColumn(ColorUtils.getColor(Color.RED),15f));

        columns.add(new ColoredColumn(ColorUtils.getColor(Color.GREEN),15f));

        columns.add(new ColoredColumn(ColorUtils.getColor(Color.BLUE),60f));

        columns.add(new ColoredColumn(ColorUtils.getColor(Color.YELLOW),10f));

        ColoredColumnTable table  = new ColoredColumnTable(yStart,yStartNewPage, bottomMargin, tableWidth, margin, doc, page,columns);
        table.setStrokeColor(ColorUtils.getColor(Color.WHITE));

        Row<PDPage> row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        table.setHeader(row);

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        row = table.createPrefilledRow(80f);
        row.getCells().get(0).setText("Coucou");
        row.getCells().get(1).setText("Coucou");
        row.getCells().get(2).setText("Coucou");
        row.getCells().get(3).setText("Coucou");

        table.draw();

        try {
            File file = new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS),"test.pdf");
            doc.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            doc.close();
        }
        Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT).show();

    }


    private static PDPage addNewPage(PDDocument doc) {
        PDPage page = new PDPage();
        doc.addPage(page);
        return page;
    }
}
