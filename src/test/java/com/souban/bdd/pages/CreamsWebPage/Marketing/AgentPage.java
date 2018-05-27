package com.souban.bdd.pages.CreamsWebPage.Marketing;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class AgentPage extends ParentPage {

	public AgentPage(Driver driver) {
		super(driver);
	}

	// 新建经纪人
	private UIElement TXT_AllAgency = new UIElement("xpath=//*[contains(text(),'全部')]");
	private UIElement BTN_FunctionSelection = new UIElement("xpath=//*[text()='功能选择']");
	private UIElement BTN_CreateAgent = new UIElement("xpath=//*[@class='ant-btn']/span[text()='新建经纪人']");

	private UIElement BTN_IndividualLease2 = new UIElement(
			"xpath=//*[@class='ant-radio-wrapper']/span[text()='自由经纪人']");
	private UIElement BTN_IndividualLease3 = new UIElement("xpath=//*[@class='ant-radio-wrapper']/span[text()='其它渠道']");

	private UIElement INP_Agency = new UIElement("class=ant-select-selection__placeholder");

	private UIElement INP_ChannelName = new UIElement("xpath=//*[@class='ant-select-selection__placeholder']");

	private UIElement INP_AgentName = new UIElement("xpath=//*[@id='name']");
	private UIElement INP_AgentTel = new UIElement("xpath=//*[@id='telephone']");
	private UIElement INP_Area = new UIElement("xpath=//*[@id='residence']");
	private UIElement BTN_NewAgent = new UIElement("xpath=//*[@class='ant-btn ant-btn-primary ant-btn-lg']");

	public UIElement companyElement(String company) {
		return new UIElement("xpath=//li[text()='" + company + "']");
	}

	public UIElement provinceElement(String province) {
		return new UIElement("xpath=//*[@title='" + province + "' and text()='" + province + "']");
	}

	public UIElement cityElement(String city) {
		return new UIElement(
				"xpath=//*[@class='ant-cascader-menu-item ant-cascader-menu-item-expand' and text()='" + city + "']");
	}

	public UIElement regionElement(String region) {
		return new UIElement("xpath=//*[@class='ant-cascader-menu-item' and text()='" + region + "']");
	}

	public void select_AllAgency() {
		this.driver.mouseOver(ChannelPage.TXT_MyAgent);
		this.driver.sleep(1000);
		this.driver.click(TXT_AllAgency);
	}

	public void open_Create_new_agent() throws InterruptedException {
		this.driver.sleep(2000);
		this.driver.click(BTN_FunctionSelection);
		this.driver.sleep(1000);
		this.driver.click(BTN_CreateAgent);
	}

	public void select_ChannelCategory_and_company(String company) {
		this.driver.sleep(1000);
		this.driver.waitAndClick(INP_Agency, 2);
		this.driver.sleep(1000);
		this.driver.click(this.companyElement(company));
	}

	public void input_AgentName_and_AgentTel(String Name, String Tel) {
		this.driver.elementSendText(INP_AgentName, "auto" + Name);
		this.driver.elementSendText(INP_AgentTel, Tel);
	}

	public void select_area(String province, String city, String region) {
		this.driver.click(INP_Area);
		this.driver.sleep(1000);
		this.driver.scrollToText(this.provinceElement(province));
		this.driver.waitAndClick(this.provinceElement(province), 2);
		this.driver.scrollToText(this.cityElement(city));
		this.driver.waitAndClick(this.cityElement(city), 2);
		this.driver.scrollToText(this.regionElement(region));
		this.driver.waitAndClick(this.regionElement(region), 2);
	}

	public void click_CreateAgent() {
		this.driver.click(BTN_NewAgent);
	}

	public UIElement AgentElement(String Agent) {
		return new UIElement("xpath=//td[text()='" + Agent + "']");
	}

	public boolean create_Agent_successfully(String Agent) {
		this.driver.sleep(1000);
		return this.driver.waitForElement(this.AgentElement(Agent), 30);
	}

	// 自由经纪人
	public void select_ChannelCategory() {
		this.driver.waitAndClick(BTN_IndividualLease2, 2);
	}

	// 其他渠道经纪人
	public UIElement channelNameElement(String channelName) {
		return new UIElement("xpath=//*[@class='ant-select-dropdown-menu-item' and text()='" + channelName + "']");
	}

	public void select_ChannelCategory_and_ChannelName(String channelName) {
		this.driver.waitAndClick(BTN_IndividualLease2, 2);
		this.driver.waitForElement(BTN_IndividualLease3, 2);
		this.driver.click(BTN_IndividualLease3);
		this.driver.click(INP_ChannelName);
		this.driver.sleep(1000);
		this.driver.waitAndClick(this.channelNameElement(channelName), 2);
	}
}
