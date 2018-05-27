package com.souban.bdd.steps.CreamsWebStep;

import com.souban.bdd.framework.Config;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends BaseStep {

	Config config = Config.getInstance();

	@Given("^Open \"([^\"]*)\" of CREAMS$")
	public void open_of_CREAMS(String URL) throws Throwable {
		this.loginFlow.OpenBetaCreamsIoOfCREAMS(URL);
	}

	@When("^Input \"([^\"]*)\" and \"([^\"]*)\" then submit$")
	public void input_and_then_submit(String username, String password) throws Throwable {
		this.loginFlow.inputUsernameAndPassword(username, password);
	}

	@Then("^Login successfully$")
	public void login_successfully() throws Throwable {
		this.loginFlow.loginSuccessfully();
	}

	@Given("^有招商管理权限的用户登录$")
	public void admin_login() throws Throwable {
		this.loginFlow.adminLogin(config.get("login.web.address"), config.get("login.user.name"),
				config.get("login.user.password"));
	}

	@Given("^用户登录$")
	public void login() throws Throwable {
		this.loginFlow.adminLogin(config.get("login.web.address"), config.get("login.user.name"),
				config.get("login.user.password"));
	}

	@Given("^Open mainpage of CREAMS$")
	public void open_mainpage_of_CREAMS() throws Throwable {
		this.loginFlow.OpenBetaCreamsIoOfCREAMS(config.get("login.web.address"));
	}

	@When("^Input username and password then submit$")
	public void input_username_and_password_then_submit() throws Throwable {
		this.loginFlow.inputUsernameAndPassword(config.get("login.user.name"), config.get("login.user.password"));
	}

	@Given("^Admin login successfully$")
	public void admin_login_successfully() throws Throwable {
		this.loginFlow.adminLogin(config.get("login.web.address"), config.get("login.user.name"),
				config.get("login.user.password"));
	}
}
