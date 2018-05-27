package com.souban.bdd.flows.CreamsWebFlow.Authories;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Authories.AuthorityPage;

public class AuthorityFlow {
    private AuthorityPage authorityPage = null;

    public AuthorityFlow(final Driver driver) {
        this.authorityPage = PageFactory.getPage(AuthorityPage.class, driver);
    }

    public void enterInnerPage() {
        this.authorityPage.enterTnnerPage();

    }

    public void enterApprovalProcessPage() {
        this.authorityPage.enterApprovalProcessPage();

    }

    public void isAuthor() {
        Assert.assertThat(this.authorityPage.isAuthor(), is(true));

    }

    public void isNotAuthor() {
        Assert.assertThat(this.authorityPage.isAuthor(), is(false));

    }

    public void enterUserPermissions(String customerName) {
        this.authorityPage.enterUserPermissions(customerName);

    }


    public void enterTemplate() {
        this.authorityPage.enterTemplate();

    }

    public void enterPropertyTemplate() {
        this.authorityPage.enterPropertyTemplate();
    }

    public void unlookNewTemplate() {
        Assert.assertThat(this.authorityPage.unlookNewTemplate(), is(false));
    }

    public void lookNewTemplate() {
        Assert.assertThat(this.authorityPage.unlookNewTemplate(), is(true));
    }

    public void undeleteTemplate() {
        Assert.assertThat(this.authorityPage.undeleteTemplate(), is(true));
    }

    public void newContract() {
        this.authorityPage.newContract();

    }

    public void clickContracts() {
        Assert.assertThat(this.authorityPage.clickContracts(), is(true));

    }

    public void roomContracts() {
        Assert.assertThat(this.authorityPage.roomContracts(), is(true));

    }


    public void unCuatomerManage() {
        Assert.assertThat(this.authorityPage.unCuatomerManage(), is(true));

    }


    public void myChannelGary() {
        Assert.assertThat(this.authorityPage.myChannelGary(), is(true));

    }

    public void investmentAnalysisGary() {
        Assert.assertThat(this.authorityPage.investmentAnalysisGary(), is(true));

    }

    public void unMyChannel() {
        Assert.assertThat(this.authorityPage.unMyChannel(), is(true));

    }

    public void unInvestmentAnalysisGary() {
        Assert.assertThat(this.authorityPage.unInvestmentAnalysisGary(), is(true));

    }

    public void unroomCustomers() {
        Assert.assertThat(this.authorityPage.roomCustomers(), is(false));

    }

    public void enterBuildingsManage() {
        this.authorityPage.enterBuildingsManage();

    }

    public void unNewLogin() {
        Assert.assertThat(this.authorityPage.unNewLogin(), is(true));

    }

    public void demandTheHall() {
        this.authorityPage.demandTheHall();

    }

    public void customerClickable() {
        this.authorityPage.customerClickable();

    }

    public void contractStatisticalAnalysis() {
        this.authorityPage.contractStatisticalAnalysis();

    }

    public void reportDerived() {
        this.authorityPage.reportDerived();

    }

    public void enterContractStatisticalAnalysisPage() {
        this.authorityPage.enterContractStatisticalAnalysisPage();

    }

    public void enterRoomPage() {
        this.authorityPage.enterRoomPage();

    }


    public void roomDeleteClickable() {
        this.authorityPage.roomDeleteClickable();

    }

    public void newRentable() {
        Assert.assertThat(this.authorityPage.newRentable(), is(true));

    }

    public void notNewRentable() {
        Assert.assertThat(this.authorityPage.newRentable(), is(false));

    }

    public void rentClose() {
        this.authorityPage.rentClose();

    }

    public void rentOpen() {
        this.authorityPage.rentOpen();

    }

    public void unfinancialAuthority() {
        this.authorityPage.unfinancialAuthority();

    }

    public void NewCustomer() {
        this.authorityPage.NewCustomer();

    }


    public void buildingEdit() {
        this.authorityPage.buildingEdit();

    }

    public void EditBuilding() {
        Assert.assertThat(this.authorityPage.EditBuilding(), is(true));

    }

    public void hoverEditBuilding(String building) {
        Assert.assertThat(this.authorityPage.hoverEditBuilding(building), is(true));

    }

    public void enterMyChannelPage() {
        Assert.assertThat(this.authorityPage.enterMyChannelPageSuccessfully(), is(true));

    }

    public void newAndDeleteTemplate() {
        this.authorityPage.newAndDeleteTemplate();

    }

    public void returnInnerPage() {
        this.authorityPage.returnInnerPage();

    }

