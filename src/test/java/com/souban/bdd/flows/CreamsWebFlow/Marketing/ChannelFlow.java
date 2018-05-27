package com.souban.bdd.flows.CreamsWebFlow.Marketing;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Marketing.ChannelPage;

public class ChannelFlow {

	private ChannelPage channelpage = null;

	public ChannelFlow(final Driver driver) {
		this.channelpage = PageFactory.getPage(ChannelPage.class, driver);
	}

	public void select_Investment_management_and_Channel_management() {
		this.channelpage.select_Investment_management_and_Channel_management();
	}

	public void select_agency() {
		this.channelpage.select_agency();
	}

	public void select_CreamsAgent() {
		this.channelpage.select_CreamsAgent();
	}

	public void mouseOverMyAgent() {
		this.channelpage.mouseOverMyAgent();
	}

	public void open_Create_new_agency() throws InterruptedException {
		this.channelpage.open_Create_new_agency();
	}

	public void InputCompanyAndContactNameAndContactTel(String company, String contactName, String contactTel) {
		this.channelpage.InputCompanyAndContactNameAndContactTel(company, contactName, contactTel);
	}

	public void click_create() {
		this.channelpage.click_create();
	}

	public void VerifyCreateAgencyResult(String agency) {
		Assert.assertThat(this.channelpage.CheckCreateAgencyResult(agency), is(true));

	}

	public void myAgentNum() {
		boolean[] flag = new boolean[5];
		flag = this.channelpage.myAgentNum();
		for (boolean i : flag) {
			Assert.assertThat(i, is(true));
		}

	}

	public void MoveCreamsAgentToMyAgent(String agent) {
		this.channelpage.MoveCreamsAgentToMyAgent(agent);
	}

	public void VerifyCreamsAgentToMyAgent(String agent) {
		Assert.assertThat(this.channelpage.hasAgent(agent), is(true));

	}

	public void selectCity(String city) {
		this.channelpage.selectCity(city);
	}

	public void checkCity(String city) {
		List<String> allCity = new ArrayList<String>();
		allCity = this.channelpage.cityList();
		for (String str : allCity) {
			Assert.assertThat(str, is(city));
		}
	}

	public void selectArea(String city, String area) {
		this.channelpage.selectArea(city, area);
	}

	public void checkArea(String city) {
		List<String> allArea = new ArrayList<String>();
		allArea = this.channelpage.areaList();
		for (String str : allArea) {
			Assert.assertThat(str, is(city));
		}
	}

	public void selectChannel(String channel) {
		this.channelpage.selectChannel(channel);
	}

	public void checkChannel(String channel) {
		List<String> allChannel = new ArrayList<String>();
		allChannel = this.channelpage.channelList();
		for (String str : allChannel) {
			Assert.assertThat(str, is(channel));
		}
	}

	public void goToEightPage() {
		this.channelpage.goToEightPage();
	}

	public void timeAscending() {
		this.channelpage.timeAscending();
	}

	public void checkAscendingTime() {
		List<String> allTime = new ArrayList<String>();
		allTime = this.channelpage.getFollowUpTime();
		String[] Time = new String[10];
		int i = 0;
		for (String str : allTime) {
			Time[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Time[j].compareTo(Time[j + 1]), lessThanOrEqualTo(0));
		}
	}

	public void timeDescending() {
		this.channelpage.timeDescending();
	}

	public void checkDescendingTime() {
		List<String> allTime = new ArrayList<String>();
		allTime = this.channelpage.getFollowUpTime();
		String[] Time = new String[10];
		int i = 0;
		for (String str : allTime) {
			Time[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Time[j].compareTo(Time[j + 1]), greaterThanOrEqualTo(0));

		}
	}

	public void lookAscending() {
		this.channelpage.lookAscending();
	}

	public void checkAscendinglook() {
		List<String> allLook = new ArrayList<String>();
		allLook = this.channelpage.getLookNum();
		String[] Look = new String[10];
		int i = 0;
		for (String str : allLook) {
			Look[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Look[j].compareTo(Look[j + 1]), lessThanOrEqualTo(0));
		}
	}

	public void lookDescending() {
		this.channelpage.lookDescending();
	}

	public void checkDescendinglook() {
		List<String> allLook = new ArrayList<String>();
		allLook = this.channelpage.getLookNum();
		String[] Look = new String[10];
		int i = 0;
		for (String str : allLook) {
			Look[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Look[j].compareTo(Look[j + 1]), greaterThanOrEqualTo(0));

		}
	}

	public void functionSelection() {
		this.channelpage.functionSelection();
	}

	public void search(String contact) {
		this.channelpage.search(contact);
	}

	public void checkSearchContact(String contact) {
		List<String> allContact = new ArrayList<String>();
		allContact = this.channelpage.contactList();
		for (String str : allContact) {
			Assert.assertThat(str, is(contact));
		}
	}

	public void checkSearchPhone(String phone) {
		List<String> allPhone = new ArrayList<String>();
		allPhone = this.channelpage.phoneList();
		for (String str : allPhone) {
			Assert.assertThat(str, is(phone));
		}
	}

}
