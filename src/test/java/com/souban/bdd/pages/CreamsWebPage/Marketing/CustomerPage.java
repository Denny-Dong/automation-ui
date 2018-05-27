package com.souban.bdd.pages.CreamsWebPage.Marketing;

import java.util.List;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CustomerPage extends ParentPage {

	public CustomerPage(Driver driver) {
		super(driver);
	}

	// 新建客户的element
	private UIElement TXT_MerchManagent = new UIElement("xpath=//*[text()='招商管理']");
	private UIElement BTN_NewCustomer = new UIElement("xpath=//*[text()='需求']");
	private UIElement TXT_NewCustomer = new UIElement("class=mainlayer___JNm97");
	private UIElement CAL_Time = new UIElement("xpath=//*[@placeholder='请选择日期']");
	private UIElement SPAN_Building = new UIElement("xpath=//*[@class='redStarBox___1Qyfr']/div[1]/div/span");
	private UIElement INP_Company = new UIElement("xpath=//*[text()='公司：']/div/div/div/ul/li/div/input");
	private UIElement SAPN_Industry = new UIElement("xpath=//*[text()='请选择行业']");
	private UIElement INP_ContactPersonOne = new UIElement("xpath=//*[@label='租客']");
	private UIElement INP_ContactPersonOneTel = new UIElement("name=contactTel1");
	private UIElement SPAN_VisitingRoute = new UIElement("xpath=//*[text()='请选择渠道']");
	private UIElement INP_IntentRoom = new UIElement("name=intentRoomInfo");
	private UIElement INP_Area = new UIElement("xpath=//*[text()='需求面积：']/div/div/span");

	private UIElement TXT_Uncategorized = new UIElement("xpath=//*[@class='ant-radio-group']/label[1]/span[1]/input");
	private UIElement TXT_PotentialCustomers = new UIElement(
			"xpath=//*[@class='ant-radio-group']/label[2]/span[1]/input");
	private UIElement TXT_IntentionCustomers = new UIElement(
			"xpath=//*[@class='ant-radio-group']/label[3]/span[1]/input");
	private UIElement INP_Note = new UIElement("name=note");
	private UIElement BTN_Submit = new UIElement("xpath=//*[text()='提交']");
	private UIElement BTN_ChannelType = new UIElement("xpath=//*[text()='渠道类型：']/div[1]/div/div");
	private UIElement INP_ChannelContactPerson = new UIElement(
			"xpath=//*[text()='联系人：']/span/div/div/div/ul/li/div/input");
	private UIElement TXT_ClientManagent = new UIElement("xpath=//*[text()='客户管理']");
	private UIElement TXT_MyClient = new UIElement("xpath=//*[text()='我的客户']");
	private UIElement TXT_PublicPool = new UIElement("xpath=//*[text()='公共池']");
	private UIElement BTN_ClientType = new UIElement("xpath=//*[@class='ant-select-selection__rendered']/div");
	private UIElement BTN_LostClient = new UIElement("xpath=//li[text()='流失客户']");
	private UIElement BTN_PotentialClient = new UIElement("xpath=//li[text()='潜在客户']");
	private UIElement BTN_Caurse = new UIElement("xpath=//*[text()='请选择原因']");
	private UIElement BTN_PriceCaurse = new UIElement("xpath=//*[text()='价格因素']");
	private UIElement TXT_StatusModifyCaurse = new UIElement("xpath=//*[text()='状态修改原因：']");
	private UIElement TXT_StatusModifyClientCaurse = new UIElement("id=memo");
	private UIElement BTN_Reminder = new UIElement("xpath=//*[text()='提醒事项']");
	private UIElement TXT_ReminderTime = new UIElement("xpath=//*[text()='提醒时间']");
	private UIElement TXT_ReminderContent = new UIElement("xpath=//*[@placeholder='请输入提醒内容']");
	private UIElement BTN_Confirm = new UIElement("xpath=//*[text()='确认']");
	private UIElement BTN_Workflow = new UIElement("xpath=//*[text()='工作流']");
	private UIElement BTN_Merchants = new UIElement("xpath=//*[text()='招商类']");

	// 我的客户表格上的element
	private UIElement BTN_WayCheck = new UIElement("xpath=//*[@class='ant-table-thead']/tr/th[6]/span/i");
	private UIElement TXT_doors = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[6]");
	private UIElement BTN_Confirm1 = new UIElement("xpath=//*[text()='确定']");
	private UIElement BTN_Intention = new UIElement("//*[@class='ant-table-thead']/tr/th[9]/span/i");
	private UIElement TXT_unclassifieds = new UIElement("//*[@class='ant-table-row  ant-table-row-level-0']/td[9]");

	public UIElement CheckElement1(String way) {
		return new UIElement("xpath=//*[contains(text(),'" + way + "')]");
	}

	public UIElement CheckElement2(String intention) {
		return new UIElement("xpath=//*[@class='ant-table-filter-dropdown']//span[text()='" + intention + "']");
	}

	private UIElement SelectBuilding(String choose) {
		return new UIElement("xpath=//*[@role='menu']/li[1]/ul/li[text()='" + choose + "']");
	}

	private UIElement SelectElement(String choose) {
		return new UIElement("xpath=//*[@role='menu']/li[text()='" + choose + "']");
	}

	private UIElement checkElement(String choose) {
		return new UIElement("xpath=//*[text()='" + choose + "']");
	}

	// 短信的element

	private UIElement BTN_Function = new UIElement("//*[text()='功能选择']");
	private UIElement BTN_MessageAll = new UIElement("//*[text()='发送所有人']");
	private UIElement BTN_MessageAllYes = new UIElement("//*[text()='是']");
	private UIElement INP_Message = new UIElement("//*[@class='ant-input']");
	private UIElement BTN_Send = new UIElement("//*[text()='发 送']");
	private UIElement TXT_hintPay = new UIElement("//*[text()='金额不足，请进行充值']");

	// 新建客户的keyword
	public void clickMerchantsManagement() {
		this.driver.click(TXT_MerchManagent);
	}

	public boolean clickNewCustomer() {
		this.driver.click(BTN_NewCustomer);
		return this.driver.waitForElement(INP_ContactPersonOne, 5);
	}

	public void inputCustomerInfo(String time, String building, String company, String industry,
			String contactPersonOne, String contactPersonOneTel) {
		this.driver.selectDate(CAL_Time, TXT_NewCustomer, time);
		this.driver.click(SPAN_Building);
		this.driver.click(this.SelectBuilding(building));
		this.driver.elementSendText(INP_Company, company);
		this.driver.click(SAPN_Industry);
		this.driver.click(this.SelectElement(industry));
		this.driver.elementSendText(INP_ContactPersonOne, contactPersonOne);
		this.driver.elementSendText(INP_ContactPersonOneTel, contactPersonOneTel);
	}

	public void ChooseIntentionAnalysis(String visitingRoute, String intentRoom, String area) {
		this.driver.click(SPAN_VisitingRoute);
		this.driver.click(this.SelectElement(visitingRoute));
		this.driver.elementSendText(INP_IntentRoom, intentRoom);
		this.driver.click(INP_Area);
		this.driver.click(this.SelectElement(area));
	}

	public void Choose_channel_type(String channelType, String channelContactPerson) {
		this.driver.click(BTN_ChannelType);
		this.driver.click(this.SelectElement(channelType));
		this.driver.elementSendText(INP_ChannelContactPerson, "1");
		this.driver.click(this.SelectElement(channelContactPerson));
	}

	public void ChooseCustomerStatus(String customerStatus, String customerNotes) {
		if (customerStatus.equals("未分类")) {
			this.driver.click(TXT_Uncategorized);
		} else if (customerStatus.equals("潜在客户")) {
			this.driver.click(TXT_PotentialCustomers);
		} else if (customerStatus.equals("意向客户")) {
			this.driver.click(TXT_IntentionCustomers);
		}
		this.driver.elementSendText(INP_Note, customerNotes);
	}

	public void Submit() {
		this.driver.click(BTN_Submit);
	}

	public boolean AddedCustomerSuccess(String contactPersonOne) {
		return this.driver.waitForElement(this.checkElement(contactPersonOne), 30);
	}

	public void goto_my_client() {
		this.driver.waitAndClick(TXT_MerchManagent, 2);
		this.driver.waitAndClick(TXT_ClientManagent, 2);
	}

	public void change_client_to_lost(String client) {
		this.driver.waitAndClick(this.checkElement(client), 2);
		this.driver.waitAndClick(BTN_ClientType, 2);
		this.driver.waitAndClick(BTN_LostClient, 2);
		this.driver.waitAndClick(BTN_Caurse, 2);
		this.driver.waitAndClick(BTN_PriceCaurse, 2);
		this.driver.click(TXT_StatusModifyCaurse);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_Submit, 2);
	}

	public boolean client_in_public_pool(String client) {
		this.driver.refresh();
		this.driver.waitAndClick(TXT_ClientManagent, 2);
		this.driver.waitAndClick(TXT_PublicPool, 2);
		return this.driver.isElementFound(this.checkElement(client));
	}

	public void goto_public_pool() {
		this.driver.waitAndClick(TXT_MerchManagent, 2);
		this.driver.waitAndClick(TXT_ClientManagent, 2);
		this.driver.waitAndClick(TXT_PublicPool, 2);
	}

	public void change_client_to_myclient(String client) {
		this.driver.waitAndClick(this.checkElement(client), 2);
		this.driver.waitAndClick(BTN_ClientType, 2);
		this.driver.waitAndClick(BTN_PotentialClient, 2);
		this.driver.waitForElement(TXT_StatusModifyClientCaurse, 2);
		this.driver.elementSendText(TXT_StatusModifyClientCaurse, "213");
		this.driver.click(BTN_Submit);
	}

	public boolean client_in_my_client(String client) {
		this.driver.refresh();
		this.driver.waitAndClick(TXT_ClientManagent, 2);
		this.driver.waitAndClick(TXT_MyClient, 2);
		return this.driver.waitForElement(this.checkElement(client), 5);

	}

	public void edit_customer_reminder(String client, String time, String content) {
		this.driver.waitAndClick(this.checkElement(client), 2);
		this.driver.click(BTN_Reminder);
		this.driver.selectDate(CAL_Time, TXT_ReminderTime, time);
		this.driver.elementSendText(TXT_ReminderContent, content);
		this.driver.click(BTN_Confirm);

	}

	public boolean verify_whether_remind(String client) {
		this.driver.refresh();
		this.driver.click(BTN_Workflow);
		this.driver.waitAndClick(BTN_Merchants, 2);
		return this.driver.waitForElement(this.checkElement(client), 5);
	}

	public void click_screen_way() {
		this.driver.click(BTN_WayCheck);

	}

	public void checkWay(String way) {
		this.driver.click(this.CheckElement1(way));

	}

	public List<String> doorsuccessfully(UIElement txt) {

		return this.driver.allElementsGetText(txt);

	}

	public List<String> wayList() {
		// TODO Auto-generated method stub
		this.driver.sleep(5000);
		return this.doorsuccessfully(TXT_doors);
	}

	public void click_intention() {
		this.driver.click(BTN_Intention);

	}

	public void clickConfirm() {
		// TODO Auto-generated method stub
		this.driver.click(BTN_Confirm1);

	}

	public void checkIntention(String intention) {
		// TODO Auto-generated method stub
		this.driver.click(this.CheckElement2(intention));
	}

	public List<String> unclassifiedsuccessfully(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	public List<String> intentionList() {
		// TODO Auto-generated method stub
		this.driver.sleep(5000);
		return this.unclassifiedsuccessfully(TXT_unclassifieds);
	}

	public void checkFunction() {
		this.driver.click(BTN_Function);

	}

	public void clickAll() {
		// TODO Auto-generated method stub
		this.driver.click(BTN_MessageAll);

	}

	public void clickAllYes() {
		// TODO Auto-generated method stub
		this.driver.click(BTN_MessageAllYes);

	}

	public void inputMessage(String message) {
		// TODO Auto-generated method stub
		this.driver.elementSendText(INP_Message, message);
	}

	public void clickSend() {
		// TODO Auto-generated method stub
		this.driver.click(BTN_Send);

	}

	public boolean hitPay() {
		// TODO Auto-generated method stub
		return this.driver.waitForElement(TXT_hintPay, 5);

	}

}
