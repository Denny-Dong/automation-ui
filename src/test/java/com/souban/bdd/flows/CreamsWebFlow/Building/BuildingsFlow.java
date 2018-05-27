package com.souban.bdd.flows.CreamsWebFlow.Building;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Building.BuildingsPage;

public class BuildingsFlow {
	private BuildingsPage buildingspage = null;

	public BuildingsFlow(Driver driver) {
		this.buildingspage = PageFactory.getPage(BuildingsPage.class, driver);
	}

	public void enterBuildingsPage() {
		Assert.assertThat(this.buildingspage.enterBuildingsPage(), is(true));

	}

	public void clickNewBuilding() {
		this.buildingspage.clickNewBuilding();

	}

	public void fillAllInformation(String province, String city, String region, String name, String address,
			String promotionTel, String alertDaysNum, String ContractNo) {
		this.buildingspage.fillAllInformation(province, city, region, name, address, promotionTel, alertDaysNum,
				ContractNo);

	}

	public void newBuildingSuccess(String name) {
		Assert.assertThat(this.buildingspage.newBuildingSuccess(name), is(true));

	}

	public void enterEditBuilding(String building) {
		this.buildingspage.enterEditbuilding(building);

	}

	public void chooseFloors() {
		this.buildingspage.choosefloors();

	}

	public void fillFloorInformation(String begin, String end) {
		this.buildingspage.fillFloorInformation(begin, end);

	}

	public void addFloors() {
		this.buildingspage.addFloors();

	}

	public void addCorrectFloors(String begin, int roomNum) {

	}

	public void creatNoroomFloor(String floor) {
		this.buildingspage.creatNoroomFloor(floor);

	}

	public void clearNewFloor(String floor) {
		this.buildingspage.clearNewFloor(floor);

	}

	public void correctHint() {
		Assert.assertThat(this.buildingspage.correctHint(), is(true));

	}

	public void submitFloorEdit() {
		this.buildingspage.submitFloorEdit();

	}

	public void enterEditBuildingFromRooms(String building) {
		this.buildingspage.enterEditBuildingFromRooms(building);

	}

	public void correctHint1() {
		Assert.assertThat(this.buildingspage.correctHint1(), is(true));

	}

	public void notFillInformation() {
		this.buildingspage.notFillInformation();

	}

	public void nextStep() {
		this.buildingspage.nextStep();

	}

	public void correctHint2() {
		Assert.assertThat(this.buildingspage.correctHint2(), is(true));

	}

	public void clearThisFloor() {
		this.buildingspage.clearThisFloor();

	}

	public void moveAFloor(String end, String begin) {
		this.buildingspage.moveAFloor(end, begin);

	}

	public void correctMovedFloor(String end) {
		Assert.assertThat(this.buildingspage.movedFloor(end), is(true));

	}

}
