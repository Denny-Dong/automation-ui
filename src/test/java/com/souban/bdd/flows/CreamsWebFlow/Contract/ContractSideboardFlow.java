package com.souban.bdd.flows.CreamsWebFlow.Contract;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Contract.ContractSideboardPage;

public class ContractSideboardFlow {
	private ContractSideboardPage contractSideboardPage = null;

	public ContractSideboardFlow(final Driver driver) {
		this.contractSideboardPage = PageFactory.getPage(ContractSideboardPage.class, driver);
	}

	public void enterRoomSideboard() {
		this.contractSideboardPage.enterRoomSideboard();

	}

	public void enterContractSideboard() {
		this.contractSideboardPage.enterContractSideboard();

	}

	public void enterRemarkPage() {
		this.contractSideboardPage.enterRemarkPage();

	}

	public void fillRemark(String remark) {
		this.contractSideboardPage.fillRemark(remark);

	}

	public void clickRemarkSubmit() {
		this.contractSideboardPage.clickRemarkSubmit();

	}

	public void newRemarkSuccessfully() {
		Assert.assertThat(this.contractSideboardPage.newRemarkSuccessfully(), is(true));

	}

	public void newRemarkTimeCurrent() {
		Assert.assertThat(this.contractSideboardPage.newRemarkTimeCurrent(), is(true));

	}

	public void clearRemark(String remark) {
		Assert.assertThat(this.contractSideboardPage.clearRemark(remark), is(false));

	}

	public void deleteRemark() {
		this.contractSideboardPage.deleteRemark();

	}

	public void clickRemarkEdit() {
		this.contractSideboardPage.clickRemarkEdit();

	}

	public void thisRemarkInput(String remark) {
		Assert.assertThat(this.contractSideboardPage.thisRemarkInput(remark), is(true));

	}

	public void remarkEditSubmit() {
		this.contractSideboardPage.clickRemarkEditSubmit();

	}

	public void rerentSideboard() {
		this.contractSideboardPage.clickRerentSideboard();

	}

	public void enterRerentPageSuccessfully() {
		Assert.assertThat(this.contractSideboardPage.enterRerentPageSuccessfully(), is(true));

	}

}
