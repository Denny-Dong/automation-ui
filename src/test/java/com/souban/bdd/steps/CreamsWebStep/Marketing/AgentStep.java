package com.souban.bdd.steps.CreamsWebStep.Marketing;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Then;

public class AgentStep extends BaseStep {

	// 创建公司经纪人
	@Then("^select AllAgency$")
	public void select_AllAgency() throws Throwable {
		this.agentFlow.select_AllAgency();
	}

	@Then("^open Create new agent$")
	public void open_Create_new_agent() throws Throwable {
		this.agentFlow.open_Create_new_agent();
	}

	@Then("^select ChannelCategory and company \"([^\"]*)\"$")
	public void select_ChannelCategory_and_company(String arg1) throws Throwable {
		this.agentFlow.select_ChannelCategory_and_company(arg1);
	}

	@Then("^input AgentInfo \"([^\"]*)\" and \"([^\"]*)\"$")
	public void input_AgentInfo_and(String arg1, String arg2) throws Throwable {
		this.agentFlow.input_AgentName_and_AgentTel(arg1, arg2);
	}

	@Then("^select area \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_area(String arg1, String arg2, String arg3) throws Throwable {
		this.agentFlow.select_area(arg1, arg2, arg3);
	}

	@Then("^click CreateAgent$")
	public void click_CreateAgent() throws Throwable {
		this.agentFlow.click_CreateAgent();
	}

	@Then("^create agent \"([^\"]*)\" successfully$")
	public void create_agent_successfully(String arg1) throws Throwable {
		this.agentFlow.VerifyCreateAgentResult(arg1);
	}

	// 创建自由经纪人
	@Then("^select ChannelCategory$")
	public void select_ChannelCategory() throws Throwable {
		this.agentFlow.select_ChannelCategory();
	}

	// 创建其他渠道经纪人
	@Then("^select ChannelCategory and ChannelName \"([^\"]*)\"$")
	public void select_ChannelCategory_and_ChannelName(String arg1) throws Throwable {
		this.agentFlow.select_ChannelCategory_and_ChannelName(arg1);
	}
}
