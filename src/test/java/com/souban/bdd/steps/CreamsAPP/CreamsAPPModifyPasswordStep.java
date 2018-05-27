package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPModifyPasswordStep extends BaseStep{
	/**
	 * 修改密码与重置密码
	 * @throws Throwable
	 */
	//common
	//点击修改密码
	@When("^点击修改密码$")
	public void 点击修改密码() throws Throwable {
	    this.creamsAPPModifyPasswordFlow.clickModifyPassword();
	    this.creamsAPPModifyPasswordFlow.checkIntoModifyPasswordPage();
	}
	//common
	//填写原密码
	@When("^填写原密码 \"([^\"]*)\"$")
	public void 填写原密码(String oldPassword) throws Throwable {
	   this.creamsAPPModifyPasswordFlow.inputOldPassword(oldPassword);
	}
	//common
	//填写新密码
	@When("^填写新密码 \"([^\"]*)\"$")
	public void 填写新密码(String newPassword) throws Throwable {
	   this.creamsAPPModifyPasswordFlow.inputNewPassword(newPassword);
	}
	//common
	//填写确认新密码
	@When("^填写确认新密码 \"([^\"]*)\"$")
	public void 填写确认新密码(String confirmPassword) throws Throwable {
	    this.creamsAPPModifyPasswordFlow.inputConfirmPassword(confirmPassword);
	}
	//common
	//点击修改密码页的完成
	@When("^点击修改密码页的完成$")
	public void 点击修改密码页的完成() throws Throwable {
	    this.creamsAPPModifyPasswordFlow.clickComplete();
	    this.creamsAPPModifyPasswordFlow.backToMyPage();
	}
	//common
	//点击修改密码页的返回
	@When("^点击修改密码页的返回$")
	public void 点击修改密码页的返回() throws Throwable {
	    this.creamsAPPModifyPasswordFlow.clickReturn();
	}
	//common
	//使用原邮箱和新密码登录app
	@Then("^使用原邮箱 \"([^\"]*)\"和新密码 \"([^\"]*)\"登录$")
	public void 使用原邮箱_和新密码_登录(String email, String password) throws Throwable {
		this.creamsAPPLoginAndLogoutFlow.inputEmail(email);
		this.creamsAPPLoginAndLogoutFlow.inputPassword(password);
		this.creamsAPPLoginAndLogoutFlow.clickLogin();
	}
	//common
	//断言-密码修改成功
	@Then("^登录成功后，密码修改成功$")
	public void 登录成功后_密码修改成功() throws Throwable {
	   this.creamsAPPModifyPasswordFlow.checkModifyPasswordSuccessful();
	}
	//common
	//断言-密码重置成功
	@Then("^登录成功后，密码重置成功$")
	public void 登录成功后_密码重置成功() throws Throwable {
	    this.creamsAPPModifyPasswordFlow.checkResetPasswordSuccessful();
	}
	//common
	//断言-密码修改失败
	@Then("^登录失败后，密码修改失败$")
	public void 登录失败后_密码修改失败() throws Throwable {
	   this.creamsAPPModifyPasswordFlow.checkModifyPasswordFail();
	}
}
