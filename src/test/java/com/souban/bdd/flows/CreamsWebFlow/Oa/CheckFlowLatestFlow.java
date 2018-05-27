package com.souban.bdd.flows.CreamsWebFlow.Oa;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.OaPage.CheckFlowLatestPage;

public class CheckFlowLatestFlow {
	private CheckFlowLatestPage checkFlowLatestPage = null;

	public CheckFlowLatestFlow(Driver driver) {
		this.checkFlowLatestPage = PageFactory.getPage(CheckFlowLatestPage.class, driver);

	}

	// public void chooseOnlyBuilding(String FloorNameOnly) {
	// this.checkFlowLatestPage.chooseMyOnlyBuilding(FloorNameOnly);
	//
	// }

	public void newHireContract(String FloorName, String roomName, String customername) {
		this.checkFlowLatestPage.newHireContract(FloorName, roomName, customername);

	}

	public void setViewer(String checkpeople) {
		this.checkFlowLatestPage.setCheckPeople(checkpeople);

	}

	public void inMyStart(String contractAbstract) {
		Assert.assertEquals(this.checkFlowLatestPage.enterIStarted(contractAbstract), contractAbstract);

	}

	public void waitingMyView(String contractAbstract) {
		Assert.assertEquals(this.checkFlowLatestPage.enterWaitingCheck(), contractAbstract);
	}

	public void enterCheck() {
		this.checkFlowLatestPage.enterCheckDetail();

	}

	public void passCheck() {
		this.checkFlowLatestPage.passCheck();

	}

	public void goneInWaitingMyCheck(String contractAbstract) {
		Assert.assertNotEquals(this.checkFlowLatestPage.checkSuccess(), contractAbstract);

	}

	public void viewOver(String contractAbstract) {
		Assert.assertEquals(this.checkFlowLatestPage.checkOver(), contractAbstract);

	}

	public void viewStatu(String Statu) {
		Assert.assertEquals(this.checkFlowLatestPage.seeStatus(), Statu);

	}

	public void normalExe(String contractStatus) {
		Assert.assertEquals(this.checkFlowLatestPage.checkNormalExe(), contractStatus);

	}

	public void checkerPassCheck() {
		this.checkFlowLatestPage.checkerPassCheck();

	}

	public void goingHire(String customernameNext) {
		this.checkFlowLatestPage.nextHired(customernameNext);

	}

	public void haveContract(String contractAbstract2) {
		Assert.assertEquals(this.checkFlowLatestPage.IStarthave(), contractAbstract2);
	}

	public void closeApproval() {
		this.checkFlowLatestPage.closeAproval();
	}

	public void reApply() {
		this.checkFlowLatestPage.reApply();
	}

	public void setDefaultChecker(String contractApprovalKinds, String buildingName, String checkpeople) {
		this.checkFlowLatestPage.setDefaultChecker(contractApprovalKinds, buildingName, checkpeople);
	}

	public void endHire(String endReason) {
		this.checkFlowLatestPage.endHired(endReason);
	}

	public void deleteContract() {
		this.checkFlowLatestPage.ruinHireContract();
	}

	public void deleteContractSucceed() {
		Assert.assertThat(this.checkFlowLatestPage.ruinCompelete(), is(true));
	}
}