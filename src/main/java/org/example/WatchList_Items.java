package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WatchList_Items {

    public WebDriver driver;

    @FindBy(id = "userid")
    public WebElement usernameInput;

    @FindBy(xpath = "//button[@id='signin-continue-btn']")
    public WebElement loginbutton1;

    @FindBy(id = "pass")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@id='sgnBt']")
    public WebElement loginButton2;


    //Search box
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchbox;

    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement searchbutton;

    @FindBy(xpath = "//li[@id='item1cd98e125b']//div[@class='s-item__image-wrapper image-treatment']")
    public WebElement itemss;


    //itemsssssss
    @FindBy(xpath = "//select[@id='x-msku__select-box-1000']")
    public WebElement colorSelect;

    @FindBy(xpath = "//select[@id='x-msku__select-box-1001']")
    public WebElement lengthDropdown;



    @FindBy(xpath = "//span[contains(text(),'Add to Watchlist')]")
    public WebElement Addwatchlist;




    public WatchList_Items(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(20000);
        usernameInput.sendKeys(username);
        Thread.sleep(15000);
        loginbutton1.click();
        Thread.sleep(30000);
        passwordInput.sendKeys(password);
        Thread.sleep(15000);
        loginButton2.click();
        Thread.sleep(15000);

    }

    public void addcarts() throws InterruptedException {
        Thread.sleep(15000);
        searchbox.sendKeys("USB-C to USB-C Cable Male Type-C Cable Cord Fast Charger Charging Data Sync");
        Thread.sleep(15000);
        searchbutton.click();
        Thread.sleep(15000);

        //Scroll down
        Thread.sleep(20000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(20000);
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(8000);
        itemss.click();
        Thread.sleep(50000);

        String currentHandle = driver.getWindowHandle();
        Thread.sleep(15000);
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        Thread.sleep(15000);
        JavascriptExecutor jis=(JavascriptExecutor)driver;
        Thread.sleep(20000);
        jis.executeScript("window.scroll(0,300)");
        Thread.sleep(2000);
    }

    public void selectGreen() throws InterruptedException {
        Thread.sleep(20000);
        Select select = new Select(colorSelect);
        Thread.sleep(10000);
        select.selectByValue("3");
        Thread.sleep(15000);
    }

    public void selectLength() throws InterruptedException {
        Thread.sleep(15000);
        Select lengthSelect = new Select(lengthDropdown);
        Thread.sleep(15000);
        lengthSelect.selectByValue("7");
        Thread.sleep(15000);
        Addwatchlist.click();
        Thread.sleep(15000);
    }

}