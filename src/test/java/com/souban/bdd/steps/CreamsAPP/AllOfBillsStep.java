package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllOfBillsStep extends BaseStep{
	
	@When("^点击所有账单进入所有账单页$")
	public void 点击所有账单进入所有账单页() throws Exception {
	    this.allOfBillsFlow.ClickAllBills();
	}

	@When("^点击搜索框进入搜索页$")
	public void 点击搜索框进入搜索页() throws Exception {
		this.allOfBillsFlow.ClickSearch();
	}

	@When("^输入对方名称\"([^\"]*)\"$")
	public void 输入对方名称(String arg1) throws Exception {
	    this.allOfBillsFlow.SearchInput(arg1);
	}

	@Then("^列表包含所搜索的对方名称的账单 \"([^\"]*)\"$")
	public void 列表包含所搜索的对方名称的账单(String arg1) throws Exception {
	    this.allOfBillsFlow.CheakBills(arg1);
	}

	@Then("^\"([^\"]*)\"账单逾期状态显示正确$")
	public void 账单逾期状态显示正确(String arg1) throws Exception {
		this.allOfBillsFlow.OverdueDayInfo(arg1);
	}
	
	@Then("^IOSSearch\"([^\"]*)\"账单逾期状态显示正确$")
	public void iossearch_账单逾期状态显示正确(String arg1) throws Exception {
		this.allOfBillsFlow.OverdueDaySeaIOS(arg1);
	}
	
	@Then("^账单信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 账单信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws Exception {
	    this.allOfBillsFlow.VeritySearchBillsInfo(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}


	
	
	//账单列表
	@When("^点击筛选按钮$")
	public void 点击筛选按钮() throws Exception {
	    this.allOfBillsFlow.ClickFilter();
	}

	/*@When("^点击重置按钮$")
	public void 点击重置按钮() throws Exception {
	    this.allOfBillsFlow.ClickReset();
	}*/
	@When("^点击筛选条件\"([^\"]*)\"$")
	public void 点击筛选条件(String arg1) throws Exception {
		this.allOfBillsFlow.ClickScreeningConditions(arg1);
	}


	@When("^点击确定按钮回到账单页$")
	public void 点击确定按钮回到账单页() throws Exception {
	    this.allOfBillsFlow.ClickConfirm();
	}
	
	@When("^点击自建未结清$")
	public void 点击自建未结清() throws Exception {
		this.allOfBillsFlow.ClickManualSet();
	}

	@Then("^列表显示对方名称为\"([^\"]*)\"的账单$")
	public void 列表显示对方名称为_的账单(String arg1) throws Exception {
		this.allOfBillsFlow.CheakBills(arg1);
	}
	
	//IOS
	
	@Then("^IOS\"([^\"]*)\"账单逾期状态显示正确$")
	public void ios_账单逾期状态显示正确(String arg1) throws Exception {
		this.allOfBillsFlow.OverdueDayIOS(arg1);
	}
	
	@Then("^IOS账单信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void ios账单信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws Exception {
		this.allOfBillsFlow.VerityIOSBillsListInfo(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}

	

	//账单详情
	@When("^点击对方名称为\"([^\"]*)\"的账单进入详情页$")
	public void 点击对方名称为_的账单进入详情页(String arg1) throws Exception {
		this.allOfBillsFlow.ClickBills(arg1);
	}

//	@Then("^账单信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
//	public void 账单信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) throws Exception {
//		this.allOfBillsFlow.VerityBillDetailsTopInfo(arg1, arg2, arg3, arg4, arg5, arg6);
//		this.allOfBillsFlow.VerityBillDetailsInfo(arg7, arg8, arg9, arg10);
//	}
	
	@Then("^账单信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 账单信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) throws Exception {
		this.allOfBillsFlow.VerityBillDetailsTopInfo(arg1, arg2, arg3, arg4, arg5);
		this.allOfBillsFlow.VerityBillDetailsInfo(arg6, arg7, arg8, arg9);
	}


//	@Then("^付款方信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
//	public void 付款方信息_显示正确(String arg1, String arg2, String arg3) throws Exception {
//		this.allOfBillsFlow.VerityOtherDetailsInfo(arg1, arg2, arg3);
//	}
	
	@Then("^付款方信息\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 付款方信息_显示正确(String arg1, String arg2) throws Exception {
		this.allOfBillsFlow.VerityOtherDetailsInfo(arg1, arg2);
	}
	
	//IOS付款方信息
/*	@Then("^IOS付款方信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void ios付款方信息_显示正确(String arg1, String arg2, String arg3) throws Exception {
	    this.allOfBillsFlow.VerityOtherDetailsInfoIOS(arg1, arg2, arg3);
	}*/
	@Then("^IOS付款方信息\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void ios付款方信息_显示正确(String arg1, String arg2) throws Exception {
		this.allOfBillsFlow.VerityOtherDetailsInfoIOS(arg1, arg2);
	}
	

	@Then("^房源信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 房源信息_显示正确(String arg1, String arg2, String arg3, String arg4) throws Exception {
		this.allOfBillsFlow.VerityBuildingDetailsInfo(arg1, arg2, arg3, arg4);
	}

	@Then("^收支流水信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 收支流水信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
		this.allOfBillsFlow.VerityOppositeDetailsInfo(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^开票记录信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 开票记录信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
		this.allOfBillsFlow.VerityInvoiceDetailsInfo(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^调整信息\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"显示正确$")
	public void 调整信息_显示正确(String arg1, String arg2, String arg3, String arg4) throws Exception {
		this.allOfBillsFlow.VerityAdjustDetailsInfo(arg1, arg2, arg3, arg4);
	}

	@Then("^账单状态\"([^\"]*)\"显示正确$")
	public void 账单状态_显示正确(String arg1) throws Exception {
	    this.allOfBillsFlow.BillStatusDetails(arg1);
	}
	
	//IOS账单状态
	@Then("^IOS账单状态\"([^\"]*)\"显示正确$")
	public void ios账单状态_显示正确(String arg1) throws Exception {
		this.allOfBillsFlow.BillStatusIOS(arg1);
	}
	
	//备注操作
	@When("^点击详情页操作按钮$")
	public void 点击详情页操作按钮() throws Exception {
	    this.allOfBillsFlow.ClickMore();
	}

	@When("^点击备注$")
	public void 点击备注() throws Exception {
	    this.allOfBillsFlow.ClickNote();
	}
	
	//合同跳转
	@When("^点击详情页合同编号$")
	public void 点击详情页合同编号() throws Exception {
	    this.allOfBillsFlow.ClickContractNub();
	}

	@Then("^进入合同详情页$")
	public void 进入合同详情页() throws Exception {
	    this.allOfBillsFlow.CheakContract();
	}
	
	@Then("^合同租客\"([^\"]*)\"显示正确$")
	public void 合同租客_显示正确(String arg1) throws Exception {
	    this.allOfBillsFlow.VerityTenantInfo(arg1);
	}

	//房源跳转
	@When("^点击详情页楼层房号$")
	public void 点击详情页楼层房号() throws Exception {
		this.allOfBillsFlow.ClickFloor();
	}

	@Then("^进入房源详情页$")
	public void 进入房源详情页() throws Exception {
		this.allOfBillsFlow.CheakTabLayout();
	}
	
	@Then("^房号信息\"([^\"]*)\"显示正确$")
	public void 房号信息_显示正确(String arg1) throws Exception {
		this.allOfBillsFlow.VerityTitleInfo(arg1);
	}

	//账单显示筛选
    @When("^选择筛选条件账单显示\"([^\"]*)\"$")
    public void 选择筛选条件账单显示(String arg1) throws Exception {
		this.allOfBillsFlow.ClickClosedBill(arg1);
    }

    @Then("^账单列表对方名称为\"([^\"]*)\"的账单$")
    public void 账单列表对方名称为_的账单(String arg1) throws Exception {
		this.allOfBillsFlow.CheckClosedBill(arg1);
    }

	//费用类型筛选
	@When("^点击重置$")
	public void 点击重置() throws Exception {
		this.allOfBillsFlow.ClickReset();

	}

	@When("^选择筛选条件费用类型\"([^\"]*)\"$")
	public void 选择筛选条件费用类型(String arg1) throws Exception {
		this.allOfBillsFlow.ClickRent(arg1);
	}

	@Then("^账单列表显示的账单费用类型都为\"([^\"]*)\"$")
	public void 账单列表显示的账单费用类型都为(String arg1) throws Exception {
		this.allOfBillsFlow.checkCostType(arg1);

	}

	//账单类型筛选
	@When("^选择筛选条件账单类型\"([^\"]*)\"$")
	public void 选择筛选条件账单类型(String arg1) throws Exception {
		this.allOfBillsFlow.ClickBillType(arg1);
	}

	@Then("^账单列表显示的账单类型都为\"([^\"]*)\"$")
	public void 账单列表显示的账单类型都为(String arg1) throws Exception {
		this.allOfBillsFlow.CheckBillType(arg1);
	}

	//逾期状态筛选
	@When("^选择筛选条件逾期状态\"([^\"]*)\"$")
	public void 选择筛选条件逾期状态(String arg1) throws Exception {
		this.allOfBillsFlow.ClickOverdueState(arg1);

	}

	@Then("^账单列表显示的账单状态都为\"([^\"]*)\"$")
	public void 账单列表显示的账单状态都为(String arg1) throws Exception {
		this.allOfBillsFlow.CheckOverdueState(arg1);
	}

	//结清状态筛选
	@When("^选择筛选条件结清状态\"([^\"]*)\"$")
	public void 选择筛选条件结清状态(String arg1) throws Exception {
		this.allOfBillsFlow.ClickSettleState(arg1);
	}

	@Then("^账单列表显示的账单结清状态都为\"([^\"]*)\"$")
	public void 账单列表显示的账单结清状态都为(String arg1) throws Exception {
		this.allOfBillsFlow.CheckSettleState(arg1);
	}

	//折叠按钮
	@When("^点击折叠按钮$")
	public void 点击折叠按钮() throws Exception {
		this.allOfBillsFlow.ClickCollapse();
	}

	@Then("^账单列表显示的账单都为折叠状态$")
	public void 账单列表显示的账单都为折叠状态() throws Exception {
		this.allOfBillsFlow.CheckCollapse();
	}

}
