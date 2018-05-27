package com.souban.bdd.pages.CreamsWebPage.RoomPage;

import org.openqa.selenium.Keys;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class RoomsPage extends ParentPage {

    public RoomsPage(Driver driver) {
        super(driver);
    }

    // 房源
    private UIElement BTN_roomsManage = new UIElement("//*[text()='房源管理']");
    private UIElement BTN_newRoom = new UIElement("//span[text()='房源']/parent::button");
    private UIElement BTN_RcNewRoom = new UIElement("//span[text()='房源']/parent::button");
    private UIElement TXT_newRoom = new UIElement("//*[text()='有房源']");
    private UIElement LST_buildingsList = new UIElement(
            "xpath=//*[@class='ant-select-lg ant-select ant-select-enabled' and @style='width: 100%; height: 58px;']");
    private UIElement LST_floorsList = new UIElement("xpath=//*[text()='请选择楼层']");
    private UIElement INP_roomNum = new UIElement("//*[@placeholder='请输入房号']");
    private UIElement INP_roomArea = new UIElement("//*[@placeholder='请输入面积']");
    private UIElement LST_merchantsState = new UIElement("//*[@title='可招商']");
    private UIElement BTN_clearRoom = new UIElement("//*[text()='删除房源']/parent::button");
    private UIElement BTN_clearRoomYes = new UIElement("//*[text()='是']/parent::button");
    private UIElement BTN_submit = new UIElement("xpath=//span[text()='保 存']/parent::button");
    private UIElement LST_fitmentList = new UIElement("//*[text()='装修选择']");
    private UIElement TXT_workblank = new UIElement("//li[text()='毛坯']");
    private UIElement TXT_simple = new UIElement("//li[text()='简装']");
    private UIElement TXT_bound = new UIElement("//li[text()='精装']");
    private UIElement TXT_attract = new UIElement("//li[text()='可招商']");
    private UIElement TXT_unattract = new UIElement("//li[text()='不可招商']");

    /**
     * 房源管理下的列表
     */
    private UIElement TXT_attactRooms = new UIElement("//*[text()='可招商']");
    private UIElement TXT_takenRooms = new UIElement("//*[text()='已租房源']");
    private UIElement TXT_allRooms = new UIElement("//*[text()='所有房源']");
    private UIElement TXT_analysisRooms = new UIElement("xpath=//*[text()='房源分析']");

    private UIElement NUM_buildingsCount = new UIElement("//span[text()='2']");
    private UIElement TXT_price = new UIElement("//*[text()='合同单价']");
    private UIElement TXT_buidingName = new UIElement("xpath=//span[text()='楼宇名称']");
    private UIElement BTN_hoverAddContract = new UIElement(
            "//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/descendant ::button[1]");
    private UIElement TXT_newContractPage = new UIElement("//*[text()='新建租赁合同']");
    private UIElement BTN_hoverModifyRoom = new UIElement(
            "//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/descendant ::button[2]");

    private UIElement TXT_newEditRoom = new UIElement("//*[@class='ant-modal-header']");
    private UIElement BTN_confirm = new UIElement("//*[text()='确认']");

    // 单一楼宇下
    private UIElement TXT_ARoom = new UIElement(
            "//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]");
    private UIElement TXT_roomInformation = new UIElement("//span[text()='房源信息']");
    private UIElement TXT_addRoomInformation = new UIElement("//div[text()='房源信息']");

    private UIElement INP_seach = new UIElement("//input[@type='text' and @class='ant-input ant-input-lg']");

    public UIElement singleBuildingElement(String building) {
        return new UIElement(
                "xpath=//div[text()='" + building + "']//parent::div[@class='titleBox___3mf_U']");
    }

    private UIElement LST_unclickableBuildingList = new UIElement(
            "xpath=//*[@class='ant-select-lg ant-select ant-select-disabled']");

    public UIElement buildingElement(String building) {
        return new UIElement(
                "xpath=//*[@class='ant-select-dropdown-menu ant-select-dropdown-menu-vertical  ant-select-dropdown-menu-root']//*[text()='"
                        + building + "']");
    }

    public UIElement floorElement(String floor) {
        return new UIElement("xpath=//li[text()='" + floor + "']");
    }

    public UIElement merchantsStateElement(String merchantsState) {
        return new UIElement("xpath=//li[text()='" + merchantsState + "']");
    }

    /**
     * 编辑房源时默认填写的内容
     *
     * @param building
     * @return
     */
    public UIElement roomBuilding(String building) {
        return new UIElement(
                "//*[text()='" + building + "']/parent::div[@class='title___28WlQ titleImgModal___3LqjE crInfoTitle']");

    }

    public UIElement roomFloor(String floor) {
        return new UIElement("//*[@title='" + floor + "']//parent::div[@class='ant-select-selection__rendered']");

    }

    public UIElement roomRoomNum(String roomNum) {
        return new UIElement("//*[@value='" + roomNum + "']/parent::div[@class='ant-form-item-control has-success']");

    }

    public UIElement roomRoomArea(String roomArea) {
        return new UIElement("//*[@value='" + roomArea + "']/parent::div[@class='ant-input-number-input-wrap']");

    }

    public UIElement roomMerchantsState(String merchantsState) {
        return new UIElement("//*[@title='" + merchantsState + "']");

    }

    /**
     * 集合下房源的elements
     *
     * @param building
     * @return
     */
    public UIElement elementsBuildingElement(String building) {
        return new UIElement("xpath=//*[@class='text___3p4vT' and text()='" + building + "']");

    }

    public void enterRoomsPage() {
        this.driver.waitClickable(BTN_roomsManage, 5);
        this.driver.click(BTN_roomsManage);

    }

    public void newRoom() {
        if (this.driver.waitClickable(BTN_newRoom, 5)) {
            this.driver.click(BTN_newRoom);
        } else {
            this.driver.click(BTN_RcNewRoom);
        }

    }

    public boolean newRoomPage() {
        return this.driver.waitForElement(TXT_addRoomInformation, 10);
    }

    /**
     * 用户进入新增房源页
     */
    public void enterRoomsPage1() {
        this.driver.waitClickable(BTN_roomsManage, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_roomsManage);
        if (this.driver.waitClickable(BTN_newRoom, 5)) {
            this.driver.click(BTN_newRoom);
        } else {
            this.driver.click(BTN_RcNewRoom);
        }
    }

    public void fillAllInformation(String building, String floor, String roomNum, String roomArea,
                                   String merchantsState) {

        this.driver.waitClickable(LST_buildingsList, 5);
        this.driver.sleep(2000);
        this.driver.click(LST_buildingsList);
        this.driver.waitClickable(this.buildingElement(building), 5);
        this.driver.sleep(3000);
        this.driver.click(this.buildingElement(building));

        this.driver.waitClickable(LST_floorsList, 5);
        this.driver.sleep(2000);
        this.driver.click(LST_floorsList);

        this.driver.waitClickable(this.floorElement(floor), 5);
        this.driver.click(this.floorElement(floor));
        this.driver.elementSendText(INP_roomNum, roomNum);
        this.driver.elementSendText(INP_roomArea, roomArea);

        this.driver.waitClickable(LST_merchantsState, 5);
        this.driver.click(LST_merchantsState);

        this.driver.waitClickable(this.merchantsStateElement(merchantsState), 5);
        this.driver.click(this.merchantsStateElement(merchantsState));


    }

    public void fillAllInformationChoosedBuilding(String floor, String roomNum, String roomArea,
                                                  String merchantsState) {

        this.driver.waitClickable(LST_floorsList, 5);
        this.driver.click(LST_floorsList);

        this.driver.waitClickable(this.floorElement(floor), 5);
        this.driver.click(this.floorElement(floor));
        this.driver.elementSendText(INP_roomNum, roomNum);
        this.driver.elementSendText(INP_roomArea, roomArea);

        this.driver.waitClickable(LST_merchantsState, 5);
        this.driver.click(LST_merchantsState);

        this.driver.waitClickable(this.merchantsStateElement(merchantsState), 5);
        this.driver.click(this.merchantsStateElement(merchantsState));

    }

    public void submit() {
        this.driver.sleep(2000);
        this.driver.click(BTN_submit);
        this.driver.waitClickable(BTN_confirm, 5);
        this.driver.sleep(2000);
        this.driver.click(BTN_confirm);
        this.driver.sleep(1000);
    }

    public boolean newRoomSuccess() {
        this.driver.sleep(2000);
        return this.driver.waitForElement(TXT_newRoom, 5);
    }

    public void clearThisRoom() {
        this.driver.waitClickable(BTN_clearRoom, 5);
        this.driver.sleep(1000);
        this.driver.click(BTN_clearRoom);

        this.driver.waitClickable(BTN_clearRoomYes, 5);
        this.driver.click(BTN_clearRoomYes);

    }

    public void clickFitmentArrow() {

        this.driver.waitClickable(LST_fitmentList, 5);
        this.driver.click(LST_fitmentList);

    }

    public boolean workblank() {
        return this.driver.waitForElement(TXT_workblank, 10);
    }

    public boolean simple() {
        return this.driver.waitForElement(TXT_simple, 10);
    }

    public boolean bound() {
        return this.driver.waitForElement(TXT_bound, 10);
    }

    public void clickAttractArrow() {

        this.driver.waitClickable(LST_merchantsState, 5);
        this.driver.click(LST_merchantsState);

    }

    public boolean attact() {
        return this.driver.waitForElement(TXT_attract, 5);
    }

    public boolean unattract() {
        return this.driver.waitForElement(TXT_unattract, 5);
    }

    public void enterSingleBuildingPage(String building) {
        this.driver.waitClickable(this.singleBuildingElement(building), 10);
        this.driver.sleep(1000);
        this.driver.click(this.singleBuildingElement(building));

    }

    public void clickRoomsManage() {

        this.driver.waitClickable(BTN_roomsManage, 5);
        this.driver.click(BTN_roomsManage);

    }

    /**
     * 判断可招商列表是否存在
     *
     * @return
     */
    public boolean attactRooms() {
        return this.driver.waitForElement(TXT_attactRooms, 5);
    }

    /**
     * 判断已租房源列表是否存在
     *
     * @return
     */
    public boolean takenRooms() {
        return this.driver.waitForElement(TXT_takenRooms, 5);
    }

    /**
     * 判断所有房源列表是否存在
     *
     * @return
     */
    public boolean allRooms() {
        return this.driver.waitForElement(TXT_allRooms, 5);
    }

    /**
     * 判断房源分析列表是否存在
     *
     * @return
     */
    public boolean analysisRooms() {
        return this.driver.isElementFound(TXT_analysisRooms);
    }

    public void unclickable() {
        this.driver.waitForElement(LST_unclickableBuildingList, 5);

    }

    public boolean building(String building) {
        return this.driver.waitForElement(this.elementsBuildingElement(building), 5);
    }

    public boolean correctBuildingsCount() {
        return this.driver.waitForElement(NUM_buildingsCount, 5);
    }

    public void clickUnattract() {
        this.driver.click(TXT_takenRooms);

    }

    public boolean correctTaken() {
        return this.driver.waitForElement(TXT_price, 5);
    }

    public void clickAllRooms() {
        this.driver.click(TXT_allRooms);

    }

    public boolean merchantsState() {
        return this.driver.waitForElement(TXT_buidingName, 5);
    }

    public void clickARoom() {
        this.driver.waitClickable(TXT_ARoom, 5);
        this.driver.sleep(2000); // 可以点击了前端页面还在转菊花，只能添加等待
        this.driver.click(TXT_ARoom);

    }

    public boolean roomInformation() {
        this.driver.sleep(1000);
        return this.driver.waitForElement(TXT_roomInformation, 5);
    }

    public void moveOnARoomList() {

        this.driver.waitForElement(TXT_ARoom, 5);
        this.driver.mouseOver(TXT_ARoom);
    }

    public void addContract() {
        this.driver.waitClickable(BTN_hoverAddContract, 5);
        this.driver.click(BTN_hoverAddContract);

    }

    public boolean correctNewContractPage() {
        return this.driver.waitForElement(TXT_newContractPage, 5);
    }

    public void modifyRoom() {

        this.driver.waitClickable(BTN_hoverModifyRoom, 5);
        this.driver.click(BTN_hoverModifyRoom);

    }

    public Object correctEditRoom() {
        return this.driver.waitForElement(TXT_newEditRoom, 5);
    }

    public void inputKeyword(String keyword) {
        this.driver.sleep(1000);
        this.driver.waitForElement(INP_seach, 5);
        this.driver.elementSendText(INP_seach, keyword);
        this.driver.elementSendKeys(INP_seach, Keys.ENTER);

    }

    public boolean checkBuilng(String building) {
        return this.driver.waitForElement(this.roomBuilding(building), 5);
    }

    public boolean checkFloor(String floor) {
        return this.driver.waitForElement(this.roomFloor(floor), 5);
    }

    public boolean checkRoomNum(String roomNum) {
        return this.driver.waitForElement(this.roomRoomNum(roomNum), 5);
    }

    public boolean checkRoomArea(String roomArea) {
        return this.driver.waitForElement(this.roomRoomArea(roomArea), 5);
    }

    public boolean checkMerchantsState(String merchantsState) {
        return this.driver.waitForElement(this.roomMerchantsState(merchantsState), 5);
    }

}
