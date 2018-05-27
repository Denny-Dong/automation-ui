package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreamsAPPAboutUsStep extends BaseStep {
    @Given("^点击关于我们$")
    public void 点击关于我们() throws Exception {
        this.creamsAPPAboutUsFlow.clickAboutUs();
    }

    @Then("^成功进入关于我们页$")
    public void 成功进入关于我们页() throws Exception {
        this.creamsAPPAboutUsFlow.intoAboutUsPage();
    }
}
