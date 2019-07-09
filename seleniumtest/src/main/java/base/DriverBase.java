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
	 *# �ر������
	 */
	public void closeDriver() {
		System.out.println("stop WebDriver");
		driver.close();
	}
	
	/*
	 * #��������
	 */
	public void maxbrowser() {
		System.out.println("��������");
		driver.manage().window().maximize();
	}
	/*
	 * #���������
	 */
	public void back() {
		System.out.println("����~~~~");
		driver.navigate().back();
	}
	/*
	 * �����ǰ��
	 */
	public void forward() {
		System.out.println("ǰ��~~~~");
		driver.navigate().forward();
	}
	/*
	 * ˢ��
	 */
	public void refresh() {
		System.out.println("ˢ��~~~~");
		driver.navigate().refresh();
	}
	/*
	 * #findelement����
	 */
	public WebElement findelement(By by) {
		WebElement element=driver.findElement(by);
		return element;
	}
	/*
	 *  //findElements����
	 */
	public List<WebElement> findElements(By by) {
		return driver.findElements(by);
	}
	/*
	 * #get����
	 */
	public void get(String url) {
		driver.get(url);
	}
	
	/*
	 * #��װ�����������
	 */
	public void moveToElement(WebElement element) {
		Actions builder=new Actions(driver);
		builder.moveToElement(element).perform();
	}
	/*
	 * #��ͼ
	 */
	public void takescreenshot() {
		long date=System.currentTimeMillis(); //��ȡ��ǰʱ��
		String path=String.valueOf(date); 
		String curPath=System.getProperty("user.dir"); //��ȡϵͳ��ǰ·��
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
