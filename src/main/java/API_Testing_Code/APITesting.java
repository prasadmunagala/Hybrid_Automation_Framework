package API_Testing_Code;
import static io.restassured.RestAssured.*;      
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;

public class APITesting {
	
	public  String api_username()
	{
		Response res=given()
		.when()
		.get("https://api.restful-api.dev/objects/7");
		
		
		String username=res.jsonPath().getString("name");
		
		return username;
	}

}
