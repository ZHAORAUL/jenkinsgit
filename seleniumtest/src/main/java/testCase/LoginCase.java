package testCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import base.DriverBase;
import business.LoginPro;
import util.GetUrl;

public class LoginCase extends CaseBase {
	public DriverBase driver;
	public LoginPro lip;
	static Logger logger=Logger.getLogger(LoginCase.class);
	public LoginCase() {
		this.driver=InitDriver("chrome");
		this.lip=new LoginPro(driver);
	}
	
	/*
	 * #打开货运圈登录页面
	 */
	@Test(groups="group1")
	public void getLoginHome() {
		
		driver.maxbrowser();
		driver.get(GetUrl.getUrl("uat登录"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * #登录
	 */
	//@Test(dependsOnMethods= {"getLoginHome"})
	@Test(groups="group1")
	public void loginTest() {
		logger.debug("使用log4j打印日志~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		lip.login("成都卡行");
	}
}
