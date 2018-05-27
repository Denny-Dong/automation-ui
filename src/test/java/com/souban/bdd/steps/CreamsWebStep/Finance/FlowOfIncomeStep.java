package com.souban.bdd.steps.CreamsWebStep.Finance;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlowOfIncomeStep extends BaseStep {
	@When("^用户进入收支流水列表$")
	public void 用户进入收支流水列表() throws Throwable {
		this.flowOfIncomeFlow.flowOfIncomePage();
	}

	@When("^点击新建收支流水$")
	public void 点击新建收支流水() throws Throwable {
		this.flowOfIncomeFlow.createNewIncome();
	}

	@When("^输入发生额、入账时间、对方单位名称 \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void 输入发生额_入账时间_对方单位名称(String arg1, String arg2, String arg3) throws Throwable {
		this.flowOfIncomeFlow.inputIncomeInformation(arg1, arg2, arg3);
	}

	@Then("^点击保存，新建流水成功$")
	public void 点击保存_新建流水成功() throws Throwable {
		this.flowOfIncomeFlow.saveAndCheckIncomeSuccessful();
	}

	@When("^勾选了几个流水$")
	public void 勾选了几个流水() throws Throwable {
		this.flowOfIncomeFlow.chooseSeveralIncomeList();
	}

	@When("^点击删除流水按钮$")
	public void 点击删除流水按钮() throws Throwable {
		this.flowOfIncomeFlow.deleteIncomelist();
	}

	@Then("^弹窗提示确认删除x条流水？确认后删除$")
	public void 弹窗提示确认删除x条流水_确认后删除() throws Throwable {
		this.flowOfIncomeFlow.checkIncomeNumberAndDelete();
	}

	@When("^点击某一条流水$")
	public void 点击某一条流水() throws Throwable {
		this.flowOfIncomeFlow.clickOneFlowOfIncome();
	}

	@When("^匹配账单$")
	public void 匹配账单() throws Throwable {
		this.flowOfIncomeFlow.flowOfIncomeMatchingBill();
	}

	@Then("^确定匹配账单$")
	public void 确定匹配账单() throws Throwable {
		this.flowOfIncomeFlow.sureOfAmountAndSaveMatching();
	}

	@Then("^匹配该收支流水和账单$")
	public void 匹配该收支流水和账单() throws Throwable {
		this.flowOfIncomeFlow.checkFlowOfIncomeMatchingBillSuccess();
	}

	@When("^筛选\"([^\"]*)\"$")
	public void 筛选(String arg1) throws Throwable {
		this.flowOfIncomeFlow.selectCreditMark(arg1);
	}

	@Then("^列表仅展示筛选的\"([^\"]*)\"的收支流水$")
	public void 列表仅展示筛选的_的收支流水(String arg1) throws Throwable {
		this.flowOfIncomeFlow.checkCreditMarkOnList(arg1);
	}

	@When("^点击确定匹配$")
	public void 点击确定匹配() throws Throwable {
		this.flowOfIncomeFlow.clickSureForCheckSomething();
	}

	@Then("^点击匹配的账单$")
	public void 点击匹配的账单() throws Throwable {
		this.flowOfIncomeFlow.clickBillOnIncomeList();
	}

	@Then("^可以返回$")
	public void 可以返回() throws Throwable {
		this.flowOfIncomeFlow.billReturnToIncome();
	}

	@Then("^匹配金额为账单未匹配和流水未匹配的较小值$")
	public void 匹配金额为账单未匹配和流水未匹配的较小值() throws Throwable {
		this.flowOfIncomeFlow.compareBillAmountAndIncomeAmount();
	}

	@When("^筛选收支流水的\"([^\"]*)\"$")
	public void 筛选收支流水的(String arg1) throws Throwable {
		this.flowOfIncomeFlow.selectMatchingState(arg1);
	}

	@Then("^列表仅展示筛选 \"([^\"]*)\"的收支流水$")
	public void 列表仅展示筛选_的收支流水(String arg1) throws Throwable {
		this.flowOfIncomeFlow.checkMatchingStateOnList(arg1);
	}

	@When("^输入搜索信息并搜索\"([^\"]*)\"$")
	public void 输入搜索信息并搜索(String arg1) throws Throwable {
		this.flowOfIncomeFlow.clickSearchBox(arg1);
	}

	@Then("^列表刷新显示对方单位名称和搜索内容匹配的收支流失\"([^\"]*)\"$")
	public void 列表刷新显示对方单位名称和搜索内容匹配的收支流失(String arg1) throws Throwable {
		this.flowOfIncomeFlow.checkSearchNameOnList(arg1);
	}

	@Given("^筛选收支流水为已匹配$")
	public void 筛选收支流水为已匹配() throws Throwable {
		this.flowOfIncomeFlow.chooseMathcedIncome();
	}

	@When("^删除流水的匹配$")
	public void 删除流水的匹配() throws Throwable {
		this.flowOfIncomeFlow.deleteRelationOfIncomeAndBill();
	}

}
