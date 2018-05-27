package com.souban.bdd.flows.CreamsWebFlow.Contract;

import static org.hamcrest.core.Is.is;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Contract.ContractPage;

public class ContractFlow {

	private ContractPage contractPage = null;

	public ContractFlow(final Driver driver) {
		this.contractPage = PageFactory.getPage(ContractPage.class, driver);
	}

	public void enterNewContractPage() {
		Assert.assertThat(this.contractPage.enterNewContractPage(), is(true));
	}

	public void selectHousingResource(String building, String unit, String floor, String room) {
		this.contractPage.selectHousingResource(building, unit, floor, room);
	}

	public void selectIndividualLeaseAndIndustry(String industry) {
		this.contractPage.selectIndividualLeaseAndIndustry(industry);
	}

	public void inputSignerNameSignerTelAndAddress(String signerName, String signerTel, String address) {
		this.contractPage.inputSignerNameSignerTelAndAddress(signerName, signerTel, address);
	}

	public void enterContractInfoPage() {
		Assert.assertThat(this.contractPage.enterContractInfoPage(), is(true));
	}

	public void inputContractInfo(String Date) {
		this.contractPage.inputContractInfo(Date);
	}

	public void inputRentMonths_rentMonths_depositDays_pay(String rent, String months_rent, String months_deposit,
			String days_pay) {
		this.contractPage.inputRentMonths_rentMonths_depositDays_pay(rent, months_rent, months_deposit, days_pay);
	}

	public void clickTheButtonOfOneYear() {
		this.contractPage.clickTheButtonOfOneYear();
	}

	public void clickTheButtonOfRentDetails() {
		this.contractPage.clickTheButtonOfRentDetails();
	}

	public void submitCreateContract() {
		this.contractPage.submitCreateContract();
	}

	public void reviewOfCreate() {
		this.contractPage.reviewOfCreate();
	}

	public void createNewContractSuccessfully() {
		Assert.assertThat(this.contractPage.createNewContractSuccessfully(), is(true));
	}

	public void invalidContract(String invalidReason) {
		this.contractPage.invalidContract(invalidReason);
	}

	public void reviewOfInvalid(String room) {
		this.contractPage.reviewOfInvalid(room);
	}

	public void checkInvalidSuccess(String room) {
		Assert.assertThat(this.contractPage.checkInvalidSuccess(room), is(true));
	}

	// 退租
	public void GotoContract(String building, String room) {
		this.contractPage.GotoContract(building, room);
	}

	public void createNewContractSuccessfully(String room) {
		this.contractPage.createNewContractSuccessfully(room);
	}

	public void rentOut() {
		this.contractPage.rentOut();
	}

	public void reviewOfRentOut(String room) {
		this.contractPage.reviewOfRentOut(room);
	}

	public void settlementOfRentOut(String room, String account) {
		this.contractPage.settlementOfRentOut(room, account);
	}

	public void checkRentHasBeenClosed(String room) {
		Assert.assertThat(this.contractPage.theRentHasBeenClosed(room), is(true));
	}

	// 保证金交纳
	public void clickMarginPayment() {
		this.contractPage.clickMarginPayment();
	}

	public void SubmitMargin() {
		this.contractPage.SubmitMargin();
	}

	public void hasNoMarginPaymentButton() {
		Assert.assertThat(this.contractPage.hasNoMarginPaymentButton(), is(false));
	}

	// 未付结清
	public void clickRentDetails() {
		this.contractPage.clickRentDetails();
	}

	public void checkPaymentStatus(String paymentstatus, String settlestatus) {
		String status = this.contractPage.checkPaymentStatus();
		String[] actualStatus = status.split(",");
		Assert.assertThat(actualStatus[0], is(paymentstatus));
		Assert.assertThat(actualStatus[1], is(settlestatus));
	}

	public void settleTheCurrentUnpaid() {
		this.contractPage.settleTheCurrentUnpaid();
	}

	public void clickTheButtonThreeYear() {
		this.contractPage.clickTheButtonThreeYear();
	}

	public void input(String firstYearDiscount, String secondYearIncrease, String secondYearDiscount,
			String ThirdYearIncrease, String ThirdYearDiscount) {
		this.contractPage.input(firstYearDiscount, secondYearIncrease, secondYearDiscount, ThirdYearIncrease,
				ThirdYearDiscount);
	}

	public void checkIncrease(String month_deposit, String secondYearIncrease, String thirdYearIncrease) {
		List<String> allUnitPrice = new ArrayList<String>();
		allUnitPrice = this.contractPage.checkIncrease();
		int secondYear = (int) Math.ceil(12.0 / Integer.parseInt(month_deposit));
		int thirdYear = (int) Math.ceil(2 * 12.0 / Integer.parseInt(month_deposit));
		Assert.assertThat(allUnitPrice.get(secondYear).substring(0, 2), is(secondYearIncrease));
		Assert.assertThat(allUnitPrice.get(thirdYear).substring(0, 2), is(thirdYearIncrease));
	}

