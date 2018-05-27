package com.souban.bdd.flows.CreamsWebFlow.Building;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Building.BuildingListPage;

public class BuildingListFlow {

	private BuildingListPage buildlistpage = null;

	public BuildingListFlow(Driver driver) {
		this.buildlistpage = PageFactory.getPage(BuildingListPage.class, driver);
	}

	// 新建集合
	public void rebuildingNewCollection(String collectionname) {
		this.buildlistpage.rebuildingNewCollection(collectionname);
	}

	public void clickBuildingCheckbox(String building1, String building2) {
		this.buildlistpage.clickBuildingCheckbox(building1, building2);
	}

	public void clickSaveButton() {
		this.buildlistpage.clickSaveButton();
	}

	public void checkBuildingListName(String collection) {
		Assert.assertThat(this.buildlistpage.checkBuildingListName(collection), is(true));
	}

	// 不输入集合名称
	public void clickNewCollection() {
		this.buildlistpage.clickNewCollection();
	}

	public void pleaseInputCollectionName() {
		Assert.assertThat(this.buildlistpage.pleaseInputCollectionName(), is(true));
	}

	public void clickSureMessage1() {
		this.buildlistpage.clickSureMessage1();
	}

	// 不选择楼盘
	public void pleaseChooseBuildings() {
		Assert.assertThat(this.buildlistpage.pleaseChooseBuildings(), is(true));
	}

	public void clickSureMessage2() {
		this.buildlistpage.clickSureMessage2();
	}

	// 选择一个或多个楼宇
	public void clickBuilding1(String building1) {
		this.buildlistpage.clickBuilding1(building1);
	}

	public void clickOneBuilding() {
		Assert.assertThat(this.buildlistpage.clickOneBuilding(), is(true));
	}

	public void clickBuilding2(String building2) {
		this.buildlistpage.clickBuilding2(building2);
	}

	public void clickTwoBuilding() {
		Assert.assertThat(this.buildlistpage.clickTwoBuilding(), is(true));
	}

	// 选择集合
	public void chooseOneCollection(String collectionname) {
		this.buildlistpage.chooseOneCollection(collectionname);
	}

	public void checkCollectionInformation1() {
		Assert.assertThat(this.buildlistpage.checkCollectionInformation(), is(true));
	}

	// 修改集合
	public void changeCollectionInformation(String rename, String rechoosebuilding, String newcollectionname) {
		this.buildlistpage.changeCollectionInformation(rename, rechoosebuilding, newcollectionname);
	}

	public void saveAfterFixInformation(String newcollectionname) {
		this.buildlistpage.saveAfterFixInformation(newcollectionname);
	}

	public void checkInformtionAfterFix() {
		Assert.assertThat(this.buildlistpage.checkInformtionAfterFix(), is(true));
	}

	// 删除集合
	public void deleteCollection(String collectionname) {
		this.buildlistpage.deleteCollection(collectionname);
	}

	public void checkdeleteinformation(String collectionname) {
		Assert.assertThat(this.buildlistpage.checkDeleteInformation(collectionname), is(false));
	}

	public void chooseBuildings(String building1, String building2) {
		this.buildlistpage.chooseBuildings(building1, building2);

	}

}
