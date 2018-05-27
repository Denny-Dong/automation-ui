package com.souban.bdd.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.souban.bdd.steps" }, plugin = { "pretty",
		"html:target/cucumberReport/cucumberHtml/", "json:target/cucumberReport/json/cucumber-report.json",
		"junit:target/cucumberReport/junit/cucumber-report.xml" }, tags = { "@AcceptenceTest" })
public class CreamsWebCI {

}
