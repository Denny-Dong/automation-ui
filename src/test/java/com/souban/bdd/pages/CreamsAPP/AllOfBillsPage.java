package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

import java.util.List;

public class AllOfBillsPage extends ParentPage {

	public AllOfBillsPage(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// 搜索账单
	// 所有账单按钮
	private UIElement BTN_AllBills = new UIElement("id=com.souban.creams.debug:id/allBillTv",
			"xpath=//XCUIElementTypeStaticText[@name='所有账单']");

	// 搜索框按钮
	private UIElement BTN_Search = new UIElement("id=com.souban.creams.debug:id/searchTv",
			"xpath=//XCUIElementTypeTextField[@value='搜索对方名称或房号']");

	// 搜索框输入
	private UIElement INP_Search = new UIElement("id=com.souban.creams.debug:id/searchEt",
			"xpath=//XCUIElementTypeTextField[@value='搜索对方名称或房号']");

	// 对方名称
	private UIElement TXT_OtherNameElement(String otherName) {
		return new UIElement("xpath=//android.widget.TextView[@text='" + otherName + "']",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName + "']");
	}

	// 房号
	private UIElement TXT_RoomNubElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	}

	// 需收付金额
	private UIElement TXT_NeedMoneyElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[3]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[3]");
	}

	// 结清状态
	private UIElement TXT_CloseStatusElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");
	}

	// 费用类型
	private UIElement TXT_RentTypeElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName + "']/following-sibling::android.widget.TextView",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
	}

	// 楼宇名称
	private UIElement TXT_BuildingNameElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.TableLayout/android.widget.TableRow[4]/android.widget.TextView[1]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
	}

	// 账单金额
	private UIElement TXT_BillAmountElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.TableLayout/android.widget.TableRow[4]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
	}

	// 实收付金额
	private UIElement TXT_ActualAmountElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.TableLayout/android.widget.TableRow[4]/android.widget.TextView[3]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[2]");
	}

	// 开票状态
	private UIElement TXT_InvoiceStatusElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.TableLayout/android.widget.TableRow[6]/android.widget.TextView[1]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
	}

	// 开票金额
	private UIElement TXT_InvoiceAmountElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.TableLayout/android.widget.TableRow[6]/android.widget.TextView[2]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
	}

	// 应收付时间
	private UIElement TXT_ActualTimeElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.TableLayout/android.widget.TableRow[6]/android.widget.TextView[3]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[2]");
	}

	// 计费周期
	private UIElement TXT_BillingCycleElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.TableLayout/android.widget.TableRow[8]/android.widget.TextView",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
	}

	// 逾期状态
	private UIElement TXT_OverdueDayElement(String otherName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + otherName
						+ "']/ancestor::android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[4]",
				"xpath=//XCUIElementTypeStaticText[@name='" + otherName
						+ "']/ancestor::XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[4]");
	}

	// 账单列表
	// 筛选
	private UIElement BTN_Filter = new UIElement("id=com.souban.creams.debug:id/filterIv",
			"id=Merchant Button Filter highlig");

	// 重置
	// private UIElement BTN_Reset = new
	// UIElement("id=com.souban.creams.debug:id/reset","xpath=//XCUIElementTypeButton[@name='重置']");

	// 筛选条件
	private UIElement BTN_ScreeningConditionsElement(String condition) {
		return new UIElement("xpath=//android.widget.CheckBox[@text='"+condition+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+condition+"']");
	}

	// 确定
	private UIElement BTN_Confirm = new UIElement(
			"id=com.souban.creams.debug:id/confirmTv",
			"xpath=//XCUIElementTypeButton[@name='确定']");

	// 自建未结清
	private UIElement BTN_ManualSet = new UIElement("id=com.souban.creams.debug:id/manualSettleInProgressRb",
			"xpath=//XCUIElementTypeStaticText[@name='自建未结清']");

	// 账单列表IOS元素获取
	// 房号
	private UIElement TXT_IOSRoomNubElement(String otherName) {
		return new UIElement("", "xpath=//XCUIElementTypeStaticText[@name='" + otherName
				+ "']/ancestor::XCUIElementTypeCollectionView/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[1]");
	}

	// 需收付金额
	private UIElement TXT_IOSNeedMoneyElement(String otherName) {
		return new UIElement("", "xpath=//XCUIElementTypeStaticText[@name='" + otherName
				+ "']/ancestor::XCUIElementTypeCollectionView/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[3]");
	}

	// 结清状态
	private UIElement TXT_IOSCloseStatusElement(String otherName) {
		return new UIElement("", "xpath=//XCUIElementTypeStaticText[@name='" + otherName
				+ "']/ancestor::XCUIElementTypeCollectionView/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[2]");
	}

	// 逾期状态
	private UIElement TXT_IOSOverdueDayElement(String otherName) {
		return new UIElement("", "xpath=//XCUIElementTypeStaticText[@name='" + otherName
				+ "']/ancestor::XCUIElementTypeCollectionView/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[4]");
	}

	// 账单详情
	// 账单信息
	private UIElement TXT_BillAmountDetails = new UIElement("id=com.souban.creams.debug:id/bill_amount",
			"xpath=//XCUIElementTypeStaticText[@name='账单金额']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_PayedAmountDetails = new UIElement("id=com.souban.creams.debug:id/payed_amount",
			"xpath=//XCUIElementTypeStaticText[@name='实收金额']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_NeedIncomeDetails = new UIElement("id=com.souban.creams.debug:id/need_income",
			"xpath=//XCUIElementTypeStaticText[@name='需收金额']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_TypeDetails = new UIElement("id=com.souban.creams.debug:id/type",
			"xpath=//XCUIElementTypeStaticText[@name='费用类型']/following-sibling::XCUIElementTypeStaticText");

	//private UIElement TXT_BillNumberDetails = new UIElement("id=com.souban.creams.debug:id/bill_number",
	//		"xpath=//XCUIElementTypeStaticText[@name='账单编号']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_DateScopeDetails = new UIElement("id=com.souban.creams.debug:id/date_scope",
			"xpath=//XCUIElementTypeStaticText[@name='计费周期']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_PrimeDateDetails = new UIElement("id=com.souban.creams.debug:id/prime_date",
			"xpath=//XCUIElementTypeStaticText[@name='应收时间']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_CreateDateDetails = new UIElement("id=com.souban.creams.debug:id/create_date",
			"xpath=//XCUIElementTypeStaticText[@name='创建时间']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_FollowPeopleDetails = new UIElement("id=com.souban.creams.debug:id/follow_people",
			"xpath=//XCUIElementTypeStaticText[@name='跟进人']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_NoteDetails = new UIElement("id=com.souban.creams.debug:id/note",
			"xpath=//XCUIElementTypeStaticText[@name='备注']/following-sibling::XCUIElementTypeStaticText");

	// 付款方信息
	private UIElement TXT_OtherDetails = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/other']",
			"xpath=//XCUIElementTypeStaticText[@name='付款方']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_ContentDetails = new UIElement("id=com.souban.creams.debug:id/contentTv",
			"xpath=//XCUIElementTypeStaticText[@name='付款方联系人']/following-sibling::XCUIElementTypeButton");

	private UIElement TXT_ContractNumberDetails = new UIElement("id=com.souban.creams.debug:id/contract_number",
			"xpath=//XCUIElementTypeStaticText[@name='合同编号']/following-sibling::XCUIElementTypeButton");

	// 房源信息
	private UIElement TXT_BuildingNameDetails = new UIElement("id=com.souban.creams.debug:id/buildingNameTv",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");

	private UIElement TXT_BuildingLocationDetails = new UIElement("id=com.souban.creams.debug:id/buildingLocationTv",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");

	private UIElement TXT_FloorDetails = new UIElement("id=com.souban.creams.debug:id/floorTv",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCell[3]//XCUIElementTypeButton");

	private UIElement TXT_AreaDetails = new UIElement("id=com.souban.creams.debug:id/sizeTv",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCell[3]//XCUIElementTypeStaticText");

	// 收支流水信息
	private UIElement TXT_OppositeNameDetails = new UIElement("id=com.souban.creams.debug:id/opposite_name",
			"xpath=//XCUIElementTypeStaticText[@name='对方单位名称']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_DebitCreditDetails = new UIElement("id=com.souban.creams.debug:id/debit_and_credit",
			"xpath=//XCUIElementTypeStaticText[@name='借贷标']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_OccurrenceAmountDetails = new UIElement(
			"xpath=//android.widget.TextView[@text='发生额']/following-sibling::android.widget.TextView",
			"xpath=//XCUIElementTypeStaticText[@name='发生额']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_MatchedAmountDetails = new UIElement("id=com.souban.creams.debug:id/matched_amount",
			"xpath=//XCUIElementTypeStaticText[@name='匹配金额']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_IncomeDateDetails = new UIElement("id=com.souban.creams.debug:id/income_date",
			"xpath=//XCUIElementTypeStaticText[@name='入账日期']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_DigestDetails = new UIElement("id=com.souban.creams.debug:id/digest",
			"xpath=//XCUIElementTypeStaticText[@name='摘要']/following-sibling::XCUIElementTypeStaticText");

	// 开票记录信息
	private UIElement TXT_InvoiceNameDetails = new UIElement("id=com.souban.creams.debug:id/opposite_name",
			"xpath=//XCUIElementTypeStaticText[@name='购方名称']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_InvoiceNumberDetails = new UIElement("id=com.souban.creams.debug:id/invoice_number",
			"xpath=//XCUIElementTypeStaticText[@name='发票号码']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_InvoiceAmountDetails = new UIElement(
			"xpath=//android.widget.TextView[@text='开票金额']/following-sibling::android.widget.TextView",
			"xpath=//XCUIElementTypeStaticText[@name='开票金额']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_InvoiceStatusDetails = new UIElement("id=com.souban.creams.debug:id/status",
			"xpath=//XCUIElementTypeStaticText[@name='发票状态']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_InvoiceDateDetails = new UIElement("id=com.souban.creams.debug:id/invoice_date",
			"xpath=//XCUIElementTypeStaticText[@name='开票日期']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_InvoiceNoteDetails = new UIElement("id=com.souban.creams.debug:id/note",
			"xpath=//XCUIElementTypeStaticText[@name='购方名称']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");

	// 调整信息
	private UIElement TXT_AdjustAmountDetails = new UIElement(
			"xpath=//android.widget.TextView[@text='调整金额']/following-sibling::android.widget.TextView",
			"xpath=//XCUIElementTypeStaticText[@name='调整金额']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_AdjustTypeDetails = new UIElement("id=com.souban.creams.debug:id/type",
			"xpath=//XCUIElementTypeStaticText[@name='调整类型']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_AdjustDateDetails = new UIElement("id=com.souban.creams.debug:id/date",
			"xpath=//XCUIElementTypeStaticText[@name='调整时间']/following-sibling::XCUIElementTypeStaticText");

	private UIElement TXT_AdjustNoteDetails = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/note' and @index='2']",
			"xpath=//XCUIElementTypeStaticText[@name='调整']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCell//XCUIElementTypeStaticText[@name='备注']/following-sibling::XCUIElementTypeStaticText");

	// 账单状态
	private UIElement TXT_StatusDetails = new UIElement("id=com.souban.creams.debug:id/status",
			"xpath=//XCUIElementTypeStaticText[@name='账单状态']/following-sibling::XCUIElementTypeStaticText");

	// 添加备注
	// 详情页更多操作按钮
	private UIElement BTN_More = new UIElement("id=com.souban.creams.debug:id/moreIv",
			"xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem More']");

	// 备注
	private UIElement BTN_Note = new UIElement("id=com.souban.creams.debug:id/noteTv",
			"xpath=(//XCUIElementTypeStaticText[@name='备注'])[2]");

	// 合同跳转
	// 合同详情标题
	private UIElement TXT_Contract = new UIElement("xpath=//android.widget.TextView[@text='合同详情']",
			"xpath=//XCUIElementTypeOther[@name='合同详情']");

	// 合同租客
	private UIElement TXT_Tenant = new UIElement("id=com.souban.creams.debug:id/tenant",
			"xpath=//XCUIElementTypeStaticText[@name='租客']/following-sibling::XCUIElementTypeStaticText");

	// 房源跳转
	// 房源信息标题
	private UIElement TXT_TabLayout = new UIElement("id=com.souban.creams.debug:id/tabLayout",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']");

	// 房号信息
	private UIElement TXT_Title = new UIElement("id=com.souban.creams.debug:id/titleTv",
			"xpath=//XCUIElementTypeButton[@name='Button cell']/following-sibling::XCUIElementTypeStaticText");

	//筛选重置按钮
	private UIElement BTN_Reset = new UIElement("id=com.souban.creams.debug:id/resetTv","");

	//费用类型筛选条件
	private UIElement BTN_Rent(String rent){
		return new UIElement("xpath=//android.widget.CheckBox[@text='" + rent + "']", "");
	}

	//列表费用类型
	private UIElement TXT_ListType = new UIElement("id=com.souban.creams.debug:id/rentTypeTv","");

	//账单类型筛选条件
	private UIElement BTN_BillType(String billType){
		return  new UIElement("xpath=//android.widget.CheckBox[@text='"+billType+"']","");
	}

	//列表账单类型
	private UIElement TXT_ListBillType = new UIElement("id=com.souban.creams.debug:id/needMoneyTv","");


	//逾期状态筛选条件
	private UIElement BTN_OverdueState(String overdueState){
		return new UIElement("xpath=//android.widget.CheckBox[@text='"+overdueState+"']","");
	}

	//列表逾期状态
	private UIElement TXT_ListOverdue = new UIElement("id=com.souban.creams.debug:id/overdueDayTv","");

	//结清状态筛选条件
	private UIElement BTN_SettleState(String settleState){
		return new UIElement("xpath=//android.widget.CheckBox[@text='"+settleState+"']","");}

	//列表结清状态
	private UIElement TXT_ListSettle = new UIElement("id=com.souban.creams.debug:id/billCloseStatusTv","");

	//账单显示筛选条件
	private UIElement BTN_ShowClosedBill(String closedBill) {
		return new UIElement("xpath=//android.widget.CheckBox[@text='"+closedBill+"']","");
	}

	//列表显示自建账单
	private UIElement TXT_ListClosedBill(String otherName) {
		return new UIElement("xpath=//android.widget.TextView[@text='" + otherName + "']", ""); }

	//折叠按钮
	private UIElement BTN_Collapse = new UIElement("id=com.souban.creams.debug:id/collapseIv","");

	//对方名称字段
	private UIElement TXT_CollapseOtherName = new UIElement("id=com.souban.creams.debug:id/otherTitleTv","");


	// 搜索账单-方法
	public void ClickAllBills() {

		this.driver.click(BTN_AllBills);
	}

	public void ClickSearch() {
		this.driver.click(BTN_Search);
	}

	public void SearchInput(String otherName) {
		this.driver.elementSendText(INP_Search, otherName);
		this.driver.hideKeyBoard();
	}

	public boolean CheakBills(String otherName) {
		this.driver.sleep(1000);
		this.driver.swipeToUpToFindElement(this.TXT_OtherNameElement(otherName));
		return this.driver.waitForElement(this.TXT_OtherNameElement(otherName), 3);
	}

	public String ActualTime(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_ActualTimeElement(otherName));
		return this.driver.elementGetText(this.TXT_ActualTimeElement(otherName));
	}

	public String OverdueDayInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_OverdueDayElement(otherName));
		return this.driver.elementGetText(this.TXT_OverdueDayElement(otherName));
	}

	// 账单列表-方法
	public void ClickFilter() {
		this.driver.waitForElement(BTN_Filter, 3);
		this.driver.click(BTN_Filter);
	}

	public void ClickScreeningConditions(String condition) {
		this.driver.click(this.BTN_ScreeningConditionsElement(condition));
	}

	public void ClickConfirm() {
		this.driver.click(BTN_Confirm);
	}

	public void ClickManualSet() {
		this.driver.waitForElement(BTN_ManualSet, 3);
		this.driver.click(BTN_ManualSet);
	}

	// android账单列表
	public String RoomNubInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_RoomNubElement(otherName));
		return this.driver.elementGetText(this.TXT_RoomNubElement(otherName));
	}

	public String NeedMoneyInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_NeedMoneyElement(otherName));
		return this.driver.elementGetText(this.TXT_NeedMoneyElement(otherName));
	}

	public String CloseStatusInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_CloseStatusElement(otherName));
		return this.driver.elementGetText(this.TXT_CloseStatusElement(otherName));
	}

	public String OtherNameInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_OtherNameElement(otherName));
		return this.driver.elementGetText(this.TXT_OtherNameElement(otherName));
	}

	public String RentTypeInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_RentTypeElement(otherName));
		return this.driver.elementGetText(this.TXT_RentTypeElement(otherName));
	}

	public String BuildingNameInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_BuildingNameElement(otherName));
		return this.driver.elementGetText(this.TXT_BuildingNameElement(otherName));
	}

	public String BillAmountInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_BillAmountElement(otherName));
		return this.driver.elementGetText(this.TXT_BillAmountElement(otherName));
	}

	public String ActualAmountInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_ActualAmountElement(otherName));
		return this.driver.elementGetText(this.TXT_ActualAmountElement(otherName));
	}

	public String InvoiceStatusInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_InvoiceStatusElement(otherName));
		return this.driver.elementGetText(this.TXT_InvoiceStatusElement(otherName));
	}

	public String InvoiceAmountInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_InvoiceAmountElement(otherName));
		return this.driver.elementGetText(this.TXT_InvoiceAmountElement(otherName));
	}

	public String BillingCycleInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_BillingCycleElement(otherName));
		return this.driver.elementGetText(this.TXT_BillingCycleElement(otherName));
	}

	// IOS账单列表
	public String IOSRoomNubInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_IOSRoomNubElement(otherName));
		return this.driver.elementGetText(this.TXT_IOSRoomNubElement(otherName));
	}

	public String IOSNeedMoneyInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_IOSNeedMoneyElement(otherName));
		return this.driver.elementGetText(this.TXT_IOSNeedMoneyElement(otherName));
	}

	public String IOSCloseStatusInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_IOSCloseStatusElement(otherName));
		return this.driver.elementGetText(this.TXT_IOSCloseStatusElement(otherName));
	}

	public String IOSOverdueDayInfo(String otherName) {
		this.driver.swipeToUpToFindElement(this.TXT_IOSOverdueDayElement(otherName));
		return this.driver.elementGetText(this.TXT_IOSOverdueDayElement(otherName));
	}

	// 账单详情-方法
	public void ClickBills(String otherName) {
		this.driver.sleep(1000);
		this.driver.swipeToUpAndClick(this.TXT_OtherNameElement(otherName));
	}

	public String BillDetailsTopInfo() {

		return this.driver.elementGetText(this.TXT_BillAmountDetails) + ","
				+ this.driver.elementGetText(this.TXT_PayedAmountDetails) + ","
				+ this.driver.elementGetText(this.TXT_NeedIncomeDetails) + ","
				+ this.driver.elementGetText(this.TXT_TypeDetails) + ","
				+ this.driver.elementGetText(this.TXT_DateScopeDetails);
	}

	public String BillDetailsInfo() {
		this.driver.swipeToUpToFindElement(this.TXT_NoteDetails);
		return this.driver.elementGetText(this.TXT_PrimeDateDetails) + ","
				+ this.driver.elementGetText(this.TXT_CreateDateDetails) + ","
				+ this.driver.elementGetText(this.TXT_FollowPeopleDetails) + ","
				+ this.driver.elementGetText(this.TXT_NoteDetails);
	}

	public String BillStatusDetails() {
		this.driver.swipeToUpToFindElement(this.TXT_StatusDetails);
		return this.driver.elementGetText(this.TXT_StatusDetails);
	}

	public String PrimeDateDetails() {
		this.driver.waitForElement(TXT_PrimeDateDetails, 3);
		return this.driver.elementGetText(this.TXT_PrimeDateDetails);
	}

	public String OtherDetailsInfo() {
		this.driver.swipeToUpToFindElement(this.TXT_ContractNumberDetails);
		return this.driver.elementGetText(this.TXT_OtherDetails) + ","
				+ this.driver.elementGetText(this.TXT_ContentDetails);
	}

	public String BuildingDetailsInfo() {
		this.driver.swipeToUpToFindElement(this.TXT_AreaDetails);
		return this.driver.elementGetText(this.TXT_BuildingNameDetails) + ","
				+ this.driver.elementGetText(this.TXT_BuildingLocationDetails) + ","
				+ this.driver.elementGetText(this.TXT_FloorDetails) + ","
				+ this.driver.elementGetText(this.TXT_AreaDetails);
	}

	public String OppositeDetailsInfo() {
		this.driver.swipeToUpToFindElement(this.TXT_DigestDetails);
		return this.driver.elementGetText(this.TXT_OppositeNameDetails) + ","
				+ this.driver.elementGetText(this.TXT_DebitCreditDetails) + ","
				+ this.driver.elementGetText(this.TXT_OccurrenceAmountDetails) + ","
				+ this.driver.elementGetText(this.TXT_MatchedAmountDetails) + ","
				+ this.driver.elementGetText(this.TXT_IncomeDateDetails) + ","
				+ this.driver.elementGetText(this.TXT_DigestDetails);
	}

	public String InvoiceDetailsInfo() {
		this.driver.swipeToUpToFindElement(this.TXT_AdjustNoteDetails);
		return this.driver.elementGetText(this.TXT_InvoiceNameDetails) + ","
				+ this.driver.elementGetText(this.TXT_InvoiceNumberDetails) + ","
				+ this.driver.elementGetText(this.TXT_InvoiceAmountDetails) + ","
				+ this.driver.elementGetText(this.TXT_InvoiceStatusDetails) + ","
				+ this.driver.elementGetText(this.TXT_InvoiceDateDetails) + ","
				+ this.driver.elementGetText(this.TXT_InvoiceNoteDetails);
	}

	public String AdjustDetailsInfo() {
		return this.driver.elementGetText(this.TXT_AdjustAmountDetails) + ","
				+ this.driver.elementGetText(this.TXT_AdjustTypeDetails) + ","
				+ this.driver.elementGetText(this.TXT_AdjustDateDetails) + ","
				+ this.driver.elementGetText(this.TXT_AdjustNoteDetails);
	}

	// 详情页添加备注操作
	public void ClickMore() {
		this.driver.click(BTN_More);
	}

	public void ClickNote() {
		this.driver.click(BTN_Note);
	}

	// 合同跳转
	public void ClickContractNub() {
		this.driver.swipeToUpToFindElement(TXT_ContractNumberDetails);
		this.driver.click(TXT_ContractNumberDetails);
	}

	public boolean CheakContract() {
		return this.driver.waitForElement(TXT_Contract, 3);
	}

	public String TenantInfo() {
		return this.driver.elementGetText(this.TXT_Tenant);
	}

	// 房源跳转
	public void ClickFloor() {
		this.driver.swipeToUpToFindElement(TXT_FloorDetails);
		this.driver.click(TXT_FloorDetails);
	}

	public boolean CheakTabLayout() {
		return this.driver.waitForElement(TXT_TabLayout, 3);
	}

	public String TitleInfo() {
		return this.driver.elementGetText(this.TXT_Title);
	}

	//费用类型筛选方法
	public void ClickReset(){
		this.driver.waitAndClick(this.BTN_Reset,3);
	}

	public void ClickRent(String rent){
		this.driver.click(this.BTN_Rent(rent));
	}

	private List<String> BillFileter(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}

	public List<String> checkCostType(){
		return this.BillFileter(TXT_ListType);
	}

	//账单类型筛选方法
	public void ClickBillType(String billType){
		this.driver.click(this.BTN_BillType(billType));
	}

	public List<String> checkBillType(){
		return this.BillFileter(TXT_ListBillType);
	}

	//逾期状态筛选方法
	public void ClickOverdueState(String overdueState){
		this.driver.swipeToUpAndClick(this.BTN_OverdueState(overdueState));
	}

	public List<String> CheckOverdueState(){
		return this.BillFileter(TXT_ListOverdue);
	}

	//结清状态筛选方法
	public void ClickSettleState(String settleState){
		this.driver.swipeToUpAndClick(this.BTN_SettleState(settleState));

	}

	public List<String> CheckSettleState(){
		return this.BillFileter(TXT_ListSettle);
	}

	//账单显示筛选
	public void ClickClosedBill(String closedBill){
		this.driver.click(this.BTN_ShowClosedBill(closedBill));
	}

	public boolean CheckClosedBill(String otherName){
		return this.driver.swipeToUpToFindElement(this.TXT_ListClosedBill(otherName));
	}

	//折叠按钮方法
	public void ClickCollapse(){
		this.driver.click(BTN_Collapse);
	}

	public boolean CheckCollapse(){
		return this.driver.isElementFound(TXT_CollapseOtherName);
	}

}
