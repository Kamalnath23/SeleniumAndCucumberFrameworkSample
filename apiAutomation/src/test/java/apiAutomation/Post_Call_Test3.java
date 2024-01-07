package apiAutomation;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Post_Call_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// There is no need to add escape character manually. Just paste string within double 
				// quotes. It will automatically add escape sequence as required. 
				String jsonString = "{\r\n"
						+ "\"body\":[\r\n"
						+ "{\r\n"
						+ "\"require_approval\":\"yes\",\r\n"
						+ "\"requested_for\":\"ads.kbalakrishnan\",\r\n"
						+ "\"correlation_id\":\"PTAT_ID_10510w4rt\",\r\n"
						+ "\r\n"
						+ "\"variables\":{\r\n"
						+ "\"traveler_eid\":\"ptat.traveler.4\",\r\n"
						+ "\"contact_number\":\"919876543201\",\r\n"
						+ "\r\n"
						+ "\"travel_request_for\":\"TravelerOnly\",\r\n"
						+ "\"number_of_travelers\":\"1\",\r\n"
						+ "\"gcp\":\"YES\",\r\n"
						+ "\r\n"
						+ "\"travel_type\":\"Return\",\r\n"
						+ "\"departure_date\":\"20-12-2022\",\r\n"
						+ "\"return_date\":\"28-12-2022\",\r\n"
						+ "\"departure_country\":\"IN\",\r\n"
						+ "\"departure_city\":\"Chennai\",\r\n"
						+ "\"destination_country\":\"MX\",\r\n"
						+ "\"destination_city\":\"TAM–Tampico\",\r\n"
						+ "\"multi_city_journey\":\"No\",\r\n"
						+ "\"travel_options\":\"flight\",\r\n"
						+ "\"wbse\":\"A0A80001\",\r\n"
						+ "\"trp_trip_purpose\":\"Internal Training\",\r\n"
						+ "\"approving_md\":\"aaron.a.taylor\",\r\n"
						+ "\"traveler_comments\":\"TEST\",\r\n"
						+ "\"trip_type\":\"International\",\r\n"
						+ "\"return_to_office_number\":\"N/A\",\r\n"
						+ "\"ap55_approval_number\":\"\",\r\n"
						+ "\"opened_by\":\"ptat.traveler.2\",\r\n"
						+ "\"tripp_reference_number\":\"143\"\r\n"
						+ "}\r\n"
						+ "}\r\n"
						+ "]\r\n"
						+ "}\r\n"
						+ "";
				
				// Create a request specification 
				RequestSpecification request= RestAssured.given();
				
				// Setting content type to specify format in which request payload will be sent.
				// ContentType is an ENUM. 
				request.contentType(ContentType.JSON);
				//Adding URI
				request.baseUri("https://api.support.ciodev.accenture.com/v2/opsdev/support_ticket");
				// Adding body as string
				request.body(jsonString);
				
				//request.header(jsonString, request, args)
				request.headers("authorizationtoken" ,"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IjJaUXBKM1VwYmpBWVhZR2FYRUpsOGxWMFRPSSIsImtpZCI6IjJaUXBKM1VwYmpBWVhZR2FYRUpsOGxWMFRPSSJ9.eyJhdWQiOiJodHRwczovL2FwaS5zdXBwb3J0LmNpb3N0YWdlLmFjY2VudHVyZS5jb20vdjIvc3VwcG9ydF90aWNrZXQvIiwiaXNzIjoiaHR0cHM6Ly9zdHMud2luZG93cy5uZXQvZjMyMTFkMGUtMTI1Yi00MmMzLTg2ZGItMzIyYjE5YTY1YTIyLyIsImlhdCI6MTY2NzQyMDI5NywibmJmIjoxNjY3NDIwMjk3LCJleHAiOjE2Njc0MjQxOTcsImFpbyI6IkUyWmdZQWhWcVpnbEtsSzQvZlBacWJyVnVyczJBUUE9IiwiYXBwaWQiOiI3MWU5YzExYy1hMDM2LTQ3NTktYjY2ZS05NjM0Yjk4MzA1NzQiLCJhcHBpZGFjciI6IjEiLCJpZHAiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC9mMzIxMWQwZS0xMjViLTQyYzMtODZkYi0zMjJiMTlhNjVhMjIvIiwib2lkIjoiNmNiYzVmMTYtMDFlNC00MzM2LWE3OTMtOGJkNmM1OTI0OTFlIiwicmgiOiIwLkFTWUFEaDBoODFzU3cwS0cyeklyR2FaYUltQXVfajZwcmFsSXYwb042M3lWeEVVbUFBQS4iLCJyb2xlcyI6WyJyZWFkX3NuZmFfdW5pZmllZGdhdGV3YXkiLCJ3cml0ZV9zbmZhX3VuaWZpZWRnYXRld2F5Il0sInN1YiI6IjZjYmM1ZjE2LTAxZTQtNDMzNi1hNzkzLThiZDZjNTkyNDkxZSIsInRpZCI6ImYzMjExZDBlLTEyNWItNDJjMy04NmRiLTMyMmIxOWE2NWEyMiIsInV0aSI6IjF0WEFJU3lWaFVPNk81RnVxbU1wQUEiLCJ2ZXIiOiIxLjAifQ.KQZ34v9oru8aYUGfpbs_9jLPRk_WvFU-hr95tzrvytZ8FDJTErX3ZOvez9gTxQN04vgQ5hPXiB6wiSoUjMvC8plKfYqLw_d9n7boHiTeMW8l_1gj2WymcOpK2lW6M1GM6jnEox-msMwjjjR-X31Ky26H-YR-jiKwR1OX0VA8ni1FUn0kJJ5ISSks5zyGeX4oAelOEsPR65NT8thEeLWbzyD38OJ6pZ4r4ErWU-K9_ftM1WJzWoX3IErZRMHPtmBz6jO3yMpNm3LfIUFbQ04QIMWUspC_qW-ND2kz89Y-GM4WVIeABmo1-k5hEka_WV8fyqTzSR7uIpV6CGvQqVHZ3w",
						  "catalogitem" , "98690752db8094d8c3a3ea7b0396191d",
						  "x-api-key" , "HImrEKGXzE1UiFvqteI2H5K7lHHS5PpG7ZlB333j",
						  "Content-Type", "application/json");
				// Calling POST method on URI. After hitting we get Response
				Response response = request.post();
				
				// Printing Response as string
				System.out.println(response.asString());
				
				// Get Validatable response to perform validation
				ValidatableResponse validatableResponse = response.then();
				
				// Validate status code as 200
				validatableResponse.statusCode(201);
				
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
