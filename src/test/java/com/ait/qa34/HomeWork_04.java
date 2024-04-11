package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork_04 {

    WebDriver driver;
    @BeforeMethod (enabled = false)
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize(); //развернуть во все окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @Test(enabled = false)
    public void findElementByXPath(){

        //driver.findElement(By.cssSelector("[alt*='$25']"));
        driver.findElement(By.xpath("//img[contains(@alt, 'Picture of $25 Virtual Gift Card')]"));
        //driver.findElement(By.cssSelector("[alt='Picture of 14.1-inch Laptop']"));
        driver.findElement(By.xpath("//img[contains(@alt, 'Picture of 14.1-inch Laptop')]"));
        driver.findElement(By.xpath("(//div[@class = 'product-rating-box'])[1]"));

        driver.findElement(By.xpath("(//div[@class = 'product-rating-box'])[2]"));
        driver.findElement(By.xpath("(//div[@class = 'product-rating-box'])[3]"));
        driver.findElement(By.xpath("(//div[@class = 'product-rating-box'])[4]"));
        driver.findElement(By.xpath("(//div[@class = 'product-rating-box'])[5]"));
        //driver.findElement(By.cssSelector("[for='pollanswers-1']"));
        driver.findElement(By.xpath("//div[@class='poll']//ul//li//label[@for='pollanswers-1']"));
        //driver.findElement(By.cssSelector("#poll-block-1"));
        driver.findElement(By.xpath("//div[@class='poll']"));
        //driver.findElement(By.cssSelector("[id$='rs-3']"));
        driver.findElement(By.xpath("//input[@id='pollanswers-3']"));
    }

    //div:nth-child(2) div h1
    @AfterMethod (enabled = false)
    public void tearDown() {
        driver.quit();
    }



}
