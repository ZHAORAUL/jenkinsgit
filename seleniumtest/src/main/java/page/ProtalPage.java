package page;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.DriverBase;
import util.GetByLoctor;

public class ProtalPage extends BasePage{

	public ProtalPage(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//获取一级菜单列表元素
	public List<WebElement> getFirstMenuElement() {
		return elementList(GetByLoctor.getLoctor("menulist1"));
	}
	
	//获取二级菜单列表元素
	public List<WebElement> getSecondMenuElement(){
		return elementList(GetByLoctor.getLoctor("menulist2"));	
	}
	
	//获取三级菜单列表元素
	public List<WebElement> getThirdMenuElement(){
		return elementList(GetByLoctor.getLoctor("menulist3"));	
	}
	
	//获取首页标签元素
	public WebElement getTabTitleElement() {
		return element(GetByLoctor.getLoctor("title"));
	}
}
