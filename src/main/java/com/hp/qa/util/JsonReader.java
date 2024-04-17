package com.hp.qa.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReader {

    public static String getTestData(String key) {
        String testdata;
        return testdata = (String)getJsonData().get(key); //input is the key
    }


    public static JSONObject getJsonData(){
    	JSONObject jsonObject = null ;
    	try {
        String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\apitestdata\\testdata.json";
        //pass the path of the test file
        File filename = new File(filepath);
        //convert json file to string
        String json = FileUtils.readFileToString(filename,"UTF-8");
        //parse the string into object
        Object obj = new JSONParser().parse(json);
        //give Json object so that we can return it to a function everytime it is called
        jsonObject = (JSONObject) obj;
    	}
    	catch(Throwable t) {
    		
    	}
        return jsonObject;
    }
    
    public static JSONArray getJsonArray(String key) {
    	
    	JSONObject jsonObject = getJsonData();
    	JSONArray jsonArray = (JSONArray)jsonObject.get(key);
    	return jsonArray;
    }
    
    public static Object getJsonArrayData(String key, int index) {
    	
    	JSONArray languages = getJsonArray(key);
    	return languages.get(index);
    	
    }
}
