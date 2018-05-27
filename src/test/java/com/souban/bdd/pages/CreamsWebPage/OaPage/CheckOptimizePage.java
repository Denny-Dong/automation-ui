package com.souban.bdd.pages.CreamsWebPage.OaPage;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CheckOptimizePage extends ParentPage {

	public CheckOptimizePage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_seeCheck = new UIElement("//span[text()='查看审核']/parent::button");
	private UIElement BTN_closeSupport = new UIElement("//*[text()='关闭申请']");
	private UIElement BTN_workFlow = new UIElement("//*[text()='工作流']");
	private UIElement BTN_beenChecked = new UIElement("//*[text()='我已审批']");
	private UIElement BTN_CheckedAndPass = new UIElement("//*[text()='已通过']");
	private UIElement BTN_CheckedPassed = new UIElement("//span[text()='审核通过']/parent::button");
	private UIElement TXT_CheckedPassed = new UIElement("//div[text()='审核通过']");
	private UIElement BTN_addHireContract = new UIElement("//div[text()='租赁合同']/preceding-sibling::button");
	private UIElement INP_hireCustName = new UIElement("//div[text()='请填写姓名或公司']/following-sibling::ul/li/div/input");
	private UIElement BTN_hireNextStep = new UIElement("//span[text()='下一步']/parent::button");
	private UIElement INP_keepMoney = new UIElement("//*[@placeholder='请填写押金']");
	private UIElement INP_basicMoney = new UIElement("//*[@placeholder='请填写基础单价']");
	private UIElement BTN_clickHireDetail = new UIElement("//span[text()='点击生成租金明细']/parent::button");
	private UIElement BTN_saveAndSuppotCheck = new UIElement("//*[text()='保存 & 发起审批']/parent::button");
	private UIElement BTN_sure = new UIElement("//button[text()='确认']");
	private UIElement BTN_sureChooseChecker = new UIElement("//span[text()='确认']/parent::div");
	private UIElement BTN_suppotSucceed = new UIElement("//button[text()='确认']");
	private UIElement BTN_completeReason = new UIElement("//span[text()='确 定']/parent::button");
	private UIElement BTN_deleteHireContract = new UIElement("//span[text()='作 废']/parent::button");
	private UIElement INP_reasonForDelete = new UIElement("//*[@placeholder='请填写作废原因']");
	private UIElement BTN_randomChooseSetWay = new UIElement("//span[text()='关闭所有未收款账单']/preceding-sibling::span");
	private UIElement BTN_save = new UIElement("//span[text()='保 存']/parent::button");
	private UIElement BTN_checkTheReasonOfDelete = new UIElement("//span[text()='查看作废原因']/parent::button");
	private UIElement BTN_edit = new UIElement("//*[text()='编辑']");
	private UIElement BTN_CheckedFailed = new UIElement("//span[text()='审核不通过']/parent::button");
	private UIElement INP_reasonForFailPass = new UIElement("//*[@placeholder='请输入原因备注']");
	private UIElement BTN_seeCheckOut = new UIElement("//span[text()='退租协议']/parent::button");
	private UIElement BTN_saveAndSubmit = new UIElement("//span[text()='保存&提交']/parent::button");
	private UIElement BTN_waitingMycheck = new UIElement("//span[text()='待我审批']");
	private UIElement TXT_newCheck = new UIElement("//span[text()='新建审核']");
	private UIElement TXT_newCheckBarble = new UIElement("//h1[text()='新建审核']");

	public UIElement chooseHireMan(String customername) {
		return new UIElement("//div[text()='" + customername + "']/parent::div/parent::td");

	}

	// 点开租赁合同
	public void chooseHireContract(String customername) {
		this.driver.sleep(1000);
		this.driver.click(this.chooseHireMan(customername));
		this.driver.sleep(1000);

	}

	// 用户查看审核流程
	public boolean seeCheck() {
		this.driver.sleep(1000);
		this.driver.click(BTN_seeCheck);
		this.driver.sleep(3000);
		return this.canNotCloseSupport();

	}

	public boolean canNotCloseSupport() {
		return this.driver.waitForElement(BTN_closeSupport, 5);
	}

	// 进入工作流
	public void enterWorkFlow() {
		this.driver.sleep(1000);
		this.driver.click(BTN_workFlow);
		this.driver.sleep(2000);

	}

	// 查看我已审批
	public void seeBeenChecked() {
		this.driver.sleep(1000);
		this.driver.click(BTN_beenChecked);
		this.driver.sleep(2000);

	}

	// 进入我已审批，查看审核内容
	public boolean seeCheckedDetail() {
		this.driver.sleep(1000);
		this.driver.click(BTN_CheckedAndPass);
		this.driver.sleep(2000);
		return this.CheckPass();

	}

	public boolean CheckPass() {
		return this.driver.waitForElement(TXT_CheckedPassed, 5);
	}

	// 新建租赁合同
	public UIElement chooseFloor(String FloorName) {
		return new UIElement("//div[text()='" + FloorName + "']/parent::div/parent::div");
	}

	public UIElement chooseMyHouse(String roomName) {
		return new UIElement("//span[text()='" + roomName + "']/parent::div/parent::div/parent::div/parent::div/parent::div");
	}

	public void newHireContract(String FloorName, String roomName, String customername) {
		this.driver.waitClickable(this.chooseFloor(FloorName), 10);
		this.driver.sleep(1000);
		this.driver.click(this.chooseFloor(FloorName));
		this.driver.sleep(2000);
		this.driver.click(this.chooseMyHouse(roomName));
		this.driver.sleep(1000);
		this.driver.click(BTN_addHireContract);
		this.driver.sleep(1000);
		this.driver.elementClearText(INP_hireCustName);
		this.driver.elementSendText(INP_hireCustName, customername);
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

	// 设置审批人
	public UIElement setChecker(String checkpeople) {
		return new UIElement("//*[@class='RightListBlock___34gPb' and text()='" + checkpeople + "']");
	}

	public void setCheckPeople(String checkpeople) {
		this.driver.sleep(2000);
		this.driver.click(this.setChecker(checkpeople));
		this.driver.sleep(2000);
		this.driver.click(BTN_sureChooseChecker);
		this.driver.sleep(2000);
	}

	// 通过审核
	public void passCheck(String customername) {
		this.driver.click(this.chooseHireMan(customername));
		this.driver.sleep(1000);
		this.driver.click(BTN_seeCheck);
		this.driver.sleep(1000);
		this.driver.click(BTN_CheckedPassed);
		this.driver.sleep(1000);
		this.driver.click(BTN_completeReason);
		this.driver.sleep(1000);
		this.driver.click(BTN_sure);
		this.driver.sleep(2000);
	}

	// 作废租赁合同

	private UIElement chooseMyHouseHaveCustomerName(String customername) {
		return new UIElement("//span[text()='" + customername + "']/parent::div/parent::div/parent::div/parent::div");
	}

	public void ruinHireContract(String customername, String checkpeople) {
		this.driver.refresh();
		this.driver.sleep(2000);
		this.driver.click(this.chooseMyHouseHaveCustomerName(customername));
		this.driver.sleep(1000);
		this.driver.click(this.chooseHireMan(customername));
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
		this.driver.click(this.setChecker(checkpeople));
		this.driver.sleep(2000);
		this.driver.click(BTN_sureChooseChecker);
		this.driver.sleep(1000);
		this.driver.click(BTN_suppotSucceed);
		this.driver.sleep(2000);
		this.driver.click(BTN_seeCheck);
		this.driver.sleep(2000);
		this.driver.click(BTN_CheckedPassed);
		this.driver.sleep(1000);
		this.driver.click(BTN_completeReason);
		this.driver.sleep(1000);
		this.driver.click(BTN_sure);
		this.driver.sleep(2000);

	}

	// 选择楼宇进入剖面图的房间
	public UIElement choosesuozhouFloor(String FloorName) {
		return new UIElement("//div[text()='" + FloorName + "']/parent::div/parent::div");
	}

	public void enterRoom(String FloorName, String customername) {
		this.driver.waitClickable(this.choosesuozhouFloor(FloorName), 10);
		this.driver.sleep(1000);
		this.driver.click(this.choosesuozhouFloor(FloorName));
		this.driver.sleep(2000);
		this.driver.click(this.chooseMyHouseHaveCustomerName(customername));
		this.driver.sleep(1000);
		this.driver.click(this.chooseHireMan(customername));
		this.driver.sleep(1000);

	}

	// 编辑作废原因
	public void editReasonForDeleteChecked() {
		this.driver.sleep(2000);
		this.driver.click(BTN_checkTheReasonOfDelete);
		this.driver.sleep(3000);
		this.driver.click(BTN_edit);
		this.driver.sleep(1000);
		this.driver.click(BTN_save);
		this.driver.waitClickable(BTN_sure, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_sure);
		this.driver.sleep(1000);
	}

	// 返回上一步审核不通过
	public void makeTheCheckFail() {
		this.driver.sleep(1000);
		this.driver.click(BTN_seeCheck);
		this.driver.sleep(1000);
		this.driver.click(BTN_CheckedFailed);
		this.driver.elementSendText(INP_reasonForFailPass, "goaway");
		this.driver.sleep(1000);
		this.driver.click(BTN_completeReason);
		this.driver.sleep(1000);
		this.driver.click(BTN_sure);
		this.driver.sleep(1000);
	}

	// 编辑退租协议
	public void editReasonForcheckO() {
		this.driver.sleep(1000);
		this.driver.click(BTN_seeCheckOut);
		this.driver.sleep(1000);
		this.driver.click(BTN_edit);
		this.driver.sleep(1000);
		this.driver.click(BTN_saveAndSubmit);
		this.driver.waitClickable(BTN_sure, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_sure);
		this.driver.sleep(2000);
	}

	// 退租协议审核不通过
	public void CheckOutFail() {
		this.driver.sleep(1000);
		this.driver.click(BTN_seeCheck);
		this.driver.sleep(1000);
		this.driver.click(BTN_CheckedFailed);
		this.driver.elementSendText(INP_reasonForFailPass, "goaway");
		this.driver.sleep(1000);
		this.driver.click(BTN_completeReason);
		this.driver.sleep(1000);
		this.driver.click(BTN_sure);
		this.driver.sleep(1000);
	}

	// 查看待我审批
	public void waitingMycheck() {
		this.driver.sleep(1000);
		this.driver.click(BTN_waitingMycheck);
		this.driver.sleep(2000);
	}

	// 查看待我审批的弹框
	public boolean seeWaitingMyCheck() {
		this.driver.sleep(1000);
		this.driver.click(TXT_newCheck);
		this.driver.sleep(2000);
		return this.newCheck();

	}

	public boolean newCheck() {
		return this.driver.waitForElement(TXT_newCheckBarble, 5);
	}

}
