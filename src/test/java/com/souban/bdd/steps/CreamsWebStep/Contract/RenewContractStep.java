package com.souban.bdd.steps.CreamsWebStep.Contract;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RenewContractStep extends BaseStep {

	@When("^click renew$")
	public void click_renew() throws Throwable {
	   this.renewContractFlow.click_renew();
	}
	
	@When("^click nextStep$")
	public void click_nextStep() throws Throwable {
	    this.renewContractFlow.click_nextStep();
	}

	@Then("^input contractPayInfo \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void input_contractPayInfo(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    this.renewContractFlow.input_contractPayInfo(arg1, arg2, arg3, arg4);
	}

	@Then("^input contractDateInfo \"([^\"]*)\"$")
	public void input_contractDateInfo(String arg1) throws Throwable {
	    this.renewContractFlow.input_contractDateInfo(arg1);
	}

	@Then("^select lease \"([^\"]*)\"$")
	public void select_lease(String arg1) throws Throwable {
	   this.renewContractFlow.select_lease(arg1);
	}

	@Then("^add rent-free date \"([^\"]*)\"$")
	public void add_rent_free_date(String arg1) throws Throwable {
	   this.renewContractFlow.add_rent_free_date(arg1);
	}

	@Then("^input discount \"([^\"]*)\"$")
	public void input_discount(String arg1) throws Throwable {
	    this.renewContractFlow.input_discount(arg1);
	}

	@Then("^renew contract successfully$")
	public void renew_contract_successfully() throws Throwable {
	    this.renewContractFlow.VerifyRenewContractResult();
	}
}
