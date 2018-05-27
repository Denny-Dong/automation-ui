package com.souban.bdd.steps.CreamsWebStep.Contract;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContractStep extends BaseStep {

    @When("^Enter new contract page$")
    public void enter_new_contract_page() throws Throwable {
        this.contractFlow.enterNewContractPage();
    }

    @When("^Select Housing resource \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void select_Housing_resource(String building, String unit, String floor, String room) throws Throwable {
        this.contractFlow.selectHousingResource(building, unit, floor, room);
    }

    @When("^Select individual lease and industry \"([^\"]*)\"$")
    public void select_Individual_Lease_and_Industry(String industry) throws Throwable {
        this.contractFlow.selectIndividualLeaseAndIndustry(industry);
    }

    @When("^Input \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void input_and_and(String arg1, String arg2, String arg3) throws Throwable {
        this.contractFlow.inputSignerNameSignerTelAndAddress(arg1, arg2, arg3);
    }

    @When("^Enter contract info page$")
    public void enter_contract_info_page() throws Throwable {
        this.contractFlow.enterContractInfoPage();
    }

    @When("^Input contract info \"([^\"]*)\"$")
    public void input_contract_info(String Date) throws Throwable {
        this.contractFlow.inputContractInfo(Date);
    }

    @When("^Enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void enter(String rent, String months_rent, String months_deposit, String days_pay) throws Throwable {
        this.contractFlow.inputRentMonths_rentMonths_depositDays_pay(rent, months_rent, months_deposit, days_pay);
        ;
    }

    @When("^Click the button one year$")
    public void click_the_button_one_year() throws Throwable {
        this.contractFlow.clickTheButtonOfOneYear();
    }

    @When("^Click the button of rent details$")
    public void click_the_button_of_rent_details() throws Throwable {
        this.contractFlow.clickTheButtonOfRentDetails();
    }

    @When("^Submit create contract$")
    public void submit_create_contract() throws Throwable {
        this.contractFlow.submitCreateContract();
    }

    @When("^Review of create$")
    public void review_of_create() throws Throwable {
        this.contractFlow.reviewOfCreate();
    }

    @Then("^Create a new contract successfully$")
    public void create_a_new_contract_successfully() throws Throwable {
        this.contractFlow.createNewContractSuccessfully();
    }

    @When("^Invalid contract \"([^\"]*)\"$")
    public void invalid_contract(String arg1) throws Throwable {
        this.contractFlow.invalidContract(arg1);
    }

    @Given("^Review of invalid \"([^\"]*)\"$")
    public void review_of_invalid(String arg1) throws Throwable {
        this.contractFlow.reviewOfInvalid(arg1);
    }

    @Then("^Check invalid success \"([^\"]*)\"$")
    public void check_invalid_success(String arg1) throws Throwable {
        this.contractFlow.checkInvalidSuccess(arg1);
    }

    @When("^Goto contract \"([^\"]*)\" \"([^\"]*)\"$")
    public void goto_contract(String arg1, String arg2) throws Throwable {
        this.contractFlow.GotoContract(arg1, arg2);
    }

    @Then("^Create a new contract successfully \"([^\"]*)\"$")
    public void create_a_new_contract_successfully(String arg1) throws Throwable {
        this.contractFlow.createNewContractSuccessfully(arg1);
    }

    @When("^Rent out$")
    public void rent_out() throws Throwable {
        this.contractFlow.rentOut();
    }

    @When("^Review of rent out \"([^\"]*)\"$")
    public void review_of_rent_out(String arg1) throws Throwable {
        this.contractFlow.reviewOfRentOut(arg1);
    }

    @When("^Settlement of rent out \"([^\"]*)\" \"([^\"]*)\"$")
    public void settlement_of_rent_out(String arg1, String arg2) throws Throwable {
        this.contractFlow.settlementOfRentOut(arg1, arg2);
    }

    @Then("^The rent has been closed \"([^\"]*)\"$")
    public void the_rent_has_been_closed(String arg1) throws Throwable {
        this.contractFlow.checkRentHasBeenClosed(arg1);
    }

    @When("^Click margin payment$")
    public void click_margin_payment() throws Throwable {
        this.contractFlow.clickMarginPayment();
    }

    @When("^Submit margin$")
    public void submit_margin() throws Throwable {
        this.contractFlow.SubmitMargin();
    }

    @Then("^Has no margin payment button$")
    public void has_no_margin_payment_button() throws Throwable {
        this.contractFlow.hasNoMarginPaymentButton();
    }

    @When("^Click rent details$")
    public void click_rent_details() throws Throwable {
        this.contractFlow.clickRentDetails();
    }

    @When("^Check payment status \"([^\"]*)\" \"([^\"]*)\"$")
    public void check_payment_status(String arg1, String arg2) throws Throwable {
        this.contractFlow.checkPaymentStatus(arg1, arg2);
    }

    @When("^Settle the current unpaid$")
    public void settle_the_current_unpaid() throws Throwable {
        this.contractFlow.settleTheCurrentUnpaid();
    }

    @When("^Click the button three year$")
    public void click_the_button_three_year() throws Throwable {
        this.contractFlow.clickTheButtonThreeYear();
    }

    @When("^Input \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void input(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
        this.contractFlow.input(arg1, arg2, arg3, arg4, arg5);
    }

    @Then("^Check increase \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void check_increase(String arg1, String arg2, String arg3) throws Throwable {
        this.contractFlow.checkIncrease(arg1, arg2, arg3);
    }

    @Then("^Check unitprice \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void check_unitprice(String arg1, String arg2, String arg3, String arg4) throws Throwable {
        this.contractFlow.checkUnitPrice(arg1, arg2, arg3, arg4);
    }

    @Then("^Check discount \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void check_discount(String arg1, String arg2, String arg3, String arg4) throws Throwable {
        this.contractFlow.checkDiscount(arg1, arg2, arg3, arg4);
    }

    @Then("^Check actualprice \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void check_actualprice(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6,
                                  String arg7) throws Throwable {
        this.contractFlow.checkActualPrice(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @Then("^Check final amount \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void check_final_amount(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6,
                                   String arg7) throws Throwable {
        this.contractFlow.checkFinalAmount(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @Then("^Check date Interval \"([^\"]*)\"$")
    public void check_date_Interval(String arg1) throws Throwable {
        this.contractFlow.checkDateInterval(arg1);
    }

    @Then("^Check paymentDay \"([^\"]*)\", \"([^\"]*)\"$")
    public void check_paymentDay(String arg1, String arg2) throws Throwable {
        this.contractFlow.checkPaymentD(arg1, arg2);
    }

    @Given("^在任意合同弹框页面，没有填写任何信息的情况下$")
    public void 在任意合同弹框页面_没有填写任何信息的情况下() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.contractFlow.enterNewContractPage();
    }

    @When("^点击顶部基本信息tab$")
    public void 点击顶部基本信息tab() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.contractFlow.clickBasicInformation();
    }

    @Then("^底部页面显示为基本信息$")
    public void 底部页面显示为基本信息() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.contractFlow.checkBasicInformation();
    }

    @When("^点击顶部合同租金tab$")
    public void 点击顶部合同租金tab() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.contractFlow.clickRentContract();
    }

    @Then("^底部页面显示为合同租金$")
    public void 底部页面显示为合同租金() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.contractFlow.checkRentContract();
    }

    @Then("^底部页面按钮存在$")
    public void 底部页面按钮存在() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.contractFlow.checkSubmit();
    }

    // creams2.0
    @Given("^进入单一楼宇\"([^\"]*)\"剖面图$")
    public void 选择单一楼宇_剖面图(String arg1) throws Exception {
        this.contractListFlow.chooseOneBuilding(arg1);
    }

    @Given("^选择房号\"([^\"]*)\"$")
    public void 选择房号(String arg1) throws Exception {
        this.contractListFlow.chooseRoomNum(arg1);
    }


    @When("^点击新建租赁合同按钮$")
    public void 点击新建租赁合同按钮() throws Throwable {
        this.contractListFlow.clickCreateContractBuilding();
    }

    //选择房源
    @When("^输入基本信息\"([^\"]*)\" \"([^\"]*)\" ，点击下一步$")
    public void 输入基本信息_点击下一步(String arg1, String arg2) throws Exception {
        this.contractListFlow.confirmBaseInformation(arg1, arg2);
    }

    @When("^基本条款修改开始时间\"([^\"]*)\" , 结束时间\"([^\"]*)\"$")
    public void 基本条款修改开始时间_结束时间(String arg1, String arg2) throws Exception {
        this.contractListFlow.updateStartAndEndDate(arg1, arg2);
    }


    @When("^进入费用条款，并输入信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"$")
    public void 进入费用条款_并输入信息(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)
            throws Exception {
        this.contractListFlow.confirmExpenseInformation(arg1, arg2, arg3, arg4, arg5, arg6);
    }

    //不需要选房源
    @When("^输入基本信息\"([^\"]*)\"，点击下一步$")
    public void 输入基本信息_点击下一步(String arg1) throws Exception {
        this.contractListFlow.confirmRenter(arg1);
    }

    @Given("^进入合同的费用条款页\"([^\\\"]*)\\\" \\\"([^\\\"]*)\"$")
    public void 进入合同的费用条款页(String arg1, String arg2) throws Exception {
        this.contractListFlow.confirmBaseInformation(arg1, arg2);
    }

    @When("^生成租金明细$")
    public void 生成租金明细() throws Throwable {
        this.contractListFlow.createTentDetails();
    }

    @When("^点击保存合同按钮$")
    public void 点击保存合同按钮() throws Throwable {
        this.contractListFlow.saveContract();
    }

    @Then("^提示新建成功$")
    public void 提示新建成功() throws Throwable {
        this.contractFlow.createNewPropertyContractSuccessfully();
    }

    @Then("^勾选重新发送账单，确定$")
    public void 勾选重新发送账单_确定() throws Exception {
        this.contractListFlow.chooseReSendBill();
    }

    @Then("^不勾选重新发送账单，确定$")
    public void 不勾选重新发送账单_确定() throws Exception {
        this.contractListFlow.chooseNoSendBill();
    }

    @Then("^提示创建成功$")
    public void 提示创建成功() throws Throwable {
        this.contractListFlow.createNewContractSuccessfully();
    }


    @When("^不点击楼盘图片，只点击楼盘右侧的展开按钮\"([^\"]*)\"$")
    public void 不点击楼盘图片_只点击楼盘右侧的展开按钮(String arg1) throws Exception {
        this.contractListFlow.clickBuildingsList(arg1);
    }

    @Then("^该楼盘的房源信息展开$")
    public void 该楼盘的房源信息展开() throws Throwable {
        this.contractFlow.buildingsListAn();
    }

    @Given("^新增一条递增率$")
    public void 新增一条递增率() throws Throwable {
        this.contractListFlow.addIncrease();
    }

    @When("^点击递增率右上角的删除按钮$")
    public void 点击递增率右上角的删除按钮() throws Throwable {
        this.contractListFlow.deleteIncrease();
    }

    @Then("^可删除该条递增率模块$")
    public void 可删除该条递增率模块() throws Throwable {
        this.contractListFlow.deleteIncreaseSuccessful();
    }

    @When("^点击编辑按钮，进入合同编辑页面$")
    public void 点击编辑按钮_进入合同编辑页面() throws Throwable {
        this.contractFlow.enterContractEdit();
    }

    @When("^修改条款之后基础单价\"([^\"]*)\"$")
    public void 修改条款之后基础单价(String arg1) throws Throwable {
        this.contractFlow.editBasePrice(arg1);
    }

    @When("^点击生成租金明细$")
    public void 点击生成租金明细() throws Throwable {
        this.contractFlow.clickRentalStatement();
    }

    @When("^点击保存&发起审批$")
    public void 点击保存_发起审批() throws Exception {
        this.contractListFlow.clickSaveAndApprovel();
    }

    @When("^选择相应的租客名为\"([^\"]*)\"的租赁合同$")
    public void 选择相应的租客名为_的租赁合同(String arg1) throws Exception {
        this.contractListFlow.chooseContract(arg1);
    }

    @Then("^查看审核并通过审核$")
    public void 查看审核并通过审核() throws Exception {
        this.contractListFlow.passApprovel();
    }

    @When("^点击列表合同\"([^\"]*)\"$")
    public void 点击列表合同(String arg1) throws Exception {
        this.contractListFlow.enterContractDetails(arg1);
    }

    @Then("^进入租赁合同详情页$")
    public void 进入租赁合同详情页() throws Exception {
        this.contractListFlow.enterContractDetailsSuccessful();
    }

    @When("^hover列表合同\"([^\"]*)\"，点击编辑合同$")
    public void hover列表合同_点击编辑合同(String arg1) throws Exception {
        this.contractListFlow.enterContractEdit(arg1);
    }

    @Then("^进入租赁合同编辑页$")
    public void 进入租赁合同编辑页() throws Exception {
        this.contractListFlow.clickNextStep();
    }

    @When("^点击合同编辑保存按钮$")
    public void 点击合同编辑保存按钮() throws Throwable {
        this.contractFlow.clickContractEditSubmit();
    }

    @When("^进入退租协议$")
    public void 进入退租协议() throws Exception {
        this.contractListFlow.enterTermination();

    }

    @When("^选择退租日期 \"([^\"]*)\"$")
    public void 选择退租日期(String arg1) throws Exception {
        this.contractListFlow.chooseTerminationDate(arg1);
    }

    @When("^历史账单显示:费用类型 \"([^\"]*)\"、计费周期 \"([^\"]*)\" 、账单类型 \"([^\"]*)\" 、账单金额 \"([^\"]*)\",实收/付金额 \"([^\"]*)\"  、实际收入/支出 \"([^\"]*)\"$")
    public void 历史账单显示_费用类型_计费周期_账单类型_实收_付金额_实际收入_支出(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
        this.contractListFlow.showHistoryBill(arg1, arg2, arg3, arg4, arg5, arg6);

    }

    @When("^费用总计显示总计应收 \"([^\"]*)\"$")
    public void 费用总计显示总计应收(String arg1) throws Exception {
        this.contractListFlow.showTotal(arg1);

    }

    @When("^点击保存&提交$")
    public void 点击保存_提交() throws Exception {
        this.contractListFlow.clickSaveAndSubmit();

    }

    @When("^查看审核，并通过审核$")
    public void 查看审核_并通过审核() throws Exception {
        this.contractListFlow.passApprovel();

    }

    @When("^页面刷新，重新选择房号\"([^\"]*)\",选择相应的租客名为\"([^\"]*)\"的租赁合同$")
    public void 页面刷新_重新选择房号_选择相应的租客名为_的租赁合同(String arg1, String arg2) throws Exception {
        this.contractListFlow.enterContractDetails(arg1, arg2);
    }

    @When("^合同状态为\"([^\"]*)\"$")
    public void 合同状态为(String arg1) throws Exception {
        this.contractListFlow.checkStatus(arg1);
    }

    @When("^单击查看合同账单列表进入合同账单列表$")
    public void 单击查看合同账单列表进入合同账单列表() throws Exception {
        this.contractListFlow.enterBillList();
    }

    @Then("^账单列表显示租金退租结算账单\"([^\"]*)\"$")
    public void 账单列表显示租金退租结算账单(String arg1) throws Exception {
        this.contractListFlow.checkBillUncleared(arg1);
    }

    @When("^点击作废按钮$")
    public void 点击作废按钮() throws Exception {
        this.contractListFlow.clickDeleteContract();

    }

    @When("^填写作废原因\"([^\"]*)\"$")
    public void 填写作废原因(String arg1) throws Exception {
        this.contractListFlow.sendDeleteReason(arg1);

    }

    @When("^选择\"([^\"]*)\"账单处理方式$")
    public void 选择关闭_账单处理方式(String arg1) throws Exception {
        this.contractListFlow.chooseDealWithBill(arg1);
    }


}
