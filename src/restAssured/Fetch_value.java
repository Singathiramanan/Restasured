package restAssured;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Fetch_value {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a= RestAssured.given();
		Response b=a.request(Method.GET,"api/users?page=2");
		String str=b.asString();
		Headers hd=b.headers();
		System.out.println(hd);
		JsonPath jp=new JsonPath(str);
		String a1=jp.get("text");
		System.out.println(a1);
		System.out.println("finish");

	}

}
