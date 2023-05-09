package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//a[normalize-space()='Account settings']
public class Username_Change
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

    @FindBy(xpath = "//b[normalize-space()='raj']")
    public WebElement userss;

    @FindBy(xpath = "//a[normalize-space()='Account settings']")
    public WebElement accountsett;

    @FindBy(xpath = "//a[normalize-space()='Personal information']")
    public WebElement personalinfor;

    @FindBy(xpath = "//button[@id='individual_username_edit_button']")
    public WebElement edits;

    @FindBy(xpath = "//input[@id='user_name']")
    public WebElement editsbox;


    public Username_Change(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(20000);
        usernameInput.sendKeys(username);
        Thread.sleep(30000);
        loginbutton1.click();
        Thread.sleep(20000);
        passwordInput.sendKeys(password);
        Thread.sleep(20000);
        loginButton2.click();
        Thread.sleep(20000);

    }
    public void usernamechange() throws InterruptedException {
        Thread.sleep(30000);
        userss.click();
        Thread.sleep(30000);
        accountsett.click();
        Thread.sleep(30000);
        personalinfor.click();
        Thread.sleep(20000);
        edits.click();
        Thread.sleep(30000);
        editsbox.click();
        Thread.sleep(30000);
        editsbox.sendKeys("LPU_123");


    }
}