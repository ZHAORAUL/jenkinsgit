package page;

import org.openqa.selenium.WebElement;

import base.DriverBase;
import util.GetByLoctor;

public class CreateWaybillnoPage extends BasePage {
	
	public CreateWaybillnoPage(DriverBase driver) {
		super(driver);
	}
	
	/*
	 * #��ȡ�˵��������
	 */
	public WebElement WaybillNoElement() {
		return element(GetByLoctor.getLoctor("creatwaybillno"));
	}
	/*
	 * #��ȡԭ���������
	 */
	public WebElement orginWaybillNoElement() {
		return element(GetByLoctor.getLoctor("orginwaybillno"));
	}
	/*
	 * #��ȡȷ���˵���ť
	 */
	public WebElement createWaybillNoButtonElement() {
		return element(GetByLoctor.getLoctor("subwaybillno"));
	}
	/*
	 * #��ȡ�����ɹ�����ʾ��Ϣȷ�ϰ�ť
	 */
	public WebElement textBoxButton() {
		return element(GetByLoctor.getLoctor("surebutton"));
	}
	/*
	 * #��ȡ��ʾ������Ϣ
	 */
	public WebElement sucessWaybillNoElement() {
		return element(GetByLoctor.getLoctor("text"));
	}
	/*
	 * #��ȡ�Ƿ��ӡ��ʾ�Ĺرհ�ť
	 */
	public WebElement closePrintTextButton() {
		return element(GetByLoctor.getLoctor("closeprinttextbutton"));
	}
}
