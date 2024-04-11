package com.webShop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {
    public WebDriver driver;

    String browser;
    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    UserHelper user;
    ProductHelper product;

    public void init() {
        if(browser.equalsIgnoreCase("chrome")){
        driver = new ChromeDriver();}
        if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        if (browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize(); //развернуть во все окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        product = new ProductHelper(driver);
    }

    public UserHelper getUser() {
        return user;
    }

    public ProductHelper getProduct() {
        return product;
    }

    public void stop() {
        driver.quit();
    }

}

