package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork_02 {

    WebDriver driver;

    @BeforeMethod (enabled = false)
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test (enabled = false)

    public void openTestPage(){
        WebElement element1 = driver.findElement(By.tagName("strong"));
        System.out.println("First element: " + element1.getSize());

        WebElement element2 = driver.findElement(By.tagName("a"));
        System.out.println("Second element: "+ element2.getSize());

        WebElement element3 = driver.findElement(By.tagName("img"));
        System.out.println("Third element: " + element3.getSize());
    }

    @AfterMethod (enabled = false)
    public void tearDown(){
        driver.quit();

    }
}
