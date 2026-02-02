package trestassured;

import io.restassured.RestAssured;

public class restbaseurigit {
	public static void main(String[] args) {
		RestAssured.baseURI="https://api.github.com";
		String token = "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";
		String ep2 ="/users/bipashakamra07/repos";
		String res = RestAssured.given().relaxedHTTPSValidation().header("Authorization","Bearer" + token).get(ep2).statusLine();
		
		int res1=RestAssured.given().header("Authorization", "Bearer"+token).get(ep2).statusCode();
		       
		
		String StatusBody1 = RestAssured.given().header("Authorization", "Bearer"+token).get(ep2).getBody().asPrettyString();
		System.out.println(res);
		System.out.println(res1);
		System.out.println(StatusBody1);
	}
}