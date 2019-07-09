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
	 *# �����û���
	 */
	public void sendKeysUser(String username) {
		lp.sendkeys(lp.getUserElement(), username);
	}
	
	/*
	 * #��������
	 */
	public void sendKeysPassword(String password) {
		lp.sendkeys(lp.getPasswordElement(), password);
	}
	
	/*
	 * #�����¼
	 */
	public void clickLogInButton() {
		lp.click(lp.getLogButtonElement());;
	}
	/*
	 * #�ж��Ƿ��ǵ�¼ҳ��
	 */
	public boolean assertLoginPage() {
		return lp.elementIsDisplay(lp.getUserElement());
	}
}
