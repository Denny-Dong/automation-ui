package com.souban.bdd.pages.CreamsWebPage.Finance;

import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class NewAndEditClosebillsPage extends ParentPage {
	public NewAndEditClosebillsPage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_collectpayment = new UIElement("xpath=//a[text()='收付款']");
	private UIElement BTN_payBill = new UIElement(
			"xpath=//*[@class='ant-dropdown-menu ant-dropdown-menu-vertical ant-dropdown-menu-light ant-dropdown-menu-root']/li[text()='付款账单']");
	private UIElement BTN_newBill = new UIElement(
			"xpath=//*[@class='ant-btn ant-dropdown-trigger']/span[text()='添加账单']");
	private UIElement TXT_billType = new UIElement(
			"xpath=//input[@id='bill-type']");
	private UIElement TXT_billingCycle = new UIElement(
			"xpath=//*[@class='ant-col-12 col1___3utNX']/p[text()='计费周期(必填)']/following-sibling::div[@class='ant-row ant-form-item']/div");
	private UIElement TXT_billingCycleStartTime = new UIElement(
			"xpath=//*[@class='ant-calendar-date-input-wrap']/input[@placeholder='开始日期']");
	private UIElement TXT_billingCycleFinishTime = new UIElement(
			"xpath=//*[@class='ant-calendar-date-input-wrap']/input[@placeholder='结束日期']");
	private UIElement TXT_payAmount = new UIElement("xpath=//*[@class='ant-input-number-input-wrap']/input");

	private UIElement TXT_payTime = new UIElement("xpath=//*[@placeholder='请选择日期']");
	private UIElement TXT_inputPayTime = new UIElement(
			"xpath=//*[@class='ant-calendar-date-input-wrap']/input[@placeholder='请选择日期']");
	private UIElement TXT_billRceciver = new UIElement(
			"xpath=//p[text()='付款方']/following-sibling::div/descendant::input");
	private UIElement TXT_billPayer = new UIElement(
			"xpath=//p[text()='收款方']/following-sibling::div/descendant::input");
	private UIElement BTN_chooseRoom = new UIElement("xpath=//*[@class='rooms___3fIkc']/descendant::li[1]/descendant::input");
	private UIElement BTN_sureSaveBill = new UIElement("xpath=//*[@class='ant-modal-footer']/button[2]");

	private UIElement BTN_addPaymentRecord = new UIElement(
			"xpath=//*[@class='ant-form-item-control has-success']/label/span[@class='ant-checkbox']");
	private UIElement TXT_paidInAmount = new UIElement(
			"xpath=//*[@class='ant-row']/div[2]/p[text()='发生额(必填)']/following-sibling::div/div/div/input");
	private UIElement TXT_paidInTime = new UIElement(
			"xpath=//*[@class='ant-row']/div[3]/p[text()='入账日期(必填)']/following-sibling::div/div");
	private UIElement TXT_inputpaidInTime = new UIElement(
			"xpath=//*[@class='ant-calendar-date-input-wrap']/input[@placeholder='请选择日期']");
	private UIElement TXT_realPayer = new UIElement(
			"xpath=//*[@class='ant-row']/div[4]/p[text()='对方单位名称(必填)']/following-sibling::div/div/div/input");

	private UIElement BTN_clearOptions = new UIElement("xpath=//*[text()='清除选项']");
	private UIElement BTN_chooseFirstBuilding = new UIElement("xpath=//*[@class='list___2Hba-']/li[2]");
	private UIElement BTN_chooseSecondBuilding = new UIElement("xpath=//*[@class='list___2Hba-']/li[3]");

	private UIElement BTN_clickOnePaybill = new UIElement(
			"xpath=//ul[contains(@class,\"creams-table-scroll-main\")]/li[1]");
	private UIElement TXT_billInformation = new UIElement(
			"xpath=//*[@class='insideTitleBlock___yVc86' and text()='账单信息']");

	private UIElement TXT_roomInformation = new UIElement(
			"xpath=//*[@class='insideTitleBlock___yVc86' and text()='房源信息']");

	private UIElement TXT_incomeRecord = new UIElement("xpath=//*[@class='HeadStyle___6i65t']/span[text()='收支流水']");
	private UIElement TXT_invoicingRecords = new UIElement("xpath=//*[@class='HeadStyle___6i65t']/span[text()='开票记录']");
	private UIElement TXT_adjustmentAmount = new UIElement("xpath=//*[@class='HeadStyle___6i65t']/span[text()='调整']");

	private UIElement BTN_selectSettleStatus = new UIElement("xpath=//*[text()='结清状态']/i");
	private UIElement TXT_selectSettleStatus = new UIElement("xpath=//*[text()='结清状态']/i/parent::span");
	private UIElement BTN_selectNotSettled = new UIElement(
			"xpath=//*[@class='ant-dropdown-menu-item']/span[text()='未结清']");
	private UIElement BTN_sureOfSelectSettleStatus = new UIElement(
			"xpath=//*[@class='ant-checkbox-wrapper']/following-sibling::span[text()='未结清']/parent::li/parent::ul/following-sibling::div/a[text()='确定']");

	private UIElement BTN_createNewIncomeRecord = new UIElement(
			"xpath=//*[@class='Headbutton___3Ztjh']/button/span[text()='新 增']/parent::button");
	private UIElement TXT_collectionRecord = new UIElement("xpath=//*[@class='ant-modal-header']/div[text()='新建收支流水']");

	private UIElement BTN_selectCloseBillStatus = new UIElement(
			"xpath=//*[@class='ant-table-thead']/descendant::span[text()='关闭状态']/i");
	private UIElement BTN_selectNotCloseStatus = new UIElement(
			"xpath=//*[@class='ant-table-filter-dropdown']/descendant::span[text()='未关闭']/preceding-sibling::label");
	private UIElement BTN_sureOfSelectCloseStatus = new UIElement(
			"xpath=//*[@class='ant-table-filter-dropdown-btns']/a[@class='ant-table-filter-dropdown-link confirm' and text()='确定']");
	private UIElement BTN_closeBill = new UIElement(
			"xpath=//*[@class='ant-btn btn-group___20AnM']/span[text()='关闭账单']/parent::button");
	private UIElement TXT_inputReasonOfCloseBill = new UIElement("xpath=//*[@class='ant-modal-body']/div/textarea");
	private UIElement BTN_sureCloseBill = new UIElement(
			"xpath=//*[@class='ant-btn CreateBtn___2i_TR ant-btn-primary']/span[text()='确 定']/parent::button");

	private UIElement BTN_selectCloseStatus = new UIElement(
			"xpath=//*[@class='ant-table-filter-dropdown']/descendant::span[text()='已关闭']/preceding-sibling::label");
	private UIElement BTN_openBill = new UIElement(
			"xpath=//*[@class='ant-col-4']/div/button[@class='ant-btn btn-group___20AnM']/span[text()='开启账单']");
	private UIElement BTN_sureOpenBillAgain = new UIElement(
			"xpath=//*[@class='ant-confirm-btns']/button[@class='ant-btn ant-btn-primary ant-btn-lg']");

	private UIElement BTN_deleteBill = new UIElement("xpath=//*[@class='false iconLabelBtn___1try5' and text()='删除']");
	private UIElement TXT_checkPopupDeleteBillInformation = new UIElement(
			"xpath=//*[@class='ant-confirm-body']/span[text()='是否删除这条账单']");
	private UIElement BTN_sureOfDeleteBill = new UIElement(
			"xpath=//*[@class='ant-btn ant-btn-primary ant-btn-lg']/span[text()='确 定']/parent::button");

	private UIElement BTN_sureOfSubmitRecord = new UIElement(
			"xpath=//*[@class='ant-modal-footer']/button/span[text()='保 存']/parent::button");
	private UIElement TXT_checkForRecord = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='新建收支流水成功']");

	private UIElement TXT_outstandingBillForThisIssue = new UIElement(
			"xpath=//*[@class='active___xAvfg']/p[text()='本期未结清']");

	private UIElement TXT_closeStatusList = new UIElement(
			"xpath=//*[@class='scrollMain___2hOkJ scroll__main']/descendant-or-self::div[@class='scrollPart___3Sosj undefined']/descendant-or-self::span[text()='未关闭']");

	private UIElement BTN_billTypeOnList = new UIElement("xpath=//*[text()='费用类型']/i");
	private UIElement TXT_listOfBillType = new UIElement(
			"xpath=//*[@class='scrollMain___2hOkJ scroll__main']/descendant-or-self::div[@class='scrollPart___3Sosj undefined']/descendant-or-self::span[text()='租金']");

	private UIElement BTN_billSettlementStatus = new UIElement("xpath=//*[@class='ant-table-thead']/tr/th[11]/span/i");
	private UIElement BTN_notSettlementStatus = new UIElement(
			"xpath=//*[@class='ant-table-filter-dropdown']/ul/li/span[text()='未结清']");

	private UIElement BTN_settlementBill = new UIElement(
			"xpath=//*[@class='ant-btn btn-group___20AnM ant-btn-primary']/span[text()='结清账单']");
	private UIElement BTN_sureToSettlementBill = new UIElement(
			"xpath=//*[@class='ant-btn ant-btn-primary ant-btn-lg']/span[text()='确 定']");
	private UIElement TXT_searchPayer = new UIElement(
			"xpath=//*[@class='ant-input-search ant-input-affix-wrapper']/input");

	private UIElement BTN_selectBillType = new UIElement(
			"xpath=//*[@class='ant-table-thead']/tr/th/span[text()='账单类型']/i");
	private UIElement TXT_receivables = new UIElement("xpath=//*[@class='ant-dropdown-menu-item']/span[text()='收款']");
	private UIElement TXT_payment = new UIElement("xpath=//*[@class='ant-dropdown-menu-item']/span[text()='付款']");
	private UIElement BTN_sureOfSelectBillType = new UIElement(
			"xpath=//*[@class='ant-table-filter-dropdown-btns']/a[text()='确定']");
	private UIElement BTN_adjustment = new UIElement("xpath=//*[@class='ant-btn Headbutton___3Ztjh']/i/parent::button");
	private UIElement TXT_adjustmentAmountInput = new UIElement(
			"xpath=//*[@class='ant-input-number-input-wrap']/input");
	private UIElement TXT_adjustmentType = new UIElement("xpath=//*[@class='ant-select-selection__rendered']/div");
	private UIElement BTN_saveAdjustment = new UIElement(
			"xpath=//*[@class='ant-btn CreateBtn___2i_TR ant-btn-primary']");
	private UIElement BTN_sureOfAdjustmentSuccess = new UIElement(
			"xpath=//*[@class='souban-message-btn___u3mGi confirm___3zXXq']");

	private UIElement BTN_buttonOfCancelAdjustment = new UIElement(
			"xpath=//*[@class='ant-table-tbody']/tr[1]/td/i[@class='anticon anticon-delete']");
	private UIElement TXT_checkAdjustmentSuccess = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='新建调整金额成功']");

	private UIElement BTN_buttonBillNotes = new UIElement(
			"xpath=//*[@class='false iconLabelBtn___1try5' and text()='备注']");
	private UIElement TXT_inputBillNotes = new UIElement("xpath=//*[@type='textarea' and @placeholder='请填写备注']");
	private UIElement BTN_sureOfSaveBillNotes = new UIElement(
			"xpath=//*[@class='ant-btn markBtn___1PCAW']/span[text()='确 定']/parent::button");
	private UIElement TXT_checkBillNotesCreateSuccess = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='备注提交成功！']");
	private UIElement BTN_clickSureOfCreateSuccess = new UIElement(
			"xpath=//*[@class='souban-message-footer___3mG8K']/button[text()='确认']");

	private UIElement BTN_billMatchingIncome = new UIElement(
			"xpath=//*[@class='Headbutton___3Ztjh']/button/span[text()='匹 配']/parent::button");
	private UIElement BTN_oneOfIncomeOnMatchingList = new UIElement(
			"xpath=//*[@class='ant-modal-header']/following-sibling::div[@class='ant-modal-body']/descendant::tbody/tr[1]/td/span/label");
	private UIElement BTN_buttonMatchingForBill = new UIElement(
			"xpath=//*[@class='buttonWidth___l8B9I']/button/span[text()='匹 配']/parent::button");
	private UIElement BTN_saveMatchingForBill = new UIElement(
			"xpath=//*[@class='buttonWidth___l8B9I']/button/span[text()='保 存']/parent::button");
	private UIElement BTN_checkMatchingBillSuccess = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='匹配账单金额成功']");
	private UIElement BTN_receiveBill = new UIElement(
			"xpath=//*[@class='ant-dropdown-menu ant-dropdown-menu-vertical ant-dropdown-menu-light ant-dropdown-menu-root']/li[text()='收款账单']");
	private UIElement BTN_building = new UIElement("xpath=//a[text()='+ 房源']");

	public UIElement choosePayBillTypeOfCreateBill(String type) {
		return new UIElement(
				"xpath=//*[@class='ant-select-dropdown-menu ant-select-dropdown-menu-vertical  ant-select-dropdown-menu-root']/li[text()='"
						+ type + "']");
	}

	public UIElement buildingsInformation(String building) {
		return new UIElement(
				"xpath=//*[@class='message___2CWcK']/h3[text()='" + building + "']");
	}

	public UIElement chooseBillTypeOfList(String billtype) {
		return new UIElement("xpath=//*[@class='ant-table-filter-dropdown']/ul/li/span[text()='" + billtype + "']");
	}

	public UIElement createNewBillSuccess(String payer) {
		return new UIElement(
				"xpath=//*[text()='对方名称']/ancestor::div[@class='box___QQJi7']/descendant::ul/li[1]/ol/li/div[text()='"
						+ payer + "']");
	}

	public UIElement chooseAdjustmentType(String Adtype) {
		return new UIElement("xpath=//*[@class='ant-select-dropdown-menu-item' and text()='" + Adtype + "']");
	}

	private List<String> channelsDetails(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	private List<String> billType(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	public void clickButtonOfCreateNewBill() {
		this.driver.click(BTN_collectpayment);
		this.driver.sleep(1000);
		this.driver.refresh();
		this.driver.mouseOver(BTN_newBill);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_payBill, 5);

	}

	public void clickButtonOfCreateNewReceiveBill() {
		this.driver.click(BTN_collectpayment);
		this.driver.sleep(1000);
		this.driver.refresh();
		this.driver.mouseOver(BTN_newBill);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_receiveBill, 5);

	}

	public void inputPaymentBillInformation(String type, String starttime, String finishtime, String amount,
			String time, String payer, String building) {
		this.driver.sleep(1000);
		this.driver.click(TXT_billType);
		this.driver.sleep(1000);
		this.driver.click(choosePayBillTypeOfCreateBill(type));
		this.driver.click(TXT_billingCycle);
		this.driver.sleep(1000);
		this.driver.click(TXT_billingCycleFinishTime);
		this.driver.elementSendText(TXT_billingCycleFinishTime, finishtime);
		this.driver.elementSendText(TXT_billingCycleStartTime, starttime);
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_payAmount, amount);
		this.driver.click(TXT_payTime);
		this.driver.elementSendText(TXT_inputPayTime, time);
		this.driver.click(TXT_billRceciver);
		this.driver.elementSendText(TXT_billRceciver, payer);
		this.driver.click(BTN_building);
		this.driver.click(buildingsInformation(building));
		this.driver.sleep(2000);
		this.driver.click(BTN_chooseRoom);
	}

	public void inputReceiveBillInformation(String type, String starttime, String finishtime, String amount,
			String time, String payer, String building) {
		this.driver.sleep(1000);
		this.driver.click(TXT_billType);
		this.driver.sleep(1000);
		this.driver.click(choosePayBillTypeOfCreateBill(type));
		this.driver.click(TXT_billingCycle);
		this.driver.sleep(1000);
		this.driver.click(TXT_billingCycleFinishTime);
		this.driver.elementSendText(TXT_billingCycleFinishTime, finishtime);
		this.driver.elementSendText(TXT_billingCycleStartTime, starttime);
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_payAmount, amount);
		this.driver.click(TXT_payTime);
		this.driver.elementSendText(TXT_inputPayTime, time);
		this.driver.click(TXT_billPayer);
		this.driver.elementSendText(TXT_billPayer, payer);
		this.driver.click(BTN_building);
		this.driver.click(buildingsInformation(building));
		this.driver.sleep(2000);
		this.driver.click(BTN_chooseRoom);
	}

	public void submitNewBill() {
		this.driver.sleep(2000);
		this.driver.click(BTN_sureSaveBill);
		this.driver.sleep(1000);

	}

	public boolean checkCreateNewBillSuccess(String payer) {
		this.driver.sleep(2000);
		this.driver.click(BTN_clearOptions);
		return this.driver.isElementFound(createNewBillSuccess(payer));
	}

	public void clickAddPaymentRecord() {
		this.driver.click(BTN_addPaymentRecord);
	}

	public void inputPaymentRecordInformation(String realamount, String realtime, String realpayer) {
		this.driver.elementSendText(TXT_paidInAmount, realamount);
		this.driver.click(TXT_paidInTime);
		this.driver.elementSendText(TXT_inputpaidInTime, realtime);
		this.driver.click(TXT_realPayer);
		this.driver.elementSendText(TXT_realPayer, realpayer);
	}

	public void chooseAnotherBuilding(String building) {
		this.driver.click(buildingsInformation(building));
		this.driver.sleep(2000);
		this.driver.click(BTN_chooseRoom);
	}

	public void checkBillInTwoBuildings(String payer) {
		this.driver.sleep(2000);
		this.driver.click(BTN_clearOptions);
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseFirstBuilding);
		Assert.assertThat(this.driver.isElementFound(createNewBillSuccess(payer)), Is.is(true));
		this.driver.sleep(1000);
		this.driver.click(BTN_clearOptions);
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseSecondBuilding);
		Assert.assertThat(this.driver.isElementFound(createNewBillSuccess(payer)), Is.is(true));
	}

	// 账单详情
	public void clickPaymentbills() {
		this.driver.click(BTN_collectpayment);
		this.driver.refresh();
		this.driver.sleep(1000);

	}

	public void enterDetailOfBill() {
		this.driver.waitClickable(BTN_clickOnePaybill, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_clickOnePaybill);

	}

	public void checkBillDetilInformation() {
		this.driver.sleep(1000);
		Assert.assertThat(this.driver.isElementFound(TXT_billInformation), Is.is(true));
		Assert.assertThat(this.driver.isElementFound(TXT_roomInformation), Is.is(true));
		Assert.assertThat(this.driver.isElementFound(TXT_incomeRecord), Is.is(true));
		Assert.assertThat(this.driver.isElementFound(TXT_invoicingRecords), Is.is(true));
		Assert.assertThat(this.driver.isElementFound(TXT_adjustmentAmount), Is.is(true));
	}

	public void chooseOneNotSettledBill() {
		this.driver.waitAndClick(BTN_clearOptions, 5);
		this.driver.sleep(1000);
		this.driver.waitForElement(BTN_selectSettleStatus, 5);
		this.driver.sleep(2000);
		this.driver.MoveToElement(TXT_selectSettleStatus);
		this.driver.waitClickable(BTN_selectSettleStatus, 5);
		this.driver.click(BTN_selectSettleStatus);
		this.driver.waitClickable(BTN_selectNotSettled, 5);
		this.driver.click(BTN_selectNotSettled);
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfSelectSettleStatus);

	}

	public void clickButtonOfAddRecord() {
		this.driver.sleep(1000);
		this.driver.click(BTN_createNewIncomeRecord);
	}

	public boolean checkPopupCollectionRecord() {
		this.driver.sleep(1000);
		return this.driver.isElementFound(TXT_collectionRecord);
	}

	public void clickCloseBillButton(String reason) {
		this.driver.sleep(1000);
		this.driver.click(BTN_closeBill);
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_inputReasonOfCloseBill, reason);
	}

	public void clickSureToCloseBill() {
		this.driver.click(BTN_sureCloseBill);
	}

	public void chooseOneCloseBill() {
		this.driver.click(BTN_selectCloseBillStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_selectCloseStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfSelectCloseStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_clickOnePaybill);
	}

	public void clickOpenBillButton() {
		this.driver.sleep(1000);
		this.driver.click(BTN_openBill);
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOpenBillAgain);
	}

	public boolean checkBillWasOpen() {
		return this.driver.isElementFound(BTN_openBill);
	}

	public boolean checkPermissionOfDeleteBill() {
		return this.driver.isElementFound(BTN_deleteBill);
	}

	public void searchPayer() {
		this.driver.isElementFound(TXT_searchPayer);
	}

	public void clickDeleteBillButton() {
		this.driver.sleep(1000);
		this.driver.click(BTN_deleteBill);
	}

	public boolean checkPopupDeleteBill() {
		this.driver.sleep(1000);
		return this.driver.isElementFound(TXT_checkPopupDeleteBillInformation);
	}

	public void clickSureToDeleteBill() {
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfDeleteBill);
	}

	public boolean checkForsubmitRecord() {
		this.driver.click(BTN_sureOfSubmitRecord);
		this.driver.sleep(1000);
		return this.driver.isElementFound(TXT_checkForRecord);
	}

	public void OnCollectPaymentPage() {
		this.driver.click(BTN_collectpayment);
	}

	public boolean checkDefaultBills() {
		return this.driver.isElementFound(TXT_outstandingBillForThisIssue);
	}

	public void chooseBillOfCloseStatus() {
		this.driver.click(BTN_clearOptions);
		this.driver.sleep(1000);
		this.driver.click(BTN_selectCloseBillStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_selectNotCloseStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfSelectCloseStatus);
	}

	public List<String> closeStatusList() {// 获取列表
		this.driver.sleep(1000);
		return this.channelsDetails(TXT_closeStatusList);
	}

	public void chooseBillType(String billtype) {
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_clearOptions, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_billTypeOnList);
		this.driver.sleep(1000);
		this.driver.click(chooseBillTypeOfList(billtype));
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfSelectCloseStatus);
	}

	public List<String> billTypeList() {// 获取列表
		this.driver.sleep(1000);
		return this.billType(TXT_listOfBillType);
	}

	public void clickOnNotSettlementBillPage() {
		this.driver.sleep(1000);
		this.driver.click(BTN_clearOptions);
		this.driver.sleep(1000);
		this.driver.click(BTN_billSettlementStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_notSettlementStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfSelectCloseStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_clickOnePaybill);
	}

	public void clickButtonOfSettlement() {
		this.driver.sleep(1000);
		this.driver.click(BTN_settlementBill);

	}

	public void clickSureToSettlementBill() {
		this.driver.sleep(1000);
		this.driver.click(BTN_sureToSettlementBill);
	}

	public void selectReceivablesBillOnlist() {
		this.driver.sleep(1000);
		this.driver.click(BTN_clearOptions);
		this.driver.sleep(1000);
		this.driver.click(BTN_selectBillType);
		this.driver.sleep(1000);
		this.driver.click(TXT_receivables);
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfSelectBillType);
		this.driver.sleep(1000);
		this.driver.MoveToElement(TXT_selectSettleStatus);
		this.driver.waitClickable(BTN_selectSettleStatus, 5);
		this.driver.click(BTN_selectSettleStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_selectNotSettled);
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfSelectSettleStatus);
	}

	public void adjustmentAmount(String Adamount, String Adtype) {
		this.driver.sleep(1000);
		this.driver.click(BTN_adjustment);
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_adjustmentAmountInput, Adamount);
		this.driver.click(TXT_adjustmentType);
		this.driver.sleep(1000);
		this.driver.click(chooseAdjustmentType(Adtype));
		this.driver.sleep(1000);
		this.driver.click(BTN_saveAdjustment);
	}

	public void checkAdjustmentbillsuccessful() {
		Assert.assertThat(this.driver.isElementFound(TXT_checkAdjustmentSuccess), Is.is(true));
		this.driver.click(BTN_clickSureOfCreateSuccess);

	}

	public void selectPaymentBillOnlist() {
		this.driver.sleep(2000);
		this.driver.waitAndClick(BTN_clearOptions, 5);
		this.driver.sleep(2000);
		this.driver.click(BTN_selectBillType);
		this.driver.sleep(2000);
		this.driver.click(TXT_payment);
		this.driver.sleep(2000);
		this.driver.click(BTN_sureOfSelectBillType);
		this.driver.sleep(1000);
		this.driver.MoveToElement(TXT_selectSettleStatus);
		this.driver.waitClickable(BTN_selectSettleStatus, 5);
		this.driver.click(BTN_selectSettleStatus);
		this.driver.sleep(1000);
		this.driver.click(BTN_selectNotSettled);
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfSelectSettleStatus);
	}

	// 删除调整
	public void deleteAdjustment() {
		this.driver.sleep(1000);
		this.driver.click(BTN_buttonOfCancelAdjustment);
		this.driver.click(BTN_sureOfAdjustmentSuccess);
	}

	public void clickBillNotesButton() {
		this.driver.sleep(1000);
		this.driver.click(BTN_buttonBillNotes);
	}

	public void inputNotesInbillNotes(String notes) {
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_inputBillNotes, notes);
		this.driver.click(BTN_sureOfSaveBillNotes);
	}

	public void checkBillNotesCreateSuccessful() {
		Assert.assertThat(this.driver.isElementFound(TXT_checkBillNotesCreateSuccess), Is.is(true));
		this.driver.click(BTN_clickSureOfCreateSuccess);
	}

	public void billMatchingIncome() {
		this.driver.sleep(1000);
		this.driver.click(BTN_billMatchingIncome);
		this.driver.waitClickable(BTN_oneOfIncomeOnMatchingList, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_oneOfIncomeOnMatchingList);
		this.driver.click(BTN_buttonMatchingForBill);
		this.driver.sleep(1000);
		this.driver.click(BTN_saveMatchingForBill);
	}

	public void checkBillMatchingIncomeSuccess() {
		Assert.assertThat(this.driver.isElementFound(BTN_checkMatchingBillSuccess), Is.is(true));
		this.driver.click(BTN_clickSureOfCreateSuccess);
	}
}
