package com.souban.bdd.steps.CreamsWebStep.Tenant;

import com.souban.bdd.framework.Config;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TenantManagementStep extends BaseStep {
	Config config = Config.getInstance();

	@Given("^进入租客管理页面$")
	public void 进入租客管理页面() throws Exception {
		this.tenantManagementFlow.enterTenantManagementPage();
	}

	@When("^点击新建租客按钮$")
	public void 点击新建租客按钮() throws Exception {
		this.tenantManagementFlow.clickButtonOfCreateNewTenant();
	}

	@Then("^输入租客名称  \"([^\"]*)\"，并选择联想租客 \"([^\"]*)\"$")
	public void 输入租客名称_并选择联想租客(String arg1, String arg2) throws Exception {
		this.tenantManagementFlow.inputTenantNameInNewPage(arg1, arg2);
	}

	@Then("^保存租客$")
	public void 保存租客() throws Exception {
		this.tenantManagementFlow.saveTenant();
	}

	@Then("^清除租客状态选项$")
	public void 清除租客状态选项() throws Exception {
		this.tenantManagementFlow.clearTenantFilter();
	}

	@Then("^租客新建成功 \"([^\"]*)\"$")
	public void 租客新建成功(String arg1) throws Exception {
		this.tenantManagementFlow.checkTenantCreateSuccessful(arg1);
	}

	@When("^进入租客 \"([^\"]*)\"的详情页$")
	public void 进入租客_的详情页(String arg1) throws Exception {
		this.tenantManagementFlow.clickTenantDetil(arg1);
	}

	@When("^删除租客$")
	public void 删除租客() throws Exception {
		this.tenantManagementFlow.deleteTenant();
	}

	@Then("^列表无该租客信息$")
	public void 列表无该租客信息() throws Exception {
		this.tenantManagementFlow.sureDeleteTenant();
	}

	@Then("^点击标签\"([^\"]*)\"$")
	public void 点击标签(String arg1) throws Exception {
		this.tenantManagementFlow.chooseTenantLabel(arg1);
	}

	@Then("^新建的租客标签显示正确\"([^\"]*)\"$")
	public void 新建的租客标签显示正确(String arg1) throws Exception {
		this.tenantManagementFlow.checkLabelInTenant(arg1);
	}

	@When("^筛选一个楼宇\"([^\"]*)\"$")
	public void 筛选一个楼宇(String arg1) throws Exception {
		this.tenantManagementFlow.chooseOneBuilding(arg1);
	}

	@Then("^租客列表显示的楼宇都是筛选的楼宇\"([^\"]*)\"$")
	public void 租客列表显示的楼宇都是筛选的楼宇(String arg1) throws Exception {
		this.tenantManagementFlow.checkBuildingNameOnTenantList(arg1);
	}

	@Then("^显示租客详细信息$")
	public void 显示租客详细信息() throws Exception {
		this.tenantManagementFlow.checkTenantDetilInformation();
	}

	@When("^点击新增租赁合同按钮$")
	public void 点击新增租赁合同按钮() throws Exception {
		this.tenantManagementFlow.clickNewRentContract();
	}

	@When("^合同选择房源\"([^\"]*)\"$")
	public void 合同选择房源(String arg1) throws Exception {
		this.tenantManagementFlow.chooseOneRoomOnRentContract(arg1);
	}

	@When("^点击下一步$")
	public void 点击下一步() throws Exception {
		this.tenantManagementFlow.clickNextStep();
	}

	@Then("^补充押金、基础单价、生成租金明细 \"([^\"]*)\"\"([^\"]*)\"$")
	public void 补充押金_基础单价_生成租金明细(String arg1, String arg2) throws Exception {
		this.tenantManagementFlow.inputDepositAndPrice(arg1, arg2);
	}

	@Then("^保存并且新建成功$")
	public void 保存并且新建成功() throws Exception {
		this.tenantManagementFlow.submitApprovalAboutRentContract();
	}

	@When("^点击新增物业合同按钮$")
	public void 点击新增物业合同按钮() throws Exception {
		this.tenantManagementFlow.clickNewPropertyContract();
	}

	@Then("^补充押金、生成物业明细\"([^\"]*)\"$")
	public void 补充押金_生成物业明细(String arg1) throws Exception {
		this.tenantManagementFlow.inputDepositAndCreateProperty(arg1);
	}

	@Then("^补充押金、支付类型、提前付款时间、基础单价，生成物业明细\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 补充押金_支付类型_提前付款时间_基础单价_生成物业明细(String arg1, String arg2, String arg3, String arg4) throws Exception {
		this.tenantManagementFlow.inputDepositAndCreatePropertyDetil(arg1, arg2, arg3, arg4);
	}

	@Then("^点击查看工商信息$")
	public void 点击查看工商信息() throws Exception {
		this.tenantManagementFlow.clickViewBusinessInformation();
	}

	@When("^点击租客编辑按钮$")
	public void 点击租客编辑按钮() throws Exception {
		this.tenantManagementFlow.clickEditTenant();
	}

	@Then("^提示保存成功$")
	public void 提示保存成功() throws Exception {
		this.tenantManagementFlow.alertEditTenantSuccess();
	}

	@Then("^保存并且发起审核$")
	public void 保存并且发起审核() throws Exception {
		this.tenantManagementFlow.submitApproval();
	}

	@When("^至少选择一个审批人\"([^\"]*)\"$")
	public void 至少选择一个审批人(String approvaler) throws Exception {
		this.tenantManagementFlow.chooseApprovaler(config.get("creams.approver"));
	}

	@When("^删除审批人\"([^\"]*)\"$")
	public void 删除审批人(String approvaler) throws Exception {
		this.tenantManagementFlow.deleteApprovaler(config.get("creams.approver"));
	}

	@When("^提交审核，且提交失败\"([^\\\"]*)\"$")
	public void 提交审核_且提交失败(String message) throws Exception {
		this.tenantManagementFlow.clickSubmit();
		this.tenantManagementFlow.alertMessageFail(message);
	}

	@Then("^创建审核成功\"([^\\\"]*)\"$")
	public void 创建审核成功(String message) throws Exception {
		this.tenantManagementFlow.clickSubmit();
		this.tenantManagementFlow.alertMessageSuccess(message);
	}
	@Then("^检查格式是否正确$")
	public void 检查格式是否正确() throws Exception {
		this.tenantManagementFlow.checkApprovalDate();
	}

}
