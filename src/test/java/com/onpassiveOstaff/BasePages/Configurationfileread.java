package com.onpassiveOstaff.BasePages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configurationfileread {

	public String  fileread(String key) throws IOException {
		Properties prp = new Properties();
		File f = new File("C:\\Users\\ycs\\eclipse-workspace\\"
				+ "HRMS\\ConfigFiles\\ApplicationConfig.properties");
		FileReader fr = new FileReader(f);
		prp.load(fr);
		String str = prp.get(key).toString();
		return str;
	}
	
	
	
	
	

	
}
