package com.hp.qa.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.parser.ParseException;


import com.hp.qa.util.JsonReader;
import com.hp.qa.util.StatusCode;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class SWDLandingAPIHelper {
	
	private Response response;
	private String url=JsonReader.getTestData("url");
		
	public boolean invokeAPISWDLandingPage() throws IOException, ParseException {
		response = given()
				.contentType("application/json")
				.pathParam("locale", JsonReader.getTestData("country"))
				.when()
				.get(url + "/wcc-services/cms-v2/{locale}/wcc_swd_landing_page")
				.then()
				.extract()
				.response();		
		System.out.println("Response of swd landing api: " + response.asString());
		return true;
	}

	public boolean validateAPISWDLandingPage() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.type").isEmpty())) {
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.type"));
			System.out.println("The swd landing products - " + lst.toString());
			return true;
		} else
			return false;
	}	
	
	public boolean invokeAPISWDLandingSSCRegion() throws IOException, ParseException {
		response = given()
				.contentType("application/json")
				.when()
				.get(url + "/wcc-services/ssc/region")
				.then()
				.extract()
				.response();		
		System.out.println("Response of swd landing ssc region api: " + response.asString());
		return true;
	}

	public boolean validateAPISWDLandingSSCRegion() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.cclc").isEmpty())) {
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.cclc"));
			System.out.println("The swd landing ssc regions - " + lst.toString());
			return true;
		} else
			return false;
	}
	
	public boolean invokeAPISWDLandingTermbase() throws IOException, ParseException {
		response = given()
				.contentType("application/json")
				.pathParam("locale", JsonReader.getTestData("country"))
				.when()
				.get(url + "/wcc-services/termbase/{locale}/swdLanding")
				.then()
				.extract()
				.response();		
		System.out.println("Response of swd landing termbase api: " + response.asString());
		return true;
	}

	public boolean validateAPISWDLandingTermbase() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (response.jsonPath().get("status").equals("success"))) {
			String respString = response.asString();
			boolean checkForTermbase=(respString.contains("\"#pps_WCC_FS_SWD_Download_text\":\"Download\"")
					&& (respString.contains("\"#pps_WCC_FS_WPD_LearnMore_text\":\"Learn More\"")));
			System.out.println("The swd landing termbase - "
					+ checkForTermbase);
			return checkForTermbase;
		} else
			return false;
	}
	
	public boolean invokeAPISWDLandingConfig() throws IOException, ParseException {
		response = given()
				.contentType("application/json")
				.pathParam("locale", JsonReader.getTestData("country"))
				.when()
				.get(url + "/wcc-services/config/{locale}/swd")
				.then()
				.extract()
				.response();		
		System.out.println("Response of swd config api: " + response.asString());
		return true;
	}

	public boolean validateAPISWDLandingConfig() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("ssc.key").isEmpty())) {
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("ssc.key"));
			System.out.println("The swd config - " + lst.toString());
			return true;
		} else
			return false;
	}
	
}
