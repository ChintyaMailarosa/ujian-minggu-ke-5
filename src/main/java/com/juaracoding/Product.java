package com.juaracoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {

    public WebDriver driver;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartBackpack;

    @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement addToCartOnesie;

    @FindBy(xpath ="//a[@class='shopping_cart_link']" )
    WebElement btnCart;

    public Product (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addBackpackToCart(){
        addToCartBackpack.click();
    }

    public void addOnesieToCart(){
        addToCartOnesie.click();
    }

    public void btnCart(){
        btnCart.click();
    }

}
