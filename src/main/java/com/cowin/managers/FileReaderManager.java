package com.cowin.managers;

import java.io.IOException;



import com.cowin.dataProvider.ConfigFileReader;



public class FileReaderManager {

    private static FileReaderManager fileReaderManager; 
    private static ConfigFileReader configFileReader;
   // private static JsonDataReader jsonDataReader;

    private FileReaderManager() {
    	
    	fileReaderManager = new FileReaderManager();
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
       
    }

    public static ConfigFileReader getConfigReader() {
    	
        if (configFileReader == null)
			return new ConfigFileReader();
		else
			return configFileReader;
    }

//    public JsonDataReader getJsonReader(){
//        return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
//    }
}
