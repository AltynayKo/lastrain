package dev.restful.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RestFund extends BaseModel{
    @FindBy (id = "rest")
    WebElement pageLabel;
    public RestFund(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPageLabel(){
        wait.until(ExpectedConditions.visibilityOf(pageLabel));
        return pageLabel.getText();
    }
}
