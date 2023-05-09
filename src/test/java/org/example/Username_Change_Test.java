package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Username_Change_Test {

    WebDriver driver;
    public void test() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Username_Change obj = new Username_Change(driver);
        driver.get("https://www.ebay.com/signin/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        obj.login("sharmaboymanjeet123@gmail.com","qpalzm@1MM");
        Thread.sleep(10000);
        obj.usernamechange();

    }
}