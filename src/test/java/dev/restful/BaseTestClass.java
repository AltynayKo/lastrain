package dev.restful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestClass {
    protected WebDriver driver;
    String URL = "https://restful-api.dev/";

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
