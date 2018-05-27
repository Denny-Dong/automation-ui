package com.souban.bdd.framework.driver;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.souban.bdd.framework.Config;
import com.souban.bdd.framework.page.UIElement;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestfulAPIDriver implements Driver {

	private static Config config = Config.getInstance();
	private static final Logger logger = LoggerFactory.getLogger(BrowserDriver.class.getName());
	private String AccessToken;
	private String AdminAccessToken;
	private int AdminExpiresIn;
	private String AdminRefreshToken;
	private int ExpiresIn;
	private RequestSpecification LoginRequestSpecification;
	private Response LoginResponse;
	private String RefreshToken;

	@Override
	public List<String> allElementsGetText(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<String> allElementsGetValue(UIElement element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void click(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clickBackOnDevice() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void clickByCoordinate(int x, int y) {
		throw new UnsupportedOperationException();

	}

	@Override
	public boolean containsElementByName(String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void createNewDriverInstance() throws Exception {
		logger.debug("----------   Startup Restful API testing   ------------");
		this.setAdminUserToken();
		this.setUserToken();
	}

	@Override
	public void destroyDriver() {

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
	public void elementClearText(UIElement element) {
		throw new UnsupportedOperationException();

	}

	@Override
	public int elementGetCount(UIElement element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String elementGetProperty(UIElement element, String property) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String elementGetText(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String elementGetValue(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public UIElement elementParent(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void elementSendKeys(UIElement element, Keys keys) {
		// TODO Auto-generated method stub

	}

	@Override
	public void elementSendText(UIElement element, String text) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void executeScript(String javaScritps) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void focusElement(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void get(String url) {
		throw new UnsupportedOperationException();

	}

	@Override
	public String getAccessToken() {
		return AccessToken;
	}

	public String getAdminAccessToken() {
		return AdminAccessToken;
	}

	public int getAdminExpiresIn() {
		return AdminExpiresIn;
	}

	public String getAdminRefreshToken() {
		return AdminRefreshToken;
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrentUrl() {
		throw new UnsupportedOperationException();
	}

	@Override
	public WebDriver getDriver() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int GetEndToToday(String date) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public int getExpiresIn() {
		return ExpiresIn;
	}

	public RequestSpecification getLoginRequestSpecification() {
		return LoginRequestSpecification;
	}

	public Response getLoginResponse() {
		return LoginResponse;
	}

	public String getRefreshToken() {
		return RefreshToken;
	}

	@Override
	public byte[] getScreenShot() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getSelectedOption(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getTitle() {
		throw new UnsupportedOperationException();
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
		throw new UnsupportedOperationException();
	}

	@Override
	public void IosAlertHandle(String alertText, boolean actionBoolean, int timeout) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isElementFound(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isRadioButtonSelected(UIElement element) {
		throw new UnsupportedOperationException();
	}

	public JsonObject jsonObjectProducer(String filepath) throws IOException {
		FileReader fileReader = new FileReader(filepath);
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = (JsonObject) jsonParser.parse(fileReader);
		fileReader.close();
		return jsonObject;

	}

	@Override
	public void launchApp() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void launchApp(String appPackage, String appActivity) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void longPress(UIElement element) {
		// TODO Auto-generated method stub

	}

	public Map<String, Object> mapObjectProducer(String filepath) throws IOException {
		FileReader fileReader = new FileReader(filepath);
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = (JsonObject) jsonParser.parse(fileReader);
		fileReader.close();
		Type type = new TypeToken<Map<String, Object>>() {
		}.getType();
		Gson gson = new Gson();
		Map<String, Object> mapObject = gson.fromJson(jsonObject, type);
		return mapObject;

	}

	@Override
	public void mouseOver(UIElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveElement(UIElement elementBegin, UIElement elementEnd) {
		// TODO Auto-generated method stub

	}

	@Override
	public void navigate(String url) {
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

	@Override
	public void scrollToText(UIElement element) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void select(UIElement element, int id) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void select(UIElement element, String text) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void selectDate(UIElement CalendarPicker, UIElement ConfirmTxt, String Date) {
		throw new UnsupportedOperationException();

	}

	@Override
	public Boolean selectPickerWheelValue(Integer pickerWheelIndex, String expectText) {
		throw new UnsupportedOperationException();

	}

	public void setAccessToken(String accessToken) {
		AccessToken = "Bearer " + accessToken;
	}

	public void setAdminAccessToken(String adminAccessToken) {
		AdminAccessToken = "Bearer " + adminAccessToken;
	}

	public void setAdminExpiresIn(int adminExpiresIn) {
		AdminExpiresIn = adminExpiresIn;
	}

	public void setAdminRefreshToken(String adminRefreshToken) {
		AdminRefreshToken = adminRefreshToken;
	}

	public void setAdminUserToken() throws IOException {
		logger.info("----------   Start to get Admin User Token ------------");
		RestAssured.baseURI = config.get("restful.base.url.backstage");
		FileReader fileReader = new FileReader("src/test/java/com/souban/bdd/restful/json/common/AdminAccount.json");
		JsonParser jsonParser = new JsonParser();
		JsonObject LoginRequestJsonObject = (JsonObject) jsonParser.parse(fileReader);
		setLoginRequestSpecification(given().contentType("application/json").body(LoginRequestJsonObject.toString()));
		setLoginResponse(getLoginRequestSpecification().when().post(config.get("restful.base.url.login")));
		getLoginResponse().then().log().ifValidationFails().statusCode(201).time(lessThan(10L), TimeUnit.SECONDS);
		JsonObject LoginResponsejsonObject = (JsonObject) jsonParser.parse(getLoginResponse().getBody().asString());
		setAdminAccessToken(LoginResponsejsonObject.get("accessToken").getAsString());
		setAdminRefreshToken(LoginResponsejsonObject.get("refreshToken").getAsString());
		setAdminExpiresIn(LoginResponsejsonObject.get("expiresIn").getAsInt());
		fileReader.close();
		logger.info("----------  Successful get Admin User Token ------------");
	}

	public void setExpiresIn(int expiresIn) {
		ExpiresIn = expiresIn;
	}

	public void setLoginRequestSpecification(RequestSpecification loginRequestSpecification) {
		LoginRequestSpecification = loginRequestSpecification;
	}

	public void setLoginResponse(Response loginResponse) {
		LoginResponse = loginResponse;
	}

	public void setRefreshToken(String refreshToken) {
		RefreshToken = refreshToken;
	}

	public void setUserToken() throws IOException {
		logger.info("----------   Start to get User Token ------------");
		RestAssured.baseURI = config.get("restful.base.url.app");
		JsonObject LoginRequestJsonObject = jsonObjectProducer(
				"src/test/java/com/souban/bdd/restful/json/common/UserAccount.json");
		setLoginRequestSpecification(given().contentType("application/json").body(LoginRequestJsonObject.toString()));
		setLoginResponse(getLoginRequestSpecification().when().post(config.get("restful.base.url.login")));
		getLoginResponse().then().log().ifValidationFails().statusCode(201).time(lessThan(10L), TimeUnit.SECONDS);
		JsonObject LoginResponsejsonObject = (JsonObject) (new JsonParser())
				.parse(getLoginResponse().getBody().asString());
		setAccessToken(LoginResponsejsonObject.get("accessToken").getAsString());
		setRefreshToken(LoginResponsejsonObject.get("refreshToken").getAsString());
		setExpiresIn(LoginResponsejsonObject.get("expiresIn").getAsInt());
		logger.info("----------  Successful get User Token ------------");
	}

	@Override
	public void setValueToPickerWheel(String text) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void sleep(int milliseconds) {
		throw new UnsupportedOperationException();

	}

	@Override
	public String subElementGetText(UIElement parentElement, UIElement subElement) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void swipeingVerticalFromLeftToRight() {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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
	public void takeScreenshot(String imageName) {
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
	public void waitAndClick(UIElement element, int timeout) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean waitClickable(UIElement element, int timeout) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean waitForElement(UIElement element, int timeout) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int GetTodayToActualPayDay(String date) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void MoveToElement(final UIElement element) {
		// TODO Auto-generated method stub
	}

	@Override
	public int getDays(String strDate) {
		// TODO Auto-generated method stub
		return 0;
	}

}
