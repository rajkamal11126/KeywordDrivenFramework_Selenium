package com.bridgelabz.executionEngine;

import com.bridgelabz.excelUtility.ReadExcelSheet;
import com.bridgelabz.keywordDriven.Action_keyword;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Logger;

public class ExecutionTest {

    @Test
    public static void browserStack() throws InterruptedException, AWTException, IOException {
        Logger log = Logger.getLogger("Logger");
        ReadExcelSheet rs = new ReadExcelSheet();
        rs.readExcelData(4);
        Action_keyword k = new Action_keyword();
        k.openBrowser();
        k.navigate();
        k.enterEmail();
        k.enterPassword();
        k.clickSignIn();
        k.logout();
        k.closeBrowser();
        log.info("Test executed successfully");
    }
}
