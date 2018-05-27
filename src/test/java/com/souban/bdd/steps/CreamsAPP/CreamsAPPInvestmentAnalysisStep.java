package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @Author: Silence
 * @Date: Created in 2018/5/8 上午11:20
 * @Modified By:
 * @Description:
 */
public class CreamsAPPInvestmentAnalysisStep extends BaseStep {

    @Given("^点击招商分析$")
    public void 点击招商分析() throws Exception {
        this.creamsAPPInvestmentAnalysisFlow.clickInvestmentAnalysis();
    }

    @Then("^成功进入招商分析页$")
    public void 成功进入招商分析页() throws Exception {
        this.creamsAPPInvestmentAnalysisFlow.intoInvestmentAnalysisPage();
    }
}
