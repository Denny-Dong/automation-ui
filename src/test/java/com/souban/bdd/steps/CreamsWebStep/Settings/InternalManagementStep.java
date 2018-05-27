package com.souban.bdd.steps.CreamsWebStep;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InternalManagementStep extends BaseStep {

	@Then("^进入账户设置页面$")
	public void 进入账户设置页面() throws Exception {
		this.internalManagementFlow.enterAccountSettingsPage();
	}

	@Then("^返回内部管理主页面$")
	public void 返回内部管理主页面() throws Exception {
		this.internalManagementFlow.returnInternalManagementPage();
	}

	@Given("^输入租客名称\"([^\"]*)\"$")
	public void 输入租客名称(String arg1) throws Exception {
		this.internalManagementFlow.inputTenantName(arg1);
	}

	@Given("^新增一个关键词\"([^\"]*)\"$")
	public void 新增一个关键词(String arg1) throws Exception {
		this.internalManagementFlow.createNewKeywordOnContract(arg1);
	}

	@Then("^进入租赁合同关键词页面\"([^\"]*)\"$")
	public void 进入租赁合同关键词页面(String arg1) throws Exception {
		this.internalManagementFlow.chooseBuildingKeywordOfContract(arg1);
	}

	@Then("^检查该楼宇下的关键词\"([^\"]*)\"$")
	public void 检查该楼宇下的关键词(String arg1) throws Exception {
		this.internalManagementFlow.checkBuildingKeyword(arg1);
	}

	@When("^不显示关键词\"([^\"]*)\"$")
	public void 不显示关键词(String arg1) throws Exception {
		this.internalManagementFlow.cancelDisplayOfKeyword(arg1);
	}

	@Then("^检查关键词是否显示\"([^\"]*)\"$")
	public void 检查关键词是否显示(String arg1) throws Exception {
		this.internalManagementFlow.checkKeywordNotExist(arg1);
	}

	@Then("^删除关键词\"([^\"]*)\"$")
	public void 删除关键词(String arg1) throws Exception {
		this.internalManagementFlow.deleteKeywordOnContract(arg1);
	}

	@Then("^补充押金、生成物业费明细 \"([^\"]*)\"$")
	public void 补充押金_生成物业费明细(String arg1) throws Exception {
		this.internalManagementFlow.inputDepositAndPrice(arg1);
	}

	@Then("^进入物业合同关键词页面\"([^\"]*)\"$")
	public void 进入物业合同关键词页面(String arg1) throws Exception {
		this.internalManagementFlow.chooseBuildingKeywordOfPropertyContract(arg1);
	}

	@When("^点击删除按钮\"([^\"]*)\"$")
	public void 点击删除按钮(String arg1) throws Exception {
		this.internalManagementFlow.deleteSellerInformation(arg1);
	}

	@Then("^确认删除$")
	public void 确认删除() throws Exception {
		this.internalManagementFlow.sureToDeleteSellerInformation();
	}

	@Given("^在租赁合同模板页面$")
	public void 在租赁合同模板页面() throws Exception {
		this.internalManagementFlow.createNewContractTamplate();
	}

	@When("^输入合同模板名称\"([^\"]*)\"$")
	public void 输入合同模板名称(String arg1) throws Exception {
		this.internalManagementFlow.inputContractTamplateName(arg1);
	}

	@When("^上传合同模板$")
	public void 上传合同模板() throws Exception {
		this.internalManagementFlow.uploadContractTamplate();
	}

	@Then("^保存合同模板$")
	public void 保存合同模板() throws Exception {
		this.internalManagementFlow.saveContractTamplate();
	}

	@Then("^合同模板在列表中存在\"([^\"]*)\"$")
	public void 合同模板在列表中存在(String arg1) throws Exception {
		this.internalManagementFlow.checkContractTamplateOnList(arg1);
	}
	@When("^在列表中选择某一合同进入详情页$")
	public void 在列表中选择某一合同进入详情页() throws Exception {
		this.internalManagementFlow.enterContractDetil();
	}

	@When("^点击打印$")
	public void 点击打印() throws Exception {
		this.internalManagementFlow.clickPrintOfContract();
	}

	@Then("^选择合同模板进行打印\"([^\"]*)\"$")
	public void 选择合同模板进行打印(String arg1) throws Exception {
		this.internalManagementFlow.contractTemplatePrint(arg1);
	}

	@Then("^打印成功$")
	public void 打印成功() throws Exception {
		this.internalManagementFlow.checkContractPrintSuccessful();
	}
	@When("^点击删除模板按钮\"([^\"]*)\"$")
	public void 点击删除模板按钮(String arg1) throws Exception {
		this.internalManagementFlow.clickDeleteTemplate(arg1);
	}

	@Then("^合同模板删除成功\"([^\"]*)\"$")
	public void 合同模板删除成功(String arg1) throws Exception {
		this.internalManagementFlow.checkTemplateDeleteSuccessful(arg1);
	}
	@Given("^在物业合同模板页面$")
	public void 在物业合同模板页面() throws Exception {
		this.internalManagementFlow.createNewPropertyContractTamplate();
	}
	@When("^输入物业合同模板名称\"([^\"]*)\"$")
	public void 输入物业合同模板名称(String arg1) throws Exception {
		this.internalManagementFlow.inputPropertyContractTamplateName(arg1);
	}
	@Given("^在物业合同页面$")
	public void 在物业合同页面() throws Exception {
		this.internalManagementFlow.enterPropertyContractMangement();
	}
	@Given("^在通知单模板页面$")
	public void 在通知单模板页面() throws Exception {
		this.internalManagementFlow.createNewNoticeTamplate();
	}

	@When("^输入通知单名称\"([^\"]*)\"$")
	public void 输入通知单名称(String arg1) throws Exception {
		this.internalManagementFlow.inputNoticeTamplateName(arg1);
	}
	@When("^上传通知单模板$")
	public void 上传通知单模板() throws Exception {
		this.internalManagementFlow.uploadNoticeTamplate();
	}
	@When("^选中某一账单$")
	public void 选中某一账单() throws Exception {
		this.internalManagementFlow.chooseOneBill();
	}

	@When("^选择通知单催缴\"([^\"]*)\"$")
	public void 选择通知单催缴(String arg1) throws Exception {
		this.internalManagementFlow.createNoticeTemplate(arg1);
	}

	@Then("^催缴单生成成功\"([^\"]*)\"$")
	public void 催缴单生成成功(String arg1) throws Exception {
		this.internalManagementFlow.checkNoticeCreateSuccessful();
	}
	@When("^进入费用类型管理页面$")
	public void 进入费用类型管理页面() throws Exception {
		this.internalManagementFlow.enterBillTypePage();
	}

	@When("^新增费用类型\"([^\"]*)\"$")
	public void 新增费用类型(String arg1) throws Exception {
		this.internalManagementFlow.createNewBillType(arg1);
	}

	@Then("^费用类型新增成功\"([^\"]*)\"$")
	public void 费用类型新增成功(String arg1) throws Exception {
		this.internalManagementFlow.checkBillTypeCreateSuccessful(arg1);
	}
	@Then("^新费用类型账单新建成功 \"([^\"]*)\"$")
	public void 新费用类型账单新建成功(String arg1) throws Exception {
		this.internalManagementFlow.checkBillTypeOnDetil(arg1);
	}
	@When("^选择费用类型并删除\"([^\"]*)\"$")
	public void 选择费用类型并删除(String arg1) throws Exception {
		this.internalManagementFlow.deleteBillType(arg1);
	}

	@Then("^费用类型删除成功\"([^\"]*)\"$")
	public void 费用类型删除成功(String arg1) throws Exception {
		this.internalManagementFlow.checkBillTypeDelete(arg1);
	}
	@When("^进入租客标签管理页面$")
	public void 进入租客标签管理页面() throws Exception {
		this.internalManagementFlow.enterTenantLabelPage();
	}

	@When("^新增租客标签 \"([^\"]*)\"$")
	public void 新增租客标签(String arg1) throws Exception {
		this.internalManagementFlow.createNewTenantLabel(arg1);
	}

	@Then("^租客标签新建成功 \"([^\"]*)\"$")
	public void 租客标签新建成功(String arg1) throws Exception {
		this.internalManagementFlow.checkTenantLabelOnList(arg1);
	}
	@When("^编辑租客标签\"([^\"]*)\",\"([^\"]*)\"$")
	public void 编辑租客标签(String arg1, String arg2) throws Exception {
		this.internalManagementFlow.editTenantLabel(arg1,arg2);
	}
	@When("^删除租客标签\"([^\"]*)\"$")
	public void 删除租客标签(String arg1) throws Exception {
		this.internalManagementFlow.deleteTenantLabel(arg1);
	}

	@Then("^租客标签删除成功\"([^\"]*)\"$")
	public void 租客标签删除成功(String arg1) throws Exception {
		this.internalManagementFlow.checkTenantLabelDelete(arg1);
	}

}
