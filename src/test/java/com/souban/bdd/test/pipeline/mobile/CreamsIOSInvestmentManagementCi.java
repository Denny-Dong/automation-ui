package com.souban.bdd.test.pipeline.mobile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//审批流程模块
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.souban.bdd.steps" }, plugin = { "pretty",
		"html:target/cucumberReport/cucumberHtml/", "json:target/cucumberReport/json/cucumber-report.json",
		"junit:target/cucumberReport/junit/cucumber-report.xml" }, tags = { "@CreamsIOSInvestmentManagementTest" })
public class CreamsIOSInvestmentManagementCi {

}
