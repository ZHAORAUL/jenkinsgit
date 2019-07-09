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
	 * #��װWebElement
	 * @param By by
	 */
	
	public WebElement element(By by) {
		WebElement element=driver.findelement(by);
		return element;
	}
	
	/*
	 *  //��װList<WebElement>
	 */
	public List<WebElement> elementList(By by) {
		List<WebElement> list= driver.findElements(by);
		return list;
	}
	/*
	 * #��װ���
	 */
	public void click(WebElement element) {
		if(element!=null) {
			element.click();
		}else {
			System.out.println("Ԫ��û�ж�λ�������ʧ�ܣ�");
		}
	}
	
	/*
	 * #��װ����ƶ�
	 */
	public void mouseMove(WebElement element) {
		if(element!=null) {
			driver.moveToElement(element);
		}else {
			System.out.println("Ԫ��û�ж�λ�����ƶ�ʧ�ܣ�");
		}
		
	}
	/*
	 * #��װ����
	 */
	public void sendkeys(WebElement element,String value) {
		if(element!=null) {
			element.sendKeys(value);
		}else {
			System.out.println(element+"Ԫ�ض�λʧ�ܣ�����"+value+"ʧ�ܣ�");
		}
	}
	/*
	 * #��װ�������
	 */
	public void clear(WebElement element) {
		if(element!=null) {
			element.clear();
		}else {
			System.out.println(element+"��λԪ�ز����ڣ����ʧ��");;
		}
	}
	
	
	/*
	 * #�ж�Ԫ���Ƿ���ʾ
	 */
	public boolean elementIsDisplay(WebElement elemnet) {
		return elemnet.isDisplayed();
	}
	/*
	 * # ��ȡ��Ϣ
	 */
	public String getText(WebElement element) {
		if(element!=null) {
			String msg=element.getText();
			return msg;
		}else {
			System.out.println(element+"��λԪ�ز����ڣ���ȡʧ��");
			return null;
		}
	}
}
