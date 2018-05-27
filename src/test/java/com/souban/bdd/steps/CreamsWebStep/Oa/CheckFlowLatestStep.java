package com.souban.bdd.steps.CreamsWebStep.Oa;

import com.souban.bdd.framework.Config;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CheckFlowLatestStep extends BaseStep {

	// @Given("^选中单一楼宇\"([^\"]*)\"$")
	// public void 选中单一楼宇(String FloorNameOnly) throws Exception {
	// this.checkFlowLatestFlow.chooseOnlyBuilding(FloorNameOnly);
	// }

	Config config = Config.getInstance();

	@Given("^选择楼宇\"([^\"]*)\",进入剖面图选择房号\"([^\"]*)\"新建租赁人为\"([^\"]*)\"租赁合同$")
	public void 选择楼宇_进入剖面图选择房号_新建租赁人为_租赁合同(String FloorName, String roomName, String customername) throws Exception {
		this.checkFlowLatestFlow.newHireContract(FloorName, roomName, customername);
	}

	@Given("^提交人新建合同成功，设置临时审批人\"([^\"]*)\"$")
	public void 提交人新建合同成功_设置临时审批人(String checkpeople) throws Exception {
		this.checkFlowLatestFlow.setViewer(config.get("creams.approver"));
	}

	@Then("^进入“我发起的”界面查看是否有此租赁合同的申请记录，合同摘要显示\"([^\"]*)\"并点开该记录$")
	public void 进入_我发起的_界面查看是否有此租赁合同的申请记录_合同摘要显示_并点开该记录(String contractAbstract) throws Exception {
		this.checkFlowLatestFlow.inMyStart(contractAbstract);
	}

	@Then("^进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为\"([^\"]*)\"$")
	public void 进入待我审批界面_查看是否有该合同的审核申请_该合同的合同摘要为(String contractAbstract) throws Exception {
		this.checkFlowLatestFlow.waitingMyView(contractAbstract);
	}

	@Then("^进入该审核申请的合同审核界面$")
	public void 进入该审核申请的合同审核界面() throws Exception {
		this.checkFlowLatestFlow.enterCheck();
	}

	@Then("^临时审批人通过该审核$")
	public void 临时审批人通过该审核() throws Exception {
		this.checkFlowLatestFlow.passCheck();
	}

	@Then("^审核通过后，该审核申请在“待我审批”中消失，消失的合同摘要为\"([^\"]*)\"$")
	public void 审核通过后_该审核申请在_待我审批_中消失_消失的合同摘要为(String contractAbstract) throws Exception {
		this.checkFlowLatestFlow.goneInWaitingMyCheck(contractAbstract);
	}

	@Then("^进入我已审批查看处理结果，是否合同摘要为\"([^\"]*)\"$")
	public void 进入我已审批查看处理结果_是否合同摘要为(String contractAbstract) throws Exception {
		this.checkFlowLatestFlow.viewOver(contractAbstract);
	}

	@Then("^是否状态为\"([^\"]*)\"$")
	public void 是否状态为(String Statu) throws Exception {
		this.checkFlowLatestFlow.viewStatu(Statu);
	}

	@Then("^进入合同详情页看是否显示\"([^\"]*)\"$")
	public void 进入合同详情页看是否显示(String contractStatus) throws Exception {
		this.checkFlowLatestFlow.normalExe(contractStatus);
	}

	@Given("^通过该合同的审核$")
	public void 通过该合同的审核() throws Exception {
		this.checkFlowLatestFlow.checkerPassCheck();
	}

	@Given("^进入该合同同详情页面，对该租赁合同进行续签，续签的租客名为\"([^\"]*)\"，然后发起审核$")
	public void 进入该合同同详情页面_对该租赁合同进行续签_续签的租客名为_然后发起审核(String customernameNext) throws Exception {
		this.checkFlowLatestFlow.goingHire(customernameNext);
	}

	@Given("^进入“我发起的”界面，查看是否有该审核,该审核摘要为\"([^\"]*)\"$")
	public void 进入_我发起的_界面_查看是否有该审核_该审核摘要为(String contractAbstract2) throws Exception {
		this.checkFlowLatestFlow.haveContract(contractAbstract2);
	}

	@Given("^然后进入该合同审核，点击关闭申请$")
	public void 然后进入该合同审核_点击关闭申请请() throws Exception {
		this.checkFlowLatestFlow.closeApproval();
	}

	@Given("^再次进入该审核界面点击“再次申请”来发起再次审批$")
	public void 再次进入该审核界面点击_再次申请_来发起再次审批() throws Exception {
		this.checkFlowLatestFlow.reApply();
	}

	@Given("^选择租赁审核种类为\"([^\"]*)\"进行编辑，选择楼宇名\"([^\"]*)\"的默认审核人为\"([^\"]*)\"$")
	public void 选择租赁审核种类为_进行编辑_选择楼宇名_的默认审核人为(String contractApprovalKinds, String buildingName, String checkpeople)
			throws Exception {
		this.checkFlowLatestFlow.setDefaultChecker(contractApprovalKinds, buildingName, config.get("creams.approver"));
	}

	@Given("^进入该合同的详情页面，对该租赁合同,勾选退租原因\"([^\"]*)\"进行退租$")
	public void 进入该合同的详情页面_对该租赁合同_勾选退租原因_进行退租(String endReason) throws Exception {
		this.checkFlowLatestFlow.endHire(endReason);
	}

	@Given("^进入该合同的详情页面，点击作废，填写作废原因并且发起审核$")
	public void 进入该合同的详情页面_点击作废_填写作废原因并且发起审核() throws Exception {
		this.checkFlowLatestFlow.deleteContract();
	}

	@Then("^进入合同详情页看是否弹框显示“关联合同已作废或已删除”$")
	public void 进入合同详情页看是否弹框显示_关联合同已作废或已删除() throws Exception {
		this.checkFlowLatestFlow.deleteContractSucceed();
	}
}