package com.souban.bdd.flows.CreamsWebFlow.Contract;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Contract.ContractListPage;

public class ContractListFlow {
    private ContractListPage contractListPage = null;

    public ContractListFlow(final Driver driver) {
        this.contractListPage = PageFactory.getPage(ContractListPage.class, driver);
    }

    /**
     * 选择单一楼宇，进入租赁合同
     */
    public void enterContractListPage() {
        this.contractListPage.enterContractListPage();
    }

    /**
     * 筛选到期预警
     */
    public void chooseWarning() {
        this.contractListPage.chooseWarning();

    }

    /**
     * 点击后效果（暂定）
     */
    public void colorBule() {
        Assert.assertThat(this.contractListPage.colorBule(), is(true));

    }


    /**
     * 选择单一楼宇剖面图
     *
     * @param building
     */
    public void chooseOneBuilding(String building) {
        this.contractListPage.chooseOneBuilding(building);
    }

    /**
     * 选择房号
     *
     * @param roomNum
     */
    public void chooseRoomNum(String roomNum) {
        this.contractListPage.chooseRoomNum(roomNum);
    }

    /**
     * 房源内新建租赁合同
     */
    public void clickCreateContractBuilding() {
        this.contractListPage.clickCreateContractBuilding();
    }

    /**
     * 新建合同
     */
    public void createContract() {
        this.contractListPage.clickCreateContract();
    }

    /**
     * 选择相应的租客名——的租赁合同
     *
     * @param renter
     */
    public void chooseContract(String renter) {
        this.contractListPage.chooseContract(renter);
    }

    /**
     * 不点击楼盘图片，展开房源
     *
     * @param build
     */
    public void clickBuildingsList(String build) {
        this.contractListPage.clickBuildingsList(build);

    }

    /**
     * 基本条款修改开始时间,结束时间
     *
     * @param startDate 合同开始时间
     * @param endDate   合同结束时间
     */
    public void updateStartAndEndDate(String startDate, String endDate) {
        this.contractListPage.updateStartAndEndDate(startDate, endDate);
    }

    /**
     * 键入基本信息
     *
     * @param renter    租客
     * @param floorName 房源
     */
    public void confirmBaseInformation(String renter, String floorName) {
        this.contractListPage.confirmBaseInformation(renter, floorName);
    }

    /**
     * 仅下一步
     */
    public void clickNextStep() {
        this.contractListPage.clickNextStep();
    }

    /**
     * 键入费用条款
     *
     * @param deposit                  押金
     * @param payType                  支付类型（几月一付）
     * @param advancePaytime           （提前付款时间）
     * @param basePrice                （基础单价）
     * @param dayNumberForYear         （年天数）
     * @param keepDecimalPoint（保留几位小数）
     */
    public void confirmExpenseInformation(String deposit, String payType, String advancePaytime, String basePrice,
                                          String dayNumberForYear, String keepDecimalPoint) {
        this.contractListPage.confirmExpenseInformation(deposit, payType, advancePaytime, basePrice, dayNumberForYear, keepDecimalPoint);
    }

    /**
     * 增加一条递增率
     */
    public void addIncrease() {
        this.contractListPage.addIncrease();
    }

    /**
     * 删除一条递增率
     */
    public void deleteIncrease() {
        this.contractListPage.deleteIncrease();
    }

    /**
     * 删除递增率是否成功
     */
    public void deleteIncreaseSuccessful() {
        Assert.assertThat(this.contractListPage.deleteIncreaseSuccessful(), is(false));
    }

    /**
     * 生成租金明细
     */
    public void createTentDetails() {
        this.contractListPage.createTentDetails();
    }

    /**
     * 点击保存&发起审批$
     */
    public void clickSaveAndApprovel() {
        this.contractListPage.saveAndApprovel();
    }

    /**
     * 保存合同
     */
    public void saveContract() {
        this.contractListPage.saveContract();
    }

    /**
     * 查看合同详情
     *
     * @param contractName 租客
     */
    public void enterContractDetails(String contractName) {
        this.contractListPage.enterContractDetails(contractName);
    }

