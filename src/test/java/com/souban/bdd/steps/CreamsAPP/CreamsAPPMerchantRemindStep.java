package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPMerchantRemindStep extends BaseStep{
	//新建提醒
	@When("^点击操作列表中的提醒按钮$")
	public void 点击操作列表中的提醒按钮() throws Exception {
	    this.creamsAPPMerchantRemindFlow.clickRemind();
	    this.creamsAPPMerchantRemindFlow.intoRemindPage();
	}

	@When("^点击新增提醒按钮$")
	public void 点击新增提醒按钮() throws Exception {
	   this.creamsAPPMerchantRemindFlow.clickAddRemindButton();
	   this.creamsAPPMerchantRemindFlow.intoAddRemindPage();
	}

	@When("^选择提醒时间和输入提醒内容 \"([^\"]*)\"$")
	public void 选择提醒时间和输入提醒内容(String remindContent) throws Exception {
	    this.creamsAPPMerchantRemindFlow.clickDate();
	    this.creamsAPPMerchantRemindFlow.intoDate();
	    this.creamsAPPMerchantRemindFlow.selectDate();
	    this.creamsAPPMerchantRemindFlow.saveDate();
	    this.creamsAPPMerchantRemindFlow.clickTime();
	    this.creamsAPPMerchantRemindFlow.intoTime();
	    this.creamsAPPMerchantRemindFlow.selectTime();
	    this.creamsAPPMerchantRemindFlow.saveTime();
	    this.creamsAPPMerchantRemindFlow.inputRemindContent(remindContent);
	}
	
	@When("^点击新建提醒页面的保存按钮$")
	public void 点击新建提醒页面的保存按钮() throws Exception {
	    this.creamsAPPMerchantRemindFlow.clickSave();
	}

	@Then("^提醒列表中存在一条提醒内容为 \"([^\"]*)\"的提醒，提醒新建成功$")
	public void 提醒列表中存在一条提醒内容为_的提醒_提醒新建成功(String content) throws Exception {
		this.creamsAPPMerchantRemindFlow.intoRemindPage();
	    this.creamsAPPMerchantRemindFlow.checkRemindSuccessful(content);
	}




	//编辑提醒
	@When("^点击提醒内容为 \"([^\"]*)\"的提醒的操作按钮$")
	public void 点击提醒内容为_的提醒的操作按钮(String content) throws Exception {
	   this.creamsAPPMerchantRemindFlow.checkRemindSuccessful(content);
	   this.creamsAPPMerchantRemindFlow.clickRemindMore(content);
	}

	@When("^点击提醒操作列表中的编辑按钮$")
	public void 点击提醒操作列表中的编辑按钮() throws Exception {
	    this.creamsAPPMerchantRemindFlow.clickRemindEdit();
	    this.creamsAPPMerchantRemindFlow.intoRemindEditPage();
	}

	@When("^修改提醒内容为 \"([^\"]*)\"$")
	public void 修改提醒内容为(String content) throws Exception {
	    this.creamsAPPMerchantRemindFlow.eidtRemindContent(content);
	}

	@When("^点击编辑提醒页面的保存按钮$")
	public void 点击编辑提醒页面的保存按钮() throws Exception {
	    this.creamsAPPMerchantRemindFlow.clickSave();
	}



	//删除提醒
	@When("^点击提醒操作列表中的删除按钮$")
	public void 点击提醒操作列表中的删除按钮() throws Exception {
		this.creamsAPPMerchantRemindFlow.clickRemindDelete();
		this.creamsAPPMerchantRemindFlow.intoDeleteRemindPage();
	}
	@When("^点击确定要删除该条提醒吗的确定按钮$")
	public void 点击确定要删除该条提醒吗的确定按钮() throws Exception {
		this.creamsAPPMerchantRemindFlow.clickSureButton();
	}

	@Then("^提醒列表中不存存在一条提醒内容为 \"([^\"]*)\"的提醒，提醒新建成功$")
	public void 提醒列表中不存存在一条提醒内容为_的提醒_提醒新建成功(String content) throws Exception {
	    this.creamsAPPMerchantRemindFlow.deleteRemindSuccessful(content);
	}





	//新建后查看工作流招商提醒内容
	@When("^点击工作流进入工作流页$")
	public void 点击工作流进入工作流页() throws Exception {
		this.creamsAPPMerchantRemindFlow.clickWorkFlow();
		this.creamsAPPMerchantRemindFlow.intoWorkFlowPage();
	}

	@When("^选择招商提醒进入招商提醒页$")
	public void 选择招商提醒进入招商提醒页() throws Exception {
		this.creamsAPPMerchantRemindFlow.clickRemindList();
		//this.creamsAPPMerchantRemindFlow.intoRemindListPage();
	}

	@When("^点击待办事项进入待办事项列表$")
	public void 点击待办事项进入待办事项列表() throws Exception {
		this.creamsAPPMerchantRemindFlow.clickMattersTo();
	}

	@Then("^待办事项列表中存在一条客户名称为 \"([^\"]*)\"的提醒$")
	public void 待办事项列表中存在一条客户名称_的提醒(String arg1) throws Exception {
		this.creamsAPPMerchantRemindFlow.checkIsRemind(arg1);
	}

	//android
	@Then("^android招商提醒的内容和按钮类型显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void android招商提醒的内容和按钮类型显示正确(String arg1, String arg2, String arg3,String arg4) throws Exception {
		this.creamsAPPMerchantRemindFlow.checkcheckRemindContentForAndroid(arg1,arg2,arg3,arg4);
	}
	//ios
	@Then("^ios招商提醒的内容和按钮类型显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void ios招商提醒的内容和按钮类型显示正确(String arg1, String arg2, String arg3,String arg4) throws Exception {
		this.creamsAPPMerchantRemindFlow.checkcheckRemindContentForIOS(arg1,arg2,arg3,arg4);
	}



	//招商提醒点击完成,查看提完事项列表
	@When("^点击客户名称为 \"([^\"]*)\"的提醒的完成按钮$")
	public void 点击客户名称为_的提醒的完成按钮(String arg1) throws Exception {
		this.creamsAPPMerchantRemindFlow.clickFinishButton(arg1);
		this.creamsAPPMerchantRemindFlow.intoFinishPage();
	}

	@When("^点击确定要标记为\"([^\"]*)\"吗的确定按钮$")
	public void 点击确定要标记为_吗的确定按钮(String arg1) throws Exception {
		this.creamsAPPMerchantRemindFlow.clickConfirmButton();
	}

	@Then("^待办事项列表中不存在一条客户名称为 \"([^\"]*)\"的提醒$")
	public void 待办事项列表中不存在一条客户名称为_的提醒(String arg1) throws Exception {
		this.creamsAPPMerchantRemindFlow.checkNoRemind(arg1);
	}

	@When("^点击已完事项进入已完事项列表$")
	public void 点击已完事项进入已完事项列表() throws Exception {
		this.creamsAPPMerchantRemindFlow.clickmattersDown();
	}

	@When("^已完事项列表中存在一条客户名称为 \"([^\"]*)\"的提醒$")
	public void 已完事项列表中存在一条客户名称为_的提醒(String arg1) throws Exception {
		this.creamsAPPMerchantRemindFlow.checkIsRemind(arg1);
	}

	//android
	@Then("^Android招商提醒的内容显示正确 \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
	public void Android招商提醒的内容显示正确(String arg1, String arg2, String arg3) throws Exception {
		this.creamsAPPMerchantRemindFlow.checkDownRemindContentForAndroid(arg1,arg2,arg3);
	}

	//ios
	@Then("^IOS招商提醒的内容显示正确 \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
	public void IOS招商提醒的内容显示正确(String arg1, String arg2, String arg3) throws Exception {
		this.creamsAPPMerchantRemindFlow.checkDownRemindContentForIOS(arg1,arg2,arg3);
	}


	@Then("^招商提醒列表中存在删除按钮$")
	public void 招商提醒列表中存在删除按钮() throws Exception {
		this.creamsAPPMerchantRemindFlow.checkIsDeleteButton();
	}




	//招商提醒已完事项,点击删除
	@When("^点击客户名称为 \"([^\"]*)\"的提醒的删除按钮$")
	public void 点击客户名称为_的提醒的删除按钮(String arg1) throws Exception {
		this.creamsAPPMerchantRemindFlow.clickDeleteButton();
		this.creamsAPPMerchantRemindFlow.intoDeletePage();
	}

	@Then("^已完事项列表中不存在一条客户名称为 \"([^\"]*)\"的提醒，提醒删除成功$")
	public void 已完事项列表中不存在一条客户名称为_的提醒_提醒删除成功(String arg1) throws Exception {
		this.creamsAPPMerchantRemindFlow.checkNoRemind(arg1);
	}
}
