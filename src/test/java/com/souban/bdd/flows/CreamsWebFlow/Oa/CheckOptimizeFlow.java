package com.souban.bdd.flows.CreamsWebFlow.Oa;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.OaPage.CheckOptimizePage;

public class CheckOptimizeFlow {
	private CheckOptimizePage checkOptimizePage = null;

	public CheckOptimizeFlow(Driver driver) {
		this.checkOptimizePage = PageFactory.getPage(CheckOptimizePage.class, driver);

	}

	public void chooseHireContract(String customername) {
		this.checkOptimizePage.chooseHireContract(customername);
	}

	public void seeCheck() {
		Assert.assertThat(this.checkOptimizePage.seeCheck(), is(false));
	}

	public void enterWorkFlow() {
		this.checkOptimizePage.enterWorkFlow();
	}

	public void enterBeenCheckedByMe() {
		this.checkOptimizePage.seeBeenChecked();
	}

	public void seeDetail() {
		Assert.assertThat(this.checkOptimizePage.seeCheckedDetail(), is(true));
	}

	public void newHireContract(String FloorName, String customername, String roomName) {
		this.checkOptimizePage.newHireContract(FloorName, customername, roomName);
	}

	public void chooseChecker(String checkpeople) {
		this.checkOptimizePage.setCheckPeople(checkpeople);
	}

	public void passCheck(String customername) {
		this.checkOptimizePage.passCheck(customername);
	}

	public void deleteHireContract(String customername, String checkpeople) {
		this.checkOptimizePage.ruinHireContract(customername, checkpeople);
	}

	public void enterTestRoom(String FloorName, String customername) {
		this.checkOptimizePage.enterRoom(FloorName, customername);
	}

	public void editReasonForDelete() {
		this.checkOptimizePage.editReasonForDeleteChecked();
	}

	public void checkFail() {
		this.checkOptimizePage.makeTheCheckFail();
	}

	public void editCheckOut() {
		this.checkOptimizePage.editReasonForcheckO();
	}

	public void checkOutFail() {
		this.checkOptimizePage.CheckOutFail();
	}

	public void enterWaitMyCheck() {
		this.checkOptimizePage.waitingMycheck();
	}

	public void enterNewCheckBarble() {
		Assert.assertThat(this.checkOptimizePage.seeWaitingMyCheck(), is(true));
	}

}
