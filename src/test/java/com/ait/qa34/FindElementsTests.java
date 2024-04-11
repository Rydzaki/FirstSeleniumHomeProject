package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsTests extends BasePage {

    @Test (enabled = false)
    public void findElementByTagName() {
        System.out.println("=================================");
        // ищем элемент по имени тега
        WebElement element = app.driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = app.driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        List<WebElement> elements = app.driver.findElements(By.tagName("a"));

        System.out.println(elements.size());

    }

    @Test (enabled = false)

    public void findElementByLocators(){
        // id
        WebElement elementCity = app.driver.findElement(By.id("city"));
        // class name
        WebElement elementClassName = app.driver.findElement(By.className("input-container"));

        //name By.name("user")

        //link text
        app.driver.findElement(By.linkText("Let the car work"));
        //partial link text (ищет по части текста)
        app.driver.findElement(By.partialLinkText("work"));

        //System.out.println(elementCity.getSize());
    }
    @Test (enabled = false)

    public void findElementByCssSelector(){
        // id -> #id
        app.driver.findElement(By.cssSelector("#city"));
        // class name -> .className
        app.driver.findElement(By.cssSelector(".input-container"));
        // [name = 'user']
        app.driver.findElement(By.cssSelector("[for='city']"));
        app.driver.findElement(By.cssSelector("href=\"/\""));

        app.driver.findElement(By.cssSelector("[href*='car']"));
        //start -> ^
        app.driver.findElement(By.cssSelector("[href^='/let']"));

        //end on -> $
        app.driver.findElement(By.cssSelector("[href$='work']"));

        //
    }

    // xPath //tag[@attr='value']  *[@attr='value']
    @Test (enabled = false)
    public void findElementByXPath(){
        // tag name = //tag
        // driver.findElement(By.tagName("h1"));
        app.driver.findElement(By.xpath("//h1"));
        // id -> //tag[@id='idName']
        // driver.findElement(By.id("city"));
        app.driver.findElement(By.xpath("//*[@id='city']"));
        //class name -> //tag[@class='className']
        // driver.findElement(By.className("input-container"));
        app.driver.findElement(By.xpath("//*[@class='input-container']"));
        //contains -> *
        // driver.findElement(By.cssSelector("[href*='car']"));
        app.driver.findElement(By.xpath("//*[contains(@href,'car')]"));

        //start -> //*[starts-with(@attr, '...']
        app.driver.findElement(By.xpath("//*[starts-with(@href, '/let')]"));

        //text
        app.driver.findElement(By.xpath("//span[text()=' Never mistaken for anything else ']"));
        app.driver.findElement(By.xpath("//span[.=' Never mistaken for anything else ']"));
        app.driver.findElement(By.xpath("//span[contains(.,'mistake')]")); // проверка на частичное совпадение текста

        //search of parent element //input[@id='userName']/..

        //div/a - child - css = div>a спускаюсь на шаг вниз
        //div//a - any level child = div a спускаюсь куда угодно

        //tag1[.tag2[@attr='value']]
        //*[@id='firstName or @name='lastName']
    }


}
