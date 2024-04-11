package com.ait.qa34;

import com.webShop.data.UserData;
import com.webShop.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends BasePage {

    @BeforeMethod
    public void ensurePrecondition() {

        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }
        app.getUser().clickOnLinkLoginButton();
        app.getUser().fillLoginForm(new User().setLogin(UserData.EMAIL).setPassword(UserData.PASWORD));
        app.getUser().clickChekBoxRememberMe();
        app.getUser().clickOnLoginButton();

    }

    @Test
    public void addProductPositiveTest() {
        app.getProduct().clickOnAddLink();
        int sizeBefore = app.getProduct().sizeOfProduct();
        app.getProduct().pause(500);
        app.getProduct().clickOnShoppingCart();
        int sizeAfter = app.getProduct().sizeOfProduct();

        Assert.assertEquals(sizeAfter, sizeBefore + 1);
    }

    @AfterMethod

    public void clearShopList() {
        app.getProduct().pause(500);
        app.getProduct().clickOnQuantityDeleteProduct();

    }

}
