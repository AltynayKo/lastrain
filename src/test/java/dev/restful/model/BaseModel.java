package dev.restful.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseModel {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected final Duration WAIT_TIMEOUT_SECONDS = Duration.ofSeconds(50);
    public BaseModel(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
    }
}
