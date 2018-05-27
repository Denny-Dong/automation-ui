package com.souban.bdd.steps.CreamsWebStep.Contract;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContractSideboardStep extends BaseStep {
	@Given("^用户进入房源侧滑栏页面$")
	public void 用户进入房源侧滑栏页面() throws Throwable {
		this.contractSideboardFlow.enterRoomSideboard();
	}

	@Given("^用户进入合同详情侧滑栏$")
	public void 用户进入合同详情侧滑栏() throws Throwable {
		this.contractSideboardFlow.enterContractSideboard();
	}

	@Given("^用户进入备注侧滑栏$")
	public void 用户进入备注侧滑栏() throws Throwable {
		this.contractSideboardFlow.enterRemarkPage();
	}

	@When("^在输入框中输入备注内容\"([^\"]*)\"$")
	public void 在输入框中输入备注内容(String arg1) throws Throwable {
		this.contractSideboardFlow.fillRemark(arg1);
	}

	@When("^点击备注提交$")
	public void 点击备注提交() throws Throwable {
		this.contractSideboardFlow.clickRemarkSubmit();
	}

	@Then("^备注提交成功提醒$")
	public void 备注提交成功提醒() throws Throwable {
		this.contractSideboardFlow.newRemarkSuccessfully();
	}

	@Then("^新建一份时间为当前的备注$")
	public void 新建一份时间为当前的备注() throws Throwable {
		this.contractSideboardFlow.newRemarkTimeCurrent();
	}

	@Then("^清空输入框\"([^\"]*)\"$")
	public void 清空输入框(String arg1) throws Throwable {
		// this.contractSideboardFlow.clearRemark(arg1);
	}

	@Then("^删除这条备注$")
	public void 删除这条备注() throws Throwable {
		this.contractSideboardFlow.deleteRemark();
	}

	@When("^点击这条备注的编辑图标$")
	public void 点击这条备注的编辑图标() throws Throwable {
		this.contractSideboardFlow.clickRemarkEdit();
	}

	@Then("^输入框内容为原备注内容\"([^\"]*)\"$")
	public void 输入框内容为原备注内容(String arg1) throws Throwable {
		this.contractSideboardFlow.thisRemarkInput(arg1);
	}

	@Then("^点击备注修改提交按钮$")
	public void 点击备注修改提交按钮() throws Throwable {
		this.contractSideboardFlow.remarkEditSubmit();
	}

	@When("^点击右下角退租按钮$")
	public void 点击右下角退租按钮() throws Throwable {
		this.contractSideboardFlow.rerentSideboard();
	}

	@Then("^弹出退租协议$")
	public void 弹出退租协议() throws Throwable {
		this.contractSideboardFlow.enterRerentPageSuccessfully();
	}

}
