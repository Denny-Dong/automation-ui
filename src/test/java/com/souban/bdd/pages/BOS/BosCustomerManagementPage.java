package com.souban.bdd.pages.BOS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Keys;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class BosCustomerManagementPage extends ParentPage {

	public BosCustomerManagementPage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_CustomerManagement = new UIElement("xpath=//*[text()='客户管理']");
	private UIElement BTN_ErrorList = new UIElement("xpath=//*[text()='报错列表']");
	private UIElement BTN_CustomerList = new UIElement("xpath=//*[text()='客户列表']");
	private UIElement BTN_BuildingList = new UIElement("xpath=//*[text()='楼宇列表']");
	private UIElement BTN_TimeDescending = new UIElement(
			"xpath=//div[text()='最大可管理面积']/following-sibling::div/i[text()='arrow_drop_down']");
	private UIElement TXT_maxArea = new UIElement("xpath=//*[text()='最大可管理面积']/ancestor::div[3]/descendant::tr/td[5]");
	private UIElement TXT_RegistTime = new UIElement("xpath=//*[text()='城市']/ancestor::div[3]/descendant::tr/td[1]");
	private UIElement BTN_HouseAreaDescending = new UIElement(
			"xpath=//div[text()='房源面积']/following-sibling::div/i[text()='arrow_drop_down']");
	private UIElement TXT_BuildingList = new UIElement(
			"xpath=//*[text()='房源面积']/ancestor::div[3]/descendant::tr/td[5]");
	private UIElement BTN_FilterFollow = new UIElement("xpath=//*[text()='跟进人']/following-sibling::div[1]/i");
	private UIElement TXT_FollowList = new UIElement("xpath=//*[text()='跟进人']/ancestor::div[3]/descendant::tr/td[7]");
	private UIElement BTN_FilterLogin = new UIElement("xpath=//*[text()='登录次数']/following-sibling::div[2]");
	private UIElement BTN_FilterProvince = new UIElement("xpath=//*[text()='城市']/following-sibling::div");
	private UIElement BTN_FilterHouseArea = new UIElement("xpath=//*[text()='房源面积']/following-sibling::div[2]");
	private UIElement BTN_CustomerNature = new UIElement(
			"xpath=//*[text()='客户性质']/following-sibling::div[1]/div[1]/button/div");
	private UIElement TXT_CustomerNatureList = new UIElement(
			"xpath=//*[text()='客户性质']/ancestor::div[3]/descendant::tr/td[6]");
	private UIElement BTN_MonthLogin = new UIElement(
			"xpath=//*[text()='最少登录次数']/following-sibling::div[1]/descendant::button");
	private UIElement TXT_MonthLogin = new UIElement("xpath=//*[text()='登录次数']/ancestor::div[3]/descendant::tr/td[3]");
	private UIElement BTN_Province = new UIElement(
			"xpath=//*[text()='请选择省份']/following-sibling::div[1]/div[1]/button/div");
	private UIElement BTN_Modify = new UIElement("xpath=//*[text()='登录次数']/ancestor::div[3]/descendant::tr[3]/td[3]");
	private UIElement TXT_Province = new UIElement("xpath=//*[text()='省份']/following-sibling::div[1]/div[1]/div[2]");
	private UIElement BTN_City = new UIElement("xpath=//*[text()='请选择城市']/following-sibling::div[1]/div[1]/button/div");
	private UIElement TXT_City = new UIElement("xpath=//*[text()='城市']/following-sibling::div[1]/div[1]/div[2]");
	private UIElement BTN_Search = new UIElement("xpath=//*[text()='客户、联系人或手机 (回车键搜索)']/following-sibling::input");
	private UIElement TXT_CustomerName = new UIElement(
			"xpath=//*[text()='客户名称']/ancestor::div[3]/descendant::tr/td[2]");
	private UIElement BTN_AssertType = new UIElement(
			"xpath=//*[text()='资产类型']/following-sibling::div[1]/div[1]/button/div");
	private UIElement TXT_AssertTypeList = new UIElement(
			"xpath=//div[text()='资产属性']/ancestor::div[3]/descendant::tr/td[8]");
	private UIElement BTN_BuildingType = new UIElement(
			"xpath=//*[text()='楼宇类型']/following-sibling::div[1]/div[1]/button/div");
	private UIElement TXT_BuildingTypeList = new UIElement(
			"xpath=//div[text()='楼宇类型']/ancestor::div[3]/descendant::tr/td[9]");
	private UIElement INP_MinArea = new UIElement("xpath=//*[text()='面积最小值']/following-sibling::input");
	private UIElement INP_MaxArea = new UIElement("xpath=//*[text()='面积最大值']/following-sibling::input");
	private UIElement BTN_BuildingModify = new UIElement(
			"xpath=//*[text()='城市']/ancestor::div[3]/descendant::tr[3]/td[6]");
	private UIElement TXT_BuildingProvince = new UIElement(
			"xpath=//*[text()='请选择省份']/following-sibling::div[1]/div[1]/div[2]");
	private UIElement TXT_BuildingCity = new UIElement(
			"xpath=//*[text()='请选择城市']/following-sibling::div[1]/div[1]/div[2]");
	private UIElement BTN_SearchBuilding = new UIElement(
			"xpath=//*[text()='楼宇名称、所属主体 (回车键搜索)']/following-sibling::input");
	private UIElement TXT_BuildingNameList = new UIElement(
			"xpath=//div[text()='楼宇名称']/ancestor::div[3]/descendant::tr/td[2]");

	private UIElement INP_StartDate = new UIElement("xpath=//*[text()='起始时间']/following-sibling::input");
	private UIElement INP_EndDate = new UIElement("xpath=//*[text()='结束时间']/following-sibling::input");
	private UIElement BTN_Confirm = new UIElement("xpath=//span[text()='确定']");
	private UIElement INP_One = new UIElement("xpath=//span[text()='1']");
	private UIElement INP_Ten = new UIElement("xpath=//span[text()='2']");
	private UIElement TXT_FirstCotract = new UIElement(
			"xpath=//*[text()='城市']/ancestor::div[3]/descendant::tr[3]/td[6]");
	private UIElement INP_Contract = new UIElement("xpath=//input[@name='contactName']");
	private UIElement INP_ContractNo = new UIElement("xpath=//input[@name='contractNo']");
	private UIElement BTN_ModifyContract = new UIElement("xpath=//*[text()='编辑']");
	private UIElement BTN_SaveContract = new UIElement("xpath=//*[text()='保存']");
	private UIElement TXT_Record = new UIElement(
			"xpath=//*[text()='操作日志']/ancestor::table/parent::div/following-sibling::div/descendant::tr[2]/td[4]");
	private UIElement BTN_CreateBuilding = new UIElement("xpath=//*[text()='新建楼宇']");
	private UIElement INP_ContractName = new UIElement("xpath=//div[text()='请输入客户名']/following-sibling::input");
	private UIElement TXT_EnableList = new UIElement("xpath=//div[text()='是否启用']");
	private UIElement BTN_AddAssistManagers = new UIElement("xpath=//*[text()='note_add']");
	private UIElement BTN_DeleteAssistManagers = new UIElement("xpath=//*[text()='delete']");
	private UIElement TXT_AssistManagers = new UIElement("xpath=//*[text()='delete']/preceding-sibling::div");
	private UIElement BTN_SecondAssistManagers = new UIElement("xpath=//*[@class='selectContainer___1nejd'][2]");
	private UIElement BTN_ChooseLoginTimes = new UIElement("xpath=//*[text()='登录次数']/following-sibling::div[2]");
	private UIElement TXT_LoginTimesStartTime = new UIElement(
			"xpath=//span[text()='登录次数起始时间：']/following-sibling::div");
	private UIElement TXT_LoginTimesEndTime = new UIElement("xpath=//span[text()='登录次数结束时间：']/following-sibling::div");
	private UIElement TXT_BuildingNum = new UIElement("xpath=//div[text()='总楼宇数']");
	private UIElement TXT_RentArea = new UIElement("xpath=//div[text()='总在租面积']");
	private UIElement TXT_HouseArea = new UIElement("xpath=//div[text()='总房源面积']");
	private UIElement INP_BuildingName = new UIElement("xpath=//input[@name='name']");
	private UIElement TXT_ContractNum = new UIElement("xpath=//div[text()='合同数']");
	private UIElement TXT_HourseNum = new UIElement("xpath=//div[text()='房源数']");
	private UIElement TXT_OneRentArea = new UIElement("xpath=//div[text()='在租面积']");
	private UIElement TXT_OneHourseArea = new UIElement("xpath=//div[text()='房源面积']");
	private UIElement TXT_Remarks = new UIElement("xpath=//th[text()='备注(点击空白处自动保存)']");
	private UIElement INP_Remarks = new UIElement(
			"xpath=//th[text()='备注(点击空白处自动保存)']/ancestor::div[1]/following-sibling::div/descendant::td[7]");

	private UIElement follow(String name) {
		return new UIElement("xpath=//div[text()='" + name + "']");
	}

	private List<String> rentalDetails(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	public String getAlertText() {
		this.driver.sleep(1000);
		return this.driver.getAlertText();
	}

	public String getTime(String user_time) {
		String re_time = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d;
		try {
			d = sdf.parse(user_time);
			long l = d.getTime();
			String str = String.valueOf(l);
			re_time = str.substring(0, 10);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return re_time;
	}

	public String getTimeSlash(String user_time) {
		String re_time = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date d;
		try {
			d = sdf.parse(user_time);
			long l = d.getTime();
			String str = String.valueOf(l);
			re_time = str.substring(0, 10);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return re_time;
	}

	public void gotoCustomerList() {
		this.driver.waitClickable(BTN_CustomerManagement, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_CustomerManagement);
		this.driver.sleep(3000);
	}

	public void areaDescending() {
		this.driver.sleep(5000);
		this.driver.click(BTN_TimeDescending);
	}

	public List<String> maxAreaList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_maxArea);
	}

	public void gotoBuildingList() {
		this.driver.waitClickable(BTN_CustomerManagement, 3);
		this.driver.click(BTN_CustomerManagement);
		this.driver.click(BTN_CustomerList);
		this.driver.sleep(1000);
		this.driver.click(BTN_BuildingList);
		this.driver.sleep(2000);
	}

	public void houseAreaDescending() {
		this.driver.sleep(5000);
		this.driver.click(BTN_HouseAreaDescending);
	}

	public List<String> buildingList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_BuildingList);
	}

	public void filterFollow(String city, String follow) {
		this.driver.click(BTN_FilterFollow);
		this.driver.sleep(1000);
		this.driver.click(this.follow(city));
		this.driver.sleep(1000);
		this.driver.click(this.follow(follow));
		this.driver.click(BTN_Confirm);
	}

	public List<String> followList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_FollowList);
	}

	public void filterCustomerNature(String customerNature) {
		this.driver.click(BTN_FilterLogin);
		this.driver.click(BTN_CustomerNature);
		this.driver.sleep(1000);
		this.driver.click(this.follow(customerNature));

	}

	public List<String> customerNatureList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_CustomerNatureList);
	}

	public void filterMonthLogin(String monthLogin) {
		this.driver.click(BTN_FilterLogin);
		this.driver.click(BTN_MonthLogin);
		this.driver.sleep(1000);
		this.driver.click(this.follow(monthLogin));
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);

	}

	public List<String> monthLoginList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_MonthLogin);
	}

	public void filterProvince(String province) {
		this.driver.click(BTN_FilterProvince);
		this.driver.click(BTN_Province);
		this.driver.sleep(1000);
		this.driver.click(this.follow(province));
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);

	}

	public String getProvince() {
		this.driver.waitAndClick(BTN_Modify, 5);
		this.driver.sleep(1000);
		return this.driver.elementGetText(TXT_Province);
	}

	public void filterCity(String province, String city) {
		this.driver.click(BTN_FilterProvince);
		this.driver.click(BTN_Province);
		this.driver.sleep(1000);
		this.driver.click(this.follow(province));
		this.driver.sleep(1000);
		this.driver.click(BTN_City);
		this.driver.sleep(1000);
		this.driver.click(this.follow(city));
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);

	}

	public String getCity() {
		this.driver.sleep(1000);
		this.driver.click(BTN_Modify);
		this.driver.sleep(1000);
		this.driver.waitForElement(TXT_City, 5);
		return this.driver.elementGetText(TXT_City);
	}

	public void searchCustomer(String name) {
		this.driver.elementSendText(BTN_Search, name);
		this.driver.elementSendKeys(BTN_Search, Keys.ENTER);
		this.driver.sleep(1000);

	}

	public List<String> customerList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_CustomerName);
	}

	// 楼宇列表
	public void filterAssertType(String assertType) {
		this.driver.click(BTN_FilterLogin);
		this.driver.click(BTN_AssertType);
		this.driver.sleep(1000);
		this.driver.click(this.follow(assertType));

	}

	public List<String> assertTypeList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_AssertTypeList);
	}

	public void filterBuildingType(String buildingType) {
		this.driver.click(BTN_FilterLogin);
		this.driver.click(BTN_BuildingType);
		this.driver.sleep(1000);
		this.driver.click(this.follow(buildingType));

	}

	public List<String> buildingTypeList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_BuildingTypeList);
	}

	public void filterArea(String minArea, String maxArea) {
		this.driver.click(BTN_FilterHouseArea);
		this.driver.elementSendText(INP_MinArea, minArea);
		this.driver.sleep(1000);
		this.driver.elementSendText(INP_MaxArea, maxArea);
		this.driver.elementSendKeys(INP_MaxArea, Keys.ENTER);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
	}

	public List<String> houseAreaList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_BuildingList);
	}

	public String getBuildingProvince() {
		this.driver.sleep(1000);
		this.driver.waitAndClick(BTN_BuildingModify, 5);
		this.driver.sleep(1000);
		return this.driver.elementGetText(TXT_BuildingProvince);
	}

	public String getBuildingCity() {
		this.driver.sleep(5000);
		this.driver.click(BTN_BuildingModify);
		this.driver.sleep(1000);
		return this.driver.elementGetText(TXT_BuildingCity);
	}

	public void searchBuilding(String building) {
		this.driver.elementSendText(BTN_SearchBuilding, building);
		this.driver.elementSendKeys(BTN_SearchBuilding, Keys.ENTER);
		this.driver.sleep(1000);

	}

	public List<String> buildingNameList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_BuildingNameList);
	}

	public void filterDate(String startDate, String endDate) {
		this.driver.click(INP_StartDate);
		this.driver.sleep(1000);
		this.driver.click(INP_One);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
		this.driver.sleep(1000);
		this.driver.click(INP_EndDate);
		this.driver.sleep(1000);
		this.driver.click(INP_Ten);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
	}

	public void filterDateBigEndDate(String startDate, String endDate) {
		this.driver.click(INP_StartDate);
		this.driver.sleep(1000);
		this.driver.click(INP_Ten);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
		this.driver.sleep(1000);
		this.driver.click(INP_EndDate);
		this.driver.sleep(1000);
		this.driver.click(INP_One);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
	}

	public List<String> registTimeList() {
		this.driver.sleep(5000);
		return this.rentalDetails(TXT_RegistTime);
	}

	public void filterStartDate(String startDate) {
		this.driver.click(INP_StartDate);
		this.driver.sleep(1000);
		this.driver.click(INP_One);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
	}

	public void filterEndDate(String endDate) {
		this.driver.click(INP_EndDate);
		this.driver.sleep(1000);
		this.driver.click(INP_One);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
	}

	public void modifyContract(String contract) {
		this.driver.click(TXT_FirstCotract);
		this.driver.sleep(1000);
		this.driver.click(BTN_ModifyContract);
		this.driver.sleep(1000);
		if (this.driver.elementGetValue(INP_Contract).equals(contract)) {
			this.driver.elementClearText(INP_Contract);
			this.driver.elementSendText(INP_Contract, "123");
		} else {
			this.driver.elementClearText(INP_Contract);
			this.driver.elementSendText(INP_Contract, contract);
		}
		this.driver.sleep(1000);
		this.driver.click(BTN_SaveContract);
		this.getAlertText();
	}

	public String getRecord() {
		this.driver.sleep(1000);
		this.driver.click(TXT_FirstCotract);
		this.driver.sleep(1000);
		return this.driver.elementGetText(TXT_Record);
	}

	public void inputContractName(String contenct) {
		this.driver.click(BTN_CreateBuilding);
		this.driver.sleep(1000);
		this.driver.elementSendText(INP_ContractName, contenct);
		this.driver.sleep(1000);
	}

	public boolean checkContract(String contract) {
		return this.driver.isElementFound(this.follow(contract));
	}

	public void createBuildingNoneText() {
		this.driver.click(BTN_CreateBuilding);
		this.driver.sleep(1000);
		this.driver.click(BTN_SaveContract);
	}

	public void modifyBuildingNoneText() {
		this.driver.click(TXT_FirstCotract);
		this.driver.sleep(1000);
		this.driver.click(BTN_ModifyContract);
		this.driver.sleep(1000);
		this.driver.elementClearText(INP_BuildingName);
		this.driver.elementSendText(INP_BuildingName, "1");
		this.driver.elementSendKeys(INP_BuildingName, Keys.BACK_SPACE);
		this.driver.sleep(1000);
		this.driver.click(BTN_SaveContract);
	}

	public boolean checkEnableList() {
		return this.driver.isElementFound(TXT_EnableList);
	}

	public void deleteAssistManagers() {
		this.driver.click(TXT_FirstCotract);
		this.driver.sleep(1000);
		this.driver.click(BTN_ModifyContract);
		this.driver.sleep(1000);
		this.driver.click(BTN_DeleteAssistManagers);
	}

	public String checkAssistMangers() {
		return this.driver.elementGetText(TXT_AssistManagers);
	}

	public void addAssistManagers() {
		this.driver.click(TXT_FirstCotract);
		this.driver.sleep(1000);
		this.driver.click(BTN_ModifyContract);
		this.driver.sleep(1000);
		this.driver.mouseOver(BTN_AddAssistManagers);
		this.driver.sleep(1000);
		this.driver.click(BTN_AddAssistManagers);
	}

	public boolean checkAddAssistMangers() {
		this.driver.sleep(1000);
		return this.driver.isElementFound(BTN_SecondAssistManagers);
	}

	public void chooseLoginTimesRange() {
		this.driver.click(BTN_ChooseLoginTimes);
		this.driver.sleep(1000);
		this.driver.click(BTN_Confirm);
		this.driver.sleep(1000);
	}

	public String checkLoginTimesRange() {
		this.driver.sleep(1000);
		return this.driver.elementGetText(TXT_LoginTimesStartTime) + this.driver.elementGetText(TXT_LoginTimesEndTime);
	}

	public boolean[] checkBuildingListHeader() {
		this.driver.sleep(1000);
		boolean[] isFound = new boolean[3];
		isFound[0] = this.driver.isElementFound(TXT_BuildingNum);
		isFound[1] = this.driver.isElementFound(TXT_RentArea);
		isFound[2] = this.driver.isElementFound(TXT_HouseArea);
		return isFound;
	}

	public void modifyBuilding(String buildingName) {
		this.driver.waitClickable(TXT_FirstCotract, 5);
		this.driver.click(TXT_FirstCotract);
		this.driver.sleep(1000);
		this.driver.click(BTN_ModifyContract);
		this.driver.sleep(1000);
		if (this.driver.elementGetValue(INP_BuildingName).equals(buildingName)) {
			this.driver.elementClearText(INP_BuildingName);
			this.driver.elementSendText(INP_BuildingName, "123");
		} else {
			this.driver.elementClearText(INP_BuildingName);
			this.driver.elementSendText(INP_BuildingName, buildingName);
		}
		this.driver.sleep(1000);
		this.driver.click(BTN_SaveContract);
		this.driver.sleep(1000);
		this.getAlertText();
	}

	public boolean[] checkBuildingDetailsHeader() {
		this.driver.waitClickable(TXT_FirstCotract, 5);
		this.driver.click(TXT_FirstCotract);
		this.driver.sleep(1000);
		boolean[] isFound = new boolean[4];
		isFound[0] = this.driver.isElementFound(TXT_ContractNum);
		isFound[1] = this.driver.isElementFound(TXT_HourseNum);
		isFound[2] = this.driver.isElementFound(TXT_OneRentArea);
		isFound[3] = this.driver.isElementFound(TXT_OneHourseArea);
		return isFound;
	}

	public void modifyContractNo() {
		String currentTimeString = Long.toString(System.currentTimeMillis());
		this.driver.click(TXT_FirstCotract);
		this.driver.sleep(1000);
		this.driver.click(BTN_ModifyContract);
		this.driver.sleep(1000);
		this.driver.elementClearText(INP_ContractNo);
		this.driver.elementSendText(INP_ContractNo, currentTimeString);
		this.driver.sleep(1000);
		this.driver.click(BTN_SaveContract);
	}

	public void gotoErrorList() {
		this.driver.click(BTN_ErrorList);
		this.driver.sleep(3000);
	}

	public void editRemarks() {
		this.driver.click(INP_Remarks);
		this.driver.click(TXT_Remarks);
	}

}