package apiAutomation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import io.restassured.http.Method;

public class RestAssuredAPITest {
	@Test(enabled=false)
	public void GetBooksDetails() { 
		// Specify the base URL to the RESTful web service 
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
		// Get the RequestSpecification of the request to be sent to the server. 
		RequestSpecification httpRequest = RestAssured.given(); 
		// specify the method type (GET) and the parameters if any. 
		//In this case the request does not take any parameters 
		Response response = httpRequest.request(Method.GET, "");
		// Print the status and message body of the response received from the server 
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
	   }
	
	@Test
	public void postRequestBooksAPI() 
	{ 
	   RestAssured.baseURI = "https://demoqa.com"; 
	   RequestSpecification request = RestAssured.given();
	   // JSONObject is a class that represents a Simple JSON. 
	   // We can add Key - Value pairs using the put method 
	   JSONObject requestParams = new JSONObject(); 
	   requestParams.put("userId", "TQ123"); 
	   requestParams.put("isbn", "9781449325862"); 
	   // Add a header stating the Request body is a JSON 
	   request.header("Content-Type", "application/json"); // Add the Json to the body of the request 
	   request.body(requestParams.toJSONString()); // Post the request and check the response
	   Response response = request.post("/BookStore/V1/Books"); 
	   System.out.println("The status received: " + response.statusLine());
	}
}
