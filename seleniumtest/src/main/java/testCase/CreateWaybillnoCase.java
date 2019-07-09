package testCase;



import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import business.CreateWaybillnoPro;
import business.ProtalOpenPagePro;
//import util.GetUrl;

@Test(groups="group2")
public class CreateWaybillnoCase extends LoginCase {
	public CreateWaybillnoPro cwp;
	public ProtalOpenPagePro popp;
	public CreateWaybillnoCase() {
		super();
		cwp=new CreateWaybillnoPro(driver);
		popp=new ProtalOpenPagePro(driver);
	}
	
	/*
	 *# 打开发站开单页面
	 */
	@Test(dependsOnGroups= {"group1.*"})
	public void openCreateWaybillNoPage() {
		/*
		driver.get(GetUrl.getUrl("uat开单"));
		driver.maxbrowser();
		*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		popp.openThirdMenuPage("运输管理", "运作管理", "发站开单");
	}
	
	/*
	 * 快捷开单，开num个运单
	 */
	@Test(enabled=false)
	public void createWaybillNo() {
		cwp.quickCreateWaybillNo("ZL190528091602",10);
	}
}
