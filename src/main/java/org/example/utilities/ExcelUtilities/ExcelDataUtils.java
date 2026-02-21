package org.example.utilities.ExcelUtilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelDataUtils {

    public static Object[][] getLoginTestData(String excelPath, String sheetName) throws IOException {

        FileInputStream fis = new FileInputStream(excelPath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        List<Object[]> data = new ArrayList<>();
        DataFormatter formatter = new DataFormatter();

        int lastRow = sheet.getLastRowNum();

        for (int i = 1; i <= lastRow; i++) { // skip header
            Row row = sheet.getRow(i);

            if (row == null) {
                continue; // completely empty row
            }

            String username = formatter.formatCellValue(row.getCell(0));
            String password = formatter.formatCellValue(row.getCell(1));

            // Skip rows where username or password is empty
            if (username.isBlank() || password.isBlank()) {
                continue;
            }

            data.add(new Object[]{username, password});
        }

        workbook.close();
        fis.close();

        return data.toArray(new Object[0][0]);
    }
}
