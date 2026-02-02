package trestassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testassuredrest{

		 public static void main (String args[]) throws InterruptedException{
			  RestAssured.baseURI="https://reqres.in";
			  String Endp="/api/users";
			  String apikey="reqres-free-v1";
			  
			 
			  
			  Response response=RestAssured.given().relaxedHTTPSValidation().auth().oauth2(apikey)		
					  //.header("Authorization", " " + apiKeys) //sending
					  .when().get(Endp).then().extract().response();
			  int scode=response.statusCode();
			  System.out.print("The status code is : "+" " +scode);
			  
			 // int statusCode=response.statusCode();
			  String statusLine=response.statusLine();
			  int statusCode1=response.getStatusCode();
			  String statusLine1=response.getStatusLine();
			  
			  String bodyData=response.getBody().asPrettyString();
			  System.out.println(bodyData);
			  }
		 }
	 