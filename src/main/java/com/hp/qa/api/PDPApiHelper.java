package com.hp.qa.api;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;
import com.hp.qa.util.JsonReader;
import com.hp.qa.util.StatusCode;

import io.restassured.response.Response;

public class PDPApiHelper {

	CommonAPIHelper helper = new CommonAPIHelper();
	private Response response;
	private String url = helper.url;
	
	public boolean invokeApiPdpCategoryPostAPI() throws IOException, ParseException {
		String payloadJsonPath=System.getProperty("user.dir") + "\\src\\test\\resources\\apitestdata\\pdpapidata\\categorylist.json";
		File jsonDataInFile = new File(payloadJsonPath);
		System.out.println("Helper rul: "+url);
		response = given().body(jsonDataInFile)
				.contentType("application/json")
				.when()
				.post(url + "/wcc-services/pdp/category?type=pc")
				.then()
				.extract()
				.response();
		System.out.println("Response of category post api: " + response.asString());
		return true;
	}
	
	public boolean validateApiPdpCategoryPostAPI() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.categories.seoName").isEmpty())) {
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.categories.seoName"));
			System.out.println("The categories present are - " + lst.toString());
			return true;
		} else
			return false;
	}
	
	public boolean invokeApiPdpCategoryDetailsPostAPI() throws IOException, ParseException {
		String payloadJsonPath=System.getProperty("user.dir") + "\\src\\test\\resources\\apitestdata\\pdpapidata\\categorydetail.json";
		File jsonDataInFile = new File(payloadJsonPath);
		System.out.println("Helper rul: "+url);
		response = given().body(jsonDataInFile)
				.contentType("application/json")
				.when()
				.post(url + "/wcc-services/pdp/category-details?render_mode=debug")
				.then()
				.extract()
				.response();
		System.out.println("Response of category details post api: " + response.asString());
		return true;
	}
	
	public boolean validateApiPdpCategoryDetailsPostAPI() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.categoryList.collectionData.title").isEmpty())) {
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.categoryList.collectionData.title"));
			System.out.println("The categories details present are - " + lst.toString());
			return true;
		} else
			return false;
	}
	
	public boolean invokeApiPdpSecurityAlertsGetAPI() throws IOException, ParseException {
		System.out.println("Helper rul: "+url);
		response = given()
				.contentType("application/json")
				.when()
				.get(url + "/wcc-services/pdp/securityalerts/us-en/7172322?render_mode=debug")
				.then()
				.extract()
				.response();
		System.out.println("Response of security alerts api: " + response.asString());
		return true;
	}
	
	public boolean validateApiPdpSecurityAlertsGetAPI() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.securityAlerts.title").isEmpty())) {
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.securityAlerts.title"));
			System.out.println("The security alerts present are - " + lst.toString());
			return true;
		} else
			return false;
	}
	
}
