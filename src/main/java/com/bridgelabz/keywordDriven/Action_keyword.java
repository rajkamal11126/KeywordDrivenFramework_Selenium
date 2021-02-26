package com.bridgelabz.keywordDriven;

import com.bridgelabz.utility.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.InputEvent;

public class Action_keyword {

    public static WebDriver driver;

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkamal\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void navigate() {
        driver.get(Constants.URL);
    }

    public void enterEmail() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys(Constants.username);
        Thread.sleep(1000);
    }

    public void enterPassword() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(Constants.password);
        Thread.sleep(1000);
    }

    public void clickSignIn() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        robot.mouseMove(400, 565);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
    }

    public void logout() throws InterruptedException {
        driver.findElement(By.id("account-menu-toggle")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign_out_link")).click();
        Thread.sleep(1000);
    }

    public void closeBrowser() {
        driver.quit();
    }
}
