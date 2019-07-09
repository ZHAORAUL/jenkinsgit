package page;

import org.openqa.selenium.WebElement;

import base.DriverBase;
import util.GetByLoctor;

public class LoginPage extends BasePage{
	public LoginPage(DriverBase driver) {
		super(driver);
	}
	/*
	 * #��ȡ�û��������
	 */
	public WebElement getUserElement() {
		return element(GetByLoctor.getLoctor("logusername"));
	}
	
	/*
	 * #��ȡ���������
	 */
	public WebElement getPasswordElement() {
		return element(GetByLoctor.getLoctor("logpassword"));
	}
	
	/*
	 * #��ȡ��¼��ť
	 */
	public WebElement getLogButtonElement() {
		return element(GetByLoctor.getLoctor("logbutton"));
	}
}
