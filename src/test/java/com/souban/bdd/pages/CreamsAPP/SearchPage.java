package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class SearchPage extends ParentPage {

	private static final UIElement TXT_Contract = null;

	public SearchPage(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// 房源搜索
	private UIElement INP_Search1 = new UIElement(
			"id=com.souban.creams.debug:id/searchFl",
			"xpath=//XCUIElementTypeStaticText[@name='搜索']/parent::XCUIElementTypeOther");

	private UIElement INP_Search2 = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/search']",
			"xpath=//XCUIElementTypeImage[@name='App_SearchBar_Icon']/following-sibling::XCUIElementTypeTextField");

	public UIElement roomElement(String room) {
		return new UIElement("xpath=//android.widget.TextView[@text='" + room + "']",
				"xpath=//XCUIElementTypeStaticText[@name='" + room + "']");
	}

	public UIElement TXT_RoomPriceAndroid(String room) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + room + "']/following-sibling::android.widget.TextView[1]",
				"");
	}

	public UIElement TXT_RoomAreaElement(String room) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + room + "']/following-sibling::android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[@name='" + room
						+ "']/following-sibling::XCUIElementTypeStaticText[1]");
	}

	public UIElement TXT_RoomStateElement(String room) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + room + "']/following-sibling::android.widget.TextView[3]",
				"xpath=//XCUIElementTypeStaticText[@name='" + room
						+ "']/following-sibling::XCUIElementTypeStaticText[2]");
	}

	// 合同搜索
	private UIElement BTN_Contract = new UIElement("xpath=//android.widget.TextView[@text='租赁合同']",
			"xpath=//XCUIElementTypeStaticText[@name='租赁合同']");

	public UIElement TXT_Contract(String tenant) {
		return new UIElement("xpath=//android.widget.TextView[@text='" + tenant + "']",
				"xpath=//XCUIElementTypeStaticText[@name='" + tenant + "']");
	}

	public UIElement TXT_ContractBuildind(String tenant) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + tenant + "']/following-sibling::android.widget.TextView",
				"");
	}

	/*
	 * public UIElement TXT_AllContract(String tenant){ return new
	 * UIElement("","xpath=//XCUIElementTypeStaticText[contains(@name,'"+tenant+
	 * "')]/ancestor::XCUIElementTypeCell[1]//XCUIElementTypeStaticText"); }
	 */

	public UIElement TXT_ContractRoom(String tenant) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + tenant
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[contains(@name,'" + tenant
						+ "')]/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]//XCUIElementTypeStaticText [4]");
	}

	public UIElement TXT_ContçractArea(String tenant) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + tenant
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[contains(@name,'" + tenant
						+ "')]/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]//XCUIElementTypeStaticText [5]");
	}

	public UIElement TXT_ContractPrice(String tenant) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + tenant
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[contains(@name,'" + tenant
						+ "')]/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]//XCUIElementTypeStaticText [6]");
	}

	public UIElement TXT_ContractPriceUnit(String tenant) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + tenant
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[2]",
				"");
	}

	public UIElement TXT_ContractStartDay(String tenant) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + tenant
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[4]",
				"xpath=//XCUIElementTypeStaticText[contains(@name,'" + tenant
						+ "')]/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]//XCUIElementTypeStaticText [4]");
	}

	public UIElement TXT_ContractEndDay(String tenant) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + tenant
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[4]",
				"xpath=//XCUIElementTypeStaticText[contains(@name,'" + tenant
						+ "')]/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]//XCUIElementTypeStaticText [5]");
	}

	// 客户搜索
	private UIElement BTN_Customer = new UIElement("xpath=//android.widget.TextView[@text='客户']",
			"xpath=//XCUIElementTypeStaticText[@name='客户']");

	public UIElement TXT_CustomerElement(String customer) {
		return new UIElement("xpath=//android.widget.TextView[@text='" + customer + "']",
				"xpath=//XCUIElementTypeStaticText[@name='" + customer + "']");
	}

	public UIElement TXT_CustomerStateELement(String customer) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + customer + "']/following-sibling::android.widget.TextView",
				"xpath=//XCUIElementTypeStaticText[@name='" + customer
						+ "']/following-sibling::XCUIElementTypeStaticText");
	}

	public UIElement TXT_LeaseConsultant(String customer) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + customer
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[@name='" + customer
						+ "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[4]");
	}

	public UIElement TXT_VisitingTime(String customer) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + customer
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[@name='" + customer
						+ "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[5]");
	}

	public UIElement TXT_DemandArea(String customer) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + customer
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[@name='" + customer
						+ "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[6]");
	}

	public UIElement TXT_Channel(String customer) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + customer
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[@name='" + customer
						+ "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]//XCUIElementTypeStaticText[3]");
	}

	public UIElement TXT_IntentionOfHousing(String customer) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + customer
						+ "']/ancestor::android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[@name='" + customer
						+ "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]//XCUIElementTypeStaticText[4]");
	}

	public UIElement TXT_LatesNote(String customer) {
		return new UIElement("", "xpath=//XCUIElementTypeStaticText[@name='" + customer
				+ "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[4]//XCUIElementTypeStaticText[2]");
	}

	// 房源搜索方法
	public void ClickSearchBox() {
		this.driver.click(INP_Search1);
	}
	/*
	 * public void ClickSearchBox1(){ this.driver.waitForElement(INP_Search2,3);
	 * this.driver.click(INP_Search2); }
	 */

	//断言
	public boolean checkSearch() {
		return this.driver.waitForElement(INP_Search2,5);
	}
	
	public void SendRoom(String RoomNub) {
		this.driver.elementSendText(INP_Search2, RoomNub);
		
	}

	/*
	 * public void Room2(String RoomNub2){
	 * this.driver.elementSendText(INP_Search2, RoomNub2);
	 * this.driver.hideKeyBoard(); }
	 */

	public boolean CheakRoom(String Room) {
		return this.driver.waitForElement(this.roomElement(Room), 3);
	}

	public String Text(String Room) {

		return this.driver.elementGetText(this.TXT_RoomAreaElement(Room)) + ","
				+ this.driver.elementGetText(this.TXT_RoomStateElement(Room));
	}

	public String RoomInfoAndroid(String room) {
		return this.driver.elementGetText(this.TXT_RoomPriceAndroid(room)) + ","
				+ this.driver.elementGetText(this.TXT_RoomAreaElement(room)) + ","
				+ this.driver.elementGetText(this.TXT_RoomStateElement(room));
	}

	// 合同搜索方法
	public void ClickTenanl() {
		this.driver.waitAndClick(BTN_Contract, 1);
	}

	public void Tenant(String tenant) {
		this.driver.elementSendText(INP_Search2, tenant);
	}

	public boolean checkTenant(String tenant) {
		this.driver.sleep(1000);
		return this.driver.waitForElement(this.TXT_Contract(tenant), 3);
	}

	public String PriceUnitInfo(String tenant) {
		return this.driver.elementGetText(TXT_ContractPriceUnit(tenant));
	}

	public String ContractText(String tenant) {
		return this.driver.elementGetText(this.TXT_Contract(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContractRoom(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContçractArea(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContractPrice(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContractStartDay(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContractEndDay(tenant));

	}

	public String ContractTextAndroid(String tenant) {
		return this.driver.elementGetText(TXT_ContractBuildind(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContractRoom(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContçractArea(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContractPrice(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContractStartDay(tenant)) + ","
				+ this.driver.elementGetText(TXT_ContractEndDay(tenant));
	}

	// 客户搜索方法
	public void ClickCustomer() {
		this.driver.waitAndClick(BTN_Customer, 1);
	}

	public void Customer(String customer) {
		this.driver.elementClearSendText(INP_Search2, customer);
	}

	public boolean CheckCustomer(String customer) {
		return this.driver.waitForElement(this.TXT_CustomerElement(customer), 3);
	}

	public String CustomerInfo(String customer) {
		this.driver.waitForElement(TXT_CustomerStateELement(customer), 3);
		return this.driver.elementGetText(this.TXT_CustomerStateELement(customer)) + ","
				+ this.driver.elementGetText(TXT_LeaseConsultant(customer)) + ","
				+ this.driver.elementGetText(TXT_VisitingTime(customer)) + ","
				+ this.driver.elementGetText(TXT_DemandArea(customer)) + ","
				+ this.driver.elementGetText(TXT_Channel(customer)) + ","
				+ this.driver.elementGetText(TXT_IntentionOfHousing(customer)) + ","
				+ this.driver.elementGetText(TXT_LatesNote(customer));
	}

	public String CustomerTextAndroid(String customer) {
		return this.driver.elementGetText(this.TXT_CustomerStateELement(customer)) + ","
				+ this.driver.elementGetText(TXT_LeaseConsultant(customer)) + ","
				+ this.driver.elementGetText(TXT_VisitingTime(customer)) + ","
				+ this.driver.elementGetText(TXT_DemandArea(customer)) + ","
				+ this.driver.elementGetText(TXT_Channel(customer)) + ","
				+ this.driver.elementGetText(TXT_IntentionOfHousing(customer));
	}
}
