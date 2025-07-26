package dev.restful.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestFund extends BaseModel{
    @FindBy (id = "rest")
    WebElement pageLabel;
    public RestFund(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPageLabel(){
        return pageLabel.getText();
    }
}
