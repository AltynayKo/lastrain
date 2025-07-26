package dev.restful.uitest;


import dev.restful.BaseTestClass;
import dev.restful.model.Home;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HomePageTest extends BaseTestClass {

    @Test
    public void verifyRestFundPageDisplayable(){
        String expectedLabel = "REST FUNDAMENTALS";
        String actualLabel  = new Home(driver)
                .clickRestFundText()
                .getPageLabel();
        assertThat(actualLabel, equalTo(expectedLabel));
    }
}
