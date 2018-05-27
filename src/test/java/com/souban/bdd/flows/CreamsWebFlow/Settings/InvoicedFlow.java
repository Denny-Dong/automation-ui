package com.souban.bdd.flows.CreamsWebFlow.Settings;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Settings.InvoicedPage;

public class InvoicedFlow {
	private InvoicedPage invoicedpage = null;

	public InvoicedFlow(Driver driver) {
		this.invoicedpage = PageFactory.getPage(InvoicedPage.class, driver);
	}

	public void clearOptions() {
		this.invoicedpage.clearOptions();
	}

	public void chooseBillToInvoice() {
		this.invoicedpage.chooseBillToInvoice();
	}

	public void getInvoiceInformationOnList() {
		this.invoicedpage.getInvoiceInformationOnList();
	}

	public void finishAndCheckInvoiceIn() {
		this.invoicedpage.finishAndCheckInvoiceIn();
	}

	public void enterInvoicingSettings() {
		this.invoicedpage.enterInvoicingSettings();
	}

	public void enterSellersInformation() {
		this.invoicedpage.enterSellersInformation();
	}

	public void createSellersInformation() {
		this.invoicedpage.createSellersInformation();
	}

	public void inputSellersInformation(String sname, String taxpayerN, String address, String tell, String bank,
			String account) {
		this.invoicedpage.inputSellersInformation(sname, taxpayerN, address, tell, bank, account);
	}

	public void checkNewSellersInformationExist(String sname) {
		this.invoicedpage.checkNewSellersInformationExist(sname);
	}

	public void enterGoodsName() {
		this.invoicedpage.enterGoodsName();
	}

	public void chooseGoodsNameAndSlefBuilt() {
		this.invoicedpage.chooseGoodsNameAndSlefBuilt();
	}

	public void inputGoodsInformation(String gname, String number, String tax) {
		this.invoicedpage.inputGoodsInformation(gname, number, tax);
	}

	public void saveGoodsName() {
		this.invoicedpage.saveGoodsName();
	}

	public void editSellerInformation(String sname) {
		this.invoicedpage.editSellerInformation(sname);
	}

	public void checkEditSellerInformationSuccess(String sname) {
		this.invoicedpage.checkEditSellerInformationSuccess(sname);
	}
}
