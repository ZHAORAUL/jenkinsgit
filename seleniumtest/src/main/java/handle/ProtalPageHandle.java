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
	
	
	//�����ѡ���һ���˵�
	public void clickChosenFirstMenu(String menuname1) {
		for(WebElement we:pp.getFirstMenuElement()) {
			String text=we.getText();
			if(menuname1.equals(text)) {
				pp.click(we);
			}
		}
	}
	
	//���������ѡ��Ķ����˵�
	public void moveToChosenSecondMenu(String menuname2) {
		for(WebElement we:pp.getSecondMenuElement()) {
			String text=we.getText();
			if(menuname2.equals(text)) {
				driver.moveToElement(we);
			}
			
		}
	}
	//�����ѡ��Ķ����˵�
	public void clickChosenSecondMenu(String menuname2) {
		for(WebElement we:pp.getSecondMenuElement()) {
			String text=we.getText();
			if(menuname2.equals(text)) {
				pp.click(we);
			}
		}
	}
	//�����ѡ��������˵�
	public void clickChosenThirdMenu(String menuname3) {
		for(WebElement we:pp.getThirdMenuElement()) {
			String text=we.getText();
			if(menuname3.equals(text)) {
				pp.click(we);
			}
		}
	}
	
	//����ƶ�����ҳ��ǩ
	public void moveToTabTitle() {
		driver.moveToElement(pp.getTabTitleElement());
	}
	
	//�ж��Ƿ���ҳ
	public boolean assertProtalPage() {
		return pp.elementIsDisplay(pp.getTabTitleElement());
	}
}
