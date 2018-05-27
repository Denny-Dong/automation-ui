package com.souban.bdd.pages.CreamsWebPage.Contract;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class RenewContractPage extends ParentPage {

	public RenewContractPage(Driver driver) {
		super(driver);
	}

	// contractPayInfo
	// private UIElement TXT_Building=new
	// UIElement("xpath=//*[@class='title___3a0pk']");
	private UIElement TXT_Room = new UIElement("xpath=//span[text()='401']");
	private UIElement BTN_Renew = new UIElement("xpath=//span[text()='续签']");
	private UIElement BTN_NestStep = new UIElement("xpath=//*[@class='ant-btn ant-btn-primary']");
	private UIElement INP_Rent = new UIElement("//input[@name='primePrice']");
	private UIElement INP_MethodOfPayment = new UIElement(
			"xpath=//div[@class='col4___nwm1S']/div[2]/div[2]/span[1]/input");
	private UIElement INP_PaymentPeriod = new UIElement("xpath=//div[@class='col4___nwm1S']/div[3]/div[2]/span/input");
	private UIElement INP_PaymentDaysInAdvance = new UIElement(
			"xpath=//div[@class='col4___nwm1S']/div[4]/div[2]/span/input");

	private UIElement TXT_TitleofContractInfo = new UIElement("xpath=//*[text()='合同信息']");
	// contractDateInfo
	private UIElement CAL_ContractStartDate = new UIElement(
			"xpath=//*[text()='合同计租日期:']/following-sibling::div/span/div/input");
	private UIElement INP_Discount = new UIElement("xpath=//*[text()='第一年折扣：']/following-sibling::span/input");
	private UIElement TXT_Lease = new UIElement("xpath=//*[text()='一年']");
	private UIElement BTN_AddFreeRentDate = new UIElement("xpath=//button[text()='添加合同后免租期']");
	private UIElement CAL_RentFreeDate = new UIElement(
			"xpath=//*[text()='后:']/following-sibling::div/span/span/div/input");

	// 续签合同
	public void click_renew() {
		this.driver.click(BTN_Renew);

	}

	public void click_nextStep() {
		this.driver.sleep(2000);
		this.driver.click(BTN_NestStep);
	}

	public void input_contractPayInfo(String rent, String method_of_payment, String payment_period,
			String payment_days_in_advance) {
		this.driver.sleep(2000);
		this.driver.elementClearText(INP_Rent);
		this.driver.elementSendText(INP_Rent, rent);
		this.driver.elementClearText(INP_MethodOfPayment);
		this.driver.elementSendText(INP_MethodOfPayment, method_of_payment);
		this.driver.sleep(1000);
		this.driver.elementClearText(INP_PaymentPeriod);
		this.driver.elementSendText(INP_PaymentPeriod, payment_period);
		this.driver.sleep(1000);
		this.driver.elementClearText(INP_PaymentDaysInAdvance);
		this.driver.elementSendText(INP_PaymentDaysInAdvance, payment_days_in_advance);
	}

	public void input_contractDateInfo(String startDate) {
		this.driver.selectDate(CAL_ContractStartDate, INP_Rent, startDate);
	}

	public void select_lease(String lease) {
		this.driver.click(TXT_Lease);
	}

	public void add_rent_free_date(String rentFreeDate) {
		this.driver.click(BTN_AddFreeRentDate);
		this.driver.sleep(1000);
		this.driver.selectDate(CAL_RentFreeDate, INP_Rent, rentFreeDate);
	}

	public void input_discount(String discount) {
		this.driver.elementClearText(INP_Discount);
		this.driver.elementSendText(INP_Discount, discount);
	}

	public boolean CheckRenewContractResult() {
		this.driver.click(TXT_Room);
		return this.driver.waitForElement(BTN_Renew, 3);
	}
}
