package com.souban.bdd.pages.CreamsWebPage.Marketing;

import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class InvesteringListPage extends ParentPage {
	public InvesteringListPage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_clickInvestmentManagement = new UIElement(
			"xpath=//*[@class='ant-menu-item']/a[text()='招商管理']");
	private UIElement BTN_chooseFirstBuilding = new UIElement("xpath=//*[@class='list___2Hba-']/li[2]");
	private UIElement BTN_chooseSecondBuilding = new UIElement("xpath=//*[@class='list___2Hba-']/li[3]");
	private UIElement BTN_accesstimeBy_ASC = new UIElement("xpath=//*[text()='来访时间']/div/span[@title='↑']");
	private UIElement BTN_accesstimeBy_DESC = new UIElement("xpath=//*[text()='来访时间']/div/span[@title='↓']");
	private UIElement BTN_accesstimeSelectTime = new UIElement("xpath=//*[text()='来访时间']/i[@title='筛选']");
	private UIElement TXT_buildingListOnSelect = new UIElement("xpath=//span[text()='选择大楼:']");
	private UIElement TXT_accesstimeList = new UIElement("xpath=//*[@class='time___284C7']");
	private UIElement BTN_calendarIcon = new UIElement("xpath=//*[@class='ant-calendar-picker-icon']");
	private UIElement TXT_accesstimeOfFinishDate = new UIElement(
			"xpath=//*[@class='ant-calendar-range-part ant-calendar-range-right']/div/div/input");
	private UIElement TXT_accesstimeOfStartDate = new UIElement(
			"xpath=//*[@class='ant-calendar-range-part ant-calendar-range-left']/div/div/input");
	private UIElement BTN_cancelAccesstimeOfToday = new UIElement("xpath=//*[text()='清除选项']");
	private UIElement BTN_iconOfChannels = new UIElement(
			"xpath=//*[@class='ant-table-thead']/descendant-or-self::span[text()='渠道']/i");
	private UIElement BTN_sureOfSelectChannels = new UIElement(
			"xpath=//*[@class='ant-table-filter-dropdown-btns']/a[text()='确定']");
	private UIElement TXT_channelsList = new UIElement("xpath=//*[@class='channel___2HICx']");
	private UIElement TXT_select = new UIElement(
			"xpath=//*[@class='height7px___3ssM0 needBottomLine___39_Ic container___C6wXr']/descendant-or-self::span[text()='筛选']");
	private UIElement TXT_channelsNameOnSelectList = new UIElement(
			"xpath=//*[@class='height7px___3ssM0 needBottomLine___39_Ic container___C6wXr']/descendant-or-self::span[text()='渠道']");
	private UIElement BTN_demandAreaBy_ASC = new UIElement("xpath=//*[text()='需求面积段']/div/span[@title='↑']");
	private UIElement BTN_demandAreaBy_DESC = new UIElement("xpath=//*[text()='需求面积段']/div/span[@title='↓']");
	private UIElement TXT_demandAreaList = new UIElement("xpath=//*[@class='area___3XLYm']");
	private UIElement TXT_demandAreaOnSelectList = new UIElement("xpath=//span[text()='需求面积段']");

	private List<String> accesstimeDetails(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	private List<String> channelsDetails(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	private List<String> demandAreaDetails(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	public void choosebuilding() {// 选择楼宇
		this.driver.click(BTN_clickInvestmentManagement);
		// this.driver.click(BTN_cancelAccesstimeOfToday);
		this.driver.click(BTN_chooseFirstBuilding);
		this.driver.click(BTN_chooseSecondBuilding);
		this.driver.sleep(1000);
	}

	public void clickAccesstimeByAscending() {// 点击升序
		this.driver.click(BTN_accesstimeBy_ASC);
	}

	public List<String> accecctimeList() {// 获取访问时间列表
		this.driver.sleep(1000);
		return this.accesstimeDetails(TXT_accesstimeList);
	}

	public void clickAccesstimeByDescending() {// 点击降序
		this.driver.click(BTN_accesstimeBy_DESC);
	}

	public void selectAccesstimeperiod(String finishdate, String startdate) {// 选择时间段
		this.driver.click(BTN_calendarIcon);
		this.driver.elementSendText(TXT_accesstimeOfFinishDate, finishdate);
		this.driver.elementSendText(TXT_accesstimeOfStartDate, startdate);
	}

	public UIElement chooseChannelsName(String channelsname) {
		return new UIElement("xpath=//*[@class='ant-dropdown-menu-item']/span[text()='" + channelsname + "']");

	}

	public void clickIconOfChannels() {
		Assert.assertThat(this.driver.waitClickable(BTN_iconOfChannels, 5), Is.is(true));
		this.driver.click(BTN_iconOfChannels);
		this.driver.sleep(1000);
	}

	public void selectChannelsName(String channelsname) {

		Assert.assertThat(this.driver.waitClickable(chooseChannelsName(channelsname), 5), Is.is(true));
		this.driver.click(chooseChannelsName(channelsname));

		Assert.assertThat(this.driver.waitClickable(BTN_sureOfSelectChannels, 5), Is.is(true));
		this.driver.click(BTN_sureOfSelectChannels);
	}

	public List<String> channelsList() {// 获取列表
		this.driver.sleep(1000);
		return this.channelsDetails(TXT_channelsList);
	}

	public boolean checkSortBuildingConditions() {
		return this.driver.isElementFound(TXT_buildingListOnSelect);
	}

	public boolean checkForSelectName() {
		return this.driver.isElementFound(TXT_select);
	}

	public boolean checkForSelectChannelsName() {
		return this.driver.isElementFound(TXT_channelsNameOnSelectList);
	}

	public void clickDemandAreaByDescending() {
		this.driver.MoveToElement(BTN_demandAreaBy_DESC);
		this.driver.waitClickable(BTN_demandAreaBy_DESC, 5);
		this.driver.click(BTN_demandAreaBy_DESC);
		// this.driver.click(BTN_demandAreaBy_DESC);
	}

	public List<String> demandAreaList() {
		this.driver.sleep(5000);
		return this.demandAreaDetails(TXT_demandAreaList);
	}

	public void clickDemandAreaByAscending() {
		this.driver.click(BTN_demandAreaBy_ASC);

	}

	public boolean checkSelectOfBuilding() {
		return this.driver.isElementFound(TXT_buildingListOnSelect);
	}

	public boolean checkSelectOfDemandArea() {
		return this.driver.isElementFound(TXT_demandAreaOnSelectList);
	}

}
