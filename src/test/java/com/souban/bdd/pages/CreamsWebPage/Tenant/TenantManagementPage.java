package com.souban.bdd.pages.CreamsWebPage.Tenant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class TenantManagementPage extends ParentPage {
	public TenantManagementPage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_tenantManagement = new UIElement("xpath=//*[text()='租客管理']");
	private UIElement BTN_ceateNewTenant = new UIElement("xpath=//*[text()=' 租客']/parent::button");
	private UIElement TXT_tenantNameInNewPage = new UIElement(
			"xpath=//*[text()='请填写姓名或公司']/following-sibling::ul/descendant::input");

	private UIElement BTN_clearTenantFilter = new UIElement("xpath=//*[text()='清除选项']");
	//
	// private UIElement BTN_deleteTenant = new UIElement(
	// "xpath=//*[@class='false iconLabelBtn___1try5 ant-dropdown-trigger']/i");
	//

	// 公用按钮
	private UIElement BTN_delete = new UIElement("xpath=//*[text()='删除']");
	private UIElement BTN_Confirm = new UIElement("xpath=//*[text()='确认']");

	private UIElement BTN_edit = new UIElement("xpath=//*[text()='编辑']");
	private UIElement BTN_save = new UIElement("xpath=//*[text()='保 存']/parent::button");

	private UIElement TXT_buildingNameOnTenantList = new UIElement(
			"xpath=//*[@class='scrollMain___1tnvs scroll__main creams-table-scroll-main']/li/ol/li[2]");
	//
	private UIElement TXT_tenantDetilInformation = new UIElement("xpath=//*[text()='租客详细信息']");

	private UIElement TXT_editTenantSuccess = new UIElement("xpath=//*[text()='保存成功']");
	//
	private UIElement TXT_alertDeleteTenantSuccess = new UIElement("xpath=//*[text()='该租客不存在']");
	//
	private UIElement BTN_tenantDetilCreateLeaseContract = new UIElement(
			"xpath=//div[text()='租赁合同']/preceding-sibling::button");
	//
	private UIElement BTN_buttonOfNewRoomOnContract = new UIElement("xpath=//*[text()='+ 房源']");
	private UIElement TXT_chooseRoomOnCreateNewContract = new UIElement(
			"xpath=//*[@class='list___3AoYL canInvest']/li[1]/descendant::input");
	private UIElement BTN_nextButton = new UIElement("xpath=//*[text()='下一步']/parent::button");
	private UIElement TXT_inputDeposit = new UIElement("xpath=//*[@placeholder='请填写押金']");
	private UIElement TXT_inputPrice = new UIElement("xpath=//*[@placeholder='请填写基础单价']");
	private UIElement BTN_getRentDetails = new UIElement("xpath=//*[text()='点击生成租金明细']/parent::button");
	// 发起审核
	private UIElement BTN_submitApproval = new UIElement("xpath=//*[text()='保存 & 发起审批']/parent::button");
	//
	private UIElement BTN_tenantDetilCreatePropertyContract = new UIElement(
			"xpath=//div[text()='物业合同']/preceding-sibling::button");
	private UIElement TXT_inputPayType = new UIElement("xpath=//input[@id='property_intervalMonth_exist-0']");
	private UIElement TXT_inputAdvancePayDate = new UIElement("xpath=//*[@placeholder='付款月的几号']");
	private UIElement BTN_getPropertyDetails = new UIElement("xpath=//*[text()='点击生成物业费明细']/parent::button");
	//
	private UIElement BTN_viewBusinessInformation = new UIElement("xpath=//*[text()='查看工商信息']/parent::button");
	// 返回icon
	private UIElement BTN_returnDetails = new UIElement(
			"xpath=//i[@class='creamsicon_17 backArrow___1DRT5 leftBorder___3eEjH']");
	//成立日期，列表中的第一个
	private UIElement TXT_approvalDate =new UIElement("xpath=//ul[contains(@class,\"creams-table-scroll-main\")]/li[1]/ol[1]/li[6]");



	//
	private List<String> tenantDetails(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}
	//

	public UIElement TXT_tenantLabel(String label) {
		return new UIElement("xpath=//*[@class='crTagBox___3nIpQ']/div/div[text()='" + label + "']");
	}

	public UIElement TXT_tenantLabelOnList(String label) {
		return new UIElement(
				"xpath=//*[@class='box___QQJi7']/descendant::ul/li[1]/ol/li/descendant::div[text()='" + label + "']");
	}

	public UIElement TXT_tenantNameFromQiChaCha(String tenantName) {
		return new UIElement("xpath=//li[text()='" + tenantName + "']");

	}

	public UIElement TXT_tenantNameFromList(String tenantName) {
		return new UIElement("xpath=//ul[contains(@class,'creams-table-scroll-main')]/li[1]/ol/li[1]/div[text()='"+tenantName+"']");
	}

	public UIElement TXT_chooseOneBuilding(String building) {
		return new UIElement("xpath=//*[@class='title___1pxg0' and text()='" + building + "']");
	}

	public UIElement TXT_tenantNameOnLeaseContractPage(String tenantName) {
		return new UIElement("xpath=//*[@class='ant-select-search__field__wrap']/input[@value='" + tenantName + "']");
	}// 比较租客名称在租赁合同页面

	public UIElement TXT_chooseBuildingOnCreateNewContract(String building) {
		return new UIElement("xpath=//*[@class='message___2CWcK']/h3[text()='" + building + "']");
	}

	// 选择审批人按钮
	public UIElement BTN_chooseApprovaler(String approvaler) {
		return new UIElement(
				"xpath=//div[text()='人员列表']/following-sibling::div[1]/div/div[text()='" + approvaler + "']");
	}

	// 删除审批人按钮
	public UIElement BTN_deleteApprovaler(String approvaler) {
		return new UIElement("xpath=//div[text()='已选审批人']/following-sibling::div/div/div/div[text()='" + approvaler
				+ "']/../following-sibling::button");

	}

	// 仅提示信息
	public UIElement TXT_alertMessageSuccess(String message) {
		return new UIElement("xpath=//*[text()='" + message + "']");
	}

	// 提示加确定按钮
	public UIElement BTN_alertMessageFail(String message) {
		return new UIElement("xpath=//*[text()='" + message + "']/../following-sibling::div[1]/button");
	}

	public void enterTenantManagementPage() {
		this.driver.click(BTN_tenantManagement);
		this.driver.sleep(1000);
	}

	public void clickButtonOfCreateNewTenant() {
		this.driver.click(BTN_ceateNewTenant);
	}

	public void inputTenantNameInNewPage(String tenant, String tenantName) {
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_tenantNameInNewPage, tenant);
		this.driver.waitClickable(TXT_tenantNameFromQiChaCha(tenantName), 10);
		this.driver.sleep(1000);
		this.driver.click(TXT_tenantNameFromQiChaCha(tenantName));
	}

	public void saveTenant() {
		this.driver.sleep(2000);
		this.driver.click(BTN_save);

	}

	public void clearTenantFilter() {
		this.driver.sleep(3000);
		this.driver.click(BTN_clearTenantFilter);
		this.driver.sleep(2000);

	}

	public boolean checkTenantCreateSuccessful(String tenantName) {
		return this.driver.isElementFound(TXT_tenantNameFromList(tenantName));
	}

	//
	public void clickTenantDetil(String tenantName) {
		this.driver.sleep(5000);
		this.driver.click(TXT_tenantNameFromList(tenantName));
		this.driver.sleep(1000);
	}

	public void deleteTenant() {
		// this.driver.mouseOver(BTN_deleteTenant);
		this.driver.sleep(1000);
		this.driver.click(BTN_delete);
	}

	public void sureDeleteTenant() {
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
		this.driver.waitForElement(TXT_alertDeleteTenantSuccess, 5);
	}

	//
	public void chooseTenantLabel(String label) {
		this.driver.sleep(3000);
		this.driver.click(TXT_tenantLabel(label));
	}

	public boolean checkLabelInTenant(String label) {
		return this.driver.isElementFound(TXT_tenantLabelOnList(label));
	}

	//
	public void chooseOneBuilding(String building) {
		this.driver.click(TXT_chooseOneBuilding(building));
	}

	public List<String> tenantBuildingNameList() {
		this.driver.sleep(1000);
		return this.tenantDetails(TXT_buildingNameOnTenantList);
	}

	//
	public boolean checkTenantDetilInformation() {
		return this.driver.isElementFound(TXT_tenantDetilInformation);
	}

	//
	public void clickNewRentContract() {

		this.driver.click(BTN_tenantDetilCreateLeaseContract);
	}

	public void chooseOneRoomOnRentContract(String building) {
		this.driver.sleep(1000);
		this.driver.click(BTN_buttonOfNewRoomOnContract);
		this.driver.click(TXT_chooseBuildingOnCreateNewContract(building));
		this.driver.click(TXT_chooseRoomOnCreateNewContract);

	}

	public void clickNextStep() {
		this.driver.click(BTN_nextButton);
	}

	public void inputDepositAndPrice(String deposit, String price) {
		this.driver.elementSendText(TXT_inputDeposit, deposit);
		this.driver.elementSendText(TXT_inputPrice, price);
		this.driver.click(BTN_getRentDetails);
	}

	public void submitApprovalAboutRentContract() {
		this.driver.sleep(2000);
		// this.driver.click(BTN_submitApproval);保存&发起审核
		this.driver.click(BTN_save);// 保存
		this.driver.sleep(2000);
	}

	// 创建新物业合同
	public void clickNewPropertyContract() {
		this.driver.click(BTN_tenantDetilCreatePropertyContract);
	}

	// 补充押金、支付类型、提前付款时间、基础单价，生成物业明细
	public void inputDepositAndCreatePropertyDetil(String deposit, String payType, String advancePayDate,
			String price) {
		this.driver.sleep(2000);
		this.driver.elementSendText(TXT_inputDeposit, deposit);
		this.driver.elementClearText(TXT_inputPayType);
		this.driver.elementSendText(TXT_inputPayType, payType);
		this.driver.elementClearText(TXT_inputAdvancePayDate);
		this.driver.elementSendText(TXT_inputAdvancePayDate, advancePayDate);
		this.driver.elementClearText(TXT_inputPrice);
		this.driver.elementSendText(TXT_inputPrice, price);
		this.driver.click(BTN_getPropertyDetails);
	}

	// 补充押金，生成物业明细
	public void inputDepositAndCreateProperty(String deposit) {
		this.driver.sleep(2000);
		this.driver.elementSendText(TXT_inputDeposit, deposit);
		this.driver.click(BTN_getPropertyDetails);
	}

	// 点击查看工商信息
	public void clickViewBusinessInformation() {
		this.driver.sleep(1000);
		this.driver.click(BTN_viewBusinessInformation);
		this.driver.sleep(5000);
		this.driver.click(BTN_returnDetails);// 返回到租客详情页
	}

	// 点击编辑按钮
	public void clickEditTenant() {
		this.driver.sleep(1000);
		this.driver.click(BTN_edit);
	}

	// 提示编辑成功
	public void alertEditTenantSuccess() {
		this.driver.sleep(1000);
		this.driver.waitForElement(TXT_editTenantSuccess, 5);

	}

	// 保存&发起审核
	public void submitaApproval() {
		this.driver.sleep(1000);
		this.driver.click(BTN_submitApproval);
	}

	// 选择审批人
	public void chooseApprovaler(String approvaler) {
		this.driver.sleep(2000);
		this.driver.click(BTN_chooseApprovaler(approvaler));
	}

	// 删除审批人
	public void deleteApprovaler(String approvaler) {
		this.driver.sleep(2000);
		this.driver.click(new UIElement(
				"xpath=//div[text()='已选审批人']/following-sibling::div/div/div/div[text()='" + approvaler + "']/div"));
		this.driver.click(BTN_deleteApprovaler(approvaler));
	}

	// 确认
	public void clickSubmit() {
		this.driver.sleep(2000);
		this.driver.click(BTN_Confirm);
	}

	// 删除
	public void clickDelete() {
		this.driver.sleep(2000);
		this.driver.click(BTN_delete);
	}

	// 编辑
	public void clickEdit() {
		this.driver.sleep(2000);
		this.driver.click(BTN_edit);
	}

	// 提示加确认
	public void alertMessageFail(String message) {
		this.driver.sleep(1000);
		this.driver.click(BTN_alertMessageFail(message));
	}

	// 仅提示
	public void alertMessageSuccess(String message) {
		this.driver.sleep(2000);
		this.driver.waitForElement(TXT_alertMessageSuccess(message), 5);
	}

	//日期格式检查
	public boolean checkDateFormat(String q){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			format.parse(q);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}
	public boolean checkApprovalDate(){
		this.driver.MoveToElement(TXT_approvalDate);
		this.driver.sleep(1000);
		String date_string=this.driver.elementGetText(TXT_approvalDate);
		return checkDateFormat(date_string);


	}


}
