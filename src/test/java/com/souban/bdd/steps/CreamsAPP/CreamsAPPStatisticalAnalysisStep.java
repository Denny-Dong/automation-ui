package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class CreamsAPPStatisticalAnalysisStep extends BaseStep {
    @When("^点击统计分析$")
    public void 点击统计分析() throws Exception {
        this.creamsAPPStatisticalAnalysisFlow.ClickStatisticsAnalyse();
    }

    @Then("^进入统计分析界面$")
    public void 进入统计分析界面() throws Exception {
        this.creamsAPPStatisticalAnalysisFlow.CheckStatisticsAnalyse();
    }
}
