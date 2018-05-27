package com.souban.bdd.framework.driver;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import com.souban.bdd.framework.Config;

public class DriverFactory {

	private Config config = Config.getInstance();

	public Driver getDriver(final String driverType, final String deviceType) throws Exception {
		if (StringUtils.isBlank(driverType) || driverType.equalsIgnoreCase("web")) {
			return new BrowserDriver();
		} else if (driverType.equalsIgnoreCase("appium") && StringUtils.isBlank(deviceType)) {
			return new AndroidAppiumDriver();
		} else if (driverType.equalsIgnoreCase("appium") && deviceType.equalsIgnoreCase("android")) {
			return new AndroidAppiumDriver();
		} else if (driverType.equalsIgnoreCase("appium") && deviceType.equalsIgnoreCase("iOS")) {
			return new IOSAppiumDriver();
		} else if (driverType.equalsIgnoreCase("api")) {
			return new RestfulAPIDriver();
		} else {
			throw new Exception("Unknown device type : " + driverType + " - " + deviceType);
		}
	}

	public WebDriver getWebDriver(final String driverType) throws Exception {

		if (StringUtils.isBlank(driverType) || driverType.equalsIgnoreCase(Config.CHROME)) {
			System.setProperty("webdriver.chrome.bin", this.config.get("bin.chrome.path"));
			System.setProperty("webdriver.chrome.driver", this.config.get("webdriver.chrome.path"));
			// ChromeOptions
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-web-security");
			options.addArguments("--no-proxy-server");
			options.addArguments("--window-size=1600,900");
			if (this.config.get("browser.navigator.userAgent").equals("true")) {
				options.addArguments("--user-agent=seleniumAutomationTesting");
			}
			if (this.config.get("bin.chrome.headless").equals("true")) {
				options.addArguments("--headless");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-gpu");
			}
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			prefs.put("traceCategories", "browser,devtools.timeline,devtools");
			prefs.put("enableNetwork", true);
			prefs.put("download.default_directory", "/Applications");
			options.setExperimentalOption("prefs", prefs);
			return new ChromeDriver(options);

		} else if (driverType.equalsIgnoreCase(Config.EDGE)) {
			System.setProperty("webdriver.edge.bin", this.config.get("bin.edge.path"));
			System.setProperty("webdriver.edge.driver", this.config.get("webdriver.edge.path"));
			return new EdgeDriver();
		} else if (driverType.equalsIgnoreCase(Config.FIREFOX)) {
			System.setProperty("webdriver.firefox.bin", this.config.get("bin.firefox.path"));
			System.setProperty("webdriver.gecko.driver", this.config.get("webdriver.firefox.path"));
			return new FirefoxDriver();
		} else if (driverType.equalsIgnoreCase(Config.IE)) {
			System.setProperty("webdriver.ie.bin", this.config.get("bin.ie.path"));
			System.setProperty("webdriver.ie.driver", this.config.get("webdriver.ie.path"));
			return new InternetExplorerDriver();
		} else if (driverType.equalsIgnoreCase(Config.OPERA)) {
			System.setProperty("webdriver.opera.bin", this.config.get("bin.opera.path"));
			System.setProperty("webdriver.opera.driver", this.config.get("webdriver.opera.path"));
			return new OperaDriver();
		} else if (driverType.equalsIgnoreCase(Config.SAFARI)) {
			System.setProperty("webdriver.safari.bin", this.config.get("bin.safari.path"));
			System.setProperty("webdriver.safari.driver", this.config.get("webdriver.safari.path"));
			SafariOptions safariOptions = new SafariOptions();
			// safariOptions.setUseCleanSession(true);
			return new SafariDriver(safariOptions);
		} else {
			throw new Exception("Unknown device type : " + driverType);
		}
	}

	public Driver getDriver(final String driverType) throws Exception {
		return getDriver(driverType, null);
	}

	public Driver getDriver() throws Exception {
		return getDriver("web");
	}
}
