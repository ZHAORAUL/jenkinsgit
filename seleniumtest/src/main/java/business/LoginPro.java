package business;



import base.DriverBase;
import util.GetUser;
import handle.LoginPageHandle;

public class LoginPro {
	public LoginPageHandle lph;
	public LoginPro(DriverBase driver) {
		lph=new LoginPageHandle(driver);
	}
	/*
	 * #登录
	 */
	public void login(String name) {
		String username=GetUser.getUserName(name);
		String password=GetUser.getPassword(name);
		if(lph.assertLoginPage()) {
			lph.sendKeysUser(username);
			lph.sendKeysPassword(password);
			lph.clickLogInButton();
		}else {
			System.out.println("页面不存在或状态不正确");
		}
	}
}
