package com.cowin.managers;

import java.io.IOException;

import com.cowin.dataProvider.ConfigFileReader;

public class FileReaderManager {
	private static FileReaderManager fileReaderManager ;
	private static ConfigFileReader configFileReader;

	
	public FileReaderManager() {
		fileReaderManager = new FileReaderManager();
	}

	public static FileReaderManager getInstance() {
		
		return fileReaderManager;

	}

	public ConfigFileReader getConfigReader() throws IOException {
		
			return configFileReader;
	}

}
