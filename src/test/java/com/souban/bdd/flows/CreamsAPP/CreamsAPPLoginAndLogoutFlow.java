package com.souban.bdd.flows.CreamsAPP;

import static org.hamcrest.core.Is.is;

import com.souban.bdd.pages.CreamsAPP.CreamsAPPLoginAndLogoutPage;
import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

public class CreamsAPPLoginAndLogoutFlow {

	private CreamsAPPLoginAndLogoutPage creamsAPPLoginAndLogoutPage = null;

	public CreamsAPPLoginAndLogoutFlow(final Driver driver) {
		this.creamsAPPLoginAndLogoutPage = PageFactory.getPage(CreamsAPPLoginAndLogoutPage.class, driver);
	}

	/**
	 * 登录APP
	 */
	//common
	//判断成功进入登录页
	public void intoLoginPage() {
		Assert.assertThat(this.creamsAPPLoginAndLogoutPage.intoLoginPage(), is(true));
	}

	//common
	//输入邮箱
	public void inputEmail(String email) {
		this.creamsAPPLoginAndLogoutPage.inputEmail(email);
	}

	//common
	//输入密码
	public void inputPassword(String password) {
		this.creamsAPPLoginAndLogoutPage.inputPassword(password);
	}

	//common
	//点击登录
	public void clickLogin() {
		this.creamsAPPLoginAndLogoutPage.clickLogin();
	}

	//common
	//判断登录成功
	public void checkLoginSuccessful() {
		Assert.assertThat(this.creamsAPPLoginAndLogoutPage.checkLoginSucessful(), is(true));
	}
	//common
	//退出CreamsAPP
	public  void logoutApp(){
		this.creamsAPPLoginAndLogoutPage.logoutApp();
	}


	/**
	 * 退出登录APP
	 */
	//common
	//点击我tab页进入我的主页
	public void clickMyTab() {
		this.creamsAPPLoginAndLogoutPage.clickMyTab();
	}
	//进入我的主页
	public void intoMyTab() {
		Assert.assertThat(this.creamsAPPLoginAndLogoutPage.intoMyTab(), is(true));
	}
	
	//common
	//点击设置按钮
	public void clickSetting() {
		this.creamsAPPLoginAndLogoutPage.clickSetting();
	}
	//进入设置页
	public void intoSettingPage() {
		Assert.assertThat(this.creamsAPPLoginAndLogoutPage.intoSettingPage(), is(true));
	}
	//common
	//点击退出登录
	public void clickLogout() {
		this.creamsAPPLoginAndLogoutPage.clickLogout();
	}
	//弹出退出弹窗
	public void intoLogoutWindows() {
		this.creamsAPPLoginAndLogoutPage.intoLogoutWindows();
	}

	//common
	//点击确认退出
	public void clickConfirm() {
		this.creamsAPPLoginAndLogoutPage.clickConfirm();
	}

	//common
	//点击取消
	public void clickCancel() {
		this.creamsAPPLoginAndLogoutPage.clickCancel();
	}

	//common
	//判断，成功退出
	public void logoutSuccessful() {
		Assert.assertThat(this.creamsAPPLoginAndLogoutPage.checkLogoutSuccessful(), is(true));
	}

	//common
	//判断，退出失败
	public void logoutFail() {
		Assert.assertThat(this.creamsAPPLoginAndLogoutPage.checkLogoutFail(), is(true));
	}
}
