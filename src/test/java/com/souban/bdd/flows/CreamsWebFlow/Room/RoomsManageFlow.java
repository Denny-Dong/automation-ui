package com.souban.bdd.flows.CreamsWebFlow.Room;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.RoomPage.RoomsManagePage;

public class RoomsManageFlow {
    private RoomsManagePage roomsManagePage = null;

    public RoomsManageFlow(Driver driver) {
        this.roomsManagePage = PageFactory.getPage(RoomsManagePage.class, driver);

    }

    public void enterFloor() {
        this.roomsManagePage.clickmyFloor();
    }

    public void enterRoom() {
        this.roomsManagePage.clickRoomNoContract();
    }

    public void inPictureAndMyRoom(String roomNum) {
        this.roomsManagePage.inHousePictrue(roomNum);
    }

    public void enterRoomInformation() {
        Assert.assertThat(this.roomsManagePage.checkroomInformation(), is(true));
    }

    public void enterEdit() {
        this.roomsManagePage.clickedit();
    }

    public void checkEdit() {
        Assert.assertThat(this.roomsManagePage.checkeditRoom(), is(true));
    }

    public void sureInPropertyInf() {
        Assert.assertThat(this.roomsManagePage.checkPropertyContract(), is(true));
    }

    public void fillPropertyInformation(String hiremanname, String propertytype, String staticmoney,
                                        String propertyprice, String propertyweek, String payday, String powerwasteprice, String powermoneyweek,
                                        String powerpayday) {
        this.roomsManagePage.fullPropertyInformation(hiremanname, propertytype, staticmoney, propertyprice,
                propertyweek, payday, powerwasteprice, powermoneyweek, powerpayday);
    }

    public void createContractSucced(String hiremanname) {
        Assert.assertThat(this.roomsManagePage.createPropertyContractSucceed(hiremanname), is(true));
    }

    public void deletePropertyContract(String hiremanname) {
        this.roomsManagePage.deleteProperty(hiremanname);
    }

    public void checkLatestHire(String hiremanname) {
        Assert.assertThat(this.roomsManagePage.checkLatestHireman(hiremanname), is(true));
    }

    public void compeleteCusInfo(String customername) {
        this.roomsManagePage.fillCustomerInfo(customername);
    }

    public void checkLatestCustormer(String customername) {
        Assert.assertThat(this.roomsManagePage.checkCustormerSucceed(customername), is(true));
    }

    public void checkInHireCon() {
        Assert.assertThat(this.roomsManagePage.checkInNewHireCon(), is(true));
    }

    public void checkHireSuc(String myCustomer) {
        Assert.assertThat(this.roomsManagePage.checkHireSuc(myCustomer), is(true));
    }

    public void fullHireContract(String myCustomer, String keepmoney, String basicmoney) {
        this.roomsManagePage.fillHireInfo(myCustomer, keepmoney, basicmoney);
    }

    public void deleteHireContract(String myCustomer) {
        this.roomsManagePage.deleteHireContract(myCustomer);
    }

    public void deleteMyRoom(String roomNum) {
        this.roomsManagePage.clickdeleteRoom(roomNum);

    }

    public void clickMyRoom(String roomNum) {
        this.roomsManagePage.clickMyRoom(roomNum);
    }

    public void deleteSuc(String roomNum) {
        Assert.assertThat(this.roomsManagePage.deleteSuc(roomNum), is(false));
    }

    public void clickDlt(String customername) {
        Assert.assertThat(this.roomsManagePage.clickDelete(customername), is(false));
    }

    public void clickDlt2(String customername) {
        this.roomsManagePage.clickDelete(customername);
    }

    public void clickTogether() {
        this.roomsManagePage.clickTogether();
    }

    public void clickSaveCustomer() {
        this.roomsManagePage.clickSaveCustomer();
    }

    public void clickHighLightNameOrCompany() {
        Assert.assertThat(this.roomsManagePage.NewCustormerFail(), is(false));
    }

    //点击删除房源按钮
    public void clickDeleteRoom() {
        this.roomsManagePage.clickDeleteRoom();
    }

    /**
     * 弹出删除二次确认框
     *
     * @param alertMessage 提示框信息
     */
    public void alertIsDeleteRoom(String alertMessage) {
        this.roomsManagePage.alertIsDeleteRoom(alertMessage);
    }

    //点击是按钮，确认删除
    public void clickYes() {
        this.roomsManagePage.clickYes();
    }

    /**
     * 弹出提示框，点击确认
     *
     * @param alertMessage 显示的提示
     */
    public void alertMessage(String alertMessage) {
        this.roomsManagePage.alertMessage(alertMessage);
    }

    /**
     * 新增房源页选择楼宇
     *
     * @param building 楼宇名称
     */
    public void chooseBuilding(String building) {
        this.roomsManagePage.chooseBuiling(building);
    }

    /**
     * 输入房源信息
     *
     * @param floor   楼层
     * @param roomNum 房号
     * @param area    面积
     */
    public void confirmRoomInfo(String floor, String roomNum, String area) {
        this.roomsManagePage.confirmRoomInfo(floor, roomNum, area);
    }

    /**
     * 保存房源
     */
    public void clickSave() {
        this.roomsManagePage.clickSave();
    }

    /**
     * 房源列表选择房源
     *
     * @param roomNum
     */
    public void chooseRoomNum(String building, String roomNum) {
        this.roomsManagePage.chooseRoomNum(building, roomNum);
    }

    /**
     * 房源信息页新增客户
     */
    public void clickAddRenter() {
        this.roomsManagePage.clickAddRenter();
    }

    /**
     * 输入客户信息
     *
     * @param renter
     */
    public void inputRenterInfo(String renter) {
        this.roomsManagePage.inputRenterIfo(renter);
    }

    /**
     * 单一楼宇选择所有房源
     */
    public void allRooms() {

        this.roomsManagePage.allRooms();
    }

    /**
     * 点击hover编辑房源按钮
     *
     * @param roomNum
     */
    public void clickEditRoom(String roomNum) {

        this.roomsManagePage.clickEditRoom(roomNum);
    }

    /**
     * 修改招商状态
     *
     * @param status
     */
    public void updateStatus(String status) {
        this.roomsManagePage.updateStatus(status);
    }

    /**
     * 检查房源的招商状态
     *
     * @param status
     */
    public void checkRoomStatus(String status) {
        Assert.assertThat(this.roomsManagePage.checkRoomStatus(status), is(true));
    }

    /**
     * 进入可招商列表
     */
    public void enterInvitingInvestmentList() {
        Assert.assertThat(this.roomsManagePage.enterInvitingInvestmentList(), is(true));
    }

    /**
     * 进入已租房源列表
     */
    public void enterLetRoomList() {
        Assert.assertThat(this.roomsManagePage.enterLetRoomList(), is(true));
    }

    /**
     * 进入所有房源列表
     */
    public void enterAllRoomList() {
        Assert.assertThat(this.roomsManagePage.enterAllRoomList(), is(true));
    }

    /**
     * 检验房源存在
     *
     * @param roomNum
     */
    public void isExsitRoom(String roomNum) {
        Assert.assertThat(this.roomsManagePage.isExsitRoom(roomNum), is(true));
    }
}
