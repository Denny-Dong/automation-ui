package com.souban.bdd.pages.CreamsWebPage.Contract;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class ContractSideboardPage extends ParentPage {
	public ContractSideboardPage(Driver driver) {
		super(driver);
	}

	private UIElement TXT_ARoom = new UIElement("xpath=//*[@class='creams-building___3PLGt']/li/div[2]/div[1]");
	private UIElement TXT_AContract = new UIElement(
			"xpath=//*[@class='ant-table-row tableRow___19Q18 ant-table-row-level-0']");
	private UIElement BTN_Omitted = new UIElement("xpath=//*[@class='btnGroup___2IZyL']/span[6]");
	private UIElement BTN_Remark = new UIElement("xpath=//li[text()='备注']");
	private UIElement INP_Remark = new UIElement("xpath=//*[@class='ant-input' and @type='textarea']");
	private UIElement BTN_RemarkSubmit = new UIElement("xpath=//*[text()='确 定']/parent::button");
	private UIElement BTN_RemarkSubmit1 = new UIElement("xpath=//button[text()='确认']");
	private UIElement TXT_newRemarkSuccessfully = new UIElement("xpath=//*[text()='备注提交成功！']");
	private UIElement Date_NewRemarkTime = new UIElement("xpath=//*[@class='subTitle___17In6']/span[1]");

	private UIElement newedRemark(String remark) {
		return new UIElement("xpath=//div[text()='" + remark + "']");
	}

	private UIElement BTN_RemarkDelete = new UIElement("xpath=//*[@class='subTitle___17In6']/span[3]");
	private UIElement BTN_RemarkDeleteSubmit = new UIElement("xpath=//button[text()='确认']");
	private UIElement BTN_RemarkEdit = new UIElement("xpath=//*[@class='subTitle___17In6']/span[2]");
	private UIElement BTN_RemarkEditSubmit = new UIElement("xpath=//*[@class='ant-btn ant-btn-primary']");
	private UIElement BTN_rerentSideboard = new UIElement("xpath=//span[text()='退 租']/parent::button");
	private UIElement TXT_RerentPage = new UIElement("xpath=//*[text()='退租协议']");

	public void enterRoomSideboard() {
		this.driver.sleep(2000);
		this.driver.waitAndClick(TXT_ARoom, 5);

	}

	public void enterContractSideboard() {
		this.driver.sleep(1000);
		this.driver.click(TXT_AContract);

	}

	public void enterRemarkPage() {
		this.driver.sleep(1000);
		this.driver.waitForElement(BTN_Omitted, 2);
		this.driver.click(BTN_Omitted);
		this.driver.sleep(1000);
		this.driver.click(BTN_Remark);

	}

	public void fillRemark(String remark) {
		this.driver.elementSendText(INP_Remark, remark);

	}

	public void clickRemarkSubmit() {
		this.driver.sleep(1000);
		this.driver.click(BTN_RemarkSubmit);

	}

	public boolean newRemarkSuccessfully() {
		// TODO Auto-generated method stub
		return this.driver.waitForElement(TXT_newRemarkSuccessfully, 5);
	}

	public boolean newRemarkTimeCurrent() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str1 = sdf.format(new Date());
		String toStr = str1.toString();
		String str2 = this.driver.elementGetText(Date_NewRemarkTime);
		if (str2.compareTo(toStr) == 0) {
			return true;
		} else
			return false;
	}

	public boolean clearRemark(String remark) {
		// TODO Auto-generated method stub
		return this.driver.waitForElement(this.newedRemark(remark), 5);
	}

	public void deleteRemark() {
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_RemarkSubmit1, 5);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_RemarkDelete, 5);
		this.driver.sleep(2000);
		this.driver.waitAndClick(BTN_RemarkDeleteSubmit, 5);

	}

	public void clickRemarkEdit() {
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_RemarkSubmit1, 5);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_RemarkEdit, 5);

	}

	public boolean thisRemarkInput(String remark) {
		// TODO Auto-generated method stub
		return this.driver.waitForElement(this.newedRemark(remark), 5);
	}

	public void clickRemarkEditSubmit() {
		this.driver.waitAndClick(BTN_RemarkEditSubmit, 5);

	}

	public void clickRerentSideboard() {
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_rerentSideboard, 5);

	}

	public boolean enterRerentPageSuccessfully() {
		// TODO Auto-generated method stub
		return this.driver.waitForElement(TXT_RerentPage, 5);
	}

}
