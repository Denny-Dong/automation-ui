package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPMyChannelStep extends BaseStep{
	/**
	 * 新建渠道联系人
	 * @throws Throwable
	 */
	//点击导航进入导航页
	@Given("^点击导航进入导航页$")
	public void 点击导航进入导航页() throws Throwable {
	   this.creamsAPPMyChannelFlow.clickNavigation();
	   this.creamsAPPMyChannelFlow.intoNavigationPage();
	}
	//点击我的渠道进入我的渠道列表
	@Given("^点击我的渠道进入我的渠道列表$")
	public void 点击我的渠道进入我的渠道列表() throws Throwable {
	    this.creamsAPPMyChannelFlow.clickMyChannel();
	}
	//点击右上角的添加按钮
	@When("^点击我的渠道右上角的添加按钮$")
	public void 点击我的渠道右上角的添加按钮() throws Throwable {
	    this.creamsAPPMyChannelFlow.clickAddButton();
	    //this.creamsAPPMyChannelFlow.intoAddPage();
	}
	//填写经纪人姓名
	@When("^填写经纪人姓名为 \"([^\"]*)\"$")
	public void 填写经纪人姓名为(String name) throws Throwable {
	    this.creamsAPPMyChannelFlow.inputName(name);
	}
	//填写经纪人电话
	@When("^填写经纪人电话为 \"([^\"]*)\"$")
	public void 填写经纪人电话为(String telPhone) throws Throwable {
	    this.creamsAPPMyChannelFlow.inputTelphone(telPhone);
	}
	//添加公司名称
	@When("^填写公司名称为 \"([^\"]*)\"$")
	public void 填写公司名称为(String company) throws Throwable {
	    this.creamsAPPMyChannelFlow.inputCompany(company);
	}
	//点击区域显示框
	@When("^点击区域显示框进入搜索界面$")
	public void 点击区域显示框进入搜索界面() throws Throwable {
	    this.creamsAPPMyChannelFlow.clickAreaBox();
	}
	//在搜索框中输入区域关键词
	@When("^在搜索框中输入区域 \"([^\"]*)\"$")
	public void 在搜索框中输入区域(String area) throws Throwable {
	    this.creamsAPPMyChannelFlow.inputArea(area);
	}
	//选择一个区域
	@When("^选择区域商圈为 \"([^\"]*)\"$")
	public void 选择区域商圈为(String bussinessCircle) throws Throwable {
	    this.creamsAPPMyChannelFlow.selectBussinessCircle(bussinessCircle);
	}
	//选择多个区域
	@When("^选择多个区域商圈为 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 选择多个区域商圈为(String bussinessCircle1, String bussinessCircle2) throws Throwable {
	    this.creamsAPPMyChannelFlow.selectMoreBussinessCircle(bussinessCircle1, bussinessCircle2);
	}
	//点击搜索界面的确定按钮
	@When("^点击搜索界面的确定按钮$")
	public void 点击搜索界面的确定按钮() throws Throwable {
	    this.creamsAPPMyChannelFlow.clickConfirmButton();
	}
	//填写邮箱
	@When("^填写邮箱为 \"([^\"]*)\"$")
	public void 填写邮箱为(String email) throws Throwable {
	    this.creamsAPPMyChannelFlow.inputEmail(email);
	}
	//填写通讯地址
	@When("^填写通讯地址为 \"([^\"]*)\"$")
	public void 填写通讯地址为(String address) throws Throwable {
	    this.creamsAPPMyChannelFlow.inputAddress(address);
	}
	//点击保存按钮
	@When("^点击新建渠道联系人页的保存$")
	public void 点击新建渠道联系人页的保存() throws Throwable {
	    this.creamsAPPMyChannelFlow.clickSave();
	}
	//断言----核对我的渠道列表中是否存在
	@Then("^我的渠道列表中存在一条经纪人姓名为 \"([^\"]*)\"的联系人，渠道联系人新建成功$")
	public void 我的渠道列表中存在一条经纪人姓名为_的联系人_渠道联系人新建成功(String name) throws Throwable {
	    this.creamsAPPMyChannelFlow.checkAddMyChannelSuccessful(name);
	}
	//核对我的渠道列表中的数据
	@Then("^新建的渠道联系人信息显示正确 \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 新建的渠道联系人信息显示正确(String name, String telphone, String channelType, String lookNumber, String bussinessCircle) throws Throwable {
	    this.creamsAPPMyChannelFlow.checkChannelInformationSuccessful(name, telphone, channelType, lookNumber, bussinessCircle);
	}
	
	
	
	
	
	/**
	 * 查看渠道联系人资料
	 * @param name
	 * @throws Throwable
	 */
	//点击刚新建的渠道联系人---name
	@When("^点击刚刚新建的姓名为 \"([^\"]*)\"的渠道联系人进入渠道联系人资料页$")
	public void 点击刚刚新建的姓名为_的渠道联系人进入渠道联系人资料页(String name) throws Throwable {
	    this.creamsAPPMyChannelFlow.clickMyNewChannel(name);
	    this.creamsAPPMyChannelFlow.intoMyChannelDetailPage();
	}
	//核对渠道联系人资料页的数据
	@Then("^渠道联系人资料页中的数据显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 渠道联系人资料页中的数据显示正确(String name, String channelType, String telphone, String bussinessRangle,
			String email, String lookNumber, String transactNumber) throws Throwable {
	    this.creamsAPPMyChannelFlow.checkChannelDetailInformationSuccessful(name, channelType, telphone, bussinessRangle, email, lookNumber, transactNumber);
	}
	//ios 未填写邮箱时验证
	@Then("^渠道联系人资料页中的数据显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 渠道联系人资料页中的数据显示正确(String name, String channelType, String telphone, String bussinessRangle,
			String lookNumber, String transactNumber) throws Throwable {
		this.creamsAPPMyChannelFlow.checkChannelDetailInformationSuccessfulForIos(name, channelType, telphone, bussinessRangle, lookNumber, transactNumber);
	}
	
	
	
	
	
	/**
	 * 删除我的渠道联系人
	 * @throws Throwable
	 */
	//点击我的渠道联系人资料页的更多按钮
	@When("^点击页面上的操作按钮$")
	public void 点击页面上的操作按钮() throws Throwable {
		this.creamsAPPMyChannelFlow.clickMoreButton();
	}
	//点击删除按钮
	@When("^点击操作列表中的删除按钮$")
	public void 点击操作列表中的删除按钮() throws Throwable {
	    this.creamsAPPMyChannelFlow.clickDeletButton();
	}
	//点击确定按钮
	@When("^点击确定要删除该渠道联系人吗页面上的确定按钮$")
	public void 点击确定要删除该渠道联系人吗页面上的确定按钮() throws Throwable {
	    this.creamsAPPMyChannelFlow.clickEnsureButon();
	}
	//断言----我的渠道列表中是否存在
	@Then("^我的渠道列表中不存在姓名为 \"([^\"]*)\"的渠道联系人，渠道联系人删除成功$")
	public void 我的渠道列表中不存在姓名为_的渠道联系人_渠道联系人删除成功(String name) throws Throwable {
	    this.creamsAPPMyChannelFlow.checkDeleteSuccessful(name);
	}
	
	
	
	
	
	/**
	 * 通过经纪人姓名或者电话搜索渠道联系人
	 * 并且检查搜索结果中经纪人的信息
	 */
	@When("^点击我的渠道页面顶部的搜索框进入搜索页$")
	public void 点击我的渠道页面顶部的搜索框进入搜索页() throws Throwable {
	   this.creamsAPPMyChannelFlow.clickMyChannelSearch();
	}
	@When("^在搜索框中输入经纪人关键词 \"([^\"]*)\"$")
	public void 在搜索框中输入经纪人关键词(String name) throws Throwable {
	    this.creamsAPPMyChannelFlow.inputAgentName(name);
	}
	@When("^在搜索框中输入电话 \"([^\"]*)\"$")
	public void 在搜索框中输入电话(String telephone) throws Throwable {
	    this.creamsAPPMyChannelFlow.inputAgentTelephone(telephone);
	}
	@Then("^搜索结果列表中存在一条经纪人姓名为 \"([^\"]*)\"的记录$")
	public void 搜索结果列表中存在一条经纪人姓名为_的记录(String name) throws Throwable {
	    this.creamsAPPMyChannelFlow.checkSearchResult(name);
	}
	@Then("^该经纪人的信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 该经纪人的信息显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    
	}


	/**
	 * 通过渠道类型快捷筛选
	 */
	@When("^选择快捷渠道来下为 \"([^\"]*)\"$")
	public void 选择快捷渠道来下为(String arg1) throws Exception {
		this.creamsAPPMyChannelFlow.selectChannelType(arg1);
	}

	@Then("^我的渠道列表中所有记录的渠道类型都显示 \"([^\"]*)\"$")
	public void 我的渠道列表中所有记录的渠道类型都显示(String arg1) throws Exception {
		this.creamsAPPMyChannelFlow.checkAllChannerType(arg1);
	}
}
