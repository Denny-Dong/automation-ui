package com.souban.bdd.pages.CreamsWebPage.Contract;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

/**
 * 合同列表page
 *
 * @author yangjiayan
 */
public class ContractListPage extends ParentPage {


    public ContractListPage(Driver driver) {

        super(driver);
    }


    // 合同列表页面元素
    private UIElement BTN_contractListPage = new UIElement("xpath=//*[text()='租赁合同']");

    /**
     * 合同列表
     */
    // 到期预警
    private UIElement BTN_expirationWarning = new UIElement("xpath=//div[@class='filterBtn___2HNr7']/span[1]");
    // 点亮到期预警按钮
    private UIElement TXT_expirationWarningBule = new UIElement("xpath=//*[@class='active___1rIla']");
    // 到期未处理
    private UIElement BTN_untreatedWarning = new UIElement("xpath=//div[@class='filterBtn___2HNr7']/span[2]");
    // 清除筛选条件
    private UIElement BTN_clearCondition = new UIElement("xpath=//*[text()='清除选项']");
    // +合同按钮
    private UIElement BTN_createContract = new UIElement("xpath=//*[text()='合同']/parent::button");
    //+租赁合同按钮
    private UIElement BTN_createAddContract = new UIElement("xpath=//*[text()='租赁合同']/../button");

    /**
     * 新建租赁合同
     */
    // 租客输入框
    private UIElement INP_tenant = new UIElement("xpath=//*[text()='请填写姓名或公司']/../descendant::input");
    // 展开房源列表
    private UIElement BTN_building = new UIElement("xpath=//a[text()='+ 房源']");
    // 选中房号
    private UIElement BTN_buildingRoom = new UIElement(
            "xpath=//*[@class='list___3AoYL canInvest']/li[1]/descendant::input");
    // 下一步
    private UIElement BTN_nextStep = new UIElement("xpath=//*[text()='下一步']/parent::button");
    //合同计租时间
    private UIElement BTN_startDate = new UIElement("xpath=//*[text()='合同计租时间']/../following-sibling::*");
    //合同结束时间
    private UIElement BTN_endDate = new UIElement("xpath=//*[text()='合同结束时间']/../following-sibling::*");
    //开始时间计租
    private UIElement INP_startDateValue = new UIElement("xpath=//*[text()='合同计租时间']/../following-sibling::*/descendant::input");
    // 输入押金
    private UIElement INP_deposit = new UIElement("xpath=//*[@placeholder='请填写押金']");
    // 输入年天数
    private UIElement INP_keepDecimalPoint = new UIElement("xpath=//*[@placeholder='请填写保留几位']");
    // 年天数
    private UIElement INP_dayNumberForYear = new UIElement("xpath=//*[@id='dayNumberForYear_0']");
    // 支付类型
    private UIElement INP_payType = new UIElement("xpath=//*[@placeholder='请填写支付类型']");
    // 提前付款时间
    private UIElement INP_advancePaytime = new UIElement("xpath=//*[@placeholder=\'请填写提前付款时间\']");
    // 输入基础单价
    private UIElement INP_basePrice = new UIElement("xpath=//*[@placeholder='请填写基础单价']");
    // 递增率按钮
    private UIElement BTN_increase = new UIElement("xpath=//*[text()='递增率']/../div[@class='addItems___3QHku']");
    // 生成租金明细
    private UIElement BTN_rentDetails = new UIElement("xpath=//*[text()='点击生成租金明细']/parent::button");
    // 递增率删除按钮
    private UIElement BTN_deleteIncrease = new UIElement("xpath=//*[text()='递增率']/..//i[@class='creamsicon_17']");
    // 递增率模块
    private UIElement TXT_increase = new UIElement("xpath=//*[@class='outTitleBlock___1rQ2X' and text()='递增率']");
    // 保存
    private UIElement BTN_save = new UIElement("xpath=//*[text()='保 存']/parent::button");
    // 成功信息提示
    private UIElement TXT_createContractSuccessfully = new UIElement("xpath=//*[text()='创建成功']");
    // 保存&发起审批
    private UIElement BTN_saveAndExamine = new UIElement("xpath=//*[text()='保存 & 发起审批']/parent::button");

