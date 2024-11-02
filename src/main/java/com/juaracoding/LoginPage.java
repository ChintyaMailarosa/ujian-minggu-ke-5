package com.juaracoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        public WebDriver driver;

        @FindBy(xpath = "//input[@id='user-name']")
        WebElement username;

        @FindBy(xpath = "//input[@id='password']")
        WebElement password;

        @FindBy(xpath ="//input[@id='login-button']" )
        WebElement btnLogin;

        @FindBy(css = "h3[data-test='error']")
        WebElement errorMessage;

        public LoginPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void login (String username, String password){
            this.username.sendKeys(username);
            this.password.sendKeys(password);
        }

        public void setBtnLogin(){
            btnLogin.click();
        }

        public String getErrorMessage(){
            return errorMessage.getText();
        }

    }
