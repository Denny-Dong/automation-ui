package com.souban.bdd.flows.CreamsWebFlow.Marketing;

import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Marketing.CustomerPage;

public class CustomerFlow {
	private CustomerPage customerPage = null;

	public CustomerFlow(final Driver driver) {
		this.customerPage = PageFactory.getPage(CustomerPage.class, driver);
	}

	public void clickMerchantsManagement() {
		this.customerPage.clickMerchantsManagement();
	}

	public void clickNewCustomer() {
		Assert.assertThat(this.customerPage.clickNewCustomer(), is(true));
	}

	public void inputCustomerInfo(String time, String building, String company, String industry,
			String contactPersonOne, String contactPersonOneTel) {
		this.customerPage.inputCustomerInfo(time, building, company, industry, contactPersonOne, contactPersonOneTel);
	}

	public void ChooseIntentionAnalysis(String visitingRoute, String intentRoom, String area) {
		this.customerPage.ChooseIntentionAnalysis(visitingRoute, intentRoom, area);
	}

	public void ChooseCustomerStatus(String customerStatus, String customerNotes) {
		this.customerPage.ChooseCustomerStatus(customerStatus, customerNotes);
	}

	public void Choose_channel_type(String channelType, String channelContactPerson) {
		this.customerPage.Choose_channel_type(channelType, channelContactPerson);
	}

	public void Submit() {
		this.customerPage.Submit();
	}

	public void AddedCustomerSuccess(String contactPersonOne) {
		Assert.assertThat(this.customerPage.AddedCustomerSuccess(contactPersonOne), is(true));
	}

	public void goto_my_client() {
		this.customerPage.goto_my_client();
	}

	public void change_client_to_lost(String client) {
		this.customerPage.change_client_to_lost(client);
	}

	public void client_in_public_pool(String client) {
		Assert.assertThat(this.customerPage.client_in_public_pool(client), is(true));
	}

	public void goto_public_pool() {
		this.customerPage.goto_public_pool();
	}

	public void change_client_to_myclient(String client) {
		this.customerPage.change_client_to_myclient(client);
	}

	public void client_in_my_client(String client) {
		Assert.assertThat(this.customerPage.client_in_my_client(client), is(true));
	}

	public void edit_customer_reminder(String client, String time, String content) {
		this.customerPage.edit_customer_reminder(client, time, content);
	}

	public void verify_whether_remind(String client) {
		Assert.assertThat(this.customerPage.verify_whether_remind(client), is(true));
	}

	public void click_screen_way() {
		this.customerPage.click_screen_way();

	}

	public void checkWay(String way) {
		this.customerPage.checkWay(way);
		this.customerPage.clickConfirm();

	}

	public void doorsuccefully(String way) {
		List<String> allDoor = new ArrayList<>();
		allDoor = this.customerPage.wayList();
		for (String str : allDoor) {
			Assert.assertThat(str, is(way));

		}

	}

	public void checkIntention(String intention) {
		// TODO Auto-generated method stub
		this.customerPage.click_intention();
		this.customerPage.checkIntention(intention);
		this.customerPage.clickConfirm();
	}

	public void unclassifiedsuccessfully(String intention) {
		// TODO Auto-generated method stub
		List<String> allUnclassified = new ArrayList<>();
		allUnclassified = this.customerPage.intentionList();
		for (String str : allUnclassified) {
			Assert.assertThat(str, is(intention));

		}

	}

	public void checkFunction() {
		this.customerPage.checkFunction();
	}

	public void enterMessagePage() {
		// TODO Auto-generated method stub
		this.customerPage.clickAll();
		this.customerPage.clickAllYes();

	}

	public void inputMessage(String message) {
		// TODO Auto-generated method stub
		this.customerPage.inputMessage(message);

	}

	public void clickSend() {
		// TODO Auto-generated method stub
		this.customerPage.clickSend();

	}

	public void hintPay() {
		Assert.assertThat(this.customerPage.hitPay(), is(true));

	}

}
