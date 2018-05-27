package com.souban.bdd.flows.CreamsWebFlow.Export;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Export.ExportFilePage;

public class ExportFileFlow {

	private ExportFilePage exportFilePage = null;

	public ExportFileFlow(final Driver driver) {
		this.exportFilePage = PageFactory.getPage(ExportFilePage.class, driver);
	}

	public void reportExport() {
		this.exportFilePage.reportExport();
	}

	public void reportExportSucceed(String fileName) {
		Assert.assertThat(this.exportFilePage.reportExportSucceed(fileName), is(true));
	}

	public void resetCustomColumnsChooseOneColumn(String listName) {
		this.exportFilePage.resetCustomColumnsChooseOneColumn(listName);
	}

	public void hasColumn(String listName) {
		Assert.assertThat(this.exportFilePage.hasColumn(listName), is(true));
	}

	public void enterRoomsPage() {
		this.exportFilePage.enterRoomsPage();
	}

	public void enterRentedRoomsPage() {
		this.exportFilePage.enterRentedRoomsPage();
	}

	public void enterAllRoomsPage() {
		this.exportFilePage.enterAllRoomsPage();
	}

	public void enterCustomerManagePage() {
		this.exportFilePage.enterCustomerManagePage();
	}

	public void enterMyChannelPage() {
		this.exportFilePage.enterMyChannelPage();
	}

	public void enterTenantManagementPage() {
		this.exportFilePage.enterTenantManagementPage();
	}

	public void enterLeaseContractPage() {
		this.exportFilePage.enterLeaseContractPage();
	}

	public void enterArchivingContractPage() {
		this.exportFilePage.enterArchivingContractPage();
	}

	public void enterPropertyContractPage() {
		this.exportFilePage.enterPropertyContractPage();
	}

	public void enterArchivingPropertyContractPage() {
		this.exportFilePage.enterArchivingPropertyContractPage();
	}

	public void enterReceivePaymentPage() {
		this.exportFilePage.enterReceivePaymentPage();
	}

	public void enterMarginBalancePage() {
		this.exportFilePage.enterMarginBalancePage();
	}

	public void enterIncomeRecordPage() {
		this.exportFilePage.enterIncomeRecordPage();
	}

	public void enterBillingRecordsPage() {
		this.exportFilePage.enterBillingRecordsPage();
	}

	public void enterAssetIncome() {
		this.exportFilePage.enterAssetIncome();
	}

	public void enterCashFlowForecastPage() {
		this.exportFilePage.enterCashFlowForecastPage();
	}

	public void enterBudgetaryListPage() {
		this.exportFilePage.enterBudgetaryListPage();
	}



}
