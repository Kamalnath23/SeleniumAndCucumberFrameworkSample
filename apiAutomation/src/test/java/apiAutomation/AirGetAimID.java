package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AirGetAimID {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//String token1="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IjJaUXBKM1VwYmpBWVhZR2FYRUpsOGxWMFRPSSIsImtpZCI6IjJaUXBKM1VwYmpBWVhZR2FYRUpsOGxWMFRPSSJ9.eyJhdWQiOiJodHRwczovL2FwaS5zdXBwb3J0LmNpb3N0YWdlLmFjY2VudHVyZS5jb20vdjIvc3VwcG9ydF90aWNrZXQvIiwiaXNzIjoiaHR0cHM6Ly9zdHMud2luZG93cy5uZXQvZjMyMTFkMGUtMTI1Yi00MmMzLTg2ZGItMzIyYjE5YTY1YTIyLyIsImlhdCI6MTY3MDEyNjExNSwibmJmIjoxNjcwMTI2MTE1LCJleHAiOjE2NzAxMzAwMTUsImFpbyI6IkUyWmdZSkJaeExaZDU1Z1F6NjJ6L1hyZmx0ZnpBZ0E9IiwiYXBwaWQiOiI3MWU5YzExYy1hMDM2LTQ3NTktYjY2ZS05NjM0Yjk4MzA1NzQiLCJhcHBpZGFjciI6IjEiLCJpZHAiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC9mMzIxMWQwZS0xMjViLTQyYzMtODZkYi0zMjJiMTlhNjVhMjIvIiwib2lkIjoiNmNiYzVmMTYtMDFlNC00MzM2LWE3OTMtOGJkNmM1OTI0OTFlIiwicmgiOiIwLkFTWUFEaDBoODFzU3cwS0cyeklyR2FaYUltQXVfajZwcmFsSXYwb042M3lWeEVVbUFBQS4iLCJyb2xlcyI6WyJyZWFkX3NuZmFfdW5pZmllZGdhdGV3YXkiLCJ3cml0ZV9zbmZhX3VuaWZpZWRnYXRld2F5Il0sInN1YiI6IjZjYmM1ZjE2LTAxZTQtNDMzNi1hNzkzLThiZDZjNTkyNDkxZSIsInRpZCI6ImYzMjExZDBlLTEyNWItNDJjMy04NmRiLTMyMmIxOWE2NWEyMiIsInV0aSI6Ilg2eHVHQ3B3dVVtSGx3U1FqSk1CQWciLCJ2ZXIiOiIxLjAifQ.eZdpEV1-CDS8VsD66UzGEhppLuVaxEdPisv5YAbX1vmtnTmjIdDXXARvGXDNdLEq-pEJfy4uLFxehGt3uC-U7idJoPommLF2LX2Sj13HR2uDGgkMKVrPc_TkSLG5P26neMXw5bhLNg5rs-xYi3gOgTaKs3UJELiKTNDxk8DnosWEQTOshvj2R7qB_aSDTfZ4aKTscycmMgP3sCmWzt7eAZvR12B1f0SAGkg1UqGehbwiCYa0rDl8Z-9rQjFPMlGP2bELk3SPZQciq9nelMppxZXjrnp2FIHD6wZ1Cg05wfx0eYxW6HW5zw-59SaWT5yV4mqK2kM_XLeUSCeeHU_aZg";
		String token1 = airToken();
		
		String base = "https://api.support.ciodev.accenture.com/v2/air/getairbyaimprojectid";
		
		
        // Create a request specification
        RequestSpecification request= RestAssured.given();      
        // Setting content type to specify format in which request payload will be sent.
        // ContentType is an ENUM.
        //request.contentType(ContentType.JSON);
        request.contentType("application/json");
        //Adding URI
        //request.basePath(base);
        
       request.baseUri(base);
      //request.header(jsonString, request, args)
        request.headers("authorizationtoken" ,token1,
                      "x-api-key" , "DbbvKR9JLv6Q9FsUIjlkT9MxWXnbxUy16OR39IvQ",
                      "Content-Type", "application/json",
                      "aimprojectid", "31408");

        // Calling POST method on URI. After hitting we get Response
        Response response= RestAssured.get(base);
        Response response3 = request.request(Method.GET, base);
        Response response2 = request.get();
       
      
        // Printing Response as string
        System.out.println(response3.asString());
        System.out.println(response2.asString());
       
        // Get Validatable response to perform validation
        ValidatableResponse validatableResponse = response3.then();
        // Validate status code as 200
        validatableResponse.statusCode(200);
	}

	private static String airToken() {
		// TODO Auto-generated method stub
	
	    String PostmanUrl = "https://login.microsoftonline.com/f3211d0e-125b-42c3-86db-322b19a65a22/oauth2/token";
        String body = "client_id=77d8cdc5-9fdc-4f3d-9ff4-9964d57ad5d8&client_secret=eUg1OUxlOEpKOVIkVnF4Mw==&Resource=https://api.support.ciostage.accenture.com/v2/air/aimapp&grant_type=client_credentials&scope=read_snfa_air read_snfa_airbyaimprojectid";
        Response response = RestAssured.given().contentType("application/x-www-form-urlencoded").body(body)
                .get(PostmanUrl);
        String token = "Bearer "+ response.then().extract().path("access_token");
        System.out.println(token);
        
        return token;
	}

}
