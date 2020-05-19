package apiTest;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.hamcrest.Matchers.*;

class RestfulApiTest {
//	@Test
//	void status_code_returns_OK() {
//		//Specify base URI
//		RestAssured.baseURI="http://localhost:8181/";
//		
//		//Request object
//		RequestSpecification httprequest=RestAssured.given();
//		
//		//Response Object
//		Response response=httprequest.request(Method.GET,"CitiesDTO");
//		
//		//Print Response in console window
//		String responseBody = response.getBody().asString();
//		System.out.println("Response Body is : " + responseBody);
//		
//		given().get("CitiesDTO").then().statuscode(200);
//		
//	
//	}
	@Test
	public void StatusCheck() {
		RestAssured.baseURI="http://localhost:8181";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/Cities");
		int statusCode = response.getStatusCode();
		//System.out.println(statusCode);
		
		System.out.println(response.getBody());

		
	}

}
