package com.souban.bdd.flows.BOS;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.BOS.BosAccountManagementPage;

public class BosAccountManagementFlow {
	private BosAccountManagementPage bosAccountManagementPage = null;

	public BosAccountManagementFlow(final Driver driver) {
		this.bosAccountManagementPage = PageFactory.getPage(BosAccountManagementPage.class, driver);
	}

	public void loginBos(String url, String username, String password) {
		this.bosAccountManagementPage.loginBos(url, username, password);
	}

	public void checkDeapartmentAndDeleteDeapartment(String department) {
		this.bosAccountManagementPage.checkDeapartmentAndDeleteDeapartment(department);

	}

	public void checkAnddeleteMember(String department, String name) {
		this.bosAccountManagementPage.checkAnddeleteMember(department, name);
	}

	public void chooseAccountManagement() {
		this.bosAccountManagementPage.chooseAccountManagement();
	}

	public void gotoFatherDepartment() {
		this.bosAccountManagementPage.gotoFatherDepartment();
	}

	public void checkFatherDepartmentName(String department) {
		Assert.assertThat(this.bosAccountManagementPage.getFatherDepartmentName(), containsString(department));
	}

	public void addHeadquarters(String departmentName) {
		this.bosAccountManagementPage.addHeadquarters(departmentName);
	}

	public void addtDepartment(String departmentName) {
		this.bosAccountManagementPage.addDepartment(departmentName);
	}

	public void checkDepartmentExist() {
		Assert.assertThat(this.bosAccountManagementPage.getAlertText(), is("部门已存在"));
	}

	public void checkDepartmentRepeat() {
		Assert.assertThat(this.bosAccountManagementPage.getAlertText(), is("部门名称重复"));
	}

	public void modifyDepartmentName(String departmentName, String newDepartment) {
		this.bosAccountManagementPage.modifyDepartmentName(departmentName, newDepartment);
	}

	public void checkDepartment(String departmentName) {
		Assert.assertThat(this.bosAccountManagementPage.checkDepartment(departmentName), is(true));
	}

	public void deleteDeapartment(String departmentName) {
		this.bosAccountManagementPage.deleteDeapartment(departmentName);
	}

	public void addMember(String department, String name, String mail, String phone) {
		this.bosAccountManagementPage.addMember(department, name, mail, phone);
	}

	public void checkMember(String member) {
		Assert.assertThat(this.bosAccountManagementPage.checkMember(member), is(true));
	}

	public void deleteMember(String department, String name) {
		this.bosAccountManagementPage.deleteMember(department, name);
	}

	public void checkMailRepeat() {
		Assert.assertThat(this.bosAccountManagementPage.getAlertText(), is("已存在相同邮箱"));
	}

	public void checkDepartmentHasMember() {
		Assert.assertThat(this.bosAccountManagementPage.getAlertText(), is("部门下存在业务员或有下级部门"));
	}

	public void modifyMemberName(String department, String name, String newName) {
		this.bosAccountManagementPage.modifyMemberName(department, name, newName);
	}

	public void modifyPasswd(String oldPasswd, String newPasswd) {
		this.bosAccountManagementPage.modifyPasswd(oldPasswd, newPasswd);
	}

	public void logOut() {
		this.bosAccountManagementPage.logOut();
	}

	public void modifyMemberPhone(String department, String name, String phone, String newPhone) {
		this.bosAccountManagementPage.modifyMemberPhone(department, name, phone, newPhone);
	}

}
