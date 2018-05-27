package com.souban.bdd.steps.CreamsWebStep.Contract;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContractListStep extends BaseStep {

    @Given("^选择单一楼宇\"([^\"]*)\"，在租赁页面$")
    public void 选择单一楼宇_在租赁页面(String arg1) throws Exception {
        this.contractListFlow.enterContractListPageByBuild(arg1);
    }

    @Given("^在租赁页面$")
    public void 在租赁页面() throws Exception {
        this.contractListFlow.enterContractListPage();
    }

    @When("^选择了到期预警$")
    public void 选择了到期预警() throws Throwable {
        this.contractListFlow.chooseWarning();
    }

    @Then("^到期预警按钮高亮$")
    public void 到期预警按钮高亮() throws Throwable {
        this.contractListFlow.colorBule();
    }

    @When("^点击新建合同按钮$")
    public void 点击新建合同按钮() throws Exception {
        this.contractListFlow.createContract();
    }
}
