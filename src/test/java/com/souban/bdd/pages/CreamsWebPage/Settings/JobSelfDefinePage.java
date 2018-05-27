package com.souban.bdd.pages.CreamsWebPage.Settings;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class JobSelfDefinePage extends ParentPage {

	public JobSelfDefinePage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_yesDelete = new UIElement("//span[text()='是']/parent::button");
	private UIElement BTN_ownerSetting = new UIElement("//*[@id='headDownLoadCenter']/following-sibling::*");
	private UIElement BTN_selfDefine = new UIElement("//*[text()='自定义管理']");
	private UIElement BTN_jobDefine = new UIElement("//*[@id='自定义管理$Menu']/li[5]");
	private UIElement BTN_addNewJob = new UIElement("//h3[text()='行业管理']/following-sibling::*");
	private UIElement TXT_jobName = new UIElement("//*[@placeholder='请输入行业名称']");
	private UIElement BTN_save = new UIElement("//*[text()='保 存']/parent::button");
	private UIElement TXT_JobNameRepeat = new UIElement("//*[text()='行业名称重复']");
	private UIElement BTN_sure = new UIElement("//*[text()='确认']");
	private UIElement BTN_addHireContract = new UIElement("//div[text()='租赁合同']/preceding-sibling::button");
	private UIElement INP_hireMan = new UIElement("//*[@class='ant-select-search__field']");
	private UIElement INP_jobName = new UIElement("//*[@id='industryId']");
	private UIElement TXT_jobNotExist = new UIElement("//div[text()='行业不存在，请先在行业管理中添加']");
	private UIElement BTN_saveAndCheck = new UIElement("//span[text()='保存 & 发起审批']/parent::button");
	private UIElement BTN_nextStep = new UIElement("//span[text()='下一步']/parent::button");

	// 进入行业自定义界面
	public void enterSelfDefine() {
		this.driver.sleep(1000);
		this.driver.mouseOver(BTN_ownerSetting);
		this.driver.sleep(2000);
		this.driver.click(BTN_selfDefine);
		this.driver.sleep(1000);
		this.driver.click(BTN_selfDefine);
		this.driver.sleep(1000);
		this.driver.click(BTN_jobDefine);
		this.driver.sleep(2000);

	}

	// 新增行业
	public void addNewJob(String JobName) {
		this.driver.click(BTN_addNewJob);
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_jobName, JobName);
		this.driver.sleep(1000);
		this.driver.click(BTN_save);
		this.driver.sleep(2000);

	}

	private UIElement JobDelete(String JobName) {
		return new UIElement("//*[text()='" + JobName + "']/following-sibling::*");
	}

	// 删除新行业
	public void deleteJob(String JobName) {
		this.driver.click(this.JobDelete(JobName));
		this.driver.sleep(1000);
		this.driver.click(BTN_yesDelete);
		this.driver.sleep(2000);

	}

	public boolean JobRepeat() {
		return this.driver.waitForElement(TXT_JobNameRepeat, 5);
	}

	// 新增租赁合同时输入不存在的行业名称
	public void writeNotExistJob(String myCustomer, String NotExistJob) {
		this.driver.sleep(1000);
		this.driver.click(BTN_addHireContract);
		this.driver.sleep(2000);
		this.driver.sleep(3000);
		this.driver.elementClearText(INP_hireMan);
		this.driver.elementSendText(INP_hireMan, myCustomer);
		this.driver.sleep(4000);
		this.driver.elementSendText(INP_jobName, NotExistJob);
		this.driver.sleep(4000);

	}

	// 验证行业不存在提示
	public boolean jobNotExistReminder() {
		return this.driver.waitForElement(TXT_jobNotExist, 5);
	}

	// 验证不能进行下一步
	public boolean canNotNextStep() {
		this.driver.sleep(1000);
		this.driver.click(BTN_nextStep);
		this.driver.sleep(1000);
		return this.driver.waitForElement(BTN_saveAndCheck, 3);
	}
}
