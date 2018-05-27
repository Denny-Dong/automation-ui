package com.souban.bdd.flows.CreamsWebFlow;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.LoginPage;


public class LoginFlow {

    private LoginPage loginPage = null;

    public LoginFlow(final Driver driver) {
        this.loginPage = PageFactory.getPage(LoginPage.class, driver);
    }

    public void OpenBetaCreamsIoOfCREAMS(String URL) {
        this.loginPage.openLoginPage(URL);
    }

    public void inputUsernameAndPassword(String username, String password) {
        this.loginPage.inputUsernameAndPassword(username, password);
    }

    public void loginSuccessfully() {
        this.VerifyResult(this.loginPage.verifyLoginStatus(), true);
    }

    public void VerifyResult(boolean testResult, boolean expectedResult) {
        Assert.assertThat(testResult, is(expectedResult));
    }

    public void adminLogin(String uRL, String username, String password) {
        this.loginPage.adminLogin(uRL, username, password);
        this.VerifyResult(this.loginPage.verifyLoginStatus(), true);
    }
}
