package Pojo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest1 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a=RestAssured.given();
		Response b=a.request(Method.GET,"api/users/2");
		//String str=b.asString();
		Single_user a1 = b.as(Single_user.class);
		Support s1 = a1.getSupport();
		System.out.println(s1.getText());
		Data d1 = a1.getData();
		System.out.println(d1.getEmail());
	}
}