    public void allInvestmentPromotionAuthority() {
        this.authorityPage.allInvestmentPromotionAuthority();

    }

    public void enterUserPermissions2() {
        this.authorityPage.enterUserPermissions2();

    }

    public void enterUserPermissions1() {
        this.authorityPage.enterUserPermissions1();

    }

    public void unLookAll() {
        this.authorityPage.unLookAll();

    }


    public void modifyContract(String building) {
        Assert.assertThat(this.authorityPage.modifyContract(building), is(false));
    }

    public void notModifyContract(String building) {
        Assert.assertThat(this.authorityPage.modifyContract(building), is(true));
    }

    public void chooseTemplateManger() {
        this.authorityPage.chooseTemplateManger();
    }

    public void chooseAuthority(String authorityName) {
        this.authorityPage.chooseAuthority(authorityName);
    }

    // 验证第一个合同不是我的合同
    public void verifyFirstNotMyContract() {
        Assert.assertThat(this.authorityPage.getFirstContractTenant(), not("123"));
    }

    // 去除某项权限
    public void removeAuthority(String authorityName) {
        this.authorityPage.removeAuthority(authorityName);
    }

    // 验证第一个合同是我的合同
    public void verifyFirstIsMyContract() {
        Assert.assertThat(this.authorityPage.getFirstContractTenant(), is("123"));
    }

    // 验证第一个客户是我的客户
    public void verifyFirstIsMyCustomer() {
        Assert.assertThat(this.authorityPage.getFirstCustomer(), is("自己的招商数据"));
    }

    // 验证第一个客户不是我的客户
    public void verifyFirstNotMyCustomer() {
        Assert.assertThat(this.authorityPage.getFirstCustomer(), not("自己的招商数据"));
    }

    // 验证文字您没有此操作的权限
    public void unAuthorityToDo() {
        Assert.assertThat(this.authorityPage.unAuthorityToDoText(), is(true));
    }

    // 验证页面变灰，显示“抱歉！您无权查看该页面”
    public void pageGary() {
        Assert.assertThat(this.authorityPage.pageGary(), is(true));
    }

    // 验证是否显示预算列表
    public void hasBudgetaryList() {
        Assert.assertThat(this.authorityPage.hasBudgetaryList(), is(true));
    }

    // 验证有编辑预算列表权限
    public void hasModifyBudgetaryList() {
        Assert.assertThat(this.authorityPage.hasModifyBudgetaryList(), is(false));
    }

    // 验证没有有编辑预算列表权限
    public void notModifyBudgetaryList() {
        Assert.assertThat(this.authorityPage.hasModifyBudgetaryList(), is(true));
    }

    // 验证没有房源标签权限
    public void authorityRoomTag() {
        Assert.assertThat(this.authorityPage.authorityRoomTag(), is(true));
    }

    // 验证没有租客标签权限
    public void authorityRenterTag() {
        Assert.assertThat(this.authorityPage.authorityRenterTag(), is(true));
    }

    // 验证没有行业管理权限
    public void authorityIndustryManagement() {
        Assert.assertThat(this.authorityPage.authorityAddIndustry(), is(true));
    }

    public void enterSelfDefine() {
        this.authorityPage.enterSelfDefine();
    }

    public void enterIndustryManagement() {
        this.authorityPage.enterIndustryManagement();
    }

    public void enterFeeType() {
        this.authorityPage.enterFeeType();
    }

    public void enterWithdrawalReason() {
        this.authorityPage.enterWithdrawalReason();
    }

    //验证没有费用类型权限
    public void NoAuthorityAddFeeType() {
        Assert.assertThat(this.authorityPage.authorityAddFeeType(), is(false));
    }

    //验证拥有费用类型权限
    public void authorityAddFeeType() {
        Assert.assertThat(this.authorityPage.authorityAddFeeType(), is(true));
    }

    //是否显示资产收益
    public void hasAssetIncome() {
        Assert.assertThat(this.authorityPage.hasAssetIncome(), is(true));
    }

    // 是否显示我的渠道列表
    public void hasMyChannelList() {
        Assert.assertThat(this.authorityPage.hasMyChannelList(), is(true));
    }

    public void hasCustomerManagerList() {
        Assert.assertThat(this.authorityPage.hasCustomerManagerList(), is(true));
    }

    public void isModifyRoom() {
        Assert.assertThat(this.authorityPage.isModifyRoom(), is(true));
    }

    public void hasModifyRoom() {
        Assert.assertThat(this.authorityPage.isModifyRoom(), is(false));
    }

    public void loginOut() {
        this.authorityPage.loginOut();
    }
}
