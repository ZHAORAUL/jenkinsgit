package page;

import org.openqa.selenium.WebElement;

import base.DriverBase;
import util.GetByLoctor;

public class InsurancePage extends BasePage{

	public InsurancePage(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getBuyInsuranceElement() {
		return element(GetByLoctor.getLoctor("gobuy"));
	}
	

}
