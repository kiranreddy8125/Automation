package objectrepository;

public class propertyfileutility {
	package genericUtlities;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.util.Properties;

	public class PropertyFileUtility {
	public String readDataFromPf(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\staragile\\Manual Testing\\Wellsforgocompany\\EveningAdvancedselenium\\src\\test\\resources\\commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	}
}
