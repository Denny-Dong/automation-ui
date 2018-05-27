package com.souban.bdd.steps.CreamsWebStep.Building;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuildingListStep extends BaseStep {
	//新建集合
	@Given("^新建集合 \"([^\"]*)\"$")
	public void 新建集合(String arg1) throws Throwable {
	    this.buildingListFlow.rebuildingNewCollection(arg1);
	}
	
	@Given("^勾选下拉框中的楼宇 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 勾选下拉框中的楼宇(String arg1, String arg2) throws Throwable {
	    this.buildingListFlow.clickBuildingCheckbox(arg1,arg2);
	}

	@Given("^点击保存按钮$")
	public void 点击保存按钮() throws Throwable {
	    this.buildingListFlow.clickSaveButton();
	}

	@Then("^新建好的集合显示在集合列表中 \"([^\"]*)\"$")
	public void 新建好的集合显示在集合列表中(String arg1) throws Throwable {
		this.buildingListFlow.checkBuildingListName(arg1);
	}
	
	//不输入集合名称
	@Given("^点击新建集合按钮$")
	public void 点击新建集合按钮() throws Throwable {
	    this.buildingListFlow.clickNewCollection();
	}
	
	@When("^不输入集合名称$")
	public void 不输入集合名称() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions   
	}

	@When("^系统弹出“请输入集合名称”$")
	public void 系统弹出_请输入集合名称() throws Throwable {
	    this.buildingListFlow.pleaseInputCollectionName();
	}

	@When("^点击确认重新输入$")
	public void 点击确认重新输入() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	//不选择楼盘
	@When("^不对下拉列表中的楼宇进行勾选$")
	public void 不对下拉列表中的楼宇进行勾选() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^系统会弹出“请选择楼盘”$")
	public void 系统会弹出_请选择楼盘() throws Throwable {
	    this.buildingListFlow.pleaseChooseBuildings();
	}

	@When("^点击确认重新勾选$")
	public void 点击确认重新勾选() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.buildingListFlow.clickSureMessage2();
	}
	

	//选择一个或多个楼宇
	
	@Given("^选择一个楼宇 \"([^\"]*)\"$")
	public void 选择一个楼宇(String arg1) throws Throwable {
	    this.buildingListFlow.clickBuilding1(arg1);
	}

	@Then("^检查第一个楼宇信息$")
	public void 检查第一个楼宇信息() throws Throwable {
	    this.buildingListFlow.clickOneBuilding();
	}

	@Then("^选择两个楼宇 \"([^\"]*)\"$")
	public void 选择两个楼宇(String arg1) throws Throwable {
	    this.buildingListFlow.clickBuilding2(arg1);
	}
	

	@Then("^检查两个楼宇信息$")
	public void 检查两个楼宇信息() throws Throwable {
	    this.buildingListFlow.clickTwoBuilding();
	}
	//选择集合
	@When("^选择一个集合 \"([^\"]*)\"$")
	public void 选择一个集合(String arg1) throws Throwable {
	    this.buildingListFlow.chooseOneCollection(arg1);
	}


	@Then("^右边页面根据选择的集合进行数据显示$")
	public void 右边页面根据选择的集合进行数据显示() throws Throwable {
	    this.buildingListFlow.checkCollectionInformation1();
	  
	}
	//修改集合
	@When("^修改集合信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 修改集合信息(String arg1, String arg2, String arg3) throws Throwable {
		this.buildingListFlow.changeCollectionInformation(arg1, arg2, arg3);
	}
	
	@When("^保存修改集合信息 \"([^\"]*)\"$")
	public void 保存修改集合信息(String arg1) throws Throwable {
	    this.buildingListFlow.saveAfterFixInformation(arg1);
	}

	@Then("^检查修改之后的信息$")
	public void 检查修改之后的信息() throws Throwable {
		this.buildingListFlow.checkInformtionAfterFix();
	}
	//删除集合
	@When("^删除集合 \"([^\"]*)\"$")
	public void 删除集合(String arg1) throws Throwable {
	    this.buildingListFlow.deleteCollection(arg1);
	}

	@Then("^此集合在集合列表中被删除 \"([^\"]*)\"$")
	public void 此集合在集合列表中被删除(String arg1) throws Throwable {
	    this.buildingListFlow.checkdeleteinformation(arg1);
	}

	

}
