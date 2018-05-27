package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.pages.CreamsAPP.BuildingListShowPage;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

public class BuildingListShowFlow {

	private BuildingListShowPage buildingListShowPage = null;
	
	public BuildingListShowFlow(final Driver driver) {
		this.buildingListShowPage = PageFactory.getPage(BuildingListShowPage.class, driver);
	}
	
	//楼宇列表
	public void GotoTheSideBar(){
		this.buildingListShowPage.GotoTheSideBar();
	}
	
	public void SelectBuilding(String building){
		this.buildingListShowPage.SelectBuilding(building);
	}
	
	public void GotoBuildingList(String CheckBuilding){
		this.buildingListShowPage.Clickblank();
		Assert.assertThat(this.buildingListShowPage.GotoBuildingList(CheckBuilding), is(true));
	}
	
	public void VerifyBuildingInfo(String CheckBuilding,String TotalArea){
		String[] BuildingInfo = this.buildingListShowPage.CheckBuildingInfo(CheckBuilding).split(",");
		//Assert.assertThat(BuildingInfo[0], is(address));
		Assert.assertThat(BuildingInfo[0], is(TotalArea));
	}
	
	//房源列表
	public void GotoRoomList(String CheckBuilding){
		this.buildingListShowPage.GotoRoomList(CheckBuilding);
	}
	
	public void VerifyGotoRoomListSuccessfully(){
		Assert.assertThat(this.buildingListShowPage.CheckList(), is(true));
	}
	
	public void VerifyRoomInfo(String room,String state,String PriceAndArea,String fitment){
		String[] roomInfo = this.buildingListShowPage.CheckRoomInfo(room).split(",");
		Assert.assertThat(roomInfo[0], is(state));
		Assert.assertThat(roomInfo[1], is(PriceAndArea));
		Assert.assertThat(roomInfo[2], is(fitment));
	}
	
	//android
	public void VerifyRoomInfo_android(String room,String state,String price,String area,String fitment){
		String[] roomInfo = this.buildingListShowPage.CheckRoomInfo_android(room).split(",");
		Assert.assertThat(roomInfo[0], is(state));
		Assert.assertThat(roomInfo[1], is(price));
		Assert.assertThat(roomInfo[2], is(area));
		Assert.assertThat(roomInfo[3], is(fitment));
	}
	
	//房源详情
	public void GotoRoomDetail(String room){
		this.buildingListShowPage.GotoRoomDetail(room);
	}
	
	public void VerifyFloorAndRoom(String FloorAndRoom){
		Assert.assertThat(this.buildingListShowPage.CheckFloorAndRoom(), is(FloorAndRoom));
	}
	
	public void VerifyRoom_BuildingInfo(String buildingName,String buildingAddress){
		String[] buildingInfo = this.buildingListShowPage.CheckBuildingInfo().split(",");
		Assert.assertThat(buildingInfo[0], is(buildingName));
		Assert.assertThat(buildingInfo[1], is(buildingAddress));
	}
	
	public void VerifyRoomDetailInfo(String area,String state,String expectedPrice,String fitment){
		String[] roomDetailInfo = this.buildingListShowPage.CheckRoomDetailInfo().split(",");
		Assert.assertThat(roomDetailInfo[0], is(area));
		Assert.assertThat(roomDetailInfo[1], is(state));
		Assert.assertThat(roomDetailInfo[2], is(expectedPrice));
		Assert.assertThat(roomDetailInfo[3], is(fitment));
	}
	
	//编辑房源
	public void GotoEditRoomPage(){
		this.buildingListShowPage.GotoEditRoomPage();
	}
	
	public void EditArea(String area){
		this.buildingListShowPage.EditArea(area);
	}
	
	public void EditFitment(String fitment){
		this.buildingListShowPage.EditFitment(fitment);
	}
	
	public void EditPrice(String price){
		this.buildingListShowPage.EditPrice(price);
	}
	
	public void EditPriceUnit(String unit){
		this.buildingListShowPage.EditPriceUnit(unit);
	}
	
	public void SaveEditRoom(){
		this.buildingListShowPage.SaveEditRoom();
	}
	
	public void BackToRoomList(){
		this.buildingListShowPage.BackToRoomList();
	}
	
	//android
	public void EditFitment_android(String fitment){
		this.buildingListShowPage.EditFitment_android(fitment);
	}
	
	public void EditPriceUnit_android(String priceUnit){
		this.buildingListShowPage.EditPriceUnit_android(priceUnit);
	}
	
	//选择多个楼宇列表
	public void SelectBuilding(String building1,String building2,String building3){
		this.buildingListShowPage.SelectBuilding(building1, building2, building3);
	}
	
	public void ClickBlank(){
		this.buildingListShowPage.Clickblank();
	}
	
	public void VerifySelectBuilding(String building1,String building2,String building3){
		Assert.assertThat(this.buildingListShowPage.GotoBuildingList(building1), is(true));
		Assert.assertThat(this.buildingListShowPage.CheckSelectBuilding2(building2), is(true));
		Assert.assertThat(this.buildingListShowPage.CheckSelectBuilding3(building3), is(true));
	}
	
	public void VerifyAllAreasize(String allAreaSize){
		Assert.assertThat(this.buildingListShowPage.CheckAllAreaSize(), is(allAreaSize));
	}
	
	//加入收藏
	public void ClickJoinCollection(){
		this.buildingListShowPage.ClickJoinCollection();
	}
	
	public void InputGroupName(String groupName){
		this.buildingListShowPage.InputGroupName(groupName);
	}
	
	public void ConfirmJoinCollection(){
		this.buildingListShowPage.ConfirmJoinCollection();
	}
	
	public void GotoMyQueryList(){
		this.buildingListShowPage.GotoMyQueryList();
	}
	
	public void VerifyJoinCollectionResult(String group){
		Assert.assertThat(this.buildingListShowPage.CheckGroupIsExist(group), is(true));
	}
	
	public void VerifyBuildingCountInGroup(String group,String count){
		Assert.assertThat(this.buildingListShowPage.CheckBuildingCountInGroup(group), is(count));
	}

	//剖面图
	public void ClickChart(){
		this.buildingListShowPage.ClickChart();
	}

	public void CheckChart(){
		Assert.assertThat(this.buildingListShowPage.CheckChart(),is(true));
	}
}
