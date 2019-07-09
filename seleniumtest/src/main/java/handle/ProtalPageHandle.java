package handle;


import org.openqa.selenium.WebElement;
import base.DriverBase;
import page.ProtalPage;

public class ProtalPageHandle {
	public DriverBase driver;
	public ProtalPage pp; 
	public ProtalPageHandle(DriverBase driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		pp=new ProtalPage(driver);
	}
	
	
	//点击被选择的一级菜单
	public void clickChosenFirstMenu(String menuname1) {
		for(WebElement we:pp.getFirstMenuElement()) {
			String text=we.getText();
			if(menuname1.equals(text)) {
				pp.click(we);
			}
		}
	}
	
	//鼠标悬浮被选择的二级菜单
	public void moveToChosenSecondMenu(String menuname2) {
		for(WebElement we:pp.getSecondMenuElement()) {
			String text=we.getText();
			if(menuname2.equals(text)) {
				driver.moveToElement(we);
			}
			
		}
	}
	//点击被选择的二级菜单
	public void clickChosenSecondMenu(String menuname2) {
		for(WebElement we:pp.getSecondMenuElement()) {
			String text=we.getText();
			if(menuname2.equals(text)) {
				pp.click(we);
			}
		}
	}
	//点击被选择的三级菜单
	public void clickChosenThirdMenu(String menuname3) {
		for(WebElement we:pp.getThirdMenuElement()) {
			String text=we.getText();
			if(menuname3.equals(text)) {
				pp.click(we);
			}
		}
	}
	
	//鼠标移动至首页标签
	public void moveToTabTitle() {
		driver.moveToElement(pp.getTabTitleElement());
	}
	
	//判断是否首页
	public boolean assertProtalPage() {
		return pp.elementIsDisplay(pp.getTabTitleElement());
	}
}
