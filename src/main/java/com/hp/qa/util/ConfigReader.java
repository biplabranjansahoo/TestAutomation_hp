package com.hp.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	public Properties init_prop() {

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties";
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prop;
	}

	public Properties initAPIProperties() {
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config_api.properties";
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
