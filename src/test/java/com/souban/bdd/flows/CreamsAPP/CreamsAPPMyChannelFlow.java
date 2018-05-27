package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.pages.CreamsAPP.CreamsAPPMyChannelPage;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CreamsAPPMyChannelFlow {
	
	private CreamsAPPMyChannelPage creamsAPPMyChannelPage = null;
	
	public CreamsAPPMyChannelFlow(final Driver driver) {
		this.creamsAPPMyChannelPage = PageFactory.getPage(CreamsAPPMyChannelPage.class, driver);
	}
	
	//common
	//点击导航tab
	public void clickNavigation() {
		this.creamsAPPMyChannelPage.clicNavigation();
	}
	//common
	//断言----进入导航页
	public void intoNavigationPage() {
		Assert.assertThat(this.creamsAPPMyChannelPage.intoNavigationPage(), is(true));
		//System.out.println("成功进入导航页");
	}
	//common
	//进入我的渠道
	public void clickMyChannel() {
		this.creamsAPPMyChannelPage.clickMyChannelPage();
	}
	//common
	//点击新建按钮
	public void clickAddButton() {
		this.creamsAPPMyChannelPage.clickAddButton();
	}
	//common
	//点击新建渠道联系人
	public void clickNewChanelContact() {
		this.creamsAPPMyChannelPage.clickNewChannelContact();
	}
	//common
	//断言---成功进入新建渠道联系人页
	public void intoNewChannelContactPage() {
		Assert.assertThat(this.creamsAPPMyChannelPage.intoNewChannelContactPage(), is(true));
		//System.out.println("成功进入新建渠道联系人页");
	}
	//common
	//填写姓名
	public void inputName(String name) {
		this.creamsAPPMyChannelPage.inputName(name);
	}
	//common
	//填写电话
	public void inputTelphone(String telPhone) {
		this.creamsAPPMyChannelPage.inputTelphone(telPhone);
	}
	//common
	//填写公司
	public void inputCompany(String company) {
		this.creamsAPPMyChannelPage.inputCompany(company);
	}
	//commom
	//点击区域显示框
	public void clickAreaBox() {
		this.creamsAPPMyChannelPage.clickAreaBox();
	}
	//common
	//输入区域
	public void inputArea(String area) {
		this.creamsAPPMyChannelPage.inputArea(area);
	}
	//common
	//选择商圈
	public void selectBussinessCircle(String bussinessCircle) {
		this.creamsAPPMyChannelPage.selectBussinessCircle(bussinessCircle);
	}
	//common
	//选择多个商圈
	public void selectMoreBussinessCircle(String bussinessCircle1, String bussinessCircle2) {
		this.creamsAPPMyChannelPage.selectMoreBussinessCircle(bussinessCircle1, bussinessCircle2);
	}
	//common
	//点击搜索结果页的确定按钮
	public void clickConfirmButton() {
		this.creamsAPPMyChannelPage.clickConfirmButton();
	}
	//common
	//填写邮箱
	public void inputEmail(String email) {
		this.creamsAPPMyChannelPage.inputEmail(email);
	}
	//common
	//填写通讯地址
	public void inputAddress(String address) {
		this.creamsAPPMyChannelPage.inputAddress(address);
	}
	//common
	//点击新建渠道联系人页面的保存按钮
	public void clickSave() {
		this.creamsAPPMyChannelPage.clickSave();
	}
	//common
	//断言---检查渠道联系人是否新建成功
	public void checkAddMyChannelSuccessful(String name) {
		Assert.assertThat(this.creamsAPPMyChannelPage.checkMyChannelTable(name), is(true));
		//System.out.println("渠道联系人新建成功！！！");
	}
	
	
	
	
	
	//common
	//核对数据
	public void checkChannelInformationSuccessful(String name, String telphone, String channelType,
			String lookNumber, String bussinessCircle) {
		String info=this.creamsAPPMyChannelPage.checkContactInformation(name);
		String[] actualInfo=info.split(",");
		Assert.assertThat(actualInfo[0], is(telphone));
		Assert.assertThat(actualInfo[1], is(channelType));
		Assert.assertThat(actualInfo[2], is(lookNumber));
		Assert.assertThat(actualInfo[3], is(bussinessCircle));
		//System.out.println("数据核对正确！！！");
	}
	
	
	
	
	
	//common
	//点击新建的渠道联系人进入渠道联系人资料页
	public void clickMyNewChannel(String name) {
		this.creamsAPPMyChannelPage.clickMyNewChannel(name);
	}
	//common
	//断言---进入渠道联系人资料页
	public void intoMyChannelDetailPage() {
		Assert.assertThat(this.creamsAPPMyChannelPage.intoMyChannelDetailPage(), is(true));
		//System.out.println("成功进入渠道联系人资料页");
	}
	//common
	//核对渠道联系人资料页的数据
	public void checkChannelDetailInformationSuccessful(String name, String channelType, String telphone,
			String bussinessRangle, String email, String lookNumber, String transactNumber) {
		String info = this.creamsAPPMyChannelPage.checkChannelDetailInformation();
		String[] actualInfo = info.split(",");
		Assert.assertThat(actualInfo[0], is(name));
		Assert.assertThat(actualInfo[1], is(channelType));
		Assert.assertThat(actualInfo[2], is(telphone));
		Assert.assertThat(actualInfo[3], is(bussinessRangle));
		Assert.assertThat(actualInfo[4], is(email));
		Assert.assertThat(actualInfo[5], is(lookNumber));
		Assert.assertThat(actualInfo[6], is(transactNumber));
		//System.out.println("渠道联系人资料页数据显示正确");
	}
	//ios---未填写邮箱时使用
	public void checkChannelDetailInformationSuccessfulForIos(String name, String channelType, String telphone,
			String bussinessRangle, String lookNumber, String transactNumber) {
		String info = this.creamsAPPMyChannelPage.checkChannelDetailInformationForIos();
		String[] actualInfo = info.split(",");
		Assert.assertThat(actualInfo[0], is(name));
		Assert.assertThat(actualInfo[1], is(channelType));
		Assert.assertThat(actualInfo[2], is(telphone));
		Assert.assertThat(actualInfo[3], is(bussinessRangle));
		Assert.assertThat(actualInfo[4], is(lookNumber));
		Assert.assertThat(actualInfo[5], is(transactNumber));
		//System.out.println("渠道联系人资料页数据显示正确");
	}
	
	
	
	
	
	//common
	//点击更多按钮
	public void clickMoreButton() {
		this.creamsAPPMyChannelPage.clickMoreButton();
	}
	//common
	//点击删除按钮
	public void clickDeletButton() {
		this.creamsAPPMyChannelPage.clickDeleteButton();
	}
	//common
	//点击删除弹窗的确定ann
	public void clickEnsureButon() {
		this.creamsAPPMyChannelPage.clickEnsureButton();
	}
	//common
	//断言-----是否删除成功
	public void checkDeleteSuccessful(String name) {
		Assert.assertThat(this.creamsAPPMyChannelPage.checkMyChannelTable(name), is(false));
		//System.out.println("渠道联系人删除成功！！！");
	}
	
	
	/**
	 * 通过经纪人姓名或者电话搜索渠道联系人
	 */
	//common
	//点击我的渠道顶部的搜索框
	public void clickMyChannelSearch() {
		this.creamsAPPMyChannelPage.clickMyChannelSearch();
	}
	//common
	//输入经纪人姓名
	public void inputAgentName(String name) {
		this.creamsAPPMyChannelPage.inputAgentName(name);
	}
	//common
	//输入经纪人电话
	public void inputAgentTelephone(String telephone) {
		this.creamsAPPMyChannelPage.inputAgentTelephone(telephone);
	}
	//common
	//断言
	public void checkSearchResult(String name) {
		Assert.assertThat(this.creamsAPPMyChannelPage.checkSearchResult(name), is(true));
		//System.out.println("存在一条搜索记录");
	}
	//common
	//检查经纪人信息
	public void checkAgentInformation(String name, String telephone, String channelType, String lookNumber, String bussinessCircle) {
		String info = this.creamsAPPMyChannelPage.checkAgentInformation(name);
		String[] actualInfo = info.split(",");
		Assert.assertThat(actualInfo[0], is(telephone));
		Assert.assertThat(actualInfo[1], is(channelType));
		Assert.assertThat(actualInfo[2], is(lookNumber));
		Assert.assertThat(actualInfo[3], is(bussinessCircle));
		//System.out.println("经纪人信息正确");
	}


	/**
	 * 我的渠道通过渠道类型筛选
	 */
	public void selectChannelType(String channelType){
		this.creamsAPPMyChannelPage.selectChannelType(channelType);
	}

	//检查列表中的记录是否符合
	public void checkAllChannerType(String channerType){
		List<String> allChannelType = new ArrayList<String>();
		allChannelType = creamsAPPMyChannelPage.checkAllChannerType();
		for(String str:allChannelType){
			Assert.assertThat(str,is(channerType));
		}
	}
}
