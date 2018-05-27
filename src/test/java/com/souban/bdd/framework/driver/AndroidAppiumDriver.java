package com.souban.bdd.framework.driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.souban.bdd.framework.Config;
import com.souban.bdd.framework.page.UIElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AndroidAppiumDriver implements Driver {

	private static final Logger logger = LoggerFactory.getLogger(IOSAppiumDriver.class.getName());
	private UIElement BTN_viewPagerEnter = new UIElement(
			"xpath=//android.widget.Button[@resource-id='com.souban.creamsagent.debug:id/useNowBtn']", "");

	private Config config = Config.getInstance();
	private AndroidDriver<MobileElement> driver;
	private int screenPageCount = 3;

	private AppiumDriverLocalService service = null;

	private int servicePortNumber = 4723;

	private UIElement View_viewPagerIndicator = new UIElement("id=com.souban.creamsagent.debug:id/viewPager",
			"xpath=//XCUIElementTypeButton[@name=\"OnboardActionButtonAccessibilityIdentifier\"]");

	@Override
	public List<String> allElementsGetText(final UIElement element) {
		By by = getBy(element.locator);
		List<MobileElement> elements = this.driver.findElements(by);
		List<String> allTexts = new ArrayList<String>();
		for (MobileElement one : elements) {
			allTexts.add(one.getText());
		}
		return allTexts;
	}

	@Override
	public List<String> allElementsGetValue(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void click(final UIElement element) {
		By by = getBy(element.locator);
		this.driver.findElement(by).click();
	}

	@Override
	public void clickBackOnDevice() {
		this.driver.navigate().back();
	}

	@Override
	public void clickByCoordinate(final int x, final int y) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsElementByName(final String name) {
		UIElement element = new UIElement("", "text=" + name, "");
		return this.driver.findElement(getBy(element.locator)) != null;
	}

	@Override
	public void createNewDriverInstance() throws Exception {

		// start appium server
		if (this.config.get("run.mode").equalsIgnoreCase("jenkins")) {
			AndroidAppiumDriver.logger.debug("Starting Appium Server ......");
			this.service = new AppiumServiceBuilder()
					.usingDriverExecutable(new File(this.config.get("nodejs.bin.path")))
					.withAppiumJS(new File(this.config.get("appiumjs.bin.path")))
					.withArgument(GeneralServerFlag.LOG_LEVEL, "debug").withIPAddress("127.0.0.1")
					.usingPort(this.servicePortNumber).build();
			this.service.start();

			if (this.service.isRunning()) {
				AndroidAppiumDriver.logger.info("Service started successed !!！");
			} else {
				AndroidAppiumDriver.logger.error("Appium Service Start Failed !!!");
				throw new Exception("Appium Service Start Failed !!!");
			}

		}

		// set up appium driver
		String sPath = this.config.get("mobile.app.path");
		System.out.println(sPath + this.config.get("mobile.app.name"));
		File app = new File(this.config.get("mobile.app.path") + this.config.get("mobile.app.name"));
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, this.config.get("mobile.name"));
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, false);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, this.config.get("mobile.app.activity"));
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, this.config.get("mobile.app.package"));
		capabilities.setCapability(AndroidMobileCapabilityType.AVD, this.config.get("mobile.name"));
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, false);
		capabilities.setCapability(AndroidMobileCapabilityType.SUPPORTS_LOCATION_CONTEXT, true);
		capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
		if (this.config.get("mobile.headless").equals("true")) {
			capabilities.setCapability("avdArgs", "-no-window");
		}
		String sourceURL = this.config.get("appium.service.url");
		try {
			this.driver = new AndroidDriver<MobileElement>(new URL(sourceURL), capabilities);
			this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroyDriver() {
		this.driver.quit();
		this.driver = null;
		if (this.service != null) {
			this.service.stop();
		}
	}

	@Override
	public void dragFromToForDuration(Integer fromX, Integer fromY, Integer toX, Integer toY, Double duration) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void dragFromToForDuration(UIElement element, Double duration) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void elementClearSendText(UIElement element, String text) {
		By by = getBy(element.locator);
		this.driver.findElement(by).clear();
		this.driver.findElement(by).click();
		this.driver.findElement(by).sendKeys(text);

	}

	@Override
	public void elementClearText(final UIElement element) {

	}

	@Override
	public int elementGetCount(final UIElement element) {

		By by = getBy(element.locator);
		List<WebElement> list = by.findElements(driver);
		return list.size();

	}

	@Override
	public String elementGetProperty(final UIElement element, final String property) {
		By by = getBy(element.locator);
		return this.driver.findElement(by).getAttribute(property);
	}

	@Override
	public String elementGetText(final UIElement element) {
		By by = getBy(element.locator);
		return this.driver.findElement(by).getText();
	}

	@Override
	public String elementGetValue(final UIElement element) {
		By by = getBy(element.locator);
		return this.driver.findElement(by).getAttribute("value");
	}

	@Override
	public UIElement elementParent(final UIElement element) {
		return null;
	}

	@Override
	public void elementSendKeys(UIElement element, Keys keys) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void elementSendText(final UIElement element, final String text) {
		By by = getBy(element.locator);
		this.driver.findElement(by).clear();
		// TouchAction action = new TouchAction(this.driver);
		// action.longPress(this.driver.findElement(by)).release().perform();
		this.driver.findElement(by).click();
		this.driver.findElement(by).sendKeys(text);
	}

	@Override
	public void executeScript(final String javaScritps) {
		this.driver.executeScript(javaScritps, "");
	}

	@Override
	public void focusElement(final UIElement element) {
		By by = getBy(element.locator);
		Actions actions = new Actions(this.driver);
		actions.moveToElement(this.driver.findElement(by));
		actions.perform();
	}

	@Override
	public void get(final String url) {
		// Nothing to do in android
	}

	@Override
	public String getAccessToken() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getAlertText() {
		throw new UnsupportedOperationException();
	}

	protected By getBy(final String param) {
		if (param != null && (param.startsWith("/") || param.startsWith("(/") || param.startsWith("./"))) {
			return By.xpath(param);
		}
		int index = param.indexOf("=");
		if (index >= 0) {
			String method = param.substring(0, index).trim();
			String key = param.substring(index + 1).trim();
			if (method.equalsIgnoreCase("id")) {
				return By.id(key);
			} else if (method.equalsIgnoreCase("name")) {
				return By.xpath("//*[@text='" + key + "']");
			} else if (method.equalsIgnoreCase("xpath")) {
				return By.xpath(key);
			} else if (method.equalsIgnoreCase("class")) {
				return By.className(key);
			} else if (method.equalsIgnoreCase("css")) {
				return By.cssSelector(key);
			} else if (method.equalsIgnoreCase("link")) {
				return By.linkText(key);
			} else if (method.equalsIgnoreCase("partialLink")) {
				return By.partialLinkText(key);
			} else if (method.equalsIgnoreCase("tag")) {
				return By.tagName(key);
			} else if (method.equalsIgnoreCase("text")) {
				return By.xpath("//*[@text='" + key + "']");
			}
		}
		throw new RuntimeException("Wrong parameter format for By: " + param);
	}

	@Override
	public String getCurrentUrl() {
		throw new UnsupportedOperationException();
	}

	@Override
	public AndroidDriver<MobileElement> getDriver() {
		return this.driver;
	}

	@Override
	public int GetEndToToday(String date) {
		java.text.SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		java.util.Calendar calendar = Calendar.getInstance();
		Date today = null;
		Date EndDate = null;
		try {
			today = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 将今天的日期格式化成 yyyy-MM-dd
		try {
			EndDate = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 将选择日期转换成Date
		long t = today.getTime() - EndDate.getTime();
		long d = t / (1000 * 60 * 60 * 24);
		return Integer.parseInt(String.valueOf(d));

	}

	@Override
	public byte[] getScreenShot() {
		WebDriver augmentedDriver = new Augmenter().augment(this.driver);
		return ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BYTES);
	}

	@Override
	public String getSelectedOption(final UIElement element) {
		return null;
	}

	@Override
	public String getTitle() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int GetTodayToEnd(String date) {
		java.text.SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		java.util.Calendar calendar = Calendar.getInstance();
		Date today = null;
		Date EndDate = null;
		try {
			today = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 将今天的日期格式化成 yyyy-MM-dd
		try {
			EndDate = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 将选择日期转换成Date
		long t = EndDate.getTime() - today.getTime();
		long d = t / (1000 * 60 * 60 * 24);
		return Integer.parseInt(String.valueOf(d));

	}

	@Override
	public void hideKeyBoard() {
		this.driver.hideKeyboard();
	}

	@Override
	public String hybridGetHTML() {
		return this.driver.getPageSource();
	}

	@Override
	public void IosAlertHandle(String alertText, boolean actionBoolean, int timeout) {
		throw new UnsupportedOperationException();

	}

	@Override
	public boolean isElementFound(final UIElement element) {
		By by = getBy(element.locator);
		if (this.driver.findElements(by).size() > 0) {
			return this.driver.findElement(by).isDisplayed();
		} else {
			return false;
		}
	}

	@Override
	public boolean isRadioButtonSelected(final UIElement element) {
		return false;
	}

	@Override
	public void launchApp() {
		if (this.isElementFound(View_viewPagerIndicator)) {
			logger.info("***********" + "The element of PageView has been founded");
			for (int i = 0; i < screenPageCount - 1; i++) {
				this.swipingVerticalFromRightToLeft();
				this.sleep(500);
			}
			this.click(this.BTN_viewPagerEnter);
		} else {
			logger.error("***********\" + \"The element of PageView hasn't been founded");
		}

	}

	@Override
	public void launchApp(final String appPackage, final String appActivity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void longPress(UIElement element) {
		By by = getBy(element.locator);
		TouchAction ta = new TouchAction(driver);
		ta.longPress(this.driver.findElement(by)).release().perform();
	}

	@Override
	public void mouseOver(UIElement element) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void moveElement(UIElement elementBegin, UIElement elementEnd) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void navigate(final String url) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void refresh() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void scrollToName(String accessibilityId) {
		throw new UnsupportedOperationException();
	}

	public void scrollToText(final String text) {
		// this.driver.scrollTo(text);
		this.driver.findElementByAndroidUIAutomator(text);
	}

	@Override
	public void scrollToText(UIElement element) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void select(final UIElement element, final int id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void select(final UIElement element, final String text) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void selectDate(UIElement CalendarPicker, UIElement ConfirmTxt, String element) {
		throw new UnsupportedOperationException();

	}

	@Override
	public Boolean selectPickerWheelValue(Integer pickerWheelIndex, String expectText) {
		if (pickerWheelIndex < 1) {
			try {
				throw new Exception("pickerWheelIndex should start from 1");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		boolean expectTextSelectedResult = false;
		List<MobileElement> wheels = this.driver.findElements(MobileBy.className("android.widget.NumberPicker"));
		List<MobileElement> childWheels = wheels.get(pickerWheelIndex - 1).findElements(By.id("numberpicker_input"));
		for (int i = 0; i < childWheels.size(); i++) {
			if (wheels.get(pickerWheelIndex - 1).getText().equals(expectText)) {
				expectTextSelectedResult = true;
				break;
			} else {
				JavascriptExecutor js = this.driver;
				Map<String, Object> params = new HashMap<>();
				params.put("order", "next");
				params.put("offset", 0.15);
				params.put("element", ((RemoteWebElement) wheels.get(pickerWheelIndex - 1)).getId());
				js.executeScript("mobile: selectPickerWheelValue", params);
			}
		}
		return expectTextSelectedResult;

	}

	@Override
	public void setValueToPickerWheel(String text) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void sleep(final int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String subElementGetText(final UIElement parentElement, final UIElement subElement) {
		return null;
	}

	@Override
	public void swipeingVerticalFromLeftToRight() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void swipeScreen(String direction) {
		JavascriptExecutor js = driver;
		Map<String, Object> params = new HashMap<>();
		params.put("direction", direction);
		js.executeScript("mobile: swipe", params);

	}

	@Override
	public void swipeScreen(String direction, UIElement element) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void swipeToUp(int during) {
		int widht = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		TouchAction swpie = new TouchAction(driver);
		swpie.press(widht / 2, height * 2 / 4).waitAction(Duration.ofMillis(during)).moveTo(widht / 2, height * 1 / 4)
				.release().perform();
	}

	@Override
	public void swipeToUpAndClick(final UIElement element) {
		int index = 4;
		for (int i = 0; i <= index; i++) {
			if (this.isElementFound(element)) {
				click(element);
				break;
			} else {
				int during = 1000;
				swipeToUp(during);
			}
		}
	}

	@Override
	public boolean swipeToUpToFindElement(final UIElement element) {
		int index = 4;
		for (int i = 0; i <= index; i++) {
			if (this.isElementFound(element)) {

				break;
			} else {
				int during = 1000;
				swipeToUp(during);
			}
		}
		return true;
	}

	@Override
	public boolean swipeToUpToFindElement(final UIElement element,int index) {
		for (int i = 0; i <= index; i++) {
			if (this.isElementFound(element)) {
				break;
			} else {
				int during = 1000;
				swipeToUp(during);
			}
		}
		return true;
	}

	@Override
	public void swipingVerticalFromBottomToTop() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void swipingVerticalFromRightToLeft() {
		Dimension size = this.driver.manage().window().getSize();
		int starty = (int) (size.height * 0.50);
		int endy = (int) (size.height * 0.50);
		int startx = size.width * 9 / 10;
		int endx = size.width * 1 / 10;
		TouchAction swipe = new TouchAction(driver);
		swipe.press(startx, starty).waitAction(Duration.ofMillis(500)).moveTo(endx, endy).release();
		swipe.perform();
	}

	@Override
	public void swipingVerticalFromTopToBottom() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void switchToNative() {
		Set<String> contextNames = this.driver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName);
			if (contextName.contains("NATIVE")) {
				this.driver.context(contextName);
				break;
			}
		}
	}

	@Override
	public void switchToWebview() {
		Set<String> contextNames = this.driver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName);
			if (contextName.contains("WEBVIEW")) {
				this.driver.context(contextName);
				// System.out.print(hybridGetHTML());
				break;
			}
		}
	}

	@Override
	public void takeScreenshot(final String imageName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void tap(int x, int y) {
		// TODO Auto-generated method stub
		Dimension size = this.driver.manage().window().getSize();
		x = size.getWidth() * 5 / 6;
		y = size.getHeight() * 2 / 5;
		TouchAction action = new TouchAction(driver);
		action.tap(x, y).perform();
	}

	@Override
	public void tapPoint(int x, int y) {
		TouchAction action = new TouchAction(driver);
		action.tap(x, y).perform();
	}

	@Override
	public void waitAndClick(final UIElement element, final int timeout) {
		waitForElement(element, timeout);
		click(element);
	}

	@Override
	public boolean waitClickable(UIElement element, int timeout) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean waitForElement(final UIElement element, final int timeout) {
		boolean result = false;
		for (int attempt = 0; attempt < timeout; attempt++) {
			if (this.driver.findElement(getBy(element.locator)).isDisplayed()
					&& this.driver.findElement(getBy(element.locator)).isEnabled()) {
				result = true;
				break;
			} else {
				this.sleep(1000);
			}
		}
		return result;
	}

	@Override
	public int GetTodayToActualPayDay(String date) {
		java.text.SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Calendar calendar = Calendar.getInstance();
		Date today = null;
		Date EndDate = null;
		try {
			today = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 将今天的日期格式化成 yyyy-MM-dd
		try {
			EndDate = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 将选择日期转换成Date
		long t = EndDate.getTime() - today.getTime();
		long d = t / (1000 * 60 * 60 * 24);
		return Integer.parseInt(String.valueOf(d));

	}

	@Override
	public void MoveToElement(final UIElement element) {
		By byBegin = getBy(element.locator);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(byBegin)).click().perform();
	}

	@Override
	public int getDays(String strDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date now = null;
		Date receiveDate = null;
		int day;
		try {
			now = sdf.parse(sdf.format(new Date()));
			receiveDate = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long time = now.getTime()-receiveDate.getTime();
//		if(time>0) {
//			time = now.getTime()-receiveDate.getTime();
//			day = (int)(time/1000/24/60/60);
//		}else {
//			time = receiveDate.getTime()-now.getTime();
//			day = (int)(time/1000/24/60/60);
//		}
		//days可正可负 day>0,已逾期 day<=0,正常
		day = (int)(time/1000/24/60/60);
		return day;
	}
}
