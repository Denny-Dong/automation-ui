package com.souban.bdd.flows.CreamsWebFlow.Room;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.RoomPage.RoomsPage;

public class RoomsFlow {
    private RoomsPage roomspage = null;

    public RoomsFlow(Driver driver) {
        this.roomspage = PageFactory.getPage(RoomsPage.class, driver);
    }

    public void enterRoomsPage() {
        this.roomspage.enterRoomsPage();

    }

    public void newRoom() {
        this.roomspage.newRoom();
    }

    public void enternewRoomPage() {
        Assert.assertThat(this.roomspage.newRoomPage(), is(true));

    }

    public void enternewRoomPage1() {
        this.roomspage.enterRoomsPage1();

    }

    public void fillAllInformation(String building, String floor, String roomNum, String roomArea,
                                   String merchantsState) {
        this.roomspage.fillAllInformation(building, floor, roomNum, roomArea, merchantsState);

    }

    public void fillAllInformationChooseBuilding(String floor, String roomNum, String roomArea, String merchantsState) {
        this.roomspage.fillAllInformationChoosedBuilding(floor, roomNum, roomArea, merchantsState);

    }

    public void submit() {
        this.roomspage.submit();

    }

    public void newRoomSuccess() {
        Assert.assertThat(this.roomspage.newRoomSuccess(), is(true));

    }

    public void clearThisRoom() {
        this.roomspage.clearThisRoom();

    }

    public void clickFitmentArrow() {
        this.roomspage.clickFitmentArrow();

    }

    public void correctFitmentList() {
        Assert.assertThat(this.roomspage.workblank(), is(true));
        Assert.assertThat(this.roomspage.simple(), is(true));
        Assert.assertThat(this.roomspage.bound(), is(true));

    }

    public void clickAttractArrow() {
        this.roomspage.clickAttractArrow();

    }

    public void correctAttactList() {
        Assert.assertThat(this.roomspage.attact(), is(true));
        Assert.assertThat(this.roomspage.unattract(), is(true));

    }

    public void enterSingleBuildingPage(String building) {
        this.roomspage.enterSingleBuildingPage(building);

    }

    public void clickRoomsManage() {
        this.roomspage.clickRoomsManage();

    }

    /**
     * 房源列表显示判断
     */
    public void correctSingleBuildingPage() {
        Assert.assertThat(this.roomspage.attactRooms(), is(true));//判断可招商列表是否存在

        Assert.assertThat(this.roomspage.takenRooms(), is(true));//判断已租房源列表是否存在

        Assert.assertThat(this.roomspage.allRooms(), is(true));//判断所有房源列表是否存在

        Assert.assertThat(this.roomspage.analysisRooms(), is(true));//判断房源分析列表是否存在
    }

    public void unclickable() {
        this.roomspage.unclickable();

    }

    public void correctChooseBuildings(String building1, String building2) {
        Assert.assertThat(this.roomspage.building(building1), is(true));
        Assert.assertThat(this.roomspage.building(building2), is(true));

    }

    public void correctBuildingsCount() {
        Assert.assertThat(this.roomspage.correctBuildingsCount(), is(true));

    }

    public void clickUnattract() {
        this.roomspage.clickUnattract();

    }

    public void correctTaken() {
        Assert.assertThat(this.roomspage.correctTaken(), is(true));

    }

    public void clickAllRooms() {
        this.roomspage.clickAllRooms();

    }

    public void correctAllRooms() {
        Assert.assertThat(this.roomspage.merchantsState(), is(true));

    }

    public void clickARoom() {
        this.roomspage.clickARoom();

    }

    public void correctRoomInformation() {
        Assert.assertThat(this.roomspage.roomInformation(), is(true));

    }

    public void moveOnARoomList() {
        this.roomspage.moveOnARoomList();
    }

    public void addContract() {
        this.roomspage.addContract();
    }

    public void correctNewContractPage() {
        Assert.assertThat(this.roomspage.correctNewContractPage(), is(true));

    }

    public void modifyRoom() {
        this.roomspage.modifyRoom();
    }

    public void correctEditRoom() {
        Assert.assertThat(this.roomspage.correctEditRoom(), is(true));

    }

    public void inputKeyword(String keyword) {
        this.roomspage.inputKeyword(keyword);

    }

    public void checkRoomInformation(String building, String floor, String roomNum, String roomArea,
                                     String merchantsState) {
        Assert.assertThat(this.roomspage.checkBuilng(building), is(true));
        Assert.assertThat(this.roomspage.checkFloor(floor), is(true));
        Assert.assertThat(this.roomspage.checkRoomNum(roomNum), is(true));
        Assert.assertThat(this.roomspage.checkRoomArea(roomArea), is(true));
        Assert.assertThat(this.roomspage.checkMerchantsState(merchantsState), is(true));

    }


}
