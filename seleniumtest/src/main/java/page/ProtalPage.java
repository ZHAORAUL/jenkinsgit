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
	
	//��ȡһ���˵��б�Ԫ��
	public List<WebElement> getFirstMenuElement() {
		return elementList(GetByLoctor.getLoctor("menulist1"));
	}
	
	//��ȡ�����˵��б�Ԫ��
	public List<WebElement> getSecondMenuElement(){
		return elementList(GetByLoctor.getLoctor("menulist2"));	
	}
	
	//��ȡ�����˵��б�Ԫ��
	public List<WebElement> getThirdMenuElement(){
		return elementList(GetByLoctor.getLoctor("menulist3"));	
	}
	
	//��ȡ��ҳ��ǩԪ��
	public WebElement getTabTitleElement() {
		return element(GetByLoctor.getLoctor("title"));
	}
}
