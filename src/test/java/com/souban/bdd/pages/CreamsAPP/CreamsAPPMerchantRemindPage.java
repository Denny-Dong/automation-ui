package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPMerchantRemindPage extends ParentPage{

	public CreamsAPPMerchantRemindPage(final Driver driver) {
		super(driver);
	}
	
	//提醒
	private UIElement TXT_remind = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/remindTv']",
			"xpath=//XCUIElementTypeStaticText[@name='提醒']");
	//提醒页
	private UIElement TXT_remindPage = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='提醒']",
			"xpath=//XCUIElementTypeOther[@name='提醒']");
	//新建提醒按钮
	private UIElement BTN_addRemind = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/addIv']",
			"xpath=//XCUIElementTypeOther[@name='提醒']/following-sibling::XCUIElementTypeButton[1]");
	//新建提醒页
	private UIElement TXT_addRemindPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='新建提醒']",
			"xpath=//XCUIElementTypeOther[@name='新建提醒']");
	//选择日期
	private UIElement TXT_clickDate = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/dateTv' and @text='请选择日期']",
			"xpath=//XCUIElementTypeButton[@name='提醒']/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
	
	private UIElement BTN_confirm= new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/confirmTv' and @text='确认']",
			"xpath=//XCUIElementTypeButton[@name='确定']");
	//选择时间
	private UIElement TXT_clickTime = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/timeTv' and @text='请选择时间']",
			"xpath=//XCUIElementTypeButton[@name='提醒']/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]");
	//输入提醒内容
	private UIElement INP_remindContent = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/contentEt']",
			"xpath=//XCUIElementTypeButton[@name='提醒']/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]");
	//保存按钮
	private UIElement BTN_save = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/saveTv' and @text='保存']",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	//断言提醒内容
	public UIElement RemindContentUIElement(String content) {
		return new UIElement(
				"xpath=//*[@resource-id='com.souban.creams.debug:id/contentTv' and @text='"+content+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+content+"']");
	}
	
	//提醒列表的操作按钮
	public UIElement RemindMoreUIElement(String content) {
		return new UIElement(
				"xpath=//*[@text='"+content+"']/preceding-sibling::android.widget.ImageView[@resource-id='com.souban.creams.debug:id/moreIv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+content+"']/preceding-sibling::XCUIElementTypeButton[@name='Contract Button More']");
	}


	//编辑提醒
	//提醒列表的编辑按钮
	private UIElement BTN_remindEdit = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/editTv' and @text='编辑']",
			"xpath=//XCUIElementTypeStaticText[@name='编辑']");
	//编辑提醒页
	private UIElement TXT_remindEditPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='编辑提醒']",
			"xpath=//XCUIElementTypeOther[@name='编辑提醒']");


	//删除提醒
	//提醒列表的删除按钮
	private UIElement BTN_remindDelete = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/delTv' and @text='删除']",
			"xpath=//XCUIElementTypeStaticText[@name='删除']");
	//进入是否删除提醒页
	private UIElement TXT_deleteRemindPage = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/messageTv' and @text='确定要删除该条提醒吗？']",
			"xpath=//XCUIElementTypeStaticText[@name='确定要删除这条提醒吗?']");
	//确定删除按钮
	private UIElement BTN_sure = new UIElement(
			"xpath=//android.widget.Button[@resource-id='com.souban.creams.debug:id/makeSureBtn']",
			"xpath=//XCUIElementTypeButton[@name='确定']");



	//工作流-待办事项
	//工作流
	private UIElement BTN_workFlow = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/work_flow']",
			"xpath=//XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeOther[3]");
	//工作流页
	private UIElement TXT_workFlowPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/title' and @text='工作流']",
			"xpath=//XCUIElementTypeNavigationBar[@name='工作流']");
	//招商提醒
	private UIElement TXT_remindList = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/remindersTitleTv' and @text='招商提醒']",
			"xpath=//XCUIElementTypeStaticText[@name='招商提醒']");
	//招商提醒页
	private UIElement TXT_remindListPage = new UIElement(
			"xpath=//android.widget.TextView[@text='招商提醒']",
			"xpath=//XCUIElementTypeOther[@name='招商提醒']");
	//待办事项列表
	private UIElement TXT_matters_todo = new UIElement(
			"xpath=//android.widget.TextView[contains(@text,'待办事项')]",
			"xpath=//XCUIElementTypeStaticText[contains(@name,'待办事项')]");
	//客户名称
	private UIElement ClientNameUIElement(String clientName){
		return new UIElement(
				"xpath=//*[@resource-id='com.souban.creams.debug:id/clientNameTv' and @text='"+clientName+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+clientName+"']");
	}
	//楼宇名称
	private UIElement BuildingNameUIElement(String clientName){
		return  new UIElement(
				"xpath=//*[@text='"+clientName+"']/ancestor::android.widget.LinearLayout[2]/android.widget.TableLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/buildingNameTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+clientName+"']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[@name='楼宇名称']/following-sibling::XCUIElementTypeStaticText[1]");
	}
	//创建时间
	private UIElement CreateTimeUIElement(String clientName){
		return  new UIElement(
				"xpath=//*[@text='"+clientName+"']/ancestor::android.widget.LinearLayout[2]/android.widget.TableLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/createDateTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+clientName+"']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[@name='创建时间']/following-sibling::XCUIElementTypeStaticText[1]");
	}
	//提醒时间
	private UIElement RemindTimeUIElement(String clientName){
		return  new UIElement(
				"xpath=//*[@text='"+clientName+"']/ancestor::android.widget.LinearLayout[2]/android.widget.TableLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/remindDateTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+clientName+"']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[@name='提醒时间']/following-sibling::XCUIElementTypeStaticText[1]");
	}
	//提醒摘要
	private UIElement RemindAbstractUIElement(String clientName){
		return  new UIElement(
				"xpath=//*[@text='"+clientName+"']/ancestor::android.widget.LinearLayout[2]/android.widget.TableLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/remindAbstract']",
				"xpath=//XCUIElementTypeStaticText[@name='"+clientName+"']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[@name='提醒摘要']/following-sibling::XCUIElementTypeStaticText[1]");
	}

	//完成按钮
	private UIElement FinishUIElement(String clientName){
		return  new UIElement(
				"xpath=//*[@text='"+clientName+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/finishTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+clientName+"']/following-sibling::XCUIElementTypeButton[1]");
	}
	//确定完成页
	private UIElement TXT_finishPgee = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/messageTv' and @text='确定要标记为“已完成”吗？']",
			"xpath=//*[@name='确定要标注为“已完成”吗？']");
	//确定要标记为"已完成"吗的确定按钮
	private UIElement BTN_confirmFinish = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/makeSureBtn' and @text='确定']",
			"xpath=//*[@name='确定']");

	//已完事项
	private UIElement TXT_matters_down = new UIElement(
			"xpath=//android.widget.TextView[contains(@text,'已完事项')]",
			"xpath=//XCUIElementTypeStaticText[contains(@name,'已完事项')]");

	//删除按钮
	private UIElement BTN_delete = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/deleteIv']",
			"xpath=//XCUIElementTypeButton[@name='Workflow btn delete']");
	//确认删除页
	private UIElement TXT_deletePage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/messageTv' and @text='确定要删除该条提醒吗？']",
			"xpath=//*[@name='确定要删除该事项吗？']");

	//确定要删除该条提醒吗的确定按钮
	private UIElement BTN_confirmDelete = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/makeSureBtn' and @text='确定']",
			"xpath=//XCUIElementTypeButton[@name='确定']");





	/**
	 * 新建提醒
	 */
	//点击提醒
	public void clickRemind() {
		this.driver.waitAndClick(TXT_remind, 2);
	}
	//进入和回到提醒页
	public boolean intoRemindPage() {
		return this.driver.waitForElement(TXT_remindPage, 2);
	}
	//点击新建提醒按钮
	public void clickAddRemindButton() {
		this.driver.waitAndClick(BTN_addRemind, 2);
	}
	//进入新建提醒页
	public boolean intoAddRemindPage() {
		return this.driver.waitForElement(TXT_addRemindPage, 2);
	}
	//输入提醒日期
	public void clickDate() {
		this.driver.waitAndClick(TXT_clickDate, 2);
	}
	public boolean intoDate() {
		return this.driver.waitForElement(BTN_confirm, 2);
	}
	public void selectDate() {
		
	}
	public void saveDate() {
		this.driver.waitAndClick(BTN_confirm, 2);
	}
	//输入提醒时间
	public void clickTime() {
		this.driver.waitAndClick(TXT_clickTime, 2);
	}
	public boolean intoTime() {
		return this.driver.waitForElement(BTN_confirm, 2);
	}
	public void selectTime() {
		
	}
	public void saveTime() {
		this.driver.waitAndClick(BTN_confirm, 2);
	}
	//输入提醒内容
	public void inputRemindContent(String remindContent) {
		this.driver.elementClearSendText(INP_remindContent, remindContent);
	}
	//点击保存按钮
	public void clickSave() {
		this.driver.waitAndClick(BTN_save, 2);
	}
	//断言
	public boolean checkRemind(String content) {
		return this.driver.isElementFound(this.RemindContentUIElement(content));
	}
	
	
	
	/**
	 * 编辑提醒
	 */
	//进入页面会断言下该提醒存不存在:addRemindSuccessful()
	//点击提醒的更多按钮
	public void clickRemindMore(String content) {
		this.driver.waitAndClick(this.RemindMoreUIElement(content), 2);
	}
	//选择编辑
	public void clickRemindEdit() {
		this.driver.waitAndClick(BTN_remindEdit, 2);
	}
	//进入编辑页
	public boolean intoRemindEditPage() {
		return this.driver.waitForElement(TXT_remindEditPage, 2);
	}
	public void eidtRemindContent(String content) {
		this.driver.elementClearSendText(INP_remindContent, content);
	}
	//点击保存按钮:clickSave()
	//断言:addRemindSuccessful
	
	
	
	/**
	 * 删除提醒
	 */
	//选择删除
	public void clickRemindDelete() {
		this.driver.waitAndClick(BTN_remindDelete, 2);
	}

	//进入是否删除页
	public boolean intoDeleteRemindPage(){
		return this.driver.waitForElement(TXT_deleteRemindPage,2);
	}

	//确认删除
	public void clickSureButton(){
		this.driver.waitAndClick(BTN_sure,2);
		this.driver.sleep(2000);
	}



	/**
	 * 进入工作流待办事项核对内容
	 */
	public void clickWorkFlow(){
		this.driver.waitAndClick(BTN_workFlow,2);
	}

	public boolean intoWorkFlowPage(){
		return this.driver.waitForElement(TXT_workFlowPage,2);
	}

	public void clickRemindList(){
		this.driver.waitAndClick(TXT_remindList,2);
	}

	public boolean intoRemindListPage(){
		return this.driver.waitForElement(TXT_remindListPage,3);
	}

	public void clickMattersTo(){
		this.driver.waitAndClick(TXT_matters_todo,2);
	}

	public boolean checkIsRemind(String clientName){
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.driver.isElementFound(this.ClientNameUIElement(clientName));
	}

	public String checkRemindContent(String clientName){
		return this.driver.elementGetText(this.FinishUIElement(clientName))+","+this.driver.elementGetText(this.BuildingNameUIElement(clientName))
				+","+this.driver.elementGetText(this.CreateTimeUIElement(clientName))+","+this.driver.elementGetText(this.RemindTimeUIElement(clientName))
				+","+this.driver.elementGetText(this.RemindAbstractUIElement(clientName));
	}


	/**
	 * 在待办事项中点击完成按钮
	 */
	//点击完成按钮
	public void clickFinishButton(String clientName){
		this.driver.waitAndClick(this.FinishUIElement(clientName),2);
	}

	//进入确认完成页
	public boolean intoFinishPage(){
		return this.driver.waitForElement(TXT_finishPgee,2);
	}

	//点击确定要标记为"已完成"吗的确定按钮
	public void clickConfirmFinishButton(){
		this.driver.waitAndClick(BTN_confirmFinish,2);
	}

	//点击已完事项进入已完事项列表
	public void clickmattersDown(){
		this.driver.waitAndClick(TXT_matters_down,2);
	}

	//检查删除按钮
	public boolean checkIsDeleteButton(){
		return this.driver.waitForElement(BTN_delete,2);
	}

	//核对内容
	public String checkDownRemindContent(String clientName){
		return this.driver.elementGetText(this.BuildingNameUIElement(clientName)) +","+this.driver.elementGetText(this.CreateTimeUIElement(clientName))
				+","+this.driver.elementGetText(this.RemindTimeUIElement(clientName)) +","+this.driver.elementGetText(this.RemindAbstractUIElement(clientName));
	}


	/**
	 * 在已完事项中点击删除
	 */
	public void clickDeleteButton(){
		this.driver.waitAndClick(BTN_delete,2);
	}

	public boolean intoDeletePage(){
		return this.driver.waitForElement(TXT_deletePage,2);
	}

	public void clickConfirmDeleteButton(){
		this.driver.waitAndClick(BTN_confirmDelete,2);
	}
}
