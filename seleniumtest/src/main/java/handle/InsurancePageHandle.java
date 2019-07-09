package handle;

import base.DriverBase;
import page.InsurancePage;

public class InsurancePageHandle {
	public DriverBase driver;
	public InsurancePage ip;
	public InsurancePageHandle(DriverBase driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		ip=new InsurancePage(driver);
	}
	
	//
	public void clickGoBuyButton() {
		ip.click(ip.getBuyInsuranceElement());
	}
}
