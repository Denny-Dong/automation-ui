package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.pages.CreamsAPP.CreamsAPPPersonalInformationPage;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

public class CreamsAPPPersonalInformationFlow {
	
	private CreamsAPPPersonalInformationPage creamsAPPPersonalInformationPage = null;
	
	public CreamsAPPPersonalInformationFlow(final Driver driver) {
		this.creamsAPPPersonalInformationPage = PageFactory.getPage(CreamsAPPPersonalInformationPage.class, driver);
	}
	
	//common
	//点击个人信息
	public void clickPersonalInformation() {
		this.creamsAPPPersonalInformationPage.clickPersonalInformation();
	}
	
	//common
	//断言----进入个人信息页
	public void intoPersonalInformationPage() {
		Assert.assertThat(this.creamsAPPPersonalInformationPage.intoPersonalInformationPage(), is(true));
	}
	
	//common
	//点击姓名显示框
	public void clickUserName() {
		this.creamsAPPPersonalInformationPage.clickUserName();
	}
	
	//common
	//点击微信号显示框
	public void clickWeChatNum() {
		this.creamsAPPPersonalInformationPage.clickWeChatNum();
	}

	//点击手机号显示框
	public void clickTel(){
		this.creamsAPPPersonalInformationPage.clickTel();
	}
	
	//common
	//断言-----进入修改姓名页
	public void intoModifyUserNamePage() {
		Assert.assertThat(this.creamsAPPPersonalInformationPage.intoModifyUserNamePage(), is(true));
		//System.out.println("成功进入修改姓名页");
	}
	
	//common
	//断言-----进入修改微信号页
	public void intoModifyWeChatPage() {
		Assert.assertThat(this.creamsAPPPersonalInformationPage.intoModifyWeChatNumPage(), is(true));
		//System.out.println("成功进入修改微信号页");
	}

	//断言---进入修改手机号页
	public void intoModifyTel(){
		Assert.assertThat(this.creamsAPPPersonalInformationPage.intoModifyTelPage(),is(true));
	}
	
	//common
	//修改姓名
	public void modifyUserName(String userName) {
		this.creamsAPPPersonalInformationPage.ModifyUserName(userName);
	}
	
	//common
	//修改微信号
	public void modifyWeChatNum(String weChatNum) {
		this.creamsAPPPersonalInformationPage.modifyWeChatNum(weChatNum);
	}
	
	//common
	//点击保存按钮
	public void clickSave() {
		this.creamsAPPPersonalInformationPage.clickSaveButton();
	}
	
	//common
	//断言---获取姓名显示中的的字段来判断
	public void modifyUserNameSUccessful(String  myUserName) {
		Assert.assertThat(this.creamsAPPPersonalInformationPage.checkModifyUserName(), is(myUserName));
		System.out.println("修改姓名成功！！！！");
	}
	
	//common
	//断言----通过获取微信号显示框中的字段来判断
	public void modifyWeChatNumSuccessful(String myWeChatNum) {
		Assert.assertThat(this.creamsAPPPersonalInformationPage.checkModifyWeChatNum(), is(myWeChatNum));
		System.out.println("修改微信号成功！！！");
	}
	//common
	//点击个人信息的返回按钮回到我的主页
	public void backToMyPage(){
		this.creamsAPPPersonalInformationPage.backToMyPage();
	}
}
