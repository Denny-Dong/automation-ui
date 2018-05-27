package com.souban.bdd.steps.CreamsWebStep.Settings;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//清理多余信息暂时不用
public class JobSelfDefineStep extends BaseStep {

	@Given("^有行业编辑权限的用户进入自定义管理里的行业管理界面$")
	public void 有行业编辑权限的用户进入自定义管理里的行业管理界面() throws Exception {
		this.jobSelfDefineFlow.enterSlefDefineJob();
	}

	@When("^添加一个行业列表中并不存在的行业名称\"([^\"]*)\"$")
	public void 添加一个行业列表中并不存在的行业名称(String JobName) throws Exception {
		this.jobSelfDefineFlow.createJob(JobName);
	}

	@Then("^删除该行业名称\"([^\"]*)\"$")
	public void 删除该行业名称(String JobName) throws Exception {
		this.jobSelfDefineFlow.deleteJob(JobName);
	}

	@When("^添加一个行业列表中已存在的行业名称\"([^\"]*)\"$")
	public void 添加一个行业列表中已存在的行业名称(String JobName) throws Exception {
		this.jobSelfDefineFlow.createJob(JobName);
	}

	@Then("^报错提示，“行业名称重复”$")
	public void 报错提示_行业名称重复() throws Exception {
		this.jobSelfDefineFlow.JobRepeat();

	}

	@When("^用户点击新增租赁合同，输入租客名\"([^\"]*)\"并且在“所属行业”的输入框中输入行业列表中不存在的行业名称\"([^\"]*)\"$")
	public void 用户点击新增租赁合同_输入租客名_并且在_所属行业_的输入框中输入行业列表中不存在的行业名称(String myCustomer, String NotExistJob) throws Exception {
		this.jobSelfDefineFlow.enterNotExistJob(myCustomer, NotExistJob);
	}

	@Then("^行业输入框报错提示$")
	public void 行业输入框报错提示() throws Exception {
		this.jobSelfDefineFlow.notExistReminder();
	}

	@Then("^不能进入下一步$")
	public void 不能进入下一步() throws Exception {
		this.jobSelfDefineFlow.canNotNextStep();
	}

}
