package com.webShop.fw;

import com.google.common.io.Files;
import com.webShop.data.UserData;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import static java.awt.SystemColor.text;

public class BaseHelper {

    WebDriver driver;


    Random random = new Random();
    int i = random.nextInt(1000) + 1000;
    //public String password = "Pass12345!";
    //String login = "autest" + i + "@mail.com";
    //public String login = "autest0007@mail.com";

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }
//todo метод проверяющий наличие локатора
//    public boolean isElementPresent(By locator) {
//        return driver.findElements(locator).size() > 0;
//    }

    public void type(By lokator, String text) {
        click(lokator);
        driver.findElement(lokator).clear();
        driver.findElement(lokator).sendKeys(text);
    }

    public void click(By lokator) {
        driver.findElement(lokator).click();
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isProductPresent() {
        return !driver.findElements(By.cssSelector(".product")).isEmpty();
    }

    public boolean isLoginPresent(By locator) {
        WebElement element = driver.findElement(locator);
        if (UserData.EMAIL.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLoginPresentNegativeMessage() {
        if (driver.findElements(By.cssSelector(".validation-summary-errors li")).size() > 0) {
            return true;
        } else {
            return false;

        }
    }
        //todo delete
        public void print () {
            WebElement element = driver.findElement(By.cssSelector(".validation-summary-errors li"));

            System.out.println(element.getText());

        }
        public String takeScreenShot(){
            File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File screenshot = new File("screenshots/screen-" + System.currentTimeMillis() + ".png");

            try {
                Files.copy(tmp, screenshot);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return screenshot.getAbsolutePath();

        }

    }
