package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPMyCollectionStep extends BaseStep{
	/**
	 * 新建集合
	 * @throws Throwable 异常
	 */
	@When("^点击我的集合$")
	public void 点击我的集合() throws Throwable {
		this.creamsAPPMyCollectionFlow.clickMyQuery();
		this.creamsAPPMyCollectionFlow.intoMyQueryPage();
	}

	@When("^点击我的集合页面上的新建按钮$")
	public void 点击我的集合页面上的新建按钮() throws Throwable {
	    this.creamsAPPMyCollectionFlow.clickNewQueryButton();
	    this.creamsAPPMyCollectionFlow.intoSelectBuild();
	}

	//选择单个楼宇
	@When("^在选择楼宇页面选择楼宇 \"([^\"]*)\"$")
	public void 在选择楼宇页面选择楼宇(String buildingName) throws Throwable {
	    this.creamsAPPMyCollectionFlow.selectBuilding(buildingName);
	}

	//选择多个楼宇
	@When("^在选择楼宇页面选择多个楼宇 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 在选择楼宇页面选择多个楼宇(String buildingName1,String buildingName2,String buildingName3) throws Throwable {
		this.creamsAPPMyCollectionFlow.selectMoreBuilding(buildingName1,buildingName2,buildingName3);
	}

	@When("^点击选择楼宇页面上的完成按钮$")
	public void 点击选择楼宇页面上的完成按钮() throws Throwable {
	    this.creamsAPPMyCollectionFlow.clickCompleteButton();
	    this.creamsAPPMyCollectionFlow.intoInputQueryNamePage();
	}

	@When("^在请输入分组名称弹窗的输入框中输入名称 \"([^\"]*)\"$")
	public void 在请输入分组名称弹窗的输入框中输入名称(String queryName) throws Throwable {
	    this.creamsAPPMyCollectionFlow.inputQueryName(queryName);
	}

	@When("^点击请输入分组名称弹窗上的确定按钮$")
	public void 点击请输入分组名称弹窗上的确定按钮() throws Throwable {
	    this.creamsAPPMyCollectionFlow.clickConfirmButton();
	}

	@Then("^我的查询列表中存在一条分组名称为 \"([^\"]*)\"的查询，查询新建成功$")
	public void 我的查询列表中存在一条分组名称为_的查询_查询新建成功(String queryName) throws Throwable {
	    this.creamsAPPMyCollectionFlow.newMyQuerySuccessful(queryName);
	}

	//android
	@Then("^楼盘数量显示正确 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 楼盘数量显示正确(String queryName, String count) throws Throwable {
	    this.creamsAPPMyCollectionFlow.checkBuildCountForAndroid(queryName, count);
	}

	//ios
	@Then("^楼盘数量显示正确 \"([^\"]*)\"$")
	public void 楼盘数量显示正确(String count) throws Throwable {
	    this.creamsAPPMyCollectionFlow.checkBuildCountForIos(count);
	}
	
	
	
	
	
	/**
	 * 删除我的集合
	 * 1.android通过长按新建的查询可以弹出删除弹窗
	 * 2.ios左滑新建的查询可以显示删除按钮
	 * @param queryName 集合名称
	 * @throws Throwable
	 */
	//android
	@When("^长按成功新建的查询 \"([^\"]*)\"$")
	public void 长按成功新建的查询(String queryName) throws Throwable {
	    this.creamsAPPMyCollectionFlow.longPress(queryName);
	    this.creamsAPPMyCollectionFlow.intoDeletePage();
	}
	//ios
	@When("^左滑新建的查询 \"([^\"]*)\"$")
	public void 左滑新建的查询(String arg1) throws Throwable {
	   this.creamsAPPMyCollectionFlow.swipeleft(arg1);
	}
	@When("^点击是否删除这条查询页面上的确定按钮$")
	public void 点击是否删除这条查询页面上的删除按钮() throws Throwable {
	    this.creamsAPPMyCollectionFlow.clickDeleteButton();
	}
	@Then("^我的集合列表不存在分组名称为 \"([^\"]*)\"的查询，查询删除成功$")
	public void 我的集合列表不存在分组名称为_的查询_查询删除成功(String queryName) throws Throwable {
	    this.creamsAPPMyCollectionFlow.deleteMyQuerySuccessful(queryName);
	}
	@Then("^点击我的集合页的返回按钮回到我的主页$")
	public void 点击我的集合页的返回按钮回到我的主页() throws Exception {
		this.creamsAPPMyCollectionFlow.backToMyPage();
	}
}