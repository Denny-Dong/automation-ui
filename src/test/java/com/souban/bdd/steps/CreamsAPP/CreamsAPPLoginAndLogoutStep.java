package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPLoginAndLogoutStep extends BaseStep {
	/**
	 * 登录CreamsApp
	 * @throws Throwable
	 */
	//common
	//进入登录页
	@Given("^APP进入登录页$")
	public void app进入登录页() throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.intoLoginPage();
	}
	//common
	//输入邮箱
	@When("^输入邮箱 \"([^\"]*)\"$")
	public void 输入邮箱(String email) throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.inputEmail(email);
	}
	//common
	//输入密码
	@When("^输入密码 \"([^\"]*)\"$")
	public void 输入密码(String password) throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.inputPassword(password);
	}
	//common
	//点击登录页的登录按钮
	@When("^点击登录页的登录$")
	public void 点击登录页的登录() throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.clickLogin();
	}
	//common
	//断言-进入房源列表页
	@Then("^CreamsAPP登录成功，进入房源列表页$")
	public void creamsapp登录成功_进入房源列表页() throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.checkLoginSuccessful();
	}
	//common
	//退出CreamsAPP
	@Then("^退出CreamsAPP$")
	public void 退出creamsapp() throws Exception {
		this.creamsAPPLoginAndLogoutFlow.clickMyTab();
		this.creamsAPPLoginAndLogoutFlow.intoMyTab();
		this.creamsAPPLoginAndLogoutFlow.clickSetting();
		this.creamsAPPLoginAndLogoutFlow.intoSettingPage();
		this.creamsAPPLoginAndLogoutFlow.clickLogout();
		this.creamsAPPLoginAndLogoutFlow.intoLogoutWindows();
		this.creamsAPPLoginAndLogoutFlow.clickConfirm();
	}

	
	
	
	/**
	 * 退出登录
	 * @param email
	 * @param password
	 * @throws Throwable
	 */
	//common
	//输入邮箱和密码登录app
	@Given("^输入邮箱 \"([^\"]*)\"和密码 \"([^\"]*)\"成功登录CreamsAPP$")
	public void 输入邮箱_和密码_成功登录CreamsAPP(String email, String password) throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.intoLoginPage();
		this.creamsAPPLoginAndLogoutFlow.inputEmail(email);
		this.creamsAPPLoginAndLogoutFlow.inputPassword(password);
		this.creamsAPPLoginAndLogoutFlow.clickLogin();
		this.creamsAPPLoginAndLogoutFlow.checkLoginSuccessful();
	}
	//common
	//点击我进入我的主页
	@Given("^点击我进入我的主页$")
	public void 点击我进入我的主页() throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.clickMyTab();
		this.creamsAPPLoginAndLogoutFlow.intoMyTab();
	}
	//common
	//点击设置按钮进入设置页
	@When("^点击设置按钮进入设置页$")
	public void 点击设置按钮进入设置页() throws Exception {
	    this.creamsAPPLoginAndLogoutFlow.clickSetting();
	    this.creamsAPPLoginAndLogoutFlow.intoSettingPage();
	}
	//common
	//点击退出登录按钮
	@When("^点击退出登录$")
	public void 点击退出登录() throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.clickLogout();
		this.creamsAPPLoginAndLogoutFlow.intoLogoutWindows();
	}
	//common
	//点击确认退出
	@When("^点击确认退出$")
	public void 点击确认退出() throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.clickConfirm();
	}
	//common
	//点击取消按钮
	@When("^点击取消$")
	public void 点击取消() throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.clickCancel();
	}
	//common
	//断言-成功退出
	@Then("^CreamsAPP退出成功，回到登录页$")
	public void creamsapp退出成功_回到登录页() throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.logoutSuccessful();
	}
	//common
	//断言-退出失败
	@Then("^CreamsAPP退出失败，停留在设置页$")
	public void creamsapp退出失败_停留在设置页() throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.logoutFail();
	}
}
