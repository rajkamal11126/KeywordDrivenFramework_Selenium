package com.bridgelabz.excelUtility;

import com.bridgelabz.utility.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadExcelSheet {
    public ArrayList readExcelData(int colNo) throws IOException
    {
        String filePath = Constants.filePath;
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        Iterator row = sheet.rowIterator();
        row.next();
        ArrayList<String> a = new ArrayList();
        while(row.hasNext())
        {
            Row r = (Row) row.next();
            Cell c = r.getCell(colNo);
            String data = c.getStringCellValue();
            a.add(data);
            a.add(((Row) row.next()).getCell(colNo).getStringCellValue());
        }
        System.out.println("List: " +a);
        return a;
    }

    public void DemoFile(int i) {
// TODO Auto-generated method stub

    }
}
