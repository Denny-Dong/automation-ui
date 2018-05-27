package com.souban.bdd.flows.CreamsWebFlow.Contract;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Contract.RenewContractPage;

public class RenewContractFlow {
	private RenewContractPage renewContractPage = null;

	public RenewContractFlow(final Driver driver) {
		this.renewContractPage = PageFactory.getPage(RenewContractPage.class, driver);
	}

	public void click_renew() {
		this.renewContractPage.click_renew();
	}

	public void click_nextStep() {
		this.renewContractPage.click_nextStep();
	}

	public void input_contractPayInfo(String rent, String method_of_payment, String payment_period,
			String payment_days_in_advance) {
		this.renewContractPage.input_contractPayInfo(rent, method_of_payment, payment_period, payment_days_in_advance);
	}

	public void input_contractDateInfo(String startDate) {
		this.renewContractPage.input_contractDateInfo(startDate);
	}

	public void select_lease(String lease) {
		this.renewContractPage.select_lease(lease);
	}

	public void add_rent_free_date(String rentFreeDate) {
		this.renewContractPage.add_rent_free_date(rentFreeDate);
	}

	public void input_discount(String discount) {
		this.renewContractPage.input_discount(discount);
	}

	public void VerifyRenewContractResult() {
		Assert.assertThat(this.renewContractPage.CheckRenewContractResult(), is(false));
	}
}