    /**
     * 租客详情页
     */
    private UIElement TXT_contractDetails = new UIElement("xpath=//*[text()='租赁合同详情']");
    //退租按钮
    private UIElement BTN_termination = new UIElement("xpath=//*[text()='退 租']/..");
    //退租日期
    private UIElement BTN_terminationDate = new UIElement("xpath=//*[text()='退租日期']/../following-sibling::*");
    //输入日期控件
    private UIElement INP_dateTool = new UIElement("xpath=//input[contains(@class,'ant-calendar-input')]");
    //费用总计
    private UIElement TXT_total = new UIElement("xpath=//*[text()='费用总计']/following::*/*[contains(text(),'总计应')]/../h4");
    //保存&提交按钮
    private UIElement BTN_saveAndSubmit = new UIElement("xpath=//*[text()='保存&提交']/..");
    //确认按钮
    private UIElement BTN_check = new UIElement("xpath=//*[text()='确认']");
    //确定按钮
    private UIElement BTN_yes = new UIElement("xpath=//*[text()='确 定']/..");

    //查看审核按钮
    private UIElement BTN_inspectApprovel = new UIElement("xpath=//*[text()='查看审核']/..");
    //合同审核页面
    private UIElement TXT_contractApprovel = new UIElement("xpath=//*[text()='合同审核']");
    //审核通过按钮
    private UIElement BTN_approvelPass = new UIElement("xpath=//*[text()='审核通过']/..");
    //查看合同账单列表按钮
    private UIElement BTN_inpsectBillList = new UIElement("xpath=//span[text()='查看合同账单列表']/parent::button");
    //租金明细、账单、摊销、凭证一栏
    private UIElement TXT_buttonList = new UIElement("xpath=//div[@class='btnsBlock___CKlqe']");
    //租金退租结算账单金额
    private UIElement TXT_billPrimeAmount = new UIElement("xpath=//*[text()='租金退租结算']/ancestor::tr/td[6]");
    //合同作废按钮
    private UIElement BTN_deleteContract = new UIElement("xpath=//*[text()='作 废']/..");

    /**
     * 作废合同页
     */
    //合同作废原因输入框
    private UIElement INP_contractDeleteReason = new UIElement("xpath=//*[@placeholder='请填写作废原因']");

    /**
     * 作废合同选择处理账单方式
     *
     * @param deal 处理方式
     * @return 处理方式
     */
    private UIElement BTN_chooseDealWithBill(String deal) {

        return new UIElement("xpath=//*[text()='" + deal + "']/..");
    }

    //编辑合同是否生成账单二次确认框
    private UIElement BTN_sendBill = new UIElement("xpath=//*[text()='是否生成新的账单数据?']/following-sibling::*");

    //  合同编辑按钮
    private UIElement BTN_editContract = new UIElement(
            "xpath=//*[text()='编辑合同']/ancestor::div[contains(@style,'display: block;')]/button");


    /**
     * 楼宇集合中某个楼宇
     *
     * @param building 楼宇名称
     * @return
     */
    private UIElement BTN_buildingByCollect(String building) {
        return new UIElement("xpath=//ul[@class='list___2Hba-']/li//*[text()='" + building + "']/..");
    }


    /**
     * 单一楼宇
     *
     * @param floorName 房源
     * @return
     */
    private UIElement chooseOneFloor(String floorName) {
        return new UIElement("//div[text()='" + floorName + "']/parent::div/parent::div");
    }

    /**
     * 结束时间计租
     *
     * @param endDate 合同结束时间
     * @return
     */
    private UIElement BTN_endDateValue(String endDate) {

        return new UIElement("xpath=//*[text()='" + endDate + "']");

    }


    /**
     * 选择租客联想
     *
     * @param tenantName 租客名
     * @return
     */
    public UIElement BTN_tenantName(String tenantName) {
        return new UIElement("xpath=//li[text()='" + tenantName + "']");
    }

