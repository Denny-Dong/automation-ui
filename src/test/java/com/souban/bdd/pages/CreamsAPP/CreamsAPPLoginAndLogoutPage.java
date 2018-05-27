package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPLoginAndLogoutPage extends ParentPage {

	public CreamsAPPLoginAndLogoutPage(Driver driver) {
		super(driver);
	}

	//账号
	private UIElement INP_Account = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/accountEt']",
			"xpath=//XCUIElementTypeTextField[contains(@type,'XCUIElementTypeTextField')]");
	//密码
	private UIElement INP_password = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/pwdEt']",
			"xpath=//XCUIElementTypeSecureTextField[contains(@type,'XCUIElementTypeSecureTextField')]");
	//登录
	private UIElement BTN_login = new UIElement(
			"xpath=//*[@text='登录' and @resource-id='com.souban.creams.debug:id/confirmTv']",
			"xpath=//XCUIElementTypeButton[@name='登录']");
	//房源
	private UIElement TXT_building = new UIElement(
			"xpath=//android.widget.RadioButton[@text='楼宇']",
			"xpath=//XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/XCUIElementTypeOther[1]");

	
	
	//我
	private UIElement TXT_my = new UIElement(
			"xpath=//android.widget.RadioButton[@resource-id='com.souban.creams.debug:id/my']",
			"xpath=//XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeOther[4]");
	//设置
	private UIElement TXT_setting = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/settingTv']",
			"xpath=//XCUIElementTypeStaticText[@name='设置']");
	//退出登录
	private UIElement BTN_Logout = new UIElement(
			"xpath=//android.widget.TextView[@text='退出登录' and @resource-id='com.souban.creams.debug:id/logoutTv']",
			"xpath=//XCUIElementTypeButton[@name='退出登录']");
	//弹出弹窗
	private UIElement TXT_logoutWindows = new UIElement("xpath=//*[@text='退出CREAMS后，你将不再收到来自CREAMS的通知']","");
	//确认退出
	private UIElement BTN_confirmExit = new UIElement(
			"xpath=//android.widget.Button[@text='确认' and @resource-id='com.souban.creams.debug:id/confirmBtn']",
			"xpath=//XCUIElementTypeButton[@name='确认退出']");
	//取消退出
	private UIElement BTN_cancel = new UIElement(
			"xpath=//android.widget.Button[@text='取消' and @resource-id='com.souban.creams.debug:id/cancelBtn']",
			"xpath=//XCUIElementTypeButton[@name='取消']");
	
	/**
	 * 输入用户名和密码登录app
	 * @return 当返回值为true时，表示登录成功
	 */
	//common
	//判断是否进入登录页
	public boolean intoLoginPage() {
		return this.driver.waitForElement(INP_Account, 15);
	}
	//common
	//输入邮箱
	public void inputEmail(String email) {
		this.driver.elementClearSendText(INP_Account, email);
		//this.driver.hideKeyBoard();
	}
	//common
	//输入密码
	public void inputPassword(String password) {
		this.driver.elementClearSendText(INP_password, password);
		//this.driver.hideKeyBoard();
	}
	//common
	//点击登录按钮
	public void clickLogin() {
		this.driver.waitAndClick(BTN_login, 2);
	}
	//common
	//判断登录成功
	public boolean checkLoginSucessful() {
		this.driver.sleep(5000);
		return this.driver.waitForElement(TXT_building, 10);
	}

	//common
	//退出CreamsAPP
	public  void logoutApp(){
		this.driver.waitAndClick(TXT_my, 2);
		this.driver.waitAndClick(TXT_setting, 2);
		this.driver.waitAndClick(BTN_Logout, 2);
		this.driver.waitAndClick(BTN_confirmExit, 2);
	}

	
	
	
	
	/**
	 * 点击退出登录和确认退出后退出登录app
	 */
	//点击我tab页
	public void clickMyTab() {
		this.driver.waitAndClick(TXT_my, 2);
	}
	//进入我的主页
	public boolean intoMyTab() {
		return this.driver.waitForElement(TXT_setting, 2);
	}
	//点击设置按钮
	public void clickSetting() {
		this.driver.waitAndClick(TXT_setting, 2);
	}
	//进入设置页
	public boolean intoSettingPage() {
		return this.driver.waitForElement(BTN_Logout, 2);
	}
	//点击退出登录
	public void clickLogout() {
		this.driver.waitAndClick(BTN_Logout, 2);
	}
	//弹出退出弹窗
	public boolean intoLogoutWindows() {
		return this.driver.waitForElement(TXT_logoutWindows, 2);
	}
	//点击确认退出
	public void clickConfirm() {
		this.driver.waitAndClick(BTN_confirmExit, 2);
		this.driver.sleep(2000);
	}
	//点击取消
	public void clickCancel() {
		this.driver.waitAndClick(BTN_cancel, 2);
	}
	//断言，判断是否退出登录
	public boolean checkLogoutSuccessful() {
		return this.driver.waitForElement(INP_Account,2);
	}
	public boolean checkLogoutFail() {
		return this.driver.waitForElement(BTN_Logout, 2);
	}
}
