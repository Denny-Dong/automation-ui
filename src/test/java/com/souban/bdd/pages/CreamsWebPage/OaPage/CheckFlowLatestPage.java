package com.souban.bdd.pages.CreamsWebPage.OaPage;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CheckFlowLatestPage extends ParentPage {

    public CheckFlowLatestPage(Driver driver) {
        super(driver);
    }

    private UIElement BTN_addHireContract = new UIElement("//div[text()='租赁合同']/preceding-sibling::button");
    private UIElement INP_hireCustName = new UIElement("//div[text()='请填写姓名或公司']/following-sibling::ul/li/div/input");
    private UIElement BTN_hireNextStep = new UIElement("//span[text()='下一步']/parent::button");
    private UIElement INP_keepMoney = new UIElement("//*[@placeholder='请填写押金']");
    private UIElement INP_basicMoney = new UIElement("//*[@placeholder='请填写基础单价']");
    private UIElement BTN_clickHireDetail = new UIElement("//span[text()='点击生成租金明细']/parent::button");
    private UIElement BTN_saveHireContract = new UIElement("//span[text()='保存 & 发起审批']/parent::button");
    private UIElement BTN_sureChooseChecker = new UIElement("//span[text()='确认']/parent::div");
    private UIElement BTN_seeCheck = new UIElement("//span[text()='查看审核']/parent::button");
    private UIElement BTN_CheckedPassed = new UIElement("//span[text()='审核通过']/parent::button");
    private UIElement TXT_CheckedPassed = new UIElement("//div[text()='审核通过']");
    private UIElement BTN_completeReason = new UIElement("//span[text()='确 定']/parent::button");
    private UIElement BTN_sure = new UIElement("//button[text()='确认']");
    private UIElement BTN_workFlow = new UIElement("//a[text()='工作流']");
    private UIElement BTN_MyStart = new UIElement("//span[text()='我发起的']");
    private UIElement BTN_firstAbstr = new UIElement(
            "//ul[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]/ol/li[4]/div");
    private UIElement BTN_firstStatued = new UIElement(
            "//ul[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]/ol/li[6]/div/div/div[1]");
    private UIElement BTN_waitingMyCheck = new UIElement("//span[text()='待我审批']");
    private UIElement BTN_beenChecked = new UIElement("//span[text()='我已审批']");
    private UIElement BTN_seeContractDetail = new UIElement("//span[text()='详情']/parent::button");
    private UIElement BTN_saveAndSuppotCheck = new UIElement("//*[text()='保存 & 发起审批']/parent::button");
    private UIElement TXT_contractStatus = new UIElement("//div[@class='label___1oQLZ']/div");
    private UIElement BTN_nextHired = new UIElement("//span[text()='续 签']/parent::button");
    private UIElement BTN_closeAproval = new UIElement("//span[text()='关闭申请']/parent::button");
    private UIElement BTN_reApply = new UIElement("//span[text()='再次申请']/parent::button");
    private UIElement TXT_noChecker = new UIElement("//div[text()='请至少选择一个审批人']");
    private UIElement BTN_ownerSetting = new UIElement("//*[@id='headDownLoadCenter']/following-sibling::*");
    private UIElement BTN_innerManage = new UIElement("//*[text()='内部管理']");
    private UIElement BTN_approvalFlow = new UIElement("//li[@class='ant-menu-item']/a");
    private UIElement BTN_chooseBuilding = new UIElement("//i[@class='anticon anticon-down dropDownArrow___1iuFR false']");
    private UIElement BTN_deleteChecker = new UIElement("//i[@class='deleteIcon___3ifyL creamsicon']/parent::button");
    private UIElement BTN_backToMain = new UIElement("//ul[@class='navRight___2gSyl']/li[2]");
    private UIElement BTN_endHire = new UIElement("//span[text()='退 租']/parent::button");
    private UIElement INP_enterRemark = new UIElement("//*[@placeholder='请输入备注信息']");
    private UIElement BTN_saveAndSubmit = new UIElement("//span[text()='保存&提交']/parent::button");
    private UIElement BTN_deleteHireContract = new UIElement("//span[text()='作 废']/parent::button");
    private UIElement INP_reasonForDelete = new UIElement("//*[@placeholder='请填写作废原因']");
    private UIElement BTN_randomChooseSetWay = new UIElement("//span[text()='关闭所有未收款账单']/preceding-sibling::span");
    private UIElement BTN_save = new UIElement("//span[text()='保 存']/parent::button");
    private UIElement TXT_contractDelete = new UIElement("//span[text()='关联合同已作废或已删除！']");
    private UIElement INP_reasonForPass = new UIElement("//*[@placeholder='请输入原因备注']");
    private UIElement BTN_cleanChoose = new UIElement("//*[text()='清除选项']");
    private UIElement BTN_OK = new UIElement("//span[text()='确 定']/parent::button");


    public UIElement chooseOnlyBuilding(String FloorNameOnly) {
        return new UIElement("//div[text()='" + FloorNameOnly + "']/parent::div");
    }

    public UIElement chooseFloor(String FloorName) {
        return new UIElement("//div[text()='" + FloorName + "']/parent::div/parent::div");
    }

    public UIElement chooseMyHouse(String roomName) {
        return new UIElement("//span[text()='" + roomName + "']/parent::div/parent::div/parent::div/parent::div");
    }

    public UIElement TXT_tenantNameFromQiChaCha(String customername) {
        return new UIElement("xpath=//li[text()='" + customername + "']");

    }

    public UIElement setChecker(String checkpeople) {
        return new UIElement("//*[@class='RightListBlock___34gPb' and text()='" + checkpeople + "']");
    }

    public UIElement checkIngAndContractAbstract(String contractAbstract) {
        return new UIElement("//div[text()=' " + contractAbstract
                + " ']/parent::li/following-sibling::li/div/div/div[text()='审批中']");

    }

    public UIElement waitingMyCheck(String contractAbstract) {
        return new UIElement("//div[text()='" + contractAbstract + "']");

    }

    public UIElement chooseDeleteChecker(String checkpeople) {
        return new UIElement("//div[text()='" + checkpeople + "']");
    }

    // 新建租赁合同

    public void newHireContract(String FloorName, String roomName, String customername) {
        this.driver.waitClickable(this.chooseFloor(FloorName), 10);
        this.driver.sleep(1000);
        this.driver.click(this.chooseFloor(FloorName));
        this.driver.sleep(4000);
        this.driver.waitClickable(this.chooseMyHouse(roomName), 5);
        this.driver.click(this.chooseMyHouse(roomName));
        this.driver.sleep(1000);
        this.driver.click(BTN_addHireContract);
        this.driver.sleep(1000);
        this.driver.elementClearText(INP_hireCustName);
        this.driver.elementSendText(INP_hireCustName, customername);
        this.driver.waitClickable(TXT_tenantNameFromQiChaCha(customername), 10);
        this.driver.sleep(1000);
        this.driver.click(TXT_tenantNameFromQiChaCha(customername));
        this.driver.sleep(2000);
        this.driver.click(BTN_hireNextStep);
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_keepMoney, "12");
        this.driver.elementSendText(INP_basicMoney, "12");
        this.driver.click(BTN_clickHireDetail);
        this.driver.sleep(1000);
        this.driver.click(BTN_saveAndSuppotCheck);
        this.driver.sleep(2000);

    }

    // 选中单一楼宇

    public void chooseMyOnlyBuilding(String FloorNameOnly) {
        this.driver.waitClickable(this.chooseOnlyBuilding(FloorNameOnly), 5);
        this.driver.sleep(1000);
        this.driver.click(this.chooseOnlyBuilding(FloorNameOnly));
        this.driver.sleep(2000);

    }

    // 设置临时审批人

    public void setCheckPeople(String checkpeople) {
        this.driver.sleep(2000);
        this.driver.click(this.setChecker(checkpeople));
        this.driver.sleep(2000);
        this.driver.click(BTN_sureChooseChecker);
        this.driver.sleep(2000);
    }

    // 进入待我审核界面检查有没有这条审核信息
    public String enterWaitingCheck() {
        this.driver.refresh();
        this.driver.sleep(1000);
        this.driver.click(BTN_workFlow);
        this.driver.sleep(2000);
        this.driver.click(BTN_waitingMyCheck);
        this.driver.sleep(2000);
        return this.driver.elementGetText(BTN_firstAbstr);

    }

    // 从待我审核界面选择该待审核的审核界面
    public void enterCheckDetail() {
        this.driver.sleep(1000);
        this.driver.waitClickable(BTN_firstAbstr, 5);
        this.driver.click(BTN_firstAbstr);
        this.driver.sleep(2000);
    }

    // 通过审核

    public void passCheck() {
        this.driver.sleep(2000);
        this.driver.click(BTN_CheckedPassed);
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_reasonForPass, "noreason");
        this.driver.sleep(1000);
        this.driver.click(BTN_completeReason);
        this.driver.sleep(1000);
        this.driver.click(BTN_sure);
        this.driver.sleep(2000);
    }

    // 进入我发起的页面并且看我发起的合同是否进入我发起的审批界面
    public boolean findclean() {
        return this.driver.waitForElement(BTN_cleanChoose, 5);
    }

    public String enterIStarted(String contractAbstract) {
        this.driver.refresh();
        this.driver.sleep(2000);
        this.driver.waitClickable(BTN_workFlow, 3);
        this.driver.click(BTN_workFlow);
        this.driver.waitClickable(BTN_MyStart, 3);
        this.driver.click(BTN_MyStart);
        this.driver.sleep(2000);
        if (findclean()) {
            this.driver.sleep(1000);
            this.driver.click(BTN_cleanChoose);
        } else {

        }
        this.driver.sleep(2000);
         return driver.elementGetText(BTN_firstAbstr);
    }



    // 查看待我审批的新建合同存在并点击

    public void enterWaitingMyCheck(String contractAbstract) {
        this.driver.refresh();
        this.driver.sleep(2000);
        this.driver.click(BTN_workFlow);
        this.driver.sleep(2000);
        this.driver.waitAndClick(BTN_waitingMyCheck, 5);
        this.driver.sleep(2000);
        this.driver.click(this.waitingMyCheck(contractAbstract));
        this.driver.sleep(2000);
    }

    // 审核成功,待我审批中该申请消失
    public String checkSuccess() {
        return this.driver.elementGetText(BTN_firstAbstr);

    }

    // 进入我已审批看是否审批完结
    public String checkOver() {
        this.driver.sleep(2000);
        this.driver.click(BTN_beenChecked);
        this.driver.sleep(2000);
        return this.driver.elementGetText(BTN_firstAbstr);
    }

    public String seeStatus() {
        return this.driver.elementGetText(BTN_firstStatued);
    }

    // 查看合同详情是否正常执行
    public String checkNormalExe() {
        this.driver.sleep(2000);
        this.driver.click(BTN_firstAbstr);
        this.driver.sleep(2000);
        this.driver.click(BTN_seeContractDetail);
        this.driver.sleep(2000);
        return this.driver.elementGetText(TXT_contractStatus);

    }

    // 默认审批人通过审核
    public void checkerPassCheck() {
        this.driver.waitClickable(BTN_CheckedPassed, 5);
        this.driver.sleep(2000);
        this.driver.click(BTN_CheckedPassed);
        this.driver.sleep(2000);
        this.driver.elementSendText(INP_reasonForPass, "noreason");
        this.driver.sleep(2000);
        this.driver.click(BTN_completeReason);
        this.driver.sleep(1000);
        this.driver.click(BTN_sure);
        this.driver.sleep(2000);
    }

    // 进入合同详情进行续签
    public void nextHired(String customernameNext) {
        this.driver.click(BTN_firstAbstr);
        this.driver.sleep(1000);
        this.driver.waitClickable(BTN_seeContractDetail, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_seeContractDetail);
        this.driver.sleep(2000);
        this.driver.click(BTN_nextHired);
        this.driver.sleep(2000);
        this.driver.elementClearText(INP_hireCustName);
        this.driver.elementSendText(INP_hireCustName, customernameNext);
        this.driver.waitClickable(TXT_tenantNameFromQiChaCha(customernameNext), 10);
        this.driver.sleep(1000);
        this.driver.click(TXT_tenantNameFromQiChaCha(customernameNext));
        this.driver.sleep(2000);
        this.driver.click(BTN_hireNextStep);
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_keepMoney, "1");
        this.driver.elementSendText(INP_basicMoney, "1");
        this.driver.click(BTN_clickHireDetail);
        this.driver.sleep(1000);
        this.driver.click(BTN_saveAndSuppotCheck);
        this.driver.sleep(2000);
        this.driver.click(BTN_OK);
        this.driver.sleep(1000);
    }

    // 进入我发起的页面查看是否有该合同
    public String IStarthave() {
        this.driver.sleep(2000);
        this.driver.click(BTN_MyStart);
        this.driver.sleep(2000);
        return this.driver.elementGetText(BTN_firstAbstr);
    }

    // 关闭申请
    public void closeAproval() {
        this.driver.sleep(2000);
        this.driver.click(BTN_firstAbstr);
        this.driver.waitClickable(BTN_closeAproval, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_closeAproval);
        this.driver.sleep(2000);
        this.driver.click(BTN_sure);
        this.driver.sleep(2000);
        this.driver.click(BTN_sure);
        this.driver.sleep(1000);
    }

    // 点击再次申请发起审核
    public void reApply() {
        this.driver.sleep(1000);
        this.driver.click(BTN_firstAbstr);
        this.driver.waitClickable(BTN_reApply, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_reApply);
        this.driver.waitClickable(BTN_seeCheck, 5);
        this.driver.click(BTN_seeCheck);
        this.driver.sleep(2000);
        this.driver.click(BTN_reApply);
        this.driver.sleep(2000);

    }
    // 设置默认审批人

    public UIElement chooseKindOfAprroval(String contractApprovalKinds) {
        return new UIElement("//div[text()='" + contractApprovalKinds + "']/div/button");

    }

    public UIElement buildingName(String buildingName) {
        return new UIElement("//div[@class='dropDownBlock___1YymU' and text()='" + buildingName + "']");

    }

    public boolean NoChecker() {
        return this.driver.waitForElement(TXT_noChecker, 5);

    }

    public void setDefaultChecker(String contractApprovalKinds, String buildingName, String checkpeople) {
        this.driver.waitForElement(BTN_ownerSetting, 5);
        this.driver.mouseOver(BTN_ownerSetting);
        this.driver.waitClickable(BTN_innerManage, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_innerManage);
        this.driver.waitClickable(BTN_approvalFlow, 5);
        this.driver.click(BTN_approvalFlow);
        this.driver.waitClickable(this.chooseKindOfAprroval(contractApprovalKinds), 5);
        this.driver.click(this.chooseKindOfAprroval(contractApprovalKinds));
        this.driver.waitClickable(BTN_chooseBuilding, 5);
        this.driver.click(BTN_chooseBuilding);
        this.driver.waitClickable(this.buildingName(buildingName), 5);
        this.driver.click(this.buildingName(buildingName));
        if (this.NoChecker()) {

            this.driver.sleep(2000);
            this.driver.click(this.setChecker(checkpeople));
            this.driver.sleep(2000);
            this.driver.click(BTN_sureChooseChecker);
            this.driver.sleep(2000);

        } else {
            this.driver.mouseOver(this.chooseDeleteChecker(checkpeople));
            this.driver.waitClickable(BTN_deleteChecker, 5);
            this.driver.click(BTN_deleteChecker);
            this.driver.waitClickable(this.setChecker(checkpeople), 5);
            this.driver.click(this.setChecker(checkpeople));
            this.driver.waitClickable(BTN_sureChooseChecker, 5);
            this.driver.click(BTN_sureChooseChecker);
        }
        this.driver.refresh();
        this.driver.waitClickable(BTN_backToMain, 5);
        this.driver.click(BTN_backToMain);
        this.driver.refresh();
    }

    // 进入合同详情进行退租

    public UIElement endHireReason(String endReason) {
        return new UIElement("//span[text()='" + endReason + "']/parent::label/span[1]");
    }

    public void endHired(String endReason) {
        this.driver.click(BTN_firstAbstr);
        this.driver.sleep(1000);
        this.driver.waitClickable(BTN_seeContractDetail, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_seeContractDetail);
        this.driver.sleep(2000);
        this.driver.click(BTN_endHire);
        this.driver.sleep(2000);
        this.driver.click(this.endHireReason(endReason));
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_enterRemark, "想退租就是这么任性");
        this.driver.sleep(1000);
        this.driver.click(BTN_saveAndSubmit);
        this.driver.sleep(2000);
        this.driver.click(BTN_sure);
        this.driver.sleep(2000);

    }

    // 进入合同详情作废租赁合同

    public void ruinHireContract() {
        this.driver.sleep(2000);
        this.driver.click(BTN_firstAbstr);
        this.driver.sleep(2000);
        this.driver.click(BTN_seeContractDetail);
        this.driver.sleep(2000);
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

    }

    // 合同作废成功
    public boolean ruinCompelete() {
        this.driver.sleep(2000);
        this.driver.click(BTN_firstAbstr);
        this.driver.sleep(2000);
        this.driver.click(BTN_seeContractDetail);
        this.driver.sleep(2000);
        return this.driver.waitForElement(TXT_contractDelete, 5);

    }

}
