package com.souban.bdd.pages.CreamsWebPage.Building;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class BuildingListPage extends ParentPage {
	public BuildingListPage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_CeateBuilding = new UIElement("xpath=//*[@class='createBtn___3xaLk' and text()='新建集合']");
	private UIElement TXT_TitleInput = new UIElement(
			"xpath=//*[@placeholder='请输入集合名称' and @class='titleInput___3qse5']");
	private UIElement BTN_Save = new UIElement(
			"xpath=//*[@placeholder='请输入集合名称' and @class='titleInput___3qse5']/parent::div[@class='title___kU4PB']/following-sibling::button");
	private UIElement BTN_PleaseInputname = new UIElement(
			"xpath=//*[@class='souban-message-body___3ZZ6Y']/child::span[text()='请输入集合名称']");
	private UIElement BTN_SureMessage1 = new UIElement("xpath=//*[text()='确认']");
	private UIElement BNT_PleaseChoosebuild = new UIElement(
			"xpath=//*[@class='souban-message-body___3ZZ6Y'and text()='请选择楼盘']");
	private UIElement BTN_SureMessage2 = new UIElement(
			"xpath=//*[text()='请选择楼盘'/@class='souban-message-btn___3-PDE confirm___y3TML']");
	private UIElement BNT_BuildingInformation = new UIElement("xpath=//*[@class='title___3a0pk'and text()='测试楼']");
	private UIElement BTN_BuildingInformation1 = new UIElement(
			"xpath=//*[@class='title___3a0pk'and text()='test测试楼1']");
	private UIElement BNT_CheckBoxRechoose = new UIElement(
			"xpath=//*[@class='creamsicon dropDownIcon___3yMJi active___1PwD0']/following-sibling::div/div[3]/span");
	private UIElement BNT_CheckInformationAfterFix = new UIElement(
			"xpath=//*[@class='title___eyLZ5' and text()='城西城西1-1']");

	public UIElement clickCheckBox(String building) {
		return new UIElement("xpath=//*[@placeholder='请输入集合名称']"
				+ "/parent::div/following-sibling::div/child::span[text()='" + building + "']");
	}

	public UIElement checkBuildingList(String collectionname) {
		return new UIElement("xpath=//*[@class='title___kU4PB' and text()='" + collectionname + "']");
	}

	public UIElement chooseOneBuilding(String building1) {
		return new UIElement("xpath=//*[@class='title___1pxg0' and text()='" + building1 + "']");
	}

	public UIElement chooseTwoBuilding(String building2) {
		return new UIElement("xpath=//*[@class='title___1pxg0' and text()='" + building2 + "']");
	}

	public UIElement selectOneCollection(String collectionname) {
		return new UIElement("xpath=//*[@class='title___kU4PB' and text()='" + collectionname + "']");
	}

	public UIElement expandCollection(String collectionname) {
		return new UIElement(
				"xpath=//*[@class='title___kU4PB' and text()='" + collectionname + "' ]/following-sibling::i");
	}

	public UIElement saveAfterFix(String newcollectionname) {
		return new UIElement("xpath=//*[@class='titleInput___3qse5' and @value='" + newcollectionname + "']");
	}

	public UIElement rechooseBuilding(String collectionname, String rechoosebuilding) {
		return new UIElement("xpath=//*[@class='titleInput___3qse5' and @value='" + collectionname
				+ "']/parent::div/following-sibling::div/span[text()='" + rechoosebuilding + "']");
	}

	public UIElement buttonOfDelete(String collectionname) {
		return new UIElement("xpath=//*[@class='titleInput___3qse5' and @value='" + collectionname
				+ "']/parent::div/parent::div/preceding-sibling::i[@class='creamsicon closeIcon___3Bqdo']");
	}

	public UIElement chooseCollectionName(String collectionname) {
		return new UIElement("xpath=//*[@class='titleInput___3qse5' and @value='" + collectionname + "']");
	}

	// 新建集合
	public void rebuildingNewCollection(String collectionname) {
		this.driver.click(BTN_CeateBuilding);
		this.driver.click(TXT_TitleInput);
		this.driver.elementSendText(TXT_TitleInput, collectionname);
	}

	public void clickBuildingCheckbox(String building1, String building2) {
		this.driver.click(clickCheckBox(building1));
		this.driver.click(clickCheckBox(building2));
	}

	public void clickSaveButton() {
		this.driver.sleep(1000);
		this.driver.click(BTN_Save);
	}

	public boolean checkBuildingListName(String collection) {
		return this.driver.isElementFound(checkBuildingList(collection));
	}

	// 不输入集合名称
	public void clickNewCollection() {
		this.driver.click(BTN_CeateBuilding);
	}

	public boolean pleaseInputCollectionName() {
		return this.driver.isElementFound(BTN_PleaseInputname);
	}

	public void clickSureMessage1() {
		this.driver.click(BTN_SureMessage1);

	}

	// 不选择楼盘
	public boolean pleaseChooseBuildings() {
		return this.driver.isElementFound(BNT_PleaseChoosebuild);
	}

	public void clickSureMessage2() {
		this.driver.click(BTN_SureMessage2);
	}

	// 选择一个或多个楼宇
	public void clickBuilding1(String building1) {
		this.driver.click(chooseOneBuilding(building1));
	}

	public boolean clickOneBuilding() {
		return this.driver.isElementFound(BNT_BuildingInformation);
	}

	public void clickBuilding2(String building2) {
		this.driver.click(chooseTwoBuilding(building2));
	}

	public boolean clickTwoBuilding() {
		return this.driver.isElementFound(BTN_BuildingInformation1);
	}

	// 选择集合
	public void chooseOneCollection(String collectionname) {
		this.driver.click(selectOneCollection(collectionname));
	}

	public boolean checkCollectionInformation() {
		return this.driver.isElementFound(BNT_BuildingInformation);
	}

	// 修改集合
	public void changeCollectionInformation(String collectionname, String rechoosebuilding, String newcollectionname) {
		this.driver.click(expandCollection(collectionname));
		this.driver.click(chooseCollectionName(collectionname));
		this.driver.elementClearText(chooseCollectionName(collectionname));
		this.driver.elementSendText(chooseCollectionName(collectionname), newcollectionname);
	}

	public void saveAfterFixInformation(String newcollectionname) {
		this.driver.click(saveAfterFix(newcollectionname));
	}

	public boolean checkInformtionAfterFix() {
		return this.driver.isElementFound(BNT_CheckInformationAfterFix);
	}

	// 删除集合
	public void deleteCollection(String collectionname) {
		this.driver.click(expandCollection(collectionname));
		this.driver.waitForElement(chooseCollectionName(collectionname), 10);
		this.driver.click(chooseCollectionName(collectionname));
		this.driver.waitForElement(buttonOfDelete(collectionname), 10);
		this.driver.click(buttonOfDelete(collectionname));
	}

	public boolean checkDeleteInformation(String collectionname) {
		return this.driver.isElementFound(chooseCollectionName(collectionname));
	}

	public void chooseBuildings(String building1, String building2) {
		this.driver.click(this.chooseOneBuilding(building1));
		this.driver.click(this.chooseTwoBuilding(building2));
		this.driver.sleep(1000);

	}

}
