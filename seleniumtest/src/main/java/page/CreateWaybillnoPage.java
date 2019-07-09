package page;

import org.openqa.selenium.WebElement;

import base.DriverBase;
import util.GetByLoctor;

public class CreateWaybillnoPage extends BasePage {
	
	public CreateWaybillnoPage(DriverBase driver) {
		super(driver);
	}
	
	/*
	 * #获取运单号输入框
	 */
	public WebElement WaybillNoElement() {
		return element(GetByLoctor.getLoctor("creatwaybillno"));
	}
	/*
	 * #获取原单号输入框
	 */
	public WebElement orginWaybillNoElement() {
		return element(GetByLoctor.getLoctor("orginwaybillno"));
	}
	/*
	 * #获取确认运单按钮
	 */
	public WebElement createWaybillNoButtonElement() {
		return element(GetByLoctor.getLoctor("subwaybillno"));
	}
	/*
	 * #获取开单成功后提示信息确认按钮
	 */
	public WebElement textBoxButton() {
		return element(GetByLoctor.getLoctor("surebutton"));
	}
	/*
	 * #获取提示弹框信息
	 */
	public WebElement sucessWaybillNoElement() {
		return element(GetByLoctor.getLoctor("text"));
	}
	/*
	 * #获取是否打印提示的关闭按钮
	 */
	public WebElement closePrintTextButton() {
		return element(GetByLoctor.getLoctor("closeprinttextbutton"));
	}
}
