package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuildingListShowStep extends BaseStep{

	//楼宇列表
	@When("^点击左上角入口进入楼宇侧滑栏$")
	public void 点击左上角入口进入楼宇侧滑栏() throws Throwable {
	    this.buildingListShowFlow.GotoTheSideBar();
	}

	@When("^选择楼宇 \"([^\"]*)\"$")
	public void 选择楼宇(String arg1) throws Throwable {
	    this.buildingListShowFlow.SelectBuilding(arg1);
	}

	@When("^点击右侧空白处进入楼宇 \"([^\"]*)\" 列表$")
	public void 点击右侧空白处进入楼宇_列表(String arg1) throws Throwable {
	    this.buildingListShowFlow.GotoBuildingList(arg1);
	}

	/*@Then("^楼宇 \"([^\"]*)\" 信息 \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void 楼宇_信息_显示正确(String arg1, String arg2, String arg3) throws Throwable {
	    this.buildingListShowFlow.VerifyBuildingInfo(arg1, arg2, arg3);
	}*/
	@Then("^楼宇 \"([^\"]*)\" 信息 \"([^\"]*)\" 显示正确$")
	public void 楼宇_信息_显示正确(String arg1, String arg2) throws Exception {
		this.buildingListShowFlow.VerifyBuildingInfo(arg1, arg2);
	}

	//房源列表
	@When("^点击楼宇 \"([^\"]*)\" 进入房源列表$")
	public void 点击楼宇_进入房源列表(String arg1) throws Throwable {
	    this.buildingListShowFlow.GotoRoomList(arg1);
	}

	@Then("^显示可招商列表$")
	public void 显示可招商列表() throws Throwable {
	    this.buildingListShowFlow.VerifyGotoRoomListSuccessfully();
	}

	@Then("^房源 \"([^\"]*)\" 的租赁状态 \"([^\"]*)\" 预租单价和面积 \"([^\"]*)\" 装修 \"([^\"]*)\" 显示正确$")
	public void 房源_的租赁状态_预租单价和面积_装修_显示正确(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	   this.buildingListShowFlow.VerifyRoomInfo(arg1, arg2, arg3, arg4);
	}
	
	//android
	@Then("^android房源 \"([^\"]*)\" 的租赁状态 \"([^\"]*)\" 预租单价 \"([^\"]*)\" 面积 \"([^\"]*)\" 装修 \"([^\"]*)\" 显示正确$")
	public void 房源_的租赁状态_预租单价_面积_装修_显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    this.buildingListShowFlow.VerifyRoomInfo_android(arg1, arg2, arg3, arg4, arg5);
	}
	
	//房源详情
	@When("^点击房源 \"([^\"]*)\" 进入详情页$")
	public void 点击房源_进入详情页(String arg1) throws Throwable {
	    this.buildingListShowFlow.GotoRoomDetail(arg1);
	}

	@When("^楼层房号 \"([^\"]*)\" 显示正确$")
	public void 楼层房号_显示正确(String arg1) throws Throwable {
	    this.buildingListShowFlow.VerifyFloorAndRoom(arg1);
	}

	@When("^房源所属楼宇信息 \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void 房源所属楼宇信息_显示正确(String arg1, String arg2) throws Throwable {
	    this.buildingListShowFlow.VerifyRoom_BuildingInfo(arg1, arg2);
	}

	@When("^房源信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 显示正确$")
	public void 房源信息_显示正确(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	   this.buildingListShowFlow.VerifyRoomDetailInfo(arg1, arg2, arg3, arg4);
	}
	
	//编辑房源
	@When("^点击编辑房源按钮进入编辑页面$")
	public void 点击编辑房源按钮进入编辑页面() throws Throwable {
	    this.buildingListShowFlow.GotoEditRoomPage();
	}

	@When("^修改面积为 \"([^\"]*)\"$")
	public void 修改面积为(String arg1) throws Throwable {
	    this.buildingListShowFlow.EditArea(arg1);
	}

	@When("^修改装修风格为 \"([^\"]*)\"$")
	public void 修改装修风格为(String arg1) throws Throwable {
	   this.buildingListShowFlow.EditFitment(arg1);
	}

	@When("^修改预租单价为 \"([^\"]*)\"$")
	public void 修改预租单价为(String arg1) throws Throwable {
	    this.buildingListShowFlow.EditPrice(arg1);
	}

	@When("^修改价格单位为 \"([^\"]*)\"$")
	public void 修改价格单位为(String arg1) throws Throwable {
	    this.buildingListShowFlow.EditPriceUnit(arg1);
	}
	
	@When("^点击保存房源编辑$")
	public void 点击保存房源编辑() throws Throwable {
	    this.buildingListShowFlow.SaveEditRoom();
	}
	
	@Then("^房源信息修改成功，显示为修改后的 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 房源信息修改成功_显示为修改后的(String arg1, String arg2, String arg3, String arg4) throws Throwable {
    this.buildingListShowFlow.VerifyRoomDetailInfo(arg1, arg2, arg3, arg4);
}

	@Then("^点击返回回到房源列表$")
	public void 点击返回回到房源列表() throws Throwable {
	    this.buildingListShowFlow.BackToRoomList();
	}

	@Then("^列表中房源 \"([^\"]*)\" 的信息也更新为修改后的 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 列表中房源_的信息也更新为修改后的(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		 this.buildingListShowFlow.VerifyRoomInfo(arg1, arg2, arg3, arg4);
	}
	
	//android
	@When("^android修改装修风格为 \"([^\"]*)\"$")
	public void android修改装修风格为(String arg1) throws Throwable {
	    this.buildingListShowFlow.EditFitment_android(arg1);
	}

	@When("^android修改价格单位为 \"([^\"]*)\"$")
	public void android修改价格单位为(String arg1) throws Throwable {
	   this.buildingListShowFlow.EditPriceUnit_android(arg1);
	}

	@Then("^android列表中房源 \"([^\"]*)\" 的信息也更新为修改后的 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 列表中房源_的信息也更新为修改后的(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    this.buildingListShowFlow.VerifyRoomInfo_android(arg1, arg2, arg3, arg4, arg5);
	}

	//选择多个楼宇的楼宇列表
	@When("^选择楼宇 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 选择楼宇(String arg1, String arg2, String arg3) throws Throwable {
	    this.buildingListShowFlow.SelectBuilding(arg1, arg2, arg3);
	}

	@When("^点击右侧空白处进入楼宇列表$")
	public void 点击右侧空白处进入楼宇列表() throws Throwable {
	    this.buildingListShowFlow.ClickBlank();
	}

	@Then("^列表显示楼宇 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 列表显示楼宇(String arg1, String arg2, String arg3) throws Throwable {
	    this.buildingListShowFlow.VerifySelectBuilding(arg1, arg2, arg3);
	}

	@Then("^页面顶部楼宇总面积为三个楼宇的总面积 \"([^\"]*)\"$")
	public void 页面顶部楼宇总面积为_个楼宇的总面积(String arg2) throws Throwable {
	   this.buildingListShowFlow.VerifyAllAreasize(arg2);
	}
	
	//加入收藏
	@When("^点击加入收藏$")
	public void 点击加入收藏() throws Throwable {
	    this.buildingListShowFlow.ClickJoinCollection();
	}
	
	@When("^输入分组名称 \"([^\"]*)\"$")
	public void 输入分组名称(String arg1) throws Throwable {
		this.buildingListShowFlow.InputGroupName(arg1);
	}

	@When("^点击确定收藏收藏成功$")
	public void 点击确定收藏收藏成功() throws Throwable {
	    this.buildingListShowFlow.ConfirmJoinCollection();
	}

	@When("^点击我的查询进入我的查询列表$")
	public void 点击我的查询进入我的查询列表() throws Throwable {
	    this.buildingListShowFlow.GotoMyQueryList();
	}

	@Then("^列表显示刚添加的分组 \"([^\"]*)\"$") 
	public void 列表显示刚添加的分组(String arg1) throws Throwable {
	    this.buildingListShowFlow.VerifyJoinCollectionResult(arg1);
	}

	@Then("^分组 \"([^\"]*)\" 中楼宇数量为 \"([^\"]*)\"$")
	public void 分组_中楼宇数量为(String arg1, String arg2) throws Throwable {
	    this.buildingListShowFlow.VerifyBuildingCountInGroup(arg1,arg2);
	}

	//剖面图
	@When("^点击剖面图按钮$")
	public void 点击剖面图按钮() throws Exception {
		this.buildingListShowFlow.ClickChart();
	}

	@Then("^进入剖面图页面$")
	public void 进入剖面图页面() throws Exception {
		this.buildingListShowFlow.CheckChart();
	}
	
}
