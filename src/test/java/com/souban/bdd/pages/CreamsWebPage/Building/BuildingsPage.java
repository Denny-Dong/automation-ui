package com.souban.bdd.pages.CreamsWebPage.Building;

import java.io.File;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class BuildingsPage extends ParentPage {


    public BuildingsPage(Driver driver) {
        super(driver);
    }

    // 新建楼宇
    private UIElement TXT_buildingsManage = new UIElement("//*[text()='楼宇管理']");
    private UIElement BTN_NewBuilding = new UIElement("xpath=//*[@class='ant-btn modalButton___3xevo']");
    private UIElement LST_Province = new UIElement("//*[text()='选择省份']");
    private UIElement LST_City = new UIElement("//*[text()='选择城市']");
    private UIElement LST_Region = new UIElement("//*[text()='选择区域']");
    private UIElement INP_Name = new UIElement("//*[@id='name']");
    private UIElement INP_Address = new UIElement("//*[@id='address']");
    private UIElement INP_PromotionTel = new UIElement("//*[@id='promotionTel']");
    private UIElement INP_AlertDaysNum = new UIElement("//*[@id='alertDaysNum']");
    private UIElement TNP_ContractNo = new UIElement("xpath=//*[@placeholder='请填写合同编号标示' and @id='cls']");
    private UIElement INP_Picture = new UIElement("xpath=//*[@type='file']");
    private UIElement BTN_Submit = new UIElement("//span[text()='保存&下一步']/parent::button");
    private UIElement BTN_Submit1 = new UIElement("//span[text()='保 存']/parent::button");
    private UIElement BTN_editBuilding = new UIElement("//button[@class='ant-btn']");
    private UIElement BTN_editFloor = new UIElement("//*[text()='楼层编辑']");
    private UIElement LST_floorNum = new UIElement(
            "xpath=//*[@class='ant-select-selection-selected-value' and text()='单层']");
    private UIElement TXT_floor = new UIElement("//li[text()='单层']");
    private UIElement TXT_floors = new UIElement("//li[text()='多层']");
    private UIElement INP_floorName = new UIElement("//*[@id='floorName']");
    private UIElement BTN_addFloors = new UIElement("//button[@class='ant-btn newBtn___2sQTL']");
    private UIElement TXT_noRoomHint = new UIElement("//span[text()='您确定要删除该楼层']");
    private UIElement TXT_RoomHint = new UIElement("//span[text()='您删除的楼层存在房源，可能与需求和']");
    private UIElement TXT_buildingHint = new UIElement("//*[text()='请填写楼宇名称']");
    private UIElement BTN_clearThisFloor = new UIElement("//*[@class='ant-btn ant-btn-primary ant-btn-sm']");
    private UIElement BTN_Navigation = new UIElement("//a[@class='singleLogo___1bTVV']");
    private UIElement INP_BeginFloor = new UIElement("//*[@id='startFloor']");
    private UIElement INP_EndFloor = new UIElement("//*[@id='endFloor']");

    //税率商品编码警告信息
    private UIElement TXT_taxationError = new UIElement("xpath=//*[text()='商品编码是19位并且是数字']");

    public UIElement provinceElement(String province) {
        return new UIElement("xpath=//li[text()='" + province + "']");
    }

    public UIElement cityElement(String city) {
        return new UIElement("//li[text()='" + city + "']");
    }

    public UIElement regionElement(String region) {
        return new UIElement("xpath=//li[text()='" + region + "']");
    }

    public UIElement buildingElement(String name) {
        return new UIElement("xpath=//div[text()='杭州市']/preceding-sibling::div[text()='" + name + "']");
    }

    public UIElement singleBuildingElement(String building) {
        return new UIElement("xpath=//div[text()='天津市']/preceding-sibling::div[text()='" + building + "']/parent::div");
    }

    public UIElement singleBuildingListElement(String building) {
        return new UIElement("xpath=//div[text()='天津市']/preceding-sibling::div[text()='" + building + "']");
    }

    public UIElement clearFloor(String floor) {
        return new UIElement("xpath=//input[@value='" + floor + "']/parent::div/following-sibling::button");
    }

    public UIElement MoveFloorElement(String floor) {
        return new UIElement("xpath=//input[@value=" + floor + "]/ancestor::div[2]/preceding-sibling::div");
    }

    public UIElement movedFloorElement(String end) {
        return new UIElement("//*[@value='" + end + "']");
    }

    public boolean enterBuildingsPage() {
        return this.driver.waitForElement(BTN_NewBuilding, 10);
    }

    public void clickNewBuilding() {
        this.driver.click(BTN_NewBuilding);
        driver.sleep(1000);
    }

    public void fillAllInformation(String province, String city, String region, String name, String address,
                                   String promotionTel, String alertDaysNum, String ContractNo) {
        File file = new File("pic/AFA47EF5AD9FAF0A60AFCD66B5717CC2.jpg");

        this.driver.click(LST_Province);
        this.driver.sleep(1000);
        this.driver.click(this.provinceElement(province));
        this.driver.sleep(1000);
        this.driver.click(LST_City);
        this.driver.sleep(1000);
        this.driver.click(this.cityElement(city));
        this.driver.sleep(1000);
        this.driver.click(LST_Region);
        this.driver.sleep(1000);
        this.driver.click(this.regionElement(region));

        this.driver.elementSendText(INP_Name, name);
        this.driver.elementSendText(INP_Address, address);
        this.driver.elementSendText(INP_PromotionTel, promotionTel);
        this.driver.elementSendText(INP_AlertDaysNum, alertDaysNum);
        this.driver.elementSendText(TNP_ContractNo, ContractNo);

        this.driver.elementSendText(INP_Picture, file.getAbsolutePath());

        this.driver.sleep(2000);
        this.driver.click(BTN_Submit);
        this.driver.sleep(2000);
        this.driver.click(BTN_Submit);
        this.driver.sleep(2000);
        this.driver.click(BTN_Submit);

    }

    public boolean newBuildingSuccess(String name) {
        this.driver.sleep(2000);
        return this.driver.waitForElement(this.buildingElement(name), 10);
    }

    public void enterEditbuilding(String building) {
        this.driver.waitClickable(this.singleBuildingElement(building), 10);
        this.driver.sleep(1000);
        this.driver.click(this.singleBuildingElement(building));
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_editBuilding, 10);
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_editFloor, 5);
    }

    public void choosefloors() {
        this.driver.sleep(1000);
        this.driver.click(LST_floorNum);
        this.driver.sleep(1000);
        this.driver.click(TXT_floors);
    }

    public void fillFloorInformation(String begin, String end) {
        this.driver.elementSendText(INP_BeginFloor, begin);
        this.driver.elementSendText(INP_EndFloor, end);

    }

    public void addFloors() {
        this.driver.click(BTN_addFloors);

    }

    public void creatNoroomFloor(String floor) {
        this.driver.sleep(1000);
        this.driver.click(LST_floorNum);
        this.driver.sleep(1000);
        this.driver.click(TXT_floor);
        this.driver.elementSendText(INP_floorName, floor);
        this.driver.click(BTN_addFloors);

    }

    public void clearNewFloor(String floor) {
        this.driver.sleep(1000);
        this.driver.click(this.clearFloor(floor));

    }

    public boolean correctHint() {
        return this.driver.waitForElement(TXT_noRoomHint, 5);
    }

    /**
     * 判断税率商品编码是否为空
     *
     * @return
     */
    public boolean isEditBuildings() {
        return this.driver.waitForElement(TXT_taxationError, 2);
    }

    //商品编码输入框
    private UIElement INP_taxation = new UIElement("xpath=//*[@placeholder='请输入商品编码']");

    public void submitFloorEdit() {
        this.driver.sleep(1000);
        this.driver.click(BTN_Submit1);
        this.driver.sleep(3000);
        //判断该楼宇税率是否为空
        if (isEditBuildings()) {
            this.driver.elementSendText(INP_taxation, "1111111111111111111");
            this.driver.click(BTN_Submit1);
            this.driver.sleep(3000);
        }
    }

    public void enterEditBuildingFromRooms(String building) {
        this.driver.sleep(1000);
        this.driver.click(BTN_Navigation);
        this.driver.sleep(1000);
        this.driver.click(TXT_buildingsManage);
        this.driver.sleep(1000);
        this.driver.mouseOver(this.singleBuildingListElement(building));
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_editBuilding, 10);
        this.driver.sleep(1000);
        this.driver.waitAndClick(BTN_editFloor, 5);

    }

    public boolean correctHint1() {
        return this.driver.waitForElement(TXT_RoomHint, 5);
    }

    public void notFillInformation() {
        this.driver.sleep(1000);

    }

    public void nextStep() {
        this.driver.click(BTN_Submit);

    }

    public boolean correctHint2() {
        return this.driver.waitForElement(TXT_buildingHint, 5);
    }

    public void clearThisFloor() {
        this.driver.sleep(1000);
        this.driver.click(BTN_clearThisFloor);
        this.driver.sleep(1000);
        this.driver.click(BTN_Submit1);

    }

    public void moveAFloor(String end, String begin) {
        this.driver.moveElement(this.MoveFloorElement(end), this.MoveFloorElement(begin));
        this.driver.sleep(1000);
    }

    public boolean movedFloor(String end) {
        return this.driver.waitForElement(this.movedFloorElement(end), 5);
    }

}
