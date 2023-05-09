package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Remove_Cart
{
    public WebDriver driver;

    @FindBy(id = "userid")
    public WebElement usernameInput;

    @FindBy(xpath = "//button[@id='signin-continue-btn']")
    public WebElement loginbutton1;

    @FindBy(id = "pass")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@id='sgnBt']")
    public WebElement loginButton2;

//    @FindBy(xpath = "//a[@aria-label='Your shopping cart contains 1 item']//*[name()='svg']")
//    public WebElement kart;
    @FindBy(className = "gh-cart-icon")
    public WebElement kart;

//    @FindBy(xpath = "//button[@aria-label='Remove - USB-C to USB-C Cable Male Type-C Cable Cord Fast Charger Charging Data Sync']")
//    public WebElement reomove;

    @FindBy(className = "fake-link")
    public WebElement reomove;

    public Remove_Cart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(20000);
        usernameInput.sendKeys(username);
        Thread.sleep(15000);
        loginbutton1.click();
        Thread.sleep(20000);
        passwordInput.sendKeys(password);
        Thread.sleep(10000);
        loginButton2.click();
        Thread.sleep(90000);
        kart.click();
        Thread.sleep(10000);
        reomove.click();
        Thread.sleep(10000);
    }

}