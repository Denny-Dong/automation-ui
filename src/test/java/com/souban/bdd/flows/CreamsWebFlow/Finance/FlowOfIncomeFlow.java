package com.souban.bdd.flows.CreamsWebFlow.Finance;

import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Finance.FlowOfIncomePage;

public class FlowOfIncomeFlow {
	private FlowOfIncomePage flowofincomepage = null;

	public FlowOfIncomeFlow(Driver driver) {
		this.flowofincomepage = PageFactory.getPage(FlowOfIncomePage.class, driver);
	}

	public void flowOfIncomePage() {
		this.flowofincomepage.flowOfIncomePage();
	}

	public void createNewIncome() {
		this.flowofincomepage.createNewIncome();
	}

	public void inputIncomeInformation(String iamount, String itime, String iname) {
		this.flowofincomepage.inputIncomeInformation(iamount, itime, iname);
	}

	public void saveAndCheckIncomeSuccessful() {
		this.flowofincomepage.saveAndCheckIncomeSuccessful();
	}

	public void chooseSeveralIncomeList() {
		this.flowofincomepage.chooseSeveralIncomeList();
	}

	public void deleteIncomelist() {
		this.flowofincomepage.deleteIncomelist();
	}

	public void checkIncomeNumberAndDelete() {
		this.flowofincomepage.checkIncomeNumberAndDelete();
	}

	public void clickOneFlowOfIncome() {
		this.flowofincomepage.clickOneFlowOfIncome();
	}

	public void flowOfIncomeMatchingBill() {
		this.flowofincomepage.flowOfIncomeMatchingBill();
	}

	public void sureOfAmountAndSaveMatching() {
		this.flowofincomepage.sureOfAmountAndSaveMatching();
	}

	public void checkFlowOfIncomeMatchingBillSuccess() {
		this.flowofincomepage.checkFlowOfIncomeMatchingBillSuccess();
	}

	public void selectCreditMark(String cmark) {
		this.flowofincomepage.selectCreditMark(cmark);
	}

	public boolean checkCreditMarkOnList(String creditmark) {
		List<String> mark = new ArrayList<String>();
		mark = this.flowofincomepage.creditMarkList();
		for (int i = 0; i < mark.size(); i++) {
			if (mark.contains(creditmark))
				return true;
		}
		return false;
	}

	public void clickSureForCheckSomething() {
		this.flowofincomepage.clickSureForCheckSomething();
	}

	public void clickBillOnIncomeList() {
		this.flowofincomepage.clickBillOnIncomeList();
	}

	public void billReturnToIncome() {
		this.flowofincomepage.billReturnToIncome();
	}

	public void compareBillAmountAndIncomeAmount() {
		this.flowofincomepage.compareBillAmountAndIncomeAmount();
	}

	public void selectMatchingState(String matchstate) {
		this.flowofincomepage.selectMatchingState(matchstate);
	}

	public void checkMatchingStateOnList(String matchstate) {
		List<String> mstate = new ArrayList<String>();
		mstate = this.flowofincomepage.matchingStateList();
		for (String str : mstate) {
			Assert.assertThat(str, is(matchstate));
		}
	}

	public void clickSearchBox(String sname) {
		this.flowofincomepage.clickSearchBox(sname);
	}

	public boolean checkSearchNameOnList(String sname) {
		List<String> name = new ArrayList<String>();
		name = this.flowofincomepage.searchNameList();
		for (int i = 0; i < name.size(); i++) {
			if (name.contains(sname))
				return true;
		}
		return false;
	}

	public void chooseMathcedIncome() {
		this.flowofincomepage.chooseMathcedIncome();
	}

	public void deleteRelationOfIncomeAndBill() {
		this.flowofincomepage.deleteRelationOfIncomeAndBill();
	}

}
