package com.souban.bdd.flows.CreamsAPP;

import static org.hamcrest.core.Is.is;

import com.souban.bdd.pages.CreamsAPP.CreamsAPPModifyPasswordPage;
import org.junit.Assert;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;


public class CreamsAPPModifyPasswordFlow {
	
	private CreamsAPPModifyPasswordPage creamsAPPModifyPasswordPage = null;
	
	public CreamsAPPModifyPasswordFlow(final Driver driver) {
		this.creamsAPPModifyPasswordPage = PageFactory.getPage(CreamsAPPModifyPasswordPage.class, driver);
	}
    
    //common
    //点击修改密码
	public void clickModifyPassword() {
		this.creamsAPPModifyPasswordPage.clickModifyPassword();
	}
	
	//common
	//断言，是否成功进入修改密码页
	public void checkIntoModifyPasswordPage() {
		Assert.assertThat(this.creamsAPPModifyPasswordPage.checkIntoModifyPasswordPage(), is(true));
	}
	
	//common
	//输入原密码
	public void inputOldPassword(String oldPassword) {
		this.creamsAPPModifyPasswordPage.inputOldPassword(oldPassword);
	}
	
	//common
    //输入新密码
	public void inputNewPassword(String newPassword) {
		this.creamsAPPModifyPasswordPage.inputNewPassword(newPassword);
	}
	
	//common
	//输入确认新密码
	public void inputConfirmPassword(String confirmPassword) {
		this.creamsAPPModifyPasswordPage.inputConfirmPassword(confirmPassword);
	}
	
	//common
	//点击完成
	public void clickComplete() {
		this.creamsAPPModifyPasswordPage.clickComplete();
	}
	//回到我的主页
	public void backToMyPage() {
		Assert.assertThat(this.creamsAPPModifyPasswordPage.backToMyPage(), is(true));
	}
	
	//common
	//点击返回
	public void clickReturn() {
		this.creamsAPPModifyPasswordPage.clickReturn();
	}
	
	//common
	//断言，密码是否修改成功
	public void checkModifyPasswordSuccessful() {
		Assert.assertThat(this.creamsAPPModifyPasswordPage.checkModifyPassword(), is(true));
		System.out.println("密码修改成功");
	}
	
	//common
	//断言，密码是否修改失败
	public void checkModifyPasswordFail() {
		Assert.assertThat(this.creamsAPPModifyPasswordPage.checkModifyPassword(), is(false));
		System.out.println("密码修改失败");
	}
	
	//common
	//断言，密码是否重置成功
	public void checkResetPasswordSuccessful() {
		Assert.assertThat(this.creamsAPPModifyPasswordPage.checkResetPassword(), is(true));
	}
}
