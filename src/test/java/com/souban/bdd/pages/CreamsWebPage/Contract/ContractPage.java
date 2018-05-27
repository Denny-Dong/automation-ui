package com.souban.bdd.pages.CreamsWebPage.Contract;

import java.util.List;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class ContractPage extends ParentPage {

    public ContractPage(Driver driver) {
        super(driver);
    }

    private UIElement BTN_NewContract = new UIElement("xpath=//*[@class='contractNew___1sR8R']/i");
    private UIElement TXT_NewContract = new UIElement("xpath=//*[text()='新建合同申请']");
    private UIElement LST_SelectorOfBuilding = new UIElement("xpath=//*[@placeholder='请选择房源']");
    private UIElement BTN_IndividualLease = new UIElement("xpath=//*[text()='个人租赁']");
    private UIElement BTN_SelectorOfIndustry = new UIElement(
            "xpath=//*[@class='ant-select-lg ant-select ant-select-enabled']/div");
    private UIElement INP_SignerName = new UIElement("id=signerName");
    private UIElement INP_SignerTel = new UIElement("id=signerTel");
    private UIElement INP_SignerAddress = new UIElement("id=address");
    private UIElement BTN_ContractRent = new UIElement("xpath=//*[text()='合同租金']");
    private UIElement TXT_TitleofContractInfo = new UIElement("xpath=//*[text()='合同信息']");
    private UIElement TXT_ContractDate = new UIElement("xpath=//*[text()='合同签订日期:']");
    private UIElement INP_ContractDate = new UIElement(
            "xpath=//*[text()='合同签订日期:']/following-sibling::div[@class='inputContainer___2C_NT']//input[@class='ant-calendar-picker-input ant-input']");
    private UIElement TXT_CurrentContract = new UIElement("xpath=//*[text()='当前合同']");
    // 合同新建下一步及作废页面元素
    private UIElement INP_Rent = new UIElement("name=primePrice");
    private UIElement INP_Months_Rent = new UIElement(
            "xpath=//*[@class='row___16rQ1 aboveInputs___3EqSj']/div[1]/div[2]/div[2]/span[1]/input");
    private UIElement INP_Months_Deposit = new UIElement(
            "xpath=//*[@class='row___16rQ1 aboveInputs___3EqSj']/div[1]/div[3]/div[2]/span/input");
    private UIElement INP_Days_Pay = new UIElement(
            "xpath=//div[@class='row___16rQ1 aboveInputs___3EqSj']/div[1]/div[4]/div[2]/span/input");
    private UIElement BTN_Oneyear = new UIElement("xpath=//*[text()='一年']");
    private UIElement BTN_Rentdetails = new UIElement("xpath=//*[text()='生成租金明细']");
    private UIElement BTN_Submit = new UIElement("xpath=//*[text()='提交']");
    private UIElement BTN_ok = new UIElement("xpath=//*[text()='确认']");
    private UIElement BTN_Pass = new UIElement("xpath=//*[text()='审核通过']");
    private UIElement BTN_Invalid = new UIElement("xpath=//*[text()='作废']");
    private UIElement INP_Invalidreason = new UIElement("xpath=//*[text()='作废原因:']/following-sibling::textarea");
    private UIElement BTN_Invalidreview = new UIElement(
            "xpath=//*[@class='headerRightButton___2KG8r primaryColorButton___3sHfM']");
    private UIElement BTN_ContractPlus = new UIElement("xpath=//*[@class='addButton___2Y8TM']");

    // 合同退租的element
    private UIElement BTN_RentOut = new UIElement("xpath=//*[text()='退租']");
    private UIElement BTN_BreachOfContract = new UIElement("xpath=//*[text()='违约金:']/following-sibling::span/input");
    private UIElement BTN_PriceCause = new UIElement("xpath=//*[text()='价格因素']");
    private UIElement BTN_AuditSubmission = new UIElement("xpath=//*[text()='提交']");
    private UIElement BTN_ReturnToReview = new UIElement(
            "xpath=//*[@class='headerRightButton___2KG8r primaryColorButton___3sHfM']");
    private UIElement BTN_ReviewPassed = new UIElement("xpath=//*[text()='审核通过']");
    private UIElement BTN_RentOutToBeSettle = new UIElement(
            "xpath=//*[@class='headerRightButton___u0Win warningColorButton___2_nEw']");
    private UIElement INP_ActualRefund = new UIElement("xpath=//*[@class='ant-input-affix-wrapper']/input");
    private UIElement BTN_IsSettle = new UIElement("xpath=//*[text()='勾选此项表示已完成此合同的全部退租流程']");
    private UIElement BTN_ConfirmTheArrears = new UIElement("xpath=//*[@class='button___1ZhKY']/span[text()='确认欠款到账']");
    private UIElement TXT_Settled = new UIElement("xpath=//*[text()='退租已结清']");

    // 保证金交纳的element
    private UIElement BTN_MarginPayment = new UIElement("xpath=//*[text()='保证金交纳']");
    private UIElement BTN_IsSubmit = new UIElement("xpath=//*[text()='已结清']/following-sibling::label/span");

    // 收租的element
    private UIElement TXT_RentDetails = new UIElement("xpath=//*[text()='收租明细']");
    private UIElement BTN_EditPayment = new UIElement("xpath=//*[@class='tbody___3ZQJH']/tr[1]/td[6]/div/div[5]/i");
    private UIElement TXT_PaymentStatus = new UIElement("xpath=//*[@class='tbody___3ZQJH']/tr[1]/td[6]/div/div[1]");
    private UIElement TXT_SettleStatus = new UIElement("xpath=//*[@class='tbody___3ZQJH']/tr[1]/td[6]/div/div[2]/span");
    private UIElement BTN_RentIsReceipt = new UIElement(
            "xpath=//*[@class='tbody___3ZQJH']/tr[1]/td[4]/ul/li/label/span");
    private UIElement BTN_IsInvoice = new UIElement("xpath=//*[@class='tbody___3ZQJH']/tr[1]/td[5]/div/label/span");
    private UIElement BTN_IsSettled = new UIElement(
            "xpath=//*[@class='tbody___3ZQJH']/tr[1]/td[6]/div/div[2]/label/span");
    private UIElement BTN_SubmitSettled = new UIElement("xpath=//*[@class='tbody___3ZQJH']/tr[1]/td[7]/div/button[1]");

    private UIElement BTN_Threeyear = new UIElement("xpath=//*[text()='三年']");
    private UIElement INP_FirstYearDiscount = new UIElement(
            "xpath=//div[@class='increaseContainer___2rLMx']/div/div[1]/span[2]/input");
    private UIElement INP_SecondYearDiscount = new UIElement(
            "xpath=//div[@class='increaseContainer___2rLMx']/div/div[2]/span[2]/input");
    private UIElement INP_ThirdYearDiscount = new UIElement(
            "xpath=//div[@class='increaseContainer___2rLMx']/div/div[3]/span[2]/input");
    private UIElement INP_SecondYearIncrease = new UIElement(
            "xpath=//div[@class='increaseContainer___2rLMx']/div/div[2]/span[1]/input");
    private UIElement INP_ThirdYearIncrease = new UIElement(
            "xpath=//div[@class='increaseContainer___2rLMx']/div/div[3]/span[1]/input");
    private UIElement TXT_DateIntervalMin = new UIElement(
            "xpath=//*[@class='rent-g-table-content___2kwkL']/div[1]/span[1]");
    private UIElement TXT_PaymentDay = new UIElement("xpath=//*[@class='rent-g-table-content___2kwkL']/div[2]/span");
    private UIElement TXT_Increase = new UIElement("xpath=//*[@class='rent-g-table-content___2kwkL']/div[3]/span");
    private UIElement TXT_UnitPrice = new UIElement("xpath=//*[@class='rent-g-table-content___2kwkL']/div[4]/span");
    private UIElement TXT_Discount = new UIElement("xpath=//*[@class='rent-g-table-content___2kwkL']/div[5]/span");
    private UIElement TXT_ActualPrice = new UIElement("xpath=//*[@class='rent-g-table-content___2kwkL']/div[6]/span");
    private UIElement TXT_FinalAmount = new UIElement("xpath=//*[@class='rent-g-table-content___2kwkL']/div[7]/span");

    // 新建合同第一步
    private UIElement BTN_BasicInformation = new UIElement("xpath=//*[text()='基本信息']");
    private UIElement BTN_RentContract = new UIElement("xpath=//*[text()='合同租金']");
    private UIElement BTN_Settlement = new UIElement("xpath=//*[text()='退租结算']");
    private UIElement TXT_BasicInformation = new UIElement("xpath=//*[text()='房源信息']");
    private UIElement TXT_RentContract = new UIElement("xpath=//*[text()='合同信息']");
    private UIElement BTN_FinancialAudit = new UIElement("xpath=//*[text()='财务审核']");

    private UIElement TXT_Building = new UIElement("xpath=//*[@class='buildingBox___16ZAO']");
    private UIElement BTN_RightArrow = new UIElement("xpath=//*[@class='creamsicon backArrow___1FLCs']");
    private UIElement TXT_OtherRoom = new UIElement(
            "xpath=//*[@class='room___1WgwJ occupied___AwtPt' and @style='width: 42.3%; transition: width 0.75s ease-in-out;']");
    private UIElement TXT_lookOther = new UIElement("xpath=//*[@class='words___17gR8 undefined']");

    private UIElement SelectBuilding(String choose) {
        return new UIElement("xpath=//*[@class='ant-cascader-menu']/li[text()='" + choose + "']");
    }

    private UIElement SelectIndustry(String choose) {
        return new UIElement("xpath=//*[@role='menu']/li[text()='" + choose + "']");
    }

    private UIElement SelectRoom(String choose) {
        return new UIElement("xpath=//*[text()='" + choose + "']");
    }

    private UIElement chooseBuilding(String choose) {
        return new UIElement("xpath=//*[@class='info___1Dhyq']/div[text()='" + choose + "']");
    }

    private UIElement gotoBuilding(String choose) {
        return new UIElement("xpath=//*[@class='titleBox___1Rwck']/div[text()='" + choose + "']");
    }

    private List<String> rentalDetails(UIElement txt) {
        return this.driver.allElementsGetText(txt);
    }

    public boolean enterNewContractPage() {
        this.driver.sleep(1000);
        this.driver.click(BTN_NewContract);
        return this.driver.waitForElement(TXT_NewContract, 5);
    }

    public void selectHousingResource(String building, String unit, String floor, String room) {
        this.driver.waitAndClick(LST_SelectorOfBuilding, 2);
        this.driver.waitAndClick(this.SelectBuilding(building), 2);
        this.driver.waitAndClick(this.SelectBuilding(unit), 2);
        this.driver.scrollToText(this.SelectBuilding(floor));
        this.driver.waitAndClick(this.SelectBuilding(floor), 2);
        this.driver.waitAndClick(this.SelectBuilding(room), 2);
    }

    public void selectIndividualLeaseAndIndustry(String industry) {
        this.driver.click(BTN_IndividualLease);
        this.driver.click(BTN_SelectorOfIndustry);
        this.driver.waitAndClick(this.SelectIndustry(industry), 2);
    }

    public void inputSignerNameSignerTelAndAddress(String signerName, String signerTel, String address) {
        this.driver.elementSendText(INP_SignerName, signerName);
        this.driver.elementSendText(INP_SignerTel, signerTel);
        this.driver.elementSendText(INP_SignerAddress, address);
    }

    public boolean enterContractInfoPage() {
        this.driver.click(BTN_ContractRent);
        this.driver.sleep(1000);
        return this.driver.waitForElement(TXT_TitleofContractInfo, 5);
    }

    public void inputContractInfo(String Date) {
        this.driver.selectDate(INP_ContractDate, TXT_ContractDate, Date);
    }

    public void inputRentMonths_rentMonths_depositDays_pay(String rent, String months_rent, String months_deposit,
                                                           String days_pay) {
        this.driver.elementSendText(INP_Rent, rent);
        this.driver.elementSendText(INP_Months_Rent, months_rent);
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_Months_Deposit, months_deposit);
        this.driver.elementSendText(INP_Days_Pay, days_pay);
    }

    public void clickTheButtonOfOneYear() {
        this.driver.click(BTN_Oneyear);
    }

    public void clickTheButtonOfRentDetails() {
        this.driver.click(BTN_Rentdetails);
    }

    public void submitCreateContract() {
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_Submit, 2);
        this.driver.sleep(1000);
        this.driver.click(BTN_ok);
        this.driver.sleep(1000);
        this.driver.click(BTN_ok);
    }

    public void reviewOfCreate() {
        this.driver.waitForElement(BTN_Invalidreview, 2);
        this.driver.click(BTN_Invalidreview);
        this.driver.sleep(1000);
        this.driver.waitForElement(BTN_ReviewPassed, 2);
        this.driver.click(BTN_ReviewPassed);
        this.driver.sleep(1000);
        this.driver.waitForElement(BTN_ok, 2);
        this.driver.click(BTN_ok);
    }

    public boolean createNewContractSuccessfully() {
        this.driver.waitForElement(TXT_CurrentContract, 2);
        return this.driver.isElementFound(BTN_Invalid);
    }

    public void invalidContract(String invalidReason) {
        this.driver.click(BTN_Invalid);
        this.driver.waitAndClick(BTN_RentContract, 2);
        this.driver.waitForElement(INP_Invalidreason, 2);
        this.driver.elementSendText(INP_Invalidreason, invalidReason);
        this.driver.click(BTN_Submit);
        this.driver.sleep(1000);
        this.driver.waitForElement(BTN_ok, 2);
        this.driver.click(BTN_ok);
    }

    public void reviewOfInvalid(String room) {
        this.driver.refresh();
        this.driver.waitAndClick(this.SelectRoom(room), 2);
        this.driver.waitAndClick(BTN_Invalidreview, 3);
        this.driver.waitAndClick(BTN_Pass, 2);
        this.driver.sleep(1000);
        this.driver.waitForElement(BTN_ok, 2);
        this.driver.click(BTN_ok);
    }

    public boolean checkInvalidSuccess(String room) {
        this.driver.refresh();
        this.driver.waitAndClick(this.SelectRoom(room), 2);
        this.driver.waitForElement(TXT_CurrentContract, 2);
        return this.driver.isElementFound(BTN_ContractPlus);
    }

    // 合同退租
    public void GotoContract(String building, String room) {
        this.driver.waitAndClick(this.chooseBuilding(building), 2);
        this.driver.waitAndClick(this.gotoBuilding(building), 2);
        this.driver.waitAndClick(this.SelectRoom(room), 2);
    }

    public boolean createNewContractSuccessfully(String room) {
        this.driver.refresh();
        this.driver.sleep(1000);
        this.driver.waitForElement(this.SelectRoom(room), 2);
        this.driver.click(this.SelectRoom(room));
        this.driver.waitForElement(TXT_CurrentContract, 2);
        return this.driver.isElementFound(BTN_Invalid);
    }

    public void rentOut() {
        this.driver.click(BTN_RentOut);
        this.driver.waitForElement(BTN_Settlement, 2);
        this.driver.click(BTN_Settlement);
        this.driver.waitForElement(BTN_BreachOfContract, 2);
        this.driver.elementSendText(BTN_BreachOfContract, "0");
        this.driver.click(BTN_PriceCause);
        this.driver.click(BTN_AuditSubmission);
    }

    public void reviewOfRentOut(String room) {
        this.driver.refresh();
        this.driver.sleep(1000);
        this.driver.waitAndClick(this.SelectRoom(room), 2);
        this.driver.waitAndClick(BTN_ReturnToReview, 2);
        this.driver.waitAndClick(BTN_Pass, 2);
        this.driver.waitAndClick(BTN_ok, 2);
    }

    public void settlementOfRentOut(String room, String account) {
        this.driver.refresh();
        this.driver.sleep(1000);
        this.driver.waitAndClick(this.SelectRoom(room), 2);
        this.driver.waitForElement(BTN_RentOutToBeSettle, 2);
        this.driver.click(BTN_RentOutToBeSettle);
        this.driver.waitForElement(BTN_FinancialAudit, 2);
        this.driver.click(BTN_FinancialAudit);
        this.driver.waitForElement(INP_ActualRefund, 2);
        this.driver.elementSendText(INP_ActualRefund, account);
        this.driver.click(BTN_IsSettle);
        this.driver.click(BTN_ConfirmTheArrears);
        this.driver.waitForElement(BTN_ok, 2);
        this.driver.click(BTN_ok);
    }

    public boolean theRentHasBeenClosed(String room) {
        this.driver.refresh();
        this.driver.sleep(1000);
        this.driver.waitAndClick(this.SelectRoom(room), 2);
        return this.driver.waitForElement(TXT_Settled, 5);
    }

    // 保证金交纳
    public void clickMarginPayment() {
        this.driver.waitForElement(BTN_MarginPayment, 2);
        this.driver.click(BTN_MarginPayment);
    }

    public void SubmitMargin() {
        this.driver.waitAndClick(BTN_IsSubmit, 2);
        this.driver.click(BTN_Submit);
    }

    public boolean hasNoMarginPaymentButton() {
        return this.driver.isElementFound(BTN_MarginPayment);
    }

    // 结清付款
    public void clickRentDetails() {
        this.driver.waitForElement(TXT_RentDetails, 2);
        this.driver.click(TXT_RentDetails);
    }

    public String checkPaymentStatus() {
        this.driver.waitForElement(TXT_PaymentStatus, 2);
        this.driver.sleep(1000);
        return this.driver.elementGetText(TXT_PaymentStatus) + "," + this.driver.elementGetText(TXT_SettleStatus);
    }

    public void settleTheCurrentUnpaid() {
        this.driver.click(BTN_EditPayment);
        this.driver.click(BTN_RentIsReceipt);
        this.driver.click(BTN_IsInvoice);
        this.driver.click(BTN_IsSettled);
        this.driver.click(BTN_SubmitSettled);
    }

    public void clickTheButtonThreeYear() {
        this.driver.click(BTN_Threeyear);
    }

    public void input(String firstYearDiscount, String secondYearIncrease, String secondYearDiscount,
                      String ThirdYearIncrease, String ThirdYearDiscount) {
        this.driver.elementSendText(INP_FirstYearDiscount, firstYearDiscount);
        this.driver.elementSendText(INP_SecondYearIncrease, secondYearIncrease);
        this.driver.elementSendText(INP_SecondYearDiscount, secondYearDiscount);
        this.driver.elementSendText(INP_ThirdYearIncrease, ThirdYearIncrease);
        this.driver.elementSendText(INP_ThirdYearDiscount, ThirdYearDiscount);
    }

    public List<String> checkIncrease() {
        this.driver.sleep(1000);
        return this.rentalDetails(TXT_Increase);
    }

    public List<String> checkUnitPrice() {
        this.driver.sleep(1000);
        return this.rentalDetails(TXT_UnitPrice);
    }

    public List<String> checkDiscount() {
        this.driver.sleep(1000);
        return this.rentalDetails(TXT_Discount);
    }

    public List<String> checkActualPrice() {
        this.driver.sleep(1000);
        return this.rentalDetails(TXT_ActualPrice);
    }

    public List<String> checkFinalAmount() {
        this.driver.sleep(1000);
        return this.rentalDetails(TXT_FinalAmount);
    }

    public List<String> checkDateInterval() {
        this.driver.sleep(1000);
        return this.rentalDetails(TXT_DateIntervalMin);
    }

    public List<String> checkPaymentDay() {
        this.driver.sleep(1000);
        return this.rentalDetails(TXT_PaymentDay);
    }

    public void clickTheButtonOfBasicInformation() {
        this.driver.click(BTN_BasicInformation);
    }

    public boolean BasicInformation() {
        return this.driver.waitForElement(TXT_BasicInformation, 5);
    }

    public void clickTheButtonOfRentContract() {
        this.driver.click(BTN_RentContract);

    }

    public boolean RentContract() {
        return this.driver.waitForElement(TXT_RentContract, 5);
    }

    public boolean Submit() {
        return this.driver.waitForElement(BTN_Submit, 5);
    }

    public void back() {
        this.driver.click(BTN_RightArrow);

    }

    // creams2.0

    private UIElement TXT_thisBuildingRoomList = new UIElement("xpath=//*[@class='rooms___3fIkc']");
    private UIElement BTN_nextStep = new UIElement("xpath=//span[text()='下一步']/parent::button");
    private UIElement BTN_save = new UIElement("xpath=//span[text()='保 存']/parent::button");

    private UIElement INP_basePrice = new UIElement("xpath=//*[@id='price_0']");

    private UIElement BTN_rentalStatement = new UIElement("xpath=//span[text()='点击生成租金明细']/parent::button");

    private UIElement TXT_newPropertyContractSuccessfully = new UIElement("xpath=//*[text()='新建成功']");
    private UIElement BTN_ContractEdit = new UIElement("xpath=//span[text()='编辑']");


    public void clickSave() {
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_save, 5);

    }

    public void clickRentalStatement() {
        this.driver.click(BTN_rentalStatement);

    }


    public boolean createNewPropertyContractSuccessfully() {
        return this.driver.waitForElement(TXT_newPropertyContractSuccessfully, 5);
    }


    public boolean buildingsListAn() {
        return this.driver.waitForElement(TXT_thisBuildingRoomList, 5);
    }


    public void enterContractEdit() {
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_ContractEdit, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_nextStep);

    }

    public void editBasePrice(String basePrice) {
        this.driver.elementClearText(INP_basePrice);
        this.driver.elementSendText(INP_basePrice, basePrice);

    }


}
