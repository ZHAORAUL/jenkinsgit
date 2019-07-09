package base;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DriverBase {
	public WebDriver driver;
	public DriverBase(String browser) {
		SelectDriver selectDriver=new SelectDriver();
		this.driver=selectDriver.driverName(browser);
	}
	
	/*
	 *# 关闭浏览器
	 */
	public void closeDriver() {
		System.out.println("stop WebDriver");
		driver.close();
	}
	
	/*
	 * #浏览器最大化
	 */
	public void maxbrowser() {
		System.out.println("最大化浏览器");
		driver.manage().window().maximize();
	}
	/*
	 * #浏览器后退
	 */
	public void back() {
		System.out.println("后退~~~~");
		driver.navigate().back();
	}
	/*
	 * 浏览器前进
	 */
	public void forward() {
		System.out.println("前进~~~~");
		driver.navigate().forward();
	}
	/*
	 * 刷新
	 */
	public void refresh() {
		System.out.println("刷新~~~~");
		driver.navigate().refresh();
	}
	/*
	 * #findelement方法
	 */
	public WebElement findelement(By by) {
		WebElement element=driver.findElement(by);
		return element;
	}
	/*
	 *  //findElements方法
	 */
	public List<WebElement> findElements(By by) {
		return driver.findElements(by);
	}
	/*
	 * #get方法
	 */
	public void get(String url) {
		driver.get(url);
	}
	
	/*
	 * #封装鼠标悬浮方法
	 */
	public void moveToElement(WebElement element) {
		Actions builder=new Actions(driver);
		builder.moveToElement(element).perform();
	}
	/*
	 * #截图
	 */
	public void takescreenshot() {
		long date=System.currentTimeMillis(); //获取当前时间
		String path=String.valueOf(date); 
		String curPath=System.getProperty("user.dir"); //获取系统当前路径
		path=path+".png";
		String screenPath=curPath+"/"+path;
		File screen=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File(screenPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
