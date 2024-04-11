package com.ait.qa34;

import com.webShop.fw.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class BasePage {


    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));

    Logger logger = LoggerFactory.getLogger(BasePage.class); // подключаем запись отчетов

    //@BeforeMethod
    @BeforeSuite
    public void setUp() {
        app.init();
    }

    //@AfterMethod(enabled = false)
    @AfterSuite(enabled = true)
    public void tearDown() {
        app.stop();

    }

    @BeforeMethod
    public void startTest(Method method){
        logger.info("Start test " + method.getName());
    }

    @AfterMethod
    public void stopTest(ITestResult result) {
        if (result.isSuccess()) {
            logger.info("PASSED " + result.getMethod().getMethodName());
        } else {
            logger.error("FAILED " + result.getMethod().getMethodName() + " Screenshot: " + app.getUser().takeScreenShot());
        }
        logger.info("Stop test");
        logger.info("=============================================");
    }

}