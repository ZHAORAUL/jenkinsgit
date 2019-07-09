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
	 * #��¼
	 */
	public void login(String name) {
		String username=GetUser.getUserName(name);
		String password=GetUser.getPassword(name);
		if(lph.assertLoginPage()) {
			lph.sendKeysUser(username);
			lph.sendKeysPassword(password);
			lph.clickLogInButton();
		}else {
			System.out.println("ҳ�治���ڻ�״̬����ȷ");
		}
	}
}
