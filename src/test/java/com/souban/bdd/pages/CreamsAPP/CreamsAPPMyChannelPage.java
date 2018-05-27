package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

import java.util.List;

public class CreamsAPPMyChannelPage extends ParentPage {

	public CreamsAPPMyChannelPage(Driver driver) {
		super(driver);
	}
	
	// 新建渠道联系人
	//导航
	private UIElement TXT_navigation = new UIElement(
			"xpath=//android.widget.RadioButton[@text='导航' and @resource-id='com.souban.creams.debug:id/navigation']",
			"xpath=//XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeOther[2]");
	private UIElement TXT_navigationPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/titleTv' and @text='导航']",
			"xpath=//XCUIElementTypeOther[@name='导航']");
	//我的渠道
	private UIElement TXT_myChannel = new UIElement(
			"xpath=//*[@text='我的渠道']",
			"xpath=//XCUIElementTypeStaticText[@name='我的渠道']");
	//增加按钮
	private UIElement BTN_add = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/add']",
			"xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem Add']") ;
	//新建渠道联系人
	private UIElement TXT_newChannelContact = new UIElement(
			"xpath=//android.widget.TextView[@text='新建渠道联系人' and @resource-id='com.souban.creams.debug:id/new_channel_contact']",
			"xpath=//XCUIElementTypeOther[@name='新建渠道联系人']");
	//姓名
	private UIElement INP_name = new UIElement(
			"xpath=//android.widget.EditText[@text='请填写经纪人姓名' and @resource-id='com.souban.creams.debug:id/name']",
			"name=请填写联系人姓名");
	//电话
	private UIElement INP_telphone = new UIElement(
			"xpath=//android.widget.EditText[@text='请填写联系人电话' and @resource-id='com.souban.creams.debug:id/telephone']",
			"name=请填写联系电话");
	//公司
	private UIElement INP_company = new UIElement(
			"xpath=//android.widget.EditText[@text='请填写公司名称' and @resource-id='com.souban.creams.debug:id/company']",
			"name=请填写公司名称");
	//区域显示框
	private UIElement TXT_area = new UIElement(
			"xpath=//android.widget.TextView[@text='请选择城市/区域/商圈' and @resource-id='com.souban.creams.debug:id/areaTv']",
			"name=Merchant_Indicator_Right");
	//区域搜索框
	private UIElement INP_toolBar = new UIElement(
			"xpath=//android.widget.EditText[@text='请输入城市/区域/商圈' and @resource-id='com.souban.creams.debug:id/toolbar_title']",
			"name=请输入城市/区域/商圈名字");
	//搜索结果列表
	public UIElement ContentUIElement(String bussinessCircle) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv' and @text='"+bussinessCircle+"']",
				"xpath=//*[@type='XCUIElementTypeStaticText' and @name='"+bussinessCircle+"']");
	}
	//搜索结果页的确定按钮
	private UIElement BTN_confirm = new UIElement(
			"xpath=//android.widget.TextView[@text='确定' and @resource-id='com.souban.creams.debug:id/confirmTv']",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	//邮箱
	private UIElement INP_email = new UIElement(
			"xpath=//android.widget.EditText[@text='请填写电子邮箱' and @resource-id='com.souban.creams.debug:id/email']",
			"name=请填写电子邮箱");
	//通讯地址
	private UIElement INP_address = new UIElement(
			"xpath=//android.widget.EditText[@text='请填写通讯地址' and @resource-id='com.souban.creams.debug:id/address']",
			"name=请填写通讯地址");
	//新建渠道联系人页面的保存按钮
	private UIElement BTN_save = new UIElement(
			"xpath=//android.widget.TextView[@text='保存' and @resource-id='com.souban.creams.debug:id/saveTv']",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	
	
	
	//检查渠道联系人列表的信息
	//我的渠道列表中----断言用
	//姓名
	public UIElement NameUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.LinearLayout[2]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/agent' and @text='"+name+"']",
				"xpath=//XCUIElementTypeCell[1]//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[@name='"+name+"']");
	}
	//电话
	public UIElement TelphoneUIElement(String name) {
		return new UIElement(
				"xpath=//*[@text='"+name+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/telephone']",
				"xpath=//*[@name='"+name+"']/following-sibling::XCUIElementTypeStaticText");
	}
	//渠道类型
	public UIElement ChannelTypeUIElement(String name) {
		return new UIElement(
				"xpath=//*[@text='"+name+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/value']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[3]");
	}
	//带看量
	public UIElement LookNumberUIElement(String name) {
		return new UIElement(
				"xpath=//*[@text='"+name+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/value']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[4]");
	}
	//商圈
	public UIElement BussinessCircleUIElement(String name) {
		return new UIElement(
				"xpath=//*[@text='"+name+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.RelativeLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/value']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
	}

	
	
	//检查渠道联系人资料页的信息
	//渠道联系人资料页title
	private UIElement TXT_channelDetailPage = new UIElement(
			"xpath=//android.widget.TextView[@text='渠道联系人资料' and @resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//XCUIElementTypeOther[@name='渠道联系人资料']");
	//经纪人姓名
	private UIElement TXT_detailName = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/name']",
			"xpath=//XCUIElementTypeStaticText[@name='经纪人姓名']/following-sibling::XCUIElementTypeStaticText[2]");	
	//渠道类型
	private UIElement TXT_detailChannelType = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/type']",
			"xpath=//XCUIElementTypeStaticText[@name='经纪人姓名']/following-sibling::XCUIElementTypeOther[1]");
	//电话
	private UIElement TXT_detailTelphone = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/tel']",
			"xpath=//XCUIElementTypeStaticText[@name='电话']/following-sibling::XCUIElementTypeStaticText[2]");
	//业务范围
	private UIElement TXT_detailBussinessRange = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/area']",
			"xpath=//XCUIElementTypeStaticText[@name='电话']/following-sibling::XCUIElementTypeOther[1]");
	//邮箱
	private UIElement TXT_detailEmail = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/email']",
			"xpath=//XCUIElementTypeStaticText[@name='邮箱']/following-sibling::XCUIElementTypeStaticText[1]");
	//带看量
	private UIElement TXT_detailLookNum = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/follow_number']",
			"xpath=//XCUIElementTypeStaticText[@name='带看量']/following-sibling::XCUIElementTypeStaticText[2]");
	//成交量
	public UIElement TXT_detailTransactNum = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/deal_count']",
			"xpath=//XCUIElementTypeStaticText[@name='带看量']/following-sibling::XCUIElementTypeOther[1]");
	
	
	
	//删除渠道联系人
	//更多按钮
	public UIElement BTN_more = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/moreIv']",
			"xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem More']");
	//删除
	private UIElement BTN_delete = new UIElement(
			"xpath=//android.widget.TextView[@text='删除' and @resource-id='com.souban.creams.debug:id/delTv']",
			"xpath=//XCUIElementTypeStaticText[@name='删除']");
	//确定要删除该渠道联系人吗的确定按钮
	private UIElement BTN_ensure = new UIElement(
			"xpath=//android.widget.Button[@text='确定' and @resource-id='com.souban.creams.debug:id/makeSureBtn']",
			"xpath=//XCUIElementTypeStaticText[@name='确定']");
	
	
	 //通过经纪人姓名或者电话搜索
	//我的渠道顶部搜索框
	 private UIElement TXT_search = new UIElement(
			 "xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/search' and @text='搜索联系人或电话']",
			 "xpath=//XCUIElementTypeStaticText[@name='搜索联系人或电话']");
	//搜索页面的搜素框
	private UIElement INP_search = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/search' and @text='搜索联系人或电话']",
			"xpath=//XCUIElementTypeButton[@name='取消']/preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField[1][@value='搜索联系人或电话']");
	//经纪人姓名
	public UIElement SearchNameUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/agent' and @text='"+name+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+name+"']");
	}
	//电话
	public UIElement SearchTelephone(String name) {
		return new UIElement(
				"xpath=//*[@text='"+name+"']/following-sibling::android.widget.TextView[1][@resource-id='com.souban.creams.debug:id/telephone']",
				"xpath=//*[@name='"+name+"']/following-sibling::XCUIElementTypeStaticText[1]");
	}
	//渠道类型
	public UIElement SearchChannelUIElement(String name) {
		return new UIElement(
				"xpath=//*[@text='"+name+"']/following-sibling::android.widget.TextView[3][@resource-id='com.souban.creams.debug:id/value']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]");
	}
	//带看量
	public UIElement SearchLookNumberUIElement(String name) {
		return new UIElement(
				"xpath=//*[@text='"+name+"']/following-sibling::android.widget.TextView[5][@resource-id='com.souban.creams.debug:id/value']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[4]");
	}
	//商圈
	public UIElement SearchBussinessCircle(String name) {
		return new UIElement(
				"xpath=//*[@text='"+name+"']/following-sibling::android.widget.TextView[7][@resource-id='com.souban.creams.debug:id/value']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[2]/XCUIElementTypeOther[1]XCUIElementTypeStaticText[2]");
	}



	//渠道类型快捷筛选
	private UIElement FilterChannelType(String channelType){
		return  new UIElement(
				"",
				"xpath=//XCUIElementTypeCollectionView//XCUIElementTypeStaticText[@name='"+channelType+"']");
	}
	private UIElement TXT_allChannelType = new UIElement(
			"",
			"xpath=//XCUIElementTypeStaticText[@name='渠道类型']/following-sibling::XCUIElementTypeStaticText[2]");
	
	
	/**
	 * 新建渠道联系人
	 */
	//common
	//点击导航
	public void clicNavigation() {
		this.driver.waitAndClick(TXT_navigation, 2);
	}
	//common
	//断言-----进入导航页
	public boolean intoNavigationPage() {
		return this.driver.waitForElement(TXT_navigationPage,2);
	}
	//common
	//点击我的渠道
	public void clickMyChannelPage() {
		this.driver.waitAndClick(TXT_myChannel, 2);
	}
	//common
	//点击新建按钮
	public void clickAddButton() {
		this.driver.waitAndClick(BTN_add, 1);
	}
	//common
	//点击新建渠道联系人
	public void clickNewChannelContact() {
		this.driver.waitAndClick(TXT_newChannelContact, 1);
	}
	//common
	//断言-----进入新建渠道联系人页
	public boolean intoNewChannelContactPage() {
		this.driver.sleep(1000);
		return this.driver.waitForElement(INP_name, 1);
	}
	//common
	//输入姓名
	public void inputName(String name) {
		this.driver.waitAndClick(INP_name, 2);
		this.driver.elementClearSendText(INP_name, name);
	}
	//common
	//电话
	public void inputTelphone(String telPhone) {
		this.driver.waitAndClick(INP_telphone, 2);
		this.driver.elementClearSendText(INP_telphone, telPhone);
	}
	//common
	//公司
	public void inputCompany(String company) {
		this.driver.waitAndClick(INP_company, 2);
		this.driver.elementClearSendText(INP_company, company);
	}
	//common
	//点击区域
	public void clickAreaBox() {
		this.driver.waitAndClick(TXT_area, 1);
	}
	//common
	//输入区域
	public void inputArea(String area) {
		this.driver.waitAndClick(INP_toolBar, 1);
		this.driver.elementClearSendText(INP_toolBar, area);
	}
	//common
	//选择商圈
	public void selectBussinessCircle(String bussinessCircle) {
		this.driver.waitAndClick(this.ContentUIElement(bussinessCircle), 1);
	}
	//common
	//选择多个商圈
	public void selectMoreBussinessCircle(String bussinessCircle1, String bussinessCircle2) {
		this.driver.waitAndClick(this.ContentUIElement(bussinessCircle1), 1);
		this.driver.waitAndClick(this.ContentUIElement(bussinessCircle2), 1);
	}
	//common
	//点击搜索结果页的确定按钮
	public void clickConfirmButton() {
		this.driver.waitAndClick(BTN_confirm, 1);
	}
	//common
	//填写邮箱
	public void inputEmail(String email) {
		this.driver.waitAndClick(INP_email, 1);
		this.driver.elementClearSendText(INP_email, email);
		//this.driver.hideKeyBoard();
	}
	//common
	//填写通讯地址
	public void inputAddress(String address) {
		this.driver.waitAndClick(INP_address, 1);
		this.driver.elementClearSendText(INP_address, address);
	}
	//common
	//点击新建渠道联系人页面的保存
	public void clickSave() {
		this.driver.waitAndClick(BTN_save, 1);
		this.driver.sleep(3000);
	}
	//common
	//断言---存在新建的渠道联系人
	public boolean checkMyChannelTable(String name) {
		this.driver.swipeToUpToFindElement(this.NameUIElement(name));
		return this.driver.isElementFound(this.NameUIElement(name));
	}
	
	
	
	
	
	/**
	 * 检查我的渠道列表中的数据
	 * @param name
	 * @return
	 */
	//common
	//核对数据
	public String checkContactInformation(String name) {
		return this.driver.elementGetText(this.TelphoneUIElement(name))+","+this.driver.elementGetText(this.ChannelTypeUIElement(name))+","
	+this.driver.elementGetText(this.LookNumberUIElement(name))+","+this.driver.elementGetText(this.BussinessCircleUIElement(name));
	}
	
	
	
	
	
	/**
	 * 检查我的渠道联系人资料页中的数据
	 * @param name
	 */
	//common
	//进入渠道联系人资料页
	public void clickMyNewChannel(String name) {
		this.driver.waitAndClick(this.NameUIElement(name), 2);
	}
	//common
	//断言-----进入渠道联系人资料页
	public boolean intoMyChannelDetailPage() {
		return this.driver.waitForElement(TXT_channelDetailPage, 1);
	}
	//common
	//核对数据
	public String checkChannelDetailInformation() {
		return this.driver.elementGetText(TXT_detailName)+","+this.driver.elementGetText(TXT_detailChannelType)+","
				+this.driver.elementGetText(TXT_detailTelphone)+","+this.driver.elementGetText(TXT_detailBussinessRange)+","
				+this.driver.elementGetText(TXT_detailEmail)+","+this.driver.elementGetText(TXT_detailLookNum)+","
				+this.driver.elementGetText(TXT_detailTransactNum);
	}
	//ios---未填写邮箱时使用
	public String checkChannelDetailInformationForIos() {
		return this.driver.elementGetText(TXT_detailName)+","+this.driver.elementGetText(TXT_detailChannelType)+","
				+this.driver.elementGetText(TXT_detailTelphone)+","+this.driver.elementGetText(TXT_detailBussinessRange)+","
				+this.driver.elementGetText(TXT_detailLookNum)+","
				+this.driver.elementGetText(TXT_detailTransactNum);
	}
	
	
	
	
	
	/**
	 * 删除我的渠道联系人
	 */
	//common
	//点击页面上的更多按钮
	public void clickMoreButton() {
		this.driver.waitAndClick(BTN_more, 1);
	}
	//common
	//点击删除按钮
	public void clickDeleteButton() {
		this.driver.waitAndClick(BTN_delete, 1);
	}
	//common
	//点击删除弹窗的确定按钮
	public void clickEnsureButton() {
		this.driver.waitAndClick(BTN_ensure, 1);
		this.driver.sleep(2000);
	}



	/**
	 * 通过经纪人姓名或者电话搜索渠道联系人
	 */
	//common
	//点击我的渠道顶部的搜索框
	public void clickMyChannelSearch() {
		this.driver.waitAndClick(TXT_search, 5);
	}

	//common
	//输入经纪人姓名
	public void inputAgentName(String name) {
		this.driver.waitAndClick(INP_search, 2);
		this.driver.elementClearSendText(INP_search, name);
	}

	//common
	//输入经纪人电话
	public void inputAgentTelephone(String telephone) {
		this.driver.waitAndClick(INP_search, 2);
		this.driver.elementClearSendText(INP_search, telephone);
	}

	//common
	//断言
	public boolean checkSearchResult(String name) {
		this.driver.sleep(2000);
		return this.driver.waitForElement(this.SearchNameUIElement(name), 2);
	}

	//common
	//检查经纪人信息
	public String checkAgentInformation(String name) {
		this.driver.waitForElement(this.SearchTelephone(name), 1);
		return this.driver.elementGetText(this.SearchTelephone(name))+","+this.driver.elementGetText(this.SearchChannelUIElement(name))
		+","+this.driver.elementGetText(this.SearchLookNumberUIElement(name))+","+this.driver.elementGetText(this.SearchBussinessCircle(name));
	}


	/**
	 * 我的渠道通过渠道类型筛选
	 */
	//选择筛选条件
	public void selectChannelType(String channelType){
		this.driver.waitAndClick(this.FilterChannelType(channelType),2);
	}

	//检查列表中的记录是否符合
	private List<String> channelType(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}

	public List<String> checkAllChannerType(){
		return this.channelType(TXT_allChannelType);
	}
}
