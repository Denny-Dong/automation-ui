package com.souban.bdd.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.souban.bdd.steps" }, plugin = {
		"html:target/cucumber", "json:target/cucumber-report.json",
		"junit:target/cucumber-report.xml" }, tags = { "@RestfulAPITesting" })

public class CreamsRestfulRunner {

}
