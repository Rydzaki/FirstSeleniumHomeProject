package com.ait.qa34;

import com.webShop.data.UserData;
import com.webShop.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends BasePage {

    // todo сделать прекондишен на выход
    @BeforeMethod
    public void isLoginLinkPresent() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }
    }




    @Test(enabled = false)
    public void createAccountPositiveTest() {

        app.getUser().clickOnRegisterLink();
        app.getUser().fillLoginRegisterForm();
        app.getUser().clickOnRegisterButton();
        app.getUser().clickOnContinueButton();
        Assert.assertTrue(app.getUser().isLoginPresent(By.className("account")));
    }

    @Test
    public void createAccountWithExistedNegativeTest() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillLoginRegisterForm();
        app.getUser().clickOnRegisterButton();

        Assert.assertTrue(app.getUser().isLoginPresentNegativeMessage());

        //app.getUser().print();
    }
}

//todo add negative test


// к чему привязаться при негативном тесте к классу div

//@BeforeMethod
//    public void ensurePrecondition(){
//        if (!app.getUser().isLoginLinkPresent()){
//            app.getUser().clickOnSignOutButton();
//        }
//    }