package com.automation.mercury.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtil {
	public static String getPropertyValue(String fn,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./TestData/"+fn+".properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
