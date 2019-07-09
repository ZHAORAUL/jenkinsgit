package util;

import org.openqa.selenium.By;


public class GetByLoctor {
	public static By getLoctor(String key) {
		ProUtil prop=new ProUtil("element.properties");
		String loctor=prop.getpro(key);
		String loctortype=loctor.split(">")[0];
		String loctorvalue=loctor.split(">")[1];
		
			if(loctortype.equals("id")) {
				System.out.println("ʹ��id���ж�λ");
				return By.id(loctorvalue);
			}else if(loctortype.equals("name")) {
				System.out.println("ʹ��name���ж�λ");
				return By.name(loctorvalue);
			}else if(loctortype.equals("className")) {
				System.out.println("ʹ��className���ж�λ");
				return By.className(loctorvalue);
			}else if(loctortype.equals("tagName")) {
				System.out.println("ʹ��tagName���ж�λ");
				return By.tagName(loctorvalue);
			}else if(loctortype.equals("xpath")) {
				System.out.println("ʹ��xpath���ж�λ");
				return By.xpath(loctorvalue);
			}else if(loctortype.equals("cssSelector")) {
				System.out.println("ʹ��cssSelector���ж�λ");
				return By.cssSelector(loctorvalue);
			}else {
				System.out.println("��Ǹ����֧��������λ��ʽ");
				return null;
			}
	}
}
