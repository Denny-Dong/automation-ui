package com.souban.bdd.steps.CreamsWebStep.Room;

import java.util.List;
import java.util.Map;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//清理多余信息暂时不用
public class RoomsManageStep extends BaseStep {

    @Given("^当前用户所在剖面图页面$")
    public void 当前用户所在剖面图页面() throws Throwable {
        this.roomsManageFlow.enterFloor();
    }

    @When("^点击任何一个房源$")
    public void 点击任何一个房源() throws Throwable {
        this.roomsManageFlow.enterRoom();

    }

    @Then("^右侧栏划出房源详情页，展示楼层房号信息、面积、招商状态、预租单价、装修，以及编辑按钮、删除按钮图标、历史操作按钮图标，租赁合同信息、客户信息、物业合同信息$")
    public void 右侧栏划出房源详情页_展示楼层房号信息_面积_招商状态_预租单价_装修_以及编辑按钮_删除按钮图标_历史操作按钮图标_租赁合同信息_客户信息_物业合同信息() throws Throwable {
        this.roomsManageFlow.enterRoomInformation();
    }

    @Given("^已进入剖面图房源侧滑栏页面,进入房源\"([^\"]*)\"$")
    public void 已进入剖面图房源侧滑栏页面_进入房源(String roomNum) throws Throwable {
        this.roomsManageFlow.inPictureAndMyRoom(roomNum);
    }

    @When("^点击房源编辑按钮$")
    public void 点击房源编辑按钮() throws Throwable {
        this.roomsManageFlow.enterEdit();
    }

    @Then("^弹窗打开房源编辑页面$")
    public void 弹窗打开房源编辑页面() throws Throwable {
        this.roomsManageFlow.checkEdit();
    }

    @Given("^已进入剖面图房源\"([^\"]*)\"侧滑栏页面，当前有物业合同信息$")
    public void 已进入剖面图房源侧滑栏页面_当前有物业合同信息(String roomNum) throws Throwable {
        this.roomsManageFlow.inPictureAndMyRoom(roomNum);

    }

    @When("^新增物业合同，填写物业合同详细信息\"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void 新增物业合同_填写物业合同详细信息(String hiremanname, String propertytype, String staticmoney, String propertyprice,
                                  String propertyweek, String payday, String powerwasteprice, String powermoneyweek, String powerpayday)
            throws Throwable {
        this.roomsManageFlow.fillPropertyInformation(hiremanname, propertytype, staticmoney, propertyprice,
                propertyweek, payday, powerwasteprice, powermoneyweek, powerpayday);
    }

    @Then("^新建客户\"([^\"]*)\"的物业合同成功$")
    public void 新建客户_的物业合同成功(String hiremanname) throws Exception {
        this.roomsManageFlow.createContractSucced(hiremanname);
    }

    @Then("^删掉客户为\"([^\"]*)\"的物业合同$")
    public void 删掉客户为_的物业合同(String hiremanname) throws Exception {
        this.roomsManageFlow.deletePropertyContract(hiremanname);
    }

    @Given("^已进入剖面图房源\"([^\"]*)\"侧滑栏页面，当前物业合同信息无合同存在$")
    public void 已进入剖面图房源侧滑栏页面_当前物业合同信息无合同存在(String roomNum) throws Throwable {
        this.roomsManageFlow.inPictureAndMyRoom(roomNum);
    }

    @Given("^已进入剖面图房源\"([^\"]*)\"侧滑栏页面，当前有客户信息$")
    public void 已进入剖面图房源_侧滑栏页面_当前有客户信息(String roomNum) throws Throwable {
        this.roomsManageFlow.inPictureAndMyRoom(roomNum);
    }

    @When("^新建客户，填写客户信息 \"([^\"]*)\"$")
    public void 新建客户_填写客户信息(String customername) throws Throwable {
        this.roomsManageFlow.compeleteCusInfo(customername);
    }

    @Then("^弹窗新建客户，新建成功最显示最上方显示客户名称\"([^\"]*)\"已有客户信息往下排列，最新排在最上$")
    public void 弹窗新建客户_新建成功最显示最上方显示客户名称_已有客户信息往下排列_最新排在最上(String customername) throws Throwable {
        this.roomsManageFlow.checkLatestCustormer(customername);
    }

    @Given("^已进入剖面图房源\"([^\"]*)\"侧滑栏页面，当前租赁合同信息无合同存在$")
    public void 已进入剖面图房源_侧滑栏页面_当前租赁合同信息无合同存在(String roomNum) throws Throwable {
        this.roomsManageFlow.inPictureAndMyRoom(roomNum);
    }

    @When("^新增租赁合同，填写租赁合同详细信息\"([^\"]*)\"费用条款\"([^\"]*)\"\"([^\"]*)\"$")
    public void 新增租赁合同_填写租赁合同详细信息_费用条款(String myCustomer, String keepmoney, String basicmoney) throws Throwable {
        this.roomsManageFlow.fullHireContract(myCustomer, keepmoney, basicmoney);
    }

    @Then("^删除客户为\"([^\"]*)\"的租赁合同$")
    public void 删除客户为_的租赁合同(String myCustomer) throws Exception {
        this.roomsManageFlow.deleteHireContract(myCustomer);
    }

    @When("^已进入剖面图房源侧滑栏页面,点击删除按钮, 删除带\"([^\"]*)\"的房源$")
    public void 已进入剖面图房源侧滑栏页面_点击删除按钮_删除带_的房源(String roomNum) throws Throwable {
        this.roomsManageFlow.deleteMyRoom(roomNum);
    }

