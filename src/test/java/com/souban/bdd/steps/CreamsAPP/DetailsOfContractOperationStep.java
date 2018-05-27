package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DetailsOfContractOperationStep extends BaseStep{
	
	//【合同详情】已有历史审核的新建待审核的合同查看新建审核
	@Given("^点击导航$")
	public void 点击导航() throws Throwable {
		this.detailsOfContractOperationFlow.ClickNavigation();
	}

	@Given("^点击合同列表$")
	public void 点击合同列表() throws Throwable {
		this.detailsOfContractOperationFlow.ClickContractList();
	}
	
	@Given("^点击搜索合同$")
	public void 点击搜索合同() throws Throwable {
		this.detailsOfContractOperationFlow.ClickContractSearch();
	}
	
	@Given("^点击租客信息包含租客\"([^\"]*)\"的合同进入合同详情$")
	public void 点击租客信息包含租客_的合同进入合同详情(String arg1) throws Throwable {
	    this.detailsOfContractOperationFlow.ClickContrack(arg1);
	}

	@When("^点击右上角操作按钮$")
	public void 点击右上角操作按钮() throws Throwable {
		this.detailsOfContractOperationFlow.ClickContractOperation();
	}

	@When("^点击查看新建审核进入审核流程页面$")
	public void 点击查看新建审核进入审核流程页面() throws Throwable {
		this.detailsOfContractOperationFlow.ClickViewNewAudit();
	}

	/*@Then("^历史审核操作信息 提交人信息\"([^\"]*)\" \"([^\"]*)\" 审核不通过信息\"([^\"]*)\"显示正确$")
	public void 历史审核操作信息_提交人信息_审核不通过信息_显示正确(String arg1, String arg2, String arg3) throws Throwable {
		this.detailsOfContractOperationFlow.VerityHistoricalAuditInfo(arg1, arg2, arg3);
	}


	@Then("^当前审核流程信息 提交人信息\"([^\"]*)\" \"([^\"]*)\" 审核通过信息\"([^\"]*)\" \"([^\"]*)\"等待审核信息\"([^\"]*)\"显示正确$")
	public void 当前审核流程信息_提交人信息_审核通过信息_等待审核信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		this.detailsOfContractOperationFlow.VerityCurrentAuditInfo(arg1, arg2, arg3, arg4, arg5);
	}*/
	@Then("^历史审核操作信息 提交人信息\"([^\"]*)\" \"([^\"]*)\" 审核信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void 历史审核操作信息_提交人信息_审核信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
	    this.detailsOfContractOperationFlow.VerityHistoricalAuditInfo(arg1, arg2, arg3, arg4, arg5, arg6);
	}
	
	//IOS历史审核
	@Then("^历史审核操作信息 提交人信息\"([^\"]*)\" \"([^\"]*)\" 审核信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void 历史审核操作信息_提交人信息_审核信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Exception {
	    this.detailsOfContractOperationFlow.VerityHistoricalAuditInfoIOS(arg1, arg2, arg3, arg4, arg5);
	}

	@Then("^当前审核流程信息 提交人信息\"([^\"]*)\" \"([^\"]*)\" 等待审核信息\"([^\"]*)\"显示正确$")
	public void 当前审核流程信息_提交人信息_等待审核信息_显示正确(String arg1, String arg2, String arg3) throws Exception {
	    this.detailsOfContractOperationFlow.VerityCurrentAuditInfo(arg1, arg2, arg3);
	}
	
	
	
	
	//【合同详情】提交退租审核的合同查看退租协议
	@When("^点击查看退租协议进入退租协议页面$")
	public void 点击查看退租协议进入退租协议页面() throws Throwable {
	   this.detailsOfContractOperationFlow.ClickViewRentAgreement();
	}

//	@Then("^租客信息 退租发起方\"([^\"]*)\" 退租合同编号\"([^\"]*)\" 退租面积\"([^\"]*)\" 退租日期\"([^\"]*)\" 工商注册地址变更时间\"([^\"]*)\"显示正确$")
//	public void 租客信息_退租发起方_退租合同编号_退租面积_退租日期_工商注册地址变更时间_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
//	   this.detailsOfContractOperationFlow.VerityRenterInfo(arg1, arg2, arg3, arg4, arg5);
//	}
	
	@Then("^租客信息 退租发起方\"([^\"]*)\"  退租面积\"([^\"]*)\" 退租日期\"([^\"]*)\" 工商注册地址变更时间\"([^\"]*)\"显示正确$")
	public void 租客信息_退租发起方_退租面积_退租日期_工商注册地址变更时间_显示正确(String arg1, String arg2, String arg3, String arg4) throws Exception {
		this.detailsOfContractOperationFlow.VerityRenterInfo(arg1, arg2, arg3, arg4);
	}
	

	@Then("^房源信息 所属楼宇\"([^\"]*)\" 楼宇地址\"([^\"]*)\" 楼层房号\"([^\"]*)\" 面积\"([^\"]*)\" 显示正确$")
	public void 房源信息_所属楼宇_楼宇地址_楼层房号_面积_显示正确(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	   this.detailsOfContractOperationFlow.VerityBuildingInfo(arg1, arg2, arg3, arg4);
	}
	
/*	@Then("^房源信息 所属楼宇\"([^\"]*)\" 楼宇地址\"([^\"]*)\" 楼层\"([^\"]*)\" 房号\"([^\"]*)\" 面积\"([^\"]*)\" 显示正确$")
	public void 房源信息_所属楼宇_楼宇地址_楼层_房号_面积_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    this.detailsOfContractOperationFlow.VerityBuildingInfoAndroid(arg1, arg2, arg3, arg4, arg5);
	}*/

	@Then("^退租前账单 租金日期\"([^\"]*)\" 账单金额\"([^\"]*)\" 实收/付金额\"([^\"]*)\" 实际收入/支出\"([^\"]*)\" 总计应收\"([^\"]*)\"显示正确$")
	public void 退租前账单_租金日期_账单金额_实收_付金额_实际收入_支出_总计应收_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	   this.detailsOfContractOperationFlow.VerityRefundAccountInfo(arg1, arg2, arg3, arg4, arg5);
	}

	@Then("^保证金 账单金额\"([^\"]*)\" 实收金额\"([^\"]*)\" 总计应退\"([^\"]*)\"显示正确$")
	public void 保证金_账单金额_实收金额_总计应退_显示正确(String arg1, String arg2, String arg3) throws Throwable {
	    this.detailsOfContractOperationFlow.VerityBondInfo(arg1, arg2, arg3);
	}

	/*@Then("^其他费用 总计应收\"([^\"]*)\"显示正确$")
	public void 其他费用_总计应收_显示正确(String arg1) throws Throwable {
	    this.detailsOfContractOperationFlow.VerityOtherInfo(arg1);
	}*/
	
	@Then("^其他费用 实际收入 \"([^\"]*)\" 备注 \"([^\"]*)\" 总计应收\"([^\"]*)\"显示正确$")
	public void 其他费用_实际收入_备注_总计应收_显示正确(String arg1, String arg2, String arg3) throws Exception {
		this.detailsOfContractOperationFlow.VerityOtherInfo(arg1, arg2, arg3);
	}
	
	

	@Then("^费用总计 保证金结算\"([^\"]*)\" 账单结算\"([^\"]*)\" 其他费用\"([^\"]*)\" 总计应收\"([^\"]*)\"显示正确$")
	public void 费用总计_保证金结算_账单结算_其他费用_总计应收_显示正确(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	   this.detailsOfContractOperationFlow.VerityTotalInfo(arg1, arg2, arg3, arg4);
	}

	@Then("^退租原因 \"([^\"]*)\"显示正确$")
	public void 退租原因_显示正确(String arg1) throws Throwable {
		this.detailsOfContractOperationFlow.VerityReasonsInfo(arg1);
	}

	@Then("^备注信息 \"([^\"]*)\"显示正确$")
	public void 备注信息_显示正确(String arg1) throws Throwable {
	    this.detailsOfContractOperationFlow.VerityMemoInfo(arg1);
	}

	
	//【合同详情】查看退租待修改状态下的合同退租审核
	@When("^点击查看退租审核进入退租审核页面$")
	public void 点击查看退租审核进入退租审核页面() throws Throwable {
		this.detailsOfContractOperationFlow.ClickViewRentAuditing();
	}

	/*@Then("^历史审核操作 提交人信息\"([^\"]*)\" \"([^\"]*)\" 等待审核\"([^\"]*)\"显示正确$")
	public void 历史审核操作_提交人信息_等待审核_显示正确(String arg1, String arg2, String arg3) throws Throwable {
		this.detailsOfContractOperationFlow.VerityRentAuditingInfo(arg1, arg2, arg3);
	}
*/
	@Then("^不显示当前审核流程$")
	public void 不显示当前审核流程() throws Exception {
		this.detailsOfContractOperationFlow.CheakCurrentAudit();
	}
	
	//【合同详情】提交作废申请的合同查看作废审核
	@When("^点击查看作废审核进入作废审核页面$")
	public void 点击查看作废审核进入作废审核页面() throws Throwable {
	    this.detailsOfContractOperationFlow.ClickViewDeleteAuditing();
	}

/*	@Then("^当前审核流程 提交人信息\"([^\"]*)\" \"([^\"]*)\" 等待审核\"([^\"]*)\"显示正确$")
	public void 当前审核流程_提交人信息_等待审核_显示正确(String arg1, String arg2, String arg3) throws Throwable {
	    this.detailsOfContractOperationFlow.VerityDeleteAuditingInfo(arg1, arg2, arg3);
	}*/
	
	//【合同详情】提交作废审核的合同查看作废原因
	@When("^点击查看作废原因进入作废原因页面$")
	public void 点击查看作废原因进入作废原因页面() throws Throwable {
	    this.detailsOfContractOperationFlow.ClickViewDeleteReason();
	}

	@Then("^页面中 作废原因\"([^\"]*)\"和账单处理\"([^\"]*)\"显示正确$")
	public void 页面中_作废原因_和账单处理_显示正确(String arg1, String arg2) throws Throwable {
	    this.detailsOfContractOperationFlow.VerityDeleteReasonInfo(arg1, arg2);
	}


}
