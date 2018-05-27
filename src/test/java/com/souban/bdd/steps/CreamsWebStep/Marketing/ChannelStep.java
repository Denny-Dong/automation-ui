package com.souban.bdd.steps.CreamsWebStep.Marketing;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChannelStep extends BaseStep {

	@When("^select Investment management and Channel management$")
	public void select_Investment_management_and_Channel_management() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.channelFlow.select_Investment_management_and_Channel_management();
	}

	@When("^select agency$")
	public void select_agency() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.channelFlow.select_agency();
	}

	@When("^open Create new agency$")
	public void open_Create_new_agency() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.channelFlow.open_Create_new_agency();
	}

	@When("^input \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void input_and_and(String arg1, String arg2, String arg3) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.channelFlow.InputCompanyAndContactNameAndContactTel(arg1, arg2, arg3);
	}

	@When("^click create$")
	public void click_create() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.channelFlow.click_create();
	}

	@Then("^\"([^\"]*)\" create successfully$")
	public void agency_create_successfully(String arg1) throws Throwable {
		this.channelFlow.VerifyCreateAgencyResult(arg1);
	}

	@Given("^打开渠道管理模块$")
	public void open_channel_management() throws Throwable {
		this.channelFlow.select_Investment_management_and_Channel_management();
	}

	@When("^渠道管理，鼠标滑动到我的经纪人和平台经纪人$")
	public void mouse_over_myagent() throws Throwable {
		this.channelFlow.mouseOverMyAgent();
	}

	@Then("^我的经纪人和平台经纪人下级菜单尾部都带有数量统计$")
	public void myAgentNum() throws Throwable {
		this.channelFlow.myAgentNum();
	}

	@And("^进入creams经纪人$")
	public void 进入creams经纪人() throws Throwable {
		this.channelFlow.select_CreamsAgent();
	}

	@When("^添加到我的经纪人 \"([^\"]*)\"$")
	public void 添加到我的经纪人(String arg1) throws Throwable {
		this.channelFlow.MoveCreamsAgentToMyAgent(arg1);
	}

	@Then("^我的经纪人存在用户 \"([^\"]*)\"$")
	public void 我的经纪人存在用户(String arg1) throws Throwable {
		this.channelFlow.VerifyCreamsAgentToMyAgent(arg1);
	}

	@When("^筛选城市 \"([^\"]*)\"$")
	public void 筛选城市(String arg1) throws Throwable {
		this.channelFlow.selectCity(arg1);
	}

	@Then("^我的经纪人列表只显示该城市的经纪人 \"([^\"]*)\"$")
	public void 我的经纪人列表只显示该城市的经纪人(String arg1) throws Throwable {
		this.channelFlow.checkCity(arg1);
	}

	@When("^筛选区域 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 筛选区域(String arg1, String arg2) throws Throwable {
		this.channelFlow.selectArea(arg1, arg2);
	}

	@Then("^我的经纪人列表只显示该区域的经纪人 \"([^\"]*)\"$")
	public void 我的经纪人列表只显示该区域的经纪人(String arg1) throws Throwable {
		this.channelFlow.checkArea(arg1);
	}

	@When("^筛选渠道类型 \"([^\"]*)\"$")
	public void 筛选渠道类型(String arg1) throws Throwable {
		this.channelFlow.selectChannel(arg1);
	}

	@Then("^我的经纪人列表只显示该渠道类型的经纪人 \"([^\"]*)\"$")
	public void 我的经纪人列表只显示该渠道类型的经纪人(String arg1) throws Throwable {
		this.channelFlow.checkChannel(arg1);
	}

	@Given("^点击第八页$")
	public void 点击第八页() throws Throwable {
		this.channelFlow.goToEightPage();
	}

	@When("^点击最新更进时间升序排序$")
	public void 点击最新更进时间升序排序() throws Throwable {
		this.channelFlow.timeAscending();
	}

	@Then("^验证我的经纪人列表根据最新更进时间升序排序$")
	public void 验证我的经纪人列表根据最新更进时间升序排序() throws Throwable {
		this.channelFlow.checkAscendingTime();
	}

	@When("^点击最新更进时间降序排序$")
	public void 点击最新更进时间降序排序() throws Throwable {
		this.channelFlow.timeDescending();
	}

	@Then("^验证我的经纪人列表根据最新跟进时间降序排序$")
	public void 验证我的经纪人列表根据最新跟进时间降序排序() throws Throwable {
		this.channelFlow.checkDescendingTime();
	}

	@When("^点击带看量升序排序$")
	public void 点击带看量升序排序() throws Throwable {
		this.channelFlow.lookAscending();
	}

	@Then("^验证我的经纪人列表根据带看量升序排序$")
	public void 验证我的经纪人列表根据带看量升序排序() throws Throwable {
		this.channelFlow.checkAscendinglook();
	}

	@When("^点击带看量降序排序$")
	public void 点击带看量降序排序() throws Throwable {
		this.channelFlow.lookDescending();
	}

	@Then("^验证我的经纪人列表根据带看量降序排序$")
	public void 验证我的经纪人列表根据带看量降序排序() throws Throwable {
		this.channelFlow.checkDescendinglook();
	}

	@Given("^点击功能选择$")
	public void 点击功能选择() throws Throwable {
		this.channelFlow.functionSelection();
	}

	@When("^搜索 \"([^\"]*)\"$")
	public void 搜索(String arg1) throws Throwable {
		this.channelFlow.search(arg1);
	}

	@Then("^验证搜索联系人结果 \"([^\"]*)\"$")
	public void 验证搜索联系人结果(String arg1) throws Throwable {
		this.channelFlow.checkSearchContact(arg1);
	}

	@Then("^验证搜索电话结果 \"([^\"]*)\"$")
	public void 验证搜索电话结果(String arg1) throws Throwable {
		this.channelFlow.checkSearchPhone(arg1);
	}

}
