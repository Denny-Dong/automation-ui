package com.souban.bdd.flows.CreamsWebFlow.Marketing;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Marketing.AgentPage;

public class AgentFlow {

	private AgentPage agentPage = null;

	public AgentFlow(final Driver driver) {
		this.agentPage = PageFactory.getPage(AgentPage.class, driver);
	}

	public void select_AllAgency() {
		this.agentPage.select_AllAgency();
	}

	public void open_Create_new_agent() throws InterruptedException {
		this.agentPage.open_Create_new_agent();
	}

	public void select_ChannelCategory_and_company(String company) {
		this.agentPage.select_ChannelCategory_and_company(company);
	}

	public void input_AgentName_and_AgentTel(String Name, String Tel) {
		this.agentPage.input_AgentName_and_AgentTel(Name, Tel);
	}

	public void select_area(String province, String city, String region) {
		this.agentPage.select_area(province, city, region);
	}

	public void click_CreateAgent() {
		this.agentPage.click_CreateAgent();
	}

	public void VerifyCreateAgentResult(String Agent) {
		Assert.assertThat(this.agentPage.create_Agent_successfully(Agent), is(true));
	}

	// 创建自由经纪人
	public void select_ChannelCategory() {
		this.agentPage.select_ChannelCategory();
	}

	// 创建其他渠道经纪人
	public void select_ChannelCategory_and_ChannelName(String channelName) {
		this.agentPage.select_ChannelCategory_and_ChannelName(channelName);
	}
}
