package business;

import java.util.Arrays;

import base.DriverBase;
import util.GetUrl;
import util.WaybillNo;
import handle.CreateWaybillnoPageHandle;

public class CreateWaybillnoPro {
	public CreateWaybillnoPageHandle cwph;
	public CreateWaybillnoPro(DriverBase driver) {
		cwph=new CreateWaybillnoPageHandle(driver);
	}
	
	/*
	 * 快捷开单，开num个运单号
	 */
	public void quickCreateWaybillNo(String modelwaybillno,int num) {
		String[] waybillnolist=new String[num];  //定义一个字符串数组,用于存储开单成功的运单号
		for(int i=0;i<num;i++) {
			if(cwph.assertCreateWaybillNoPage()) {
				cwph.sendKeysWaybillNo(modelwaybillno);//以modelwaybillno为原本快捷开单
				cwph.clickOrginWaybillNo();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cwph.clearWaybillNo();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String waybillno=WaybillNo.setWaybillNo();
				cwph.sendKeysWaybillNo(waybillno);
				cwph.clickCreateWaybillNoButton();
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*
				 * 判断开单是否成功，记录开单成功的运单号
				 */
				if(cwph.successCreateWaybillNo()) {
					String msg=cwph.getSuccessWaybillNo();
					System.out.println(msg);
					waybillnolist[i]=waybillno;  //成功开单后的运单号存储至数组中
				}else {
					System.out.println("开单未成功");
					i--;
				}
			}else {
				System.out.println("页面不存在或状态不正确");
				i--;
			}
			cwph.driver.get(GetUrl.getUrl("测试开单")); //重新打开开单页面
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 打印开单成功的运单号
		System.out.println(Arrays.toString(waybillnolist));
	}
}
