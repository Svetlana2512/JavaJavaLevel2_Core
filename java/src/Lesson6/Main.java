package src.Lesson6;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Main {

    public static void main(String[] args) throws IOException {

//        String lastNameTest = "Tr";
//        String firstNameTest = "Es";


        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/332287?apikey=yODGgbTvYC5fkSQNmG0rOnvPB1V8vo89");

        System.out.println(response.asPrettyString());

    }

}
