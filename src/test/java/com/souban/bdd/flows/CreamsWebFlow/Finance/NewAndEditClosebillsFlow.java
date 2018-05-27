package com.souban.bdd.flows.CreamsWebFlow.Finance;

import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Finance.NewAndEditClosebillsPage;

public class NewAndEditClosebillsFlow {
	private NewAndEditClosebillsPage newandeditclosebillspage = null;

	public NewAndEditClosebillsFlow(Driver driver) {
		this.newandeditclosebillspage = PageFactory.getPage(NewAndEditClosebillsPage.class, driver);
	}

	public void clickButtonOfCreateNewBill() {
		this.newandeditclosebillspage.clickButtonOfCreateNewBill();
	}

	public void inputPaymentBillInformation(String type, String starttime, String finishtime, String amount,
			String time, String payer, String building) {
		this.newandeditclosebillspage.inputPaymentBillInformation(type, starttime, finishtime, amount, time, payer,
				building);
	}

	public void submitNewBill() {
		this.newandeditclosebillspage.submitNewBill();
	}

	public void checkCreateNewBillSuccess(String payer) {
		Assert.assertThat(this.newandeditclosebillspage.checkCreateNewBillSuccess(payer), is(true));
	}

	public void clickAddPaymentRecord() {
		this.newandeditclosebillspage.clickAddPaymentRecord();
	}

	public void inputPaymentRecordInformation(String realamount, String realtime, String realpayer) {
		this.newandeditclosebillspage.inputPaymentRecordInformation(realamount, realtime, realpayer);
	}

	public void chooseAnotherBuilding(String building) {
		this.newandeditclosebillspage.chooseAnotherBuilding(building);
	}

	public void checkBillInTwoBuildings(String payer) {
		this.newandeditclosebillspage.checkBillInTwoBuildings(payer);
	}

	public void clickPaymentbills() {
		this.newandeditclosebillspage.clickPaymentbills();
	}

	public void enterDetailOfBill() {
		this.newandeditclosebillspage.enterDetailOfBill();
	}

	public void checkBillDetilInformation() {
		this.newandeditclosebillspage.checkBillDetilInformation();
	}

	public void chooseOneNotSettledBill() {
		this.newandeditclosebillspage.chooseOneNotSettledBill();
	}

	public void clickButtonOfAddRecord() {
		this.newandeditclosebillspage.clickButtonOfAddRecord();
	}

	public void checkPopupCollectionRecord() {
		Assert.assertThat(this.newandeditclosebillspage.checkPopupCollectionRecord(), is(true));
	}

	public void clickCloseBillButton(String reason) {
		this.newandeditclosebillspage.clickCloseBillButton(reason);
	}

	public void clickSureToCloseBill() {
		this.newandeditclosebillspage.clickSureToCloseBill();
	}

	public void chooseOneCloseBill() {
		this.newandeditclosebillspage.chooseOneCloseBill();
	}

	public void clickOpenBillButton() {
		this.newandeditclosebillspage.clickOpenBillButton();
	}

	public void checkBillWasOpen() {
		Assert.assertThat(this.newandeditclosebillspage.checkBillWasOpen(), is(true));
	}

	public void checkPermissionOfDeleteBill() {
		this.newandeditclosebillspage.checkPermissionOfDeleteBill();
	}

	public void searchPayer() {
		this.newandeditclosebillspage.searchPayer();
	}

	public void clickDeleteBillButton() {
		this.newandeditclosebillspage.clickDeleteBillButton();
	}

	public void checkPopupDeleteBill() {
		Assert.assertThat(this.newandeditclosebillspage.checkPopupDeleteBill(), is(true));
	}

	public void clickSureToDeleteBill() {
		this.newandeditclosebillspage.clickSureToDeleteBill();
	}

	public void checkForsubmitRecord() {
		Assert.assertThat(this.newandeditclosebillspage.checkForsubmitRecord(), is(true));
	}

	public void OnCollectPaymentPage() {
		this.newandeditclosebillspage.OnCollectPaymentPage();
	}

	public void checkDefaultBills() {
		Assert.assertThat(this.newandeditclosebillspage.checkDefaultBills(), is(true));
	}

	public void chooseBillOfCloseStatus() {
		this.newandeditclosebillspage.chooseBillOfCloseStatus();
	}

	public boolean checkCloseStatusOnList(String closestatues) {
		List<String> channels = new ArrayList<String>();
		channels = this.newandeditclosebillspage.closeStatusList();
		for (int i = 0; i < channels.size(); i++) {
			if (channels.contains(closestatues))
				return true;
		}
		return false;
	}

	public void chooseBillType(String billtype) {
		this.newandeditclosebillspage.chooseBillType(billtype);
	}

	public boolean checkBillTypeOnList(String billtype) {
		List<String> channels = new ArrayList<String>();
		channels = this.newandeditclosebillspage.billTypeList();
		for (int i = 0; i < channels.size(); i++) {
			if (channels.contains(billtype))
				return true;
		}
		return false;
	}

	public void clickOnNotSettlementBillPage() {
		this.newandeditclosebillspage.clickOnNotSettlementBillPage();
	}

	public void clickButtonOfSettlement() {
		this.newandeditclosebillspage.clickButtonOfSettlement();
	}

	public void clickSureToSettlementBill() {
		this.newandeditclosebillspage.clickSureToSettlementBill();
	}

	public void selectReceivablesBillOnlist() {
		this.newandeditclosebillspage.selectReceivablesBillOnlist();
	}

	public void adjustmentAmount(String Adamount, String Adtype) {
		this.newandeditclosebillspage.adjustmentAmount(Adamount, Adtype);
	}

	public void checkAdjustmentbillsuccessful() {
		this.newandeditclosebillspage.checkAdjustmentbillsuccessful();
	}

	public void selectPaymentBillOnlist() {
		this.newandeditclosebillspage.selectPaymentBillOnlist();
	}

	public void deleteAdjustment() {
		this.newandeditclosebillspage.deleteAdjustment();
	}

	public void clickBillNotesButton() {
		this.newandeditclosebillspage.clickBillNotesButton();
	}

	public void inputNotesInbillNotes(String notes) {
		this.newandeditclosebillspage.inputNotesInbillNotes(notes);
	}

	public void checkBillNotesCreateSuccessful() {
		this.newandeditclosebillspage.checkBillNotesCreateSuccessful();
	}

	public void billMatchingIncome() {
		this.newandeditclosebillspage.billMatchingIncome();
	}

	public void checkBillMatchingIncomeSuccess() {
		this.newandeditclosebillspage.checkBillMatchingIncomeSuccess();
	}

	public void clickButtonOfCreateNewReceiveBill() {
		this.newandeditclosebillspage.clickButtonOfCreateNewReceiveBill();
	}

	public void inputReceiveBillInformation(String type, String starttime, String finishtime, String amount,
			String time, String payer, String building) {
		this.newandeditclosebillspage.inputReceiveBillInformation(type, starttime, finishtime, amount, time, payer,
				building);
	}
}
