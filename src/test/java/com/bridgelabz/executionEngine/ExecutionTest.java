package com.bridgelabz.executionEngine;


import com.bridgelabz.base.Base;
import com.bridgelabz.excelUtility.ReadExcelSheet;
import com.bridgelabz.keywordDriven.Action_keyword;
import org.testng.annotations.Test;

import java.awt.*;

public class ExecutionTest extends Base {

    @Test
    public static void browserStack() throws InterruptedException, AWTException {
        ReadExcelSheet rs = new ReadExcelSheet();
        rs.DemoFile(4);
        Action_keyword k = new Action_keyword();
        k.openBrowser();
        k.navigate();
        k.enterEmail();
        k.enterPassword();
        k.clickSignIn();
        k.logout();
        k.closeBrowser();
        System.out.println("Test executed successfully");
    }
}
