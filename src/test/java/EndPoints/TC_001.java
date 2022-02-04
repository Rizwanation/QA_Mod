package EndPoints;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class TC_001 {

    public String BASE_URL = "https://api.github.com/";

    @Test
    public void TC_1()
    {
        //verify get method works correct
            //statusCode is 200
            //contentType is json/application
            //body is equal to expected body
            //time is less than 5 seconds

        RestAssured.baseURI = BASE_URL;



    RestAssured.get().then()
                .contentType("application/json; charset=utf-8")
                .statusCode(200)
                .header("content-type","application/json; charset=utf-8")

                //body validations using fluent with hamcrest

                .body(containsString("feeds_url"))
                .body("current_user_url",equalTo(BASE_URL+"user"));


        // body validations using jsonPath

        RestAssured.get().getBody().peek();



    }

}
