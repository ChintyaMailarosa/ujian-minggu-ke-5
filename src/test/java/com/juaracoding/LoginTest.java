package com.juaracoding;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginTest {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("I am on saucedemo login page")
    public void  i_am_on_saucedemo_login_page() {
        System.out.println("I am on saucedemo login page");
    }

    @When(" I enter valid username and password")
    public void  i_enter_valid_username_and_password() {
        System.out.println("I enter valid username and password");
    }

    @Then("I should be redirected to the products")
    public void i_should_be_redirected_to_the_products() {
        System.out.println("I should be redirected to the products");
        driver.quit();
    }

//    // Negatif test
//
//    @Given("I am on saucedemo login page")
//    public void i_am_on_saucedemo_login_page() {
//        driver.get("https://www.saucedemo.com/");
//    }
//
//    @When("User enters valid username and invalid password")
//    public void user_enters_valid_username_and_invalid_password() {
//        loginPage.login("standard_user", "invalid");
//    }
//
//    @Then("Error message Username and password do not match is displayed")
//    public void error_message_username_and_password_do_not_match_is_displayed() {
//        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
//        driver.quit();
//    }


}
