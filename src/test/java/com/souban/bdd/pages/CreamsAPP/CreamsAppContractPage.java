package com.souban.bdd.pages.CreamsAPP;

import java.util.List;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAppContractPage extends ParentPage{

	public CreamsAppContractPage(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//合同列表元素
	private UIElement BTN_Navigation = new UIElement(
			"xpath=//android.widget.RadioButton[@resource-id='com.souban.creams.debug:id/navigation']",
			"xpath=//XCUIElementTypeTabBar/XCUIElementTypeOther[2]");
	//进入导航页
	private UIElement TXT_navigationPage = new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/titleTv' and @text='导航']","");

	private UIElement BTN_Contract = new UIElement("id=com.souban.creams.debug:id/contractListTv","xpath=//XCUIElementTypeStaticText[@name='合同列表']");


	private UIElement LesseeElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='"+ lessee + "']","xpath=//XCUIElementTypeStaticText[@name='" + lessee + "']");
	}
	private UIElement RoomElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='" + lessee + "']/ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/roomNumberTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + lessee + "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[4]");
	}
	private UIElement AreaElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='" + lessee + "']/ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/areaSizeTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + lessee + "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[5]");
	}
	private UIElement PriceElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='" + lessee + "']/ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/firstPayTermPriceTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + lessee + "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]//XCUIElementTypeStaticText[6]");
	}
	private UIElement StartDateElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='" + lessee + "']/ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/startDateTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + lessee + "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]//XCUIElementTypeStaticText[4]");
	}
	private UIElement EndDateElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='" + lessee + "']/ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/endDateTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + lessee + "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]//XCUIElementTypeStaticText[5]");
	}
	
	/*public UIElement PriceUnitElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='" + lessee + "']/ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/price_unit']","");
	}*/

	private UIElement RoomBuildingElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='" + lessee + "']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/buildingTv']",""); //ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/buildingTv']
	}
	//到期预警列表元素
	private UIElement BTN_ExpiresWarning = new UIElement("xpath=//android.widget.TextView[contains(@text,'到期预警')]","xpath=//XCUIElementTypeStaticText[contains(@name,'到期预警')]");
	private UIElement WarningDaysElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='" + lessee + "']/ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/auditStatusTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + lessee + "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]//XCUIElementTypeStaticText[6]");
	}
	
	//到期未处理列表元素
	private UIElement BTN_ExpiresUntreated = new UIElement("xpath=//android.widget.TextView[contains(@text,'到期未处理')]","xpath=//XCUIElementTypeStaticText[contains(@name,'到期未处理')]");
	private UIElement UntreatedElement(String lessee){
		return new UIElement("xpath=//android.widget.TextView[@text='" + lessee + "']/ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/auditStatusTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + lessee + "']/ancestor::XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]//XCUIElementTypeStaticText[6]");
	}
	
	//合同详情元素
	//概要
	private UIElement TXT_State = new UIElement("id = com.souban.creams.debug:id/contract_status","xpath=//XCUIElementTypeStaticText[@name='合同状态']/following-sibling::XCUIElementTypeStaticText[2]");
	private UIElement TXT_LeaseConsultant = new UIElement("id = com.souban.creams.debug:id/follow_up_people","xpath=//XCUIElementTypeStaticText[@name='合同状态']/following-sibling::XCUIElementTypeOther");
	//租客信息
	private UIElement BTN_tenantTab = new UIElement("xpath=//android.widget.TextView[@text='租客信息' and @resource-id='android:id/text1']","");
	private UIElement TXT_Tenant = new UIElement("id = com.souban.creams.debug:id/tenant","xpath=//XCUIElementTypeStaticText[@name='租客']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_Industry = new UIElement("id = com.souban.creams.debug:id/industry","xpath=//XCUIElementTypeStaticText[@name='行业']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_TenantContact = new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/rootLayout']/android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv']",
			"xpath=//XCUIElementTypeStaticText[@name='租客联系人']/preceding-sibling::XCUIElementTypeCollectionView//XCUIElementTypeStaticText");
	private UIElement TXT_LegalPerson = new UIElement("id = com.souban.creams.debug:id/legal_person","xpath=//XCUIElementTypeStaticText[@name='法人']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_Signer = new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/sign_person_title']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv']",
			"xpath=//XCUIElementTypeStaticText[@name='签订人']/preceding-sibling::XCUIElementTypeCollectionView//XCUIElementTypeStaticText");
	//房源信息
	private UIElement BTN_RoomTab = new UIElement("xpath=//android.widget.TextView[@text='房源信息' and @resource-id='android:id/text1']","");
	private UIElement TXT_BuildingName = new UIElement("id = com.souban.creams.debug:id/buildingNameTv","xpath=//XCUIElementTypeCell[6]//XCUIElementTypeImage/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_BuildingAddress = new UIElement("id = com.souban.creams.debug:id/buildingLocationTv","xpath=//XCUIElementTypeCell[6]//XCUIElementTypeImage/following-sibling::XCUIElementTypeStaticText[2]");
	private UIElement TXT_FloorAndRoom = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/floorTv']","xpath=//XCUIElementTypeCell[6]//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]//XCUIElementTypeStaticText[1]");
	private UIElement TXT_Area = new UIElement("id = com.souban.creams.debug:id/sizeTv","xpath=//XCUIElementTypeCell[6]//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]//XCUIElementTypeStaticText[2]");
	//android房源信息
	private UIElement TXT_Floor = new UIElement("id = com.souban.creams.debug:id/floor","");
	private UIElement TXT_Room = new UIElement("id = com.souban.creams.debug:id/number","");
	
	//其他关键信息
	private UIElement BTN_OtherTab = new UIElement("xpath=//android.widget.TextView[@text='其他关键信息' and @resource-id='android:id/text1']","");
	private UIElement TXT_KeyWords = new UIElement("","xpath=//XCUIElementTypeCell[8]//XCUIElementTypeStaticText");
	
	//android 其他关键词信息
	private UIElement TXT_KeyWord = new UIElement("id = com.souban.creams.debug:id/title","");
	private UIElement TXT_KeyWordNote = new UIElement("id = com.souban.creams.debug:id/value","");
	
	//基本条款
	private UIElement BTN_ClauseTab = new UIElement("xpath=//android.widget.TextView[@text='基本条款' and @resource-id='android:id/text1']","");
	private UIElement TXT_LeaseArea = new UIElement("id = com.souban.creams.debug:id/area_size","xpath=//XCUIElementTypeStaticText[@name='租赁数']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_ContractSignDate = new UIElement("id = com.souban.creams.debug:id/contract_sign_date","xpath=//XCUIElementTypeStaticText[@name='合同签订时间']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_ContractStartDate = new UIElement("id = com.souban.creams.debug:id/contract_calc_date","xpath=//XCUIElementTypeStaticText[@name='合同计租时间']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_ContractEndDate = new UIElement("id = com.souban.creams.debug:id/contract_end_date","xpath=//XCUIElementTypeStaticText[@name='合同结束时间']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_SecurityDeposit = new UIElement("id = com.souban.creams.debug:id/deposit","xpath=//XCUIElementTypeStaticText[@name='押金']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_CalculationAccuracy = new UIElement("id = com.souban.creams.debug:id/calculation_accuracy","xpath=//XCUIElementTypeStaticText[@name='计算精度']/following-sibling::XCUIElementTypeStaticText");
	
	//android基本条款
	private UIElement TXT_SecurityDepositUnit = new UIElement("id = com.souban.creams.debug:id/deposit_unit","");
	
	//租期条款
	private UIElement BTN_LeaseTab = new UIElement("xpath=//android.widget.TextView[@text='租期条款' and @resource-id='android:id/text1']","");
	private UIElement TXT_StartDate = new UIElement("id = com.souban.creams.debug:id/start_date","xpath=//XCUIElementTypeStaticText[@name='开始时间']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_EndDate = new UIElement("id = com.souban.creams.debug:id/end_date","xpath=//XCUIElementTypeStaticText[@name='结束时间']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_BillingType = new UIElement("id = com.souban.creams.debug:id/charge_type","xpath=//XCUIElementTypeStaticText[@name='计费类型']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_DaysOfOneYear = new UIElement("id = com.souban.creams.debug:id/day_number_for_year","xpath=//XCUIElementTypeStaticText[@name='年天数']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_PayType = new UIElement("xpath=//android.widget.TextView[@resource-id = 'com.souban.creams.debug:id/pay_type']","xpath=//XCUIElementTypeStaticText[@name='支付类型']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_PayDate = new UIElement("","xpath=//XCUIElementTypeStaticText[@name='付款时间']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_ContractUnitPrice = new UIElement("id = com.souban.creams.debug:id/contract_price","xpath=//XCUIElementTypeStaticText[@name='合同单价']/following-sibling::XCUIElementTypeStaticText");
	
	//android租期条款
	private UIElement TXT_PayDateType = new UIElement("id = com.souban.creams.debug:id/pay_date_type","");
	private UIElement TXT_PayDate_Android = new UIElement("id = com.souban.creams.debug:id/pay_date","");

	//优惠字段
	private UIElement TXT_Discount = new UIElement("id=com.souban.creams.debug:id/discount","");

	//租金明细报表按钮
	//合同详情操作
	//新建备注
	private UIElement TXT_NoteTab = new UIElement("xpath=//android.widget.TextView[@text='备注']","");
	private UIElement BTN_Operator = new UIElement("id = com.souban.creams.debug:id/contract_menu","xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem More']");
	private UIElement BTN_Note = new UIElement("id = com.souban.creams.debug:id/remarkTv","xpath=//XCUIElementTypeStaticText[@name='备注']");
	private UIElement BTN_AddNote = new UIElement("id = com.souban.creams.debug:id/addIv","xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem Add']");
	private UIElement TXT_DefaultInfo = new UIElement("","xpath=//XCUIElementTypeNavigationBar[@name='新增备注']/following-sibling::XCUIElementTypeOther//XCUIElementTypeStaticText");
	private UIElement INP_Note = new UIElement("id = com.souban.creams.debug:id/contentEt","xpath=//XCUIElementTypeNavigationBar[@name='新增备注']/following-sibling::XCUIElementTypeOther//XCUIElementTypeTextView");
	private UIElement BTN_SaveNote = new UIElement("id = com.souban.creams.debug:id/saveTv","xpath=//XCUIElementTypeButton[@name='保存']");
	private UIElement TXT_NoteInfo = new UIElement("","xpath=//XCUIElementTypeCell//XCUIElementTypeStaticText");
	private UIElement TXT_CreatTab = new UIElement("xpath=//android.widget.TextView[@text='新增备注']","");
	
	//android
	private UIElement TXT_DefaultName = new UIElement("id = com.souban.creams.debug:id/nameTv","");
	private UIElement TXT_DefaultDate = new UIElement("id = com.souban.creams.debug:id/dateTv","");
	private UIElement TXT_NoteName = new UIElement("id = com.souban.creams.debug:id/nameTv","");
	private UIElement TXT_NoteSelf = new UIElement("id = com.souban.creams.debug:id/self","");
	private UIElement TXT_Notedate = new UIElement("id = com.souban.creams.debug:id/dateTv","");
	private UIElement TXT_NoteContent = new UIElement("id = com.souban.creams.debug:id/contentTv","");
	
	//编辑备注
	private UIElement BTN_ContractButtonMore = new UIElement("id = com.souban.creams.debug:id/moreIv","xpath=//XCUIElementTypeCell[1]//XCUIElementTypeButton[@name='Contract Button More']");
	private UIElement BTN_EditNote = new UIElement("id = com.souban.creams.debug:id/editTv","xpath=//XCUIElementTypeStaticText[@name='编辑']");
	private UIElement INP_EditNote = new UIElement("id = com.souban.creams.debug:id/contentEt","xpath=//XCUIElementTypeTextView");
	private UIElement TXT_Note = new UIElement("id = com.souban.creams.debug:id/contentTv","xpath=//XCUIElementTypeNavigationBar[@name='备注']/following-sibling::XCUIElementTypeOther//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[3]");
	private UIElement TXT_UpdateTab = new UIElement("xpath=//android.widget.TextView[@text='修改备注']","");
	
	//删除
	private UIElement BTN_Delete = new UIElement("id = com.souban.creams.debug:id/delTv","xpath=//XCUIElementTypeStaticText[@name='删除']");
	private UIElement BTN_DeleteConfirm = new UIElement("id = com.souban.creams.debug:id/makeSureBtn","xpath=//XCUIElementTypeButton[@name='确定']");

	private UIElement NoteElement(String note){
		return new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/contentTv' and @text='" + note + "']","xpath=//XCUIElementTypeStaticText[@name='" + note + "']");
	}
	
	//合同操作记录
	private UIElement BTN_OperationRecord = new UIElement("id = com.souban.creams.debug:id/logTv","xpath=//XCUIElementTypeStaticText[@name='操作记录']");
	private UIElement TXT_RecordContent = new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/listView']//android.widget.TextView","xpath=//XCUIElementTypeCollectionView//XCUIElementTypeStaticText");
	
	//查看合同账单列表元素
	private UIElement BTN_RentDetailList = new UIElement("xpath=//android.widget.TextView[@text='租金明细报表']","xpath=//XCUIElementTypeButton[@name='租金明细报表']");
	private UIElement BTN_ShowContractBillList = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/billTv']","//XCUIElementTypeButton[@name='查看合同账单列表']");
	
	//合同相关账单列表页面元素
	private UIElement TXT_BillListTitle = new UIElement("xpath=//*[@text='合同相关账单列表']","//XCUIElementTypeNavigationBar[@name='合同相关账单列表']");
	private UIElement TXT_BillType = new UIElement("id=com.souban.creams.debug:id/rentTypeTv","xpath=//XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
	private UIElement TXT_BillCloseStatus = new UIElement("id=com.souban.creams.debug:id/billCloseStatusTv","//XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
	private UIElement TXT_BillAmount = new UIElement("id=com.souban.creams.debug:id/billAmountTv","xpath=//XCUIElementTypeStaticText[@name='账单金额']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_ActualAmount = new UIElement("id=com.souban.creams.debug:id/actualAmountTv","xpath=//XCUIElementTypeStaticText[@name='实收/付金额']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_InvoiceAmount = new UIElement("id=com.souban.creams.debug:id/invoiceAmountTv","xpath=//XCUIElementTypeStaticText[@name='开票金额']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_ActualTime = new UIElement("id=com.souban.creams.debug:id/actualTimeTv","xpath=//XCUIElementTypeStaticText[@name='应收/付时间']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_BillingCycle = new UIElement("id=com.souban.creams.debug:id/billingCycleTv","xpath=//XCUIElementTypeStaticText[@name='计费周期']/following-sibling::XCUIElementTypeStaticText");


	//合同详情查看租金明细报表内容
	private UIElement TXT_Deposit(String deposit){
	    return new UIElement("xpath=//android.widget.TextView[@text='"+deposit+"']","");
    }

	private UIElement TXT_SectionA(String sectionA){
		return new UIElement("xpath=//android.widget.TextView[@text='"+sectionA+"']","");
	}

	private UIElement TXT_FinalPriceA(String sectionA){
		return new UIElement("xpath=//android.widget.TextView[@text='"+sectionA+"']/ancestor::android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView[2]","");
	}

	private UIElement TXT_PaymentDayA(String sectionA){
		return new UIElement("xpath=//android.widget.TextView[@text='"+sectionA+"']/ancestor::android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[2]","");
	}

	private UIElement TXT_FinalAmountA(String sectionA){
		return new UIElement("xpath=//android.widget.TextView[@text='"+sectionA+"']/ancestor::android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.TextView[2]","");
	}

	private UIElement TXT_SectionB(String sectionB){
		return new UIElement("xpath=//android.widget.TextView[@text='"+sectionB+"']","");
	}

	private UIElement TXT_FinalPriceB(String sectionB){
		return new UIElement("xpath=//android.widget.TextView[@text='"+sectionB+"']/ancestor::android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView[2]","");
	}

	private UIElement TXT_PaymentDayB(String sectionB){
		return new UIElement("xpath=//android.widget.TextView[@text='"+sectionB+"']/ancestor::android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[2]","");
	}

	private UIElement TXT_FinalAmountB(String sectionB){
		return new UIElement("xpath=//android.widget.TextView[@text='"+sectionB+"']/ancestor::android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.TextView[2]","");
	}

	//合同列表筛选
	private UIElement BTN_Filter = new UIElement("id=com.souban.creams.debug:id/filterIv","");

	private UIElement BTN_ReviewState(String reviewState){
		return new UIElement("xpath=//android.widget.CheckBox[@text='"+reviewState+"']","");
	}

	private UIElement BTN_MenuConfirm = new UIElement("id=com.souban.creams.debug:id/confirmTv","");

	private UIElement Btn_ListFirst = new UIElement("xpath=//android.support.v7.widget.RecyclerView[@resource-id='com.souban.creams.debug:id/recycler_view']/android.widget.LinearLayout[1]","");

	private UIElement TXT_StateInfo(String reviewStateInfo){
		return new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/contract_status' and @text='"+reviewStateInfo+"']","");
	}
	
	//合同列表方法
	public void GotoNavigationPage(){
		this.driver.waitAndClick(BTN_Navigation, 2);
	}
	public boolean intoNavigationPage() {
		return this.driver.waitForElement(TXT_navigationPage, 2);
	}
	
	public void GotoContractList(){
		this.driver.waitAndClick(BTN_Contract, 5);
	}
	
	public boolean CheckLessee(String lessee){
		return this.driver.swipeToUpToFindElement(this.LesseeElement(lessee));
		//return this.driver.waitForElement(this.LesseeElement(lessee), 2);
	}
	
	public String CheckContractInfo(String lessee){
		//this.driver.sleep(1000);
		this.driver.swipeToUpToFindElement(this.StartDateElement(lessee));
		return this.driver.elementGetText(this.RoomElement(lessee)) + "," + this.driver.elementGetText(this.AreaElement(lessee))
		+ "," + this.driver.elementGetText(this.PriceElement(lessee)) + "," + this.driver.elementGetText(this.StartDateElement(lessee)) + "," + this.driver.elementGetText(this.EndDateElement(lessee));
	}
	//android
	public String CheckRoomBuilding(String lessee){
		return this.driver.elementGetText(this.RoomBuildingElement(lessee));
	}
	
	/*public String GetPriceUnit(String lessee){
		return this.driver.elementGetText(this.PriceUnitElement(lessee));
	}*/
	
	//到期预警列表方法
	public void GotoExpiresWarningList(){
		this.driver.waitAndClick(BTN_ExpiresWarning, 1);
	}
	
	public String GetEndDate(String lessee){
		return this.driver.elementGetText(this.EndDateElement(lessee));
	}
	
	public String GetWarningDays(String lessee){
		return this.driver.elementGetText(this.WarningDaysElement(lessee));
	}
	
	public int GetActualWarningDays(String lessee){
		return this.driver.GetTodayToEnd(this.GetEndDate(lessee));
	}
	
	//到期未处理列表方法
	public void GotoExpiresUntreatedList(){
		this.driver.waitAndClick(BTN_ExpiresUntreated, 1);
	}
		
	public String GetUntreatedDays(String lessee){
		return this.driver.elementGetText(this.UntreatedElement(lessee));
		
	}
		
	public int GetActualUntreatedDays(String lessee){
		return this.driver.GetEndToToday(this.GetEndDate(lessee));
	}
	
	//合同详情方法
	public void GotoContractDetail(String lessee){
		//this.driver.sleep(2000);
		this.driver.swipeToUpAndClick(this.LesseeElement(lessee));
		//this.driver.waitAndClick(this.LesseeElement(lessee), 1);
	}
	
	public String CheckProfileInfo(){
		//this.driver.sleep(2000);
		return this.driver.elementGetText(TXT_State) + "," + this.driver.elementGetText(TXT_LeaseConsultant);
	}
	
	public String CheckLeaseInfo(){
		this.driver.click(BTN_tenantTab);
		return this.driver.elementGetText(TXT_Tenant) + "," + this.driver.elementGetText(TXT_Industry) + "," + this.driver.elementGetText(TXT_TenantContact) +
				"," + this.driver.elementGetText(TXT_LegalPerson) + "," + this.driver.elementGetText(TXT_Signer);
	}
	
	public String CheckRoomInfo(){
		this.driver.click(BTN_RoomTab);
		return this.driver.elementGetText(TXT_BuildingName) + "," + this.driver.elementGetText(TXT_BuildingAddress) + "," + this.driver.elementGetText(TXT_FloorAndRoom) + "," + this.driver.elementGetText(TXT_Area);
	}
	
	public List<String> KeyWords(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}
	
	public List<String> CheckKeyWords(){
		this.driver.click(BTN_OtherTab);
		return this.KeyWords(TXT_KeyWords);
	}
	
	public String CheckBaseTerm(){
		this.driver.click(BTN_ClauseTab);
		return this.driver.elementGetText(TXT_LeaseArea) + "," + this.driver.elementGetText(TXT_ContractSignDate) + "," + this.driver.elementGetText(TXT_ContractStartDate) + 
				"," + this.driver.elementGetText(TXT_ContractEndDate) + "," + this.driver.elementGetText(TXT_SecurityDeposit) + "," + this.driver.elementGetText(TXT_CalculationAccuracy);
	}
	
	public String CheckLeaseTerm(){
		this.driver.click(BTN_LeaseTab);
		return this.driver.elementGetText(TXT_StartDate) + "," + this.driver.elementGetText(TXT_EndDate) + "," + this.driver.elementGetText(TXT_BillingType) + "," + this.driver.elementGetText(TXT_DaysOfOneYear)
		+ "," + this.driver.elementGetText(TXT_PayType) + "," + this.driver.elementGetText(TXT_PayDate) + "," + this.driver.elementGetText(TXT_ContractUnitPrice);
	}
	
	//android
	public String CheckRoomInfo_android(){
		this.driver.click(BTN_RoomTab);
		return this.driver.elementGetText(TXT_BuildingName) + "," + this.driver.elementGetText(TXT_BuildingAddress) + "," + this.driver.elementGetText(TXT_Floor) + "," 
	+ this.driver.elementGetText(TXT_Room) + "," + this.driver.elementGetText(TXT_Area);
	}
	
	public String CheckKeyWords_android(){
		this.driver.click(BTN_OtherTab);
		return this.driver.elementGetText(TXT_KeyWord) + "," + this.driver.elementGetText(TXT_KeyWordNote);
	}
	
	public String CheckBaseTerm_android(){
		this.driver.click(BTN_ClauseTab);
		return this.driver.elementGetText(TXT_LeaseArea) + "," + this.driver.elementGetText(TXT_ContractSignDate) + "," + this.driver.elementGetText(TXT_ContractStartDate) + 
				"," + this.driver.elementGetText(TXT_ContractEndDate) + "," + this.driver.elementGetText(TXT_SecurityDeposit) + "," + this.driver.elementGetText(TXT_SecurityDepositUnit) + "," + this.driver.elementGetText(TXT_CalculationAccuracy);
	}
	
	public String CheckLeaseTerm_android(){
		this.driver.click(BTN_LeaseTab);
		return this.driver.elementGetText(TXT_StartDate) + "," + this.driver.elementGetText(TXT_EndDate) + "," + this.driver.elementGetText(TXT_BillingType) + "," + this.driver.elementGetText(TXT_DaysOfOneYear)
		+ "," + this.driver.elementGetText(TXT_PayType) + "," + this.driver.elementGetText(TXT_PayDateType) + "," + this.driver.elementGetText(TXT_PayDate_Android) + "," + this.driver.elementGetText(TXT_ContractUnitPrice);
	}

	public boolean CheckRentDetail(){
		this.driver.swipeToUpToFindElement(TXT_Discount);
		return this.driver.waitForElement(BTN_RentDetailList, 1);
	}

	
	//合同详情页增加备注方法
	public void ClickOperator(){
		this.driver.waitAndClick(BTN_Operator, 3);
	}
	
	public void GotoNoteList(){
		this.driver.waitAndClick(BTN_Note, 1);
	}
	
	public void ClickAddNote(){
		this.driver.waitAndClick(BTN_AddNote, 5);
	}
	
	public List<String> DefultInfo(UIElement txt){
		return this.driver.allElementsGetText(txt);
	} 
	
	public List<String> CheckDefultInfo(){
		return this.DefultInfo(TXT_DefaultInfo);
	}
	
	public void InputNote(String text){
		this.driver.elementSendText(INP_Note, text);
	}
	
	public void ClickSaveNote(){
		this.driver.click(BTN_SaveNote);
	}
	
	public List<String> NoteInfo(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}
	
	public List<String> CheckNoteInfo(){
		//this.driver.sleep(3000);
		return this.NoteInfo(TXT_NoteInfo);
	}
	
	//android
	public boolean checkCreatTab() {
		return this.driver.waitForElement(TXT_CreatTab,5);
	}
	
	public String CheckDefaultInfo_android(){
		return this.driver.elementGetText(TXT_DefaultName) + "," + this.driver.elementGetText(TXT_DefaultDate);
	}
	
	
	public boolean checkNoteTab() {
		return this.driver.waitForElement(TXT_NoteTab,5);
	}
	
	public String CheckNoteInfo_android(){
		return this.driver.elementGetText(TXT_NoteName) + "," + this.driver.elementGetText(TXT_NoteSelf) + "," + this.driver.elementGetText(TXT_Notedate) + "," + this.driver.elementGetText(TXT_NoteContent);
	}
	
	//编辑备注方法
	public void ClickContractButtonMore(){
		this.driver.waitAndClick(BTN_ContractButtonMore, 1);
	}
	
	public void ClickEditNote(){
		this.driver.waitAndClick(BTN_EditNote, 2);
	}
	
	public void EditNoteContent(String text){
		this.driver.elementClearSendText(INP_EditNote, text);
	}
	
	public String CheckNoteAfterEdit(){
		//this.driver.sleep(3000);
		return this.driver.elementGetText(TXT_Note);
	}
	
	//删除备注方法
	public void ClickDeleteNote(){
		this.driver.waitAndClick(BTN_Delete, 1);
	}
	
	public void DeleteConfirm(){
		this.driver.waitAndClick(BTN_DeleteConfirm, 1);
	}
	
	public boolean CheckDeleteNoteResult(String note){
		//加个强制等待吧
		this.driver.sleep(1000);
		return this.driver.isElementFound(this.NoteElement(note));
	}
	
	//查看操作记录方法
	public void GotoOperationRecordList(){
		this.driver.waitAndClick(BTN_OperationRecord, 1);
	}
	
	public List<String> RecordContent(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}
	
	public List<String> CheckRecordContent(){
	//	this.driver.sleep(1000);
		return this.RecordContent(TXT_RecordContent);
	}
	
	//检查查看合同账单列表按钮是否显示	
	public String CheckContractState(){
		this.driver.waitForElement(TXT_State, 3);
		return this.driver.elementGetText(TXT_State);
	}
	
	public boolean CheckIsExsitContractBillListButton(){
		this.driver.swipeToUpToFindElement(BTN_RentDetailList);
		//this.driver.sleep(1000);
		return this.driver.isElementFound(BTN_ShowContractBillList);
		
	}
	
	//进入合同相关账单列表查看内容显示
	public boolean CheckContractBillListButton(){
		int duration = 0;
		this.driver.swipeToUp(duration);
		this.driver.swipeToUpToFindElement(BTN_RentDetailList);
		return this.driver.waitForElement(BTN_ShowContractBillList, 1);
	}
	
	public void GotoContractBillList(){
		this.driver.click(BTN_ShowContractBillList);
	}
	
	public boolean CheckGotoBillListResult(){
		return this.driver.waitForElement(TXT_BillListTitle, 5);
	}
	
	public int GetActualOverdueDays(int index){
		return this.driver.GetTodayToActualPayDay(this.CheckActualTime().get(index));
	}
	
	public List<String> BillInfo(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}
	
	public List<String> CheckBillType(){
		return this.BillInfo(TXT_BillType);
	}
	
	public List<String> CheckBillCloseStatus(){
		return this.BillInfo(TXT_BillCloseStatus);
	}
	
	public List<String> CheckBillAmount(){
		return this.BillInfo(TXT_BillAmount);
	}
	
	public List<String> CheckActualAmount(){
		return this.BillInfo(TXT_ActualAmount);
	}
	
	public List<String> CheckInvoiceAmount(){
		return this.BillInfo(TXT_InvoiceAmount);
	}
	
	public List<String> CheckActualTime(){
		return this.BillInfo(TXT_ActualTime);
	}
	
	public List<String> CheckBillingCycle(){
		return this.BillInfo(TXT_BillingCycle);
	}

	//合同详情查看租金明细报表内容
	public void ClickRentDetail() {
		int duration = 0;
		this.driver.swipeToUp(duration);
		this.driver.swipeToUpToFindElement(BTN_RentDetailList);
		this.driver.click(BTN_RentDetailList);

	}

	public String CheckDeposit(String deposit){
		this.driver.waitForElement(this.TXT_Deposit(deposit),3);
		return this.driver.elementGetText(this.TXT_Deposit(deposit));
	}

	public String CheckSectionA(String sectionA){
		return this.driver.elementGetText(this.TXT_SectionA(sectionA)) + "," + this.driver.elementGetText(this.TXT_FinalPriceA(sectionA))
				+ "," + this.driver.elementGetText(this.TXT_PaymentDayA(sectionA)) + "," + this.driver.elementGetText(this.TXT_FinalAmountA(sectionA));
	}

	public String CheckSectionB(String sectionB){
		return this.driver.elementGetText(this.TXT_SectionB(sectionB)) + "," + this.driver.elementGetText(this.TXT_FinalPriceB(sectionB))
				+ "," + this.driver.elementGetText(this.TXT_PaymentDayB(sectionB)) + "," + this.driver.elementGetText(this.TXT_FinalAmountB(sectionB));
	}

	//合同审核筛选
	public void ClickFilter(){
		this.driver.waitAndClick(BTN_Filter,3);
	}

	public void ClickReviweState(String reviewState){
		this.driver.swipeToUpAndClick(this.BTN_ReviewState(reviewState));
	}

	public void ClickConfirm(){
		this.driver.click(BTN_MenuConfirm);
	}

	public void ClickList(){
		this.driver.click(Btn_ListFirst);
	}

	public boolean CheckState(String reviewStateInfo){
		return this.driver.waitForElement(this.TXT_StateInfo(reviewStateInfo),3);
	}

}
