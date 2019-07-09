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
	 * #输入运单号
	 */
	public void sendKeysWaybillNo(String waybillno) {
		cwp.sendkeys(cwp.WaybillNoElement(), waybillno);
	}
	
	
	/*
	 * #点击原运单号输入框
	 */
	public void clickOrginWaybillNo() {
		cwp.click(cwp.orginWaybillNoElement());
	}
	/*
	 * 清空运单号输入框数据
	 */
	public void clearWaybillNo() {
		cwp.clear(cwp.WaybillNoElement());
	}
	
	/*
	 * 点击确认运单按钮
	 */
	public void clickCreateWaybillNoButton() {
		cwp.click(cwp.createWaybillNoButtonElement());
	}
	/*
	 * 点击提示信息确认按钮
	 */
	public void clickTextBoxButton() {
		cwp.click(cwp.textBoxButton());
	}
	/*
	 * 判断是否是发站开单页面
	 */
	public boolean assertCreateWaybillNoPage() {
		return cwp.elementIsDisplay(cwp.WaybillNoElement());
	}
	/*
	 * 判断是否开单成功
	 */
	public boolean successCreateWaybillNo() {
		return cwp.elementIsDisplay(cwp.sucessWaybillNoElement());
	}
	/*
	 * 获取开单成功的运单号
	 */
	public String getSuccessWaybillNo() {
		return cwp.getText(cwp.sucessWaybillNoElement());
	}
	/*
	 * 关闭是否打印提示框
	 */
	public void clickPrintTextButton() {
		cwp.click(cwp.closePrintTextButton());
	}
}
