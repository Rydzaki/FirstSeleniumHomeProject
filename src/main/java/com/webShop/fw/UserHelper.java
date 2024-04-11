package com.webShop.fw;

import com.webShop.data.UserData;
import com.webShop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class UserHelper extends BaseHelper {


    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnContinueButton() {
        click(By.cssSelector("input.button-1.register-continue-button"));
    }

    public void clickOnRegisterButton() {
        click(By.cssSelector("#register-button"));
    }

    public void fillLoginRegisterForm() {
        type(By.cssSelector("#FirstName"), "Oyama");
        type(By.cssSelector("#LastName"), "Mocutaki");
        type(By.cssSelector("#Email"), UserData.EMAIL); //"autest" + i +"@mail.com"
        type(By.cssSelector("#Password"), UserData.PASWORD);
        type(By.cssSelector("#ConfirmPassword"), UserData.PASWORD);
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("a.ico-register"));
    }

    // TODO сделать класс User
    public void fillLoginForm(User user) {
        type(By.cssSelector("#Email"), user.getLogin());
        type(By.cssSelector("#Password"), user.getPassword());
    }

    public void clickOnLoginButton() {
        click(By.cssSelector(".login-button"));
    }

    public void clickOnLinkLoginButton() {
        click(By.cssSelector("a[href='/login']"));
    }

    public void clickChekBoxRememberMe() {
        click(By.cssSelector("#RememberMe"));
    }

    public boolean isLoginLinkPresent(){
        return driver.findElements(By.cssSelector("a.ico-login")).size() > 0;

    }

    public void clickOnSignOutButton() {
        click(By.cssSelector("a.ico-logout"));
    }
}
