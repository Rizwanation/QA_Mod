import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_POST_Request {


    @Test
    void RegistrationTest()
    {
        //Specify Base URI

        RestAssured.baseURI = "https://restapi.demoqa.com/customer";


        //Create Request Specification

        RequestSpecification httpRequest = RestAssured.given();

        //Specify the content type of Request

        httpRequest.header("content-type","application/json");



        //Create Json Body to be sent as parameter

        JSONObject requestBody = new JSONObject();

        requestBody.put("FirstName","John");
        requestBody.put("LastName","Doe");
        requestBody.put("UserName","JDoe66");
        requestBody.put("Password","P@ssW0rd");
        requestBody.put("Email","JDoe66@test.com");

            //convert created body to JSONString so it can be accepted as a String parameter

        httpRequest.body(requestBody.toJSONString());




        //Create Response Object

        Response response = httpRequest.request(Method.POST,"/register");

        String ResponseBody  = response.getBody().asString();

        //Validate Headers

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,201);

        //Validate Body

        String successCode = response.jsonPath().get("SuccessCode");
        Assert.assertEquals(successCode,"OPERATION_SUCCESS");

    }
}
