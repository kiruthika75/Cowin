package com.cowin.dataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "configs//Configuration.properties";

	private ConfigFileReader() throws IOException {
		File Propertiesfile = new File(propertyFilePath);
		FileReader ReadPropertiesfile = new FileReader(Propertiesfile);
		BufferedReader reader = new BufferedReader(ReadPropertiesfile);
		properties = new Properties();
		properties.load(reader);
		reader.close();
	}

	public String getBrowser() {

		String BrowserName = properties.getProperty("browser");
		return BrowserName;

	}

	private void getUrl() {

		String Url = properties.getProperty("url");

	}

}
