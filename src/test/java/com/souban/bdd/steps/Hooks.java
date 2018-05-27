package com.souban.bdd.steps;

import com.souban.bdd.framework.Config;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.driver.DriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static Driver driver;
	private static Config config = Config.getInstance();

	@Before
	public void setUp() throws Throwable {
		initBaseStep();
	}

	@After(order = 0)
	public void tearDown(final Scenario scenario) {
		if (scenario.isFailed() && !Config.getInstance().get("driver.type").equals("api")) {
			final byte[] screenshot = Hooks.driver.getScreenShot();
			scenario.embed(screenshot, "image/png"); // stick it in the report
		}
		destroyDriverFactory();
	}

	@After(order = 1, value = { "@TagDemo" })
	public void tearDownForToad366(final Scenario scenario) {
		System.out.println("********@TagDemo********");
	}

	public void destroyDriverFactory() {
		Hooks.driver.destroyDriver();
		Hooks.driver = null;
	}

	public void initBaseStep() throws Exception {
		Hooks.driver = new DriverFactory().getDriver(Hooks.config.get("driver.type"),
				Hooks.config.get("mobile.device.type"));
		Hooks.driver.createNewDriverInstance();
	}

}
