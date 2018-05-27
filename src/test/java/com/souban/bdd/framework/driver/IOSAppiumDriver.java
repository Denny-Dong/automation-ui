package com.souban.bdd.framework.driver;

import java.io.File;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import org.openqa.selenium.Point;
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

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class IOSAppiumDriver implements Driver {
	private static final Logger logger = LoggerFactory.getLogger(IOSAppiumDriver.class.getName());
	private UIElement BTN_Taste = new UIElement("xpath=//*[@class='android.widget.ImageView']",
			"name=OnboardActionButtonAccessibilityIdentifier");
	private UIElement BTN_permit = new UIElement("", "xpath=//XCUIElementTypeButton[@name='允许']");

	private Config config = Config.getInstance();
	private AppiumDriver<MobileElement> driver;
	private int screenPageCount = 3;

	private AppiumDriverLocalService service = null;

	private int servicePortNumber = 4723;

	@iOSFindBy(accessibility = "")
	IOSElement someElement;

	private String TXT_NotificationAlertText = "“经纪人调试” Would Like to Send You Notifications\n"
			+ "Notifications may include alerts, sounds, and icon badges. These can be configured in Settings.";

	@Override
	public List<String> allElementsGetText(final UIElement element) {
		By by = getBy(element.locator);
		List<MobileElement> elements = this.driver.findElements(by);
		List<String> allTexts = new ArrayList<String>();
		for (WebElement one : elements) {
			allTexts.add(one.getText());
		}
		return allTexts;
	}

	@Override
	public List<String> allElementsGetValue(UIElement element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void click(final UIElement element) {
		By by = getBy(element.locator);
		this.driver.findElement(by).click();
	}

	@Override
	public void clickBackOnDevice() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clickByCoordinate(final int x, final int y) {
		throw new UnsupportedOperationException();
	}

	// public boolean waitForElement(final UIElement element, final int
	// timeout){
	// WebElement webElement = null;
	// for (int seconds = timeout; seconds > 0; seconds--) {
	// try {
	// webElement = (WebElement)driver.findElement(getBy(element.locator));
	// if (webElement.isDisplayed()) {
	// break;
	// }
	// // element = driver.findElementByXPath("//*[@label='" + name + "']");
	// // if (element.isDisplayed()) {
	// // break;
	// // }
	// Thread.sleep(1000);
	// } catch (Exception e) {
	// //e.printStackTrace();
	// }
	// }
	// return webElement != null;
	// }
	//
	// public void waitAndClick(final UIElement element, final int timeout){
	// WebElement webElement = null;
	// for (int seconds = timeout*2; seconds > 0; seconds--) {
	// try {
	// webElement = (WebElement)driver.findElement(getBy(element.locator));
	// if (webElement.isDisplayed()) {
	// webElement.click();
	// return;
	// }
	// // element = driver.findElementByXPath("//*[@label='" + name + "']");
	// // if (element.isDisplayed()) {
	// // break;
	// // }
	// Thread.sleep(500);
	// } catch (Exception e) {
	// // e.printStackTrace();
	// }
	// }
	// }

	@Override
	public boolean containsElementByName(final String name) {
		return this.driver.findElementByXPath("//*[contains(@name,'" + name + "')]") != null;
	}

	@Override
	public void createNewDriverInstance() throws Exception {

		// start appium server
		if (this.config.get("run.mode").equalsIgnoreCase("jenkins")) {
			IOSAppiumDriver.logger.debug("Starting Appium Server ......");
			this.service = new AppiumServiceBuilder()
					.usingDriverExecutable(new File(this.config.get("nodejs.bin.path")))
					.withAppiumJS(new File(this.config.get("appiumjs.bin.path")))
					.withArgument(GeneralServerFlag.LOG_LEVEL, "debug").withIPAddress("127.0.0.1")
					.usingPort(this.servicePortNumber).build();
			this.service.start();

			if (this.service.isRunning()) {
				IOSAppiumDriver.logger.info("Service started successed !!！");
			} else {
				IOSAppiumDriver.logger.error("Appium Service Start Failed !!!");
				throw new Exception("Appium Service Start Failed !!!");
			}

		}

		// set up appium driver
		try {
			String sPath = this.config.get("mobile.app.path");
			System.out.println(sPath + this.config.get("mobile.app.name"));
			File app = new File(this.config.get("mobile.app.path") + this.config.get("mobile.app.name"));

			DesiredCapabilities clientDesiredCapabilities = new DesiredCapabilities();
			clientDesiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
					this.config.get("mobile.device.name"));
			clientDesiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
					this.config.get("mobile.platform.version"));
			clientDesiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
			clientDesiredCapabilities.setCapability(MobileCapabilityType.LANGUAGE, "zh");
			clientDesiredCapabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, false);
			clientDesiredCapabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, false);
			clientDesiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			clientDesiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
			clientDesiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, false);
			clientDesiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
			clientDesiredCapabilities.setCapability(IOSMobileCapabilityType.LOCATION_SERVICES_ENABLED, true);
			clientDesiredCapabilities.setCapability(IOSMobileCapabilityType.LOCATION_SERVICES_AUTHORIZED, true);
			clientDesiredCapabilities.setCapability("isHeadless", this.config.get("mobile.device.headless"));
			String sourceURL = this.config.get("appium.service.url");
			this.driver = new IOSDriver<>(new URL(sourceURL), clientDesiredCapabilities);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroyDriver() {
		this.driver.quit();
		this.driver = null;
		// this.service.stop();
	}

	@Override
	public void dragFromToForDuration(Integer fromX, Integer fromY, Integer toX, Integer toY, Double duration) {
		JavascriptExecutor js = driver;
		Map<String, Object> params = new HashMap<>();
		params.put("fromX", fromX);
		params.put("fromY", fromY);
		params.put("toX", toX);
		params.put("toY", toY);
		params.put("duration", duration);
		js.executeScript("mobile: dragFromToForDuration", params);

	}

	@Override
	public void dragFromToForDuration(UIElement element, Double duration) {
		By by = getBy(element.locator);
		Point elementLocation = this.driver.findElement(by).getLocation();
		Dimension elementSize = this.driver.findElement(by).getSize();
		Dimension WindowSize = this.driver.manage().window().getSize();
		Integer fromX = (elementLocation.getX() + elementSize.getWidth() + WindowSize.getWidth()) * 7 / 10;
		Integer fromY = elementLocation.getY() + (elementSize.getHeight() / 2);
		Integer toX = (elementLocation.getX() + elementSize.getWidth() + WindowSize.getWidth()) * 2 / 10;
		Integer toY = fromY;
		this.dragFromToForDuration(fromX, fromY, toX, toY, duration);
	}

	/*
	 * @Override public void dragFromToForDuration(UIElement element, Double
	 * duration) { By by = getBy(element.locator); WebElement slider =
	 * this.driver.findElement(by); Integer xAxisStartPoint =
	 * slider.getLocation().getX(); Integer xAxisEndPoint = xAxisStartPoint +
	 * slider.getSize().getWidth(); Integer yAxisStartPoint =
	 * slider.getLocation().getY(); Integer yAxisEndPoint = yAxisStartPoint;
	 * 
	 * }
	 */

	@Override
	public void elementClearSendText(final UIElement element, final String text) {
		By by = getBy(element.locator);
		this.driver.findElement(by).click();
		this.driver.findElement(by).clear();
		this.driver.findElement(by).setValue(text);

	}

	@Override
	public void elementClearText(UIElement element) {
		throw new UnsupportedOperationException();

	}

	@Override
	public int elementGetCount(UIElement element) {

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
		// TODO Auto-generated method stub

	}

	@Override
	public void elementSendText(final UIElement element, final String text) {
		By by = getBy(element.locator);
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
		// Nothing to do in iOS
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
				return By.name(key);
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
	public AppiumDriver<MobileElement> getDriver() {
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
	public String getSelectedOption(UIElement element) {
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
		for (int i = 0; i < timeout; i++) {
			if (driver.switchTo().alert().getText().equals(alertText)) {
				if (actionBoolean) {
					driver.switchTo().alert().accept();
				} else {
					driver.switchTo().alert().dismiss();
				}
				break;
			} else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (i == timeout - 1) {
				try {
					throw new Exception("Expected Alert Not Exist ! ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
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
	public boolean isRadioButtonSelected(UIElement element) {
		return false;
	}

	@Override
	public void launchApp() {
		this.IosAlertHandle(TXT_NotificationAlertText, true, 3);
		// 对出现定位弹窗的异常处理
		try {
			if (this.isElementFound(BTN_permit)) {
				this.click(BTN_permit);
				System.out.println("出现定位弹窗");
			} else {
				System.out.println("未出现允许定位弹窗");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < screenPageCount - 1; i++) {
			this.swipeScreen("left");
		}
		this.click(BTN_Taste);
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
		// This method need to be implemented!!
	}

	@Override
	public void refresh() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void scrollToName(String accessibilityId) {
		JavascriptExecutor js = driver;
		Map<String, Object> params = new HashMap<>();
		params.put("name", accessibilityId);
		js.executeScript("mobile: scroll", params);
	}

	public void scrollToText(final String text) {
		// this.driver.scrollTo(text);
		this.driver.findElementByAccessibilityId(text);
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
		List<MobileElement> wheels = this.driver.findElements(MobileBy.className("XCUIElementTypePickerWheel"));
		List<MobileElement> childWheels = wheels.get(pickerWheelIndex - 1)
				.findElements(By.className("XCUIElementTypeOther"));
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
	public void setValueToPickerWheel(final String text) {
		// By by = getBy(pickerwheel.locator);
		// this.driver.findElement(by).sendKeys(text);
		((IOSElement) driver.findElements(MobileBy.className("XCUIElementTypePickerWheel")).get(0)).setValue(text);
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
		JavascriptExecutor js = driver;
		Map<String, Object> params = new HashMap<>();
		By by = getBy(element.locator);
		params.put("direction", direction);
		params.put("element", this.driver.findElement(by).getId());
		js.executeScript("mobile: swipe", params);

	}

	@Override
	public void swipeToUp(int during) {
		this.swipeScreen("up");
	}

	@Override
	public void swipeToUpAndClick(final UIElement element) {
		int index = 4;
		for (int i = 0; i < index; i++) {
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
		int index = 3;
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
		this.swipeScreen("left");
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
				break;
			}
		}
	}

	@Override
	public void takeScreenshot(final String imageName) {
		// String imagesLocation = "target/surefire-reports/screenshot/" +
		// config.getPlatformName() + "/";
		// new File(imagesLocation).mkdirs(); // Insure directory is there
		// String filename = imagesLocation + imageName + ".jpg";
		//
		// try {
		// Thread.sleep(500);
		// WebDriver augmentedDriver = new Augmenter().augment(driver);
		// File scrFile = ((TakesScreenshot)
		// augmentedDriver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(scrFile, new File(filename), true);
		// } catch (Exception e) {
		// System.out.println("Error capturing screen shot of " + imageName +
		// " test failure.");
		// // remove old pic to prevent wrong assumptions
		// File f = new File(filename);
		// f.delete();
		// }
	}

	@Override
	// 点击元素坐标
	public void tap(int x, int y) {
		// TODO Auto-generated method stub
		Dimension size = this.driver.manage().window().getSize();
		x = size.getWidth() * 4 / 5;
		y = size.getHeight() * 4 / 5;
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
		// WebDriverWait wait = new WebDriverWait(this.driver, timeout);
		for (int attempt = 0; attempt < timeout; attempt++) {
			try {
				if (this.driver.findElement(getBy(element.locator)).isDisplayed()) {
					result = true;
					break;
				}
			} catch (Exception e) {
				this.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			}
		}
		// wait.until(ExpectedConditions.visibilityOfElementLocated(getBy(element.locator)));
		return result;
	}

	@Override
	public int GetTodayToActualPayDay(String date) {
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
	public void MoveToElement(final UIElement element) {
		// TODO Auto-generated method stub
	}

	@Override
	public int getDays(String strDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
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
		//day可正可负 day>0,已逾期 day<=0,正常
		day = (int)(time/1000/24/60/60);
		return day;
	}

}
