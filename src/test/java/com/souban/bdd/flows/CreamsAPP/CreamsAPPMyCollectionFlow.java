package com.souban.bdd.flows.CreamsAPP;

import static org.hamcrest.core.Is.is;

import com.souban.bdd.pages.CreamsAPP.CreamsAPPMyCollectionPage;
import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

public class CreamsAPPMyCollectionFlow {

	private CreamsAPPMyCollectionPage creamsAPPMyCollectionPage = null;

	public CreamsAPPMyCollectionFlow(final Driver driver) {
		this.creamsAPPMyCollectionPage = PageFactory.getPage(CreamsAPPMyCollectionPage.class, driver);
	}

	/**
	 * 新建集合
	 */
	//common
	//点击我的查询
	public void clickMyQuery() {
		this.creamsAPPMyCollectionPage.clickMyQuery();
	}

	//common
	//断言-----进入我的查询列表
	public void intoMyQueryPage() {
		Assert.assertThat(this.creamsAPPMyCollectionPage.intoMyQueryPage(), is(true));
		System.out.println("进入我的查询列表成功！！！");
	}

	//common
	//点击新建查询按钮
	public void clickNewQueryButton() {
		this.creamsAPPMyCollectionPage.clickNewQueryButton();
	}

	//common
	//断言-----进入选择楼宇页
	public void intoSelectBuild() {
		Assert.assertThat(this.creamsAPPMyCollectionPage.intoSelectBuild(), is(true));
		System.out.println("进入选择楼宇页成功！！！！");
	}

	//common
	//选择单个楼宇
	public void selectBuilding(String buildingName) {
		this.creamsAPPMyCollectionPage.selectBuilding(buildingName);
	}

	//common
	//选择多个楼宇
	public void selectMoreBuilding(String buildingName1, String buildingName2, String buildingName3) {
		this.creamsAPPMyCollectionPage.selectMoreBuilding(buildingName1,buildingName2,buildingName3);
	}

	//common
	//点击完成按钮
	public void clickCompleteButton() {
		this.creamsAPPMyCollectionPage.clickCompleteButton();
	}

	//common
	//点击取消按钮
	public void clickNavigationButton() {
		this.creamsAPPMyCollectionPage.clickNavigationButton();
	}

	//common
	//断言-----进入请输入分组名称页
	public void intoInputQueryNamePage() {
		Assert.assertThat(this.creamsAPPMyCollectionPage.intoInputQueryNamePage(), is(true));
		System.out.println("进入请输入分组名称页成功！！！！");
	}

	//common
	//输入分组名称
	public void inputQueryName(String queryName) {
		this.creamsAPPMyCollectionPage.inputQueryName(queryName);
	}

	//common
	//点击确定按钮
	public void clickConfirmButton() {
		this.creamsAPPMyCollectionPage.clickConfirmButton();
	}

	//common
	//断言----新建查询成功
	public void newMyQuerySuccessful(String queryName) {
		Assert.assertThat(this.creamsAPPMyCollectionPage.checkMyQuery(queryName), is(true));
		System.out.println("查询新建成功！！！！");
	}
	//android
	//断言，获取楼盘数
	public void checkBuildCountForAndroid(String queryName, String count) {
		Assert.assertThat(this.creamsAPPMyCollectionPage.checkBUildCountForAndroid(queryName), is(count));
		System.out.println("楼盘数量正确！！！！");
	}

	//ios
	//断言，获取楼盘数
	public void checkBuildCountForIos(String count) {
		Assert.assertThat(this.creamsAPPMyCollectionPage.checkBuildCountForIos(), is(count));
		System.out.println("楼盘数量正确！！！！");
	}

	/**
	 * 删除集合
	 * @param queryName 集合名称
	 */

	//amdroid
	//长按我的查询
	public void longPress(String queryName) {
		this.creamsAPPMyCollectionPage.longPress(queryName);
	}

	//ios
	//长按并且左滑我的查询
	public void swipeleft(String queryName) {
		this.creamsAPPMyCollectionPage.swipeleft(queryName);
	}

	//common
	//断言----是否进入确定删除页
	public void intoDeletePage() {
		Assert.assertThat(this.creamsAPPMyCollectionPage.intoDeletePage(), is(true));
		System.out.println("进入确定删除页");
	}

	//common
	//点击确定删除按钮
	public void clickDeleteButton() {
		this.creamsAPPMyCollectionPage.clickDeleteButton();
	}

	//common
	//点击取消删除按钮
	public void clickCancelDeleteButton() {
		this.creamsAPPMyCollectionPage.clickCancelDeleteButton();
	}

	//common
	//删除成功
	public void deleteMyQuerySuccessful(String queryName) {
		Assert.assertThat(this.creamsAPPMyCollectionPage.checkMyQuery(queryName), is(false));
		System.out.println("删除我的查询成功");
	}
	//common
	//回到我的主页
	public void backToMyPage() {
		this.creamsAPPMyCollectionPage.backToMyPage();
	}
}
