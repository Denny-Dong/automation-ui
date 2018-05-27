package com.souban.bdd.framework.driver;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.souban.bdd.framework.Config;
import com.souban.bdd.framework.page.UIElement;

public class BrowserDriver implements Driver {

	private static final Logger logger = LoggerFactory.getLogger(BrowserDriver.class.getName());
	private Config config = Config.getInstance();

	private WebDriver driver;
	private UIElement INP_CalendarPicker = new UIElement(
			"xpath=//div[@class='ant-calendar-date-input-wrap']/input[@placeholder='请选择日期']");

	@Override
	public List<String> allElementsGetText(final UIElement element) {
		By by = getBy(element.locator);
		List<WebElement> elements = this.driver.findElements(by);

		List<String> allTexts = new ArrayList<String>();
		for (WebElement one : elements) {
			allTexts.add(one.getText());
		}

		return allTexts;
	}

	@Override
	public List<String> allElementsGetValue(final UIElement element) {
		By by = getBy(element.locator);
		List<WebElement> elements = this.driver.findElements(by);

		List<String> allValues = new ArrayList<String>();
		for (WebElement one : elements) {
			allValues.add(one.getAttribute("value"));
		}

		return allValues;
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

	@Override
	public boolean containsElementByName(final String name) {
		return this.driver.findElement(By.xpath("//*[contains(@name,'" + name + "')]")) != null;
	}

	@Override
	public void createNewDriverInstance() throws Exception {
		BrowserDriver.logger.debug("----------   Startup WebDriver   ------------");
		this.driver = new DriverFactory().getWebDriver(this.config.get("browser.type"));
		this.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	@Override
	public void destroyDriver() {
		try {
			if (Config.getInstance().get("browser.close.at.end").equals("true")) {
				this.driver.close();
				this.driver.quit();
				this.driver = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
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
		throw new UnsupportedOperationException();

	}

	@Override
	public void elementClearText(final UIElement element) {
		By by = getBy(element.locator);
		this.driver.findElement(by).clear();
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
		String selector = element.locator + "/..";
		return new UIElement("ELM_Parent", selector, "");
	}

	@Override
	public void elementSendKeys(final UIElement element, final Keys keys) {
		By by = getBy(element.locator);
		this.driver.findElement(by).sendKeys(keys);
	}

	@Override
	public void elementSendText(final UIElement element, final String text) {
		By by = getBy(element.locator);
		this.driver.findElement(by).sendKeys(text);
	}

	@Override
	public void executeScript(final String javaScritps) {
		((JavascriptExecutor) this.driver).executeScript(javaScritps, "");
	}

	@Override
	public void focusElement(final UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void get(final String url) {
		this.driver.get(url);
	}

	@Override
	public String getAccessToken() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getAlertText() {
		Alert alert = this.driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		return text;
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
		return this.driver.getCurrentUrl();
	}

	@Override
	public WebDriver getDriver() {
		return this.driver;
	}

	@Override
	public int GetEndToToday(String date) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public byte[] getScreenShot() {
		return ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES);
	}

	@Override
	public String getSelectedOption(final UIElement element) {
		By by = getBy(element.locator);
		Select select = new Select(this.driver.findElement(by));
		return select.getFirstSelectedOption().getText();
	}

	@Override
	public String getTitle() {
		return this.driver.getTitle();
	}

	@Override
	public int GetTodayToEnd(String date) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void hideKeyBoard() {
		throw new UnsupportedOperationException();

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
			// return this.driver.findElement(by).isDisplayed();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isRadioButtonSelected(final UIElement element) {
		By by = getBy(element.locator);
		return this.driver.findElement(by).isSelected();
	}

	@Override
	public void launchApp() {
		this.launchApp("", "");
	}

	@Override
	public void launchApp(final String appPackage, final String appActivity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void longPress(UIElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseOver(final UIElement element) {
		By by = getBy(element.locator);
		Actions builder = new Actions(driver);
		Actions hoverOverRegistrar = builder.moveToElement(driver.findElement(by));
		hoverOverRegistrar.perform();
	}

	@Override
	public void moveElement(final UIElement elementBegin, final UIElement elementEnd) {
		By byBegin = getBy(elementBegin.locator);
		By byEnd = getBy(elementEnd.locator);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(byBegin)).clickAndHold();
		builder.moveToElement(driver.findElement(byEnd)).click().perform();
	}

	@Override
	public void navigate(final String url) {
		this.get(url);
		this.executeScript(
				"angular.element(document.body).injector().get('ApiSoubanService').setLogonStatus();window.location.href='"
						+ url + "'");
	}

	@Override
	public void refresh() {
		this.driver.navigate().refresh();
	}

	private void removeAttributeOfTabindex() {
		// String javaScritps = "try {" + "document.querySelectorAll('div[role="
		// + "dialog"
		// + "].modal').forEach((item) => {" + "if (item) {" +
		// "item.removeAttribute('tabIndex');" + "}" + "});"
		// + "} catch (e) {}";
		String javaScritps = "Array.prototype.forEach.call(document.querySelectorAll('div[role=" + "dialog"
				+ "].modal'), function(item){if (item) {item.removeAttribute('tabIndex');}})";

		this.executeScript(javaScritps);

	}

	@Override
	public void scrollToName(String accessibilityId) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void scrollToText(final UIElement element) {
		Actions actions = new Actions(driver);
		By by = getBy(element.locator);
		actions.moveToElement(this.driver.findElement(by)).perform();
	}

	@Override
	public void select(final UIElement element, final int id) {
		By by = getBy(element.locator);
		Select select = new Select(this.driver.findElement(by));
		select.selectByIndex(id);
	}

	@Override
	public void select(final UIElement element, final String text) {
		By by = getBy(element.locator);
		Select select = new Select(this.driver.findElement(by));
		select.selectByVisibleText(text);
	}

	@Override
	public void selectDate(UIElement CalendarPicker, UIElement ConfirmTxt, String Date) {
		this.removeAttributeOfTabindex();
		this.click(CalendarPicker);
		this.sleep(1000);
		this.elementClearText(INP_CalendarPicker);
		this.elementSendText(INP_CalendarPicker, Date);
		this.waitForElement(ConfirmTxt, 2);
		this.click(ConfirmTxt);
		this.sleep(1000);
	}

	@Override
	public Boolean selectPickerWheelValue(Integer pickerWheelIndex, String expectText) {
		throw new UnsupportedOperationException();

	}

	public void setDriver(final WebDriver driver) {
		this.driver = driver;
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
		String selector = parentElement.locator + subElement.locator;
		UIElement element = new UIElement("element", selector, "");
		return elementGetText(element);
	}

	@Override
	public void swipeingVerticalFromLeftToRight() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void swipeScreen(String direction) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void swipeScreen(String direction, UIElement element) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void swipeToUp(int duration) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void swipeToUpAndClick(UIElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean swipeToUpToFindElement(UIElement element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean swipeToUpToFindElement(UIElement element,int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void swipingVerticalFromBottomToTop() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void swipingVerticalFromRightToLeft() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void swipingVerticalFromTopToBottom() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void switchToNative() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void switchToWebview() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void takeScreenshot(final String imageName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void tap(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void tapPoint(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void waitAndClick(final UIElement element, final int timeout) {
		waitForElement(element, timeout);
		click(element);

	}

	@Override
	public boolean waitClickable(final UIElement element, final int timeout) {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(this.driver, 5);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(getBy(element.locator)));
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean waitForElement(final UIElement element, final int timeout) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, timeout);
		boolean result = false;
		Boolean jsEnd = false;
		int jsCounter = 0;
		while (calendar.getTimeInMillis() > new Date().getTime()) {
			try {
				while (jsEnd == false && jsCounter < 10) {
					jsEnd = (Boolean) ((JavascriptExecutor) this.driver).executeScript("return jQuery.active == 0");
					jsCounter++;
				}

			} catch (Exception e) {
			} finally {
				if (isElementFound(element)) {
					result = true;
					break;
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		return result;
	}

	@Override
	public int GetTodayToActualPayDay(String date) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void MoveToElement(final UIElement element) {
		By byBegin = getBy(element.locator);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(byBegin)).perform();
	}

	@Override
	public int getDays(String strDate) {
		return 0;
	}
}
