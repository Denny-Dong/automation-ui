package com.souban.bdd.flows.CreamsWebFlow.Contract;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Contract.ContractAndContractNumberPage;

public class ContractAndContractNumberFlow {
	private ContractAndContractNumberPage contractAndContractNumberPage = null;

	public ContractAndContractNumberFlow(Driver driver) {
		this.contractAndContractNumberPage = PageFactory.getPage(ContractAndContractNumberPage.class, driver);

	}

	public void enterEdit() {
		this.contractAndContractNumberPage.editContract();
	}

	public void canNotEdit() {
		Assert.assertThat(this.contractAndContractNumberPage.canNotEdit(), is(true));
	}

	public void changeFollower() {
		this.contractAndContractNumberPage.changeFollower();
	}

	public void checkOperateMessage() {
		Assert.assertEquals(this.contractAndContractNumberPage.operateMessage(),
				this.contractAndContractNumberPage.seeOperateMessage());
	}

	public void enterLastContract() {
		this.contractAndContractNumberPage.seeLastContract();
	}

	public void LastContractRight() {
		Assert.assertThat(this.contractAndContractNumberPage.theOriginalContract(), is(true));
	}

	public void chooseHireContract(String FloorName, String roomnum, String customername) {
		this.contractAndContractNumberPage.enterRoom(FloorName, roomnum, customername);
	}

	public void continueHireContract(String followcustomername) {
		this.contractAndContractNumberPage.continueContract(followcustomername);
	}

	public void passCheck() {
		this.contractAndContractNumberPage.checkPass();
	}

	public void continueHireReminder(String roomnum) {
		Assert.assertThat(this.contractAndContractNumberPage.seeBeenHiredReminder(roomnum), is(true));
	}

	public void ruinContinueContract(String followcustomername) {
		this.contractAndContractNumberPage.deleteContinueContract(followcustomername);
	}

}
