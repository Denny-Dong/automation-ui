package com.souban.bdd.pages.CreamsWebPage.RoomPage;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class RoomsManagePage extends ParentPage {


    public RoomsManagePage(Driver driver) {

        super(driver);
    }

    private UIElement BTN_myFloor = new UIElement(
            "//div[text()='石家庄市' ]/preceding-sibling::div[text()='wd测试楼']/parent::div");
    private UIElement BTN_myRoom = new UIElement("//span[text()='哈哈']/parent::div/parent::div/parent::div/parent::div");
    private UIElement BTN_myRoom2 = new UIElement(
            "//span[text()='测试合同']/parent::div/parent::div/parent::div/parent::div");
    private UIElement TXT_roomInformation = new UIElement("//*[text()='房源信息']");
    private UIElement BTN_deleteRoom = new UIElement("//*[text()='删除']");
    private UIElement BTN_sureDelete = new UIElement("//*[@class='souban-message-btn___u3mGi confirm___3zXXq']");
    private UIElement BTN_editRoom = new UIElement("//*[text()='编辑']");
    private UIElement TXT_editRoom = new UIElement("//*[text()='编辑房源']");
    private UIElement BTN_propertyContract = new UIElement("//div[text()='物业合同']/preceding-sibling::button");
    private UIElement BTN_addCustomer = new UIElement("//div[text()='客户']/preceding-sibling::button");
    private UIElement TXT_propertyContract = new UIElement("//div[text()='物业合同']");
    private UIElement BTN_propertyInformation = new UIElement("//*[text()='物业信息']");
    private UIElement INP_hireMan = new UIElement("//*[@class='ant-select-search__field']");
    private UIElement INP_propertyprice = new UIElement("//*[@id='propertyFeeAveragePrice']");
    private UIElement INP_propertyweek = new UIElement("//*[@id='propertyFeeMonthNumPerPay']");
    private UIElement INP_payday = new UIElement("//*[@id='propertyFeePayDayOfMonth']");
    private UIElement INP_powerwasteprice = new UIElement("//*[@id='energyConsumePrice']");
    private UIElement INP_powermoneyweek = new UIElement("//*[@id='energyConsumeMonthNumPerPay']");
    private UIElement INP_powerpayday = new UIElement("//*[@id='energyConsumePayDayOfMonth']");
    private UIElement BTN_propertyPayTime1 = new UIElement(
            "//*[@class='ant-col-7 item-label___1AK5v' and text()='物业费付款时间:']/following-sibling::div[@class='ant-col-2 item-label___1AK5v']/label");
    private UIElement BTN_energyPayTime1 = new UIElement(
            "//*[@class='ant-col-7 item-label___1AK5v' and text()='能耗费付款时间:']/following-sibling::div[@class='ant-col-2 item-label___1AK5v']/label");
    private UIElement LST_propertyType = new UIElement("//*[text()='物业类型']/parent::div/following-sibling::*");
    private UIElement BTN_getMoneyDetail = new UIElement("//*[text()='生成收款明细']");
    private UIElement BTN_saveProperty = new UIElement("//*[text()='提交']");
    private UIElement BTN_sureSaveProperty = new UIElement("//*[text()='确认']");
    private UIElement TXT_writeBuild = new UIElement("//li[text()='写字楼']");
    private UIElement BTN_DeleteProperty = new UIElement("//*[text()='作 废']");
    private UIElement TXT_reasonForDelete = new UIElement("//*[text()='作废原因:']/following-sibling::*");
    private UIElement BTN_sureDelete1 = new UIElement("//*[text()='提交']");
    private UIElement BTN_sureDelete2 = new UIElement("//*[text()='确认']");
    private UIElement BTN_hireNextStep = new UIElement("//span[text()='下一步']/parent::button");
    private UIElement BTN_saveHireContract = new UIElement("//span[text()='保存 & 发起审批']/parent::button");
    private UIElement BTN_save = new UIElement("//span[text()='保 存']/parent::button");
    private UIElement INP_custormerName = new UIElement("//div[text()='请填写租客']/following-sibling::ul/li/div/input");
    private UIElement BTN_sureOk = new UIElement("//button[text()='确认']");
    private UIElement BTN_addHireContract = new UIElement("//div[text()='租赁合同']/preceding-sibling::button");
    private UIElement TXT_newHireContract = new UIElement("//*[text()='新建租赁合同' ]");
    private UIElement INP_keepMoney = new UIElement("//*[@placeholder='请填写押金']");
    private UIElement INP_basicMoney = new UIElement("//*[@placeholder='请填写基础单价']");
    private UIElement INP_hireCustName = new UIElement("//div[text()='请填写姓名或公司']/following-sibling::ul/li/div/input");
    private UIElement BTN_clickHireDetail = new UIElement("//span[text()='点击生成租金明细']/parent::button");
    private UIElement BTN_seeCheck = new UIElement("//span[text()='查看审核']/parent::button");
    private UIElement BTN_closeAndDeleteSupport = new UIElement("//span[text()='关闭申请 & 删除合同']/parent::button");
    private UIElement BTN_buildManage = new UIElement("//a[text()='楼宇管理']");
    private UIElement BTN_together = new UIElement("//*[text()='集合']");
    private UIElement BTN_yes = new UIElement("xpath=//*[text()='是']/..");
    //点击选择楼宇编辑
    private UIElement SElECT_chooseBuilding = new UIElement("xpath=//*[text()='选择楼宇']/../following-sibling::*");

    //新增房源内房号输入框
    private UIElement INP_roomNum = new UIElement("xpath=//*[@placeholder='请输入房号']");
    //选择楼层
    private UIElement SELECT_chooseFloor = new UIElement("xpath=//*[text()='选择楼层']/../following-sibling::*");
    //新增房源内房号输入框
    private UIElement INP_area = new UIElement("xpath=//*[@placeholder='请输入面积']");
    //房源信息页新增客户按钮
    private UIElement BTN_addRenter = new UIElement("xpath=//*[contains(text(),'新建客户')]/..");
    //输入客户名
    private UIElement INP_renterName = new UIElement("xpath=//*[text()='请填写租客']/../descendant::input");

    //房源编辑页删除房源按钮
    private UIElement BTN_deleteRoomForEdit = new UIElement("xpath=//*[text()='删除房源']/..");

    //所有房源按钮
    private UIElement BTN_allRooms = new UIElement("xpath=//*[text()='所有房源']");

    //招商状态选择框
    private UIElement INP_status = new UIElement("xpath=//*[text()='招商状态']/../following-sibling::*/descendant::*[@class='ant-select-selection-selected-value']/..");


    /**
     * 提示框信息
     *
     * @param alertMessage
     * @return
     */
    private UIElement TXT_alertMessage(String alertMessage) {
        return new UIElement("xpath=//*[text()='" + alertMessage + "']");
    }

    /**
     * 房源列表某条数据
     *
     * @param roomNum
     * @return
     */
    private UIElement TXT_roomNum(String roomNum) {

        return new UIElement("xpath=//ol[@class='row___13zKH']/li[3]/*[text()='" + roomNum + "']");
    }

    /**
     * 招商状态select
     *
     * @param status 招商状态值
     * @return
     */
    private UIElement TXT_status(String status) {
        return new UIElement("xpath=//*[text()='" + status + "' and contains(@class,'ant-select-dropdown-menu-item')]");
    }

    /**
     * 确认按钮
     */
    private UIElement BTN_check = new UIElement("xpath=//*[text()='确认']");


    private UIElement chooseMyHouse(String roomNum) {
        return new UIElement("//span[text()='" + roomNum + "']/parent::div/parent::div/parent::div/parent::div");
    }

    private UIElement checkLatestHire(String hiremanname) {
        return new UIElement("//tbody/tr[1]/td[1][text()='" + hiremanname + "']");
    }

    private UIElement PropertyType(String propertytype) {
        return new UIElement("//li[text()='" + propertytype + "']");
    }

    private UIElement hireManName(String hiremanname) {
        return new UIElement("//tr[1]/td[text()='" + hiremanname + "']");
    }

    private UIElement chooseHireMan(String myCustomer) {
        return new UIElement("//*[@class='textBox0___LXsm0' and text()='" + myCustomer + "']");
    }

    private UIElement createCustomer(String customername) {
        return new UIElement("//tbody/tr[1]/td[1][text()='" + customername + "']");
    }

    public void clickTogether() {
        this.driver.waitAndClick(BTN_together, 5);
    }

    public void clickmyFloor() {
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_myFloor, 5);
    }

    public void clickRoomNoContract() {
        this.driver.waitClickable(BTN_myRoom, 5);
        this.driver.sleep(2000);
        this.driver.click(BTN_myRoom);
    }

    public void inHousePictrue(String roomNum) {
        this.driver.waitClickable(BTN_myFloor, 10);
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_myFloor, 5);
        this.driver.waitClickable(this.chooseMyHouse(roomNum), 5);
        this.driver.sleep(1000);
        this.driver.click(this.chooseMyHouse(roomNum));
        this.driver.sleep(2000);
    }

    public void clickRoomContract() {
        this.driver.sleep(1000);
        this.driver.click(BTN_myRoom2);
    }

    /**
     * 查看房源
     *
     * @return
     */
    public boolean checkroomInformation() {
        return this.driver.waitForElement(TXT_roomInformation, 5);
    }

    public void clickedit() {
        this.driver.waitClickable(BTN_editRoom, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_editRoom);
    }

    /**
     * 进入编辑
     *
     * @return
     */
    public boolean checkeditRoom() {
        return this.driver.waitForElement(TXT_editRoom, 5);
    }

    public boolean checkPropertyContract() {
        return this.driver.waitForElement(TXT_propertyContract, 5);
    }

    public boolean checkLatestHireman(String hiremanname) {
        return this.driver.waitForElement(this.checkLatestHire(hiremanname), 5);
    }

    /**
     * 创建物业合同
     *
     * @param hiremanname
     * @param propertytype
     * @param staticmoney
     * @param propertyprice
     * @param propertyweek
     * @param payday
     * @param powerwasteprice
     * @param powermoneyweek
     * @param powerpayday
     */
    public void fullPropertyInformation(String hiremanname, String propertytype, String staticmoney,
                                        String propertyprice, String propertyweek, String payday, String powerwasteprice, String powermoneyweek,
                                        String powerpayday) {
        this.driver.sleep(1000);
        this.driver.click(BTN_propertyContract);
        this.driver.sleep(1000);
        this.driver.elementClearText(INP_hireMan);
        this.driver.elementSendText(INP_hireMan, hiremanname);
        this.driver.sleep(3000);
        this.driver.click(BTN_propertyInformation);
        this.driver.sleep(1000);
        this.driver.click(LST_propertyType);
        this.driver.sleep(3000);
        this.driver.click(this.PropertyType(propertytype));
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_propertyprice, propertyprice);
        this.driver.elementSendText(INP_propertyweek, propertyweek);
        this.driver.click(BTN_propertyPayTime1);
        this.driver.click(BTN_energyPayTime1);
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_payday, payday);
        this.driver.elementSendText(INP_powerwasteprice, powerwasteprice);
        this.driver.elementSendText(INP_powermoneyweek, powermoneyweek);
        this.driver.elementSendText(INP_powerpayday, powerpayday);
        this.driver.click(BTN_getMoneyDetail);
        this.driver.sleep(1000);
        this.driver.click(BTN_saveProperty);
        this.driver.sleep(1000);
        this.driver.click(BTN_sureSaveProperty);
        this.driver.sleep(1000);
        this.driver.click(BTN_sureSaveProperty);
        this.driver.sleep(1000);
    }

    public boolean createPropertyContractSucceed(String hiremanname) {
        return this.driver.waitForElement(this.hireManName(hiremanname), 5);
    }

    /**
     * 删除物业合同
     *
     * @param hiremanname
     */
    public void deleteProperty(String hiremanname) {
        this.driver.sleep(2000);
        this.driver.click(this.hireManName(hiremanname));
        this.driver.sleep(1000);
        this.driver.click(BTN_DeleteProperty);
        this.driver.sleep(1000);
        this.driver.click(BTN_propertyInformation);
        this.driver.sleep(1000);
        this.driver.elementSendText(TXT_reasonForDelete, "554");
        this.driver.click(BTN_sureDelete1);
        this.driver.sleep(1000);
        this.driver.click(BTN_sureDelete2);
        this.driver.sleep(1000);
        this.driver.click(BTN_sureDelete2);
    }

    /**
     * 新建客户
     *
     * @param customername
     */
    public void fillCustomerInfo(String customername) {
        this.driver.sleep(1000);
        this.driver.click(BTN_addCustomer);
        this.driver.sleep(1000);
        this.driver.elementClearText(INP_custormerName);
        this.driver.elementSendText(INP_custormerName, customername);
        this.driver.sleep(1000);
        this.driver.click(BTN_save);
        this.driver.sleep(1000);
        this.driver.click(BTN_sureOk);
        this.driver.sleep(3000);

    }

    public boolean checkInNewHireCon() {
        this.driver.sleep(1000);
        return this.driver.waitForElement(TXT_newHireContract, 5);
    }

    public boolean checkHireSuc(String myCustomer) {
        this.driver.sleep(1000);
        return this.driver.waitForElement(this.chooseHireMan(myCustomer), 5);
    }

    /**
     * 新建租赁合同
     *
     * @param myCustomer
     * @param keepmoney
     * @param basicmoney
     */
    public void fillHireInfo(String myCustomer, String keepmoney, String basicmoney) {
        this.driver.sleep(1000);
        this.driver.click(BTN_addHireContract);
        this.driver.sleep(1000);
        this.driver.elementClearText(INP_hireCustName);
        this.driver.elementSendText(INP_hireCustName, myCustomer);
        this.driver.sleep(3000);
        this.driver.click(BTN_hireNextStep);
        this.driver.sleep(1000);
        this.driver.elementSendText(INP_keepMoney, keepmoney);
        this.driver.elementSendText(INP_basicMoney, basicmoney);
        this.driver.click(BTN_clickHireDetail);
        this.driver.sleep(1000);
        this.driver.click(BTN_saveHireContract);
        this.driver.sleep(1000);
    }

    /**
     * 删除租赁合同
     *
     * @param myCustomer
     */
    public void deleteHireContract(String myCustomer) {
        this.driver.sleep(1000);
        this.driver.click(this.chooseHireMan(myCustomer));
        this.driver.sleep(1000);
        this.driver.click(BTN_seeCheck);
        this.driver.sleep(1000);
        this.driver.click(BTN_closeAndDeleteSupport);
        this.driver.sleep(1000);
        this.driver.click(BTN_sureOk);
        this.driver.sleep(1000);
        this.driver.click(BTN_sureOk);
    }

    /**
     * 选择房源
     *
     * @param roomNum
     */
    public void clickMyRoom(String roomNum) {
        this.driver.click(BTN_buildManage);
        this.driver.sleep(2000);
        this.driver.refresh();
        this.driver.waitClickable(BTN_myFloor, 10);
        this.driver.sleep(1000);
        this.driver.click(BTN_myFloor);
        this.driver.sleep(2000);
        this.driver.click(this.chooseMyHouse(roomNum));
        this.driver.sleep(1000);
    }

    public boolean clickDelete(String customername) {
        this.driver.click(BTN_deleteRoom);
        this.driver.sleep(1000);
        this.driver.click(BTN_sureDelete);
        this.driver.sleep(1000);
        return this.checkCustormerSucceed(customername);
    }

    /**
     * 删除房源
     *
     * @param roomNum
     */
    public void clickdeleteRoom(String roomNum) {
        this.driver.click(BTN_buildManage);
        this.driver.sleep(2000);
        this.driver.refresh();
        this.driver.waitClickable(BTN_myFloor, 10);
        this.driver.sleep(1000);
        this.driver.click(BTN_myFloor);
        this.driver.sleep(2000);
        this.driver.click(this.chooseMyHouse(roomNum));
        this.driver.sleep(2000);
        this.driver.click(BTN_deleteRoom);
        this.driver.sleep(2000);
        this.driver.click(BTN_sureDelete);
        this.driver.sleep(1000);
        this.driver.refresh();
        this.driver.sleep(1000);
    }

    public boolean deleteSuc(String roomNum) {
        if (this.driver.isElementFound(this.chooseMyHouse(roomNum))) {
            this.driver.click(this.chooseMyHouse(roomNum));
            this.driver.sleep(2000);
            this.driver.sleep(2000);
            this.driver.click(BTN_deleteRoom);
            this.driver.sleep(2000);
            this.driver.click(BTN_sureDelete);
            this.driver.sleep(1000);
        }
        this.driver.sleep(1000);
        return this.driver.waitForElement(this.chooseMyHouse(roomNum), 5);
    }

    public boolean checkCustormerSucceed(String customername) {
        this.driver.sleep(1000);
        return this.driver.waitForElement(this.createCustomer(customername), 10);
    }

    /**
     * 点击保存
     */
    public void clickSaveCustomer() {
        this.driver.sleep(1000);
        this.driver.click(BTN_addCustomer);
        this.driver.sleep(1000);
        this.driver.click(BTN_save);
        this.driver.sleep(1000);

    }

    /**
     * 验证高亮提示
     *
     * @return
     */
    public boolean NewCustormerFail() {
        this.driver.sleep(2000);
        return this.driver.waitForElement(BTN_sureOk, 5);
    }

    /**
     * 点击删除房源按钮
     */
    public void clickDeleteRoom() {
        this.driver.waitClickable(BTN_deleteRoomForEdit, 2);
        this.driver.click(BTN_deleteRoomForEdit);
    }

    /**
     * 弹出删除二次确认框
     *
     * @param alertMessage 提示框信息
     */
    public void alertIsDeleteRoom(String alertMessage) {
        this.driver.waitForElement(TXT_alertMessage(alertMessage), 2);
    }


    /**
     * 点击是按钮，确认删除
     */
    public void clickYes() {
        this.driver.waitClickable(BTN_yes, 2);
        this.driver.click(BTN_yes);
    }

    /**
     * 弹出提示框，点击确认
     *
     * @param alertMessage 显示的提示信息
     */
    public void alertMessage(String alertMessage) {
        this.driver.waitForElement(TXT_alertMessage(alertMessage), 2);
        this.driver.waitClickable(BTN_check, 2);
        this.driver.click(BTN_check);
    }

    /**
     * 新增房源页选择楼宇
     *
     * @param building 楼宇名称
     */
    public void chooseBuiling(String building) {

        this.driver.click(SElECT_chooseBuilding);
        this.driver.sleep(2000);

        this.driver.click(BTN_chooseBuildingByAddRoom(building));
    }


    /**
     * 新增房源页选择楼宇
     *
     * @param building
     * @return
     */
    private UIElement BTN_chooseBuildingByAddRoom(String building) {
        return new UIElement("xpath=//*[@class='title___28WlQ titleImgModal___3LqjE crInfoTitle' ]/*[text()='" + building + "']");
    }

    /**
     * 输入房源信息
     *
     * @param floor   楼层
     * @param roomNum 房号
     * @param area    面积
     */
    public void confirmRoomInfo(String floor, String roomNum, String area) {
        this.driver.click(SELECT_chooseFloor);
        this.driver.waitClickable(BTN_chooseFloor(floor), 1);
        this.driver.sleep(2000);
        this.driver.click(BTN_chooseFloor(floor));
        this.driver.elementClearText(INP_roomNum);
        this.driver.elementSendText(INP_roomNum, roomNum);
        this.driver.elementClearText(INP_area);
        this.driver.elementSendText(INP_area, area);
    }


    /**
     * 新增房源页内选择楼层
     *
     * @param floor
     * @return
     */
    private UIElement BTN_chooseFloor(String floor) {
        return new UIElement("xpath=//ul[contains(@class,'ant-select-dropdown-menu')]/li[text()='" + floor + "']");
    }

    /**
     * 仅保存动作
     */
    public void clickSave() {
        this.driver.waitClickable(BTN_save, 2);
        this.driver.click(BTN_save);
    }

    /**
     * 房源列表选择房源
     *
     * @param roomNum
     */
    public void chooseRoomNum(String building, String roomNum) {

        this.driver.waitClickable(BTN_roomNumByList(building, roomNum), 2);
        this.driver.MoveToElement(BTN_roomNumByList(building, roomNum));
        this.driver.sleep(2000);
        this.driver.click(BTN_roomNumByList(building, roomNum));
    }


    /**
     * 房源列表房源
     *
     * @param roomNum
     * @return
     */
    private UIElement BTN_roomNumByList(String building, String roomNum) {
        return new UIElement("xpath=//*[text()='" + building + "']/../../li/*[text()='" + roomNum + "']/ancestor::ol");
    }

    /**
     * 房源信息页新增客户
     */
    public void clickAddRenter() {
        this.driver.waitClickable(BTN_addRenter, 2);
        this.driver.click(BTN_addRenter);
    }

    /**
     * 输入客户信息
     *
     * @param renter
     */
    public void inputRenterIfo(String renter) {
        this.driver.elementClearText(INP_renterName);
        this.driver.elementSendText(INP_renterName, renter);
        this.clickSave();
    }

    /**
     * 单一楼宇选择所有房源
     */
    public void allRooms() {
        this.driver.waitClickable(BTN_allRooms, 2);
        this.driver.click(BTN_allRooms);
    }

    /**
     * 点击房源详情页编辑房源按钮
     *
     * @param roomNum
     */
    public void clickEditRoom(String roomNum) {
        this.enterRoomDetails(roomNum);
        this.driver.waitClickable(BTN_editRoom, 2);
        this.driver.click(BTN_editRoom);

    }

    /**
     * 修改房源招商状态
     *
     * @param status
     */
    public void updateStatus(String status) {
        this.driver.sleep(2000);
        this.driver.click(INP_status);
        this.driver.waitClickable(TXT_status(status), 2);
        this.driver.click(TXT_status(status));
    }

    /**
     * 所有房源列表进入房源详情
     */
    public void enterRoomDetails(String roomNum) {
        this.driver.MoveToElement(TXT_roomNum(roomNum));
        this.driver.sleep(2000);
        this.driver.click(TXT_roomNum(roomNum));
    }

    /**
     * 检查房源的招商状态
     *
     * @param status
     */
    public boolean checkRoomStatus(String status) {
        this.driver.sleep(2000);
        return this.driver.elementGetText(new UIElement("xpath=//*[text()='招商状态']/../following-sibling::*")).equals(status);
    }

    /**
     * 判断列表高亮
     */
    public boolean isListSelected(String listName) {

        UIElement tempListName = new UIElement("xpath=//*[contains(@class,'ant-menu-item-selected')]/a[text()='" + listName + "']");

        return this.driver.isElementFound(tempListName);
    }

    /**
     * 进入可招商列表
     */
    public boolean enterInvitingInvestmentList() {
        String listName = "可招商";
        this.driver.click(BTN_roomList(listName));
        this.driver.sleep(2000);
        return this.isListSelected(listName);
    }

    /**
     * 进入已租房源列表
     */
    public boolean enterLetRoomList() {

        String listName = "已租房源";
        this.driver.click(BTN_roomList(listName));
        this.driver.sleep(2000);
        return this.isListSelected(listName);
    }

    /**
     * 房源管理下的列表
     *
     * @param roomListName
     * @return
     */
    private UIElement BTN_roomList(String roomListName) {
        return new UIElement("xpath=//a[text()='" + roomListName + "']");
    }

    /**
     * 进入已租房源列表
     */
    public boolean enterAllRoomList() {

        String listName = "所有房源";
        this.driver.click(BTN_roomList(listName));
        this.driver.sleep(2000);
        return this.isListSelected(listName);
    }

    /**
     * 检验房源存在
     *
     * @param roomNum
     */
    public boolean isExsitRoom(String roomNum) {

        return this.driver.isElementFound(TXT_roomNum(roomNum));
    }

}
