package com.souban.bdd.flows.BOS;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.core.Is.is;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.BOS.BosCustomerManagementPage;

public class BosCustomerManagementFlow {
	private BosCustomerManagementPage bosCustomerManagementPage = null;

	public BosCustomerManagementFlow(final Driver driver) {
		this.bosCustomerManagementPage = PageFactory.getPage(BosCustomerManagementPage.class, driver);
	}

	public void gotoCustomerList() {
		this.bosCustomerManagementPage.gotoCustomerList();
	}

	public void areaDescending() {
		this.bosCustomerManagementPage.areaDescending();
	}

	public void checkDescendingArea() {
		List<String> allArea = new ArrayList<String>();
		allArea = this.bosCustomerManagementPage.maxAreaList();
		long[] Area = new long[allArea.size()];
		int i = 0;
		for (String str : allArea) {
			Area[i] = Long.parseLong(str);
			i++;
		}
		for (int j = 0; j < allArea.size() - 1; j++) {
			Assert.assertThat(Area[j], greaterThanOrEqualTo(Area[j + 1]));

		}
	}

	public void gotoBuildingList() {
		this.bosCustomerManagementPage.gotoBuildingList();
	}

	public void houseAreaDescending() {
		this.bosCustomerManagementPage.houseAreaDescending();
	}

	public void checkDescendingHouseArea() {
		List<String> allHouseArea = new ArrayList<String>();
		allHouseArea = this.bosCustomerManagementPage.buildingList();
		float[] HouseArea = new float[allHouseArea.size()];
		int i = 0;
		for (String str : allHouseArea) {
			HouseArea[i] = Float.parseFloat(str);
			i++;
		}
		for (int j = 0; j < allHouseArea.size() - 1; j++) {
			Assert.assertThat(HouseArea[j], greaterThanOrEqualTo(HouseArea[j + 1]));

		}
	}

	public void filterFollow(String city, String follow) {
		this.bosCustomerManagementPage.filterFollow(city, follow);
	}

	public void checkFollow(String follow) {
		List<String> allFollow = new ArrayList<String>();
		allFollow = this.bosCustomerManagementPage.followList();
		for (String str : allFollow) {
			Assert.assertThat(str, is(follow));
		}
	}

	public void filterCustomerNature(String customerNature) {
		this.bosCustomerManagementPage.filterCustomerNature(customerNature);
	}

	public void checkCustomerNature(String customerNature) {
		List<String> allCustomerNature = new ArrayList<String>();
		allCustomerNature = this.bosCustomerManagementPage.customerNatureList();
		for (String str : allCustomerNature) {
			Assert.assertThat(str, is(customerNature));
		}
	}

	public void filterMonthLogin(String monthLogin) {
		this.bosCustomerManagementPage.filterMonthLogin(monthLogin);
	}

	public void checkMongthLogin(String monthLgoin) {
		List<String> allMonthLogin = new ArrayList<String>();
		allMonthLogin = this.bosCustomerManagementPage.monthLoginList();
		for (String str : allMonthLogin) {
			Assert.assertThat(str, greaterThanOrEqualTo(monthLgoin));
		}
	}

	public void filterProvince(String province) {
		this.bosCustomerManagementPage.filterProvince(province);
	}

	public void checkProvince(String province) {
		Assert.assertThat(province, is(this.bosCustomerManagementPage.getProvince()));
	}

	public void filterCity(String province, String city) {
		this.bosCustomerManagementPage.filterCity(province, city);
	}

	public void checkcity(String city) {
		Assert.assertThat(city, is(this.bosCustomerManagementPage.getCity()));
	}

	public void searchCustomer(String name) {
		this.bosCustomerManagementPage.searchCustomer(name);

	}

	public void checkCustomerName(String name) {
		List<String> allCustomer = new ArrayList<String>();
		allCustomer = this.bosCustomerManagementPage.customerList();
		for (String str : allCustomer) {
			Assert.assertThat(str, containsString(name));
		}
	}

	public void filterAssertType(String assertType) {
		this.bosCustomerManagementPage.filterAssertType(assertType);
	}

