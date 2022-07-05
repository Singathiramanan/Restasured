package restAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_action {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a= RestAssured.given();
		Response b=a.request(Method.GET,"api/users?page=2");
		String str = b.asString();
		System.out.println(str);
		System.out.println(b.statusCode());
		System.out.println(b.statusLine());
		JsonPath js=new JsonPath(str);
		String text=js.get("support.text");
		String url=js.get("support.url");
		System.out.println(text);
		System.out.println(url);
		int uni=js.get("data[2].id");
		System.out.println(uni);
		
	}

}
