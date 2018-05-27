package com.souban.bdd.steps.CreamsWebStep.Settings;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoomsSelfDefineStep extends BaseStep {
	@Given("^用户拥有标签管理权限用户进入自定义管理里房源标签管理页面$")
	public void 用户拥有标签管理权限用户进入自定义管理里房源标签管理页面() throws Exception {
		this.roomsSelfDefineFlow.enterSlefDefineRoomsTag();
	}

	@When("^新增一个房源标签列表中并不存在的标签\"([^\"]*)\"$")
	public void 新增一个房源标签列表中并不存在的标签(String RoomTag) throws Exception {
		this.roomsSelfDefineFlow.addNewTag(RoomTag);
	}

	@Then("^删除该房源\"([^\"]*)\"的标签$")
	public void 删除该房源_的标签(String RoomTag) throws Exception {
		this.roomsSelfDefineFlow.deleteNewTag(RoomTag);

	}

	@When("^点选未高亮标签字段\"([^\"]*)\",该标签字段为选中状态$")
	public void 点选未高亮标签字段_该标签字段为选中状态(String RoomTag) throws Exception {
		this.roomsSelfDefineFlow.delightTag(RoomTag);
	}

	@When("^保存$")
	public void 保存() throws Exception {
		this.roomsSelfDefineFlow.save();
	}

	@Then("^在房源信息页面看看是否有该标签\"([^\"]*)\"$")
	public void 在房源信息页面看看是否有该标签(String RoomTag) throws Exception {
		this.roomsSelfDefineFlow.checkTagSucced(RoomTag);
	}

	@Then("^进入编辑房源界面取消标签高亮\"([^\"]*)\"$")
	public void 进入编辑房源界面取消标签高亮(String RoomTag) throws Exception {
		this.roomsSelfDefineFlow.cancelTag(RoomTag);
	}

	@Then("^检查房源标签是否被取消\"([^\"]*)\"$")
	public void 检查房源标签是否被取消(String RoomTag) throws Exception {
		this.roomsSelfDefineFlow.checkTagCancelSucced(RoomTag);
	}

}
