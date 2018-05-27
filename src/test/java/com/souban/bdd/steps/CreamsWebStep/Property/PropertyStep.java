package com.souban.bdd.steps.CreamsWebStep.Property;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PropertyStep extends BaseStep {
	@Given("^进入物业合同列表$")
	public void 进入物业合同列表() throws Throwable {
		this.propertyFlow.gotoEstateManagement();
	}

	@When("^点击物业单价降序排序$")
	public void 点击物业单价降序排序() throws Throwable {
		this.propertyFlow.EstatePriceDescending();
	}

	@Then("^验证物业合同列表根据物业单价降序排列$")
	public void 验证物业合同列表根据物业单价降序排列() throws Throwable {
		this.propertyFlow.checkDescendingEstatePrice();
	}

	@When("^点击物业单价升序排序$")
	public void 点击物业单价升序排序() throws Throwable {
		this.propertyFlow.EstatePriceAscending();
	}

	@Then("^验证物业合同列表根据物业单价升序排列$")
	public void 验证物业合同列表根据物业单价升序排列() throws Throwable {
		this.propertyFlow.checkAscendingEstatePrice();
	}

	@When("^点击计租日降序排序$")
	public void 点击计租日降序排序() throws Throwable {
		this.propertyFlow.RentDayDescending();
	}

	@Then("^验证物业合同列表根据计租日降序排列$")
	public void 验证物业合同列表根据计租日降序排列() throws Throwable {
		this.propertyFlow.checkDescendingRentDay();
	}

	@When("^点击计租日升序排序$")
	public void 点击计租日升序排序() throws Throwable {
		this.propertyFlow.RentDayAscending();
	}

	@Then("^验证物业合同列表根据计租日升序排列$")
	public void 验证物业合同列表根据计租日升序排列() throws Throwable {
		this.propertyFlow.checkAscendingRentDay();
	}

	@When("^点击结束日降序排序$")
	public void 点击结束日降序排序() throws Throwable {
		this.propertyFlow.SettlementDateDescending();
	}

	@Then("^验证物业合同列表根据结束日降序排列$")
	public void 验证物业合同列表根据结束日降序排列() throws Throwable {
		this.propertyFlow.checkDescendingSettlementDate();
	}

	@When("^点击结束日升序排序$")
	public void 点击结束日升序排序() throws Throwable {
		this.propertyFlow.SettlementDateAscending();
	}

	@Then("^验证物业合同列表根据结束日升序排列$")
	public void 验证物业合同列表根据结束日升序排列() throws Throwable {
		this.propertyFlow.checkAscendingSettlementDate();
	}

	@When("^进入抄表管理$")
	public void 进入抄表管理() throws Throwable {
		this.propertyFlow.gotoAmmeterReadingManagement();
	}

	@When("^添加电表的本期读数 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 添加电表的本期读数(String arg1, String arg2, String arg3) throws Throwable {
		this.propertyFlow.editReading(arg1, arg2, arg3);
	}

	@Then("^修改电表本期费用 \"([^\"]*)\" \"([^\"]*)\"，电表本期读数不变$")
	public void 修改电表本期费用_电表本期读数不变(String arg1, String arg2) throws Throwable {
		this.propertyFlow.modifyCurrentPrice(arg1, arg2);
	}

	@When("^筛选结束日 \"([^\"]*)\", \"([^\"]*)\"$")
	public void 筛选结束日(String startDate, String endDate) throws Exception {
		this.propertyFlow.chooseEndDate(startDate, endDate);
	}

	@Then("^列表显示匹配筛选日的合同 \"([^\"]*)\", \"([^\"]*)\"$")
	public void 列表显示匹配筛选日的合同(String startDate, String endDate) throws Exception {
		this.propertyFlow.checkEndDate(startDate, endDate);
	}

	@When("^筛选审核状态为 \"([^\"]*)\"$")
	public void 筛选审核状态为(String status) throws Exception {
		this.propertyFlow.chooseContractStatus(status);
	}

	@Then("^列表全是状态\"([^\"]*)\"的合同$")
	public void 列表全是状态_的合同(String status) throws Exception {
		this.propertyFlow.checkContractStatus(status);
	}

	@When("^点击面积降序排序$")
	public void 点击面积降序排序() throws Exception {
		this.propertyFlow.sizeDesc();
	}

	@Then("^列表根据面积降序排序$")
	public void 列表根据面积降序排序() throws Exception {
		this.propertyFlow.checkDescendingSize();
	}

	@Given("^进入归档合同列表$")
	public void 进入归档合同列表() throws Exception {
		this.propertyFlow.gotoArchiveContract();
	}

	@When("^进入物业合同侧滑栏$")
	public void 进入物业合同侧滑栏() throws Exception {
		this.propertyFlow.gotoContractInfo();
	}

	@Then("^可以查看物业合同详情$")
	public void 可以查看物业合同详情() throws Exception {
		this.propertyFlow.checkContractInfo();
	}

	@When("^点击添加物业合同$")
	public void 点击添加物业合同() throws Exception {
		this.propertyFlow.clickAddPropertyContract();
	}

	@Then("^自动填充基本信息$")
	public void 自动填充基本信息() throws Exception {
		this.propertyFlow.checkFillContractInfo();
	}

	@Given("^进入物业合同页面$")
	public void 进入物业合同页面() throws Exception {
		this.propertyFlow.gotoPropertyContract();
	}

	@When("^新建物业合同 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 新建物业合同(String renter, String deposit) throws Exception {
		this.propertyFlow.createPropertyContract(renter, deposit);
	}

	@Then("^审核通过$")
	public void 审核通过(){
        this.propertyFlow.oaPropertyContract();
	}

	@When("^退租物业合同$")
	public void 退租物业合同() throws Exception {
        this.propertyFlow.withdrawalPropertyContract();
	}

	@Then("^退租物业合同成功$")
	public void 退租物业合同成功() throws Exception {
        this.propertyFlow.isWithdrawalPropertyContract();
	}

	@Then("^生成物业退租结算账单$")
	public void 生成物业退租结算账单() throws Exception {
        this.propertyFlow.isWithdrawalBills();
	}

	@When("^作废物业合同 \"([^\"]*)\"$")
	public void 作废物业合同(String processBills) throws Exception {
        this.propertyFlow.invalidPropertyContract(processBills);
	}

	@Then("^验证账单被删除 \"([^\"]*)\"$")
	public void 账单删除(String renter) throws Exception {
        this.propertyFlow.verifyBills(renter);
	}

	@Then("^验证账单没有被删除 \"([^\"]*)\"$")
	public void 验证账单没有被删除(String renter) throws Exception {
        this.propertyFlow.verifyBillsExist(renter);
	}

	@And("^删除账单")
	public void 删除账单(){
		this.propertyFlow.deleteBills();
	}

}
