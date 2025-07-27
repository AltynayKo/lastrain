package dev.restful.model;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Home extends BaseModel{

    @FindBy (partialLinkText = "Rest Fundamentals")
    WebElement restFundText;
    public Home(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public RestFund clickRestFundText(){
        wait.until(ExpectedConditions.visibilityOf(restFundText));
        restFundText.click();
        return new RestFund(driver);
    }
}
