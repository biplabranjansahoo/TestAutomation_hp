package com.hp.qa.api;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.parser.ParseException;
import com.hp.qa.util.JsonReader;
import com.hp.qa.util.StatusCode;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SitehomeApiHelper {

	private Response response;
	CommonAPIHelper helper = new CommonAPIHelper();

	private String url = helper.url;

	public boolean invokeAPISiteHomeRowIcons() throws IOException, ParseException {
		String username = JsonReader.getTestData("username");
		String password = JsonReader.getTestData("password");
		response = given().contentType("application/json").queryParam("page", 2).pathParam("locale", "us-en").auth()
				.basic(username, password).when().get(url + "/wcc-services/cms-v2/{locale}/wcc_sitehome_rowicons")
				.then().extract().response();
		System.out.println("Response of site home row icons api: " + response.asString());
		return true;
	}

	public boolean validateAPISiteHomeRowIcons() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.title").isEmpty())) {
			// response.then().body("data", hasSize(3));
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.title"));
			System.out.println("The row icons present are - " + lst.toString());
			return true;
		} else
			return false;
	}

	public boolean invokeAPISiteHomeTiles() throws IOException, ParseException {
		response = given().contentType("application/json").pathParam("locale", JsonReader.getTestData("country")).when()
				.get(url + "/wcc-services/cms-v2/{locale}/wcc_sitehome_tiles").then().extract().response();
		System.out.println("Response of tiles api: " + response.asString());
		return true;
	}

	public boolean validateAPISiteHomeTiles() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.linkText").isEmpty())) {
			// response.then().body("data",hasSize(3));
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.linkText"));
			System.out.println("The tiles present are - " + lst.toString());
			return true;
		} else
			return false;
	}

	public boolean invokeAPISiteHomeCarousel() throws IOException, ParseException {
		response = given().contentType("application/json").pathParam("locale", JsonReader.getTestData("country")).when()
				.get(url + "/wcc-services/cms-v2/{locale}/wcc_sitehome_carousel").then().extract().response();
		System.out.println("Response of carousel api: " + response.asString());
		return true;
	}

	public boolean validateAPISiteHomeCarousel() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.overlayHeader").isEmpty())) {
			// response.then().body("data",hasSize(6));
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.overlayHeader"));
			System.out.println("The carousel present are - " + lst.toString());
			return true;
		} else
			return false;
	}

	public boolean invokeAPISiteHomeSupportresources() throws IOException, ParseException {
		response = given().contentType("application/json").pathParam("locale", JsonReader.getTestData("country")).when()
				.get(url + "/wcc-services/cms-v2/{locale}/wcc_sitehome_supportresources").then().extract().response();
		System.out.println("Response of support resources api: " + response.asString());
		return true;
	}

	public boolean validateAPISiteHomeSupportresources() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.supportResources.linkText").isEmpty())) {
			// response.then().body("data",hasSize(1));
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.supportResources.linkText"));
			System.out.println("The support resources present are - " + lst.toString());
			return true;
		} else
			return false;
	}

	public boolean invokeAPISiteHomeProducttype() throws IOException, ParseException {
		response = given().contentType(ContentType.JSON).pathParam("locale", JsonReader.getTestData("country")).when()
				.get(url + "/wcc-services/cms-v2/contexual/{locale}/wcc_pfinder_common?pageTemplate=SiteHome_New")
				.then().extract().response();
		System.out.println("Response of product types api: " + response.asString());
		return true;
	}

	public boolean validateAPISiteHomeProducttype() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.toolTipTitle").isEmpty())) {
			// response.then().body("data.tooTipTitle",hasSize(5));
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.toolTipTitle"));
			System.out.println("The product types present are - " + lst.toString());
			return true;
		} else
			return false;
	}

	public boolean invokeAPISiteHomeSecondarynav() throws IOException, ParseException {
		response = given().contentType("application/json").pathParam("locale", JsonReader.getTestData("country")).when()
				.get(url + "/wcc-services/cms-v2/{locale}/wcc_second_Nav").then().extract().response();
		System.out.println("Response of secondary nav api: " + response.asString());
		return true;
	}

	public boolean validateAPISiteHomeSecondarynav() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.title").isEmpty())) {
			// response.then().body("data.title",hasSize(5));
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.title"));
			System.out.println("The secondary nav present are - " + lst.toString());
			return true;
		} else
			return false;
	}

	public boolean invokeAPISiteHomeOtherProductSupport() throws IOException, ParseException {
		response = given().contentType("application/json").pathParam("locale", JsonReader.getTestData("country")).when()
				.get(url + "/wcc-services/cms-v2/{locale}/wcc_sitehome_otherproduct").then().extract().response();
		System.out.println("Response of other product support api: " + response.asString());
		return true;
	}

	public boolean validateAPISiteHomeOtherProductSupport() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.linkText").isEmpty())) {
			// response.then().body("data.title",hasSize(5));
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.linkText"));
			System.out.println("The other product support present are - " + lst.toString());
			return true;
		} else
			return false;
	}

	public boolean invokeAPISiteHomeAlertsPostAPI() throws IOException, ParseException {
		String payloadJsonPath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\apitestdata\\alertsapidata\\alerts1.json";
		File jsonDataInFile = new File(payloadJsonPath);
		response = given().body(jsonDataInFile).contentType("application/json").when()
				.post(url + "/wcc-services/cms-v2/alerts").then().extract().response();
		System.out.println("Response of alerts post api: " + response.asString());
		return true;
	}

	public boolean validateAPISiteHomeAlertsPostAPI() throws IOException, ParseException {
		if ((response.getStatusCode() == StatusCode.SUCCESS.code)
				&& (!response.jsonPath().getList("data.alertName").isEmpty())) {
			// response.then().body("data.title",hasSize(5));
			List<Object> lst = new ArrayList<Object>(response.jsonPath().getList("data.alertName"));
			System.out.println("The alerts present are - " + lst.toString());
			return true;
		} else
			return false;
	}

//	@Test(description ="Validate the presence of other product support",groups= {"smoke"})
//	public void SiteHome_SSO() {
//		
//		Response response = null;;
//		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
//		ExtentReport.extentlog = 
//				ExtentReport.extentreport
//				.startTest(currentMethodName, "GET : Validate the status code and text of other products support");
//		
//		String jsonBody ="";
//		
//		if(url.contains("uat")) {
//			response = RestAssured
//					.given()
//					.contentType("application/json")
//					.with()
//					.contentType(ContentType.JSON)
//					.and()
//					.body(jsonBody)
//					.when()																									
//					.get("https://global-navbar-backend.stg.cd.id.hp.com/api/v1/session/sso_check")
//					.then()
//					.extract()
//					.response();
//		}
//		else {
//		response = RestAssured
//				.given()
//				.contentType("application/json")
//				.with()
//				.contentType(ContentType.JSON)
//				.and()
//				.body(jsonBody)
//				.when()																									
//				.get("https://global-navbar-backend.id.hp.com/api/v1/session/sso_check")
//				.then()
//				.extract()
//				.response();
//		}
//	
//		Assert.assertEquals(response.getStatusCode(), StatusCode.SUCCESS.code);
//	}

}
