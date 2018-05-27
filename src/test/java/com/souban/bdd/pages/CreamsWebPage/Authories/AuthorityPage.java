package com.souban.bdd.pages.CreamsWebPage.Authories;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class AuthorityPage extends ParentPage {
    public AuthorityPage(Driver driver) {
        super(driver);
    }

    // 内部管理页面
    private UIElement TXT_People = new UIElement("xpath=//*[@class='btn___2v-Wo ant-dropdown-trigger']");
    private UIElement TXT_InnerMagement = new UIElement("xpath=//ul[@class='ant-dropdown-menu-item-group-list']/li[1]");
    private UIElement TXT_TemplateMagement = new UIElement("xpath=//*[text()='模板管理']");
    private UIElement TXT_ApprovalProcess = new UIElement("xpath=//*[text()='审核流程']");
    private UIElement BTN_NewApprovalProcessEdit = new UIElement(
            "xpath=//*[text()='新建合同审核流程']/div[@class='edit___1Dnp-']");
    private UIElement SPN_chooseBuilding = new UIElement(
            "xpath=//i[@class='anticon anticon-down dropDownArrow___1iuFR false']");
    private UIElement BTN_BuildingLouYu = new UIElement("xpath=//*[text()='楼宇名称']");
    private UIElement TXT_Author = new UIElement("xpath=//div[@class='RightListBlock___34gPb' and text()='权限测试']");

    public UIElement name(String customerName) {
        return new UIElement("xpath=//*[text()='" + customerName + "']/following-sibling::td/div/button");
    }

    public UIElement TXT_customer1 = new UIElement("xpath=//*[text()='权限测试1']/following-sibling::td/div/button");
    public UIElement TXT_customer2 = new UIElement("xpath=//*[text()='权限测试2']/following-sibling::td/div/button");

    // 权限框勾选页面
    private UIElement BTN_clickYes = new UIElement("xpath=//span[text()='确 认']/parent::button");
    private UIElement CBX_NewContract = new UIElement("xpath=//*[text()='租赁合同新建']");
    private UIElement CBX_NewContractBoxNo = new UIElement(
            "xpath=//*[text()='租赁合同新建']/parent::*/span[@class='ant-checkbox']");
    private UIElement CBX_customerManage = new UIElement("xpath=//*[text()='客户管理权限']");
    private UIElement CBX_customerManageBoxNo = new UIElement(
            "xpath=//*[text()='客户管理权限']/parent::*/span[@class='ant-checkbox']");
    private UIElement CBX_DemandTheHall = new UIElement("xpath=//*[text()='需求大厅']");
    private UIElement CBX_DemandTheHallBoxNo = new UIElement(
            "xpath=//*[text()='需求大厅']/parent::*/span[@class='ant-checkbox']");
    private UIElement CBX_ContractStatisticalAnalysis = new UIElement("xpath=//*[text()='合同统计分析']");
    private UIElement CBX_ContractStatisticalAnalysisBoxNo = new UIElement(
            "xpath=//*[text()='合同统计分析']/parent::*/span[@class='ant-checkbox']");
    private UIElement CBX_PaymentBusinessAuthority = new UIElement("xpath=//*[text()='收付款业务权限']");
    private UIElement CBX_LookAllContracts = new UIElement("xpath=//*[text()='查看所有人合同']");
    private UIElement CBX_LookAllContractsBoxNo = new UIElement(
            "xpath=//*[text()='查看所有人合同']/parent::*/span[@class='ant-checkbox']");
    private UIElement CBX_LookAllContractsBox = new UIElement(
            "xpath=//*[text()='查看所有人合同']/parent::*/span[@class='ant-checkbox ant-checkbox-checked']");

    private UIElement CBX_LookAllPropertyManagementContract = new UIElement("xpath=//*[text()='查看所有人物业合同']");
    private UIElement CBX_ContractAudit = new UIElement("xpath=//*[text()='租赁合同审核']");
    private UIElement CBX_ContractAuditBoxNo = new UIElement(
            "xpath=//*[text()='租赁合同审核']/parent::*/span[@class='ant-checkbox']");
    private UIElement CBX_myChannelPermissions = new UIElement("xpath=//*[text()='我的渠道']");
    private UIElement CBX_BuildingEdit = new UIElement("xpath=//*[text()='楼盘、楼层编辑']");
    private UIElement CBX_BuildingEditBoxNo = new UIElement(
            "xpath=//*[text()='楼盘、楼层编辑']/parent::*/span[@class='ant-checkbox']");
    private UIElement CBX_InvestmentAnalysis = new UIElement("xpath=//*[text()='招商分析']");
    private UIElement CBX_BrokerReport = new UIElement("xpath=//*[text()='经纪人报备']");
    private UIElement CBX_OneKeySynchronousInvestment = new UIElement("xpath=//*[text()='一键同步招商']");
    private UIElement CBX_RoomEdit = new UIElement("xpath=//*[text()='房源编辑']");
    private UIElement CBX_RoomEditBoxNo = new UIElement(
            "xpath=//*[text()='房源编辑']/parent::*/span[@class='ant-checkbox']");
    // 权限涉及页面元素
    private UIElement BTN_UnlookNewTemplate = new UIElement("xpath=//*[@class='ant-btn']");
    private UIElement BTN_undeleteTemplate = new UIElement("xpath=//li[text()='删除' and @aria-disabled='true']");
    private UIElement BTN_deleteTemplate = new UIElement(
            "xpath=//*[@class='td-column___ku8pq']/div/span/span[@class='creamsicon icon___b7k63']");
    private UIElement TXT_OneTemplate = new UIElement("xpath=//*[@class='ant-select-selection-selected-value']");
    private UIElement BTN_Contracts = new UIElement("xpath=//*[text()='租赁合同']");
    private UIElement TXT_roomContracts = new UIElement("xpath=//*[@class='title-box___2RHAY']//div[text()='租赁合同']");
    private UIElement TXT_CustomerManage = new UIElement("xpath=//*[text()='招商管理']");
    private UIElement TXT_myChannelGary = new UIElement(
            "xpath=//*[@class='disableItem___3X1wX' and @href='/project/set/customer/myChannel']");
    private UIElement TXT_investmentAnalysisGary = new UIElement("xpath=//*[text()='招商分析']");
    private UIElement TXT_unableLook = new UIElement("xpath=//*[text()='抱歉!']");
    private UIElement TXT_roomCustomers = new UIElement("xpath=//*[@class='title-box___2RHAY']//div[text()='客户']");
    private UIElement TXT_BuildingsManage = new UIElement("xpath=//*[text()='楼宇管理']");
    private UIElement BTN_UnNewLogin = new UIElement("xpath=//*[@class='disableButton___3j68m']");
    private UIElement TXT_CustomerClickable = new UIElement("xpath=//*[text()='需求大厅']");
    private UIElement BTN_ReportDerived = new UIElement("xpath=//*[@href='/project/download/rent']/i");
    private UIElement BTN_TheNumberOfEnterprises = new UIElement(
            "xpath=//*[@href='http://creams-temporary-excel.oss-cn-hangzhou.aliyuncs.com/temp/%E5%85%A5%E4%BD%8F%E4%BC%81%E4%B8%9A%E6%95%B0%E8%A1%8C%E4%B8%9A%E5%88%97%E8%A1%A82017-12-04-14-05-30.xls?Expires=1512369330&OSSAccessKeyId=LTAIXKEhFVfTuliQ&Signature=m9GdqgnHcaVuLfgkHn6FqxyuBl4%3D']");
    private UIElement TXT_Collection = new UIElement("xpath=//*[@href='/project/set/buildingSet']");
    private UIElement TXT_StatisticalAnalysis = new UIElement(
            "xpath=//*[@href='/project/set/chart' and text()='统计分析']");
    private UIElement BTN_roomsManage = new UIElement("xpath=//*[text()='房源管理']");
    private UIElement BTN_RoomDelete = new UIElement("xpath=//*[text()='删除']");
    private UIElement BTN_RoomPageClose = new UIElement("xpath=//*[@style='width: 50px; position: absolute;']");
    private UIElement TXT_aRoom = new UIElement(
            "xpath=//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]");
    private UIElement BTN_newRent = new UIElement("xpath=//*[@class='ant-btn ant-dropdown-trigger']");
    private UIElement TXT_ARent = new UIElement("xpath=//*[@class='scrollMain___2hOkJ scroll__main']/li[1]");
    private UIElement BTN_RentClose = new UIElement("xpath=//*[@class='ant-btn btn-group___20AnM']");
    private UIElement INP_reasonRentClose = new UIElement(
            "xpath=//*[@type='textarea' and @rows='4' and @placeholder='请输入备注' and @class='ant-input']");
    private UIElement BTN_RentReasonYes = new UIElement(
            "xpath=//*[@class='ant-btn CreateBtn___2i_TR ant-btn-primary']");
    private UIElement BTN_RentReasonYes2 = new UIElement("xpath=//*[@class='ant-btn ant-btn-primary ant-btn-lg']");
    private UIElement TXT_ClosedRent = new UIElement("xpath=//span[text()='显示关闭账单']");
    private UIElement TXT_AClosedRent = new UIElement("xpath=//*[@class='scroll___1FJ71 scroll__container']/ul/li[1]");
    private UIElement BTN_RentOpen = new UIElement("xpath=//*[@class='ant-btn btn-group___20AnM']");
    private UIElement BTN_OpenRentYes = new UIElement("xpath=//*[@class='ant-btn ant-btn-primary ant-btn-lg']");
    private UIElement BTN_EditBuilding = new UIElement("xpath=//*[@class='ant-btn modalButton___3xevo']");
    private UIElement TXT_ABuilding = new UIElement(
            "xpath=//*[@class='scrollItem___2U-_d itemClass___16bfM infiniteScrollItem']");
    private UIElement BTN_hoverEditBuilding = new UIElement("xpath=//*[text()='编辑楼宇']");

    public UIElement Abuilding(String building) {
        return new UIElement("xpath=//*[text()='" + building + "']/parent::*[@class='info___1Dhyq']");
    }

    private UIElement BTN_ContractEdit = new UIElement("xpath=//div[@class='disableButton___3j68m']/span[text()='编辑']");
    private UIElement TXT_FreeAgent = new UIElement("xpath=//*[text()='自由经纪人']");
    private UIElement TXT_MyChannel = new UIElement("xpath=//*[text()='我的渠道']");
    private UIElement BTN_NewAuditClose = new UIElement("xpath=//*[@class='ant-modal-close-x']");
    private UIElement TXT_Inner = new UIElement("xpath=//*[@class='ant-menu-item']/a[@href='/profile/authority/main']");

    private UIElement TXT_ARoom = new UIElement("xpath=//ul[@class='creams-building___3PLGt']/li[1]/div[2]/div[1]");
    private UIElement TXT_AContract = new UIElement(
            "xpath=//*[@class='ant-table-row tableRow___19Q18 ant-table-row-level-0']");
    private UIElement TXT_FirstContract = new UIElement(
            "xpath=//li[@class='scrollItem___2U-_d itemClass___16bfM infiniteScrollItem']/ol/li[1]/div/div/div");
    private UIElement TXT_FirstCustomer = new UIElement(
            "xpath=//li[@class='scrollItem___2U-_d itemClass___16bfM infiniteScrollItem']/ol/li[1]/div/div/div/span[1]");
    private UIElement TXT_FirstRoom = new UIElement(
            "xpath=//li[@class='scrollItem___2U-_d itemClass___16bfM infiniteScrollItem']/ol");
    private UIElement TXT_unAuthorityToDo = new UIElement("xpath=//span[text()='您没有此项操作的权限']");
    private UIElement BTN_clickYesNoBlank = new UIElement("xpath=//button[text()='确认']");
    private UIElement TXT_BudgetaryListHeader = new UIElement("xpath=//div[text()='预算列表']");
    private UIElement BTN_BudgetaryModifyDisabled = new UIElement("xpath=//div[@class='disableButton___3j68m']"); // 预算列表的灰色无法点击的编辑按钮
    private UIElement BTN_RoomTagDisabled = new UIElement(
            "xpath=//li[@class='ant-menu-item-disabled ant-menu-item item___2PPmK smallItem___1ZeiN']/descendant::span[text()='房源标签']"); // 灰色不可点击的房源标签
    private UIElement BTN_RenterTagDisabled = new UIElement(
            "xpath=//li[@class='ant-menu-item-disabled ant-menu-item item___2PPmK smallItem___1ZeiN']/descendant::span[text()='租客标签']");// 灰色不可点击的租客标签
    private UIElement BTN_AddIndustry = new UIElement("xpath=//*[@class='disableButton___3j68m']"); // 不可点击的添加行业按钮
    private UIElement BTN_ownerSetting = new UIElement("//*[@id='headDownLoadCenter']/following-sibling::*");
    private UIElement BTN_selfDefine = new UIElement("//*[text()='自定义管理']");
    private UIElement BTN_IndustryManagement = new UIElement("//span[text()='行业管理']//parent::a");
    private UIElement BTN_FeeType = new UIElement("//span[text()='费用类型管理']/parent::a");
    private UIElement BTN_WithdrawalReason = new UIElement("//span[text()='退租原因管理']/parent::a");
    private UIElement BTN_AddFeeType = new UIElement("//span[text()='新增']/parent::button");
    private UIElement TXT_AssetIncome = new UIElement("xpath=//h2[text()='资产收益图']");
    private UIElement TXT_MyChannelList = new UIElement("xpath=//div[text()='我的渠道']");
    private UIElement TXT_ContractTemplate = new UIElement("//span[text()='租赁合同模板']/parent::a");
    private UIElement TXT_PropertyContractTemplate = new UIElement("//span[text()='物业模板']/parent::a");
    private UIElement TXT_CustomerManageList = new UIElement("xpath=//div[text()='客户管理']");
    private UIElement BTN_ModifyRoom = new UIElement("xpath=//div[@class='disableButton___3j68m']");
    private UIElement BTN_LoginOut = new UIElement("//*[@class='item___1eUJK' and text()='退出登录']");

    public UIElement singleBuildingElement(String building) {
        return new UIElement("xpath=//div[text()='天津市']/preceding-sibling::div[text()='" + building + "']/parent::div");
    }

    public UIElement CBX_Authority(String authorityName) {
        return new UIElement("xpath=//*[text()='" + authorityName + "']/parent::*/span[@class='ant-checkbox']");
    }

    public UIElement TXT_AuthorityName(String authorityName) {
        return new UIElement("xpath=//*[text()='" + authorityName + "']");
    }

    public void enterTnnerPage() {
        this.driver.waitForElement(TXT_People, 5);
        this.driver.mouseOver(TXT_People);
        this.driver.waitClickable(TXT_InnerMagement, 5);
        this.driver.click(TXT_InnerMagement);

    }

    public void enterApprovalProcessPage() {
        this.driver.sleep(1000);
        this.driver.click(TXT_ApprovalProcess);
        this.driver.sleep(1000);
        this.driver.click(BTN_NewApprovalProcessEdit);
        this.driver.waitClickable(SPN_chooseBuilding, 5);
        this.driver.sleep(1000);
        this.driver.click(SPN_chooseBuilding);
        this.driver.waitClickable(BTN_BuildingLouYu, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_BuildingLouYu);
        this.driver.sleep(1000);
    }

    public boolean isAuthor() {
        return this.driver.waitForElement(TXT_Author, 5);
    }

    public void enterUserPermissions(String customerName) {
        this.driver.sleep(1000);
        this.driver.click(this.name(customerName));
        this.driver.sleep(1000);

    }

    public void chooseTemplateManger() {
        if (this.driver.isElementFound(CBX_RoomEditBoxNo)) {
            this.driver.click(CBX_RoomEdit);

        }
        this.driver.click(BTN_clickYes);

    }

    public void enterTemplate() {
        this.driver.waitForElement(BTN_ownerSetting, 5);
        this.driver.mouseOver(BTN_ownerSetting);
        this.driver.waitClickable(TXT_TemplateMagement, 5);
        this.driver.click(TXT_TemplateMagement);
        this.driver.waitClickable(TXT_TemplateMagement, 5);
        this.driver.click(TXT_TemplateMagement);
        this.driver.waitClickable(TXT_ContractTemplate, 5);
        this.driver.click(TXT_ContractTemplate);
    }

    public void enterPropertyTemplate() {
        this.driver.waitForElement(BTN_ownerSetting, 5);
        this.driver.mouseOver(BTN_ownerSetting);
        this.driver.waitClickable(TXT_TemplateMagement, 5);
        this.driver.click(TXT_TemplateMagement);
        this.driver.waitClickable(TXT_TemplateMagement, 5);
        this.driver.click(TXT_TemplateMagement);
        this.driver.waitClickable(TXT_PropertyContractTemplate, 5);
        this.driver.click(TXT_PropertyContractTemplate);
    }

    public boolean unlookNewTemplate() {
        return this.driver.waitClickable(BTN_UnlookNewTemplate, 5);
    }

    public boolean undeleteTemplate() {
        this.driver.click(TXT_OneTemplate);
        return this.driver.isElementFound(BTN_undeleteTemplate);
    }

    public void newContract() {
        if (this.driver.isElementFound(CBX_NewContractBoxNo)) {
            this.driver.click(CBX_NewContract);
        }
        this.driver.click(BTN_clickYes);

    }

    public boolean clickContracts() {
        return this.driver.waitClickable(BTN_Contracts, 5);
    }

    public boolean roomContracts() {
        return this.driver.waitForElement(TXT_roomContracts, 5);
    }


    public boolean unCuatomerManage() {
        this.driver.click(TXT_CustomerManage);
        return this.driver.waitForElement(TXT_unableLook, 5);

    }

    public boolean myChannelGary() {
        return this.driver.waitForElement(TXT_myChannelGary, 5);
    }

    public boolean investmentAnalysisGary() {
        return this.driver.waitForElement(TXT_investmentAnalysisGary, 5);
    }

    public boolean unMyChannel() {
        this.driver.sleep(1000);
        this.driver.click(TXT_myChannelGary);
        return this.driver.waitForElement(TXT_unableLook, 5);
    }

    public boolean roomCustomers() {
        return this.driver.waitForElement(TXT_roomCustomers, 5);
    }

    public void enterBuildingsManage() {
        this.driver.sleep(1000);
        this.driver.click(TXT_BuildingsManage);

    }

    public boolean unNewLogin() {
        return this.driver.waitForElement(BTN_UnNewLogin, 5);
    }

    public void demandTheHall() {
        if (this.driver.isElementFound(CBX_customerManageBoxNo)) {
            this.driver.click(CBX_customerManage);
        }
        this.driver.sleep(1000);
        if (this.driver.isElementFound(CBX_DemandTheHallBoxNo)) {
            this.driver.click(CBX_DemandTheHall);
        }
        this.driver.click(BTN_clickYes);

    }

    public void customerClickable() {
        this.driver.click(TXT_CustomerManage);
        this.driver.waitClickable(TXT_CustomerClickable, 5);
    }

    public void contractStatisticalAnalysis() {
        if (this.driver.isElementFound(CBX_NewContractBoxNo)) {
            this.driver.click(CBX_NewContract);
        }
        this.driver.sleep(1000);
        if (this.driver.isElementFound(CBX_ContractStatisticalAnalysisBoxNo)) {
            this.driver.click(CBX_ContractStatisticalAnalysis);
        }
        this.driver.click(BTN_clickYes);

    }

    public void reportDerived() {
        this.driver.waitAndClick(BTN_ReportDerived, 5);
        this.driver.waitClickable(BTN_TheNumberOfEnterprises, 5);

    }

    public void enterContractStatisticalAnalysisPage() {
        this.driver.click(TXT_Collection);
        this.driver.waitAndClick(TXT_StatisticalAnalysis, 5);

    }

    public void enterRoomPage() {
        this.driver.waitClickable(BTN_roomsManage, 5);
        this.driver.click(BTN_roomsManage);
        this.driver.mouseOver(TXT_aRoom);

    }

    public void roomDeleteClickable() {
        this.driver.waitClickable(BTN_RoomDelete, 5);
        this.driver.click(BTN_RoomPageClose);

    }

    public boolean newRentable() {
        this.driver.sleep(1000);
        return this.driver.waitForElement(BTN_newRent, 5);
    }

    public void rentClose() {
        this.driver.click(TXT_ARent);
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_RentClose, 5);
        this.driver.elementSendText(INP_reasonRentClose, "www");
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_RentReasonYes, 5);
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_RentReasonYes2, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_RoomPageClose);

    }

    public void rentOpen() {
        this.driver.sleep(1000);
        this.driver.click(TXT_ClosedRent);
        this.driver.sleep(1000);
        this.driver.click(TXT_AClosedRent);
        this.driver.sleep(1000);
        this.driver.click(BTN_RentOpen);
        this.driver.sleep(1000);
        this.driver.click(BTN_OpenRentYes);
        this.driver.sleep(1000);
        this.driver.click(BTN_RoomPageClose);
        this.driver.sleep(1000);

    }

    public void unfinancialAuthority() {
        this.driver.click(CBX_LookAllContracts);
        this.driver.click(CBX_LookAllPropertyManagementContract);
        this.driver.click(CBX_PaymentBusinessAuthority);
        this.driver.click(BTN_clickYes);

    }

    public void NewCustomer() {
        this.driver.waitClickable(BTN_UnNewLogin, 5);

    }

    public void buildingEdit() {
        if (this.driver.isElementFound(CBX_BuildingEditBoxNo)) {
            this.driver.click(CBX_BuildingEdit);
        }
        this.driver.click(BTN_clickYes);

    }

    public boolean EditBuilding() {
        return this.driver.waitForElement(BTN_EditBuilding, 5);
    }

    public boolean hoverEditBuilding(String building) {
        this.driver.click(this.Abuilding(building));
        this.driver.sleep(1000);
        this.driver.mouseOver(TXT_ABuilding);
        return this.driver.waitForElement(BTN_hoverEditBuilding, 5);
    }

    public boolean enterMyChannelPageSuccessfully() {
        this.driver.click(TXT_CustomerManage);
        this.driver.sleep(1000);
        this.driver.click(TXT_MyChannel);
        return this.driver.waitForElement(TXT_FreeAgent, 5);
    }

    public void newAndDeleteTemplate() {
        this.driver.sleep(1000);
        this.driver.waitClickable(BTN_UnlookNewTemplate, 5);
        this.driver.click(TXT_OneTemplate);
        this.driver.waitClickable(BTN_deleteTemplate, 5);

    }

    public void returnInnerPage() {
        this.driver.click(BTN_NewAuditClose);
        this.driver.sleep(1000);
        this.driver.click(TXT_Inner);

    }

    public void allInvestmentPromotionAuthority() {
        this.driver.click(CBX_customerManage);
        this.driver.sleep(1000);
        this.driver.click(CBX_myChannelPermissions);
        this.driver.click(CBX_InvestmentAnalysis);
        this.driver.click(CBX_BrokerReport);
        this.driver.click(CBX_OneKeySynchronousInvestment);
        this.driver.click(CBX_DemandTheHall);
        this.driver.click(BTN_clickYes);

    }

    public void enterUserPermissions1() {
        this.driver.click(TXT_customer1);
        this.driver.sleep(1000);

    }

    public void enterUserPermissions2() {
        this.driver.click(TXT_customer2);
        this.driver.sleep(1000);

    }

    public void unLookAll() {
        if (this.driver.isElementFound(CBX_LookAllContractsBox)) {
            this.driver.click(CBX_LookAllContracts);
        }
        this.driver.click(BTN_clickYes);

    }

    public boolean modifyContract(String building) {
        this.driver.waitClickable(this.singleBuildingElement(building), 10);
        this.driver.sleep(1000);
        this.driver.click(this.singleBuildingElement(building));
        this.driver.sleep(1000);
        this.driver.waitAndClick(TXT_ARoom, 5);
        this.driver.sleep(1000);
        this.driver.click(TXT_AContract);
        this.driver.sleep(1000);
        return this.driver.waitClickable(BTN_ContractEdit, 5);
    }

    // 勾选指定权限
    public void chooseAuthority(String authorityName) {
        if (this.driver.isElementFound(this.CBX_Authority(authorityName))) {
            this.driver.click(this.TXT_AuthorityName(authorityName));
        }
        this.driver.click(BTN_clickYes);
    }

    // 得到第一份合同租客名称
    public String getFirstContractTenant() {
        return this.driver.elementGetText(TXT_FirstContract);
    }

    // 去掉指定权限
    public void removeAuthority(String authorityName) {
        if (!this.driver.isElementFound(this.CBX_Authority(authorityName))) {
            this.driver.waitClickable(this.TXT_AuthorityName(authorityName), 5);
            this.driver.click(this.TXT_AuthorityName(authorityName));
        }
        this.driver.click(BTN_clickYes);
    }

    // 得到第一份客户管理客户名称
    public String getFirstCustomer() {
        return this.driver.elementGetText(TXT_FirstCustomer);
    }

    // 弹出框“您没有此项操作的权限”
    public boolean unAuthorityToDoText() {
        boolean flag = this.driver.waitForElement(TXT_unAuthorityToDo, 5);
        this.driver.click(BTN_clickYesNoBlank);
        return flag;
    }

    public boolean unInvestmentAnalysisGary() {
        this.driver.sleep(5000);
        this.driver.click(TXT_investmentAnalysisGary);
        return this.driver.waitForElement(TXT_unableLook, 5);
    }

    // 页面变灰，显示“抱歉！您无权查看该页面”
    public boolean pageGary() {
        return this.driver.waitForElement(TXT_unableLook, 5);
    }

    // 是否显示预算列表
    public boolean hasBudgetaryList() {
        return this.driver.waitForElement(TXT_BudgetaryListHeader, 5);
    }

    // 是否可以编辑预算列表
    public boolean hasModifyBudgetaryList() {
        return this.driver.waitForElement(BTN_BudgetaryModifyDisabled, 5);
    }

    // 是否可以点击房源标签
    public boolean authorityRoomTag() {
        return this.driver.waitForElement(BTN_RoomTagDisabled, 5);
    }

    // 是否可以点击租客标签
    public boolean authorityRenterTag() {
        return this.driver.waitForElement(BTN_RenterTagDisabled, 5);
    }

    // 是否可以点击添加行业
    public boolean authorityAddIndustry() {
        return this.driver.waitForElement(BTN_AddIndustry, 5);
    }

    // 进入自定义管理
    public void enterSelfDefine() {
        this.driver.waitForElement(BTN_ownerSetting, 5);
        this.driver.mouseOver(BTN_ownerSetting);
        this.driver.waitClickable(BTN_selfDefine, 5);
        this.driver.click(BTN_selfDefine);
        this.driver.waitClickable(BTN_selfDefine, 5);
        this.driver.click(BTN_selfDefine);
    }

    // 进入行业管理
    public void enterIndustryManagement() {
        this.driver.waitClickable(BTN_IndustryManagement, 5);
        this.driver.click(BTN_IndustryManagement);
    }

    // 进入费用类型管理
    public void enterFeeType() {
        this.driver.waitClickable(BTN_FeeType, 5);
        this.driver.click(BTN_FeeType);
    }

    // 进入退租原因管理
    public void enterWithdrawalReason() {
        this.driver.waitClickable(BTN_WithdrawalReason, 5);
        this.driver.click(BTN_WithdrawalReason);
    }

    // 是否可以点击新增费用类型
    public boolean authorityAddFeeType() {
        return this.driver.waitClickable(BTN_AddFeeType, 5);
    }

    // 是否显示资产收益
    public boolean hasAssetIncome() {
        return this.driver.waitForElement(TXT_AssetIncome, 5);
    }

    // 是否显示我的渠道列表
    public boolean hasMyChannelList() {
        return this.driver.waitForElement(TXT_MyChannelList, 5);
    }

    // 是否显示客户管理列表
    public boolean hasCustomerManagerList() {
        return this.driver.waitForElement(TXT_CustomerManageList, 5);
    }

    public boolean isModifyRoom() {
        this.driver.waitClickable(TXT_FirstRoom, 5);
        this.driver.sleep(1000);
        this.driver.click(TXT_FirstRoom);
        return this.driver.waitClickable(BTN_ModifyRoom, 5);
    }

    public void loginOut() {
        this.driver.refresh();
        this.driver.sleep(2000);
        this.driver.mouseOver(TXT_People);
        this.driver.waitClickable(BTN_LoginOut, 5);
        this.driver.click(BTN_LoginOut);
    }

}
