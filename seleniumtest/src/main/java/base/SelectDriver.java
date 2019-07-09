package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SelectDriver {
	public WebDriver driverName(String browser) {
		
		//设置chrome二进制文件
		ChromeOptions chromeOption=new ChromeOptions();
		chromeOption.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("正在启动谷歌浏览器……");
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver(chromeOption);
		}else {
			System.out.println("暂只支持启动谷歌浏览器");
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver(chromeOption);
		}
		
	}
}
