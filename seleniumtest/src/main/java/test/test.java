package test;

import java.util.List;

import org.openqa.selenium.WebElement;


import testCase.CreateWaybillnoCase;
import testCase.InsuranceBuyCase;
import util.GetByLoctor;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CreateWaybillnoCase cwc=new CreateWaybillnoCase();
		cwc.getLoginHome();
		cwc.loginTest();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		//����
		cwc.openCreateWaybillNoPage();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//cwc.createWaybillNo();
		cwc.driver.closeDriver();
	
		
		/*
		//����һ���˵�
		List<WebElement> menuelement1=cwc.driver.findElements(GetByLoctor.getLoctor("menulist1"));
		for(WebElement ele:menuelement1) {
			String menu1=ele.getText();
			System.out.println(menu1);
			if("���ղ�Ʒ".equalsIgnoreCase(menu1)) {
				ele.click();
			}
		}
		//���������˵�
		List<WebElement> menuelement2=cwc.driver.findElements(GetByLoctor.getLoctor("menulist2"));
		for(WebElement ele:menuelement2) {
			String menu2=ele.getText();
			System.out.println(menu2);
			if("������".equalsIgnoreCase(menu2)) {
				ele.click();
			}
		}
		*/
		/*
		InsuranceBuyCase ibc=new InsuranceBuyCase();
		ibc.getLoginHome();
		ibc.loginTest();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ibc.buyInsurance();
		*/
	}
	
		

}