    /**
     * 展开某楼宇
     *
     * @param building 楼宇名称
     * @return
     */
    public UIElement TXT_chooseBuildingOnRoom(String building) {
        return new UIElement("xpath=//*[@class='message___2CWcK']/h3[text()='" + building + "']");
    }

    /**
     * 某个合同
     *
     * @param contractName 租客名
     * @return 合同列表的合同
     */
    public UIElement TXT_contractDetails(String contractName) {
        return new UIElement("xpath=//*[text()='" + contractName + "']/ancestor::ol");

    }

    /**
     * 合同状态
     *
     * @param status 合同状态
     * @return 合同状态
     */
    public UIElement TXT_status(String status) {
        return new UIElement("xpath=//*[@class='labelContainer___1b-Hc']/child::*/*[text()='" + status + "']");
    }

    /**
     * 历史账单
     *
     * @param str 账单li
     * @return 退租时历史账单列表中一条账单中的li 不包括实际收入/付出
     */
    public UIElement TXT_history(String str) {
        return new UIElement("xpath=//*[text()='费用类型']/../following-sibling::*/li[text()='" + str + "']");
    }

    /**
     * 进入某个房源
     *
     * @param roonum 房源
     * @return 剖面图房源
     */
    private UIElement BTN_enterRoom(String roonum) {
        return new UIElement("xpath=//span[contains(text(),'" + roonum + "')]/parent::div/parent::div/parent::div/parent::div");
    }

    /**
     * 房源下选择合同
     *
     * @param customername 租客
     * @return 房源内合同
     */
    private UIElement BTN_chooseContract(String customername) {
        return new UIElement("xpath=//div[text()='" + customername + "']/parent::div/parent::td");
    }

    /**
     * 退租协议实际收入支出
     *
     * @param actual 实际收入
     * @return 列表内实际收入
     */
    private UIElement TXT_actual(String actual) {
        return new UIElement("xpath=//*[text()='费用类型']/../following-sibling::*/descendant::input[@value='" + actual + "']");
    }


    /**
     * 不选择楼宇的情况下进入租赁合同页
     */
    public void enterContractListPage() {
        this.driver.waitClickable(BTN_contractListPage, 5);
        this.driver.click(BTN_contractListPage);
    }

    /**
     * 点击到期预警按钮
     */
    public void chooseWarning() {
        this.driver.waitClickable(BTN_expirationWarning, 5);
        this.driver.click(BTN_expirationWarning);

    }

    /**
     * 验证到期预警是否点亮
     *
     * @return
     */
    public boolean colorBule() {
        return this.driver.waitForElement(TXT_expirationWarningBule, 5);
    }

    /**
     * 选择到期未处理合同
     */
    public void clickUntreatedWarning() {
        this.driver.waitClickable(BTN_untreatedWarning, 5);
        this.driver.click(BTN_untreatedWarning);
    }

    /**
     * 清除筛选条件
     */
    public void clickClearCondition() {
        this.driver.waitAndClick(BTN_clearCondition, 5);
    }

    /**
     * 选择单一楼宇剖面图
     *
     * @param floorName
     */
    public void chooseOneBuilding(String floorName) {
        this.driver.click(chooseOneFloor(floorName));
        this.driver.sleep(2000);
    }

    /**
     * 点击+合同按钮
     */
    public void clickCreateContract() {
        this.driver.waitClickable(BTN_createContract, 5);
        this.driver.click(BTN_createContract);
    }

    /**
     * 选择房号
     *
     * @param roomNum
     */
    public void chooseRoomNum(String roomNum) {
        this.driver.waitClickable(BTN_enterRoom(roomNum), 2);
        this.driver.click(BTN_enterRoom(roomNum));
        this.driver.sleep(2000);
    }

    /**
     * 点击+租赁合同按钮剖面图房源内
     */
    public void clickCreateContractBuilding() {
        this.driver.waitClickable(BTN_createAddContract, 5);
        this.driver.click(BTN_createAddContract);
    }

    /**
     * 不选择楼盘图片，展开房源
     *
     * @param building
     */
    public void clickBuildingsList(String building) {
        this.driver.waitClickable(BTN_building, 5);
        this.driver.click(BTN_building);
        this.driver.waitClickable(TXT_chooseBuildingOnRoom(building), 5);

        this.driver.click(TXT_chooseBuildingOnRoom(building));
        this.driver.waitClickable(BTN_buildingRoom, 5);
        this.driver.click(BTN_buildingRoom);
    }

