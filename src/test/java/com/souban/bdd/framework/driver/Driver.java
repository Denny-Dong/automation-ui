package com.souban.bdd.framework.driver;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.souban.bdd.framework.page.UIElement;

public interface Driver {

	public List<String> allElementsGetText(final UIElement element);

	List<String> allElementsGetValue(UIElement element);

	void click(final UIElement element);

	void clickBackOnDevice();

	void clickByCoordinate(final int x, final int y);

	boolean containsElementByName(final String name);

	void createNewDriverInstance() throws Exception;

	void destroyDriver();

	void elementClearSendText(final UIElement element, final String text);

	void elementClearText(final UIElement element);

	int elementGetCount(UIElement element);

	String elementGetProperty(final UIElement element, final String property);

	String elementGetText(final UIElement element);

	String elementGetValue(final UIElement element);

	public UIElement elementParent(final UIElement element);

	void elementSendKeys(UIElement element, Keys keys);

	void elementSendText(final UIElement element, final String text);

	void executeScript(String javaScritps);

	void focusElement(final UIElement element);

	void get(final String url);

	String getAccessToken();

	String getAlertText();

	String getCurrentUrl();

	@Deprecated
	WebDriver getDriver();

	int GetEndToToday(String date);
	
	int getDays(String strDate);

	byte[] getScreenShot();

	String getSelectedOption(final UIElement element);

	String getTitle();

	int GetTodayToEnd(String date);

	void hideKeyBoard();

	String hybridGetHTML();

	void IosAlertHandle(String alertText, boolean actionBoolean, int timeout);

	boolean isElementFound(final UIElement element);

	boolean isRadioButtonSelected(final UIElement element);

	void launchApp();

	void launchApp(final String appPackage, final String appActivity);

	void longPress(final UIElement element);

	void mouseOver(final UIElement element);

	void moveElement(final UIElement elementBegin, final UIElement elementEnd);

	void navigate(String url);

	void refresh();

	void scrollToName(String accessibilityId);

	void scrollToText(final UIElement element);

	void select(final UIElement element, final int id);

	void select(final UIElement element, final String text);

	void selectDate(final UIElement CalendarPicker, final UIElement ConfirmTxt, final String Date);

	Boolean selectPickerWheelValue(final Integer pickerWheelIndex, final String expectText);

	void setValueToPickerWheel(final String text);

	void sleep(final int milliseconds);

	public String subElementGetText(final UIElement parentElement, final UIElement subElement);

	void swipeingVerticalFromLeftToRight();

	void swipeScreen(String direction);

	void swipeScreen(String direction, UIElement element);

	void swipeToUp(int duration);

	void swipeToUpAndClick(final UIElement element);

	boolean swipeToUpToFindElement(UIElement element);

	boolean swipeToUpToFindElement(UIElement element,int index);

	void swipingVerticalFromBottomToTop();

	void swipingVerticalFromRightToLeft();

	void swipingVerticalFromTopToBottom();

	void switchToNative();

	void switchToWebview();

	void takeScreenshot(final String imageName);

	void tap(int x, int y);

	void tapPoint(int x, int y);

	void waitAndClick(final UIElement element, final int timeout);

	boolean waitClickable(final UIElement element, final int timeout);

	boolean waitForElement(final UIElement element, final int timeout);

	void dragFromToForDuration(final Integer fromX, final Integer fromY, final Integer toX, final Integer toY,
			final Double duration);

	void dragFromToForDuration(final UIElement element, final Double duration);

	int GetTodayToActualPayDay(String date);

	void MoveToElement(final UIElement element);

}
