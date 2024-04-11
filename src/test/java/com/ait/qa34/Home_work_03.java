package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Home_work_03 {

    WebDriver driver;
    @BeforeMethod (enabled = false)
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize(); //развернуть во все окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @Test (enabled = false)
    public void findElementByCssSelector(){

        driver.findElement(By.cssSelector("[alt*='$25']"));
        driver.findElement(By.cssSelector("[alt='Picture of 14.1-inch Laptop']"));
        driver.findElement(By.cssSelector("(//div[@class = 'product-rating-box'])[1]"));
        driver.findElement(By.cssSelector("(//div[@class = 'product-rating-box'])[2]"));
        driver.findElement(By.cssSelector("(//div[@class = 'product-rating-box'])[3]"));
        driver.findElement(By.cssSelector("(//div[@class = 'product-rating-box'])[4]"));
        driver.findElement(By.cssSelector("(//div[@class = 'product-rating-box'])[5]"));
        driver.findElement(By.cssSelector("([for='pollanswers-1']"));
        driver.findElement(By.cssSelector("#poll-block-1"));
        driver.findElement(By.cssSelector("[id$='rs-3']"));
    }
    @AfterMethod (enabled = false)
    public void tearDown() {
        driver.quit();
    }
}
