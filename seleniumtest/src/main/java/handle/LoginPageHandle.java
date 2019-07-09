package handle;

import base.DriverBase;
import page.LoginPage;

public class LoginPageHandle {
	public DriverBase driver;
	public LoginPage lp;
	public LoginPageHandle(DriverBase driver) {
		this.driver=driver;
		lp=new LoginPage(driver);
	}
	
	/*
	 *# 输入用户名
	 */
	public void sendKeysUser(String username) {
		lp.sendkeys(lp.getUserElement(), username);
	}
	
	/*
	 * #输入密码
	 */
	public void sendKeysPassword(String password) {
		lp.sendkeys(lp.getPasswordElement(), password);
	}
	
	/*
	 * #点击登录
	 */
	public void clickLogInButton() {
		lp.click(lp.getLogButtonElement());;
	}
	/*
	 * #判断是否是登录页面
	 */
	public boolean assertLoginPage() {
		return lp.elementIsDisplay(lp.getUserElement());
	}
}