	public void checkAssertType(String assertType) {
		List<String> allAssertType = new ArrayList<String>();
		allAssertType = this.bosCustomerManagementPage.assertTypeList();
		for (String str : allAssertType) {
			Assert.assertThat(str, is(assertType));
		}
	}

	public void filterBuildingType(String buildingType) {
		this.bosCustomerManagementPage.filterBuildingType(buildingType);
	}

	public void checkBuildingType(String buildingType) {
		List<String> allBuildingType = new ArrayList<String>();
		allBuildingType = this.bosCustomerManagementPage.buildingTypeList();
		for (String str : allBuildingType) {
			Assert.assertThat(str, is(buildingType));
		}
	}

	public void filterArea(String minArea, String maxArea) {
		this.bosCustomerManagementPage.filterArea(minArea, maxArea);
	}

	public void checkHouseArea(String minArea, String maxArea) {
		List<String> allHouseArea = new ArrayList<String>();
		allHouseArea = this.bosCustomerManagementPage.houseAreaList();
		double[] houseArea = new double[allHouseArea.size()];
		int i = 0;
		for (String str : allHouseArea) {
			houseArea[i] = Double.parseDouble(str);
			i++;
		}
		for (int j = 0; j < allHouseArea.size() - 1; j++) {
			Assert.assertThat(houseArea[j], greaterThanOrEqualTo(Double.parseDouble(minArea)));
			Assert.assertThat(houseArea[j], lessThanOrEqualTo(Double.parseDouble(maxArea)));
		}
	}

	public void checkBuildingProvince(String province) {
		Assert.assertThat(province, is(this.bosCustomerManagementPage.getBuildingProvince()));
	}

	public void checkBuildingcity(String city) {
		Assert.assertThat(city, is(this.bosCustomerManagementPage.getBuildingCity()));
	}

	public void searchBuilding(String building) {
		this.bosCustomerManagementPage.searchBuilding(building);
	}

	public void checkBuildingName(String building) {
		List<String> allBuilding = new ArrayList<String>();
		allBuilding = this.bosCustomerManagementPage.buildingNameList();
		for (String str : allBuilding) {
			Assert.assertThat(str, containsString(building));
		}
	}

	public void filterDate(String startDate, String endDate) {
		this.bosCustomerManagementPage.filterDate(startDate, endDate);
	}

	public void filterDateBigEndDate(String startDate, String endDate) {
		this.bosCustomerManagementPage.filterDateBigEndDate(startDate, endDate);
	}

	public void checkRegistTime(String startDate, String endDate) {
		String startDateTimestamp = this.bosCustomerManagementPage.getTime(startDate);
		String endDateTimestamp = this.bosCustomerManagementPage.getTime(endDate);
		List<String> allRegistTime = new ArrayList<String>();
		allRegistTime = this.bosCustomerManagementPage.registTimeList();

		for (String str : allRegistTime) {
			String Date = this.bosCustomerManagementPage.getTimeSlash(str);
			if (Date != null) {
				Assert.assertThat(Date, greaterThanOrEqualTo(startDateTimestamp));
				Assert.assertThat(Date, lessThanOrEqualTo(endDateTimestamp));
			}

		}

	}

	public void filterStartDate(String startDate) {
		this.bosCustomerManagementPage.filterStartDate(startDate);
	}

	public void checkStartRegistTime(String startDate) {
		String startDateTimestamp = this.bosCustomerManagementPage.getTime(startDate);
		List<String> allRegistTime = new ArrayList<String>();
		allRegistTime = this.bosCustomerManagementPage.registTimeList();

		for (String str : allRegistTime) {
			String Date = this.bosCustomerManagementPage.getTimeSlash(str);
			if (Date != null) {
				Assert.assertThat(Date, greaterThanOrEqualTo(startDateTimestamp));
			}
		}

	}

	public void filterEndDate(String endDate) {
		this.bosCustomerManagementPage.filterEndDate(endDate);
	}

