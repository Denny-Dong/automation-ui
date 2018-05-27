package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAppContractStep extends BaseStep{

	//合同列表-所有合同
	@When("^点击导航进入导航页面$")
	public void 点击导航进入导航页面() throws Throwable {
	    this.creamsAppContractFlow.GotoNavigationPage();
	    this.creamsAppContractFlow.intoNavigationPage();
	}
	
	@When("^点击合同列表进入合同列表$")
	public void 点击合同列表进入合同列表() throws Throwable {
	   this.creamsAppContractFlow.GotoContractList();
	}

	@Then("^列表显示租赁人为 \"([^\"]*)\"的合同$")
	public void 列表显示租赁人为_的合同(String arg1) throws Throwable {
	    this.creamsAppContractFlow.VerifyContractLessee(arg1);
	}

	@Then("^\"([^\"]*)\" 的信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void 合同_信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    this.creamsAppContractFlow.VerifyContractInfo(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	// android 
	@Then("^\"([^\"]*)\" 合同所属楼宇 \"([^\"]*)\" 显示正确$")
	public void 合同所属楼宇_显示正确(String arg1, String arg2) throws Throwable {
	    this.creamsAppContractFlow.VerifyRoomBuilding(arg1, arg2);
	}
	
	@Then("^android\"([^\"]*)\" 的信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void android_的信息_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    this.creamsAppContractFlow.VerifyContractInfo_android(arg1, arg2, arg3, arg4, arg5, arg6);
	}
		
	//到期预警列表
	@When("^点击到期预警进入预警列表$")
	public void 点击到期预警进入预警列表() throws Throwable {
	    this.creamsAppContractFlow.GotoExpiresWarningList();
	}

	@Then("^\"([^\"]*)\" 的到期预警时间显示正确$")
	public void 到期预警时间显示正确(String arg1) throws Throwable {
	    this.creamsAppContractFlow.VerifyWarningDays(arg1);
	}
	
	//android
	@Then("^android\"([^\"]*)\" 的到期预警时间显示正确$")
	public void android到期预警时间显示正确(String arg1) throws Throwable {
	    this.creamsAppContractFlow.VerifyWarningDays_android(arg1);;
	}
	
	//到期未处理列表
	@When("^点击到期未处理进入未处理列表$")
	public void 点击到期未处理进入未处理列表() throws Throwable {
	    this.creamsAppContractFlow.GotoExpiresUntreatedList();
	}

	@Then("^\"([^\"]*)\" 的到期未处理时间显示正确$")
	public void 到期未处理时间显示正确(String arg1) throws Throwable {
	    this.creamsAppContractFlow.VerifyUntreatedDays(arg1);
	}
	
	//合同详情
	@When("^点击租赁人为 \"([^\"]*)\"的合同进入合同详情$")
	public void 点击租赁人为_的合同进入合同详情(String arg1) throws Throwable {
	    this.creamsAppContractFlow.GotoContractDetail(arg1);
	}

	@Then("^合同概要 合同状态\"([^\"]*)\" 跟进人\"([^\"]*)\" 显示正确$")
	public void 合同概要_合同状态_跟进人_显示正确(String arg1, String arg2) throws Throwable {
	    this.creamsAppContractFlow.VerifyProfileInfo(arg1, arg2);
	}

	@Then("^租客信息 租客\"([^\"]*)\" 行业\"([^\"]*)\" 租客联系人\"([^\"]*)\" 法人\"([^\"]*)\" 签订人\"([^\"]*)\" 显示正确$")
	public void 租客信息_租客_行业_租客联系人_法人_签订人_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    this.creamsAppContractFlow.VerifyLeaseInfo(arg1, arg2, arg3, arg4, arg5);
	}
	
	@Then("^合同房源信息 所属楼宇\"([^\"]*)\" 楼宇地址\"([^\"]*)\" 楼层房号\"([^\"]*)\" 面积\"([^\"]*)\" 显示正确$")
	public void 合同房源信息_所属楼宇_楼宇地址_楼层房号_面积_显示正确(String arg1, String arg2, String arg3, String arg4) throws Exception {
	    this.creamsAppContractFlow.VerifyRoomInfo(arg1, arg2, arg3, arg4);
	}

	@Then("^其他关键信息 关键词\"([^\"]*)\" 备注\"([^\"]*)\" 显示正确$")
	public void 其他关键信息_关键词_备注_显示正确(String arg1, String arg2) throws Throwable {
	    this.creamsAppContractFlow.VerifyKeyWords(arg1, arg2);
	}

	@Then("^基本条款 租赁数\"([^\"]*)\" 合同签订时间\"([^\"]*)\" 合同计租时间\"([^\"]*)\" 合同结束时间\"([^\"]*)\" 押金\"([^\"]*)\" 计算精度\"([^\"]*)\" 显示正确$")
	public void 基本条款_租赁数_合同签订时间_合同计租时间_合同结束时间_押金_计算精度_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    this.creamsAppContractFlow.VerifyBaseTerm(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^租期条款 开始时间\"([^\"]*)\" 结束时间\"([^\"]*)\" 计费类型\"([^\"]*)\" 年天数\"([^\"]*)\" 支付类型\"([^\"]*)\" 付款时间\"([^\"]*)\" 合同单价\"([^\"]*)\" 显示正确$")
	public void 租期条款_开始时间_结束时间_计费类型_年天数_支付类型_付款时间_合同单价_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
	    this.creamsAppContractFlow.VerifyLeaseTerm(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}
	
	//android
	@Then("^android合同房源信息 所属楼宇\"([^\"]*)\" 楼宇地址\"([^\"]*)\" 楼层\"([^\"]*)\" 房号\"([^\"]*)\" 面积\"([^\"]*)\" 显示正确$")
	public void android合同房源信息_所属楼宇_楼宇地址_楼层_房号_面积_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    this.creamsAppContractFlow.VerifyRoomInfo_android(arg1, arg2, arg3, arg4, arg5);
	}

	@Then("^android其他关键信息 关键词\"([^\"]*)\" 备注\"([^\"]*)\" 显示正确$")
	public void android其他关键信息_关键词_备注_显示正确(String arg1, String arg2) throws Throwable {
	    this.creamsAppContractFlow.VerifyKeyWords_android(arg1, arg2);
	}

	@Then("^android基本条款 租赁数\"([^\"]*)\" 合同签订时间\"([^\"]*)\" 合同计租时间\"([^\"]*)\" 合同结束时间\"([^\"]*)\" 押金\"([^\"]*)\" 计算精度\"([^\"]*)\" 显示正确$")
	public void android基本条款_租赁数_合同签订时间_合同计租时间_合同结束时间_押金_计算精度_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    this.creamsAppContractFlow.VerifyBaseTerm_android(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^android租期条款 开始时间\"([^\"]*)\" 结束时间\"([^\"]*)\" 计费类型\"([^\"]*)\" 年天数\"([^\"]*)\" 支付类型\"([^\"]*)\" 付款时间\"([^\"]*)\" 合同单价\"([^\"]*)\" 显示正确$")
	public void android租期条款_开始时间_结束时间_计费类型_年天数_支付类型_付款时间_合同单价_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
	    this.creamsAppContractFlow.VerifyLeaseTerm_android(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@Then("^详情页显示租金明细报表按钮$")
	public void 详情页显示租金明细报表按钮() throws Exception {
		this.creamsAppContractFlow.CheckRentDetail();
	}
	
	//合同详情备注操作
	//新增备注
	@When("^点击右上角的操作$")
	public void 点击右上角的操作() throws Throwable {
	    this.creamsAppContractFlow.ClickOperator();
	}

	@When("^点击备注进入合同备注列表$")
	public void 点击备注进入合同备注列表() throws Throwable {
	    this.creamsAppContractFlow.GotoNoteList();
	}

	@When("^点击添加进入新增备注页面$")
	public void 点击添加进入新增备注页面() throws Throwable {
	    this.creamsAppContractFlow.ClickAddNote();
	}

	@When("^新增页面默认的账号 \"([^\"]*)\" 和时间显示正确$")
	public void 新增页面默认的账号_和时间显示正确(String arg1) throws Throwable {
	    this.creamsAppContractFlow.VerifyDefultInfo(arg1);
	}

	@When("^点击输入备注内容 \"([^\"]*)\"$")
	public void 点击输入备注内容(String arg1) throws Throwable {
	    this.creamsAppContractFlow.InputNote(arg1);
	}

	@Then("^点击保存合同备注$")
	public void 点击保存合同备注() throws Throwable {
		this.creamsAppContractFlow.ClickSaveNote();
	}

	@When("^新建成功后新增的备注内容 \"([^\"]*)\"  \"([^\"]*)\"  显示正确$")
	public void 新建成功后新增的备注内容_显示正确(String arg1, String arg2) throws Throwable {
	    this.creamsAppContractFlow.VerifyNoteInfo(arg1, arg2);
	}
	
	//android
	@When("^android新增页面默认的账号 \"([^\"]*)\" 和时间显示正确$")
	public void android新增页面默认的账号_和时间显示正确(String arg1) throws Throwable {
		this.creamsAppContractFlow.checkCreatTab();
	    this.creamsAppContractFlow.VerifyDefaultInfo_android(arg1);
	}

	@When("^android新建成功后新增的备注内容 \"([^\"]*)\"  \"([^\"]*)\"  显示正确$")
	public void android新建成功后新增的备注内容_显示正确(String arg1, String arg2) throws Throwable {
		this.creamsAppContractFlow.checkNoteTab();
	    this.creamsAppContractFlow.VerifyNoteInfo_android(arg1, arg2);
	}

	//编辑备注
	@When("^点击操作出现操作按钮$")
	public void 点击操作出现操作按钮() throws Throwable {
	    this.creamsAppContractFlow.ClickContractButtonMore();
	}

	@When("^点击编辑进入编辑备注页面$")
	public void 点击编辑进入编辑备注页面() throws Throwable {
	    this.creamsAppContractFlow.ClickEditNote();
	}

	@Then("^修改备注内容为 \"([^\"]*)\"$")
	public void 修改备注内容为(String arg1) throws Throwable {
	    this.creamsAppContractFlow.EditNoteContent(arg1);
	}

	@Then("^备注内容显示为修改后的 \"([^\"]*)\"$")
	public void 备注内容显示为修改后的(String arg1) throws Throwable {
		this.creamsAppContractFlow.checkNoteTab();
	    this.creamsAppContractFlow.VerifyNoteAfterEdit(arg1);
	}

	//删除备注
	@When("^点击删除弹出确认弹窗$")
	public void 点击删除弹出确认弹窗() throws Throwable {
	    this.creamsAppContractFlow.ClickDeleteNote();
	}

	@When("^点击确定删除$")
	public void 点击确定删除() throws Throwable {
	    this.creamsAppContractFlow.DeleteConfirm();
	}

	@Then("^备注删除成功，列表不显示已删除的备注 \"([^\"]*)\"$")
	public void 备注删除成功_列表不显示已删除的备注(String arg1) throws Throwable {
		this.creamsAppContractFlow.checkNoteTab();
	    this.creamsAppContractFlow.VerifyDeleteNoteResult(arg1);
	}
	
	//合同详情操作记录
	@When("^点击操作记录进入操作记录列表$")
	public void 点击操作记录进入操作记录列表() throws Throwable {
	    this.creamsAppContractFlow.GotoOperationRecordList();
	}

	@Then("^列表显示的操作记录内容 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"显示正确$")
	public void 列表显示的操作记录内容_显示正确(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    this.creamsAppContractFlow.VerifyRecordContent(arg1, arg2, arg3, arg4);
	}

	//查看合同账单列表
	//新建待审核／新建待修改状态不显示查看合同账单列表按钮
	@When("^合同状态为 \"([^\"]*)\"$")
	public void 合同状态为(String arg1) throws Exception {
	    this.creamsAppContractFlow.VerifyContractState(arg1);
	}
	
	@Then("^详情页不显示查看合同账单列表按钮$")
	public void 详情页不显示查看合同账单列表按钮() throws Exception {
	    this.creamsAppContractFlow.VerifyIsExsitContractBillListButton();
	}

	//正常执行状态查看合同账单列表
	@When("^详情页显示查看合同账单列表按钮$")
	public void 详情页显示查看合同账单列表按钮() throws Exception {
	    this.creamsAppContractFlow.VerifyContractBillListButton();
	}

	@When("^点击查看合同账单列表进入合同账单列表$")
	public void 点击查看合同账单列表进入合同账单列表() throws Exception {
	    this.creamsAppContractFlow.VerifyGotoBillList();
	}

	@Then("^列表显示了 \"([^\"]*)\" \"([^\"]*)\" 类型的账单$")
	public void 列表显示了_类型的账单(String arg1, String arg2) throws Exception {
	    this.creamsAppContractFlow.VerifyBillTypeIsExist(arg1, arg2);
	}
	
	@Then("^租金保证金账单的信息结清状态、\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 都显示正确$")
	public void 租金保证金账单的信息结清状态_都显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Exception {
		 this.creamsAppContractFlow.VerifyBillInfo1(arg1,arg2, arg3, arg4, arg5);
	}

	@Then("^第一条租金账单的信息结清状态、\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 都显示正确$")
	public void 第一条租金账单的信息结清状态_都显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Exception {
		this.creamsAppContractFlow.VerifyBillInfo2(arg1,arg2, arg3, arg4, arg5);
	}


	//合同详情查看租金明细报表内容
	@When("^点击租金明细报表进入租金明细报表$")
	public void 点击租金明细报表进入租金明细报表() throws Exception {
		this.creamsAppContractFlow.ClickRentDetail();
	}

	@Then("^界面押金\"([^\"]*)\"显示正确$")
	public void 界面押金_显示正确(String arg1) throws Exception {
		this.creamsAppContractFlow.VerifyCheckDeposit(arg1);
	}

	@Then("^第一条租金明细区间\"([^\"]*)\"的信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"显示正确$")
	public void 第一条租金明细区间_的信息_显示正确(String arg1, String arg2, String arg3, String arg4) throws Exception {
		this.creamsAppContractFlow.VerifyCheckSectionA(arg1,arg2,arg3,arg4);
	}

	@Then("^第二条租金明细区间\"([^\"]*)\"的信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"显示正确$")
	public void 第二条租金明细区间_的信息_显示正确(String arg1, String arg2, String arg3, String arg4) throws Exception {
		this.creamsAppContractFlow.VerifyCheckSectionB(arg1,arg2,arg3,arg4);
	}

	//合同列表筛选
	@When("^点击合同列表筛选按钮$")
	public void 点击合同列表筛选按钮() throws Exception {
		this.creamsAppContractFlow.ClickFilter();
	}

	@When("^选择筛选条件审核状态\"([^\"]*)\"$")
	public void 选择筛选条件审核状态(String arg1) throws Exception {
		this.creamsAppContractFlow.ClickReviweState(arg1);
	}

	@When("^点击确定按钮回到列表页$")
	public void 点击确定按钮回到列表页() throws Exception {
		this.creamsAppContractFlow.ClickConfirm();
	}

	@When("^点击第一条记录进入合同详情页$")
	public void 点击第一条记录进入合同详情页() throws Exception {
		this.creamsAppContractFlow.ClickList();
	}

	@Then("^合同的合同状态为\"([^\"]*)\"$")
	public void 合同的合同状态为(String arg1) throws Exception {
		this.creamsAppContractFlow.CheckState(arg1);
	}


}
