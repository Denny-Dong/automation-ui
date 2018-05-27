package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPModifyPasswordPage extends ParentPage{

	public CreamsAPPModifyPasswordPage(Driver driver) {
		super(driver);
	}
	
	//修改密码 
	private UIElement TXT_modifyPassword = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/editPwdTv']",
			"xpath=//XCUIElementTypeStaticText[@name='修改密码']");
	//修改密码页
	private UIElement TXT_modifyPasswordPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/titleTv']",
			"xpath=//XCUIElementTypeOther[@name='修改密码']");
	//原密码
	private UIElement INP_oldPassword = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/oldPswEt']",
			"xpath=//XCUIElementTypeSecureTextField[@value='请输入原密码']");
	//新密码
	private UIElement INP_newPassword = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/newPswEt']",
			"xpath=//XCUIElementTypeSecureTextField[@value='请输入新密码']");
	//确认新密码
	private UIElement INP_confirmPassword = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/newPswCheckEt']",
			"xpath=//XCUIElementTypeSecureTextField[@value='请确认新密码']");
	//完成
	private UIElement BTN_complete = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/submitBt']",
			"xpath=//XCUIElementTypeButton[@name='完成']");
	//返回
	private UIElement BTN_back = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/am_right_tv']/preceding-sibling::android.widget.ImageButton",
			"xpath=//XCUIElementTypeButton[@name='App NavigationItem Back']");
	// 房源
	private UIElement TXT_building = new UIElement(
			"xpath=//android.widget.RadioButton[@text='楼宇']",
			"xpath=//XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/XCUIElementTypeOther[1]");
	
	
	/**
	 * 修改密码与重置密码，保证测试前后的测试环境一样
	 */
	//common
	//点击修改密码
	public void clickModifyPassword() {
		this.driver.waitAndClick(TXT_modifyPassword, 1);
	}
	//common
	//断言，是否成功进入修改密码页
	public boolean checkIntoModifyPasswordPage() {
		return this.driver.waitForElement(TXT_modifyPasswordPage, 1);
	}
	//common
	//输入原密码
	public void inputOldPassword(String oldPassword) {
		this.driver.elementClearSendText(INP_oldPassword, oldPassword);
	}
	//common
	//输入新密码
	public void inputNewPassword(String newPassword) {
		this.driver.elementClearSendText(INP_newPassword, newPassword);
	}
	//common
	//输入确认新密码
	public void inputConfirmPassword(String confirmPassword) {
		this.driver.elementClearSendText(INP_confirmPassword, confirmPassword);
	}
	//common
	//点击完成
	public void clickComplete() {
		this.driver.waitAndClick(BTN_complete, 1);
	}
	//回到我的主页
	public boolean backToMyPage() {
		return this.driver.waitForElement(TXT_modifyPassword, 2);
	}
	//common
	//点击返回
	public void clickReturn() {
		this.driver.waitAndClick(BTN_back, 1);
	}
	//common
	//断言，密码是否修改成功
	public boolean checkModifyPassword() {
		this.driver.sleep(2000);
		return this.driver.isElementFound(TXT_building);
	}
	//common
	//断言，密码是否重置成功
	public boolean checkResetPassword() {
		this.driver.sleep(2000);
		return this.driver.isElementFound(TXT_building);
	}
}
