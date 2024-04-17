package com.hp.qa.api;

import com.hp.qa.util.JsonReader;

public class CommonAPIHelper {

	public  String url;	
	
	public CommonAPIHelper(){
		getENV();
	}
	
	public boolean getENV() {
		url = JsonReader.getTestData("url");
		System.out.println("the api env given: "+url);
		return true;
	}
}