    /**
     * 展开房源信息
     *
     * @return
     */
    public boolean buildingsListDetils() {
        return this.driver.waitForElement(BTN_buildingRoom, 5);

    }

    /**
     * 键入基本信息
     *
     * @param renter
     * @param floorName
     */
    public void confirmBaseInformation(String renter, String floorName) {
        this.driver.elementSendText(INP_tenant, renter);
        this.driver.waitClickable(BTN_tenantName(renter), 5);
        this.driver.click(BTN_tenantName(renter));

        this.driver.waitClickable(BTN_building, 5);
        this.driver.click(BTN_building);
        this.driver.waitClickable(TXT_chooseBuildingOnRoom(floorName), 5);
        this.driver.click(TXT_chooseBuildingOnRoom(floorName));

        this.driver.waitClickable(BTN_buildingRoom, 5);
        this.driver.click(BTN_buildingRoom);
        this.driver.waitClickable(BTN_nextStep, 5);
        this.driver.click(BTN_nextStep);
    }

    /**
     * 仅下一步
     */
    public void clickNextStep() {
        this.driver.waitClickable(BTN_nextStep, 5);
        this.driver.click(BTN_nextStep);
    }


    /**
     * 基本条款修改开始时间,结束时间
     *
     * @param startDate
     * @param endDate
     */
    public void updateStartAndEndDate(String startDate, String endDate) {
        this.driver.waitClickable(BTN_startDate, 2);
        this.driver.click(BTN_startDate);

        this.driver.waitForElement(INP_dateTool, 2);
        this.driver.elementClearText(INP_dateTool);
        this.driver.elementSendText(INP_dateTool, startDate);

        this.driver.click(BTN_endDate);
        this.driver.sleep(2000);
        this.driver.click(BTN_endDateValue(endDate));

        this.driver.sleep(2000);
    }

    /**
     * 键入费用条款信息
     *
     * @param deposit
     * @param payType
     * @param advancePaytime
     * @param basePrice
     * @param dayNumberForYear
     * @param keepDecimalPoint
     */
    public void confirmExpenseInformation(String deposit, String payType, String advancePaytime, String basePrice,
                                          String dayNumberForYear, String keepDecimalPoint) {
        this.driver.sleep(1000);
        this.driver.elementClearText(INP_deposit);
        this.driver.elementSendText(INP_deposit, deposit);

        this.driver.elementClearText(INP_keepDecimalPoint);
        this.driver.elementSendText(INP_keepDecimalPoint, keepDecimalPoint);

        this.driver.elementClearText(INP_payType);
        this.driver.elementSendText(INP_payType, payType);

        this.driver.elementClearText(INP_advancePaytime);
        this.driver.elementSendText(INP_advancePaytime, advancePaytime);

        this.driver.elementClearText(INP_basePrice);
        this.driver.elementSendText(INP_basePrice, basePrice);
        //判断年天数输入是否存在
        if (isDayNumberForYearAble()) {
            this.driver.elementClearText(INP_dayNumberForYear);
            this.driver.elementSendText(INP_dayNumberForYear, dayNumberForYear);
        }
    }

    /**
     * 年天数是否存在
     *
     * @return
     */
    public boolean isDayNumberForYearAble() {

        return this.driver.waitForElement(INP_dayNumberForYear, 3);

    }

    /**
     * 生成租金明细
     */
    public void createTentDetails() {
        this.driver.waitClickable(BTN_rentDetails, 5);
        this.driver.click(BTN_rentDetails);
    }

    /**
     * 增加一条递增率
     */
    public void addIncrease() {
        this.driver.waitClickable(BTN_increase, 5);
        this.driver.click(BTN_increase);
    }

    /**
     * 删除一条递增率
     */
    public void deleteIncrease() {
        this.driver.waitClickable(BTN_deleteIncrease, 5);
        this.driver.click(BTN_deleteIncrease);
    }

