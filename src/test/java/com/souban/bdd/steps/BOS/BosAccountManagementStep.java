package com.souban.bdd.steps.BOS;

import java.util.List;
import java.util.Map;

import com.souban.bdd.framework.Config;
import com.souban.bdd.steps.BaseStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BosAccountManagementStep extends BaseStep {
	Config config = Config.getInstance();

	@Given("^登录后台$")
	public void 登录后台() throws Throwable {
		this.bosAccountManagementFlow.loginBos(config.get("login.web.address"), config.get("login.user.name"),
				config.get("login.user.password"));
	}

	@Then("^后台数据清理成员$")
	public void 后台数据清理成员(DataTable datamap) throws Throwable {
		List<Map<String, String>> testdata = datamap.asMaps(String.class, String.class);
		for (int i = 0; i < testdata.size(); i++) {
			this.bosAccountManagementFlow.checkAnddeleteMember(testdata.get(i).get("department"),
					testdata.get(i).get("member"));
		}
	}

	@Then("^后台数据清理部门$")
	public void 后台数据清理部门(DataTable datamap) throws Throwable {
		List<Map<String, String>> testdata = datamap.asMaps(String.class, String.class);
		for (int i = 0; i < testdata.size(); i++) {
			this.bosAccountManagementFlow.checkDeapartmentAndDeleteDeapartment(testdata.get(i).get("department"));
		}
	}

	@Given("^用户在账户管理$")
	public void 用户在账户管理() throws Throwable {
		this.bosAccountManagementFlow.chooseAccountManagement();
	}

	@Given("^进入总部门$")
	public void 进入总部门() throws Exception {
		this.bosAccountManagementFlow.gotoFatherDepartment();
	}

	@When("^进入添加子部门 \"([^\"]*)\"$")
	public void 进入添加子部门(String department) throws Throwable {

	}

	@Then("^跳转添加部门页面，上级部门为 \"([^\"]*)\"$")
	public void 跳转添加部门页面_上级部门为(String department) throws Throwable {
		this.bosAccountManagementFlow.checkFatherDepartmentName(department);
	}

	@Given("^添加总部门 \"([^\"]*)\"$")
	public void 添加总部门(String departmentName) throws Throwable {
		this.bosAccountManagementFlow.addHeadquarters(departmentName);
	}

	@When("^添加子部门 \"([^\"]*)\"$")
	public void 添加子部门(String departmentName) throws Throwable {
		this.bosAccountManagementFlow.addtDepartment(departmentName);
	}

	@Then("^提示部门已存在$")
	public void 提示部门已存在() throws Throwable {
		this.bosAccountManagementFlow.checkDepartmentExist();
	}

	@When("^修改部门 \"([^\"]*)\" 名字 \"([^\"]*)\"$")
	public void 修改部门_名字(String departmentName, String newDepartment) throws Throwable {
		this.bosAccountManagementFlow.modifyDepartmentName(departmentName, newDepartment);
	}

	@Then("^验证部门存在 \"([^\"]*)\"$")
	public void 验证部门存在(String departmentName) throws Throwable {
		this.bosAccountManagementFlow.checkDepartment(departmentName);
	}

	@Then("^删除部门 \"([^\"]*)\"$")
	public void 删除部门(String departmentName) throws Throwable {
		this.bosAccountManagementFlow.deleteDeapartment(departmentName);
	}

	@Then("^提示部门名称重复$")
	public void 提示部门名称重复() throws Throwable {
		this.bosAccountManagementFlow.checkDepartmentRepeat();
	}

	@When("^添加成员 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 添加成员(String department, String name, String mail, String phone) throws Throwable {
		this.bosAccountManagementFlow.addMember(department, name, mail, phone);
	}

	@Then("^验证成员存在 \"([^\"]*)\"$")
	public void 验证成员存在(String member) throws Throwable {
		this.bosAccountManagementFlow.checkMember(member);
	}

	@Given("^删除成员 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 删除成员(String department, String name) throws Throwable {
		this.bosAccountManagementFlow.deleteMember(department, name);
	}

	@Then("^提示已存在相同邮箱$")
	public void 提示已存在相同邮箱() throws Throwable {
		this.bosAccountManagementFlow.checkMailRepeat();
	}

	@Then("^提示部门下存在业务员或有下级部门$")
	public void 提示部门下存在业务员或有下级部门() throws Throwable {
		this.bosAccountManagementFlow.checkDepartmentHasMember();
	}

	@When("^修改成员姓名 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 修改成员姓名(String department, String name, String newName) throws Throwable {
		this.bosAccountManagementFlow.modifyMemberName(department, name, newName);
	}

	@And("^修改密码 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 修改密码(String oldPasswd, String newPasswd) throws Throwable {
		this.bosAccountManagementFlow.modifyPasswd(oldPasswd, newPasswd);
	}

	@And("^登出后台$")
	public void 登出后台() throws Throwable {
		this.bosAccountManagementFlow.logOut();
	}

	@Then("^用新密码登录后台 \"([^\"]*)\"$")
	public void 用新密码登录后台(String password) throws Throwable {
		this.bosAccountManagementFlow.loginBos(config.get("login.web.address"), config.get("login.user.name"),
				password);
	}

	@When("^修改成员电话 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 修改成员电话(String department, String name, String phone, String newPhone) throws Throwable {
		this.bosAccountManagementFlow.modifyMemberPhone(department, name, phone, newPhone);
	}

	@Then("^验证电话修改成功 \"([^\"]*)\"$")
	public void 验证电话修改成功(String phone) throws Throwable {
		this.bosAccountManagementFlow.checkMember(phone);
	}

}
