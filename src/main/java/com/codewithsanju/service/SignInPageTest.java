package com.codewithsanju.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInPageTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        //Use Chrome driver
        driver = new ChromeDriver();
        //full screen window
        driver.manage().window().maximize();
        // wait for the element to appear before the exception occurs
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testSignInWithValidCredentials() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        //Create object of SignInPage
        SignInPage signInPage = new SignInPage(driver);
        //Check if page is opened

        Assert.assertTrue(signInPage.isPageOpened());
        signInPage.signIn("sanju2894@live.com", "sanjay1022110825");

        //Verifying whether user is logged in
//        Assert.assertEquals("Ania-Duldiier", homePage.getNameOfLoggedInUser());
    }

    @Test
    public void testSignInWithInvalidPassword() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.signIn("aniaduldiier@gmail.com", "wrongPass");

        //Check the visibility of error message, when the wrong password is entered
        Assert.assertTrue(signInPage.errorMessageIsVisible());
    }

    @Test
    public void testSignInWithInvalidEmail() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.signIn("wrongEmail", "ania1991");

        //Check the visibility of error message, when the wrong email is entered
        Assert.assertTrue(signInPage.errorMessageIsVisible());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
