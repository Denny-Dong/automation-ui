package com.souban.bdd.steps.CreamsWebStep.Marketing;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerStep extends BaseStep {

	@When("^Click merchants management$")
	public void click_merchants_management() throws Throwable {
		this.customerFlow.clickMerchantsManagement();
	}

	@When("^Click new customer$")
	public void click_new_customer() throws Throwable {
		this.customerFlow.clickNewCustomer();
	}

	@When("^Input lessee information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void input_lessee_information(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)
			throws Throwable {
		this.customerFlow.inputCustomerInfo(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@When("^Choose Intention analysis \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void choose_Intention_analysis(String arg1, String arg2, String arg3) throws Throwable {
		this.customerFlow.ChooseIntentionAnalysis(arg1, arg2, arg3);
	}

	@When("^Choose channel type \"([^\"]*)\", \"([^\"]*)\"$")
	public void choose_channel_type(String arg1, String arg2) throws Throwable {
		this.customerFlow.Choose_channel_type(arg1, arg2);
	}

	@Given("^Choose customer status \"([^\"]*)\" \"([^\"]*)\"$")
	public void choose_customer_status(String arg1, String arg2) throws Throwable {
		this.customerFlow.ChooseCustomerStatus(arg1, arg2);
	}

	@When("^Click submit$")
	public void click_submit() throws Throwable {
		this.customerFlow.Submit();
	}

	@Then("^Added customer success \"([^\"]*)\"$")
	public void added_customer_success(String arg1) throws Throwable {
		this.customerFlow.AddedCustomerSuccess(arg1);
	}

	@Given("^进入我的客户$")
	public void goto_my_client() throws Throwable {
		this.customerFlow.goto_my_client();
	}

	@When("^修改客户状态为流失客户 \"([^\"]*)\"$")
	public void change_client_to_lost(String arg1) throws Throwable {
		this.customerFlow.change_client_to_lost(arg1);
	}

	@Then("^客户在公共池中 \"([^\"]*)\"$")
	public void client_in_public_pool(String arg1) throws Throwable {
		this.customerFlow.client_in_public_pool(arg1);
	}

	@Given("^进入公共池$")
	public void goto_public_pool() throws Throwable {
		this.customerFlow.goto_public_pool();
	}

	@When("^修改客户状态为潜在客户 \"([^\"]*)\"$")
	public void change_lost_to_client(String arg1) throws Throwable {
		this.customerFlow.change_client_to_myclient(arg1);
	}

	@Then("^客户在我的客户中 \"([^\"]*)\"$")
	public void client_in_myclient(String arg1) throws Throwable {
		this.customerFlow.client_in_my_client(arg1);
	}

	@When("^编辑客户提醒事项 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void edit_customer_reminder(String arg1, String arg2, String arg3) throws Throwable {
		this.customerFlow.edit_customer_reminder(arg1, arg2, arg3);
	}

	@Then("^验证是否提醒 \"([^\"]*)\"$")
	public void verify_whether_remind(String arg1) throws Throwable {
		this.customerFlow.verify_whether_remind(arg1);
	}

	@Given("^进入招商类待办事项$")
	public void goto_tobe_done() throws Throwable {

	}

	@When("^标记事项已完成 \"([^\"]*)\"$")
	public void markup_has_been_completed(String arg1) throws Throwable {

	}

	@Then("^已完事项中验证存在 \"([^\"]*)\"$")
	public void verify_exist(String arg1) throws Throwable {

	}

	@When("^选择途径为上门的进行筛选\"([^\"]*)\"$")
	public void 选择途径为上门的进行筛选(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.customerFlow.click_screen_way();
		this.customerFlow.checkWay(arg1);
	}

	@Then("^列表上客户都为上门的客户\"([^\"]*)\"$")
	public void 列表上客户都为上门的客户(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.customerFlow.doorsuccefully(arg1);
	}

	@When("^选择意向为未分类的客户\"([^\"]*)\"$")
	public void 选择意向为未分类的客户(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.customerFlow.checkIntention(arg1);
	}

	@Then("^列表上客户都为未分类的客户\"([^\"]*)\"$")
	public void 列表上客户都为未分类的客户(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.customerFlow.unclassifiedsuccessfully(arg1);
	}

	@Given("^点击功能选择按钮$")
	public void 点击功能选择按钮() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.customerFlow.checkFunction();
	}

	@Given("^进入发送所有人短信编辑页面$")
	public void 进入发送所有人短信编辑页面() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.customerFlow.enterMessagePage();
	}

	@Given("^编辑短信\"([^\"]*)\"$")
	public void 编辑短信(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.customerFlow.inputMessage(arg1);
	}

	@When("^点击发送按钮$")
	public void 点击发送按钮() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.customerFlow.clickSend();
	}

	@Then("^提示请充值$")
	public void 提示请充值() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.customerFlow.hintPay();
	}
}
