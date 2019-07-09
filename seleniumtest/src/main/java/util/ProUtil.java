package util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ProUtil {
	private Properties prop;
	private String filePath;
	/*
	 * 一个参数的构造方法
	 */
	
	public ProUtil(String filePath){
		this.filePath=filePath;
		this.prop=readProperties();
	}
	
	/* 
	 * 读取配置文件
	 */
	
	public Properties readProperties() {
		Properties properties=new Properties();
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(filePath);
			InputStream in=new BufferedInputStream(inputStream);
			properties.load(in);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return properties;
	}
	
	/*
	 * 根据key值获取配置值
	 */
	public String getpro(String key){
		if(prop.containsKey(key)) {
			String loctor=prop.getProperty(key);
			System.out.println(loctor);
			return loctor;
		}else {
			System.out.println("key值获取失败，请核实！！！");
			return "";
		}
	}
}
