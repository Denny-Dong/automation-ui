package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPPersonalInformationStep extends BaseStep{
	/**
	 * 修改姓名和微信号
	 * @throws Throwable
	 */

	//点击个人信息进入个人信息页
	@When("^点击个人信息进入个人信息页$")
	public void 点击个人信息进入个人信息页() throws Throwable {
	    this.creamsAPPPersonalInformationFLow.clickPersonalInformation();
	    this.creamsAPPPersonalInformationFLow.intoPersonalInformationPage();
	}

	//点击姓名显示框进入修改姓名页
	@When("^点击姓名显示框进入修改姓名页$")
	public void 点击姓名显示框进入修改姓名页() throws Throwable {
	    this.creamsAPPPersonalInformationFLow.clickUserName();
	    this.creamsAPPPersonalInformationFLow.intoModifyUserNamePage();
	}

	//点击微信号显示框进入修改微信号页
	@When("^点击微信号显示框进入修改微信号页$")
	public void 点击微信号显示框进入修改微信号页() throws Throwable {
	    this.creamsAPPPersonalInformationFLow.clickWeChatNum();
	    this.creamsAPPPersonalInformationFLow.intoModifyWeChatPage();
	}

	//输入姓名
	@When("^输入姓名为 \"([^\"]*)\"$")
	public void 输入姓名为(String userName) throws Throwable {
	    this.creamsAPPPersonalInformationFLow.modifyUserName(userName);
	}

	//输入微信号
	@When("^输入微信号为 \"([^\"]*)\"$")
	public void 输入微信号为(String weChatNum) throws Throwable {
	    this.creamsAPPPersonalInformationFLow.modifyWeChatNum(weChatNum);
	}
	//coommon
	//点击修改姓名页的保存按钮
	@When("^点击修改姓名页的保存$")
	public void 点击修改姓名页的保存() throws Throwable {
	    this.creamsAPPPersonalInformationFLow.clickSave();
	}
	//coommon
	//点击修改微信号页的保存按钮
	@When("^点击修改微信号页的保存$")
	public void 点击修改微信号页的保存() throws Throwable {
	    this.creamsAPPPersonalInformationFLow.clickSave();
	}
	//coommon
	//断言-----核对姓名显示框
	@Then("^姓名输入框中的姓名改为 \"([^\"]*)\"，姓名修改成功$")
	public void 姓名输入框中的姓名改为_姓名修改成功(String userName) throws Throwable {
	    this.creamsAPPPersonalInformationFLow.modifyUserNameSUccessful(userName);
	}
	//coommon//coommon
	//断言-----核对微信显示框
	@Then("^微信号输入框中的微信号改为 \"([^\"]*)\"，微信号修改成功$")
	public void 微信号输入框中的微信号改为_微信号修改成功(String myWeChatNum) throws Throwable {
	    this.creamsAPPPersonalInformationFLow.modifyWeChatNumSuccessful(myWeChatNum);
	}
	//common
	//点击个人信息的返回按钮回到我的主页
	@Then("^点击个人信息页的返回按钮回到我的主页$")
	public void 点击个人信息页的返回按钮回到我的主页() throws Exception {
		this.creamsAPPPersonalInformationFLow.backToMyPage();
	}

	/**
	 * 修改手机号
	 */
	//点击手机号显示框
	@When("^点击手机号显示框$")
	public void 点击手机号显示框() throws Throwable {
		this.creamsAPPPersonalInformationFLow.clickTel();
	}
	//进入验证原号码页
	@Then("^进入验证原号码页$")
	public void 进入验证原号码页() throws Throwable {
		this.creamsAPPPersonalInformationFLow.intoModifyTel();
	}

}
