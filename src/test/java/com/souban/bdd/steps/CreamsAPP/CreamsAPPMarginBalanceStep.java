package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPMarginBalanceStep extends BaseStep{

	//账单搜索
	@Given("^点击保证金余额进入保证金列表$")
	public void 点击保证金余额进入保证金列表() throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickMarginBalance();
	    this.creamsAPPMarginBalanceFlow.intoMarginBalancePage();
	}
	
	@When("^点击页面顶部的搜索框进入搜索页$")
	public void 点击页面顶部的搜索框进入搜索页() throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickSearch();
	    this.creamsAPPMarginBalanceFlow.intoSearchPage();
	}
	
	@When("^在搜索框内输入对方名称 \"([^\"]*)\"$")
	public void 在搜索框内输入对方名称(String arg1) throws Exception {
	    this.creamsAPPMarginBalanceFlow.inputCompanyName(arg1);
	}

	@Then("^列表包含搜索的对方名称的账单 \"([^\"]*)\"$")
	public void 列表包含搜索的对方名称的账单(String arg1) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkSearchResult(arg1);
	}
	//android
	@Then("^android账单的关键字显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void android账单的关键字显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkSearchInformation_android(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
	//ios
	@Then("^ios账单的信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void ios账单的信息显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkSearchInformation_ios(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}
	
	@Then("^android账单逾期状态的内容及天数显示正确 \"([^\"]*)\"$")
	public void android账单逾期状态的内容及天数显示正确(String arg1) throws Exception {
		this.creamsAPPMarginBalanceFlow.checkOverDueDay_android(arg1);
	}
	
	@Then("^ios账单逾期状态的内容及天数显示正确 \"([^\"]*)\"$")
	public void ios账单逾期状态的内容及天数显示正确(String arg1) throws Exception {
		this.creamsAPPMarginBalanceFlow.checkOverDueDay_ios(arg1);
	}




	//账单详情页
	@Then("^点击账单对方名称为 \"([^\"]*)\"的账单$")
	public void 点击账单对方名称为_的账单(String arg1) throws Exception {
	    this.creamsAPPMarginBalanceFlow.intoBillDetail(arg1);
	}

	@Then("^进入账单详情页$")
	public void 进入账单详情页() throws Exception {
	    this.creamsAPPMarginBalanceFlow.intoBillDetailSuccessful();
	}

	@Then("^android账单信息字段显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void android账单信息字段显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkBillDetail_android(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}
	@Then("^ios账单信息字段显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void ios账单信息字段显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkBillDetail_ios(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}
	
	@Then("^android付款方信息字段显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void android付款方信息字段显示正确(String arg1, String arg2, String arg3) throws Exception {
	   this.creamsAPPMarginBalanceFlow.checkCompanyInformation(arg1, arg2, arg3);
	}
	@Then("^ios付款方信息字段显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void ios付款方信息字段显示正确(String arg1, String arg2, String arg3) throws Exception {
	   this.creamsAPPMarginBalanceFlow.checkCompanyInformation(arg1, "  "+arg2+"  ", arg3);
	}

	@Then("^房源信息字段显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 房源信息字段显示正确(String arg1, String arg2, String arg3) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkRoomInformation(arg1, arg2, arg3);
	}

	@Then("^收支流水字段显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 收支流水字段显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
	   this.creamsAPPMarginBalanceFlow.checkIncomeInformation(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^调整字段显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 调整字段显示正确(String arg1, String arg2, String arg3, String arg4) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkAjustInformation(arg1, arg2, arg3, arg4);
	}
	
	
	//新增备注
	@When("^点击账单详情页的操作按钮$")
	public void 点击账单详情页的操作按钮() throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickMoreButton();
	}

	@When("^选择备注$")
	public void 选择备注() throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickNote();
	}

	@Then("^进入备注列表$")
	public void 进入备注列表() throws Exception {
	    this.creamsAPPMarginBalanceFlow.intoNotePage();
	}

	@When("^点击备注列表的新增按钮$")
	public void 点击备注列表的新增按钮() throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickAddButton();
	    this.creamsAPPMarginBalanceFlow.intoAddNotePage();
	}

	@When("^输入备注内容 \"([^\"]*)\"$")
	public void 输入备注内容(String arg1) throws Exception {
	    this.creamsAPPMarginBalanceFlow.inputNoteContent(arg1);
	}

	@When("^点击新增备注页的保存按钮$")
	public void 点击新增备注页的保存按钮() throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickSaveButton();
	}

	@Then("^备注列表中存在一条备注内容为 \"([^\"]*)\"的备注，备注新增成功$")
	public void 备注列表中存在一条备注内容为_的备注_备注新增成功(String arg1) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkAddNoteResult(arg1);
	}

	@Then("^备注信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 备注信息显示正确(String arg1, String arg2, String srg3) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkNoteInformation_android(arg1, arg2, srg3);
	}
	
	@Then("^ios备注信息显示正确 \"([^\"]*)\" \"([^\"]*)\"$")
	public void ios备注信息显示正确(String arg1, String arg2) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkNoteInformation_ios(arg1, arg2);
	}
	
	
	//编辑备注
	@When("^点击备注内容为 \"([^\"]*)\"的备注的操作按钮$")
	public void 点击备注内容为_的备注的操作按钮(String arg1) throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickMoreNote(arg1);
	}

	@When("^点击备注的编辑按钮$")
	public void 点击备注的编辑按钮() throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickEditButton();
	    this.creamsAPPMarginBalanceFlow.intoEditPage();
	}

	@When("^修改备注内容 \"([^\"]*)\"$")
	public void 修改备注内容(String arg1) throws Exception {
	    this.creamsAPPMarginBalanceFlow.inputEditNoteContent(arg1);
	}

	@When("^点击编辑备注页的保存按钮$")
	public void 点击编辑备注页的保存按钮() throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickSaveButton();
	}

	@Then("^备注列表中存在一条备注内容为 \"([^\"]*)\"的备注，备注修改成功$")
	public void 备注列表中存在一条备注内容为_的备注_备注修改成功(String arg1) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkEditNoteResult(arg1);
	}
	
	
	//删除备注
	@When("^点击备注的删除按钮$")
	public void 点击备注的删除按钮() throws Exception {
		this.creamsAPPMarginBalanceFlow.clickDeleteButton();
	}

	@When("^点击确定要删除该条备注吗页面的确定按钮$")
	public void 点击确定要删除该条备注吗页面的确定按钮() throws Exception {
	    this.creamsAPPMarginBalanceFlow.clickDeleteSureButton();
	}

	@Then("^备注列表中不存在一条备注内容为 \"([^\"]*)\"的备注，备注删除成功$")
	public void 备注列表中不存在一条备注内容为_的备注_备注删除成功(String arg1) throws Exception {
	    this.creamsAPPMarginBalanceFlow.checkDeleteNoteResult(arg1);
	}
	
	//合同跳转
	@When("^点击付款方信息中的合同编号 \"([^\"]*)\"$")
	public void 点击付款方信息中的合同编号(String arg1) throws Exception {
		this.creamsAPPMarginBalanceFlow.clickContactNum(arg1);
	}
	
	//房源跳转
	@When("^点击房源信息中的楼宇房号 \"([^\"]*)\"$")
	public void 点击房源信息中的楼宇房号(String arg1) throws Exception {
		this.creamsAPPMarginBalanceFlow.clickFloor(arg1);
	}


	/**
	 * 账单列表字段核对
	 */
	@Then("^保证金列表中的字段显示正确")
	public void 保证金列表中的字段显示正确() throws Exception {
		this.creamsAPPMarginBalanceFlow.checkListKeys();
	}



	/**
	 * 账单列表通过逾期状态筛选
	 */
	@When("^点击保证金余额列表的筛选按钮$")
	public void 点击保证金余额列表的筛选按钮() throws Exception {
		this.creamsAPPMarginBalanceFlow.clickFilterButton();
		this.creamsAPPMarginBalanceFlow.intoFilterPage();
	}

	@When("^选择筛选条件为逾期状态 \"([^\"]*)\"$")
	public void 选择筛选条件为逾期状态(String arg1) throws Exception {
		this.creamsAPPMarginBalanceFlow.selectOverDueDayFilter(arg1);
	}

	@When("^选择筛选条件为结清状态 \"([^\"]*)\"$")
	public void 选择筛选条件为结清状态(String arg1) throws Exception {
		this.creamsAPPMarginBalanceFlow.selectBillCloseFilter(arg1);
	}

	@When("^点击保证金余额筛选页的确定按钮$")
	public void 点击保证金余额筛选页的确定按钮() throws Exception {
		this.creamsAPPMarginBalanceFlow.clickConfirmButton();
	}

	@Then("^保证金列表中所有记录的逾期状态显示 \"([^\"]*)\"$")
	public void 保证金列表中所有记录的逾期状态显示(String arg1) throws Exception {
		this.creamsAPPMarginBalanceFlow.checkOverDueDay(arg1);
	}

	@Then("^保证金列表中所有记录的结清状态显示 \"([^\"]*)\"$")
	public void 保证金列表中所有记录的结清状态显示(String arg1) throws Exception {
		this.creamsAPPMarginBalanceFlow.checkBillClose(arg1);
	}
}
