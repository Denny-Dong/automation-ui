package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStep extends BaseStep{
	
	//房源搜素
	@When("^点击搜索$")
	public void 点击搜索() throws Throwable {
		this.searchFlow.ClickSearchBox();
	}
	

	@When("^输入房号 \"([^\"]*)\"$")
	public void 输入房号(String arg1) throws Throwable {
		this.searchFlow.checkSearch();
		this.searchFlow.ClickSendRoom(arg1); 
	}

	@Then("^列表包含搜索的房号的房源 \"([^\"]*)\"$")
	public void 列表包含搜索的房号的房源(String arg1) throws Throwable {
		this.searchFlow.CheakRoom(arg1);
	    
	}
  
	@Then("^房源 \"([^\"]*)\"信息 \"([^\"]*)\" \"([^\"]*)\"显示正确$")
	public void 房源_信息_显示正确(String arg1, String arg2, String arg3) throws Throwable {
	    this.searchFlow.VerityText(arg1, arg2, arg3);
	}
	
	@Then("^房源 \"([^\"]*)\"信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"显示正确$")
	public void 房源_信息_显示正确(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    this.searchFlow.VerityRoomInfoAndroid(arg1, arg2, arg3, arg4);
	}
	
	 //租赁合同搜索
	@When("^点击租赁合同$")
	public void 点击租赁合同() throws Throwable {
	   this.searchFlow.ClickTenanl();
	}

	@When("^输入租客\"([^\"]*)\"$")
	public void 输入租客(String arg1) throws Throwable {
		this.searchFlow.checkSearch();
	    this.searchFlow.Tenant(arg1);
	}


	@Then("^列表包含所搜索租客的租赁合同\"([^\"]*)\"$")
	public void 列表包含所搜索租客的租赁合同(String arg1) throws Throwable {
		this.searchFlow.checkTenant(arg1);
	}

	@Then("^合同信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 合同信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	  this.searchFlow.VerityContractText(arg1, arg2, arg3, arg4, arg5, arg6);
	}
	
	@Then("^合同信息\"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 合同信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
		this.searchFlow.VerityContractTextAndroid(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		
	}
	

	//客户搜索
	@When("^点击客户$")
	public void 点击客户() throws Throwable {
	  this.searchFlow.ClickCustomer();
	}

	@When("^输入客户名称\"([^\"]*)\"$")
	public void 输入客户名称(String arg1) throws Throwable {
		this.searchFlow.checkSearch();
	    this.searchFlow.Customer(arg1);
	}

	@Then("^列表包含所搜索的客户名称的客户\"([^\"]*)\"$")
	public void 列表包含所搜索的客户名称的客户(String arg1) throws Throwable {
	    this.searchFlow.CheckCustomer(arg1);
	}

	@Then("^客户\"([^\"]*)\"信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 客户_信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
	   this.searchFlow.VerityCustomerText(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@Then("^客户\"([^\"]*)\"信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 客户_信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
	    this.searchFlow.VerityCustomerTextAndroid(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

}