    /**
     * 删除递增率是否成功
     *
     * @return
     */
    public boolean deleteIncreaseSuccessful() {
        return this.driver.waitForElement(TXT_increase, 5);
    }

    /**
     * 保存合同
     */
    public void saveContract() {
        this.driver.waitClickable(BTN_save, 5);
        this.driver.click(BTN_save);
    }

    /**
     * 保存合同&发起审核
     */
    public void saveAndApprovel() {
        this.driver.waitClickable(BTN_saveAndExamine, 5);
        this.driver.click(BTN_saveAndExamine);
        this.driver.sleep(5000);
    }

    /**
     * 点击合同详情
     *
     * @param contract
     */
    public void enterContractDetails(String contract) {
        this.driver.sleep(2000);
        this.driver.waitClickable(TXT_contractDetails(contract), 5);
        this.driver.click(TXT_contractDetails(contract));
    }

    /**
     * 查看详情信息
     *
     * @return
     */
    public boolean enterContractDetailsSuccessful() {
        return this.driver.waitForElement(TXT_contractDetails, 5);
    }

    /**
     * 成功信息
     *
     * @return
     */
    public boolean createNewContractSuccessfully() {
        return this.driver.waitForElement(TXT_createContractSuccessfully, 5);
    }

    /**
     * 点击编辑合同信息
     *
     * @param contract
     */
    public void enterContractEdit(String contract) {
        this.driver.MoveToElement(TXT_contractDetails(contract));
        this.driver.mouseOver(TXT_contractDetails(contract));
        this.driver.waitClickable(BTN_editContract, 5);
        this.driver.click(BTN_editContract);
    }

    /**
     * 进入退租协议
     */
    public void enterTermination() {
        this.driver.sleep(2000);
        this.driver.waitClickable(BTN_termination, 2);
        this.driver.click(BTN_termination);

    }

    /**
     * 选择退租日期
     *
     * @param terminationDate
     */
    public void chooseTerminationDate(String terminationDate) {
        this.driver.waitClickable(BTN_terminationDate, 3);
        this.driver.click(BTN_terminationDate);
        this.driver.waitClickable(INP_dateTool, 2);
        this.driver.sleep(2000);
        this.driver.elementClearText(INP_dateTool);
        this.driver.elementSendText(INP_dateTool, terminationDate);
        this.driver.sleep(2000);
    }

    /**
     * 历史账单显示:费用类型、计费周期、账单类型、实收/付金额、实际收入/支出
     *
     * @param costType
     * @param billDate
     * @param billType
     * @param theory
     * @param money
     * @param actual
     * @return
     */
    public boolean showHistoryBill(String costType, String billDate, String billType, String theory, String money, String actual) {
        boolean result = false;
        String[] history = new String[]{costType, billDate, billType, theory, money};
        for (int i = 0; i < history.length; i++) {
            result = this.driver.waitForElement(TXT_history(history[i]), 2);
            if (!result) {
                break;
            }
        }
        if (result) {
            result = this.driver.waitForElement(TXT_actual(actual), 2);
        }
        return result;
    }

    /**
     * 费用总计显示总计应收
     *
     * @param total
     * @return
     */
    public boolean showTotal(String total) {

        this.driver.sleep(2000);

        return this.driver.elementGetText(TXT_total).equals(total + "元");

    }


    /**
     * 点击保存&提交
     */
    public void clickSaveAndSubmit() {
        this.driver.waitClickable(BTN_saveAndSubmit, 2);
        this.driver.click(BTN_saveAndSubmit);
        this.driver.waitClickable(BTN_check, 2);
        this.driver.click(BTN_check);
        this.driver.sleep(2000);
    }

    /**
     * 查看审核，并通过审核
     */
    public void passApprovel() {
        this.driver.waitClickable(BTN_inspectApprovel, 2);
        this.driver.click(BTN_inspectApprovel);
        this.driver.waitForElement(TXT_contractApprovel, 2);
        this.driver.waitClickable(BTN_approvelPass, 2);
        this.driver.click(BTN_approvelPass);
        this.driver.waitClickable(BTN_yes, 2);
        this.driver.click(BTN_yes);
        this.driver.waitClickable(BTN_check, 2);
        this.driver.click(BTN_check);
        this.driver.sleep(2000);

    }