    /**
     * 查看详情信息
     */
    public void enterContractDetailsSuccessful() {
        Assert.assertThat(this.contractListPage.enterContractDetailsSuccessful(), is(true));
    }

    /**
     * 成功信息
     */
    public void createNewContractSuccessfully() {
        Assert.assertThat(this.contractListPage.createNewContractSuccessfully(), is(true));

    }

    /**
     * 点击合同编辑按钮
     *
     * @param contract 租客
     */
    public void enterContractEdit(String contract) {
        this.contractListPage.enterContractEdit(contract);
    }

    /**
     * 进入退租协议
     */
    public void enterTermination() {
        this.contractListPage.enterTermination();

    }

    /**
     * 选择退租日期
     *
     * @param terminationDate 退租时间
     */
    public void chooseTerminationDate(String terminationDate) {
        this.contractListPage.chooseTerminationDate(terminationDate);

    }

    /**
     * 历史账单显示:费用类型、计费周期、账单类型、实收/付金额、实际收入/支出
     *
     * @param costType 费用类型
     * @param billDate 计费周期
     * @param billType 账单类型
     * @param theroy   账单金额
     * @param money    实收/付
     * @param actual   实际收入/支出
     */
    public void showHistoryBill(String costType, String billDate, String billType, String theroy, String money, String actual) {
        Assert.assertThat(this.contractListPage.showHistoryBill(costType, billDate, billType, theroy, money, actual), is(true));

    }

    /**
     * 费用总计显示总计应收
     *
     * @param total 应收/退总计
     */
    public void showTotal(String total) {
        Assert.assertThat(this.contractListPage.showTotal(total), is(true));
    }

    /**
     * 点击保存&提交
     */
    public void clickSaveAndSubmit() {

        this.contractListPage.clickSaveAndSubmit();
    }

    /**
     * 查看审核，并通过审核
     */
    public void passApprovel() {

        this.contractListPage.passApprovel();
    }

    /**
     * 页面刷新_重新选择房号_选择相应的租客名为_的租赁合同
     *
     * @param roomnum      房号
     * @param customername 租客
     */
    public void enterContractDetails(String roomnum, String customername) {
        this.contractListPage.enterContractDetails(roomnum, customername);

    }

    /**
     * 查看合同状态
     *
     * @param status 合同状态
     */
    public void checkStatus(String status) {
        this.contractListPage.checkStatus(status);
    }

    /**
     * 单击查看合同账单列表进入合同账单列表
     */
    public void enterBillList() {

        this.contractListPage.enterBillList();
    }

    /**
     * 账单列表显示租金退租结算账单
     *
     * @param primeAmount 应付金额
     */
    public void checkBillUncleared(String primeAmount) {
        this.contractListPage.checkBillUncleared(primeAmount);
    }

    /**
     * 点击作废按钮
     */
    public void clickDeleteContract() {
        this.contractListPage.clickDeleteContract();
    }

    /**
     * 填写作废原因
     *
     * @param reason 作废原因
     */
    public void sendDeleteReason(String reason) {
        this.contractListPage.sendDeleteReason(reason);
    }

    /**
     * 作废合同时选择账单处理方式
     *
     * @param deal 处理方式
     */
    public void chooseDealWithBill(String deal) {
        this.contractListPage.chooseDealWithBill(deal);
    }

    /**
     * 房源内新建合同输入租客
     *
     * @param renter 租客
     */
    public void confirmRenter(String renter) {
        this.contractListPage.confirmRenter(renter);
    }

    /**
     * 勾选重新发送账单，点确定
     */
    public void chooseReSendBill() {
        this.contractListPage.chooseReSendBill();
    }

    /**
     * 不勾选重新发送账单，点确定
     */
    public void chooseNoSendBill() {
        this.contractListPage.chooseNoSendBill();
    }

    /**
     * 选中单一楼宇，在租赁页面
     *
     * @param build 楼宇名称
     */
    public void enterContractListPageByBuild(String build) {
        this.contractListPage.enterContractListPageByBuild(build);
    }


}