	public void checkUnitPrice(String month_deposit, String secondYearIncrease, String thirdYearIncrease, String rent) {
		List<String> allUnitPrice = new ArrayList<String>();
		allUnitPrice = this.contractPage.checkUnitPrice();
		int secondYear = (int) Math.ceil(12.0 / Integer.parseInt(month_deposit));
		int thirdYear = (int) Math.ceil(2 * 12.0 / Integer.parseInt(month_deposit));
		double firstYearPrice = Math.round(Double.valueOf(rent) * 100) / 100;
		double secondYearPrice = (double) (Math
				.round(Double.valueOf(rent) * (1 + Double.valueOf(secondYearIncrease) / 100) * 100)) / 100;
		double thirdYearPrice = (double) (Math
				.round(Double.valueOf(secondYearPrice) * (1 + Double.valueOf(thirdYearIncrease) / 100) * 100)) / 100;
		Assert.assertThat(Double.valueOf(allUnitPrice.get(0)), is(firstYearPrice));
		Assert.assertThat(Double.valueOf(allUnitPrice.get(secondYear)), is(secondYearPrice));
		Assert.assertThat(Double.valueOf(allUnitPrice.get(thirdYear)), is(thirdYearPrice));
	}

	public void checkDiscount(String month_deposit, String firstYearDiscount, String secondYearDiscount,
			String thirdYearDiscount) {
		List<String> allUnitPrice = new ArrayList<String>();
		allUnitPrice = this.contractPage.checkDiscount();
		int secondYear = (int) Math.ceil(12.0 / Integer.parseInt(month_deposit));
		int thirdYear = (int) Math.ceil(2 * 12.0 / Integer.parseInt(month_deposit));
		Assert.assertThat(allUnitPrice.get(0), is(firstYearDiscount));
		Assert.assertThat(allUnitPrice.get(secondYear), is(secondYearDiscount));
		Assert.assertThat(allUnitPrice.get(thirdYear), is(thirdYearDiscount));
	}

	public void checkActualPrice(String month_deposit, String firstYearDiscount, String secondYearIncrease,
			String secondYearDiscount, String thirdYearIncrease, String thirdYearDiscount, String rent) {
		List<String> allUnitPrice = new ArrayList<String>();
		allUnitPrice = this.contractPage.checkActualPrice();
		int secondYear = (int) Math.ceil(12.0 / Integer.parseInt(month_deposit));
		int thirdYear = (int) Math.ceil(2 * 12.0 / Integer.parseInt(month_deposit));
		double firstYearPrice = Math.round(Double.valueOf(rent) * 100) / 100;
		double secondYearPrice = (double) (Math
				.round(Double.valueOf(rent) * (1 + Double.valueOf(secondYearIncrease) / 100) * 100)) / 100;
		double thirdYearPrice = (double) (Math
				.round(Double.valueOf(secondYearPrice) * (1 + Double.valueOf(thirdYearIncrease) / 100) * 100)) / 100;
		double firstYearActualPrice = (double) (Math
				.round(firstYearPrice * Double.valueOf(firstYearDiscount) / 10 * 100)) / 100;
		double secondYearActualPrice = (double) (Math
				.round(secondYearPrice * Double.valueOf(secondYearDiscount) / 10 * 100)) / 100;
		double thirdYearActualPrice = (double) (Math
				.round(thirdYearPrice * Double.valueOf(thirdYearDiscount) / 10 * 100)) / 100;
		Assert.assertThat(Double.valueOf(allUnitPrice.get(0)), is(firstYearActualPrice));
		Assert.assertThat(Double.valueOf(allUnitPrice.get(secondYear)), is(secondYearActualPrice));
		Assert.assertThat(Double.valueOf(allUnitPrice.get(thirdYear)), is(thirdYearActualPrice));
	}

