package com.ait.qa34;

import com.webShop.data.UserData;
import com.webShop.models.NewLogin;
import com.webShop.models.User;
import com.webShop.utils.DataProviders;
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
        app.getUser().fillLoginRegisterForm(new NewLogin().setName("Jo").setLastname("Biden").setEmail(UserData.EMAIL).setPassword(UserData.PASWORD).setConfirmPassword(UserData.PASWORD));
        app.getUser().clickOnRegisterButton();
        app.getUser().clickOnContinueButton();
        Assert.assertTrue(app.getUser().isLoginPresent(By.className("account"), UserData.EMAIL));
        app.getUser().clickOnSignOutButton();
    }

    @Test
    public void createAccountWithExistedNegativeTest() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillLoginRegisterForm(new NewLogin().setName("Jo").setLastname("Biden").setEmail(UserData.EMAIL).setPassword(UserData.PASWORD).setConfirmPassword(UserData.PASWORD));
        app.getUser().clickOnRegisterButton();

        Assert.assertTrue(app.getUser().isLoginPresentNegativeMessage());

        //app.getUser().print();
    }

    @Test(dataProvider = "addNewLoginFromCsvFile", dataProviderClass = DataProviders.class)
    public void createAccountPositiveTestFromDataProviderWithCsvFile(NewLogin login){
        app.getUser().clickOnRegisterLink();
        app.getUser().fillLoginRegisterForm(login);
        app.getUser().clickOnRegisterButton();
        app.getUser().clickOnContinueButton();
        Assert.assertTrue(app.getUser().isLoginPresent(By.className("account"), login.getEmail())); //isLoginPresent  isLoginCreated  "account"

        app.getUser().clickOnSignOutButton();

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