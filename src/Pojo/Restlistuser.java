package Pojo;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Restlistuser {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification rs=RestAssured.given();
		Response a=rs.request(Method.GET, "api/users?page=2");
		String str=a.asString();
		List_user a1 = a.as(List_user.class);
		System.out.println(a1.getPage());
		Supportlist s1 = a1.getSupport();
		System.out.println(s1.getText());
		List<Datalist> d1 = a1.getData();
		for(Datalist d:d1) {
			System.out.println(d.getFirst_name());
		}
		JsonPath js=new JsonPath(str);
		 int val = js.get("data[2].id");
		 System.out.println(val);
	}

}
