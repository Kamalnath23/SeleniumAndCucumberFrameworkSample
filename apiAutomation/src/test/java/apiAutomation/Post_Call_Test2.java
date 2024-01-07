package apiAutomation;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Post_Call_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// There is no need to add escape character manually. Just paste string within double 
				// quotes. It will automatically add escape sequence as required. 
				String jsonString = "{ \"client_id\" : \"71e9c11c-a036-4759-b66e-9634b9830574\","
						+ "  \"client_secret\" : \"_-L~-4_0xK0W9Kk2lrfu1F9mkr~828THzZ\","
						+ "  \"Resource\" : \"https://api.support.ciostage.accenture.com/v2/support_ticket/\","
						+ "  \"grant_type\": \"client_credentials\"}";
				
				// Create a request specification 
				RequestSpecification request= RestAssured.given();
				
				// Setting content type to specify format in which request payload will be sent.
				// ContentType is an ENUM. 
				request.contentType(ContentType.JSON);
				//Adding URI
				request.baseUri(
			"https://login.microsoftonline.com/f3211d0e-125b-42c3-86db-322b19a65a22/oauth2/token"
						
						);
				// Adding body as string
				request.body(jsonString);
				
				// Calling POST method on URI. After hitting we get Response
				Response response = request.post();
				
				// Printing Response as string
				System.out.println(response.asString());
				
				// Get Validatable response to perform validation
				ValidatableResponse validatableResponse = response.then();
				
				// Validate status code as 200
				//validatableResponse.statusCode(200);
				
				// Validate token field is null
				// SInce response is one to one mapping so passing key name will give you value.
				// Below method validates that value of token is not null.
				validatableResponse.body("token", Matchers.notNullValue());
				
				// Validate token length is 15
				validatableResponse.body("token.length()", Matchers.is(15));
				
				// Validate token is an alphanumeric value
				validatableResponse.body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
			
	}

}
