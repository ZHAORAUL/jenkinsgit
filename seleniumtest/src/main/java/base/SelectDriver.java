package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SelectDriver {
	public WebDriver driverName(String browser) {
		
		//����chrome�������ļ�
		ChromeOptions chromeOption=new ChromeOptions();
		chromeOption.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("���������ȸ����������");
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver(chromeOption);
		}else {
			System.out.println("��ֻ֧�������ȸ������");
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver(chromeOption);
		}
		
	}
}
