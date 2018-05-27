package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPPersonalInformationPage extends ParentPage{

	public CreamsAPPPersonalInformationPage(Driver driver) {
		super(driver);
	}

	//个人信息
	private UIElement TXT_personalInformation = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/editInfoTv']",
			"xpath=//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton");
	//个人信息页
	private UIElement TXT_personalInformationPage = new UIElement(
			"xpath=//*[@text='个人信息']",
			"xpath=//XCUIElementTypeOther[@name='个人信息']");
	//姓名显示框
	private UIElement TXT_userName = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/nameTv']",
			"xpath=//XCUIElementTypeStaticText[@name='姓名']/following-sibling::XCUIElementTypeStaticText[1]");
	//修改姓名入口
	private UIElement TXT_editName = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/nameEditIv']",
			"xpath=//XCUIElementTypeStaticText[@name='姓名']/following-sibling::XCUIElementTypeStaticText[1]");
	
	//微信号显示框和修改微信号入口
	private UIElement TXT_weChatNum = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/weChatTv']",
			"xpath=//XCUIElementTypeStaticText[@name='微信号']/following-sibling::XCUIElementTypeStaticText[1]") ;
	//手机号显示框和修改入口
	private UIElement TXT_editTel= new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/telTv']",
			"xpath=//XCUIElementTypeStaticText[@name='联系电话']/following-sibling::XCUIElementTypeStaticText[1]");
	//修改姓名页
	private  UIElement TXT_editNamePage = new UIElement(
			"xpath=//android.widget.TextView[@text='修改姓名']",
			"xpath=//XCUIElementTypeOther[@name='修改姓名']");
	//修改微信号页
	private  UIElement TXT_editWeChatPage = new UIElement(
			"xpath=//android.widget.TextView[@text='修改微信号']",
			"xpath=//XCUIElementTypeOther[@name='修改微信号']");
	//修改手机号页
	private UIElement TXT_editTelPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/titleTv' and @text='验证原号码']",
			"xpath=//XCUIElementTypeOther[@name='修改手机号']");
	//姓名输入框
	private UIElement INP_userName = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/valueTv']",
			"xpath=//XCUIElementTypeStaticText[@name='姓名']/following-sibling::XCUIElementTypeTextField[1]");
	//微信输入框
	private UIElement INP_weChatNum = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/valueTv']",
			"xpath=//XCUIElementTypeStaticText[@name='微信号']/following-sibling::XCUIElementTypeTextField[1]");
	
	//保存
	private UIElement BTN_save = new UIElement(
			"xpath=//android.widget.TextView[@text='保存' and @resource-id='com.souban.creams.debug:id/saveTv']",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	//个人信息页的返回按钮
	private UIElement BTN_back = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/backIv']",
			"xpath=//XCUIElementTypeButton[@name='App NavigationItem Back']");
	
	//common
	//点击个人信息
	public void clickPersonalInformation(){
		this.driver.waitAndClick(TXT_personalInformation, 2);
		this.driver.sleep(1000);
	}
	
	//common
	//断言----进入个人信息页
	public boolean intoPersonalInformationPage(){
		return this.driver.waitForElement(TXT_personalInformationPage, 3);
	}
	
	//common
	//点击姓名修改入口
	public void clickUserName(){
		this.driver.waitAndClick(TXT_editName, 2);
		this.driver.sleep(1000);
	}
	
	//common
	//点击微信号修改入口
	public void clickWeChatNum() {
		this.driver.waitAndClick(TXT_weChatNum, 2);
		this.driver.sleep(1000);
	}

	//点击修改手机号入口
	public void clickTel(){
		this.driver.waitAndClick(TXT_editTel,2);
		this.driver.sleep(1000);
	}
	
	//common
	//断言-----进入修改姓名页
	public boolean intoModifyUserNamePage() {
		return this.driver.waitForElement(TXT_editNamePage, 2);
    }
	
	//common
	//断言----进入修改微信号页
	public boolean intoModifyWeChatNumPage() {
		return this.driver.waitForElement(TXT_editWeChatPage, 2);
	}

	//断言---进入修改手机号页
	public boolean intoModifyTelPage(){
		return this.driver.waitForElement(TXT_editTelPage,2);
	}
	
	//common
	//修改姓名
	public void ModifyUserName(String userName) {
		this.driver.waitForElement(INP_userName, 2);
		this.driver.elementClearSendText(INP_userName, userName);
	}
	
	//common
	//修改微信号
	public void modifyWeChatNum(String weChatNum) {
		this.driver.waitForElement(INP_weChatNum, 2);
		this.driver.elementClearSendText(INP_weChatNum, weChatNum);
	}
	
	//common
	//点击保存
	public void clickSaveButton() {
		this.driver.waitAndClick(BTN_save, 2);
		this.driver.sleep(2000);
	}
	
	//common
	//断言----获取姓名显示框中的值
	public String checkModifyUserName() {
		return this.driver.elementGetText(TXT_userName);
	}
	
	//common
	//断言----获取微信号显示框中的值
	public String checkModifyWeChatNum() {
		return this.driver.elementGetText(TXT_weChatNum);
	}

	//common
	//点击个人信息的返回按钮回到我的主页
	public void backToMyPage(){
		this.driver.waitAndClick(BTN_back,2);
	}

}