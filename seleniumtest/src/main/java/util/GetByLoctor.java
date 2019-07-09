package util;

import org.openqa.selenium.By;


public class GetByLoctor {
	public static By getLoctor(String key) {
		ProUtil prop=new ProUtil("element.properties");
		String loctor=prop.getpro(key);
		String loctortype=loctor.split(">")[0];
		String loctorvalue=loctor.split(">")[1];
		
			if(loctortype.equals("id")) {
				System.out.println("使用id进行定位");
				return By.id(loctorvalue);
			}else if(loctortype.equals("name")) {
				System.out.println("使用name进行定位");
				return By.name(loctorvalue);
			}else if(loctortype.equals("className")) {
				System.out.println("使用className进行定位");
				return By.className(loctorvalue);
			}else if(loctortype.equals("tagName")) {
				System.out.println("使用tagName进行定位");
				return By.tagName(loctorvalue);
			}else if(loctortype.equals("xpath")) {
				System.out.println("使用xpath进行定位");
				return By.xpath(loctorvalue);
			}else if(loctortype.equals("cssSelector")) {
				System.out.println("使用cssSelector进行定位");
				return By.cssSelector(loctorvalue);
			}else {
				System.out.println("抱歉，不支持其他定位方式");
				return null;
			}
	}
}
