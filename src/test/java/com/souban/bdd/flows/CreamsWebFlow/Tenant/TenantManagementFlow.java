package com.souban.bdd.flows.CreamsWebFlow.Tenant;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Tenant.TenantManagementPage;

public class TenantManagementFlow {
	private TenantManagementPage tenantmanagementpage = null;

	public TenantManagementFlow(Driver driver) {
		this.tenantmanagementpage = PageFactory.getPage(TenantManagementPage.class, driver);
	}

	public void enterTenantManagementPage() {
		this.tenantmanagementpage.enterTenantManagementPage();
	}

	public void clickButtonOfCreateNewTenant() {
		this.tenantmanagementpage.clickButtonOfCreateNewTenant();
	}

	public void inputTenantNameInNewPage(String tenant, String tenantName) {
		this.tenantmanagementpage.inputTenantNameInNewPage(tenant, tenantName);
	}

	public void saveTenant() {
		this.tenantmanagementpage.saveTenant();
	}

	public void clearTenantFilter() {
		this.tenantmanagementpage.clearTenantFilter();
	}

	public void checkTenantCreateSuccessful(String tenantName) {
		Assert.assertThat(this.tenantmanagementpage.checkTenantCreateSuccessful(tenantName), Is.is(true));
	}

	public void clickTenantDetil(String tenantName) {
		this.tenantmanagementpage.clickTenantDetil(tenantName);
	}

	public void deleteTenant() {
		this.tenantmanagementpage.deleteTenant();
	}

	public void sureDeleteTenant() {
		this.tenantmanagementpage.sureDeleteTenant();
	}

	public void chooseTenantLabel(String label) {
		this.tenantmanagementpage.chooseTenantLabel(label);
	}

	public void checkLabelInTenant(String label) {
		Assert.assertThat(this.tenantmanagementpage.checkLabelInTenant(label), Is.is(true));
	}

	public void chooseOneBuilding(String building) {
		this.tenantmanagementpage.chooseOneBuilding(building);
	}

	public void checkBuildingNameOnTenantList(String building) {
		List<String> buildingname = new ArrayList<String>();

		buildingname = this.tenantmanagementpage.tenantBuildingNameList();
		for (String str : buildingname) {
			Assert.assertThat(str, Is.is(building));
		}
	}

	public void checkTenantDetilInformation() {
		Assert.assertThat(this.tenantmanagementpage.checkTenantDetilInformation(), Is.is(true));
	}

	public void clickNewRentContract() {
		this.tenantmanagementpage.clickNewRentContract();
	}

	public void chooseOneRoomOnRentContract(String building) {
		this.tenantmanagementpage.chooseOneRoomOnRentContract(building);
	}

	public void clickNextStep() {
		this.tenantmanagementpage.clickNextStep();
	}

	public void inputDepositAndPrice(String deposit, String price) {
		this.tenantmanagementpage.inputDepositAndPrice(deposit, price);
	}

	public void submitApprovalAboutRentContract() {
		this.tenantmanagementpage.submitApprovalAboutRentContract();
	}

	// 创建新物业合同
	public void clickNewPropertyContract() {
		this.tenantmanagementpage.clickNewPropertyContract();
	}

	public void inputDepositAndCreatePropertyDetil(String deposit, String payType, String advancePayDate,
												   String price) {
		this.tenantmanagementpage.inputDepositAndCreatePropertyDetil(deposit, payType, advancePayDate, price);
	}

	public void inputDepositAndCreateProperty(String deposit) {
		this.tenantmanagementpage.inputDepositAndCreateProperty(deposit);
	}

	// 查看工商信息
	public void clickViewBusinessInformation() {
		this.tenantmanagementpage.clickViewBusinessInformation();
	}

	// 编辑租客成功
	public void alertEditTenantSuccess() {
		this.tenantmanagementpage.alertEditTenantSuccess();
	}

	// 编辑租客
	public void clickEditTenant() {
		this.tenantmanagementpage.clickEditTenant();
	}

	// 保存&发起审核
	public void submitApproval() {
		this.tenantmanagementpage.submitaApproval();
	}

	// 选择审批人
	public void chooseApprovaler(String approvaler) {
		this.tenantmanagementpage.chooseApprovaler(approvaler);
	}

	// 删除审批人
	public void deleteApprovaler(String approvaler) {
		this.tenantmanagementpage.deleteApprovaler(approvaler);
	}

	// 提交
	public void clickSubmit() {
		this.tenantmanagementpage.clickSubmit();
	}

	// 成功信息
	public void alertMessageSuccess(String message) {
		this.tenantmanagementpage.alertMessageSuccess(message);
	}

	// 提示加确认
	public void alertMessageFail(String message) {
		this.tenantmanagementpage.alertMessageFail(message);
	}
	//检查成立日期时间格式正确
	public void  checkApprovalDate(){
		this.tenantmanagementpage.checkApprovalDate();
	}
}
