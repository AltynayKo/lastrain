package dev.restful.api;

import dev.restful.apiModel.ObjectModel;
import dev.restful.apiService.Endpoints;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {
    Endpoints endpoint = new Endpoints();
    @Test
    public void verifyMacBookModel(){
        ObjectModel actualObjectModel = endpoint.getObjectById(7);
        assertThat(actualObjectModel.getName(), equalTo("Apple MacBook Pro 16"));
    }
}
