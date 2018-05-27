package com.souban.bdd.steps.BOS;

import com.souban.bdd.framework.Config;
import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BosCusomerManagementStep extends BaseStep {
	Config config = Config.getInstance();

	@Given("^用户在正式客户列表页面$")
	public void 用户在正式客户列表页面() throws Throwable {
		this.bosCustomerManagementFlow.gotoCustomerList();
	}

	@When("^按最大可管理面积降序排序$")
	public void 按最大可管理面积降序排序() throws Throwable {
		this.bosCustomerManagementFlow.areaDescending();
	}

	@Then("^列表按最大可管理面积降序排序$")
	public void 列表按最大可管理面积降序排序() throws Throwable {
		this.bosCustomerManagementFlow.checkDescendingArea();
	}

	@Given("^用户在楼宇列表页面$")
	public void 用户在楼宇列表页面() throws Throwable {
		this.bosCustomerManagementFlow.gotoBuildingList();
	}

	@When("^按房源面积降序排序$")
	public void 按房源面积降序排序() throws Throwable {
		this.bosCustomerManagementFlow.houseAreaDescending();
	}

	@Then("^列表按房源面积降序排序$")
	public void 列表按房源面积降序排序() throws Throwable {
		this.bosCustomerManagementFlow.checkDescendingHouseArea();
	}

	@Given("^筛选跟进人 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 筛选跟进人(String city, String follow) throws Throwable {
		this.bosCustomerManagementFlow.filterFollow(city, follow);
	}

	@Then("^列表仅展示跟进人匹配的正式客户 \"([^\"]*)\"$")
	public void 列表仅展示跟进人匹配的正式客户(String follow) throws Throwable {
		this.bosCustomerManagementFlow.checkFollow(follow);
	}

	@Given("^筛选客户性质 \"([^\"]*)\"$")
	public void 筛选客户性质(String customerNature) throws Throwable {
		this.bosCustomerManagementFlow.filterCustomerNature(customerNature);
	}

	@Then("^列表仅展示客户性质匹配的正式客户 \"([^\"]*)\"$")
	public void 列表仅展示客户性质匹配的正式客户(String customerNature) throws Throwable {
		this.bosCustomerManagementFlow.checkCustomerNature(customerNature);
	}

	@Given("^筛选本月至少登录次数 \"([^\"]*)\"$")
	public void 筛选本月至少登录次数(String monthLogin) throws Throwable {
		this.bosCustomerManagementFlow.filterMonthLogin(monthLogin);
	}

	@Then("^列表仅展示本月至少登录匹配的正式客户 \"([^\"]*)\"$")
	public void 列表仅展示本月至少登录匹配的正式客户(String monthLgoin) throws Throwable {
		this.bosCustomerManagementFlow.checkMongthLogin(monthLgoin);
	}

	@Given("^筛选省份 \"([^\"]*)\"$")
	public void 筛选省份(String province) throws Throwable {
		this.bosCustomerManagementFlow.filterProvince(province);
	}

	@Then("^列表仅展示省份匹配的正式客户 \"([^\"]*)\"$")
	public void 列表仅展示省份匹配的正式客户(String province) throws Throwable {
		this.bosCustomerManagementFlow.checkProvince(province);
	}

	@Given("^筛选城市 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 筛选城市(String province, String city) throws Throwable {
		this.bosCustomerManagementFlow.filterCity(province, city);
	}

	@Then("^列表仅展示城市匹配的正式客户  \"([^\"]*)\"$")
	public void 列表仅展示城市匹配的正式客户(String city) throws Throwable {
		this.bosCustomerManagementFlow.checkcity(city);
	}

	@Given("^搜索客户名称 \"([^\"]*)\"$")
	public void 搜索客户名称(String name) throws Throwable {
		this.bosCustomerManagementFlow.searchCustomer(name);
	}

	@Then("^列表仅展示客户名称匹配的正式客户  \"([^\"]*)\"$")
	public void 列表仅展示客户名称匹配的正式客户(String name) throws Throwable {
		this.bosCustomerManagementFlow.checkCustomerName(name);
	}

	@Given("^筛选注册时间 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 筛选注册时间(String startDate, String endDate) throws Throwable {
		this.bosCustomerManagementFlow.filterDate(startDate, endDate);
	}

	@Given("^筛选注册时间结束时间大于开始时间 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 筛选注册时间结束时间大于开始时间(String startDate, String endDate) throws Throwable {
		this.bosCustomerManagementFlow.filterDateBigEndDate(startDate, endDate);
	}

	@Then("^列表仅展示时间段内的正式客户  \"([^\"]*)\" \"([^\"]*)\"$")
	public void 列表仅展示时间段内的正式客户(String startDate, String endDate) throws Throwable {
		this.bosCustomerManagementFlow.checkRegistTime(startDate, endDate);
	}

	@Given("^筛选资产类型 \"([^\"]*)\"$")
	public void 筛选资产类型(String assertType) throws Throwable {
		this.bosCustomerManagementFlow.filterAssertType(assertType);
	}

	@Then("^列表仅展示资产类型匹配的楼宇 \"([^\"]*)\"$")
	public void 列表仅展示资产类型匹配的楼宇(String assertType) throws Throwable {
		this.bosCustomerManagementFlow.checkAssertType(assertType);
	}

	@Given("^筛选楼宇类型 \"([^\"]*)\"$")
	public void 筛选楼宇类型(String buildingType) throws Throwable {
		this.bosCustomerManagementFlow.filterBuildingType(buildingType);
	}

	@Then("^列表仅展示楼宇类型匹配的楼宇 \"([^\"]*)\"$")
	public void 列表仅展示楼宇类型匹配的楼宇(String buildingType) throws Throwable {
		this.bosCustomerManagementFlow.checkBuildingType(buildingType);
	}

	@Given("^筛选面积 \"([^\"]*)\", \"([^\"]*)\"$")
	public void 筛选面积(String minArea, String maxArea) throws Throwable {
		this.bosCustomerManagementFlow.filterArea(minArea, maxArea);
	}

	@Then("^列表仅展示面积匹配的楼宇 \"([^\"]*)\", \"([^\"]*)\"$")
	public void 列表仅展示面积匹配的楼宇(String minArea, String maxArea) throws Throwable {
		this.bosCustomerManagementFlow.checkHouseArea(minArea, maxArea);
	}

	@Then("^列表仅展示省份匹配的楼宇 \"([^\"]*)\"$")
	public void 列表仅展示省份匹配的楼宇(String province) throws Throwable {
		this.bosCustomerManagementFlow.checkBuildingProvince(province);
	}

	@Then("^列表仅展示城市匹配的楼宇  \"([^\"]*)\"$")
	public void 列表仅展示城市匹配的楼宇(String city) throws Throwable {
		this.bosCustomerManagementFlow.checkBuildingcity(city);
	}

	@Given("^搜索楼宇名称 \"([^\"]*)\"$")
	public void 搜索楼宇名称(String building) throws Throwable {
		this.bosCustomerManagementFlow.searchBuilding(building);
	}

	@Then("^列表展示楼宇名称和所属主体匹配的楼宇  \"([^\"]*)\"$")
	public void 列表展示楼宇名称和所属主体匹配的楼宇(String building) throws Throwable {
		this.bosCustomerManagementFlow.checkBuildingName(building);
	}

	@Given("^筛选起始时间 \"([^\"]*)\"$")
	public void 筛选起始时间(String startDate) throws Throwable {
		this.bosCustomerManagementFlow.filterStartDate(startDate);
	}

	@Then("^列表仅展示晚于起始时间的楼宇  \"([^\"]*)\"$")
	public void 列表仅展示晚于起始时间的楼宇(String startDate) throws Throwable {
		this.bosCustomerManagementFlow.checkStartRegistTime(startDate);
	}

	@Given("^筛选结束时间 \"([^\"]*)\"$")
	public void 筛选结束时间(String endDate) throws Throwable {
		this.bosCustomerManagementFlow.filterEndDate(endDate);
	}

	@Then("^列表仅展示早于起始时间的楼宇  \"([^\"]*)\"$")
	public void 列表仅展示早于起始时间的楼宇(String endDate) throws Throwable {
		this.bosCustomerManagementFlow.checkEndRegistTime(endDate);
	}

	@Then("^结束时间不能早于开始时间$")
	public void 结束时间不能早于开始时间() throws Throwable {
		this.bosCustomerManagementFlow.checkDate();
	}

	@When("^编辑联系人 \"([^\"]*)\"$")
	public void 编辑联系人(String contract) throws Throwable {
		this.bosCustomerManagementFlow.modifyContract(contract);
	}

	@Then("^展示操作记录 \"([^\"]*)\"$")
	public void 展示操作记录(String record) throws Throwable {
		this.bosCustomerManagementFlow.checkRecord(record);
	}

	@When("^在所属客户输入框输入内容 \"([^\"]*)\"$")
	public void 在所属客户输入框输入内容(String contenct) throws Throwable {
		this.bosCustomerManagementFlow.inputContractName(contenct);
	}

	@Then("^展示联想客户 \"([^\"]*)\"$")
	public void 展示联想客户(String contract) throws Throwable {
		this.bosCustomerManagementFlow.checkContract(contract);
	}

	@Given("^新建楼宇不填信息$")
	public void 新建楼宇不填信息() throws Throwable {
		this.bosCustomerManagementFlow.createBuildingNoneText();
	}

	@Given("^编辑楼宇清空一条信息保存$")
	public void 编辑楼宇清空一条信息保存() throws Throwable {
		this.bosCustomerManagementFlow.modifyBuildingNoneText();
	}

	@Then("^提示错误信息$")
	public void 提示错误信息() throws Throwable {
		this.bosCustomerManagementFlow.checkCreateBuilingNoText();
	}

	@Then("^楼宇列表展示是否禁用$")
	public void 楼宇列表展示是否禁用() throws Throwable {
		this.bosCustomerManagementFlow.checkEnableList();
	}

	@Given("^删除协助管理人$")
	public void 删除协助管理人() throws Throwable {
		this.bosCustomerManagementFlow.deleteAssistManagers();
	}

	@Then("^协助管理人被删除$")
	public void 协助管理人被删除() throws Throwable {
		this.bosCustomerManagementFlow.checkAssistMangers();
	}

	@When("^点击协助管理人右侧添加图标$")
	public void 点击协助管理人右侧添加图标() throws Throwable {
		this.bosCustomerManagementFlow.addAssistManagers();
	}

	@Then("^添加协助管理人下拉框，添加图标和删除图标$")
	public void 添加协助管理人下拉框_添加图标和删除图标() throws Throwable {
		this.bosCustomerManagementFlow.checkAddAssistMangers();
	}

	@Given("^筛选登录数时间段本月$")
	public void 筛选登录数时间段本月() throws Throwable {
		this.bosCustomerManagementFlow.chooseLoginTimesRange();
	}

	@Then("^筛选条件显示登录时间为本月$")
	public void 筛选条件显示登录时间为本月() throws Throwable {
		this.bosCustomerManagementFlow.checkLoginTimesRange();
	}

	@Then("^表头展示总楼宇数、总在租面积和总房源面积$")
	public void 表头展示总楼宇数_总在租面积和总房源面积() throws Throwable {
		this.bosCustomerManagementFlow.checkBuildingListHeader();
	}

	@When("^编辑楼宇名称 \"([^\"]*)\"$")
	public void 编辑楼宇名称(String buildingName) throws Throwable {
		this.bosCustomerManagementFlow.modifyBuilding(buildingName);
	}

	@Then("^楼宇详情展示房源数、录入合同数、在租面积、房源面积$")
	public void 楼宇详情展示房源数_录入合同数_在租面积_房源面积() throws Throwable {
		this.bosCustomerManagementFlow.checkBuildingDetailsHeader();
	}

	@When("^编辑合同编号$")
	public void 编辑合同编号() throws Exception {
		this.bosCustomerManagementFlow.modifyContractNo();
	}

	@Then("^保存成功$")
	public void 保存成功() throws Throwable {
		this.bosCustomerManagementFlow.checkContractNoSaved();
	}

	@Given("^用户进入报错反馈页面$")
	public void 用户进入报错反馈页面() throws Throwable {
		this.bosCustomerManagementFlow.gotoErrorList();
	}

	@When("^填写备注$")
	public void 填写备注() throws Throwable {
		this.bosCustomerManagementFlow.editRemarks();
	}

	@Then("^备注保存成功$")
	public void 备注保存成功() throws Throwable {
		this.bosCustomerManagementFlow.checkEditRemarksSuccess();
	}

}
