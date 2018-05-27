package com.souban.bdd.pages.BOS;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class BosAccountManagementPage extends ParentPage {

	public BosAccountManagementPage(Driver driver) {
		super(driver);
	}

	private UIElement INP_User = new UIElement("xpath=//*[@placeholder='账户']");
	private UIElement INP_PassWd = new UIElement("xpath=//*[@placeholder='密码']");
	private UIElement BTN_Login = new UIElement("xpath=//span[text()='登录']");
	private UIElement BTN_AccountManagement = new UIElement("xpath=//*[text()='账户管理']");
	private UIElement BTN_SunDepartment = new UIElement("xpath=//*[text()='添加子部门']");
	private UIElement BTN_AddMembers = new UIElement("xpath=//*[text()='添加人员']");
	private UIElement TXT_FatherDepartment = new UIElement("xpath=//*[@class='contentContainer___hBtBR']/div[1]/input");
	private UIElement BTN_AddDepartmentSave = new UIElement(
			"xpath=//*[text()='添加部门']/following-sibling::div[2]/button[2]");
	private UIElement BTN_AddDepartmentCancel = new UIElement(
			"xpath=//*[text()='添加部门']/following-sibling::div[2]/button[1]");
	private UIElement BTN_Confirm = new UIElement("xpath=//*[text()='确认']");
	private UIElement BTN_EditDepartment = new UIElement("xpath=//*[text()='部门编辑']");
	private UIElement INP_InputDepartmentName = new UIElement("xpath=//*[text()='部门名称']/following-sibling::input");
	private UIElement BTN_DeleteDepartment = new UIElement("xpath=//*[text()='彻底删除']");
	private UIElement BTN_ModifyDepartmentSave = new UIElement(
			"xpath=//*[text()='部门编辑']/following-sibling::div[2]/button[3]");
	private UIElement BTN_MemberInfoSave = new UIElement(
			"xpath=//*[text()='成员信息']/following-sibling::div/div/button[3]");
	private UIElement INP_Province = new UIElement("xpath=//*[text()='所在区域']/parent::div/div/div[1]");
	private UIElement INP_City = new UIElement("xpath=//*[text()='所在区域']/parent::div/div/div[2]");
	private UIElement BTN_ShanXi = new UIElement("xpath=//*[text()='山西省']");
	private UIElement BTN_DaTong = new UIElement("xpath=//div[text()='大同市']");
	private UIElement INP_Name = new UIElement("xpath=//*[text()='姓名']/parent::div/div/input");
	private UIElement INP_Mail = new UIElement("xpath=//*[text()='邮箱']/parent::div/div/input");
	private UIElement INP_Phone = new UIElement("xpath=//*[text()='电话']/parent::div/div/input");
	private UIElement INP_Character = new UIElement("xpath=//*[text()='角色']/parent::div/div/div");
	private UIElement BTN_OrdinaryMember = new UIElement("xpath=//*[text()='后台普通成员']");
	private UIElement BTN_CustomerManagement = new UIElement("xpath=//*[text()='客户管理']/parent::div/parent::div/input");
	private UIElement BTN_BuildingDic = new UIElement("xpath=//*[text()='楼盘字典']/parent::div/parent::div/input");
	private UIElement BTN_AddMemberSave = new UIElement(
			"xpath=//*[text()='成员信息']/following-sibling::div/div/button[2]");
	private UIElement BTN_AccountOperation = new UIElement(
			"xpath=//*[text()='新建客户']/ancestor::div[3]/following-sibling::div[3]/descendant::button");
	private UIElement BTN_ModifyPasswd = new UIElement("xpath=//*[text()='修改密码']");
	private UIElement BTN_LogOut = new UIElement("xpath=//*[text()='登出']");
	private UIElement INP_OldPasswd = new UIElement("xpath=//*[text()='原密码']/following-sibling::input");
	private UIElement INP_NewPasswd = new UIElement("xpath=//*[text()='新密码']/following-sibling::input");
	private UIElement BTN_ZidonghuaDepartment = new UIElement("xpath=//*[contains(@title, '自动化测试')]");
	private UIElement BTN_ZidonghuaDepartmentSpan = new UIElement(
			"xpath=//*[contains(@title, '自动化测试')]/preceding-sibling::span");

	private UIElement chooseDeapartment(String department) {
		// return new UIElement("xpath=//*[@title='" + department + "']");
		return new UIElement("xpath=//*[contains(@title, '" + department + "')]");
	}

	private UIElement member(String member) {
		return new UIElement("xpath=//*[text()='" + member + "']");
	}

	private UIElement modifyMember(String member) {
		return new UIElement("xpath=//*[text()='" + member + "']/following-sibling::td[5]/div");
	}

	public void openLoginPage(String url) {
		this.driver.get(url);
	}

	public void loginBos(String url, String username, String password) {
		this.openLoginPage(url);
		this.driver.elementSendText(INP_User, username);
		this.driver.elementSendText(INP_PassWd, password);
		this.driver.click(BTN_Login);
	}

	public void gotoFatherDepartment() {
		this.driver.sleep(1000);
		this.driver.click(BTN_ZidonghuaDepartmentSpan);
		this.driver.sleep(1000);
		this.driver.click(BTN_ZidonghuaDepartment);
	}

	public void chooseAccountManagement() {
		this.driver.waitClickable(BTN_AccountManagement, 3);
		this.driver.click(BTN_AccountManagement);
	}

	public void gotoAddSunDepartment() {
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_ZidonghuaDepartment, 5);
		this.driver.click(BTN_SunDepartment);
	}

	public String getFatherDepartmentName() {
		String department = this.driver.elementGetValue(TXT_FatherDepartment);
		this.driver.click(BTN_AddDepartmentCancel);
		return department;
	}

	public void addHeadquarters(String department) {
		this.driver.sleep(1000);
		this.driver.click(BTN_ZidonghuaDepartment);
		this.driver.sleep(1000);
		this.driver.click(BTN_ZidonghuaDepartmentSpan);
		this.driver.waitAndClick(BTN_SunDepartment, 5);
		this.driver.elementSendText(INP_InputDepartmentName, department);
		this.driver.sleep(1000);
		this.driver.click(BTN_AddDepartmentSave);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_Confirm, 5);
	}

	public void addDepartment(String department) {
		this.driver.sleep(1000);
		this.driver.click(BTN_SunDepartment);
		this.driver.elementSendText(INP_InputDepartmentName, department);
		this.driver.click(BTN_AddDepartmentSave);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);

	}

	public String getAlertText() {
		this.driver.sleep(1000);
		return this.driver.getAlertText();
	}

	public void modifyDepartmentName(String department, String newDepartment) {
		this.driver.sleep(1000);
		this.driver.waitAndClick(this.chooseDeapartment(department), 5);
		this.driver.click(BTN_EditDepartment);
		this.driver.waitForElement(INP_InputDepartmentName, 5);
		this.driver.elementClearText(INP_InputDepartmentName);
		this.driver.elementSendText(INP_InputDepartmentName, newDepartment);
		this.driver.waitAndClick(BTN_ModifyDepartmentSave, 5);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_Confirm, 5);
	}

	public boolean checkDepartment(String department) {
		this.driver.sleep(1000);
		return this.driver.isElementFound(this.chooseDeapartment(department));
	}

	public void checkDeapartmentAndDeleteDeapartment(String department) {
		this.driver.refresh();
		try {
			this.driver.click(BTN_ZidonghuaDepartmentSpan);
			this.driver.sleep(1000);
			this.driver.click(this.chooseDeapartment(department));
			this.driver.sleep(1000);
			this.driver.click(BTN_EditDepartment);
			this.driver.sleep(1000);
			this.driver.waitAndClick(BTN_DeleteDepartment, 5);
			this.driver.sleep(2000);
			this.driver.waitAndClick(BTN_Confirm, 5);
			this.driver.sleep(1000);
		} catch (Exception e) {
			return;
		}

	}

	public void deleteDeapartment(String department) {
		this.driver.refresh();
		this.gotoFatherDepartment();
		this.driver.sleep(1000);
		this.driver.click(this.chooseDeapartment(department));
		this.driver.sleep(1000);
		this.driver.click(BTN_EditDepartment);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_DeleteDepartment, 5);
		this.driver.sleep(2000);
		this.driver.waitAndClick(BTN_Confirm, 5);
		this.driver.sleep(1000);
	}

	public void addMember(String department, String name, String mail, String phone) {
		this.driver.refresh();
		this.driver.sleep(1000);
		this.gotoFatherDepartment();
		this.driver.click(this.chooseDeapartment(department));
		this.driver.sleep(1000);
		this.driver.click(BTN_AddMembers);
		this.driver.sleep(1000);
		this.driver.click(INP_Province);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_ShanXi, 5);
		this.driver.sleep(1000);
		this.driver.waitAndClick(INP_City, 5);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_DaTong, 5);
		this.driver.sleep(1000);
		this.driver.waitForElement(INP_Name, 5);
		this.driver.elementSendText(INP_Name, name);
		this.driver.elementSendText(INP_Mail, mail);
		this.driver.elementSendText(INP_Phone, phone);
		this.driver.click(INP_Character);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_OrdinaryMember, 5);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_CustomerManagement, 5);
		this.driver.click(BTN_BuildingDic);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_AddMemberSave, 5);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_Confirm, 5);
	}

	public boolean checkMember(String member) {
		this.driver.sleep(1000);
		return this.driver.isElementFound(this.member(member));
	}

	public void checkAnddeleteMember(String department, String name) {
		this.driver.refresh();
		try {
			this.driver.click(BTN_ZidonghuaDepartmentSpan);
			this.driver.sleep(1000);
			this.driver.click(this.chooseDeapartment(department));
			this.driver.sleep(1000);
			this.driver.click(this.modifyMember(name));
			this.driver.sleep(1000);
			this.driver.waitAndClick(BTN_DeleteDepartment, 5);
			this.driver.sleep(1000);
			this.driver.waitAndClick(BTN_Confirm, 5);
		} catch (Exception e) {
			return;
		}
	}

	public void deleteMember(String department, String name) {
		this.driver.refresh();
		this.gotoFatherDepartment();
		this.driver.click(this.chooseDeapartment(department));
		this.driver.click(this.modifyMember(name));
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_DeleteDepartment, 5);
		this.driver.waitAndClick(BTN_Confirm, 5);
	}

	public void modifyMemberName(String department, String name, String newName) {
		this.driver.sleep(1000);
		this.driver.refresh();
		this.gotoFatherDepartment();
		this.driver.click(this.chooseDeapartment(department));
		this.driver.click(this.modifyMember(name));
		this.driver.waitForElement(INP_Name, 5);
		this.driver.sleep(1000);
		this.driver.elementClearText(INP_Name);
		this.driver.elementSendText(INP_Name, newName);
		this.driver.click(BTN_MemberInfoSave);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_Confirm, 5);
	}

	public void modifyPasswd(String oldPasswd, String newPasswd) {
		this.driver.click(BTN_AccountOperation);
		this.driver.waitAndClick(BTN_ModifyPasswd, 5);
		this.driver.sleep(1000);
		this.driver.elementSendText(INP_OldPasswd, oldPasswd);
		this.driver.sleep(1000);
		this.driver.elementSendText(INP_NewPasswd, newPasswd);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
		this.driver.sleep(1000);
	}

	public void logOut() {
		this.driver.sleep(1000);
		this.driver.click(BTN_AccountOperation);
		this.driver.waitAndClick(BTN_LogOut, 5);
	}

	public void modifyMemberPhone(String department, String name, String phone, String newPhone) {
		this.driver.refresh();
		this.driver.sleep(1000);
		this.gotoFatherDepartment();
		this.driver.click(this.chooseDeapartment(department));
		this.driver.click(this.modifyMember(name));
		this.driver.waitForElement(INP_Phone, 5);
		this.driver.sleep(1000);
		this.driver.elementClearText(INP_Phone);
		this.driver.elementSendText(INP_Phone, newPhone);
		this.driver.click(BTN_MemberInfoSave);
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_Confirm, 5);
	}
}