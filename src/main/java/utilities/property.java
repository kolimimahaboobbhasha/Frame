package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class property {
	public String getdatafromproperty(String key) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream fi=new FileInputStream(Constant.propertypath);
		pro.load(fi);
	    String value=	pro.getProperty(key);
		return value;
		
	}

}
