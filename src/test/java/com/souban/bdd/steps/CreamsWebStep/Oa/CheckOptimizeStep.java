package com.souban.bdd.steps.CreamsWebStep.Oa;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//清理多余信息暂时不用
public class CheckOptimizeStep extends BaseStep {

	@Given("^选择一个租客名为\"([^\"]*)\"的租赁合同，该审核处于“新建待修改状态”$")
	public void 选择一个租客名为_的租赁合同_该审核处于_新建待修改状态(String customername) throws Exception {
		this.checkOptimizeFlow.chooseHireContract(customername);
	}

	@Then("^用户点开“查看审核”不能“关闭申请”（无此按钮）$")
	public void 用户点开_查看审核_不能_关闭申请_无此按钮() throws Exception {
		this.checkOptimizeFlow.seeCheck();

	}

	@Given("^用户进入工作流的审批模块$")
	public void 用户进入工作流的审批模块() throws Exception {
		this.checkOptimizeFlow.enterWorkFlow();
	}

	@When("^进入我已审批列表$")
	public void 进入我已审批列表() throws Exception {
		this.checkOptimizeFlow.enterBeenCheckedByMe();
	}

	@Then("^列表显示所有该用户已审批的合同审批,点击审批，出现审批需求弹框$")
	public void 列表显示所有该用户已审批的合同审批_点击审批_出现审批需求弹框() throws Exception {
		this.checkOptimizeFlow.seeDetail();
	}

	@Given("^选择楼宇\"([^\"]*)\",进入剖面图选择房号\"([^\"]*)\"来新建租赁人为\"([^\"]*)\"租赁合同$")
	public void 选择楼宇_进入剖面图选择房号_来新建租赁人为_租赁合同(String FloorName, String roomName, String customername) throws Exception {
		this.checkOptimizeFlow.newHireContract(FloorName, roomName, customername);
	}

	@Given("^提交人新建合同成功，设置审批人\"([^\"]*)\"$")
	public void 提交人新建合同成功_设置审批人(String checkpeople) throws Exception {
		this.checkOptimizeFlow.chooseChecker(checkpeople);
	}

	@When("^通过该\"([^\"]*)\"审核$")
	public void 通过该_审核(String customername) throws Exception {
		this.checkOptimizeFlow.passCheck(customername);
	}

	@Then("^然后进入该房间详情页面，作废用户为\"([^\"]*)\"的租赁合同,选择审核人\"([^\"]*)\"$")
	public void 然后进入该房间详情页面_作废用户为_的租赁合同_选择审核人(String customername, String checkpeople) throws Exception {
		this.checkOptimizeFlow.deleteHireContract(customername, checkpeople);
	}

	@Given("^选择楼宇\"([^\"]*)\",进入剖面图选择房号\"([^\"]*)\"，选择相应的租客名的租赁合同$")
	public void 选择楼宇_进入剖面图选择房号_选择相应的租客名的租赁合同(String FloorName, String customername) throws Exception {
		this.checkOptimizeFlow.enterTestRoom(FloorName, customername);
	}

	@Then("^编辑“作废原因”，点击保存，此时重新发起审核$")
	public void 编辑_作废原因_点击保存_此时重新发起审核() throws Exception {
		this.checkOptimizeFlow.editReasonForDelete();
	}

	@Then("^返回上一步，使该审核不通过$")
	public void 返回上一步_使该审核不通过() throws Exception {
		this.checkOptimizeFlow.checkFail();
	}

	@Then("^编辑“退租原因”，点击保存，此时重新发起审核$")
	public void 编辑_退租原因_点击保存_此时重新发起审核() throws Exception {
		this.checkOptimizeFlow.editCheckOut();
	}

	@Then("^使该审核不通过，保持退租待修改状态$")
	public void 使该审核不通过_保持退租待修改状态() throws Exception {
		this.checkOptimizeFlow.checkOutFail();
	}

	@When("^进入待我审批列表$")
	public void 进入待我审批列表() throws Exception {
		this.checkOptimizeFlow.enterWaitMyCheck();
	}

	@Then("^列表显示所有该用户当前需要审批的合同审批，点击想要审批的申请，出现审批需求弹框$")
	public void 列表显示所有该用户当前需要审批的合同审批_点击想要审批的申请_出现审批需求弹框() throws Exception {
		this.checkOptimizeFlow.enterNewCheckBarble();
	}
}
