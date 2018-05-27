package com.souban.bdd.steps.CreamsWebStep.Building;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuildingsStep extends BaseStep {
	@Given("^用户进入楼宇管理列表页$")
	public void 用户进入楼宇管理列表页() throws Throwable {
		this.buildingsFlow.enterBuildingsPage();

	}

	@When("^点击右侧新建楼宇$")
	public void 点击右侧新建楼宇() throws Throwable {
		this.buildingsFlow.clickNewBuilding();
	}

	@Then("^弹框出现楼宇新建的详细信息页面 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 弹框出现楼宇新建的详细信息页面(String province, String city, String region, String name, String address,
			String promotionTel, String alertDaysNum, String ContractNo) throws Throwable {
		this.buildingsFlow.fillAllInformation(province, city, region, name, address, promotionTel, alertDaysNum,
				ContractNo);
	}

	@Then("^新建楼宇成功，下方楼宇列表和左边楼宇集合出现一条新楼宇数据\"([^\"]*)\"$")
	public void 新建楼宇成功_下方楼宇列表和左边楼宇集合出现一条新楼宇数据(String name) throws Throwable {
		this.buildingsFlow.newBuildingSuccess(name);
	}

	@Given("^进入楼层编辑页面\"([^\"]*)\"$")
	public void 进入楼层编辑页面(String building) throws Throwable {
		this.buildingsFlow.enterEditBuilding(building);

	}

	@When("^选择添加楼层数量为多层$")
	public void 选择添加楼层数量为多层() throws Throwable {
		this.buildingsFlow.chooseFloors();
	}

	@When("^起始楼层为\"([^\"]*)\"、结束楼层为\"([^\"]*)\"、$")
	public void 起始楼层为_结束楼层为(String begin, String end) throws Throwable {
		this.buildingsFlow.fillFloorInformation(begin, end);
	}

	@When("^点击了添加楼层按钮$")
	public void 点击了添加楼层按钮() throws Throwable {
		this.buildingsFlow.addFloors();
	}

	@Then("^下方楼层列表数据刷新，在顶部增加了楼层名为\"([^\"]*)\"，、房源数量为(\\d+)的一条楼层数据$")
	public void 下方楼层列表数据刷新_在顶部增加了楼层名为_房源数量为_的一条楼层数据(String begin, int roomNum) throws Throwable {
		this.buildingsFlow.addCorrectFloors(begin, roomNum);
	}

	@Given("^新建一个房源个数为零的楼层\"([^\"]*)\"$")
	public void 新建一个房源个数为零的楼层(String floor) throws Throwable {
		this.buildingsFlow.creatNoroomFloor(floor);
	}

	@When("^点击删除这个新建的楼层\"([^\"]*)\"$")
	public void 点击删除这个新建的楼层(String floor) throws Throwable {
		this.buildingsFlow.clearNewFloor(floor);
	}

	@Then("^提示“您确定要删除该楼层”$")
	public void 提示_您确定要删除该楼层() throws Throwable {
		this.buildingsFlow.correctHint();
	}

	@Given("^点击楼层编辑页面的保存按钮$")
	public void 点击楼层编辑页面的保存按钮() throws Throwable {
		this.buildingsFlow.submitFloorEdit();
	}

	@Given("^从房源管理页面进入楼层编辑页面\"([^\"]*)\"$")
	public void 从房源管理页面进入楼层编辑页面(String building) throws Throwable {
		this.buildingsFlow.enterEditBuildingFromRooms(building);
	}

	@Then("^提示“您删除的楼层存在房源，可能与需求和合同有关联，确定要删除该楼层。”$")
	public void 提示_您删除的楼层存在房源_可能与需求和合同有关联_确定要删除该楼层() throws Throwable {
		this.buildingsFlow.correctHint1();
	}

	@Given("^信息没有填写完全$")
	public void 信息没有填写完全() throws Throwable {
		this.buildingsFlow.notFillInformation();
	}

	@When("^下一步$")
	public void 下一步() throws Throwable {
		this.buildingsFlow.nextStep();
	}

	@Then("^提示必须填全$")
	public void 提示必须填全() throws Throwable {
		this.buildingsFlow.correctHint2();
	}

	@Then("^删除这个楼层$")
	public void 删除这个楼层() throws Throwable {
		this.buildingsFlow.clearThisFloor();
	}

	@When("^点击列表中楼层名为\"([^\"]*)\"的楼层左侧拖拽按钮上移动到楼层名为\"([^\"]*)\"的楼层上部$")
	public void 点击列表中楼层名为_的楼层左侧拖拽按钮上移动到楼层名为_的楼层上部(String end, String begin) throws Throwable {
		this.buildingsFlow.moveAFloor(end, begin);
	}

	@Then("^楼层列表第一层变为\"([^\"]*)\"$")
	public void 楼层列表第一层变为(String end) throws Throwable {
		this.buildingsFlow.correctMovedFloor(end);
	}

}
