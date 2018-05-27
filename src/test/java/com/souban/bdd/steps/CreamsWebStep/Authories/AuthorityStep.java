package com.souban.bdd.steps.CreamsWebStep.Authories;

import com.souban.bdd.framework.Config;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthorityStep extends BaseStep {
    Config config = Config.getInstance();

    @When("^进入内部管理页面$")
    public void 进入内部管理页面() {
        this.authorityFlow.enterInnerPage();

    }

    @When("^进入审核流程编辑$")
    public void 进入审核流程编辑() {
        this.authorityFlow.enterApprovalProcessPage();
    }

    @Then("^可以看到该人出现在右侧审核候选人之内$")
    public void 可以看到该人出现在右侧审核候选人之内() {
        this.authorityFlow.isAuthor();
    }

    @Then("^不能看到该人出现在右侧审核候选人之内$")
    public void 不能看到该人出现在右侧审核候选人之内() {
        this.authorityFlow.isNotAuthor();
    }

    @Given("^进入用户权限页面\"([^\"]*)\"$")
    public void 进入用户权限页面(String customerName) {
        this.authorityFlow.enterUserPermissions(customerName);
    }

    @When("^子账号登陆$")
    public void 子账号登陆() {
        this.loginFlow.adminLogin(config.get("login.web.address"), config.get("login.subuser.name"),
                config.get("login.subuser.password"));
    }

    @When("^进入合同模板页面$")
    public void 进入合同模板页面() {
        this.authorityFlow.enterTemplate();
    }

    @When("^进入物业合同模板页面$")
    public void 进入物业合同模板页面() {
        this.authorityFlow.enterPropertyTemplate();
    }

    @Then("^新增模版按钮变灰$")
    public void 新增模版按钮变灰() {
        this.authorityFlow.unlookNewTemplate();
    }

    @Then("^合同模版删除按钮变灰$")
    public void 合同模版删除按钮变灰() {
        this.authorityFlow.undeleteTemplate();
    }

    @Then("^新增模版按钮可以点击$")
    public void 新增模版按钮可以点击() {
        this.authorityFlow.lookNewTemplate();
    }

    @Then("^合同模版删除按钮可以点击$")
    public void 合同模版删除按钮可以点击() {
        this.authorityFlow.undeleteTemplate();
    }

    @Given("^勾选租赁合同新建权限$")
    public void 勾选租赁合同新建权限() {
        this.authorityFlow.newContract();
    }

    @Then("^用户可以在集合和单一楼宇下点击进入租赁合同tab$")
    public void 用户可以在集合和单一楼宇下点击进入租赁合同tab() {
        this.authorityFlow.clickContracts();
    }

    @Then("^用户在房源侧滑栏可以看到租赁合同卡片\"([^\"]*)\"$")
    public void 用户在房源侧滑栏可以看到租赁合同卡片(String arg1) {
        this.roomsFlow.enterSingleBuildingPage(arg1);
        this.contractSideboardFlow.enterRoomSideboard();
        this.authorityFlow.roomContracts();
    }

    @Then("^点击招商管理alert，显示：您没有此项操作的权限$")
    public void 点击招商管理alert_显示_您没有此项操作的权限() {
        this.authorityFlow.unCuatomerManage();
    }

    @Then("^招商管理内右上角新增客户不能点击，我的渠道tab变灰，招商分析tab变灰$")
    public void 招商管理内右上角新增客户不能点击_我的渠道tab变灰_招商分析tab变灰() {
        this.authorityFlow.myChannelGary();
        this.authorityFlow.investmentAnalysisGary();
    }

    @Then("^点击进入我的渠道tab后不显示内容 显示抱歉!您无权查看该页面$")
    public void 点击进入我的渠道tab后不显示内容_显示抱歉_您无权查看该页面() {
        this.authorityFlow.unMyChannel();
    }

    @Then("^点击进入招商分析tab后不显示内容 显示抱歉!您无权查看该页面$")
    public void 点击进入招商分析tab后不显示内容_显示抱歉_您无权查看该页面() {
        this.authorityFlow.unInvestmentAnalysisGary();
    }

    @Then("^房源侧滑栏没有招商卡片不显示\"([^\"]*)\"$")
    public void 房源侧滑栏没有招商卡片不显示(String arg1) {
        this.authorityFlow.enterBuildingsManage();
        this.roomsFlow.enterSingleBuildingPage(arg1);
        this.contractSideboardFlow.enterRoomSideboard();
        this.authorityFlow.unroomCustomers();
    }

    @Then("^新建人员按钮为灰色$")
    public void 新建人员按钮为灰色() {
        this.authorityFlow.unNewLogin();
    }

    @Given("^勾选需求大厅权限$")
    public void 勾选需求大厅权限() {
        this.authorityFlow.demandTheHall();
    }

    @Then("^用户可以点击进入招商板块下的需求大厅tab$")
    public void 用户可以点击进入招商板块下的需求大厅tab() {
        this.authorityFlow.customerClickable();
    }

    @Given("^勾选合同统计分析权限$")
    public void 勾选合同统计分析权限() {
        this.authorityFlow.contractStatisticalAnalysis();
    }

    @Given("^勾选房源编辑权限$")
    public void 勾选房源编辑权限() {
        this.authorityFlow.chooseTemplateManger();
    }

    @Then("^用户可以进入报告导出租赁合同模块tab$")
    public void 用户可以进入报告导出租赁合同模块tab() {
        this.authorityFlow.reportDerived();
    }

    @Then("^用户可以进入统计分析tab$")
    public void 用户可以进入统计分析tab() {
        this.authorityFlow.enterContractStatisticalAnalysisPage();
    }

    @Then("^用户可以在房源侧滑栏点击删除按钮$")
    public void 用户可以在房源侧滑栏点击删除按钮() {
        this.authorityFlow.roomDeleteClickable();
    }

    @Then("^用户可以新建账单$")
    public void 用户可以新建账单() {
        this.authorityFlow.newRentable();
    }

    @Then("^用户不能新建账单$")
    public void 用户不能新建账单() {
        this.authorityFlow.notNewRentable();
    }

    @Then("^用户可以关闭账单$")
    public void 用户可以关闭账单() {
        this.authorityFlow.rentClose();
    }

    @Then("^用户可以开启已关闭的账单$")
    public void 用户可以开启已关闭的账单() {
        this.authorityFlow.rentOpen();
    }

    @Then("^去掉财务编辑权限$")
    public void 去掉财务编辑权限() {
        this.authorityFlow.unfinancialAuthority();
    }

    @Then("^用户可以新建人员$")
    public void 用户可以新建人员() {
        this.authorityFlow.NewCustomer();
    }

    @Given("^人员权限编辑页面，对楼宇、楼层管理权限进行勾选$")
    public void 人员权限编辑页面_对楼宇_楼层管理权限进行勾选() {
        this.authorityFlow.buildingEdit();
    }

    @Then("^楼宇管理里面hover编辑楼宇可以点击\"([^\"]*)\"$")
    public void 楼宇管理里面hover编辑楼宇可以点击(String arg1) {
        this.authorityFlow.hoverEditBuilding(arg1);
    }

    @Then("^加楼宇按钮可以点击$")
    public void 加楼宇按钮可以点击() {
        this.authorityFlow.EditBuilding();
    }

    @Then("^用户可以合同侧滑栏里编辑该份合同信息\"([^\"]*)\"$")
    public void 用户可以合同侧滑栏里编辑该份合同信息(String building) {
        this.authorityFlow.modifyContract(building);
    }

    @Then("^用户不能编辑该份合同信息\"([^\"]*)\"$")
    public void 用户不能编辑该份合同信息(String building) {
        this.authorityFlow.notModifyContract(building);
    }

    @Then("^用户可以点击进入我的渠道tab$")
    public void 用户可以点击进入我的渠道tab() {
        this.authorityFlow.enterMyChannelPage();
    }

    @Then("^合同模板列表，可以新增和删除合同模板$")
    public void 合同模板列表_可以新增和删除合同模板() {
        this.authorityFlow.newAndDeleteTemplate();
    }

    @Then("^返回内部管理页面$")
    public void 返回内部管理页面() {
        this.authorityFlow.returnInnerPage();
    }

    @Then("^恢复客户管理及以下权限$")
    public void 恢复客户管理及以下权限() {
        this.authorityFlow.allInvestmentPromotionAuthority();
    }

    @Given("^管理员登录$")
    public void 管理员登录() {
        this.loginFlow.adminLogin(config.get("login.web.address"), config.get("login.user.name"),
                config.get("login.user.password"));
    }

    @Given("^进入用户权限账号一页面$")
    public void 进入用户权限账号一页面() {
        this.authorityFlow.enterUserPermissions1();
    }

    @Given("^进入用户权限账号二页面$")
    public void 进入用户权限账号二页面() {
        this.authorityFlow.enterUserPermissions2();
    }

    @When("^去掉查看所有人合同权限$")
    public void 去掉查看所有人合同权限() {
        this.authorityFlow.unLookAll();
    }


    @When("^进入房源管理$")
    public void 进入房源管理() {
        this.authorityFlow.enterRoomPage();
    }

    @Given("^勾选权限 \"([^\"]*)\"$")
    public void 勾选权限(String authorityName) {
        this.authorityFlow.chooseAuthority(authorityName);
    }

    @Then("^用户可以看到所有人的租赁合同$")
    public void 用户可以看到所有人的租赁合同() {
        this.authorityFlow.verifyFirstNotMyContract();
    }

    @Then("^用户可以看到所有人的物业合同$")
    public void 用户可以看到所有人的物业合同() {
        this.authorityFlow.verifyFirstNotMyContract();
    }

    @Given("^去掉权限 \"([^\"]*)\"$")
    public void 去掉权限(String authorityName) {
        this.authorityFlow.removeAuthority(authorityName);
    }

    @Then("^用户只能看到自己的租赁合同$")
    public void 用户只能看到自己的租赁合同() {
        this.authorityFlow.verifyFirstIsMyContract();
    }

    @Then("^用户只能看到自己的物业合同$")
    public void 用户只能看到自己的物业合同() {
        this.authorityFlow.verifyFirstIsMyContract();
    }

    @Then("^用户只能看到自己的招商数据$")
    public void 用户只能看到自己的招商数据() {
        this.authorityFlow.verifyFirstIsMyCustomer();
    }

    @Then("^用户可以看到所有人的招商数据$")
    public void 用户可以看到所有人的招商数据() {
        this.authorityFlow.verifyFirstNotMyCustomer();
    }

    @Then("^弹出提示您没有此项操作的权限$")
    public void 弹出提示您没有此项操作的权限() {
        this.authorityFlow.unAuthorityToDo();
    }

    @Then("^页面显示抱歉!您无权查看该页面$")
    public void 页面显示抱歉_您无权查看该页面() {
        this.authorityFlow.pageGary();
    }

    @Then("^用户可以看到预算列表$")
    public void 用户可以看到预算列表() {
        this.authorityFlow.hasBudgetaryList();
    }

    @Then("^编辑按钮不能点击$")
    public void 编辑按钮不能点击() {
        this.authorityFlow.notModifyBudgetaryList();
    }

    @Then("^编辑按钮可以点击$")
    public void 编辑按钮可以点击() {
        this.authorityFlow.hasModifyBudgetaryList();
    }

    @Then("^房源标签按钮不能点击$")
    public void 房源标签按钮不能点击() {
        this.authorityFlow.authorityRoomTag();
    }

    @Then("^租客标签按钮不能点击$")
    public void 租客标签按钮不能点击() {
        this.authorityFlow.authorityRenterTag();
    }

    @Then("^添加行业按钮不能点击$")
    public void 添加行业按钮不能点击() {
        this.authorityFlow.authorityIndustryManagement();
    }

    @When("^用户在自定义管理页面$")
    public void 用户在自定义管理页面() {
        this.authorityFlow.enterSelfDefine();
    }

    @When("^进入行业管理$")
    public void 进入行业管理() {
        this.authorityFlow.enterIndustryManagement();
    }

    @When("^进入费用类型管理$")
    public void 进入费用类型管理() {
        this.authorityFlow.enterFeeType();
    }

    @When("^进入退租原因管理$")
    public void 进入退租原因管理() {
        this.authorityFlow.enterWithdrawalReason();
    }

    @Then("^新增按钮不能点击$")
    public void 新增按钮不能点击() {
        this.authorityFlow.NoAuthorityAddFeeType();
    }

    @Then("^新增按钮可以点击$")
    public void 新增按钮可以点击() {
        this.authorityFlow.authorityAddFeeType();
    }

    @Then("^用户可以看到资产收益图$")
    public void 用户可以看到资产收益图() {
        this.authorityFlow.hasAssetIncome();
    }

    @Then("^用户可以看到我的渠道列表$")
    public void 用户可以看到我的渠道列表() {
        this.authorityFlow.hasMyChannelList();
    }

    @Then("^用户可以看到客户管理列表$")
    public void 用户可以看到客户管理列表() {
        this.authorityFlow.hasCustomerManagerList();
    }

    @Then("^房源编辑按钮为灰")
    public void 房源编辑按钮为灰() {
        this.authorityFlow.isModifyRoom();
    }

    @Then("^房源编辑按钮可点击")
    public void 房源编辑按钮可点击() {
        this.authorityFlow.hasModifyRoom();
    }

    @Then("^该账号退出登陆$")
    public void 该账号退出登陆() throws Throwable {
        this.authorityFlow.loginOut();
    }

}
