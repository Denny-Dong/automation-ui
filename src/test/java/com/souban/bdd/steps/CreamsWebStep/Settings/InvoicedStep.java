package com.souban.bdd.steps.CreamsWebStep.Settings;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvoicedStep extends BaseStep {
	@When("^清除筛选条件$")
	public void 清除筛选条件() throws Throwable {
		this.invoicedFlow.clearOptions();
	}

	@Then("^勾选这条账单$")
	public void 勾选这条账单() throws Throwable {
		this.invoicedFlow.chooseBillToInvoice();
	}

	@Then("^点击开票$")
	public void 点击开票() throws Throwable {
		this.invoicedFlow.getInvoiceInformationOnList();
	}

	@Then("^开票信息界面出现勾选中可开票的账单的开票信息$")
	public void 开票信息界面出现勾选中可开票的账单的开票信息() throws Throwable {
		this.invoicedFlow.finishAndCheckInvoiceIn();
	}

	@Given("^用户进入开票设置$")
	public void 用户进入开票设置() throws Throwable {
		this.invoicedFlow.enterInvoicingSettings();
	}

	@When("^进入售方信息$")
	public void 进入售方信息() throws Throwable {
		this.invoicedFlow.enterSellersInformation();
	}

	@When("^点击“\\+信息”按钮$")
	public void 点击_信息_按钮() throws Throwable {
		this.invoicedFlow.createSellersInformation();
	}

	@When("^填写了信息并提交 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void 填写了信息并提交(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)
			throws Throwable {
		this.invoicedFlow.inputSellersInformation(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^保存该售方信息 \"([^\"]*)\"$")
	public void 保存该售方信息(String arg1) throws Throwable {
		this.invoicedFlow.checkNewSellersInformationExist(arg1);
	}

	@When("^进入货物名称$")
	public void 进入货物名称() throws Throwable {
		this.invoicedFlow.enterGoodsName();
	}

	@When("^点击“\\+信息”按钮，选择自建$")
	public void 点击_信息_按钮_选择自建() throws Throwable {
		this.invoicedFlow.chooseGoodsNameAndSlefBuilt();
	}

	@When("^填写了货物信息并提交 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void 填写了货物信息并提交(String arg1, String arg2, String arg3) throws Throwable {
		this.invoicedFlow.inputGoodsInformation(arg1, arg2, arg3);
	}

	@Then("^保存该货物名称$")
	public void 保存该货物名称() throws Throwable {
		this.invoicedFlow.saveGoodsName();
	}

	@When("^点击编辑按钮，更改信息 \"([^\"]*)\"$")
	public void 点击编辑按钮_更改信息(String arg1) throws Throwable {
		this.invoicedFlow.editSellerInformation(arg1);
	}

	@Then("^售方信息名称被更改 \"([^\"]*)\"$")
	public void 售方信息名称被更改(String arg1) throws Throwable {
		this.invoicedFlow.checkEditSellerInformationSuccess(arg1);
	}

}
