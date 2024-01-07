package apiAutomation;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we initialize a base URI with a link to the bookstore and the 'createUser' API. 
		//Next, we create a 'request' using RequestSpecification.
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
		RequestSpecification request = RestAssured.given();
		
		//we will create a JSON request object that will contain the data we need to create a new user. 
		// JSONObject is a class that represents a Simple JSON. 
		// We can add Key - Value pairs using the put method 
		JSONObject requestParams = new JSONObject(); 
		requestParams.put("userId", "TQ123"); 
		requestParams.put("isbn", "9781449325862"); 
		
		// Add a header stating the Request body is a JSON 
		request.header("Content-Type", "application/json"); // Add the Json to the body of the request 
		request.body(requestParams.toJSONString()); // Post the request and check the response
		
		//Validate the response
		Response response = request.post("/BookStoreV1BooksPost"); 
		System.out.println("The status received: " + response.statusLine());
		
	}

}
