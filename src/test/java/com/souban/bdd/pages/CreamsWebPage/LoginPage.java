package com.souban.bdd.pages.CreamsWebPage;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class LoginPage extends ParentPage {

	public LoginPage(final Driver driver) {
		super(driver);
	}

	private UIElement INP_Username = new UIElement("xpath=//*[@id='emailaddress']");
	private UIElement INP_Password = new UIElement("id=password");
	private UIElement BTN_login = new UIElement("xpath=//*[text()='登 录']/parent::button");
	private UIElement TXT_Assemble = new UIElement("xpath=//*[text()='集合']");
	private UIElement TXT_Workflow = new UIElement("xpath=//*[text()='工作流']");

	public void openLoginPage(String uRL) {
		this.driver.get(uRL);
	}

	public void inputUsernameAndPassword(String username, String password) {
		this.driver.elementSendText(INP_Username, username);
		this.driver.elementSendText(INP_Password, password);
		this.driver.click(BTN_login);
	}

	public void adminLogin(String uRL, String username, String password) {
		this.openLoginPage(uRL);
		this.inputUsernameAndPassword(username, password);
	}

	public boolean verifyLoginStatus() {
		this.driver.waitForElement(TXT_Assemble, 5);
		if (this.driver.isElementFound(TXT_Assemble) && this.driver.isElementFound(TXT_Workflow)) {
			return true;
		} else {
			System.out.println("没有找到集合和工作流，网络延迟超过5s以上");
			return false;
		}

	}

}
