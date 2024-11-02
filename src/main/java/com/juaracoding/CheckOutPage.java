package com.juaracoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    WebDriver driver;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement btnCheckOut;

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement btnContinue;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement btnFinish;

    @FindBy(css = "//h3[@data-test='error']")
    WebElement errorMessage;

    public CheckOutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void proceedToCheckout(){
        btnCheckOut.click();
    }

    public void enterCheckOutDetails(String firstName, String lastName, String postalCode){
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.postalCode.sendKeys(postalCode);
        btnContinue.click();
    }

    public void completeCheckOut(){
        btnFinish.click();
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }

}
