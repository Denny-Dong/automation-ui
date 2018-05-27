package com.souban.bdd.pages.CreamsWebPage.Export;

import java.io.File;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class ExportFilePage extends ParentPage {

	public ExportFilePage(final Driver driver) {
		super(driver);
	}

	private UIElement BTN_OK = new UIElement("xpath=//div[text()='确定']");
	private UIElement BTN_HideButton = new UIElement("xpath=//i[@class='creamsicon_17 ant-dropdown-trigger']");
	private UIElement BTN_ListCustomization = new UIElement("xpath=//*[text()='列表自定义']");
	private UIElement BTN_ListExport = new UIElement("xpath=//*[text()='报表导出']");
	private UIElement BTN_Reset = new UIElement("xpath=//span[text()='重 置']/parent::button");
	private UIElement BTN_Save = new UIElement("xpath=//span[text()='保 存']/parent::button");
	private UIElement BTN_Confirm = new UIElement("xpath=//button[text()='确认']");
	private UIElement BTN_RoomsManage = new UIElement("xpath=//*[text()='房源管理']");
	private UIElement TXT_RentedRooms = new UIElement("//*[text()='已租房源']");
	private UIElement TXT_AllRooms = new UIElement("//*[text()='所有房源']");
	private UIElement TXT_CustomerManage = new UIElement("xpath=//*[text()='招商管理']");
	private UIElement TXT_MyChannel = new UIElement("xpath=//*[text()='我的渠道']");
	private UIElement TXT_TenantManagement = new UIElement("xpath=//*[text()='租客管理']");
	private UIElement TXT_LeaseContract = new UIElement("xpath=//*[text()='租赁合同']");
	private UIElement TXT_ArchivingContract = new UIElement("xpath=//*[text()='归档合同']");
	private UIElement TXT_PropertyContract = new UIElement("xpath=//*[text()='物业管理']");
	private UIElement TXT_ReceivePayment = new UIElement("xpath=//*[text()='收付款']");
	private UIElement TXT_MarginBalance = new UIElement("xpath=//*[text()='保证金余额']");
	private UIElement TXT_incomeRecord = new UIElement("xpath=//*[text()='收支流水']");
	private UIElement TXT_BillingRecords = new UIElement("xpath=//*[text()='开票记录']");
	private UIElement TXT_AssetValuation = new UIElement("xpath=//*[text()='资产评估']");
	private UIElement TXT_CashFlowForecast = new UIElement("xpath=//*[text()='现金流预测']");
	private UIElement TXT_BudgetaryList = new UIElement("xpath=//*[text()='预算列表']");

	// 选择列表自定义中的其中一列
	private UIElement BTN_ChooseColumn(String listName) {
		return new UIElement("xpath=//div[text()='" + listName + "']");
	}

	// 列表中的一列
	private UIElement TXT_Column(String listName) {
		return new UIElement("xpath=//span[text()='" + listName + "']");
	}

	// 重置自定义列并选中其中一列
	public void resetCustomColumnsChooseOneColumn(String listName) {
		this.driver.waitClickable(BTN_HideButton, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_HideButton);
		this.driver.waitClickable(BTN_ListCustomization, 5);
		this.driver.click(BTN_ListCustomization);
		this.driver.waitClickable(BTN_Reset, 5);
		this.driver.click(BTN_Reset);
		this.driver.waitForElement(this.BTN_ChooseColumn(listName), 5);
		this.driver.sleep(1000);
		this.driver.click(this.BTN_ChooseColumn(listName));
		this.driver.click(BTN_Save);
		this.driver.waitClickable(BTN_Confirm, 5);
		this.driver.click(BTN_Confirm);
	}

	// 列表中是否显示该列
	public boolean hasColumn(String listName) {
		this.driver.waitForElement(this.TXT_Column(listName), 5);
		try {
			this.driver.MoveToElement(this.TXT_Column(listName));
		} catch (Exception e) {
		}
		return this.driver.isElementFound(this.TXT_Column(listName));
	}

	// 导出报表
	public void reportExport() {
		this.driver.waitClickable(BTN_HideButton, 5);
		this.driver.click(BTN_HideButton);
		this.driver.waitClickable(BTN_ListExport, 5);
		this.driver.click(BTN_ListExport);
		this.driver.waitClickable(BTN_OK, 5);
		this.driver.click(BTN_OK);
	}

	// 导出报表是否成功
	public boolean reportExportSucceed(String fileName) {
		this.driver.sleep(5000);
		File files = new File("/Applications");
		String[] names = files.list();
		for (String s : names) {
			if (s.contains(fileName)) {
				File file = new File("/Applications/" + s);
				file.delete();
				return true;
			}
		}
		return false;
	}

	// 进入房源管理可招商房源
	public void enterRoomsPage() {
		this.driver.waitClickable(BTN_RoomsManage, 5);
		this.driver.click(BTN_RoomsManage);
	}

	// 进入房源管理已租房源
	public void enterRentedRoomsPage() {
		this.enterRoomsPage();
		this.driver.waitClickable(TXT_RentedRooms, 5);
		this.driver.click(TXT_RentedRooms);
	}

	// 进入房源管理所有房源
	public void enterAllRoomsPage() {
		this.enterRoomsPage();
		this.driver.waitClickable(TXT_AllRooms, 5);
		this.driver.click(TXT_AllRooms);
	}

	// 进入招商管理客户管理
	public void enterCustomerManagePage() {
		this.driver.waitClickable(TXT_CustomerManage, 5);
		this.driver.click(TXT_CustomerManage);
	}

	// 进入招商管理我的渠道
	public void enterMyChannelPage() {
		this.enterCustomerManagePage();
		this.driver.waitClickable(TXT_MyChannel, 5);
		this.driver.click(TXT_MyChannel);
	}

	// 进入租客管理
	public void enterTenantManagementPage() {
		this.driver.waitClickable(TXT_TenantManagement, 5);
		this.driver.click(TXT_TenantManagement);
	}

	// 进入租赁合同合同列表
	public void enterLeaseContractPage() {
		this.driver.waitClickable(TXT_LeaseContract, 5);
		this.driver.click(TXT_LeaseContract);
	}

	// 进入租赁合同归档合同
	public void enterArchivingContractPage() {
		this.enterLeaseContractPage();
		this.driver.waitClickable(TXT_ArchivingContract, 5);
		this.driver.click(TXT_ArchivingContract);
	}

	// 进入物业合同合同列表
	public void enterPropertyContractPage() {
		this.driver.waitClickable(TXT_PropertyContract, 5);
		this.driver.click(TXT_PropertyContract);
	}

	// 进入物业合同归档合同
	public void enterArchivingPropertyContractPage() {
		this.enterPropertyContractPage();
		this.driver.waitClickable(TXT_ArchivingContract, 5);
		this.driver.click(TXT_ArchivingContract);
	}

	// 进入收付款所有账单
	public void enterReceivePaymentPage() {
		this.driver.waitClickable(TXT_ReceivePayment, 5);
		this.driver.click(TXT_ReceivePayment);
	}

	// 进入收付款保证金列表
	public void enterMarginBalancePage() {
		this.enterReceivePaymentPage();
		this.driver.waitClickable(TXT_MarginBalance, 5);
		this.driver.click(TXT_MarginBalance);
	}

	// 进入收付款收支流水
	public void enterIncomeRecordPage() {
		this.enterReceivePaymentPage();
		this.driver.waitClickable(TXT_incomeRecord, 5);
		this.driver.click(TXT_incomeRecord);
	}

	// 进入收付款开票记录
	public void enterBillingRecordsPage() {
		this.enterReceivePaymentPage();
		this.driver.waitClickable(TXT_BillingRecords, 5);
		this.driver.click(TXT_BillingRecords);
	}

	// 进入资产评估资产收益列表
	public void enterAssetIncome() {
		this.driver.waitClickable(TXT_AssetValuation, 5);
		this.driver.click(TXT_AssetValuation);

	}

	// 进入资产评估租金预测
	public void enterCashFlowForecastPage() {
		this.driver.waitClickable(TXT_AssetValuation, 5);
		this.driver.click(TXT_AssetValuation);
		this.driver.waitClickable(TXT_CashFlowForecast, 5);
		this.driver.click(TXT_CashFlowForecast);
	}

	// 进入资产评估预算列表
	public void enterBudgetaryListPage() {
		this.driver.waitClickable(TXT_AssetValuation, 5);
		this.driver.click(TXT_AssetValuation);
		this.driver.waitClickable(TXT_BudgetaryList, 5);
		this.driver.click(TXT_BudgetaryList);
	}



}
