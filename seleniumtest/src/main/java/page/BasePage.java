package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.DriverBase;

public class BasePage {
	public DriverBase driver;
	public BasePage(DriverBase driver) {
		this.driver=driver;
	}
	
	/*
	 * #封装WebElement
	 * @param By by
	 */
	
	public WebElement element(By by) {
		WebElement element=driver.findelement(by);
		return element;
	}
	
	/*
	 *  //封装List<WebElement>
	 */
	public List<WebElement> elementList(By by) {
		List<WebElement> list= driver.findElements(by);
		return list;
	}
	/*
	 * #封装点击
	 */
	public void click(WebElement element) {
		if(element!=null) {
			element.click();
		}else {
			System.out.println("元素没有定位到，点击失败！");
		}
	}
	
	/*
	 * #封装鼠标移动
	 */
	public void mouseMove(WebElement element) {
		if(element!=null) {
			driver.moveToElement(element);
		}else {
			System.out.println("元素没有定位到，移动失败！");
		}
		
	}
	/*
	 * #封装输入
	 */
	public void sendkeys(WebElement element,String value) {
		if(element!=null) {
			element.sendKeys(value);
		}else {
			System.out.println(element+"元素定位失败，输入"+value+"失败！");
		}
	}
	/*
	 * #封装清空数据
	 */
	public void clear(WebElement element) {
		if(element!=null) {
			element.clear();
		}else {
			System.out.println(element+"定位元素不存在，清除失败");;
		}
	}
	
	
	/*
	 * #判断元素是否显示
	 */
	public boolean elementIsDisplay(WebElement elemnet) {
		return elemnet.isDisplayed();
	}
	/*
	 * # 获取信息
	 */
	public String getText(WebElement element) {
		if(element!=null) {
			String msg=element.getText();
			return msg;
		}else {
			System.out.println(element+"定位元素不存在，获取失败");
			return null;
		}
	}
}
