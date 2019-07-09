package testCase;

import business.ProtalOpenPagePro;
import handle.InsurancePageHandle;

public class InsuranceBuyCase extends LoginCase{
	public  ProtalOpenPagePro popp;
	public InsurancePageHandle iph;
	public InsuranceBuyCase() {
		// TODO Auto-generated constructor stub
		super();
		popp=new ProtalOpenPagePro(driver);
		iph=new InsurancePageHandle(driver);
	}
	
	public void buyInsurance() {
		popp.openSecondMenuPage("保险产品", "购买保险");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		iph.clickGoBuyButton();
	}
}
