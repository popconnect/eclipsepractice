package UtilEx01.src;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx01 {
	public static void main(String[] args) {
		//<String, String> 어노테이션을 따로 박지않음
		Properties prop = new Properties();
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		
		System.out.println(prop);
		
		Enumeration e = prop.propertyNames();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		Set<String> names = prop.stringPropertyNames();
		for( String name : names ) {
			System.out.println(name);
		}
	}
}
