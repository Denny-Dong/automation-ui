package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

import java.util.List;


public class CreamsAPPMarginBalancePage extends ParentPage{

	public CreamsAPPMarginBalancePage(Driver driver) {
		super(driver);
		
	}
	//保证金搜索
	private UIElement BTN_MarginBalance = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/depositTv']",
			"xpath=//XCUIElementTypeStaticText[@name='保证金余额']");
	private UIElement TXT_search = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/searchTv']",
			"xpath=//XCUIElementTypeTextField[@value='搜索对方名称或房号']");
	private UIElement INP_search = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/searchEt']","xpath=//XCUIElementTypeTextField[@value='搜索对方名称或房号']");

	private UIElement NameUIElement(String companyName) {
		return new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/companyNameTv' and @text='"+companyName+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+companyName+"']");
	}



	//搜索列表
	private UIElement RoomNumUIElement(String companyName) {
		return new UIElement("xpath=//*[@text='"+companyName+"']/ancestor::android.widget.TableLayout/preceding-sibling::android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.souban.creams.debug:id/roomNumTv']",
				"xpath=//*[@name='"+companyName+"']/ancestor::XCUIElementTypeCell[1]/preceding-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	}
	private UIElement NeedMoneyUIElement(String companyName) {
		return new UIElement("xpath=//*[@text='"+companyName+"']/ancestor::android.widget.TableLayout/preceding-sibling::android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.souban.creams.debug:id/needMoneyTv']",
				"xpath=//*[@name='"+companyName+"']/ancestor::XCUIElementTypeCell[1]/preceding-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[3]");
	}
	private UIElement BillCloseStatusUIElement(String companyName) {
		return new UIElement("xpath=//*[@text='"+companyName+"']/ancestor::android.widget.TableLayout/preceding-sibling::android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.souban.creams.debug:id/billCloseStatusTv']",
				"xpath=//*[@name='"+companyName+"']/ancestor::XCUIElementTypeCell[1]/preceding-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");
	}
	private UIElement OverDueDayUIElement(String companyName) {
		return new UIElement("xpath=//*[@text='"+companyName+"']/ancestor::android.widget.TableLayout/preceding-sibling::android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.souban.creams.debug:id/overdueDayTv']",
				"xpath=//*[@name='"+companyName+"']/ancestor::XCUIElementTypeCell[1]/preceding-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[4]");
	}
	private UIElement ReceiveTimeUIElement(String companyName) {
		return new UIElement("xpath=//*[@text='"+companyName+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/rentTypeTv']",
				"xpath=//*[@name='"+companyName+"']/parent::XCUIElementTypeOther[1]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
	}
	private UIElement ParkNameUIElement(String companyName) {
		return new UIElement("xpath=//*[@text='"+companyName+"']/parent::	android.widget.TableRow/following-sibling::android.widget.TableRow[2]/android.widget.TextView[@resource-id='com.souban.creams.debug:id/parkNameTv']",
				"xpath=//*[@name='"+companyName+"']/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
	}
	private UIElement BillAmountUIElement(String companyName) {
		return new UIElement("xpath=//*[@text='"+companyName+"']/parent::	android.widget.TableRow/following-sibling::android.widget.TableRow[2]/android.widget.TextView[@resource-id='com.souban.creams.debug:id/billAmountTv']",
				"xpath=//*[@name='"+companyName+"']/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
	}
	private UIElement ActualAmountUIElement(String companyName) {
		return new UIElement("xpath=//*[@text='"+companyName+"']/parent::	android.widget.TableRow/following-sibling::android.widget.TableRow[2]/android.widget.TextView[@resource-id='com.souban.creams.debug:id/actualAmountTv']",
				"xpath=//*[@name='"+companyName+"']/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[2]");
	}
	private UIElement CostTypeUIElement(String companyName) {
		return new UIElement(
				"",
				"xpath=//*[@name='"+companyName+"']/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
	}
	//ios
	private UIElement BTN_complete = new UIElement("","xpath=//*[@name='Toolbar Done Button']");
	
	
	
	//账单详情页
	//账单信息
	private UIElement TXT_billDetailPage = new UIElement(
			"xpath=//*[@text='账单详情']",
			"xpath=//*[@name='账单详情']");
	//账单金额
	private UIElement TXT_billAmount = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/bill_amount']",
			"xpath=//*[@name='账单金额']/following-sibling::XCUIElementTypeStaticText[1]");
	//实收金额
	private UIElement TXT_actualAmount = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/payed_amount']",
			"xpath=//*[@name='实收金额']/following-sibling::XCUIElementTypeStaticText[1]");
	//需收金额
	private UIElement TXT_needMoney = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/need_income']",
			"xpath=//*[@name='需收金额']/following-sibling::XCUIElementTypeStaticText[1]");
	//保证金余额
	private UIElement TXT_depositAmount = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/deposit']",
			"xpath=//*[@name='保证金余额']/following-sibling::XCUIElementTypeStaticText[1]");
	//费用类型
	private UIElement TXT_feelType = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/type']",
			"xpath=//*[@name='费用类型']/following-sibling::XCUIElementTypeStaticText[1]");
	//账单状态
	private UIElement TXT_billStatus = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/status']",
			"xpath=//*[@name='账单状态']/following-sibling::XCUIElementTypeStaticText[1]");
	//账单编号
	private UIElement TXT_billNumber = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/bill_number_title']",
			"xpath=//*[@name='账单编号']");
	//计费周期
	private UIElement TXT_dateScope = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/date_scope']",
			"xpath=//*[@name='计费周期']/following-sibling::XCUIElementTypeStaticText[1]");
	//应收时间
	private UIElement TXT_receiveTime = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/prime_date']",
			"xpath=//XCUIElementTypeStaticText[@name='应收时间']/following-sibling::XCUIElementTypeStaticText[1]");
	//创建时间
	private UIElement TXT_createTime = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/create_date']",
			"xpath=//*[@name='创建时间']/following-sibling::XCUIElementTypeStaticText[1]");
	//跟进人
	private UIElement TXT_followPeople = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/follow_people']",
			"xpath=//*[@name='跟进人']/following-sibling::XCUIElementTypeStaticText[1]");
	//备注
	private UIElement TXT_note = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/note']",
			"xpath=//*[@name='备注']/following-sibling::XCUIElementTypeStaticText[1]");

	//付款方信息
	//付款方
	private UIElement TXT_companyName_payer = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/other']",
			"xpath=//XCUIElementTypeStaticText[@name='付款方']/following-sibling::XCUIElementTypeStaticText[1]");
	//付款方联系人
	private UIElement TXT_companyTel = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/contentTv']",
			"xpath=//*[@name='付款方联系人']/following-sibling::XCUIElementTypeButton[1]");
	//合同编号
	private UIElement TXT_contractNum = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/contract_number_title']",
			"xpath=//*[@name='合同编号']");

	//房源信息
	//楼宇名称
	private UIElement TXT_buildingName = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/buildingNameTv']",
			"xpath=//*[@name='合同编号']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	//楼层/房号
	private UIElement TXT_floor = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/floorTv']",
			"xpath=//*[@name='合同编号']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[3]//XCUIElementTypeButton[1]");
	//面积
	private UIElement TXT_size = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/sizeTv']",
			"xpath=//*[@name='合同编号']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[3]//XCUIElementTypeStaticText[1]");

	//收支流水
	//对方名称
	private UIElement TXT_companyName_income = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/opposite_name']",
			"xpath=//*[@name='对方单位名称']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_debitAndCredit = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/debit_and_credit']",
			"xpath=//*[@name='借贷标']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_sendAmount = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/amount']",
			"xpath=//*[@name='发生额']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_matchAmount = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/matched_amount']",
			"xpath=//*[@name='匹配金额']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_incomeDate= new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/income_date']",
			"xpath=//*[@name='入账日期']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_degest = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/digest']",
			"xpath=//*[@name='摘要']/following-sibling::XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_ajustAmount = new UIElement(
			"xpath=//*[@text='调整金额']/following-sibling::android.widget.TextView[1]",
			"xpath=//*[@name='调整金额']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_ajustType= new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/type']",
			"xpath=//*[@name='调整类型']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_ajustTime = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/date']",
			"xpath=//*[@name='调整时间']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_ajustNote = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/note']",
			"xpath=//*[@name='备注']/following-sibling::XCUIElementTypeStaticText[1]");
	
	
	
	//新增备注
	private UIElement BTN_more = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/moreIv']",
			"xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem More']");
	private UIElement BTN_note = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/noteTv']",
			"xpath=//XCUIElementTypeImage[@name='Merchant_NavigationItem_Remark']/following-sibling::XCUIElementTypeStaticText[@name='备注']");
	private UIElement TXT_notePage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//XCUIElementTypeNavigationBar[@name='备注']");
	
	private UIElement BTN_add = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/addIv']",
			"xpath=//*[@name='Merchant NavigationItem Add']");
	private UIElement TXT_newNotePage = new UIElement(
			"xpath=//*[@text='新增备注']",
			"xpath=//XCUIElementTypeOther[@name='新增备注']");
	private UIElement TXT_addNoteName = new UIElement(
			"",
			"xpath=//*[@name='保存']/parent::XCUIElementTypeNavigationBar[1]/following-sibling::XCUIElementTypeOther//XCUIElementTypeStaticText[1]");
	private UIElement TXT_addNoteDate = new UIElement(
			"",
			"xpath=//*[@name='保存']/parent::XCUIElementTypeNavigationBar[1]/following-sibling::XCUIElementTypeOther//XCUIElementTypeStaticText[2]");
	private UIElement INP_noteContent = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/contentEt']",
			"xpath=//*[@name='保存']/parent::XCUIElementTypeNavigationBar[1]/following-sibling::XCUIElementTypeOther//XCUIElementTypeTextView[1]");
	private UIElement BTN_save = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/saveTv']",
			"xpath=//*[@name='保存']");

	private UIElement NoteContentUIElement(String content) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv' and @text = '"+content+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+content+"']");
	}
	private UIElement NoteNameUIElement(String content) {
		return new UIElement(
				"xpath=//*[@text='"+content+"']/preceding-sibling::android.widget.TextView[3]",
				"xpath=//XCUIElementTypeStaticText[@name='"+content+"']/preceding-sibling::XCUIElementTypeStaticText[2]");
	}
	//本人标识，android存在，ios与name合在一起
	private UIElement MyIdentifyUIElement(String content) {
		return new UIElement(
				"xpath=//*[@text='"+content+"']/preceding-sibling::android.widget.TextView[2]",
				"");
	}
	private UIElement AddTimeUIElement(String content) {
		return new UIElement(
				"xpath=//*[@text='"+content+"']/preceding-sibling::android.widget.TextView[1]",
				"xpath=//XCUIElementTypeStaticText[@name='"+content+"']/preceding-sibling::XCUIElementTypeStaticText[1]");
	}
	//编辑备注
	private UIElement NoteMoreUIElement(String content) {
		return new UIElement(
				"xpath=//*[@text='"+content+"']/following-sibling::	android.widget.ImageView[1]",
				"xpath=//XCUIElementTypeStaticText[@name='"+content+"']/preceding-sibling::XCUIElementTypeButton[1]");
	}
	private UIElement BTN_edit = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/editTv']",
			"xpath=//XCUIElementTypeStaticText[@name='编辑']");
	private UIElement TXT_editPage  = new UIElement(
			"xpath=//*[@text='编辑备注']",
			"xpath=//XCUIElementTypeOther[@name='编辑备注']");
	//删除备注
	private UIElement BTN_delete = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/delTv']",
			"xpath=//XCUIElementTypeStaticText[@name='删除']");
	private UIElement BTN_deleteSure = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/makeSureBtn']",
			"xpath=//*[@name='确定']");
	
	
	//点击合同编号跳转到合同详情页
	private UIElement ContractNumUIElement(String contactNum) {
		return new UIElement(
				"xpath=//*[@resource-id='com.souban.creams.debug:id/contract_number']",
				"xpath=//*[@name='合同编号']/following-sibling::XCUIElementTypeButton[1][@name='"+contactNum+"']");
	}
	private UIElement FloorUIElement(String floor) {
		return new UIElement(
				"xpath=//*[@resource-id='com.souban.creams.debug:id/floorTv']",
				"xpath=//*[@name='合同编号']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[3]//XCUIElementTypeButton[1][@name='"+floor+"']");
	}



	//账单列表
	private UIElement TXT_roomList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/roomNumTv']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	private UIElement TXT_billCloseList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/billCloseStatusTv']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");
	private UIElement TXT_needMoneyList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/needMoneyTv']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[3]");
	private UIElement TXT_overDueDayList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/overdueDayTv']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[4]");
	private UIElement TXT_otherNameList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/otherTitleTv']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[@name='付款方']");
	private UIElement TXT_receiveTimeList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/receiveTimeTitleTv']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[@name='应收时间']");
	private UIElement TXT_buildingNameList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@text='楼宇名称']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[@name='楼宇名称']");
	private UIElement TXT_billAmountList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@text='账单金额']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[@name='账单金额']");
	private UIElement TXT_actualAmountList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/actualAmountTitleTv']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[@name='实收金额']");
	private UIElement TXT_depositTypeList = new UIElement(
			"xpath=//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/depositTypeTitleTv']",
			"xpath=//*[contains(@name,'实收')]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[@name='费用类型']");


	//筛选
	//筛选入口
	private UIElement BTN_filter = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/filterIv']",
			"xpath=//XCUIElementTypeButton[@name='Merchant Button Filter']");
	//筛选页
	private UIElement TXT_filterPage = new UIElement(
			"xpath=//android.widget.TextView[@text='逾期状态']",
			"xpath=//XCUIElementTypeStaticText[@name='逾期状态']");
	//逾期状态
	private UIElement SelectOverDueDayUIElement(String overDueDay){
		return new UIElement(
				"xpath=//*[@resource-id='com.souban.creams.debug:id/dueCheckBox' and @text='"+overDueDay+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+overDueDay+"']");
	}
	//结清状态
	private UIElement SelectBillCloseUIElement(String billClose){
		return new UIElement(
				"xpath=//*[@resource-id='com.souban.creams.debug:id/settleInProcessCheckBox' and @text='"+billClose+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+billClose+"']");
	}
	//确定
	private UIElement BTN_confirm = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/confirmTv' and @text = '确定']",
			"xpath=//XCUIElementTypeButton[@name='确定']");
	private UIElement TXT_allOverDueDayFilter = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/overdueDayTv' ]",
			"xpath=//XCUIElementTypeStaticText[@name='付款方']/ancestor::XCUIElementTypeCell[1]/preceding-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[4]");
	private UIElement TXT_allBillCloseFilter = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/billCloseStatusTv']",
			"xpath=//XCUIElementTypeStaticText[@name='付款方']/ancestor::XCUIElementTypeCell[1]/preceding-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");
	
	
	
	/**
	 * 账单搜索
	 */
	//在导航页点击保证金余额
	public void clickMarginBalance() {
		this.driver.waitAndClick(BTN_MarginBalance, 2);
	}
	//进入保证金余额页
	public boolean intoMarginBalancePage() {
		return this.driver.waitForElement(TXT_search, 10);
	}
	//点击页面上的搜索框
	public void clickSearch() {
		this.driver.waitAndClick(TXT_search, 2);
	}
	//进入搜索页
	public boolean intoSearchPage() {
		return this.driver.waitForElement(INP_search, 2);
	}
	//
	public void inputCompanyName(String companyName) {
	    this.driver.elementClearSendText(INP_search, companyName);
	    //android
	    this.driver.hideKeyBoard();
	    //ios
	    try {
		    if(this.driver.isElementFound(BTN_complete)) {
			    this.driver.click(BTN_complete);
		    }
	    } catch (Exception e) {
		    System.out.println("未找到该元素");
	    }
	}
	//断言
	public boolean checkSearchResult(String companyName) {
		return this.driver.waitForElement(this.NameUIElement(companyName), 5);
	}
	//android
	public String checkSearchInformation_android(String companyName) {
		return this.driver.elementGetText(this.RoomNumUIElement(companyName))+";"+this.driver.elementGetText(this.NeedMoneyUIElement(companyName))
		+";"+this.driver.elementGetText(this.BillCloseStatusUIElement(companyName))+";"+this.driver.elementGetText(this.ReceiveTimeUIElement(companyName))
		+";"+this.driver.elementGetText(this.ParkNameUIElement(companyName))+";"+this.driver.elementGetText(this.BillAmountUIElement(companyName))
		+";"+this.driver.elementGetText(this.ActualAmountUIElement(companyName));
		
	}
	//ios
	public String checkSearchInformation_ios(String companyName) {
		return this.driver.elementGetText(this.RoomNumUIElement(companyName))+";"+this.driver.elementGetText(this.NeedMoneyUIElement(companyName))
		+";"+this.driver.elementGetText(this.BillCloseStatusUIElement(companyName))+";"+this.driver.elementGetText(this.ReceiveTimeUIElement(companyName))
		+";"+this.driver.elementGetText(this.ParkNameUIElement(companyName))+";"+this.driver.elementGetText(this.BillAmountUIElement(companyName))
		+";"+this.driver.elementGetText(this.ActualAmountUIElement(companyName))+";"+this.driver.elementGetText(this.CostTypeUIElement(companyName));
		
	}
	public String checkOverDueDay(String companyName) {
		return this.driver.elementGetText(this.OverDueDayUIElement(companyName));
	}
	//common
	public int getReceiveTime(String companyName) {
		//return this.driver.elementGetText(this.ReceiveTimeUIElement(companyName));
		int days = this.driver.getDays(this.driver.elementGetText(this.ReceiveTimeUIElement(companyName)));
		return days;
	}
	
	
	
	/**
	 * 检查账单详情页
	 */
	public void intoBillDetail(String companyName) {
		this.driver.waitAndClick(this.NameUIElement(companyName), 2);
	}
	public boolean intoBillDetailSuccessful() {
		return this.driver.waitForElement(TXT_billDetailPage, 5);
	}
	//检查账单信息
	public String checkBillAmount() {
		this.driver.swipeToUpAndClick(TXT_billAmount);
		return this.driver.elementGetText(TXT_billAmount);
	}
	public String checkActualAmount() {
		this.driver.swipeToUpAndClick(TXT_actualAmount);
		return this.driver.elementGetText(TXT_actualAmount);
	}
	public String checkNeedMoney() {
		this.driver.swipeToUpAndClick(TXT_needMoney);
		return this.driver.elementGetText(TXT_needMoney);
	}
	public String checkDepositAmount() {
		this.driver.swipeToUpAndClick(TXT_depositAmount);
		return this.driver.elementGetText(TXT_depositAmount);
	}
	public String checkFeelType() {
		this.driver.swipeToUpAndClick(TXT_feelType);
		return this.driver.elementGetText(TXT_feelType);
	}
	public String checkBillStatus() {
		this.driver.swipeToUpAndClick(TXT_billStatus);
		return this.driver.elementGetText(TXT_billStatus);
	}
	public String checkBillNumber() {
		this.driver.swipeToUpAndClick(TXT_billNumber);
		return this.driver.elementGetText(TXT_billNumber);
	}
	public String checkDateScope() {
		this.driver.swipeToUpAndClick(TXT_dateScope);
		return this.driver.elementGetText(TXT_dateScope);
	}
	public String checkReceiveTime() {
		this.driver.swipeToUpAndClick(TXT_receiveTime);
		return this.driver.elementGetText(TXT_receiveTime);
	}
	//通过应收时间获取天数
	public int getReceiveTime() {
		int days = this.driver.getDays(this.driver.elementGetText(TXT_receiveTime));
		return days;
	}
	public String checkCreateTime() {
		this.driver.swipeToUpAndClick(TXT_createTime);
		return this.driver.elementGetText(TXT_createTime);
	}
	public String checkFollowPeople() {
		this.driver.swipeToUpAndClick(TXT_followPeople);
		return this.driver.elementGetText(TXT_followPeople);
	}
	public String checkNote() {
		this.driver.swipeToUpAndClick(TXT_note);
		return this.driver.elementGetText(TXT_note);
	}
	//检查付款方信息
	public String checkCompanyInformation() {
		this.driver.swipeToUpToFindElement(TXT_contractNum);
		return this.driver.elementGetText(TXT_companyName_payer)+","+this.driver.elementGetText(TXT_companyTel)
		+","+this.driver.elementGetText(TXT_contractNum);
	}
	
	//检查房源信息
	public String checkRoomInformation() {
		this.driver.swipeToUpToFindElement(TXT_size);
		return this.driver.elementGetText(TXT_buildingName)
		+","+this.driver.elementGetText(TXT_floor)+","+this.driver.elementGetText(TXT_size);
	}	
	//检查收支流水内容
	public String checkIncomeInformation() {
		this.driver.swipeToUpToFindElement(TXT_degest);
		return this.driver.elementGetText(TXT_companyName_income)+","+this.driver.elementGetText(TXT_debitAndCredit)
		+","+this.driver.elementGetText(TXT_sendAmount)+","+this.driver.elementGetText(TXT_matchAmount)
		+","+this.driver.elementGetText(TXT_incomeDate)+","+this.driver.elementGetText(TXT_degest);
	}
	
	//检查调整内容
	public String checkAjustInformation() {
		this.driver.swipeToUpToFindElement(TXT_ajustNote);
		return this.driver.elementGetText(TXT_ajustAmount)+","+this.driver.elementGetText(TXT_ajustType)
		+","+this.driver.elementGetText(TXT_ajustTime)+","+this.driver.elementGetText(TXT_ajustNote);
	}
	
	
	/**
	 * 新增备注
	 */
	public void clickMoreButton() {
		this.driver.waitAndClick(BTN_more, 2);
	}
	public void clickNote() {
		this.driver.waitAndClick(BTN_note, 2);
	}
	public boolean intoNotePage() {
		return this.driver.waitForElement(TXT_notePage, 2);
	}
	public void clickAddButton() {
		this.driver.waitAndClick(BTN_add, 2);
	}
	public boolean intoAddNotePage() {
		return this.driver.waitForElement(TXT_newNotePage, 2);
	}
	public void inputNoteContent(String content) {
		this.driver.elementSendText(INP_noteContent, content);
	}
	public void clickSaveButton() {
		this.driver.waitAndClick(BTN_save, 2);
	}
	public boolean checkNoteResult(String content) {
		return this.driver.isElementFound(this.NoteContentUIElement(content));
	}
	public String checkNoteInformation_android(String content) {
		return this.driver.elementGetText(this.NoteNameUIElement(content))+","+this.driver.elementGetText(this.MyIdentifyUIElement(content))
		+","+this.driver.elementGetText(this.AddTimeUIElement(content));
	}
	public String checkNoteInformation_ios(String content) {
		return this.driver.elementGetText(this.NoteNameUIElement(content))+","+this.driver.elementGetText(this.AddTimeUIElement(content));
	}
	
	
	/**
	 * 编辑备注
	 */
	public void clickMoreNote(String content) {
		this.driver.waitAndClick(this.NoteMoreUIElement(content), 2);
	}
	public void clickEditButton() {
		this.driver.waitAndClick(BTN_edit, 2);
	}
	public boolean intoEditPage() {
		return this.driver.waitForElement(TXT_editPage, 2);
	}
	public void inputEditNoteContent(String editContent) {
		this.driver.elementClearSendText(INP_noteContent, editContent);
	}
	
	
	/**
	 * 删除备注
	 */
	public void clickDeleteButton() {
		this.driver.waitAndClick(BTN_delete, 2);
	}
	public void clickDeleteSureButton() {
		this.driver.waitAndClick(BTN_deleteSure, 2);
	}
	
	
	/**
	 * 点击合同编号跳转到合同详情页
	 */
	public void clickContactNum(String contactNum) {
		this.driver.swipeToUpAndClick(this.ContractNumUIElement(contactNum));
	}
	
	/**
	 * 点击房号进入房源详情页
	 */
	public void clickFloor(String floor) {
		this.driver.swipeToUpAndClick(this.FloorUIElement(floor));
	}


	/**
	 * 账单列表字段检查
	 */
	public boolean checkRoomList(){
		return this.driver.waitForElement(TXT_roomList,5);
	}

	public boolean checkBillCloseList(){
		return this.driver.waitForElement(TXT_billCloseList,2);
	}

	public boolean checkNeedMoneyList(){
		return this.driver.waitForElement(TXT_needMoneyList,2);
	}

	public boolean checkOverDueDayList(){
		return this.driver.waitForElement(TXT_overDueDayList,2);
	}

	public boolean checkOtherNameList(){
		return this.driver.waitForElement(TXT_otherNameList,2);
	}

	public boolean checkReceiveTimeList(){
		return this.driver.waitForElement(TXT_receiveTimeList,2);
	}

	public boolean checkBuildingNameList(){
		return this.driver.waitForElement(TXT_buildingNameList,2);
	}

	public boolean checkBillAmountList(){
		return this.driver.waitForElement(TXT_billAmountList,2);
	}

	public boolean checkActualAmountList(){
		return this.driver.waitForElement(TXT_actualAmountList,2);
	}

	public boolean checkDepositTypeList(){
		return this.driver.waitForElement(TXT_depositTypeList,2);
	}


	/**
	 * 筛选
	 */
	public void clickFilterButton(){
		this.driver.waitAndClick(BTN_filter,5);
	}

	public boolean intoFilterPage(){
		return this.driver.waitForElement(TXT_filterPage,2);
	}

	public void selectOverDueDayFilter(String overDueDay){
		this.driver.waitAndClick(this.SelectOverDueDayUIElement(overDueDay),2);
	}

	public void selectBillCloseFilter(String billClose){
		this.driver.waitAndClick(this.SelectBillCloseUIElement(billClose),2);
	}

	public void clickConfirmButton(){
		this.driver.waitAndClick(BTN_confirm,2);
	}

	private List<String> BillFileter(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}

	public List<String> checkBillOverDueDay(){
		return  this.BillFileter(TXT_allOverDueDayFilter);
	}

	public List<String> checkBillClose(){
		return this.BillFileter(TXT_allBillCloseFilter);
	}
}
