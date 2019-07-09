package business;

import base.DriverBase;
import handle.ProtalPageHandle;

public class ProtalOpenPagePro {
	public ProtalPageHandle pph;
	public ProtalOpenPagePro(DriverBase driver) {
		// TODO Auto-generated constructor stub
		pph=new ProtalPageHandle(driver);
	}
	//打开二级菜单页面
	public void openSecondMenuPage(String menu1,String menu2) {
		pph.clickChosenFirstMenu(menu1);
		pph.clickChosenSecondMenu(menu2);
	}
	
	//打开三级菜单页面
	public void openThirdMenuPage(String menu1,String menu2,String menu3) {
		
				pph.clickChosenFirstMenu(menu1);
				pph.moveToChosenSecondMenu(menu2);
				pph.clickChosenThirdMenu(menu3);
				//pph.moveToTabTitle();
				
		
			
		
	}
}
