package com.webShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductHelper extends BaseHelper {

    public ProductHelper(WebDriver driver) {
        super(driver);
    }

    public int sizeOfProduct() {
        if(isProductPresent()){
            return driver.findElements(By.cssSelector(".product")).size();
        }
        return 0;
    }

    public void clickOnShoppingCart() {
        click(By.cssSelector(".cart-label"));
    }

    public void clickOnAddLink() {
        click(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]"));
    }

    public void clickOnQuantityDeleteProduct() {
        type(By.cssSelector("input.qty-input"), "0");
        click(By.cssSelector("input.update-cart-button"));

    }
}
