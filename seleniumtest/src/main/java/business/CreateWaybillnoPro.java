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
	 * ��ݿ�������num���˵���
	 */
	public void quickCreateWaybillNo(String modelwaybillno,int num) {
		String[] waybillnolist=new String[num];  //����һ���ַ�������,���ڴ洢�����ɹ����˵���
		for(int i=0;i<num;i++) {
			if(cwph.assertCreateWaybillNoPage()) {
				cwph.sendKeysWaybillNo(modelwaybillno);//��modelwaybillnoΪԭ����ݿ���
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
				 * �жϿ����Ƿ�ɹ�����¼�����ɹ����˵���
				 */
				if(cwph.successCreateWaybillNo()) {
					String msg=cwph.getSuccessWaybillNo();
					System.out.println(msg);
					waybillnolist[i]=waybillno;  //�ɹ���������˵��Ŵ洢��������
				}else {
					System.out.println("����δ�ɹ�");
					i--;
				}
			}else {
				System.out.println("ҳ�治���ڻ�״̬����ȷ");
				i--;
			}
			cwph.driver.get(GetUrl.getUrl("���Կ���")); //���´򿪿���ҳ��
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// ��ӡ�����ɹ����˵���
		System.out.println(Arrays.toString(waybillnolist));
	}
}