	public void checkFinalAmount(String month_deposit, String firstYearDiscount, String secondYearIncrease,
			String secondYearDiscount, String thirdYearIncrease, String thirdYearDiscount, String rent) {
		List<String> allUnitPrice = new ArrayList<String>();
		allUnitPrice = this.contractPage.checkFinalAmount();
		int secondYear = (int) Math.ceil(12.0 / Integer.parseInt(month_deposit));
		int thirdYear = (int) Math.ceil(2 * 12.0 / Integer.parseInt(month_deposit));
		double firstYearPrice = Math.round(Double.valueOf(rent) * 100) / 100;
		double secondYearPrice = (double) (Math
				.round(Double.valueOf(rent) * (1 + Double.valueOf(secondYearIncrease) / 100) * 100)) / 100;
		double thirdYearPrice = (double) (Math
				.round(Double.valueOf(secondYearPrice) * (1 + Double.valueOf(thirdYearIncrease) / 100) * 100)) / 100;
		double firstYearActualPrice = (double) (Math
				.round(firstYearPrice * Double.valueOf(firstYearDiscount) / 10 * 100)) / 100;
		double secondYearActualPrice = (double) (Math
				.round(secondYearPrice * Double.valueOf(secondYearDiscount) / 10 * 100)) / 100;
		double thirdYearActualPrice = (double) (Math
				.round(thirdYearPrice * Double.valueOf(thirdYearDiscount) / 10 * 100)) / 100;
		double firstYearFinalAmount = (double) (Math
				.round(firstYearActualPrice * 365 / 12 * 100 * Double.valueOf(month_deposit) * 87.64)) / 100;
		double secondYearFinalAmount = (double) (Math
				.round(secondYearActualPrice * 365 / 12 * 100 * Double.valueOf(month_deposit) * 87.64)) / 100;
		double thirdYearFinalAmount = (double) (Math
				.round(thirdYearActualPrice * 365 / 12 * 100 * Double.valueOf(month_deposit) * 87.64)) / 100;
		Assert.assertThat(Double.valueOf(allUnitPrice.get(0)), is(firstYearFinalAmount));
		Assert.assertThat(Double.valueOf(allUnitPrice.get(secondYear)), is(secondYearFinalAmount));
		Assert.assertThat(Double.valueOf(allUnitPrice.get(thirdYear)), is(thirdYearFinalAmount));
	}

	public void checkDateInterval(String month_deposit) {
		List<String> allUnitPrice = new ArrayList<String>();
		allUnitPrice = this.contractPage.checkDateInterval();
		Calendar date = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String firstDate = sdf.format(date.getTime());
		Assert.assertThat(allUnitPrice.get(0), is(firstDate));
		date.add(Calendar.MONTH, Integer.parseInt(month_deposit));
		String secondDate = sdf.format(date.getTime());
		Assert.assertThat(allUnitPrice.get(1), is(secondDate));
		date.add(Calendar.MONTH, Integer.parseInt(month_deposit));
		String thirdDate = sdf.format(date.getTime());
		Assert.assertThat(allUnitPrice.get(2), is(thirdDate));
	}

	public void checkPaymentD(String month_deposit, String days_pay) {
		List<String> allUnitPrice = new ArrayList<String>();
		allUnitPrice = this.contractPage.checkPaymentDay();
		Calendar date = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String firstPaymentDay = sdf.format(date.getTime());
		Assert.assertThat(allUnitPrice.get(0), is(firstPaymentDay));
		date.add(Calendar.MONTH, Integer.parseInt(month_deposit));
		date.add(Calendar.DAY_OF_YEAR, -Integer.parseInt(days_pay));
		String secondPaymentDay = sdf.format(date.getTime());
		Assert.assertThat(allUnitPrice.get(1), is(secondPaymentDay));
		date.add(Calendar.MONTH, Integer.parseInt(month_deposit));
		String thirdPaymentDay = sdf.format(date.getTime());
		Assert.assertThat(allUnitPrice.get(2), is(thirdPaymentDay));
	}

	public void clickBasicInformation() {
		this.contractPage.clickTheButtonOfBasicInformation();

	}

	public void checkBasicInformation() {
		Assert.assertThat(this.contractPage.BasicInformation(), is(true));

	}

	public void clickRentContract() {
		this.contractPage.clickTheButtonOfRentContract();

	}

	public void checkRentContract() {
		Assert.assertThat(this.contractPage.RentContract(), is(true));

	}

	public void checkSubmit() {
		Assert.assertThat(this.contractPage.Submit(), is(true));

	}

	public void back() {
		this.contractPage.back();

	}

	public void createNewPropertyContractSuccessfully() {
		Assert.assertThat(this.contractPage.createNewPropertyContractSuccessfully(), is(true));

	}

	public void buildingsListAn() {
		Assert.assertThat(this.contractPage.buildingsListAn(), is(true));

	}

	public void enterContractEdit() {
		this.contractPage.enterContractEdit();

	}

	public void editBasePrice(String basePrice) {
		this.contractPage.editBasePrice(basePrice);

	}

	public void clickRentalStatement() {
		this.contractPage.clickRentalStatement();

	}

	public void clickContractEditSubmit() {
        this.contractPage.clickSave();

    }

}
