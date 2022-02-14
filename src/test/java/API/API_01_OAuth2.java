package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;

import static org.hamcrest.Matchers.*;

public class API_01_OAuth2 {

    public String token = "";
    public String client_id = "QA_Mod";
    public String client_secret = "f007433d6643c2e3b67f6dda5b43d4df";
    public String userID = "2801";



    @Test
    void GetToken() {



        String grant_type = "client_credentials";
        String url = "http://coop.apps.symfonycasts.com/token\n";

        //to get token, specify token url

        Response R  = RestAssured
                .given()
                .formParam("client_id","QA_Mod")
                .formParam("client_secret","f007433d6643c2e3b67f6dda5b43d4df")
                .formParam("grant_type","client_credentials")
                .post(url);

        // This will return token in the response body

        token = R.jsonPath().get("access_token");

    }


    @Test(dependsOnMethods = "GetToken")
    void TC_001_Post_With_Oauth2()
    {

        Response ResponseOfbarnUnlock = RestAssured.given()
                .auth()
                .oauth2(token)
                .post("http://coop.apps.symfonycasts.com/api/2801/barn-unlock");

        System.out.println("Response body is shown below: ");
        ResponseOfbarnUnlock.prettyPeek();


        LinkedHashMap expectedBody = new LinkedHashMap();

        expectedBody.put("action","barn-unlock");
        expectedBody.put("success",true);
        expectedBody.put("message","You just unlocked your barn! Watch out for strangers!");
        expectedBody.put("data","l");

        expectedBody.forEach((k,v) ->

                ResponseOfbarnUnlock.then()
                        .body((String) k,equalTo(v))


        );

    }


}
