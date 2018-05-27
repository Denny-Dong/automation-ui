package com.souban.bdd.steps.CreamsWebStep.Room;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoomsStep extends BaseStep {
    @Given("^用户在集合的房源管理页面$")
    public void 用户在集合的房源管理页面() throws Throwable {
        this.roomsFlow.enterRoomsPage();
    }

    @When("^用户点击新增房源功能$")
    public void 用户点击新增房源功能() throws Throwable {
        this.roomsFlow.newRoom();
    }

    @Then("^出现可以选择用户所有的楼宇列表的房源新增窗口$")
    public void 出现可以选择用户所有的楼宇列表的房源新增窗口() throws Throwable {
        this.roomsFlow.enternewRoomPage();
    }

    @Given("^用户进入选择新增窗口$")
    public void 用户进入选择新增窗口() throws Throwable {
        this.roomsFlow.enternewRoomPage1();
    }

    @When("^选择了对应的楼宇，填写完整所有必填项（楼层、房号、招商状态）\"([^\"]*)\"\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void 选择了对应的楼宇_填写完整所有必填项_楼层_房号_招商状态(String building, String floor, String roomNum, String roomArea,
                                              String merchantsState) throws Throwable {
        this.roomsFlow.fillAllInformation(building, floor, roomNum, roomArea, merchantsState);
    }

    @When("^填写完整所有必填项（楼层、房号、招商状态）\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void 填写完整所有必填项_楼层_房号_招商状态(String floor, String roomNum, String roomArea, String merchantsState)
            throws Throwable {
        this.roomsFlow.fillAllInformationChooseBuilding(floor, roomNum, roomArea, merchantsState);
    }

    @When("^点击了保存并提交$")
    public void 点击了保存并提交() throws Throwable {
        this.roomsFlow.submit();
    }

    @Then("^新增了对应楼层房号的房源成功$")
    public void 新增了对应楼层房号的房源成功() throws Throwable {
        this.roomsFlow.newRoomSuccess();
    }

    @Then("^删除这个房源$")
    public void 删除这个房源() throws Throwable {
        this.roomsFlow.clearThisRoom();
    }

    @When("^点击了装修下拉箭头$")
    public void 点击了装修下拉箭头() throws Throwable {
        this.roomsFlow.clickFitmentArrow();
    }

    @Then("^出现毛坯 简装  精装 (\\d+)个选项$")
    public void 出现毛坯_简装_精装_个选项(int arg1) throws Throwable {
        this.roomsFlow.correctFitmentList();
    }

    @When("^点击了招商状态下拉箭头$")
    public void 点击了招商状态下拉箭头() throws Throwable {
        this.roomsFlow.clickAttractArrow();
    }

    @Then("^出现可招商和不可招商两个选项$")
    public void 出现可招商和不可招商两个选项() throws Exception {
        this.roomsFlow.correctAttactList();
    }

    @Given("^用户在单一楼宇页面\"([^\"]*)\"$")
    public void 用户在单一楼宇页面(String building) throws Throwable {
        this.roomsFlow.enterSingleBuildingPage(building);
    }

    @When("^用户点击房源管理$")
    public void 用户点击房源管理() throws Throwable {
        this.roomsFlow.clickRoomsManage();
    }

    @Then("^下面的所有房源根据可招商、不可招商、所有、房源分析四个房源列表，默认展示可招商列表，列名： 楼层、房号、面积、装修、预租单价$")
    public void 显示筛选条件为楼宇_A_B下面的所有房源根据可招商_不可招商_所有_房源分析四个房源列表_默认展示可招商列表_列名_楼层_房号_面积_装修_预租单价() throws Throwable {
        this.roomsFlow.correctSingleBuildingPage();
    }

    @Then("^出现默认为当前楼宇且不能修改的房源新增窗口$")
    public void 出现默认为当前楼宇且不能修改的房源新增窗口() throws Throwable {
        this.roomsFlow.unclickable();
    }

    @Given("^目前集合选中AB俩个楼宇\"([^\"]*)\" \"([^\"]*)\"$")
    public void 目前集合选中ab俩个楼宇(String building1, String building2) throws Throwable {
        this.buildingListFlow.chooseBuildings(building1, building2);
    }

    @Then("^显示筛选条件为楼宇\"([^\"]*)\" \"([^\"]*)\"$")
    public void 显示筛选条件为楼宇(String building1, String building2) throws Throwable {
        this.roomsFlow.correctChooseBuildings(building1, building2);
    }

    @Then("^顶部数据显示已经选中楼宇的楼宇数量、总面积、在租面积百分比和数值、空置面积百分比和数值、在租实时均价、在租合同份数、可招商面积百分比和数值$")
    public void 顶部数据显示已经选中楼宇的楼宇数量_总面积_在租面积百分比和数值_空置面积百分比和数值_在租实时均价_在租合同份数_可招商面积百分比和数值() throws Throwable {
        this.roomsFlow.correctBuildingsCount();
    }

    @When("^点击了已租房源$")
    public void 点击了不可招商() throws Throwable {
        this.roomsFlow.clickUnattract();
    }

    @Then("^列表列名切换成已租房源对应的列名：楼宇名称、楼层、房号、面积、租客、计租日、结束日、合同单价$")
    public void 列表列名切换成不可招商对应的列名_楼宇名称_楼层_房号_面积_租客_计租日_结束日_合同单价() throws Throwable {
        this.roomsFlow.correctTaken();
    }

    @When("^点击了所有房源$")
    public void 点击了所有房源() throws Throwable {
        this.roomsFlow.clickAllRooms();
    }

    @Then("^列表列名切换成所有房源对应的列名：楼宇名称、楼层、房号、面积、租客、招商状态、计租日、结束日、合同单价$")
    public void 列表列名切换成所有房源对应的列名_楼宇名称_楼层_房号_面积_租客_招商状态_计租日_结束日_合同单价() throws Throwable {
        this.roomsFlow.correctAllRooms();
    }

    @When("^用户点击某一条目$")
    public void 用户点击某一条目() throws Throwable {
        this.roomsFlow.clickARoom();
    }

    @Then("^右侧栏划出房源详情页，展示楼层房号信息、面积、帐号状态、预租单价、装修、以及编辑按钮、删除按钮图标、历史操作按钮图标，合同列表、需求列表、物业合同列表，合同列表和物业物业合同列表都根据进行中和已完结可以切换$")
    public void 右侧栏划出房源详情页_展示楼层房号信息_面积_帐号状态_预租单价_装修_以及编辑按钮_删除按钮图标_历史操作按钮图标_合同列表_需求列表_物业合同列表_合同列表和物业物业合同列表都根据进行中和已完结可以切换()
            throws Throwable {
        this.roomsFlow.correctRoomInformation();
    }

    @When("^点击了鼠标hover$")
    public void 点击了鼠标hover() throws Exception {
        this.roomsFlow.moveOnARoomList();
    }

    @When("^点击编辑房源$")
    public void 点击编辑房源() throws Exception {
        this.roomsFlow.modifyRoom();
    }

    @Then("^出现该房源的编辑弹窗$")
    public void 出现该房源的编辑弹窗() throws Throwable {
        this.roomsFlow.correctEditRoom();
    }

    @When("^点击新增合同$")
    public void 点击新增合同() throws Exception {
        this.roomsFlow.addContract();
    }

    @Then("^出现默认选中该房源的新增合同弹窗$")
    public void 出现默认选中该房源的新增合同弹窗() throws Throwable {
        this.roomsFlow.correctNewContractPage();
    }

    @When("^用户输入\"([^\"]*)\"进行搜索$")
    public void 用户输入_进行搜索(String keyword) throws Throwable {
        this.roomsFlow.inputKeyword(keyword);
    }

    @Then("^根据列表出现包含\"([^\"]*)\"的房号的所有房源$")
    public void 根据列表出现包含_的房号的所有房源(String arg1) throws Throwable {

    }

    @Then("^筛选条件中显示这一筛选$")
    public void 筛选条件中显示这一筛选() throws Throwable {

    }

    @When("^房源编辑页面默认填充\"([^\"]*)\"\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void 房源编辑页面默认填充(String building, String floor, String roomNum, String roomArea, String merchantsState)
            throws Throwable {
        this.roomsFlow.checkRoomInformation(building, floor, roomNum, roomArea, merchantsState);
    }

    @When("^删除编辑的这个房源$")
    public void 删除编辑的这个房源() throws Throwable {
        this.roomsFlow.clearThisRoom();
    }

    @Given("^选择所有房源$")
    public void 选择所有房源() throws Exception {
        this.roomsManageFlow.allRooms();
    }

    @When("^选择\"([^\"]*)\"房源,点击编辑房源按钮$")
    public void 选择_房源_点击编辑房源按钮(String arg1) throws Exception {
        this.roomsManageFlow.clickEditRoom(arg1);
    }

    @When("^修改招商状态\"([^\"]*)\"$")
    public void 修改招商状态(String arg1) throws Exception {
        this.roomsManageFlow.updateStatus(arg1);
    }

    @Then("房源的招商状态为\"([^\"]*)\"$")
    public void 房源的招商状态为(String arg2) throws Exception {
        this.roomsManageFlow.checkRoomStatus(arg2);
    }

}
