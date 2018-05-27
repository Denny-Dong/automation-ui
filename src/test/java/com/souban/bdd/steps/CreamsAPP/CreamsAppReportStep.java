package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAppReportStep extends BaseStep{
	//报备列表
	@When("^点击报备列表进入报备列表页面$")
	public void 点击报备列表进入报备列表页面() throws Throwable {
		 this.creamsAppReportFlow.VerifyGotoReportList();
	}

	@Then("^app列表显示客户 \"([^\"]*)\"$")
	public void app列表显示客户(String arg1) throws Throwable {
	  this.creamsAppReportFlow.VerifyReportCustomer(arg1);
	}

	@Then("^app\"([^\"]*)\"的性别为 \"([^\"]*)\"$")
	public void app_的性别为(String arg1, String arg2) throws Throwable {
	   this.creamsAppReportFlow.VerifyGender(arg1, arg2);
	}

	@Then("^app\"([^\"]*)\"的状态为 \"([^\"]*)\"$")
	public void app_的状态为(String arg1, String arg2) throws Throwable {
	   this.creamsAppReportFlow.VerifyState(arg1, arg2);
	}

	@Then("^app\"([^\"]*)\"的报备信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"显示正确$")
	public void app_的报备信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
	    this.creamsAppReportFlow.VerifyReportInfo(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}
	
	//报备详情
	@When("^点击\"([^\"]*)\"进入该客户的报备详情页面$")
	public void 点击_进入该客户的报备详情页面(String arg1) throws Exception {
	    this.creamsAppReportFlow.GotoReportDetail(arg1);
	}

	@Then("^客户信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void 客户信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) throws Exception {
	    this.creamsAppReportFlow.VerifyCustomerInfo(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@Then("^客户描述 \"([^\"]*)\" 显示正确$")
	public void 客户描述_显示正确(String arg1) throws Exception {
	    this.creamsAppReportFlow.VerifyCustomerDescription(arg1);
	}

	@Then("^带看信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void 带看信息_显示正确(String arg1, String arg2, String arg3) throws Exception {
	    this.creamsAppReportFlow.VerifyViewInfo(arg1, arg2, arg3);
	}

	@Then("^报备流程中 \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void 报备流程中_显示正确(String arg1, String arg2) throws Exception {
	    this.creamsAppReportFlow.VerifyLogInfo(arg1, arg2);
	}
	
	//根据带看编号搜索
	@When("^点击搜索框进入搜索页面$")
	public void 点击搜索框进入搜索页面() throws Exception {
	    this.creamsAppReportFlow.GotoSearchPage();
	}

	@When("^输入一个存在的带看编号 \"([^\"]*)\"$")
	public void 输入一个存在的带看编号(String arg1) throws Exception {
	    this.creamsAppReportFlow.InputViewNum(arg1);
	}

	@Then("^列表显示该带看编号的客户 \"([^\"]*)\"$")
	public void 列表显示该带看编号的客户(String arg1) throws Exception {
	    this.creamsAppReportFlow.VerifySearchResult(arg1);
	}
}