    @Then("^弹出二次确认框，确认之后，删除带\"([^\"]*)\"的房源成功，剖面图房源详情页收回，返回剖面图页面$")
    public void 弹出二次确认框_确认之后_删除带_的房源成功_剖面图房源详情页收回_返回剖面图页面(String roomNum) throws Throwable {
        this.roomsManageFlow.deleteSuc(roomNum);
    }

    @When("^已进入剖面图房源侧滑栏页面，进入新创建测房源\"([^\"]*)\"当前客户信息无客户存在$")
    public void 已进入剖面图房源侧滑栏页面_进入新创建测房源_当前客户信息无客户存在(String roomNum) throws Throwable {
        this.roomsManageFlow.clickMyRoom(roomNum);
    }

    @Then("^删除带\"([^\"]*)\"该房源$")
    public void 删除带_该房源(String customername) throws Exception {
        this.roomsManageFlow.clickDlt2(customername);
    }

    @Then("^新建客户\"([^\"]*)\"成功$")
    public void 新建客户_成功(String customername) throws Exception {
        this.roomsManageFlow.checkLatestCustormer(customername);
    }

    @Then("^新建租赁合同\"([^\"]*)\"成功$")
    public void 新建租赁合同_成功(String myCustomer) throws Exception {
        this.roomsManageFlow.checkHireSuc(myCustomer);
    }

    @Given("^已进入剖面图房源侧滑栏页面，当前有物业合同信息$")
    public void 已进入剖面图房源侧滑栏页面_当前有物业合同信息(DataTable datamap) throws Exception {
        List<Map<String, String>> testdata = datamap.asMaps(String.class, String.class);
        try {
            this.roomsManageFlow.inPictureAndMyRoom(testdata.get(0).get("roomNum"));
        } catch (Exception e) {
            return;
        }

    }

    @Then("^清空物业合同$")
    public void 清空物业合同(DataTable datamap) throws Exception {
        List<Map<String, String>> testdata = datamap.asMaps(String.class, String.class);
        try {
            this.roomsManageFlow.deletePropertyContract(testdata.get(0).get("hiremanname"));
        } catch (Exception e) {
            return;
        }
    }

    @Given("^点击新增租客未输入租客名称，直接点击保存$")
    public void 未输入租客名称_直接点击保存() throws Exception {
        this.roomsManageFlow.clickSaveCustomer();
    }

    @Then("^租客名下方出现提示“请填写姓名或公司”，无法保存$")
    public void 租客名下方出现提示_请填写姓名或公司_无法保存() throws Exception {
        this.roomsManageFlow.clickHighLightNameOrCompany();
    }

    @When("^点击删除房源按钮$")
    public void 点击删除房源按钮() throws Exception {
        this.roomsManageFlow.clickDeleteRoom();
    }

    @When("^弹出\"([^\"]*)\"提示确认框$")
    public void 弹出_提示确认框(String arg1) throws Exception {
        this.roomsManageFlow.alertIsDeleteRoom(arg1);
    }

    @When("^点击是$")
    public void 点击是() throws Exception {
        this.roomsManageFlow.clickYes();

    }

    @Then("^弹出\"([^\"]*)\"提示框，点击确认$")
    public void 弹出_提示框_点击确认(String arg1) throws Exception {
        this.roomsManageFlow.alertMessage(arg1);
    }

    @When("^新增房源页选择楼宇\"([^\"]*)\"$")
    public void 新增房源页选择楼宇(String arg1) throws Exception {
        this.roomsManageFlow.chooseBuilding(arg1);
    }

    @When("^填写房源信息\"([^\"]*)\"楼层、 \"([^\"]*)\"房号、 \"([^\"]*)\"面积$")
    public void 填写房源信息_楼层_房号_面积(String arg1, String arg2, String arg3) throws Exception {
        this.roomsManageFlow.confirmRoomInfo(arg1, arg2, arg3);
    }

    @When("^保存房源$")
    public void 保存房源() throws Exception {
        this.roomsManageFlow.clickSave();
    }

    @When("^选择\"([^\"]*)\"楼宇的\"([^\"]*)\"房源$")
    public void 选择_楼宇的_房源(String arg1, String arg2) throws Exception {
        this.roomsManageFlow.chooseRoomNum(arg1, arg2);
    }

    @When("^点击新增客户$")
    public void 点击新增客户() throws Exception {
        this.roomsManageFlow.clickAddRenter();
    }

    @When("^输入客户信息\"([^\"]*)\"，并保存客户$")
    public void 输入客户信息_并保存客户(String arg1) throws Exception {
        this.roomsManageFlow.inputRenterInfo(arg1);
    }

    @When("^在可招商列表$")
    public void 在可招商列表() throws Exception {
        this.roomsManageFlow.enterInvitingInvestmentList();
    }

//    @When("^\"([^\"]*)\"房源存在$")
//    public void 房源存在(String arg1) throws Exception {
//        this.roomsManageFlow.isExsitRoom(arg1);
//    }

    @Then("^\"([^\"]*)\"房源存在$")
    public void 房源存在(String arg1) throws Exception {
        this.roomsManageFlow.isExsitRoom(arg1);
    }

    @When("^在已租房源列表$")
    public void 在已租房源列表() throws Exception {
        this.roomsManageFlow.enterLetRoomList();
    }

    @Then("^在所有房源列表$")
    public void 在所有房源列表() throws Exception {
        this.roomsManageFlow.enterAllRoomList();
    }

//    @Then("^\"([^\"]*)\"房源存在$")
//    public void 房源存在(String arg1) throws Exception {
//        this.roomsManageFlow.isExsitRoom(arg1);
//    }
}
