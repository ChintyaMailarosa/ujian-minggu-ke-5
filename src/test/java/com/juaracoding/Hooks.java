package com.juaracoding;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
        private WebDriver driver;

        @Before
        public void setUp() {
            // Inisialisasi driver dan buka halaman login SauceDemo
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            // Login dengan username dan password yang benar
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
        }

        @After
        public void tearDown() {
            driver.quit();
        }

        public WebDriver getDriver() {
            return driver;
        }
    }

