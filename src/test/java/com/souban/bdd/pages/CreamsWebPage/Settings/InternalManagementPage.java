package com.souban.bdd.pages.CreamsWebPage.Settings;

import java.io.File;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class InternalManagementPage extends ParentPage {
	public InternalManagementPage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_accountSettings = new UIElement("xpath=//*[text()='账户设置']/parent::a");
	private UIElement BTN_buttonReturn = new UIElement("xpath=//*[@class='navRight___2gSyl']/li[2]/a");
	// private UIElement BTN_createNewContract = new
	// UIElement("xpath=//*[text()='合同']/parent::button");
	private UIElement BTN_createNewKeyword = new UIElement("xpath=//*[text()='+ 新建自定义关键词']/parent::button");
	private UIElement TXT_inputNewKeyword = new UIElement("xpath=//*[@placeholder='请输入关键词名称']");
	private UIElement BTN_sure = new UIElement("xpath=//*[text()='确 定']/parent::button");
	private UIElement TXT_People = new UIElement("xpath=//*[@class='btn___2v-Wo ant-dropdown-trigger']");
	private UIElement TXT_keyword = new UIElement("xpath=//*[text()='自定义关键词']");
	private UIElement BTN_keywordOfContract = new UIElement("xpath=//*[text()='租赁合同']/parent::a");
	private UIElement INP_tenant = new UIElement("xpath=//*[text()='请填写姓名或公司']/../descendant::input");
	private UIElement BTN_sureDeleteKeyword = new UIElement(
			"xpath=//*[text()='取消']/preceding-sibling::button[text()='删除']");
	private UIElement BTN_keywordOfPropertyContract = new UIElement("xpath=//*[text()='物业合同']/parent::a");
	private UIElement TXT_inputDeposit = new UIElement("xpath=//*[@placeholder='请填写押金']");
	private UIElement BTN_getPropertyRentDetails = new UIElement("xpath=//*[text()='点击生成物业费明细']/parent::button");
	private UIElement BTN_editSellerInformation = new UIElement(
			"xpath=//*[@class='ant-table-tbody']/tr[1]/td/div/span[text()='编辑']");
	private UIElement BTN_inputSellersName = new UIElement("xpath=//*[@placeholder='请填写货物名称']");
	private UIElement BTN_saveSellersInformation = new UIElement("xpath=//span[text()='保 存']/parent::button");
	private UIElement BTN_deleteSellerInformation = new UIElement(
			"xpath=//*[@class='ant-table-tbody']/tr[1]/td/div/span[text()='删除']");
	private UIElement BTN_templateManagement = new UIElement("xpath=//span[text()='模板管理']");
	private UIElement BTN_contractTemplate = new UIElement("xpath=//span[text()='租赁合同模板']/parent::a");
	private UIElement BTN_newContractTemplate = new UIElement("xpath=//*[text()='\uE646']/parent::button");
	private UIElement BTN_uploadContractTemplate = new UIElement("xpath=//*[text()='上传合同模板']");
	private UIElement TXT_inputContractTemplateName = new UIElement(
			"xpath=//*[text()='合同模板名称']/parent::div/following-sibling::div/descendant::input");
	private UIElement BTN_upload = new UIElement("xpath=//*[@type='file']");
	private UIElement BTN_uploadSure = new UIElement("xpath=//*[text()='确认']");
	private UIElement BTN_firstContract = new UIElement("xpath=//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]");
	private UIElement BTN_print = new UIElement("xpath=//*[text()='打印']");
	private UIElement TXT_contractPrintSuccessful = new UIElement("xpath=//*[text()='合同生成完成']");
	private UIElement BTN_deleteTemplate = new UIElement("xpath=//*[text()='删除']");
	private UIElement BTN_propertyContractTemplate = new UIElement("xpath=//span[text()='物业模板']/parent::a");
	private UIElement BTN_uploadPropertyContractTemplate = new UIElement("xpath=//*[text()='上传物业合同模板']");
	private UIElement TXT_inputPropertyContractTemplateName = new UIElement(
			"xpath=//*[text()='物业合同模板名称']/parent::div/following-sibling::div/descendant::input");
	private UIElement BTN_propertyContractMangement = new UIElement("xpath=//*[text()='物业管理']");
	private UIElement BTN_noticeTemplate = new UIElement("xpath=//span[text()='通知单模板']/parent::a");
	private UIElement BTN_uploadNoticeTemplate = new UIElement("xpath=//*[text()='上传通知单模版']");
	private UIElement TXT_inputNoticeTemplateName = new UIElement(
			"xpath=//*[text()='通知单名称']/parent::div/following-sibling::div/descendant::input");
	//private UIElement TXT_receivePaymentPage=new UIElement("xpath=//*[text()='收付款']");
	private UIElement BTN_firstBillCheckBox = new UIElement(
			"xpath=//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]/descendant::input");
	private UIElement BTN_chooseNotice = new UIElement("xpath=//*[@title='通知单']");
	private UIElement BTN_ChooseCreateOneNotice = new UIElement("xpath=//*[text()='部分生成']");
	private UIElement TXT_noticeTemplateCreateSuccessful = new UIElement("xpath=//*[text()='模版生成成功！']");
	//　新增费用类型
	private UIElement BTN_customizebillTypePage = new UIElement("xpath=//*[text()='费用类型管理']/parent::a");
	private UIElement BTN_buttonCreateBillType = new UIElement("xpath=//*[text()='新增']/parent::button");
	private UIElement TXT_inputBillType = new UIElement("xpath=//*[@placeholder='请填写费用名称']");
	private UIElement TXT_customizePage = new UIElement("xpath=//*[text()='自定义管理']");
	//
	private UIElement BTN_firstBill = new UIElement("xpath=//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]");
	//租客标签
	private UIElement BTN_tenantLabelPage=new  UIElement("xpath=//span[text()='租客标签']/parent::a");
	private UIElement BTN_createNewLabel=new UIElement("xpath=//div[text()='租客标签']/button");
	private UIElement TXT_newLabelName=new UIElement("xpath=//input[@placeholder='请输入标签名称']");
	private UIElement BTN_yesForDeleteLabel=new UIElement("xpath=//*[text()='是']/parent::button");

	// 选择租客联想
	public UIElement BTN_tenantName(String tenantName) {
		return new UIElement("xpath=//li[text()='" + tenantName + "']");
	}

	public UIElement choosebuildingToCheckKeyword(String building) {
		return new UIElement("xpath=//*[text()='" + building + "']");
	}

	public UIElement checkkeywordName(String keyword) {
		return new UIElement("xpath=//*[text()='" + keyword + "']/parent::td");
	}

	// 关键词显示按钮
	public UIElement displayKeywordButton(String keyword) {
		return new UIElement(
				"xpath=//*[text()='" + keyword + "']/parent::tr/td[2]/descendant::input[@type='checkbox']");
	}

	// 关键词名称在租赁合同中显示
	public UIElement keywordNameOnContract(String keyword) {
		return new UIElement("xpath=//*[text()='" + keyword + "']");
	}

	// 关键词删除
	public UIElement buttonOfDeleteKeyword(String keyword) {
		return new UIElement("xpath=//*[text()='" + keyword + "']/parent::tr/td[2]/descendant::span[text()='删除']");
	}

	// 删除售方信息
	// public UIElement BTN_deleteSellerInformation(String sname) {
	// return new
	// UIElement("xpath=//*[text()='黄金进口']/following-sibling::td/div/span[text()='"
	// + sname + "']");
	// }

	// 检查合同模板生成
	private UIElement contractTemplateNameOnList(String templatename) {
		return new UIElement("xpath=//*[text()='" + templatename + "']");
	}

	//
	private UIElement chooseContractTemplate(String templatename) {
		return new UIElement("xpath=//*[text()='" + templatename + "']/following-sibling::div[text()='生成合同']");
	}

	//
	private UIElement buttonOfMoreToDeleteTemplate(String templatename) {
		return new UIElement("xpath=//*[text()='" + templatename + "']/following-sibling::td/descendant::div[@title='更多']");
	}

	//生成并下载通知单模板
	private UIElement createNoticeTemplateAndDownLoad(String templatename) {
		return new UIElement("xpath=//*[text()='" + templatename + "']/parent::tr/descendant::a[text()='生成并下载']");
	}

	private UIElement newBillTypeOnList(String billtype) {
		return new UIElement("xpath=//*[text()='" + billtype + "']");
	}

	private UIElement billTypeOnDetil(String type) {
		return new UIElement("xpath=//p[text()='" + type + "']");
	}
	private UIElement editTenantName(String labelname){
		return new UIElement("xpath=//*[text()='" + labelname + "']/parent::tr/td/div/div[text()='编辑']");
	}
	private UIElement deleteTenantName(String labelname){
		return new UIElement("xpath=//*[text()='" + labelname + "']/parent::tr/td/div/div[text()='删除']");
	}


	// 进入账户设置页面
	public void enterAccountSettingsPage() {
		this.driver.click(BTN_accountSettings);
	}

	public void returnInternalManagementPage() {
		this.driver.click(BTN_buttonReturn);
	}

	// 新增租赁合同添加关键词并在内部管理检查
	public void inputTenantName(String tenantName) {
		this.driver.elementSendText(INP_tenant, tenantName);
		this.driver.waitClickable(BTN_tenantName(tenantName), 5);
		this.driver.click(BTN_tenantName(tenantName));
	}

	public void createNewKeywordOnContract(String keyword) {
		this.driver.click(BTN_createNewKeyword);
		this.driver.elementSendText(TXT_inputNewKeyword, keyword);
		this.driver.click(BTN_sure);
	}

	public void chooseBuildingKeywordOfContract(String building) {
		this.driver.click(TXT_People);
		this.driver.waitClickable(TXT_keyword, 5);
		this.driver.click(TXT_keyword);
		this.driver.waitClickable(TXT_keyword, 5);
		this.driver.click(TXT_keyword);
		this.driver.waitClickable(BTN_keywordOfContract, 5);
		this.driver.click(BTN_keywordOfContract);
		this.driver.click(choosebuildingToCheckKeyword(building));

	}

	public void checkBuildingKeyword(String keyword) {
		this.driver.isElementFound(checkkeywordName(keyword));
	}

	// 设置关键词不显示在租赁合同查看
	public void cancelDisplayOfKeyword(String keyword) {
		this.driver.click(displayKeywordButton(keyword));
	}

	public boolean checkKeywordNotExist(String keyword) {
		this.driver.sleep(1000);
		return this.driver.isElementFound(keywordNameOnContract(keyword));
	}

	// 删除关键词
	public void deleteKeywordOnContract(String keyword) {
		this.driver.click(buttonOfDeleteKeyword(keyword));
		this.driver.click(BTN_sureDeleteKeyword);
	}

	// 新增物业合同添加关键词并在内部管理检查
	public void inputDepositAndPrice(String deposit) {
		this.driver.elementSendText(TXT_inputDeposit, deposit);
		this.driver.click(BTN_getPropertyRentDetails);
	}

	public void chooseBuildingKeywordOfPropertyContract(String building) {
		this.driver.click(TXT_People);
		this.driver.waitClickable(TXT_keyword, 5);
		this.driver.click(TXT_keyword);
		this.driver.waitClickable(TXT_keyword, 5);
		this.driver.click(TXT_keyword);
		this.driver.waitClickable(BTN_keywordOfPropertyContract, 5);
		this.driver.click(BTN_keywordOfPropertyContract);
		this.driver.click(choosebuildingToCheckKeyword(building));

	}

	//
	public void deleteSellerInformation(String sname) {
		this.driver.waitClickable(BTN_deleteSellerInformation, 5);
	}

	public void sureToDeleteSellerInformation() {
		this.driver.waitClickable(BTN_sure, 5);
	}

	//
	public void editSellerInformation(String sname) {
		this.driver.click(BTN_editSellerInformation);
		this.driver.sleep(1000);
		this.driver.elementClearText(BTN_inputSellersName);
		this.driver.elementSendText(BTN_inputSellersName, sname);
		this.driver.click(BTN_saveSellersInformation);
	}

	// 合同模板页面
	public void createNewContractTamplate() {
		this.driver.click(BTN_templateManagement);
		this.driver.waitClickable(BTN_contractTemplate, 5);
		this.driver.click(BTN_contractTemplate);
	}

	// 输入合同模板名称
	public void inputContractTamplateName(String templatename) {

		this.driver.click(BTN_newContractTemplate);
		this.driver.waitClickable(BTN_uploadContractTemplate, 5);
		this.driver.click(BTN_uploadContractTemplate);
		this.driver.sleep(3000);
		this.driver.elementSendText(TXT_inputContractTemplateName, templatename);
	}

	// 上传合同模板
	public void uploadContractTamplate() {
		File file = new File("File/合同模板.docx");
		this.driver.elementSendText(BTN_upload, file.getAbsolutePath());
	}

	// 保存合同
	public void saveContractTamplate() {
		this.driver.waitClickable(BTN_saveSellersInformation, 5);
		this.driver.sleep(5000);
		this.driver.click(BTN_saveSellersInformation);
		this.driver.waitClickable(BTN_uploadSure, 5);
		this.driver.click(BTN_uploadSure);
	}

	//
	public boolean checkContractTamplateOnList(String templatename) {
		this.driver.sleep(1000);
		return this.driver.isElementFound(contractTemplateNameOnList(templatename));
	}

	//进入合同详情页
	public void enterContractDetil() {
		this.driver.waitClickable(BTN_firstContract, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_firstContract);
	}

	//打印合同
	public void clickPrintOfContract() {
		this.driver.waitClickable(BTN_print, 5);
		this.driver.click(BTN_print);
	}

	//选择模板进行打印
	public void contractTemplatePrint(String templatename) {
		this.driver.waitClickable(chooseContractTemplate(templatename), 5);
		this.driver.click(chooseContractTemplate(templatename));
	}

	//
	public boolean checkContractPrintSuccessful() {
		this.driver.sleep(20000);
		return this.driver.isElementFound(TXT_contractPrintSuccessful);
	}

	//删除模板
	public void clickDeleteTemplate(String templatename) {
		this.driver.sleep(10000);
		this.driver.click(buttonOfMoreToDeleteTemplate(templatename));
		this.driver.click(BTN_deleteTemplate);
		this.driver.click(BTN_sure);
	}

	public boolean checkTemplateDeleteSuccessful(String templatename) {
		return this.driver.isElementFound(contractTemplateNameOnList(templatename));
	}

	//输入物业合同模板名称
	public void inputPropertyContractTamplateName(String templatename) {
		this.driver.click(BTN_newContractTemplate);
		this.driver.waitClickable(BTN_uploadPropertyContractTemplate, 5);
		this.driver.click(BTN_uploadPropertyContractTemplate);
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_inputPropertyContractTemplateName, templatename);
	}

	//进入物业模版管理页面
	public void createNewPropertyContractTamplate() {
		this.driver.click(BTN_templateManagement);
		this.driver.waitClickable(BTN_propertyContractTemplate, 5);
		this.driver.click(BTN_propertyContractTemplate);
	}//物业管理页面

	public void enterPropertyContractMangement() {
		this.driver.click(BTN_propertyContractMangement);
	}

	//在通知单模板页面
	public void createNewNoticeTamplate() {
		this.driver.click(BTN_templateManagement);
		this.driver.waitClickable(BTN_noticeTemplate, 5);
		this.driver.click(BTN_noticeTemplate);
	}

	//输入通知单名称
	public void inputNoticeTamplateName(String templatename) {
		this.driver.click(BTN_newContractTemplate);
		this.driver.waitClickable(BTN_uploadNoticeTemplate, 5);
		this.driver.click(BTN_uploadNoticeTemplate);
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_inputNoticeTemplateName, templatename);
	}

	public void uploadNoticeTamplate() {
		this.driver.sleep(1000);
		File file = new File("File/CREAMS催缴单公共模板(币种).doc");
		this.driver.elementSendText(BTN_upload, file.getAbsolutePath());
	}

	//选中某一账单
	public void chooseOneBill() {
		this.driver.waitClickable(BTN_firstBillCheckBox, 5);
		this.driver.click(BTN_firstBillCheckBox);
	}

	//选择通知单催缴
	public void createNoticeTemplate(String templatename) {
		this.driver.click(BTN_chooseNotice);
		this.driver.waitClickable(BTN_ChooseCreateOneNotice, 5);
		this.driver.click(BTN_ChooseCreateOneNotice);
		this.driver.sleep(1000);
		this.driver.click(createNoticeTemplateAndDownLoad(templatename));
	}

	public boolean checkNoticeCreateSuccessful() {
		return this.driver.isElementFound(TXT_noticeTemplateCreateSuccessful);
	}

	//新增费用类型
	public void enterBillTypePage() {
		this.driver.waitClickable(TXT_customizePage, 5);
		this.driver.click(TXT_customizePage);
		this.driver.waitClickable(BTN_customizebillTypePage, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_customizebillTypePage);
	}

	public void createNewBillType(String billtype) {
		this.driver.sleep(1000);
		this.driver.click(BTN_buttonCreateBillType);
		this.driver.elementSendText(TXT_inputBillType, billtype);
		this.driver.click(BTN_saveSellersInformation);
	}

	public boolean checkBillTypeCreateSuccessful(String billtype) {
		return this.driver.isElementFound(newBillTypeOnList(billtype));
	}

	//
	public boolean checkBillTypeOnDetil(String type) {
		this.driver.waitClickable(BTN_firstBill, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_firstBill);
		this.driver.sleep(1000);
		return this.driver.isElementFound(billTypeOnDetil(type));
	}

	//
	public void deleteBillType(String keyword) {
		this.driver.click(buttonOfDeleteKeyword(keyword));
		this.driver.click(BTN_sure);
	}
	public boolean checkBillTypeDelete(String type){
	    this.driver.sleep(1000);
		return this.driver.isElementFound(newBillTypeOnList(type));
	}
	//新建租客标签
	public void enterTenantLabelPage(){
		this.driver.waitClickable(TXT_customizePage,5);
		this.driver.click(TXT_customizePage);
		this.driver.waitClickable(BTN_tenantLabelPage,5);
		this.driver.sleep(1000);
		this.driver.click(BTN_tenantLabelPage);
	}
	public void createNewTenantLabel(String label){
		this.driver.click(BTN_createNewLabel);
		this.driver.elementSendText(TXT_newLabelName,label);
		this.driver.click(BTN_saveSellersInformation);
	}
	public boolean checkTenantLabelOnList(String label){
		return this.driver.isElementFound(newBillTypeOnList(label));
	}
	//编辑租客标签
	public void editTenantLabel(String labelname,String label){
		this.driver.click(editTenantName(labelname));
		this.driver.sleep(3000);
		this.driver.elementClearText(TXT_newLabelName);
		this.driver.elementSendText(TXT_newLabelName,label);
		this.driver.click(BTN_saveSellersInformation);
	}
	//删除租客标签
	public void deleteTenantLabel(String label){
		this.driver.waitClickable(deleteTenantName(label),5);
		this.driver.click(deleteTenantName(label));
		this.driver.waitClickable(BTN_yesForDeleteLabel,5);
		this.driver.click(BTN_yesForDeleteLabel);
	}
	public boolean checkTenantLabelDelete(String label){
		this.driver.sleep(1000);
		return this.driver.isElementFound(newBillTypeOnList(label));
	}
}
