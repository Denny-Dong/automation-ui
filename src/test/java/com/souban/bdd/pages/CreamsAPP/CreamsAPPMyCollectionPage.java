package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPMyCollectionPage extends ParentPage {

	public CreamsAPPMyCollectionPage(Driver driver) {
		super(driver);
	}

	//我的集合
	private UIElement TXT_myQuery = new UIElement(
			"xpath=//android.widget.TextView[@text='我的集合' and @resource-id='com.souban.creams.debug:id/myQueryTv']",
			"xpath=//*[@name='我的查询']"); // type,XCUIElementTypeStaticText
	//我的集合页面----断言
	private UIElement TXT_myQueryPage = new UIElement(
			"xpath=//android.widget.TextView[@text='我的集合' and @resource-id='com.souban.creams.debug:id/titleTv']",
			"xpath=//*[@name='我的查询']"); // type,XCUIElementTypeOther
	//新建我的集合
	private UIElement BTN_newMyQuery = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/addTv']",
			"xpath=//*[@name='我的查询']/XCUIElementTypeButton[2]"); // type,XCUIElementTypeOther
	//选择楼宇页面----断言
	private UIElement TXT_selectBuildingPage = new UIElement(
			"xpath=//android.widget.TextView[@text='选择楼宇']",
			"xpath=//*[@name='选择楼宇']"); // type,XCUIElementTypeStaticText
	//选择楼宇
	private UIElement BuildingUIElement(String buildingName) {
		return new UIElement(
				"xpath=//*[@resource-id='com.souban.creams.debug:id/buildingName' and @text='"+buildingName+"']",
				"xpath=//*[contains(@type,'XCUIElementTypeStaticText') and @name ='"+buildingName+"']");
	}
	//完成按钮
	private UIElement BTN_complete = new UIElement(
			"xpath=//android.widget.TextView[@text='完成' and @resource-id='com.souban.creams.debug:id/complete']",
			"xpath=//*[@name='完成']"); // type,XCUIElementTypeButton
	//取消按钮
	private UIElement BTN_navigation = new UIElement(
			"xpath=//android.widget.TextView[@text='选择楼宇']/preceding-sibling::android.widget.ImageButton[1]",
			"xpath=//*[@name='取消']"); // type,XCUIElementTypeButton
	//分组名称title-----断言
	private UIElement TXT_groupTitle = new UIElement(
			"xpath=//android.widget.TextView[@text='新建集合' and @resource-id='com.souban.creams.debug:id/titleTv']",
			"xpath=//*[@name='填写分组名称']"); // type,XCUIElementTypeStaticText
	//输入名称
	private UIElement INP_queryName = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/inputEt']",
			"xpath=//*[contains(@type,'XCUIElementTypeTextView')]");
	//点击确定按钮
	private UIElement BTN_confirm = new UIElement(
			"xpath=//android.widget.Button[@text='确定' and @resource-id='com.souban.creams.debug:id/makeSureBtn']",
			"xpath=//*[@name='确定']"); // type,XCUIElementTypeButton
	//断言
	//获取查询名称
	private UIElement MyQueryNameUIElement(String queryName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + queryName + "']",
				"xpath=//XCUIElementTypeImage[@name='Builing_Button_Room_Grey']/preceding-sibling::XCUIElementTypeStaticText[1][@name='"+queryName+"']");
	}
	//android获取楼盘数
	private UIElement BUildingCountUIElement(String queryName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='"+queryName+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/countTv']","");
	}
	//ios获取楼盘数
	private UIElement TXT_buildingCount = new UIElement(
			"",
			"xpath=//XCUIElementTypeImage[@name='Builing_Button_Room_Grey']/following-sibling::XCUIElementTypeStaticText[1]");
	//android，断言----进入是否删除这条查询
	private UIElement TXT_deletePage = new UIElement(
			"xpath=//android.widget.TextView[@text='确定要删除该集合吗?' and @resource-id='com.souban.creams.debug:id/messageTv']", "");
	//android，确定删除按钮
	private UIElement BTN_delete = new UIElement(
			"xpath=//android.widget.Button[@text='确定' and @resource-id='com.souban.creams.debug:id/makeSureBtn']",
			"xpath=//*[@name='删除']");
	//android，取消删除按钮
	private UIElement BTN_cancelDelete = new UIElement(
			"xpath=//android.widget.Button[@text='取消' and @resource-id='com.souban.creams.debug:id/cancelBtn']",
			"");
	//ios
	//private UIElement Tempelement = new UIElement("", "xpath=//XCUIElementTypeApplication[@name='CREAMS-调试']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther");
	//我的查询页面的返回按钮
	private UIElement BTN_back = new UIElement(
			"xpath=//android.widget.TextView[@text='我的集合']/preceding-sibling::android.widget.ImageButton[1]",
			"");
	
	
	/**
	 * 新建集合
	 */
	//common
	//点击我的查询
	public void clickMyQuery() {
		this.driver.waitAndClick(TXT_myQuery, 2);
	}

	//common
	//断言-----进入我的查询列表
	public boolean intoMyQueryPage() {
		return this.driver.waitForElement(TXT_myQueryPage, 2);
	}

	//common
	//点击新建查询按钮
	public void clickNewQueryButton() {
		this.driver.waitAndClick(BTN_newMyQuery, 2);
	}

	//common
	//断言-----进入选择楼宇页
	public boolean intoSelectBuild() {
		return this.driver.waitForElement(TXT_selectBuildingPage, 2);
	}

	//common
	//选择单个楼宇
	public void selectBuilding(String buildingName) {
		this.driver.waitAndClick(this.BuildingUIElement(buildingName), 2);
	}

	//common
	//选择多个楼宇
	public void selectMoreBuilding(String buildingName1, String buildingName2, String buildingName3) {
		this.driver.waitAndClick(this.BuildingUIElement(buildingName1), 2);
		this.driver.waitAndClick(this.BuildingUIElement(buildingName2), 2);
		this.driver.waitAndClick(this.BuildingUIElement(buildingName3), 2);
	}

	//common
	//点击完成按钮
	public void clickCompleteButton() {
		this.driver.waitAndClick(BTN_complete, 2);
	}

	//common
	//点击取消按钮
	public void clickNavigationButton() {
		this.driver.waitAndClick(BTN_navigation, 2);
	}

	//common
	//断言-----进入请输入分组名称页
	public boolean intoInputQueryNamePage() {
		return this.driver.waitForElement(TXT_groupTitle, 2);
	}

	//common
	//输入分组名称
	public void inputQueryName(String queryName) {
		this.driver.waitAndClick(INP_queryName, 2);
		this.driver.elementClearSendText(INP_queryName, queryName);
	}

	//common
	//点击确定按钮
	public void clickConfirmButton() {
		this.driver.waitAndClick(BTN_confirm, 2);
		this.driver.sleep(2000);
	}

	//common
	//断言----新建查询成功
	public boolean checkMyQuery(String queryName) {
		this.driver.sleep(2000);
		return this.driver.isElementFound(this.MyQueryNameUIElement(queryName));
	}

	//android
	//断言，获取楼数量
	public String checkBUildCountForAndroid(String queryName) {
		this.driver.waitForElement(this.BUildingCountUIElement(queryName), 2);
		return this.driver.elementGetText(this.BUildingCountUIElement(queryName));
	}

	//ios
	//断言，获取楼盘数
	public String checkBuildCountForIos() {
		this.driver.waitForElement(TXT_buildingCount, 2);
		return this.driver.elementGetText(TXT_buildingCount);
	}

	
	
	
	
	/**
	 * 删除我的查询
	 * @param queryName 集合名称
	 */
	//android
	//长按新建的查询
	public void longPress(String queryName) {
		this.driver.waitForElement(this.MyQueryNameUIElement(queryName), 1);
		this.driver.longPress(this.MyQueryNameUIElement(queryName));
	}

	/*
	public void swipeleft(String queryName, UIElement element) {
		this.driver.swipeScreen(queryName, element);
	}
	*/

	//ios
	//长按左滑新建的查询
	public void swipeleft(String queryName) {
		this.driver.swipeToUpToFindElement(this.MyQueryNameUIElement(queryName));
		this.driver.dragFromToForDuration(this.MyQueryNameUIElement(queryName), (double)1);
	}

	//android
	//断言，是否进入确定删除页
	public boolean intoDeletePage() {
		return this.driver.waitForElement(TXT_deletePage, 1);
	}

	//android
	//确定删除按钮
	public void clickDeleteButton() {
		this.driver.waitAndClick(BTN_delete, 1);
		this.driver.sleep(1000);
	}

	//common
	//取消删除按钮
	public void clickCancelDeleteButton() {
		this.driver.waitAndClick(BTN_cancelDelete, 1);
	}

	//common
	//回到我的主页
	public void backToMyPage() {
		this.driver.waitAndClick(BTN_back,2);
	}
}
