package com.ait.qa34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    //defore - setUp прикондишин
    @BeforeMethod (enabled = false)
    public void setUp() {
        driver = new ChromeDriver();
        //driver.get("https://www.google.com"); // без истории
        driver.navigate().to("https://www.vk.com"); // работает с историей
        driver.navigate().back(); // делает возврат
        driver.navigate().forward();  // делает переход вперед
        driver.navigate().refresh(); // обновляет страницу
    }

    //test - name
    @Test (enabled = false)
    public void openGoogleTest() {
        System.out.println("Google is opened");
        ;

    }

    //after - tearDown
    @AfterMethod(enabled = false) //отключил анатацию
    public void tearDown() {
        driver.quit(); // закрывает браузер
        //driver.close(); // закрывает только одну вкладку, если открыта одна вкладка, то закроется браузер
        //System.out.println("Google is closed");
    }

}