    /**
     * 页面刷新_重新选择房号_选择相应的租客名为_的租赁合同
     *
     * @param roomnum
     * @param customername
     */
    public void enterContractDetails(String roomnum, String customername) {
        this.driver.sleep(3000);
        this.driver.waitClickable(BTN_enterRoom(roomnum), 2);
        this.driver.sleep(2000);
        this.driver.click(BTN_enterRoom(roomnum));
        this.driver.waitClickable(BTN_chooseContract(customername), 2);
        this.driver.click(BTN_chooseContract(customername));

    }

    /**
     * 选择相应的租客名——的租赁合同
     *
     * @param renter
     */
    public void chooseContract(String renter) {
        this.driver.waitClickable(BTN_chooseContract(renter), 2);
        this.driver.click(BTN_chooseContract(renter));
    }

    /**
     * 查看合同状态
     *
     * @param status
     */
    public void checkStatus(String status) {
        this.driver.sleep(2000);
        this.driver.waitForElement(TXT_status(status), 2);
    }

    /**
     * 单击查看合同账单列表进入合同账单列表
     */
    public void enterBillList() {
        this.driver.sleep(2000);
        this.driver.MoveToElement(TXT_buttonList);
        this.driver.sleep(2000);
        this.driver.waitClickable(BTN_inpsectBillList, 2);
        this.driver.sleep(2000);
        this.driver.click(BTN_inpsectBillList);
    }

    /**
     * 账单列表显示租金退租结算账单
     *
     * @param primeAmount
     * @return
     */
    public boolean checkBillUncleared(String primeAmount) {
        this.driver.waitForElement(TXT_billPrimeAmount, 2);
        return this.driver.elementGetText(TXT_billPrimeAmount).equals(primeAmount);
    }

    /**
     * 点击作废按钮
     */
    public void clickDeleteContract() {
        this.driver.waitClickable(BTN_deleteContract, 2);
        this.driver.click(BTN_deleteContract);
    }

    /**
     * 填写作废原因
     *
     * @param reason
     */
    public void sendDeleteReason(String reason) {
        this.driver.waitForElement(INP_contractDeleteReason, 2);
        this.driver.elementSendText(INP_contractDeleteReason, reason);
    }

    /**
     * 作废合同时选择账单处理方式
     *
     * @param deal
     */
    public void chooseDealWithBill(String deal) {
        this.driver.waitClickable(BTN_chooseDealWithBill(deal), 2);
        this.driver.click(BTN_chooseDealWithBill(deal));
        this.driver.click(BTN_save);
        this.driver.waitClickable(BTN_check, 2);
        this.driver.click(BTN_check);
        this.driver.sleep(2000);
    }

    /**
     * 房源内新建合同输入租客
     *
     * @param renter
     */
    public void confirmRenter(String renter) {
        this.driver.elementSendText(INP_tenant, renter);
        this.driver.waitClickable(BTN_tenantName(renter), 5);
        this.driver.click(BTN_tenantName(renter));
        this.driver.waitClickable(BTN_nextStep, 5);
        this.driver.click(BTN_nextStep);
    }

    /**
     * 勾选重新发送账单，点确定
     */
    public void chooseReSendBill() {
        this.driver.waitClickable(BTN_sendBill, 2);
        this.driver.click(BTN_sendBill);
        this.driver.click(BTN_yes);
        this.driver.sleep(2000);
    }

    /**
     * 不勾选重新发送账单，点确定
     */
    public void chooseNoSendBill() {
        this.driver.waitClickable(BTN_yes, 2);
        this.driver.click(BTN_yes);
        this.driver.sleep(2000);
    }

    /**
     * 选中单一楼宇，在租赁页面
     *
     * @param build 楼宇名称
     */
    public void enterContractListPageByBuild(String build) {
        this.driver.waitClickable(BTN_buildingByCollect(build), 2);
        this.driver.click(BTN_buildingByCollect(build));
        this.enterContractListPage();
    }


}
