package com.souban.bdd.pages.CreamsWebPage.Contract;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class ContractAndContractNumberPage extends ParentPage {

    public ContractAndContractNumberPage(Driver driver) {
        super(driver);
    }

    private UIElement BTN_edit = new UIElement("//span[text()='编辑']");
    private UIElement INP_contractNum = new UIElement("//* [contains(@class,'ant-input-disabled')]");
    private UIElement SLC_contractFollower = new UIElement("//div[text()='跟进人']/parent::div/following-sibling::div");
    private UIElement BTN_nextStep = new UIElement("//span[text()='下一步']/parent::button");
    private UIElement BTN_save = new UIElement("//span[text()='保 存']/parent::button");
    private UIElement BTN_sure = new UIElement("//button[text()='确认']");
    private UIElement BTN_operateMessage = new UIElement("//span[text()='操作记录']");
    private UIElement TXT_changeOperaterMessage = new UIElement(
            "//div[text()='操作记录']/following-sibling::div/div[2]/div/div[2]/div[1]");
    private UIElement BTN_seeLastContract = new UIElement("//*[@style='float: left; cursor: pointer;']");
    private UIElement TXT_originalContact = new UIElement("//span[text()='原始合同' and @class='tenantBlock___Q9QRJ']");
    private UIElement BTN_continueContract = new UIElement("//span[text()='续 签']/parent::button");
    private UIElement INP_hireName = new UIElement("//div[text()='请填写姓名或公司']/parent::div/ul/li/div/input");
    private UIElement BTN_clickAndBeHireMoneyDetail = new UIElement("//span[text()='点击生成租金明细']/parent::button");
    private UIElement BTN_saveAndSuppotCheck = new UIElement("//*[text()='保存 & 发起审批']/parent::button");
    private UIElement BTN_seeCheck = new UIElement("//span[text()='查看审核']/parent::button");
    private UIElement BTN_CheckedPassed = new UIElement("//span[text()='审核通过']/parent::button");
    private UIElement BTN_completeReason = new UIElement("//span[text()='确 定']/parent::button");
    private UIElement TXT_continueHired = new UIElement("//div[text()='续租']");
    private UIElement BTN_deleteHireContract = new UIElement("//span[text()='作 废']/parent::button");
    private UIElement INP_reasonForDelete = new UIElement("//*[@placeholder='请填写作废原因']");
    private UIElement BTN_randomChooseSetWay = new UIElement("//span[text()='关闭所有未收款账单']/preceding-sibling::span");
    //详情页返回上一步按钮
    private UIElement BTN_lastStep = new UIElement("//i[@class='creamsicon_17 backArrow___1DRT5 leftBorder___3eEjH']");

    // 个人中心按钮
    // private UIElement BTN_profile = new
    // UIElement("//*[contains(@class,'btn___2v-Wo ant-dropdown-trigger')]");
    // 当前登录名
    private UIElement TXT_loginName = new UIElement("//*[contains(@class,'item___1eUJK user___2QqNH')]");

    private UIElement choosesuozhouFloor(String FloorName) {
        return new UIElement("//div[text()='" + FloorName + "']/parent::div/parent::div");
    }

    private UIElement chooseMyHouseHaveCustomerName(String roomnum) {
        return new UIElement("//span[text()='" + roomnum + "']/parent::div/parent::div/parent::div/parent::div");
    }

    private UIElement chooseHireMan(String customername) {
        return new UIElement("//div[text()='" + customername + "']/parent::div/parent::td");
    }

    private UIElement chooseNextHireMan(String followcustomername) {
        return new UIElement("//div[text()='" + followcustomername + "']/parent::div/parent::td");

    }

    /**
     * 编辑待修改租赁合同
     */
    public void editContract() {
        this.driver.sleep(1000);
        this.driver.click(BTN_edit);
        this.driver.sleep(1000);

    }

    /**
     * 合同编号处于不可编辑状态
     *
     * @return
     */
    public boolean canNotEdit() {
        this.driver.sleep(1000);
        return this.driver.waitForElement(INP_contractNum, 5);
    }

    /**
     * 修改跟进人
     *
     * @param ChangeName
     * @return
     */
    public UIElement chooseFollower(String ChangeName) {

        // new UIElement("//div[@class='ant-select-selection-selected-value' and
        // text()='"+ChangeName+"']");
        return new UIElement("//*[text()='" + ChangeName + "']");
    }

    public void changeFollower() {
        this.driver.sleep(3000);
        this.driver.click(SLC_contractFollower);
        this.driver.sleep(1000);
        this.driver.waitClickable(this.chooseFollower(config.get("creams.approver")), 5);
        this.driver.sleep(1000);
        this.driver.click(this.chooseFollower(config.get("creams.approver")));
        this.driver.sleep(1000);
        this.driver.click(BTN_nextStep);
        this.driver.sleep(1000);
        this.driver.click(BTN_save);
        this.driver.sleep(4000);

    }

    /**
     * 查看操作记录
     *
     * @return
     */
    public String seeOperateMessage() {
        this.driver.waitClickable(BTN_operateMessage, 5);
        this.driver.sleep(2000);
        this.driver.click(BTN_operateMessage);
        this.driver.sleep(2000);
        return this.driver.elementGetText(TXT_changeOperaterMessage);
    }

    /**
     * 操作记录对比数据
     *
     * @return
     */
    public String operateMessage() {
        String operateMessage = "";
        this.driver.waitForElement(TXT_loginName, 1);
        String loginName = this.driver.elementGetText(TXT_loginName).toString();
        operateMessage = "跟进人 从 " + loginName + "修改为 " + config.get("creams.approver") + "";
        return operateMessage;
    }

    /**
     * 查看上一份合同
     */
    public void seeLastContract() {
        this.driver.sleep(1000);
        this.driver.click(BTN_seeLastContract);
        this.driver.sleep(1000);

    }

    public boolean theOriginalContract() {
        this.driver.sleep(1000);
        return this.driver.waitForElement(TXT_originalContact, 5);
    }

    /**
     * 进入不同楼不同房源不同顾客的租赁合同
     *
     * @param FloorName
     * @param roomnum
     * @param customername
     */
    public void enterRoom(String FloorName, String roomnum, String customername) {
        this.driver.waitClickable(this.choosesuozhouFloor(FloorName), 10);
        this.driver.sleep(1000);
        this.driver.click(this.choosesuozhouFloor(FloorName));
        this.driver.sleep(2000);
        this.driver.click(this.chooseMyHouseHaveCustomerName(roomnum));
        this.driver.sleep(1000);
        this.driver.click(this.chooseHireMan(customername));
        this.driver.sleep(1000);

    }

    // 续签合同
    public void continueContract(String followcustomername) {
        this.driver.sleep(1000);
        this.driver.click(BTN_continueContract);
        this.driver.sleep(2000);
        this.driver.elementClearText(INP_hireName);
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_hireName, followcustomername);
        this.driver.sleep(3000);
        this.driver.click(BTN_nextStep);
        this.driver.sleep(1000);
        this.driver.click(BTN_clickAndBeHireMoneyDetail);
        this.driver.sleep(1000);
        this.driver.click(BTN_saveAndSuppotCheck);
        this.driver.sleep(1000);
        this.driver.waitClickable(BTN_completeReason, 1);
        this.driver.click(BTN_completeReason);
        this.driver.sleep(2000);
        this.driver.click(BTN_lastStep);
        this.driver.sleep(1000);
        this.driver.click(this.chooseNextHireMan(followcustomername));
        this.driver.sleep(2000);

    }

    // 审核通过
    public void checkPass() {
        this.driver.click(BTN_seeCheck);
        this.driver.sleep(1000);
        this.driver.click(BTN_CheckedPassed);
        this.driver.sleep(1000);
        this.driver.click(BTN_completeReason);
        this.driver.sleep(1000);
        this.driver.click(BTN_sure);
        this.driver.sleep(2000);
    }

    // 查看续租高亮
    public boolean seeBeenHiredReminder(String roomnum) {
        this.driver.refresh();
        this.driver.sleep(1000);
        this.driver.click(this.chooseMyHouseHaveCustomerName(roomnum));
        this.driver.sleep(1000);
        return this.driver.waitForElement(TXT_continueHired, 5);
    }

    // 删除续签合同
    public void deleteContinueContract(String followcustomername) {
        this.driver.sleep(1000);
        this.driver.click(this.chooseNextHireMan(followcustomername));
        this.driver.sleep(1000);
        this.driver.click(BTN_deleteHireContract);
        this.driver.sleep(2000);
        this.driver.elementSendText(INP_reasonForDelete, "noreason");
        this.driver.sleep(1000);
        this.driver.click(BTN_randomChooseSetWay);
        this.driver.sleep(2000);
        this.driver.click(BTN_save);
        this.driver.sleep(1000);
        this.driver.click(BTN_sure);
        this.driver.sleep(2000);
        this.driver.click(BTN_seeCheck);
        this.driver.sleep(1000);
        this.driver.click(BTN_CheckedPassed);
        this.driver.sleep(1000);
        this.driver.click(BTN_completeReason);
        this.driver.sleep(1000);
        this.driver.click(BTN_sure);
        this.driver.sleep(2000);

    }

}
