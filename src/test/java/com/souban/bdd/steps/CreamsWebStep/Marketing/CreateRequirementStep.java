package com.souban.bdd.steps.CreamsWebStep.Marketing;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateRequirementStep extends BaseStep {

	@When("^用户进入招商管理点击新建需求$")
	public void 用户进入招商管理点击新建需求() throws Throwable {
		this.createRequirementFlow.enterCreateNewRequirementPage();
	}

	@When("^出现新建需求弹窗$")
	public void 出现新建需求弹窗() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.createRequirementFlow.checkPopupCreateRequirementPage();
	}

	@When("^检查预计签约时间和来访时间为当日$")
	public void 检查预计签约时间和来访时间为当日() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.createRequirementFlow.checkDefaultItemOfDate();
	}

	@When("^租客状态为初次接触$")
	public void 租客状态为初次接触() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.createRequirementFlow.checkDefaultItemOfRenterState();
	}

	@When("^输入其他必填项\\(租客、需求面积、选择房源\\) \"([^\"]*)\" \"([^\"]*)\"$")
	public void 输入其他必填项_租客_需求面积_选择房源(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.createRequirementFlow.inputNecessaryItem(arg1, arg2);
	}

	@When("^点击保存$")
	public void 点击保存() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.createRequirementFlow.saveNewRequirement();
	}

	@Then("^检查招商列表中出现新建的需求 \"([^\"]*)\"$")
	public void 检查招商列表中出现新建的需求(String arg1) throws Throwable {
		this.createRequirementFlow.checkcheckCreateSuccessful(arg1);
	}

	@When("^进入详情页\"([^\"]*)\"$")
	public void 进入详情页(String arg1) throws Exception {
		this.createRequirementFlow.enterDetilPage(arg1);
	}

	@When("^删除需求$")
	public void 删除需求() throws Throwable {
		this.createRequirementFlow.deleteRequirement();
	}

	@Then("^删除需求成功 \"([^\"]*)\"$")
	public void 删除需求成功(String arg1) throws Throwable {
		this.createRequirementFlow.checkDeleteSuccessful(arg1);
	}

	@When("^点击提醒按钮$")
	public void 点击提醒按钮() throws Throwable {
		this.createRequirementFlow.clickReminderIcon();
	}

	@Then("^新建提醒 \"([^\"]*)\"$")
	public void 新建提醒(String arg1) throws Throwable {
		this.createRequirementFlow.inputDateTimeConTent(arg1);
	}

	@Then("^新建提醒成功提醒$")
	public void 新建提醒成功提醒() throws Throwable {
		this.createRequirementFlow.saveNewReminder();
	}

	@Then("^关闭提醒设置页面$")
	public void 关闭提醒设置页面() throws Throwable {
		this.createRequirementFlow.checkCreateReminderSuccessful();
	}

	@Then("^检查新建的提醒 \"([^\"]*)\"$")
	public void 检查新建的提醒(String arg1) throws Throwable {
		this.createRequirementFlow.clickSureOfCreateReminderSuccessful();

		this.createRequirementFlow.checkReminderOnList(arg1);
	}

	@When("^用户进入需求侧滑栏$")
	public void 用户进入需求侧滑栏() throws Exception {
		this.createRequirementFlow.enterDemandSideslipBar();
	}

	@When("^点击备注按钮$")
	public void 点击备注按钮() throws Throwable {
		this.createRequirementFlow.clickButtonOfNotes();
	}

	@When("^展开输入框输入备注信息并提交 \"([^\"]*)\"$")
	public void 展开输入框输入备注信息并提交(String arg1) throws Throwable {
		this.createRequirementFlow.inputNotesInTextArea(arg1);
	}

	@Then("^出现备注提交成功的提示$")
	public void 出现备注提交成功的提示() throws Throwable {
		this.createRequirementFlow.checkForSubmitNotesSuccessful();
		this.createRequirementFlow.clickSureOfSubmitNotesSuccessful();
	}

	@Then("^备注列表中出现一条新增该条备注信息 \"([^\"]*)\"$")
	public void 备注列表中出现一条新增该条备注信息(String arg1) throws Throwable {
		this.createRequirementFlow.checkNotesInformation(arg1);
	}

	@When("^删除备注$")
	public void 删除备注() throws Throwable {
		this.createRequirementFlow.clickButtonOfDeleteNotes();
	}

	@Then("^弹窗提示确认删除这条备注$")
	public void 弹窗提示确认删除这条备注() throws Throwable {
		this.createRequirementFlow.checkSureForDeleteNotes();

	}

	@Then("^删除成功$")
	public void 删除成功() throws Throwable {
		this.createRequirementFlow.clickSureForDeleteNotes();
	}

	@Given("^租客联系人名称已填 \"([^\"]*)\"$")
	public void 租客联系人名称已填(String arg1) throws Throwable {
		this.createRequirementFlow.inputRenterContactName(arg1);
	}

	@Given("^租客联系人未在联想列表中$")
	public void 租客联系人未在联想列表中() throws Throwable {

	}

	@When("^点击新建租客联系人$")
	public void 点击新建租客联系人() throws Throwable {
		this.createRequirementFlow.clickCreateNewRenterContact();
	}

	@When("^输入租客电话 \"([^\"]*)\"$")
	public void 输入租客电话(String arg1) throws Throwable {
		this.createRequirementFlow.inputRenterContactNameAndTell(arg1);
	}

	@When("^保存新建联系人$")
	public void 保存新建联系人() throws Throwable {
		this.createRequirementFlow.saveRenterContact();
	}

	@Then("^再次输入该租客时该租客在联想列表中  \"([^\"]*)\"$")
	public void 再次输入该租客时该租客在联想列表中(String arg1) throws Throwable {
		this.createRequirementFlow.checkCreateNewRenterContactSuccessful(arg1);
	}

}
