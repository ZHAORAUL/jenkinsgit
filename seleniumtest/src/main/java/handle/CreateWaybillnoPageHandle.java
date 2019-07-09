package handle;

import base.DriverBase;
import page.CreateWaybillnoPage;

public class CreateWaybillnoPageHandle {
	public DriverBase driver;
	public CreateWaybillnoPage cwp;
	public CreateWaybillnoPageHandle(DriverBase driver) {
		this.driver=driver;
		cwp=new CreateWaybillnoPage(driver);
	}
	
	/*
	 * #�����˵���
	 */
	public void sendKeysWaybillNo(String waybillno) {
		cwp.sendkeys(cwp.WaybillNoElement(), waybillno);
	}
	
	
	/*
	 * #���ԭ�˵��������
	 */
	public void clickOrginWaybillNo() {
		cwp.click(cwp.orginWaybillNoElement());
	}
	/*
	 * ����˵������������
	 */
	public void clearWaybillNo() {
		cwp.clear(cwp.WaybillNoElement());
	}
	
	/*
	 * ���ȷ���˵���ť
	 */
	public void clickCreateWaybillNoButton() {
		cwp.click(cwp.createWaybillNoButtonElement());
	}
	/*
	 * �����ʾ��Ϣȷ�ϰ�ť
	 */
	public void clickTextBoxButton() {
		cwp.click(cwp.textBoxButton());
	}
	/*
	 * �ж��Ƿ��Ƿ�վ����ҳ��
	 */
	public boolean assertCreateWaybillNoPage() {
		return cwp.elementIsDisplay(cwp.WaybillNoElement());
	}
	/*
	 * �ж��Ƿ񿪵��ɹ�
	 */
	public boolean successCreateWaybillNo() {
		return cwp.elementIsDisplay(cwp.sucessWaybillNoElement());
	}
	/*
	 * ��ȡ�����ɹ����˵���
	 */
	public String getSuccessWaybillNo() {
		return cwp.getText(cwp.sucessWaybillNoElement());
	}
	/*
	 * �ر��Ƿ��ӡ��ʾ��
	 */
	public void clickPrintTextButton() {
		cwp.click(cwp.closePrintTextButton());
	}
}
