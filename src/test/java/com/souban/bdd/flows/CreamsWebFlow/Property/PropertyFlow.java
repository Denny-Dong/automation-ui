package com.souban.bdd.flows.CreamsWebFlow.Property;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Property.PropertyPage;

public class PropertyFlow {
	private PropertyPage PropertyPage = null;

	public PropertyFlow(final Driver driver) {
		this.PropertyPage = PageFactory.getPage(PropertyPage.class, driver);
	}

	public void gotoEstateManagement() {
		this.PropertyPage.gotoEstateManagement();
	}

	public void EstatePriceDescending() {
		this.PropertyPage.EstatePriceDescending();
	}

	public void checkDescendingEstatePrice() {
		List<String> allEstatePrice = new ArrayList<String>();
		allEstatePrice = this.PropertyPage.EstatePrice();
		String[] Time = new String[10];
		int i = 0;
		for (String str : allEstatePrice) {
			Time[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Time[j].compareTo(Time[j + 1]), greaterThanOrEqualTo(0));

		}
	}

	public void EstatePriceAscending() {
		this.PropertyPage.EstatePriceAscending();
	}

	public void checkAscendingEstatePrice() {
		List<String> allEstatePrice = new ArrayList<String>();
		allEstatePrice = this.PropertyPage.EstatePrice();
		String[] Time = new String[10];
		int i = 0;
		for (String str : allEstatePrice) {
			Time[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Time[j].compareTo(Time[j + 1]), lessThanOrEqualTo(0));
		}
	}

	public void RentDayDescending() {
		this.PropertyPage.RentDayDescending();
	}

	public void checkDescendingRentDay() {
		List<String> allRentDay = new ArrayList<String>();
		allRentDay = this.PropertyPage.RentDay();
		String[] Time = new String[10];
		int i = 0;
		for (String str : allRentDay) {
			Time[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Time[j].compareTo(Time[j + 1]), greaterThanOrEqualTo(0));

		}
	}

	public void RentDayAscending() {
		this.PropertyPage.RentDayAscending();
	}

	public void checkAscendingRentDay() {
		List<String> allRentDay = new ArrayList<String>();
		allRentDay = this.PropertyPage.RentDay();
		String[] Time = new String[10];
		int i = 0;
		for (String str : allRentDay) {
			Time[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Time[j].compareTo(Time[j + 1]), lessThanOrEqualTo(0));
		}
	}

	public void SettlementDateDescending() {
		this.PropertyPage.SettlementDateDescending();
	}

	public void checkDescendingSettlementDate() {
		List<String> allSettlementDate = new ArrayList<String>();
		allSettlementDate = this.PropertyPage.SettlementDate();
		String[] Time = new String[10];
		int i = 0;
		for (String str : allSettlementDate) {
			Time[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Time[j].compareTo(Time[j + 1]), greaterThanOrEqualTo(0));

		}
	}

	public void SettlementDateAscending() {
		this.PropertyPage.SettlementDateAscending();
	}

	public void checkAscendingSettlementDate() {
		List<String> allSettlementDate = new ArrayList<String>();
		allSettlementDate = this.PropertyPage.SettlementDate();
		String[] Time = new String[10];
		int i = 0;
		for (String str : allSettlementDate) {
			Time[i] = str;
			i++;
		}
		for (int j = 0; j < 10 - 1; j++) {
			Assert.assertThat(Time[j].compareTo(Time[j + 1]), lessThanOrEqualTo(0));
		}
	}

	public void gotoAmmeterReadingManagement() {
		this.PropertyPage.gotoAmmeterReadingManagement();
	}

	public void editReading(String ammeter, String currentReading, String date) {
		String currentPrice = this.PropertyPage.editReading(ammeter, currentReading, date);
		Assert.assertThat(currentPrice, not("0"));

	}

	public void modifyCurrentPrice(String ammeter, String currentPrice) {
		String currentReading = this.PropertyPage.modifyCurrentPrice(ammeter, currentPrice);
		Assert.assertThat(currentReading, is("0"));
	}

	public void chooseEndDate(String startDate, String endDate) {
		this.PropertyPage.chooseEndDate(startDate, endDate);
	}

	public void checkEndDate(String startDate, String endDate) {
		String startDateTimestamp = this.PropertyPage.getTime(startDate);
		String endDateTimestamp = this.PropertyPage.getTime(endDate);
		List<String> allEndDate = new ArrayList<String>();
		allEndDate = this.PropertyPage.endDateList();

		for (String str : allEndDate) {
			String Date = this.PropertyPage.getTimeSlash(str);
			if (Date != null) {
				Assert.assertThat(Date, greaterThanOrEqualTo(startDateTimestamp));
				Assert.assertThat(Date, lessThanOrEqualTo(endDateTimestamp));
			}
		}
	}

	public void chooseContractStatus(String status) {
		this.PropertyPage.chooseContractStatus(status);
	}

	public void checkContractStatus(String status) {
		List<String> allContractStatus = new ArrayList<String>();
		allContractStatus = this.PropertyPage.contractStatusList();
		for (String str : allContractStatus) {
			Assert.assertThat(str, is(status));
		}
	}

	public void sizeDesc() {
		this.PropertyPage.sizeDesc();
	}

	public void checkDescendingSize() {
		List<String> allSize = new ArrayList<String>();
		allSize = this.PropertyPage.sizeList();
		long[] Area = new long[allSize.size()];
		int i = 0;
		for (String str : allSize) {
			Area[i] = Long.parseLong(str);
			i++;
		}
		for (int j = 0; j < allSize.size() - 1; j++) {
			Assert.assertThat(Area[j], greaterThanOrEqualTo(Area[j + 1]));

		}
	}

	public void gotoArchiveContract() {
		this.PropertyPage.gotoArchiveContract();
	}

	public void gotoContractInfo() {
		this.PropertyPage.gotoContractInfo();
	}

	public void checkContractInfo() {
		boolean[] isFound = this.PropertyPage.checkContractInfo();
		for (int i = 0; i < 5; i++) {
			Assert.assertThat(isFound[i], is(true));
		}

	}

	public void clickAddPropertyContract() {
		this.PropertyPage.clickAddPropertyContract();
	}

	public void checkFillContractInfo() {
		String[] fillInfo = this.PropertyPage.checkFillContractInfo();
		for (int i = 0; i < 3; i++) {
			Assert.assertThat(fillInfo[i], not(""));
		}

	}

	public void gotoPropertyContract() {
		this.PropertyPage.gotoPropertyContract();
	}

	public void createPropertyContract(String renter, String deposit) {
		this.PropertyPage.createPropertyContract(renter, deposit);
	}

	public void oaPropertyContract() {
	    this.PropertyPage.oaPropertyContract();
	}

	public void withdrawalPropertyContract() {
		this.PropertyPage.withdrawalPropertyContract();
	}

	public void isWithdrawalPropertyContract() {
		Assert.assertThat(this.PropertyPage.isWithdrawalPropertyContract(), is(true));
		this.PropertyPage.clickCha();
	}

	public void isWithdrawalBills() {
		Assert.assertThat(this.PropertyPage.isWithdrawalBills(), is(true));
	}

	public void invalidPropertyContract(String processBills){
		this.PropertyPage.invalidPropertyContract(processBills);
	}

	public void verifyBills(String renter) {
		Assert.assertThat(this.PropertyPage.verifyBills(renter), is(false));
	}

	public void verifyBillsExist(String renter) {
		Assert.assertThat(this.PropertyPage.verifyBills(renter), is(true));
		this.PropertyPage.clickCha();
	}

	public void deleteBills() {
		this.PropertyPage.deleteBills();
	}
}