	public void checkEndRegistTime(String endDate) {
		String endDateTimestamp = this.bosCustomerManagementPage.getTime(endDate);
		List<String> allRegistTime = new ArrayList<String>();
		allRegistTime = this.bosCustomerManagementPage.registTimeList();

		for (String str : allRegistTime) {
			String Date = this.bosCustomerManagementPage.getTimeSlash(str);
			if (Date != null) {
				Assert.assertThat(Date, lessThanOrEqualTo(endDateTimestamp));
			}
		}

	}

	public void checkDate() {
		Assert.assertThat(this.bosCustomerManagementPage.getAlertText(), is("结束时间不能早于开始时间"));
	}

	public void modifyContract(String contract) {
		this.bosCustomerManagementPage.modifyContract(contract);
	}

	public void checkRecord(String record) {
		Assert.assertThat(this.bosCustomerManagementPage.getRecord(), is(record));
	}

	public void inputContractName(String contenct) {
		this.bosCustomerManagementPage.inputContractName(contenct);
	}

	public void checkContract(String contract) {
		Assert.assertThat(this.bosCustomerManagementPage.checkContract(contract), is(true));
	}

	public void createBuildingNoneText() {
		this.bosCustomerManagementPage.createBuildingNoneText();
	}

	public void modifyBuildingNoneText() {
		this.bosCustomerManagementPage.modifyBuildingNoneText();
	}

	public void checkCreateBuilingNoText() {
		Assert.assertThat(this.bosCustomerManagementPage.getAlertText(), containsString("不能为空"));
	}

	public void checkEnableList() {
		Assert.assertThat(this.bosCustomerManagementPage.checkEnableList(), is(true));
	}

	public void deleteAssistManagers() {
		this.bosCustomerManagementPage.deleteAssistManagers();
	}

	public void checkAssistMangers() {
		Assert.assertThat(this.bosCustomerManagementPage.checkAssistMangers(), is(""));
	}

	public void addAssistManagers() {
		this.bosCustomerManagementPage.addAssistManagers();
	}

	public void checkAddAssistMangers() {
		Assert.assertThat(this.bosCustomerManagementPage.checkAddAssistMangers(), is(true));
	}

	public void chooseLoginTimesRange() {
		this.bosCustomerManagementPage.chooseLoginTimesRange();
	}

	public void checkLoginTimesRange() {
		String loginTimesRange = this.bosCustomerManagementPage.checkLoginTimesRange();
		String[] loginTimes = new String[2];
		loginTimes = loginTimesRange.split("clear|\n");
		String today_str = "";
		String monthFirst = "";
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		today_str = sdf.format(dt);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-01");
		monthFirst = sdf2.format(dt);
		Assert.assertThat(loginTimes[0], is(monthFirst));
		Assert.assertThat(loginTimes[2], is(today_str));

	}

	public void checkBuildingListHeader() {
		boolean[] isFound = this.bosCustomerManagementPage.checkBuildingListHeader();
		for (int i = 0; i < 3; i++) {
			Assert.assertThat(isFound[i], is(true));
		}

	}

	public void modifyBuilding(String buildingName) {
		this.bosCustomerManagementPage.modifyBuilding(buildingName);
	}

	public void checkBuildingDetailsHeader() {
		boolean[] isFound = this.bosCustomerManagementPage.checkBuildingDetailsHeader();
		for (int i = 0; i < 4; i++) {
			Assert.assertThat(isFound[i], is(true));
		}

	}

	public void modifyContractNo() {
		this.bosCustomerManagementPage.modifyContractNo();
	}

	public void checkContractNoSaved() {
		Assert.assertThat(this.bosCustomerManagementPage.getAlertText(), containsString("修改成功"));
	}

	public void gotoErrorList() {
		this.bosCustomerManagementPage.gotoErrorList();
	}

	public void editRemarks() {
		this.bosCustomerManagementPage.editRemarks();
	}

	public void checkEditRemarksSuccess() {
		Assert.assertThat(this.bosCustomerManagementPage.getAlertText(), containsString("备注保存成功"));
	}
}
