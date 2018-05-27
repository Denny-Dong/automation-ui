package com.souban.bdd.steps.CreamsWebStep.Finance;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAndEditClosebillsStep extends BaseStep {
	@Given("^用户进入新建付款账单弹框$")
	public void 用户进入新建付款账单弹框() throws Throwable {
		this.newandeditclosebillsFlow.clickButtonOfCreateNewBill();
	}

	@When("^全部填写账单信息，勾选房源信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 全部填写账单信息_勾选房源信息(String type, String starttime, String finishtime, String amount, String time,
			String payer, String building) throws Throwable {
		this.newandeditclosebillsFlow.inputPaymentBillInformation(type, starttime, finishtime, amount, time, payer,
				building);
	}

	@When("^提交账单$")
	public void 提交账单() throws Throwable {
		this.newandeditclosebillsFlow.submitNewBill();
	}

	@Then("^出现对应用户的未结清付款账单\"([^\"]*)\"$")
	public void 出现对应用户的未结清付款账单(String payer) throws Throwable {
		this.newandeditclosebillsFlow.checkCreateNewBillSuccess(payer);
	}

	@When("^填写付款信息必填项 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" ,用户勾选添加收支流水$")
	public void 填写付款信息必填项_用户勾选添加收支流水(String realamount, String realtime, String realpayer) throws Throwable {
		this.newandeditclosebillsFlow.clickAddPaymentRecord();
		this.newandeditclosebillsFlow.inputPaymentRecordInformation(realamount, realtime, realpayer);
	}

	@When("^勾选另一个房源信息 \"([^\"]*)\"$")
	public void 勾选另一个房源信息(String building) throws Throwable {
		this.newandeditclosebillsFlow.chooseAnotherBuilding(building);
	}

	@Then("^提交，账单在俩个楼宇的账单列表中都出现\"([^\"]*)\"$")
	public void 提交_账单在俩个楼宇的账单列表中都出现(String payer) throws Throwable {
		this.newandeditclosebillsFlow.checkBillInTwoBuildings(payer);
	}

	@Given("^进入收付款账单页面$")
	public void 进入收付款账单页面() throws Throwable {
		this.newandeditclosebillsFlow.clickPaymentbills();
	}

	@When("^点击某一账单$")
	public void 点击某一账单() throws Throwable {
		this.newandeditclosebillsFlow.enterDetailOfBill();
	}

	@Then("^右侧划出账单详情页，展示账单信息，房源信息，收支流水，开票记录，调整$")
	public void 右侧划出账单详情页_展示账单信息_房源信息_收支流水_开票记录_调整() throws Throwable {
		this.newandeditclosebillsFlow.checkBillDetilInformation();
	}

	@Given("^用户筛选未结清账单$")
	public void 用户筛选未结清账单() throws Throwable {
		this.newandeditclosebillsFlow.chooseOneNotSettledBill();
	}

	@When("^点击添加收支流水按钮$")
	public void 点击添加收支流水按钮() throws Throwable {
		this.newandeditclosebillsFlow.clickButtonOfAddRecord();
	}

	@Then("^弹出添加收支流水弹框$")
	public void 弹出添加收支流水弹框() throws Throwable {
		this.newandeditclosebillsFlow.checkPopupCollectionRecord();
	}

	@When("^点击关闭账单，输入关闭原因\"([^\"]*)\"$")
	public void 点击关闭账单_输入关闭原因(String reason) throws Throwable {
		this.newandeditclosebillsFlow.clickCloseBillButton(reason);
	}

	@Then("^确认关闭$")
	public void 确认关闭() throws Throwable {
		this.newandeditclosebillsFlow.clickSureToCloseBill();
	}

	@Given("^用户在账单关闭状态$")
	public void 用户在账单关闭状态() throws Throwable {
		this.newandeditclosebillsFlow.chooseOneCloseBill();
	}

	@When("^开启账单$")
	public void 开启账单() throws Throwable {
		this.newandeditclosebillsFlow.clickOpenBillButton();
	}

	@Then("^账单的显示开启$")
	public void 账单的显示开启() throws Throwable {
		this.newandeditclosebillsFlow.checkBillWasOpen();
	}

	@Given("^拥有账单删除权限的用户在账单详情页$")
	public void 拥有账单删除权限的用户在账单详情页() throws Throwable {
		this.newandeditclosebillsFlow.checkPermissionOfDeleteBill();
	}

	@Given("^搜索租客名称\"([^\"]*)\"$")
	public void 搜索租客名称(String arg1) throws Throwable {
		this.newandeditclosebillsFlow.searchPayer();
	}

	@When("^点击删除账单按钮$")
	public void 点击删除账单按钮() throws Throwable {
		this.newandeditclosebillsFlow.clickDeleteBillButton();
	}

	@Then("^出现确认框，是否确认删除$")
	public void 出现确认框_是否确认删除() throws Throwable {
		this.newandeditclosebillsFlow.checkPopupDeleteBill();
	}

	@Then("^点击确认删除$")
	public void 点击确认删除() throws Throwable {
		this.newandeditclosebillsFlow.clickSureToDeleteBill();
	}

	@Then("^提交成功，提示『添加付款信息成功』，并刷新账单详情页信息，账单增加一笔付款记录$")
	public void 提交成功_提示_添加付款信息成功_并刷新账单详情页信息_账单增加一笔付款记录() throws Throwable {
		this.newandeditclosebillsFlow.checkForsubmitRecord();
	}

	@When("^用户点击收付款$")
	public void 用户点击收付款() throws Throwable {
		this.newandeditclosebillsFlow.OnCollectPaymentPage();
	}

	@Then("^默认展示收款账单列表，并且默认选中本期账单，列表显示本期账单的列表本期账单快捷选项和逾期账单快捷选项显示账单数量和应收金额。$")
	public void 默认展示收款账单列表_并且默认选中本期账单_列表显示本期账单的列表本期账单快捷选项和逾期账单快捷选项显示账单数量和应收金额() throws Throwable {
		this.newandeditclosebillsFlow.checkDefaultBills();
	}

	@When("^筛选了账单关闭状态$")
	public void 筛选了账单关闭状态() throws Throwable {
		this.newandeditclosebillsFlow.chooseBillOfCloseStatus();
	}

	@Then("^当前筛选条件栏增加，\"([^\"]*)\" 的筛选选项，列表刷新，显示选中的账单状态的账单数据$")
	public void 当前筛选条件栏增加_的筛选选项_列表刷新_显示选中的账单状态的账单数据(String arg1) throws Throwable {
		this.newandeditclosebillsFlow.checkCloseStatusOnList(arg1);
	}

	@When("^筛选了费用类型 \"([^\"]*)\"$")
	public void 筛选了费用类型(String arg1) throws Throwable {
		this.newandeditclosebillsFlow.chooseBillType(arg1);
	}

	@Then("^当前筛选条件栏增加，\"([^\"]*)\"的筛选选项，列表刷新，显示选中的费用类型账单数据$")
	public void 当前筛选条件栏增加_的筛选选项_列表刷新_显示选中的费用类型账单数据(String arg1) throws Throwable {
		this.newandeditclosebillsFlow.checkBillTypeOnList(arg1);
	}

	@Given("^用户在未结清账单详情页$")
	public void 用户在未结清账单详情页() throws Throwable {
		this.newandeditclosebillsFlow.clickOnNotSettlementBillPage();
	}

	@When("^点击添加结清按钮$")
	public void 点击添加结清按钮() throws Throwable {
		this.newandeditclosebillsFlow.clickButtonOfSettlement();
	}

	@Then("^确认结清$")
	public void 确认结清() throws Throwable {
		this.newandeditclosebillsFlow.clickSureToSettlementBill();
	}

	@When("^添加了调整金额  \"([^\"]*)\", 选择调整类型为零头减免\"([^\"]*)\"$")
	public void 添加了调整金额_选择调整类型为零头减免(String Adamount, String Adtype) throws Throwable {
		this.newandeditclosebillsFlow.adjustmentAmount(Adamount, Adtype);
	}

	@Then("^调整成功并确认$")
	public void 调整成功并确认() throws Throwable {
		this.newandeditclosebillsFlow.checkAdjustmentbillsuccessful();
	}

	@Then("^删除了调整$")
	public void 删除了调整() throws Throwable {
		this.newandeditclosebillsFlow.deleteAdjustment();
	}

	@When("^点击备注图标$")
	public void 点击备注图标() throws Throwable {
		this.newandeditclosebillsFlow.clickBillNotesButton();
	}

	@When("^输入备注 \"([^\"]*)\"$")
	public void 输入备注(String notes) throws Throwable {
		this.newandeditclosebillsFlow.inputNotesInbillNotes(notes);
	}

	@Then("^账单添加备注$")
	public void 账单添加备注() throws Throwable {
		this.newandeditclosebillsFlow.checkBillNotesCreateSuccessful();
	}

	@Given("^筛选账单为收款且未结清$")
	public void 筛选账单为收款且未结清() throws Throwable {
		this.newandeditclosebillsFlow.selectReceivablesBillOnlist();
	}

	@Given("^筛选账单为付款账单且未结清$")
	public void 筛选账单为付款账单且未结清() throws Throwable {
		this.newandeditclosebillsFlow.selectPaymentBillOnlist();
	}

	@When("^账单匹配流水$")
	public void 账单匹配流水() throws Throwable {
		this.newandeditclosebillsFlow.billMatchingIncome();
	}

	@Then("^账单与流水匹配$")
	public void 账单与流水匹配() throws Throwable {
		this.newandeditclosebillsFlow.checkBillMatchingIncomeSuccess();
	}

	@Given("^用户进入新建收款账单弹框$")
	public void 用户进入新建收款账单弹框() throws Throwable {
		this.newandeditclosebillsFlow.clickButtonOfCreateNewReceiveBill();
	}

	@When("^全部填写收款账单信息，勾选房源信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 全部填写收款账单信息_勾选房源信息(String type, String starttime, String finishtime, String amount, String time,
			String payer, String building) throws Throwable {
		this.driver.sleep(1000);
		this.newandeditclosebillsFlow.inputReceiveBillInformation(type, starttime, finishtime, amount, time, payer,
				building);
	}

}
