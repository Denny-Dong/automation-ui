package com.souban.bdd.pages.CreamsWebPage.Property;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class PropertyPage extends ParentPage {
    public PropertyPage(Driver driver) {
        super(driver);
    }

    private UIElement TXT_EstateManagement = new UIElement("xpath=//*[text()='物业管理']");
    private UIElement BTN_EstatePriceDescending = new UIElement("xpath=//span[text()='物业单价']/div/span[@title='↓']");
    private UIElement BTN_EstatePriceAscending = new UIElement("xpath=//span[text()='物业单价']/div/span[@title='↑']");
    private UIElement BTN_RentDayDescending = new UIElement("xpath=//span[text()='计租日']/div/span[@title='↓']");
    private UIElement BTN_RentDayAscending = new UIElement("xpath=//span[text()='计租日']/div/span[@title='↑']");
    private UIElement BTN_SettlementDateDescending = new UIElement("xpath=//span[text()='结算日']/div/span[@title='↓']");
    private UIElement BTN_SettlementDateAscending = new UIElement("xpath=//span[text()='结算日']/div/span[@title='↑']");
    private UIElement TXT_EstatePrice = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[5]");
    private UIElement TXT_RentDay = new UIElement("xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[6]");
    private UIElement TXT_SettlementDate = new UIElement(
            "xpath=//*[@class='ant-table-row  ant-table-row-level-0']/td[7]");
    private UIElement BTN_AmmeterReadingManagement = new UIElement("xpath=//*[text()='抄表管理']");
    private UIElement BTN_ChooseEndDate = new UIElement("xpath=//*[text()='结束日']/i");
    private UIElement BTN_FilterBox = new UIElement("xpath=//*[@placeholder='开始日期']");
    private UIElement BTN_StartDate = new UIElement(
            "xpath=//*[@class='ant-calendar-date-input-wrap']/input[@placeholder='开始日期']");
    private UIElement BTN_EndDate = new UIElement(
            "xpath=//*[@class='ant-calendar-date-input-wrap']/input[@placeholder='结束日期']");
    private UIElement TXT_EndDateList = new UIElement(
            "xpath=//*[text()='结束日']/ancestor::div[7]/following-sibling::div/div/div/ul/li/ol/li[6]");
    private UIElement BTN_ChooseContractStatus = new UIElement("xpath=//*[text()='合同状态']/following-sibling::i");
    private UIElement BTN_Confirm = new UIElement("xpath=//*[text()='确定']");
    private UIElement TXT_ContractStatusList = new UIElement(
            "xpath=//*[text()='合同状态']/ancestor::div[7]/following-sibling::div/div/div/ul/li/ol/li[7]");
    private UIElement BTN_SizeDesc = new UIElement("xpath=//*[text()='面积']/div/span[@title='↓']");
    private UIElement TXT_SizeList = new UIElement(
            "xpath=//*[text()='面积']/ancestor::div[7]/following-sibling::div/div/div/ul/li/ol/li[4]");
    private UIElement BTN_ArchiveContract = new UIElement("xpath=//*[text()='归档合同']");
    private UIElement TXT_ContractList = new UIElement(
            "xpath=//ul[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]");
    private UIElement TXT_RenterInfo = new UIElement("xpath=//div[text()='租客信息']");
    private UIElement TXT_RoomInfo = new UIElement("xpath=//div[text()='房源信息']");
    private UIElement TXT_Invoice = new UIElement("xpath=//div[text()='发票抬头']");
    private UIElement TXT_BasicTerms = new UIElement("xpath=//div[text()='基本条款']");
    private UIElement TXT_PropertyFeeTerms = new UIElement("xpath=//div[text()='物业费条款']");
    private UIElement BTN_AddPropertyContract = new UIElement("xpath=//*[text()='物业合同']/preceding-sibling::button");
    private UIElement TXT_Tenant = new UIElement(
            "xpath=//div[text()='请填写姓名或公司']/following-sibling::ul/descendant::input");
    private UIElement TXT_Industry = new UIElement(
            "xpath=//div[text()='请选择行业']/following-sibling::ul/descendant::input");
    private UIElement TXT_LegalPerson = new UIElement("xpath=//input[@placeholder='请填写法人']");
    private UIElement BTN_newContract = new UIElement("xpath=//*[text()='合同']/parent::button");
    private UIElement INP_renter = new UIElement("xpath=//*[@class='ant-select-search__field']");
    private UIElement BTN_Addbuilding = new UIElement("xpath=//*[text()='+ 房源']");
    private UIElement TXT_building = new UIElement("xpath=//h3[text()='xywu楼']");
    private UIElement TXT_thisBuildingRoom = new UIElement(
            "xpath=//*[text()='201']/parent::*/parent::*/dt[input]/input");
    private UIElement BTN_nextStep = new UIElement("xpath=//span[text()='下一步']/parent::button");
    private UIElement INP_deposit = new UIElement("xpath=//*[@id='deposit']");
    private UIElement BTN_propertyRentStatement = new UIElement("xpath=//span[text()='点击生成物业费明细']/parent::button");
    private UIElement BTN_save = new UIElement("xpath=//span[text()='保存 & 发起审批']/parent::button");

    private UIElement TXT_PropertyContract = new UIElement("xpath=//ul[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]");
    private UIElement BTN_LookOa = new UIElement("xpath=//span[text()='查看审核']/parent::button");
    private UIElement BTN_OaPass = new UIElement("xpath=//span[text()='审核通过']/parent::button");
    private UIElement BTN_BlanckConfirm = new UIElement("xpath=//span[text()='确 定']/parent::button");
    private UIElement BTN_Ok = new UIElement("xpath=//button[text()='确认']");
    private UIElement BTN_Withdrawal = new UIElement("xpath=//span[text()='退 租']/parent::button");
    private UIElement BTN_SaveAndPush = new UIElement("xpath=//span[text()='保存&提交']/parent::button");
    private UIElement BTN_Cha = new UIElement("xpath=//i[@class='creamsicon_17 backArrow___1DRT5']");
    private UIElement TXT_PropertyStatus = new UIElement("xpath=//span[text()='已退租']");
    private UIElement BTN_Invalid = new UIElement("xpath=//span[text()='作 废']/parent::button");
    private UIElement TXT_InvalidReason = new UIElement("xpath=//textarea[@placeholder='请填写作废原因']");
    private UIElement BTN_BillsFilterBox = new UIElement("xpath=//thead[@class='ant-table-thead']/descendant::input");
    private UIElement BTN_Delete = new UIElement("xpath=//span[text()='删 除']/parent::button");
    private UIElement BTN_saveProperty = new UIElement("xpath=//span[text()='保 存']/parent::button");
    private UIElement TXT_BillType = new UIElement("xpath=//p[text()='物业退租结算']");

    private UIElement editAmmeter(String choose) {
        return new UIElement("xpath=//*[text()='" + choose
                + "']/parent::td/following-sibling::td[7]/div/span/i[@class='anticon anticon-edit']");
    }

    private UIElement currentReading(String choose) {
        return new UIElement("xpath=//*[text()='" + choose + "']/parent::td/following-sibling::td[4]/div/div/input");
    }

    private UIElement currentPrice(String choose) {
        return new UIElement("xpath=//*[text()='" + choose + "']/parent::td/following-sibling::td[5]/div/div/input");
    }

    private UIElement currentDate(String choose) {
        return new UIElement(
                "xpath=//*[text()='" + choose + "']/parent::td/following-sibling::td[6]/div/div/span/div/input");
    }

    private UIElement contractStatus(String choose) {
        return new UIElement("xpath=//span[text()='" + choose + "']");
    }

    private UIElement invalidMethod(String invalidMethod) {
        return new UIElement("xpath=//span[text()='" + invalidMethod + "']/preceding-sibling::span");
    }

    private UIElement renterName(String renter) {
        return new UIElement("xpath=//div[text()='付款方:" + renter + "']");
    }

    private List<String> rentalDetails(UIElement txt) {
        return this.driver.allElementsGetText(txt);
    }

    public void gotoEstateManagement() {
        this.driver.click(TXT_EstateManagement);
    }

    public void EstatePriceDescending() {
        this.driver.waitForElement(BTN_EstatePriceDescending, 25);
        this.driver.click(BTN_EstatePriceDescending);
    }

    public void EstatePriceAscending() {
        this.driver.waitForElement(BTN_EstatePriceAscending, 25);
        this.driver.click(BTN_EstatePriceAscending);
    }

    public void RentDayDescending() {
        this.driver.waitForElement(BTN_RentDayDescending, 25);
        this.driver.click(BTN_RentDayDescending);
    }

    public void RentDayAscending() {
        this.driver.waitForElement(BTN_RentDayAscending, 25);
        this.driver.click(BTN_RentDayAscending);
    }

    public void SettlementDateDescending() {
        this.driver.waitForElement(BTN_SettlementDateDescending, 25);
        this.driver.click(BTN_SettlementDateDescending);
    }

    public void SettlementDateAscending() {
        this.driver.waitForElement(BTN_SettlementDateAscending, 25);
        this.driver.click(BTN_SettlementDateAscending);
    }

    public List<String> EstatePrice() {
        this.driver.sleep(5000);
        return this.rentalDetails(TXT_EstatePrice);
    }

    public List<String> RentDay() {
        this.driver.sleep(5000);
        return this.rentalDetails(TXT_RentDay);
    }

    public List<String> SettlementDate() {
        this.driver.sleep(5000);
        return this.rentalDetails(TXT_SettlementDate);
    }

    public void gotoAmmeterReadingManagement() {
        this.driver.click(TXT_EstateManagement);
        this.driver.click(BTN_AmmeterReadingManagement);
    }

    public String editReading(String ammeter, String currentReading, String date) {
        this.driver.waitAndClick(this.editAmmeter(ammeter), 2);
        this.driver.elementSendText(this.currentReading(ammeter), currentReading);
        String currentPrice = this.driver.elementGetValue(this.currentPrice(ammeter));
        this.driver.waitForElement(this.currentDate(ammeter), 2);
        this.driver.selectDate(this.currentDate(ammeter), BTN_AmmeterReadingManagement, date);
        return currentPrice;
    }

    public String modifyCurrentPrice(String ammeter, String currentPrice) {
        this.driver.waitAndClick(this.editAmmeter(ammeter), 2);
        this.driver.elementSendText(this.currentPrice(ammeter), currentPrice);
        String currentReading = this.driver.elementGetValue(this.currentReading(ammeter));
        this.driver.waitForElement(this.currentDate(ammeter), 2);
        return currentReading;
    }

    public void chooseEndDate(String startDate, String endDate) {
        this.driver.waitAndClick(BTN_ChooseEndDate, 5);
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_FilterBox, 5);
        this.driver.sleep(1000);
        this.driver.elementSendText(BTN_EndDate, endDate);
        this.driver.elementSendText(BTN_StartDate, startDate);
    }

    public String getTime(String user_time) {
        String re_time = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d;
        try {
            d = sdf.parse(user_time);
            long l = d.getTime();
            String str = String.valueOf(l);
            re_time = str.substring(0, 10);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return re_time;
    }

    public String getTimeSlash(String user_time) {
        String re_time = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d;
        try {
            d = sdf.parse(user_time);
            long l = d.getTime();
            String str = String.valueOf(l);
            re_time = str.substring(0, 10);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return re_time;
    }

    public List<String> endDateList() {
        this.driver.sleep(5000);
        return this.driver.allElementsGetText(TXT_EndDateList);
    }

    public void chooseContractStatus(String status) {
        this.driver.waitAndClick(BTN_ChooseContractStatus, 5);
        this.driver.sleep(1000);
        this.driver.waitAndClick(this.contractStatus(status), 5);
        this.driver.click(BTN_Confirm);
    }

    public List<String> contractStatusList() {
        this.driver.sleep(5000);
        return this.driver.allElementsGetText(TXT_ContractStatusList);
    }

    public void sizeDesc() {
        this.driver.sleep(1000);
        this.driver.click(BTN_SizeDesc);
    }

    public List<String> sizeList() {
        this.driver.sleep(5000);
        return this.driver.allElementsGetText(TXT_SizeList);
    }

    public void gotoArchiveContract() {
        this.driver.click(TXT_EstateManagement);
        this.driver.sleep(1000);
        this.driver.click(BTN_ArchiveContract);
        this.driver.sleep(1000);
    }

    public void gotoContractInfo() {
        this.driver.sleep(1000);
        this.driver.click(TXT_ContractList);
    }

    public boolean[] checkContractInfo() {
        this.driver.sleep(1000);
        boolean[] isFound = new boolean[5];
        isFound[0] = this.driver.isElementFound(TXT_RenterInfo);
        isFound[1] = this.driver.isElementFound(TXT_RoomInfo);
        isFound[2] = this.driver.isElementFound(TXT_Invoice);
        isFound[3] = this.driver.isElementFound(TXT_BasicTerms);
        isFound[4] = this.driver.isElementFound(TXT_PropertyFeeTerms);
        return isFound;
    }

    public void clickAddPropertyContract() {
        this.driver.click(BTN_AddPropertyContract);
    }

    public String[] checkFillContractInfo() {
        this.driver.sleep(1000);
        String[] fillInfo = new String[3];
        fillInfo[0] = this.driver.elementGetValue(TXT_Tenant);
        fillInfo[1] = this.driver.elementGetValue(TXT_Industry);
        fillInfo[2] = this.driver.elementGetValue(TXT_LegalPerson);
        return fillInfo;
    }

    public void gotoPropertyContract() {
        this.driver.click(TXT_EstateManagement);
    }

    public void createPropertyContract(String renter, String deposit) {
        this.driver.sleep(1000);
        this.driver.click(BTN_newContract);
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_renter, renter);
        this.driver.sleep(1000);
        this.driver.click(BTN_Addbuilding);
        this.driver.sleep(1000);
        this.driver.click(TXT_building);
        this.driver.waitAndClick(TXT_thisBuildingRoom, 5);
        this.driver.sleep(2000);
        this.driver.click(BTN_nextStep);
        this.driver.elementSendText(INP_deposit, deposit);
        this.driver.click(BTN_propertyRentStatement);
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_save, 5);
    }

    public void oaPropertyContract() {
        this.driver.sleep(1000);
        this.driver.click(TXT_PropertyContract);
        this.driver.waitClickable(BTN_LookOa, 5);
        this.driver.click(BTN_LookOa);
        this.driver.waitClickable(BTN_OaPass, 5);
        this.driver.click(BTN_OaPass);
        this.driver.waitClickable(BTN_BlanckConfirm, 5);
        this.driver.click(BTN_BlanckConfirm);
        this.driver.waitClickable(BTN_Ok, 5);
        this.driver.click(BTN_Ok);
        this.driver.sleep(1000);
    }

    public void withdrawalPropertyContract() {
        this.driver.sleep(1000);
        this.driver.click(TXT_PropertyContract);
        this.driver.waitClickable(BTN_Withdrawal, 5);
        this.driver.click(BTN_Withdrawal);
        this.driver.waitClickable(BTN_SaveAndPush, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_SaveAndPush);
        this.driver.waitClickable(BTN_Ok, 5);
        this.driver.click(BTN_Ok);
        this.driver.sleep(2000);
        this.driver.click(BTN_Cha);
    }

    public boolean isWithdrawalPropertyContract() {
        this.driver.sleep(1000);
        this.driver.click(TXT_PropertyContract);
        return this.driver.waitForElement(TXT_PropertyStatus, 5);
    }

    public boolean isWithdrawalBills() {
        this.driver.sleep(1000);
        this.driver.click(TXT_PropertyContract);
        return this.driver.waitForElement(TXT_BillType, 5);
    }

    public void invalidPropertyContract(String processBills) {
        this.driver.sleep(1000);
        this.driver.click(TXT_PropertyContract);
        this.driver.waitClickable(BTN_Invalid, 5);
        this.driver.click(BTN_Invalid);
        this.driver.sleep(2000);
        this.driver.elementSendText(TXT_InvalidReason, "123");
        this.driver.click(this.invalidMethod(processBills));
        this.driver.click(BTN_saveProperty);
        this.driver.waitClickable(BTN_Ok, 5);
        this.driver.click(BTN_Ok);
        this.driver.sleep(2000);
        this.driver.click(BTN_Cha);
    }

    public boolean verifyBills(String renter) {
        this.driver.sleep(1000);
        try {
            this.driver.click(TXT_PropertyContract);
        }
        catch (Exception e){

        }
        return this.driver.waitForElement(this.renterName(renter), 5);
    }

    public void clickCha(){
        this.driver.sleep(2000);
        this.driver.click(BTN_Cha);
    }

    public void deleteBills() {
        this.driver.sleep(1000);
        this.driver.MoveToElement(BTN_BillsFilterBox);
        this.driver.click(BTN_BillsFilterBox);
        this.driver.waitClickable(BTN_Delete, 5);
        this.driver.click(BTN_Delete);
        this.driver.waitClickable(BTN_Ok, 5);
        this.driver.click(BTN_Ok);
    }
}
