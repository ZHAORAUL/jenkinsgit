package page;

import org.openqa.selenium.WebElement;

import base.DriverBase;
import util.GetByLoctor;

public class LoginPage extends BasePage{
	public LoginPage(DriverBase driver) {
		super(driver);
	}
	/*
	 * #获取用户名输入框
	 */
	public WebElement getUserElement() {
		return element(GetByLoctor.getLoctor("logusername"));
	}
	
	/*
	 * #获取密码输入框
	 */
	public WebElement getPasswordElement() {
		return element(GetByLoctor.getLoctor("logpassword"));
	}
	
	/*
	 * #获取登录按钮
	 */
	public WebElement getLogButtonElement() {
		return element(GetByLoctor.getLoctor("logbutton"));
	}
}
