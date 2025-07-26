package dev.restful.model;

import org.openqa.selenium.WebDriver;

public abstract class BaseModel {
    protected WebDriver driver;
    public BaseModel(WebDriver driver){
        this.driver = driver;
    }
}
