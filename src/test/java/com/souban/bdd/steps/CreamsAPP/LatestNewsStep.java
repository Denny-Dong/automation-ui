package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LatestNewsStep extends BaseStep {
    @When("^点击工作流进入工作流页面$")
    public void 点击工作流进入工作流页面() throws Exception {
        this.latestNewsFlow.ClickWorkFlow();
    }

    @When("^点击最新消息$")
    public void 点击最新消息() throws Exception {
        this.latestNewsFlow.ClickNewsTitle();
    }

    @Then("^进入最新消息页面$")
    public void 进入最新消息页面() throws Exception {
        this.latestNewsFlow.CheckNewsTitle();

    }

    @Then("^页面显示账单提醒和租期提醒列表$")
    public void 页面显示账单提醒和租期提醒列表() throws Exception {
        this.latestNewsFlow.CheckTab();
    }

 /*   @When("^点击第一条账单提醒$")
    public void 点击第一条账单提醒() throws Exception {
        this.latestNewsFlow.ClickList();
    }*/

    @When("^点击第一条提醒$")
    public void 点击第一条提醒() throws Exception {
        this.latestNewsFlow.ClickList();
    }

    @Then("^进入账单详情页面$")
    public void 进入账单详情页面() throws Exception {
        this.latestNewsFlow.CheckBillInfo();
    }

    @When("^点击租期提醒tab$")
    public void 点击租期提醒tab() throws Exception {
        this.latestNewsFlow.ClickLeaseTab();
    }

 /*   @When("^点击第一条租期提醒$")
    public void 点击第一条租期提醒() throws Exception {
        this.latestNewsFlow.ClickList();
    }*/

    @Then("^进入合同详情页面$")
    public void 进入合同详情页面() throws Exception {
        this.latestNewsFlow.CheckContractInfo();
    }


}
