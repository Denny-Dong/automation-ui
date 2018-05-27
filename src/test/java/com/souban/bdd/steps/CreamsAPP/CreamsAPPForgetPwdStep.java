package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPForgetPwdStep extends BaseStep {
    @When("^点击忘记密码$")
    public void 点击忘记密码() throws Exception {
        this.creamsAPPForgetPwdFlow.clickForgetPwdButton();
    }

    @Then("^进入忘记密码页$")
    public void 进入忘记密码页() throws Exception {
        this.creamsAPPForgetPwdFlow.intoForgetPwdPage();
    }

    @Then("^页面的字段 \"([^\"]*)\" \"([^\"]*)\"显示正确$")
    public void 页面的字段_显示正确(String arg1, String arg2) throws Exception {
        this.creamsAPPForgetPwdFlow.checkKey(arg1, arg2);
    }
}
