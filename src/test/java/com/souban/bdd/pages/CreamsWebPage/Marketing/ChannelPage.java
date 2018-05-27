package com.souban.bdd.pages.CreamsWebPage.Marketing;

import java.util.List;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class ChannelPage extends ParentPage {

	public ChannelPage(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// 新建中介公司
	private UIElement TXT_InvestmentManagement = new UIElement("xpath=//*[text()='招商管理']");
	private UIElement TXT_ChannelManagement = new UIElement("xpath=//*[text()='渠道管理']");
	public static UIElement TXT_MyAgent = new UIElement("xpath=//*[text()='我的经纪人    >']");
	private UIElement TXT_All = new UIElement("xpath=//*[contains(text(),'全部')]");
	private UIElement TXT_Agency = new UIElement("xpath=//*[contains(text(),'中介公司')]");
	private UIElement TXT_CreamsAgent = new UIElement("xpath=//*[contains(text(),'creams经纪人')]");
	private UIElement BTN_CreateCompany = new UIElement("xpath=//*[@class='ant-btn ant-btn-primary']");
	private UIElement INP_Company = new UIElement("xpath=//*[@class='ant-select-search__field']");
	private UIElement INP_ContactName = new UIElement("id=contactName");
	private UIElement INP_ContactTel = new UIElement("id=contactTel");
	private UIElement BTN_Create = new UIElement("xpath=//*[@class='ant-btn ant-btn-primary ant-btn-lg']");
	private UIElement BTN_Total = new UIElement("xpath=//*[@id='我的经纪人    >$Menu']/li[1]");
	private UIElement BTN_Agency = new UIElement("xpath=//*[@id='我的经纪人    >$Menu']/li[2]");
	private UIElement BTN_FreeBrokers = new UIElement("xpath=//*[@id='我的经纪人    >$Menu']/li[3]");
	private UIElement BTN_OtherChannels = new UIElement("xpath=//*[@id='我的经纪人    >$Menu']/li[4]");
	private UIElement BTN_PlatformBrokers = new UIElement("xpath=//*[@id='渠道管理$Menu']/li[2]");
	private UIElement BTN_OK = new UIElement("xpath=//*[text()='确认']");
	private UIElement BTN_SelectCity = new UIElement("xpath=//*[text()='城市']/i[@title='筛选']");
	private UIElement BTN_SelectArea = new UIElement("xpath=//*[text()='区域']/i[@title='筛选']");
	private UIElement BTN_SelectChannel = new UIElement("xpath=//*[text()='渠道类型']/i[@title='筛选']");
	private UIElement BTN_Confirm = new UIElement("xpath=//*[text()='确定']");
	private UIElement TXT_Contact = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[2]");
	private UIElement TXT_Phone = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[3]");
	private UIElement TXT_City = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[4]");
	private UIElement TXT_Area = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[5]");
	private UIElement TXT_Channel = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[6]");
	private UIElement BTN_TimeDescending = new UIElement("xpath=//span[text()='最新跟进时间']/div/span[@title='↓']");
	private UIElement BTN_TimeAscending = new UIElement("xpath=//span[text()='最新跟进时间']/div/span[@title='↑']");
	private UIElement TXT_Time = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[7]");
	private UIElement TXT_Look = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[8]");
	private UIElement BTN_NextFive = new UIElement("xpath=//*[@title='向后 5 页']");
	private UIElement BTN_EightPage = new UIElement("xpath=//*[@title='8']");
	private UIElement BTN_LookDescending = new UIElement("xpath=//span[text()='带看量']/div/span[@title='↓']");
	private UIElement BTN_LookAscending = new UIElement("xpath=//span[text()='带看量']/div/span[@title='↑']");
	private UIElement BTN_FunctionSelection = new UIElement("xpath=//span[text()='功能选择']");
	private UIElement BTN_Search = new UIElement("xpath=//input[@placeholder='搜索']");
	private UIElement BTN_SearchOk = new UIElement("xpath=//*[@class='anticon anticon-search ant-input-search-icon']");

	private boolean hasNum(String Result) {
		if (Result.contains("(") && Result.contains(")"))
			return true;
		else
			return false;

	}

	public UIElement CheckElement(String agency) {
		return new UIElement("xpath=//*[text()='" + agency + "']");
	}

	private UIElement AddToMyAgent(String choose) {
		return new UIElement("xpath=//*[text()='" + choose + "']" + "/following-sibling::td[5]/span");
	}

	private List<String> rentalDetails(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	public void select_Investment_management_and_Channel_management() {
		this.driver.click(TXT_InvestmentManagement);
		this.driver.sleep(1000);
		this.driver.click(TXT_ChannelManagement);
	}

	public void select_agency() {
		this.driver.mouseOver(TXT_MyAgent);
		this.driver.sleep(1000);
		this.driver.click(TXT_Agency);
	}

	public void select_CreamsAgent() {
		this.driver.click(TXT_CreamsAgent);
	}

	public void mouseOverMyAgent() {
		this.driver.mouseOver(TXT_MyAgent);
	}

	public void open_Create_new_agency() throws InterruptedException {

		// this.driver.waitForElement(BTN_CreateCompany, 8);
		this.driver.sleep(3000);
		this.driver.click(BTN_CreateCompany);
	}

	public void InputCompanyAndContactNameAndContactTel(String company, String contactName, String contactTel) {
		this.driver.elementSendText(INP_Company, company);
		this.driver.elementSendText(INP_ContactName, contactName);
		this.driver.elementSendText(INP_ContactTel, contactTel);
	}

	public void click_create() {
		this.driver.click(BTN_Create);
	}

	public boolean CheckCreateAgencyResult(String agency) {
		return this.driver.waitForElement(this.CheckElement(agency), 5);
	}

	public boolean[] myAgentNum() {
		boolean[] flag = new boolean[5];
		this.driver.waitForElement(BTN_Total, 30);
		flag[0] = this.hasNum(this.driver.elementGetText(BTN_Total));
		flag[1] = this.hasNum(this.driver.elementGetText(BTN_Agency));
		flag[2] = this.hasNum(this.driver.elementGetText(BTN_FreeBrokers));
		flag[3] = this.hasNum(this.driver.elementGetText(BTN_OtherChannels));
		flag[4] = this.hasNum(this.driver.elementGetText(BTN_PlatformBrokers));
		return flag;
	}

	public void MoveCreamsAgentToMyAgent(String agent) {
		this.driver.click(this.AddToMyAgent(agent));
		this.driver.sleep(1000);
		this.driver.click(BTN_OK);
		this.driver.sleep(2000);
		this.driver.click(BTN_OK);
	}

	public boolean hasAgent(String agent) {
		this.driver.click(TXT_ChannelManagement);
		return this.driver.isElementFound(this.CheckElement(agent));
	}

	public void selectCity(String city) {
		this.driver.click(TXT_ChannelManagement);
		this.driver.waitForElement(BTN_SelectCity, 25);
		this.driver.click(BTN_SelectCity);
		this.driver.click(this.CheckElement(city));
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
	}

	public void selectArea(String city, String area) {
		this.driver.click(TXT_ChannelManagement);
		this.driver.waitForElement(BTN_SelectArea, 25);
		this.driver.click(BTN_SelectArea);
		this.driver.click(this.CheckElement(city));
		this.driver.sleep(1000);
		this.driver.click(this.CheckElement(area));
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
	}

	public void selectChannel(String channel) {
		this.driver.click(TXT_ChannelManagement);
		this.driver.waitForElement(BTN_SelectChannel, 25);
		this.driver.click(BTN_SelectChannel);
		this.driver.sleep(1000);
		this.driver.click(this.CheckElement(channel));
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
	}

	public List<String> cityList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_City);
	}

	public List<String> areaList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_Area);
	}

	public List<String> channelList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_Channel);
	}

	public void goToEightPage() {
		this.driver.click(BTN_NextFive);
		this.driver.click(BTN_EightPage);
		this.driver.sleep(5000);
	}

	public void timeDescending() {
		this.driver.click(TXT_ChannelManagement);
		this.driver.waitForElement(BTN_TimeDescending, 25);
		this.driver.click(BTN_TimeDescending);
	}

	public void timeAscending() {
		this.driver.click(TXT_ChannelManagement);
		this.driver.waitForElement(BTN_TimeAscending, 25);
		this.driver.click(BTN_TimeAscending);
	}

	public List<String> getFollowUpTime() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_Time);
	}

	public void lookDescending() {
		this.driver.click(TXT_ChannelManagement);
		this.driver.waitForElement(BTN_LookDescending, 25);
		this.driver.click(BTN_LookDescending);
	}

	public void lookAscending() {
		this.driver.click(TXT_ChannelManagement);
		this.driver.waitForElement(BTN_LookAscending, 25);
		this.driver.click(BTN_LookAscending);
	}

	public List<String> getLookNum() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_Look);
	}

	public void functionSelection() {
		this.driver.click(TXT_ChannelManagement);
		this.driver.waitForElement(BTN_FunctionSelection, 25);
		this.driver.click(BTN_FunctionSelection);
	}

	public void search(String contact) {
		this.driver.elementSendText(BTN_Search, contact);
		this.driver.click(BTN_SearchOk);
	}

	public List<String> contactList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_Contact);
	}

	public List<String> phoneList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_Phone);
	}

}
