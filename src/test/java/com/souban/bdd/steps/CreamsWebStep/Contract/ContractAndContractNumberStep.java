package com.souban.bdd.steps.CreamsWebStep.Contract;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContractAndContractNumberStep extends BaseStep {

	@Given("^用户新建租赁合同后被审核不通过，编辑租赁合同$")
	public void 用户新建租赁合同后被审核不通过_编辑租赁合同() throws Exception {
		this.contractAndContractNumberFlow.enterEdit();
	}

	@Then("^合同编号处于不能编辑状态（因为合同编号只有第一次审核通过后才能被赋予）$")
	public void 合同编号处于不能编辑状态_因为合同编号只有第一次审核通过后才能被赋予() throws Exception {
		this.contractAndContractNumberFlow.canNotEdit();
	}

	@Given("^有合同指派权限的用户进入合同编辑页面$")
	public void 有合同指派权限的用户进入合同编辑页面() throws Exception {
		this.contractAndContractNumberFlow.enterEdit();
	}

	@When("^将合同跟进人从修改为了$")
	public void 将合同跟进人从修改为了() throws Exception {
		this.contractAndContractNumberFlow.changeFollower();
	}

	@Then("^进入合同操作记录中显示$")
	public void 进入合同操作记录中显示() throws Exception {
		this.contractAndContractNumberFlow.checkOperateMessage();
	}

	@Given("^选择楼宇\"([^\"]*)\",进入剖面图选择房号\"([^\"]*)\"，选择相应的租客名为\"([^\"]*)\"的租赁合同$")
	public void 选择楼宇_进入剖面图选择房号_选择相应的租客名为_的租赁合同(String FloorName, String roomnum, String customername) throws Exception {
		this.contractAndContractNumberFlow.chooseHireContract(FloorName, roomnum, customername);
	}

	@Given("^用户进入续租合同详情页，点击查看上一份合同按钮$")
	public void 用户进入续租合同详情页_点击查看上一份合同按钮() throws Exception {
		this.contractAndContractNumberFlow.enterLastContract();
	}

	@Then("^划出该合同续租前的合同详情页$")
	public void 划出该合同续租前的合同详情页() throws Exception {
		this.contractAndContractNumberFlow.LastContractRight();
	}

	@Given("^用户从A租客的租赁合同页面续签一份B\"([^\"]*)\"合同$")
	public void 用户从a租客的租赁合同页面续签一份b_合同(String followcustomername) throws Exception {
		this.contractAndContractNumberFlow.continueHireContract(followcustomername);
	}

	@Given("^通过审核$")
	public void 通过审核() throws Exception {
		this.contractAndContractNumberFlow.passCheck();
	}

	@Then("^进到房源\"([^\"]*)\"中查看，B合同标为“续租”合同$")
	public void 进到房源_中查看_B合同标为_续租_合同(String roomnum) throws Exception {
		this.contractAndContractNumberFlow.continueHireReminder(roomnum);
	}

	@Then("^删除名为\"([^\"]*)\"的续租合同$")
	public void 删除名为_的续租合同(String followcustomername) throws Exception {
		this.contractAndContractNumberFlow.ruinContinueContract(followcustomername);
	}
}
