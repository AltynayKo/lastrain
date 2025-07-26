package dev.restful.apiService;

import com.google.gson.Gson;
import dev.restful.apiModel.ObjectModel;

import static io.restassured.RestAssured.given;

public class Endpoints {
    public ObjectModel getObjectById(int id){
        Gson gson = new Gson();

        String responseJson = given()
                .when()
                .pathParam("id", id)
                .get("https://api.restful-api.dev/objects/{id}")
                .then()
                .extract()
                .asString();

        return gson.fromJson(responseJson, ObjectModel.class);
    }
}
