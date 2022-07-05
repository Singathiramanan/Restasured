package restAssured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_action {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a=RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		a.contentType(ContentType.JSON);
		a.body(obj.toJSONString());
		Response b=a.request(Method.POST,"api/users");
		System.out.println(b.asString());
		System.out.println(b.statusCode());
		String str=b.asString();
		JsonPath js=new JsonPath(str);
		String job=js.get("job");
		System.out.println(job);

	}

}
