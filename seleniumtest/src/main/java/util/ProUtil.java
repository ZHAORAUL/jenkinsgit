package util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ProUtil {
	private Properties prop;
	private String filePath;
	/*
	 * һ�������Ĺ��췽��
	 */
	
	public ProUtil(String filePath){
		this.filePath=filePath;
		this.prop=readProperties();
	}
	
	/* 
	 * ��ȡ�����ļ�
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
	 * ����keyֵ��ȡ����ֵ
	 */
	public String getpro(String key){
		if(prop.containsKey(key)) {
			String loctor=prop.getProperty(key);
			System.out.println(loctor);
			return loctor;
		}else {
			System.out.println("keyֵ��ȡʧ�ܣ����ʵ������");
			return "";
		}
	}
}
