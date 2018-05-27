package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class DetailsOfContractOperationPage extends ParentPage{


	public DetailsOfContractOperationPage(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//【合同详情】已有历史审核的新建待审核的合同查看新建审核
	private UIElement TXT_Navigation = new UIElement(
			"xpath=//android.widget.RadioButton[@resource-id='com.souban.creams.debug:id/navigation']",
			"xpath=//XCUIElementTypeTabBar/XCUIElementTypeOther[2]");
	
	private UIElement TXT_ContractList = new UIElement("id=com.souban.creams.debug:id/contractListTv",
			"xpath=//XCUIElementTypeStaticText[@name='合同列表']");
	
	private UIElement BTN_ContractSearch = new UIElement("id=com.souban.creams.debug:id/searchTv",
			"xpath=//XCUIElementTypeStaticText[@name='搜索合同']");
	
	public UIElement TXT_Renter(String tenant){
		return new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/companyTv' and @text='"+tenant+"']",
				"xpath=//XCUIElementTypeStaticText[contains(@name,'"+tenant+"')]");
	}
	
	private UIElement BTN_ContractOperation = new UIElement("id=com.souban.creams.debug:id/contract_menu",
			"xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem More']");
	
	private UIElement TXT_ViewNewAudit = new UIElement("id=com.souban.creams.debug:id/check_new_audit",
			"xpath=//XCUIElementTypeStaticText[@name='查看新建审核']");
	
	private UIElement TXT_HistoricalAuthor = new UIElement("xpath=//android.widget.LinearLayout[@resource-id='com.souban.creams.debug:id/history_container']/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]",
			"xpath=//XCUIElementTypeImage [@name='Contract_Icon_UnPassed']/parent::XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
	
	
	private UIElement TXT_HistoricalTime = new UIElement("xpath=//android.widget.LinearLayout[@resource-id='com.souban.creams.debug:id/history_container']/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[3]",
			"xpath=//XCUIElementTypeImage [@name='Contract_Icon_UnPassed']/parent::XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]");
	
	private UIElement TXT_HistoricalStatus = new UIElement("xpath=//android.widget.LinearLayout[@resource-id='com.souban.creams.debug:id/history_container']//android.widget.TextView[@ resource-id='com.souban.creams.debug:id/status']",
			"xpath=//XCUIElementTypeImage [@name='Contract_Icon_UnPassed']/parent::XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_HistoricalName = new UIElement("xpath=//android.widget.LinearLayout[@resource-id='com.souban.creams.debug:id/history_container']//android.widget.TextView[@resource-id='com.souban.creams.debug:id/creator']",
			"Xpath=//XCUIElementTypeImage [@name='Contract_Icon_UnPassed']/parent::XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
	
	private UIElement TXT_HistoricalNameTime = new UIElement("xpath=//android.widget.LinearLayout[@resource-id='com.souban.creams.debug:id/history_container']//android.widget.TextView[@resource-id='com.souban.creams.debug:id/create_time']",
			"");
	
	private UIElement TXT_NotPassingInformation = new UIElement("xpath=//android.widget.LinearLayout[@resource-id='com.souban.creams.debug:id/history_container']//android.widget.TextView[@ resource-id='com.souban.creams.debug:id/note']",
			"xpath=//XCUIElementTypeImage [@name='Contract_Icon_UnPassed']/parent::XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
	
	private UIElement TXT_CurrentAuthor = new UIElement("xpath=//android.widget.TextView[@text='当前审核流程']/following-sibling::android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]",
			"xpath=(//XCUIElementTypeStaticText[@name='提交人'])[1]/following-sibling::XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_CurrentTime = new UIElement("xpath=//android.widget.TextView[@text='当前审核流程']/following-sibling::android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[3]",
			"xpath=(//XCUIElementTypeStaticText[@name='提交人'])[1]/following-sibling::XCUIElementTypeStaticText[2]");
	
	/*private UIElement TXT_PassingInformation = new UIElement("xpath=//android.widget.TextView[@text='当前审核流程']/following-sibling::android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]",
			"xpath=(//XCUIElementTypeStaticText[@name='审核通过'])[1]/following-sibling::XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_AuditStatus = new UIElement("xpath=//android.widget.TextView[@text='当前审核流程']/following-sibling::android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[3]",
			"xpath=(//XCUIElementTypeStaticText[@name='审核通过'])[1]/following-sibling::XCUIElementTypeStaticText[2]");*/
	
	private UIElement TXT_AuditWait = new UIElement("xpath=//android.widget.TextView[@text='当前审核流程']/following-sibling::android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout//android.widget.TextView[@resource-id='com.souban.creams.debug:id/creator']",
			"xpath=//XCUIElementTypeStaticText[@name='等待审核']/following-sibling::XCUIElementTypeStaticText");
	
	//【合同详情】提交退租审核的合同查看退租协议
	private UIElement TXT_ViewRentAgreement = new UIElement("id=com.souban.creams.debug:id/terminate_protocol",
			"xpath=//XCUIElementTypeStaticText[@name='查看退租协议']");
	
	private UIElement TXT_RentSponsor= new UIElement("id=com.souban.creams.debug:id/tenant",
			"xpath=//XCUIElementTypeStaticText[@name='退租发起方']/following-sibling::	XCUIElementTypeStaticText");
	
	private UIElement TXT_RentContractID= new UIElement("id=com.souban.creams.debug:id/contract_no",
			"xpath=//XCUIElementTypeStaticText[@name='退租合同编号']/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_RentArea = new UIElement("id=com.souban.creams.debug:id/termination_area_size",
			"xpath=//XCUIElementTypeStaticText[@name='退租面积']/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_RentTime =new UIElement("id=com.souban.creams.debug:id/termination_date",
			"xpath=//XCUIElementTypeStaticText[@name='退租日期']/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_ChangeRegisteredAddress = new UIElement("id=com.souban.creams.debug:id/register_date",
			"xpath=//XCUIElementTypeStaticText[@name='工商注册地址变更时间']/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_Building = new UIElement("id=com.souban.creams.debug:id/buildingNameTv",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_Address = new UIElement("id=com.souban.creams.debug:id/buildingLocationTv",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");
	
	private UIElement TXT_Floor = new UIElement("id=com.souban.creams.debug:id/floorTv",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeCell[3]//XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_Area = new UIElement("id=com.souban.creams.debug:id/sizeTv",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeCell[3]//XCUIElementTypeStaticText[2]");
	
	private UIElement TXT_RentDate = new UIElement("id=com.souban.creams.debug:id/termTv",
			"xpath=//XCUIElementTypeStaticText[@name='收款']/following-sibling::XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_RentBillAmount = new UIElement("id=com.souban.creams.debug:id/billAmountTv",
			"xpath=//XCUIElementTypeStaticText[@name='收款']/following-sibling::XCUIElementTypeStaticText[2]");
	
	private UIElement TXT_ReceivablesCash = new UIElement("id=com.souban.creams.debug:id/actualAmountTv",
			"xpath=//XCUIElementTypeStaticText[@name='收款']/following-sibling::XCUIElementTypeStaticText[3]");
	
	private UIElement TXT_RealIncomeExpenditure = new  UIElement("id=com.souban.creams.debug:id/finalAmountTv",
			"xpath=//XCUIElementTypeStaticText[@name='实际收入/支出']/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_RentTotalReceivable = new UIElement("id=com.souban.creams.debug:id/historyTotalTv",
			"xpath=(//XCUIElementTypeStaticText[@name='总计应收'])[1]/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_BondBillAmount = new UIElement("id=com.souban.creams.debug:id/valueLeftTv",
			"xpath=(//XCUIElementTypeStaticText[@name='账单金额'])[2]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
	
	private UIElement TXT_BondAmountPaid = new UIElement("id=com.souban.creams.debug:id/valueRightTv",
			"xpath=(//XCUIElementTypeStaticText[@name='账单金额'])[2]/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
	
	private UIElement TXT_BondTotalRefundable = new UIElement("id=com.souban.creams.debug:id/totalBackMoneyTv",
			"xpath=//XCUIElementTypeStaticText[@name='总计应退']/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_OtherActualIncome = new UIElement("id=com.souban.creams.debug:id/actualIncomeTv",
			"xpath=//XCUIElementTypeStaticText[@name='实际收入']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_OtherNote = new UIElement("id=com.souban.creams.debug:id/commentTv",
			"xpath=//XCUIElementTypeStaticText[@name='实际收入']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_OtherTotalReceivable = new UIElement("id=com.souban.creams.debug:id/elseTotalIn",
			"xpath=(//XCUIElementTypeStaticText[@name='总计应收'])[2]/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_TotalBond = new UIElement("id=com.souban.creams.debug:id/depositCloseTv",
			"xpath=//XCUIElementTypeStaticText[@name='保证金结算']/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_TotalBill = new UIElement("id=com.souban.creams.debug:id/billCloseTv",
			"xpath=//XCUIElementTypeStaticText[@name='账单结算']/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_TotalOther = new UIElement("id=com.souban.creams.debug:id/elseCloseTv",
			"xpath=(//XCUIElementTypeStaticText[@name='其他费用'])[2]/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_TotalReceivable = new UIElement("id=com.souban.creams.debug:id/totalMoneyTv",
			"xpath=(//XCUIElementTypeStaticText[@name='总计应收'])[3]/following-sibling::XCUIElementTypeStaticText");
	
	private UIElement TXT_RentReasons = new UIElement("id=com.souban.creams.debug:id/reason",
			"xpath=//XCUIElementTypeStaticText[@name='退租原因']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText");
	
	private UIElement TXT_MemoInfo = new UIElement("id=com.souban.creams.debug:id/note",
			"xpath=//XCUIElementTypeStaticText[@name='退租原因']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[3]//XCUIElementTypeStaticText");
	
	//【合同详情】查看退租待修改状态下的合同退租审核
	private UIElement TXT_ViewRentAuditing = new UIElement("id=com.souban.creams.debug:id/terminate_audit","xpath=//XCUIElementTypeStaticText[@name='查看退租审核']");
	
	/*private UIElement TXT_RentAuditingPresenter = new UIElement("id=com.souban.creams.debug:id/submitter","xpath=//XCUIElementTypeStaticText[@name='提交人']/following-sibling::XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_RentAuditingDate = new UIElement("id=com.souban.creams.debug:id/date","xpath=//XCUIElementTypeStaticText[@name='提交人']/following-sibling::XCUIElementTypeStaticText[2]");*/
	
	private UIElement TXT_CurrentAudit = new UIElement("xpath=//android.widget.TextView[@taxt='当前审核流程']","xpath=//XCUIElementTypeStaticText[@name='当前审核流程']");
	
	//【合同详情】提交作废申请的合同查看作废审核
	private UIElement TXT_ViewDeleteAuditing = new UIElement("id=com.souban.creams.debug:id/nullification_audit","xpath=//XCUIElementTypeStaticText[@name='查看作废审核']");
	
	private UIElement TXT_DeleteAuditingPresenter = new UIElement("id=com.souban.creams.debug:id/submitter","xpath=//XCUIElementTypeStaticText[@name='提交人']/following-sibling::XCUIElementTypeStaticText[1]");
	
	private UIElement TXT_DeleteAuditingDate = new UIElement("id=com.souban.creams.debug:id/date","xpath=//XCUIElementTypeStaticText[@name='提交人']/following-sibling::XCUIElementTypeStaticText[2]");
	
	private UIElement TXT_DeleteAuditingWait = new UIElement("id=com.souban.creams.debug:id/creator","xpath=//XCUIElementTypeStaticText[@name='等待审核']/following-sibling::XCUIElementTypeStaticText");
	
	//【合同详情】提交作废审核的合同查看作废原因
	private UIElement TXT_ViewDeleteReason = new UIElement("id=com.souban.creams.debug:id/nullification_reason","xpath=//XCUIElementTypeStaticText[@name='查看作废原因']");
	
	private UIElement TXT_DeleteReason = new UIElement("id=com.souban.creams.debug:id/reason","xpath=//XCUIElementTypeStaticText[@name='作废原因']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText");
	
	private UIElement TXT_DeleteReasonProcessing = new UIElement("id=com.souban.creams.debug:id/action","xpath=//XCUIElementTypeStaticText[@name='账单处理']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell//XCUIElementTypeStaticText");
	
	//【合同详情】已有历史审核的新建待审核的合同查看新建审核-方法
	
	public void ClickNavigation(){
		
		this.driver.click(TXT_Navigation);
	}
	
	public void ClickContractList(){
		this.driver.click(TXT_ContractList);
	}
	
	public void ClickContractSearch(){
		this.driver.waitForElement(BTN_ContractSearch,3);
		this.driver.click(BTN_ContractSearch);
	}
	
	public void ClickContrack(String tenant){
		this.driver.waitForElement(TXT_Renter(tenant),3);
		this.driver.click(this.TXT_Renter(tenant));
		
	}
	
	public void ClickContractOperation(){
		this.driver.click(BTN_ContractOperation);
	}
	
	public void ClickViewNewAudit(){
		this.driver.waitForElement(TXT_ViewNewAudit, 3);
		this.driver.click(TXT_ViewNewAudit);
	}
	
	public String HistoricalAuditInfo(){
		this.driver.waitForElement(TXT_HistoricalAuthor, 3);
		return this.driver.elementGetText(TXT_HistoricalAuthor)+","+this.driver.elementGetText(TXT_HistoricalTime)+","+this.driver.elementGetText(TXT_HistoricalStatus)+","+this.driver.elementGetText(TXT_HistoricalName)+","+this.driver.elementGetText(TXT_HistoricalNameTime)+","+this.driver.elementGetText(TXT_NotPassingInformation);
	}
	
	public String HistoricalAuditInfoIOS(){
		this.driver.waitForElement(TXT_HistoricalAuthor, 3);
		return this.driver.elementGetText(TXT_HistoricalAuthor)+","+this.driver.elementGetText(TXT_HistoricalTime)+","+this.driver.elementGetText(TXT_HistoricalStatus)+","+this.driver.elementGetText(TXT_HistoricalName)+","+this.driver.elementGetText(TXT_NotPassingInformation);
	}
	
	public String CurrentAuditInfo(){
		return this.driver.elementGetText(TXT_CurrentAuthor)+","+this.driver.elementGetText(TXT_CurrentTime)+","+this.driver.elementGetText(TXT_AuditWait);
	}
	
	//【合同详情】提交退租审核的合同查看退租协议-方法
	public void ClickViewRentAgreement(){
		this.driver.click(TXT_ViewRentAgreement);
	}
	
	public String RenterInfo(){
		this.driver.waitForElement(TXT_RentSponsor, 3);
		return this.driver.elementGetText(TXT_RentSponsor)+","+this.driver.elementGetText(TXT_RentArea)+","+this.driver.elementGetText(TXT_RentTime)+","+this.driver.elementGetText(TXT_ChangeRegisteredAddress);
	}
	
	public String BuildingInfo(){
		
		return this.driver.elementGetText(TXT_Building)+","+this.driver.elementGetText(TXT_Address)+","+this.driver.elementGetText(TXT_Floor)+","+this.driver.elementGetText(TXT_Area);
	}
	
/*	public String BuildingInfoAndroid(){
		return this.driver.elementGetText(TXT_Building)+","+this.driver.elementGetText(TXT_Address)+","+this.driver.elementGetText(TXT_Floor)+","+this.driver.elementGetText(TXT_RoomNumber)+","+this.driver.elementGetText(TXT_Area);
	}*/
	
	
	public String RefundAccountInfo(){
		int duration = 0;
		this.driver.swipeToUp(duration);
		return this.driver.elementGetText(TXT_RentDate)+","+this.driver.elementGetText(TXT_RentBillAmount)+","+this.driver.elementGetText(TXT_ReceivablesCash)+","+this.driver.elementGetText(TXT_RealIncomeExpenditure)+","+this.driver.elementGetText(TXT_RentTotalReceivable);
	}
	
	public String BondInfo(){
		int duration = 0;
		this.driver.swipeToUp(duration);
		return this.driver.elementGetText(TXT_BondBillAmount)+","+this.driver.elementGetText(TXT_BondAmountPaid)+","+this.driver.elementGetText(TXT_BondTotalRefundable);
	}
	
	public String OtherInfo(){
		this.driver.swipeToUpToFindElement(this.TXT_OtherTotalReceivable);
		return this.driver.elementGetText(TXT_OtherActualIncome)+","+this.driver.elementGetText(TXT_OtherNote)+","+this.driver.elementGetText(TXT_OtherTotalReceivable);
	}
	
	public String TotalInfo(){
		this.driver.swipeToUpToFindElement(this.TXT_MemoInfo);
		return this.driver.elementGetText(TXT_TotalBond)+","+this.driver.elementGetText(TXT_TotalBill)+","+this.driver.elementGetText(TXT_TotalOther)+","+this.driver.elementGetText(TXT_TotalReceivable);
	}
	
	public String ReasonsInfo(){
		return this.driver.elementGetText(TXT_RentReasons);
	}
	
	public String MemoInfo(){
		return this.driver.elementGetText(TXT_MemoInfo);
	}
	
	//【合同详情】查看退租待修改状态下的合同退租审核-方法
	
	public void ClickViewRentAuditing(){
		this.driver.click(TXT_ViewRentAuditing);
	}
	
	/*public String RentAuditingInfo(){
		this.driver.waitForElement(TXT_RentAuditingPresenter, 3);
		return this.driver.elementGetText(TXT_RentAuditingPresenter)+","+this.driver.elementGetText(TXT_RentAuditingDate)+","+this.driver.elementGetText(TXT_RentAuditingWait);
	}*/
	
	public boolean CheakCurrentAudit(){
		return this.driver.isElementFound(TXT_CurrentAudit);
	}
	
	//【合同详情】提交作废申请的合同查看作废审核-方法
	
	public void ClickViewDeleteAuditing(){
		this.driver.click(TXT_ViewDeleteAuditing);
	}
	
	public String DeleteAuditingInfo(){
		this.driver.waitForElement(TXT_DeleteAuditingPresenter, 3);
		return this.driver.elementGetText(TXT_DeleteAuditingPresenter)+","+this.driver.elementGetText(TXT_DeleteAuditingDate)+","+this.driver.elementGetText(TXT_DeleteAuditingWait);
	}
	
	//【合同详情】提交作废审核的合同查看作废原因-方法
	public void ClickViewDeleteReason(){
		this.driver.click(TXT_ViewDeleteReason);
	}
	
	public String DeleteReasonInfo(){
		this.driver.waitForElement(TXT_DeleteReason, 3);
		return this.driver.elementGetText(TXT_DeleteReason)+","+this.driver.elementGetText(TXT_DeleteReasonProcessing);
	}
	
	
	
}
