package com.souban.bdd.steps.CreamsWebStep.Export;

import com.souban.bdd.framework.Config;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExportFileStep extends BaseStep {

	Config config = Config.getInstance();

	@When("^用户在楼宇列表$")
	public void 用户在楼宇列表() throws Exception {

	}

	@When("^重置自定义列并选中\"([^\"]*)\"$")
	public void 重置自定义列并选中(String listName) throws Exception {
		this.exportFileFlow.resetCustomColumnsChooseOneColumn(listName);
	}

	@Then("^列表中显示\"([^\"]*)\"$")
	public void 列表中显示(String listName) throws Exception {
		this.exportFileFlow.hasColumn(listName);
	}

	@When("^点击报表导出$")
	public void 点击报表导出() throws Exception {
		this.exportFileFlow.reportExport();
	}

	@Then("^导出报表成功 \"([^\"]*)\"$")
	public void 导出报表成功(String fileName) throws Exception {
		this.exportFileFlow.reportExportSucceed(fileName);
	}

	@Given("^用户在房源管理可招商页面$")
	public void 用户在房源管理可招商页面() throws Exception {
		this.exportFileFlow.enterRoomsPage();
	}

	@When("^用户在房源管理已租房源列表$")
	public void 用户在房源管理已租房源列表() throws Exception {
		this.exportFileFlow.enterRentedRoomsPage();
	}

	@When("^用户在房源管理所有房源列表$")
	public void 用户在房源管理所有房源列表() throws Exception {
		this.exportFileFlow.enterAllRoomsPage();
	}

	@When("^用户在招商管理客户管理列表$")
	public void 用户在招商管理客户管理列表() throws Exception {
		this.exportFileFlow.enterCustomerManagePage();
	}

	@When("^用户在招商管理我的渠道列表$")
	public void 用户在招商管理我的渠道列表() throws Exception {
		this.exportFileFlow.enterMyChannelPage();
	}

	@When("^用户在租客管理列表$")
	public void 用户在租客管理列表() throws Exception {
		this.exportFileFlow.enterTenantManagementPage();
	}

	@When("^用户在租赁合同列表$")
	public void 用户在租赁合同列表() throws Exception {
		this.exportFileFlow.enterLeaseContractPage();
	}

	@When("^用户在租赁合同归档合同列表$")
	public void 用户在租赁合同归档合同列表() throws Exception {
		this.exportFileFlow.enterArchivingContractPage();
	}

	@When("^用户在物业合同列表$")
	public void 用户在物业合同列表() throws Exception {
		this.exportFileFlow.enterPropertyContractPage();
	}

	@When("^用户在物业合同归档合同列表$")
	public void 用户在物业合同归档合同列表() throws Exception {
		this.exportFileFlow.enterArchivingPropertyContractPage();
	}

	@When("^用户在收付款所有账单列表$")
	public void 用户在收付款所有账单列表() throws Exception {
		this.exportFileFlow.enterReceivePaymentPage();
	}

	@When("^用户在收付款保证金列表$")
	public void 用户在收付款保证金列表() throws Exception {
		this.exportFileFlow.enterMarginBalancePage();
	}

	@When("^用户在收付款收支流水列表$")
	public void 用户在收付款收支流水列表() throws Exception {
		this.exportFileFlow.enterIncomeRecordPage();
	}

	@When("^用户在收付款开票记录列表$")
	public void 用户在收付款开票记录列表() throws Exception {
		this.exportFileFlow.enterBillingRecordsPage();
	}

	@When("^用户在资产评估租金预测列表$")
	public void 用户在资产评估租金预测列表() throws Exception {
		this.exportFileFlow.enterCashFlowForecastPage();
	}

	@When("^用户在资产评估预算列表$")
	public void 用户在资产评估预算列表() throws Exception {
		this.exportFileFlow.enterBudgetaryListPage();
	}

	@When("^用户在资产评估资产收益列表$")
	public void 用户在资产评估资产收益列表() throws Exception {
		this.exportFileFlow.enterAssetIncome();
	}
}
