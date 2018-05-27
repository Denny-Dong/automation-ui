package com.souban.bdd.flows.CreamsAPP;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.souban.bdd.pages.CreamsAPP.CreamsAPPCustomerManagementPage;
import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

public class CreamsAPPCustomerManagementFlow {
	private CreamsAPPCustomerManagementPage creamsAPPCustomerManagementPage = null;

	public CreamsAPPCustomerManagementFlow(final Driver driver) {
		this.creamsAPPCustomerManagementPage = PageFactory.getPage(CreamsAPPCustomerManagementPage.class, driver);
	}

	/**
	 * 新建客户
	 */
	//切换到客户管理列表
	public void clickCustomterManager() {
		this.creamsAPPCustomerManagementPage.clickCustomterManager();
	}

	//客户管理的添加按钮
	public void clickAddCustomer(){
		this.creamsAPPCustomerManagementPage.clickAddCustomer();
	}

	//进入新建客户页
	public void intoNewCustomerPage(){
		Assert.assertThat(this.creamsAPPCustomerManagementPage.intoNewCustomerPage(),is(true));
	}

	//输入租客姓名
	public void inputName(String name) {
		this.creamsAPPCustomerManagementPage.inputName(name);
	}

	//选择行业
	public void selectIndustry(String industry) {
		this.creamsAPPCustomerManagementPage.selectIndustry(industry);
	}

	//点击租客联系人显示框
	public void clickContact() {
		this.creamsAPPCustomerManagementPage.clickContact();
	}

	//在搜索框中输入租客联系人姓名
	public void inputContactName(String contactName) {
		this.creamsAPPCustomerManagementPage.inputContactName(contactName);
	}

	//选择租客联系人
	public void selectContact(String nameAndCompany) {
		this.creamsAPPCustomerManagementPage.selectContact(nameAndCompany);
	}
	//ios
	//点击租客联系人搜索页的保存按钮
	public void clickContactSaveButton() {
		this.creamsAPPCustomerManagementPage.clickContactSaveButton();
	}

	//点击预计签约时间
	public void clickExpectDate() {
		this.creamsAPPCustomerManagementPage.clickExpectDate();
	}

	//选择预计签约时间
	public void selectExpectDate() {
		this.creamsAPPCustomerManagementPage.selectExpectDate();
	}

	//填写最小需求面积
	public void inputMinDemandSize(String minDemandSize) {
		this.creamsAPPCustomerManagementPage.inputMinDemandSize(minDemandSize);
	}

	//填写最大需求面积
	public void inputMaxDemandSize(String maxDemandSize) {
		this.creamsAPPCustomerManagementPage.inputMaxDemandSize(maxDemandSize);
	}

	//点击来访时间
	public void clickVisitingTime() {
		this.creamsAPPCustomerManagementPage.clickVisitingTime();
	}

	//选择来访时间
	public void selectDate(String year, String month, String day) {
		this.creamsAPPCustomerManagementPage.selectDate(year, month, day);
	}

	//选择租客状态
	public void selectStatus(String status) {
		this.creamsAPPCustomerManagementPage.selectStatus(status);
	}

	//选择来访渠道
	public void selectChannelType(String channelType) {
		this.creamsAPPCustomerManagementPage.selectChannelType(channelType);
	}

	//点击渠道联系人显示框
	public void clickAgent() {
		this.creamsAPPCustomerManagementPage.clickAgent();
	}

	//在输入框中输入渠道联系人关键词
	public void inputAgentName(String agentName) {
		this.creamsAPPCustomerManagementPage.inputAgentName(agentName);
	}

	//选择渠道联系人
	public void selectAgent(String agentName) {
		this.creamsAPPCustomerManagementPage.selectAgent(agentName);
	}
	//ios
	//点击渠道联系人搜索页的保存按钮
	public void clickChannelSaveButton(){
		this.creamsAPPCustomerManagementPage.clickChannelSaveButton();
	}

	//填写备注
	public void inputNote(String note) {
		this.creamsAPPCustomerManagementPage.inputNote(note);
	}

	//点击选择房源
	public void clickRoom() {
		this.creamsAPPCustomerManagementPage.clickRoom();
	}

	//选择楼盘
	public void selectBuilding(String buildingName) {
		this.creamsAPPCustomerManagementPage.selectBuilding(buildingName);
	}

	//点击选择楼盘的保存按钮
	public void clickBuildSaveButton() {
		this.creamsAPPCustomerManagementPage.clickBuildSaveButton();
	}

	//点击显示更多按钮
	public void clickDisplayMoreButton() {
		this.creamsAPPCustomerManagementPage.clickDisplayMoreButton();
	}

	//点击城市/区域/商圈显示框
	public void clickLocation() {
		this.creamsAPPCustomerManagementPage.clickLocation();
	}

	//搜索商圈
	public void inputLocation(String location) {
		this.creamsAPPCustomerManagementPage.inputLocation(location);
	}

	//选择商圈
	public void selectLocation(String location) {
		this.creamsAPPCustomerManagementPage.selectLocation(location);
	}

	//点击确定按钮
	public void clickSureButton() {
		this.creamsAPPCustomerManagementPage.clickSureButton();
	}

	//填写最小期望价格
	public void inputMinPrice(String minPrice) {
		this.creamsAPPCustomerManagementPage.inputMinPrice(minPrice);
	}

	//填写最大期望价格
	public void inputMaxPrice(String maxPrice) {
		this.creamsAPPCustomerManagementPage.inputMaxPrice(maxPrice);
	}

	//修改期望价格单位
	public void modifyExpectPriceUnit(String expectPriceUnit) {
		this.creamsAPPCustomerManagementPage.modifyExpectPriceUnit(expectPriceUnit);
	}

	//当前地址
	public void inputCurLocation(String curLocation) {
		this.creamsAPPCustomerManagementPage.inputCurLocation(curLocation);
	}

	//点击当前合同到期日显示框
	public void clickExporeDate() {
		this.creamsAPPCustomerManagementPage.clickExporeDate();
	}

	//选择合同日期
	public void selectExporeDate() {
		this.creamsAPPCustomerManagementPage.selectExporeDate();
	}

	//填写当前面积
	public void inputCurSize(String curSize) {
		this.creamsAPPCustomerManagementPage.inputCurSize(curSize);
	}

	//填写当前租金
	public void inputCurPrice(String curPrice) {
		this.creamsAPPCustomerManagementPage.inputCurPrice(curPrice);
	}

	//点击新建客户页的保存按钮
	public void clickNewSavebutton() {
		this.creamsAPPCustomerManagementPage.clickNewSavebutton();
	}

	//断言是否新建成功
	public void checkNewContactSuccessful(String name) {
		Assert.assertThat(this.creamsAPPCustomerManagementPage.checkNewContact(name), is(true));
	}

	//检查客户信息----填写所有信息
	public void checkData(String name, String status, String consultant, String VisitingTime, String demandArea,
			String channelType, String house, String note) {
		String info = this.creamsAPPCustomerManagementPage.checkData(name);
		String[] actualInfo = info.split(",");
		Assert.assertThat(actualInfo[0], is(status));
		Assert.assertThat(actualInfo[1], is(consultant));
		Assert.assertThat(actualInfo[2], is(VisitingTime));
		Assert.assertThat(actualInfo[3], is(demandArea));
		Assert.assertThat(actualInfo[4], is(channelType));
		Assert.assertThat(actualInfo[5], is(house));
		Assert.assertThat(actualInfo[6], is(note));
	}



	/**
	 * 客户详情页
	 * @param name
	 */
	//进入客户详情页
	public void clickNewContact(String name) {
		this.creamsAPPCustomerManagementPage.clickNewContact(name);
	}

	//断言，成功进入客户详情页
	public void intoDetailPage() {
		Assert.assertThat(this.creamsAPPCustomerManagementPage.intoDetailPage(), is(true));
		System.out.println("成功进入客户详情页！！！");
	}

	//核对客户概要数据
	public void checkBasicInformation(String name, String percent, String status, String areaSize, String consultant) {
		String info = this.creamsAPPCustomerManagementPage.checkBasicInformation();
		String[] actualInfo = info.split(",");
		Assert.assertThat(actualInfo[0], is(name));
		Assert.assertThat(actualInfo[1], is(percent));
		Assert.assertThat(actualInfo[2], is(status));
		Assert.assertThat(actualInfo[3], is(areaSize));
		Assert.assertThat(actualInfo[4], is(consultant));
	}

	//android
	//核对客户租客信息
	public void checkContactInformationForAndroid(String name, String demandAreaSize, String status, String channelType,
			String industry, String content, String location) {
		String info = this.creamsAPPCustomerManagementPage.checkContactInformation();
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String expectTime = sdf.format(new Date());
		String visitTime = sdf.format(new Date());
		Assert.assertThat(actualInfo[0], is(name));
		Assert.assertThat(actualInfo[1], is(demandAreaSize));
		Assert.assertThat(actualInfo[2], is(status));
		Assert.assertThat(actualInfo[3], is(channelType));
		Assert.assertThat(actualInfo[4], is(industry));
		Assert.assertThat(actualInfo[5], is(expectTime));
		Assert.assertThat(actualInfo[6], is(visitTime));
		Assert.assertThat(actualInfo[7], is(content));
		Assert.assertThat(actualInfo[8], is(location));
	}
	//ios
	//核对客户租客信息
	public void checkContactInformationForIos(String name, String demandAreaSize, String status, String channelType,
			String industry, String visitTime, String content, String location) {
		String info = this.creamsAPPCustomerManagementPage.checkContactInformationForIos();
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String expectTime = sdf.format(new Date());
		Assert.assertThat(actualInfo[0], is(name));
		Assert.assertThat(actualInfo[1], is(demandAreaSize));
		Assert.assertThat(actualInfo[2], is(status));
		Assert.assertThat(actualInfo[3], is(channelType));
		Assert.assertThat(actualInfo[4], is(industry));
		Assert.assertThat(actualInfo[5], is(expectTime));
		Assert.assertThat(actualInfo[6], is(visitTime));
		Assert.assertThat(actualInfo[7], is(content));
		Assert.assertThat(actualInfo[8], is(location));
	}

	//核对房源信息
	public void checkHouseInformation(String houseName) {
		Assert.assertThat(this.creamsAPPCustomerManagementPage.checkHouseInformation(), is(houseName));
		System.out.println("客户的房源信息显示正确！！！");
	}

	//android
	//核对租客当前信息
	public void checkCurrentInformation_android(String address, String areaSize, String rent, String expectPrice) {
		String info = this.creamsAPPCustomerManagementPage.checkCurrentInformation();
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentTime = sdf.format(new Date());
		Assert.assertThat(actualInfo[0], is(address));
		Assert.assertThat(actualInfo[1], is(areaSize));
		Assert.assertThat(actualInfo[2], is(rent));
		Assert.assertThat(actualInfo[3], is(currentTime));
		Assert.assertThat(actualInfo[4], is(expectPrice));
		System.out.println("租客当前信息显示正确！！！");
	}

	//ios
	//核对租客当前信息
	public void checkCurrentInformation_ios(String address, String areaSize, String rent, String expectPrice) {
		String info = this.creamsAPPCustomerManagementPage.checkCurrentInformation();
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String currentTime = sdf.format(new Date());
		Assert.assertThat(actualInfo[0], is(address));
		Assert.assertThat(actualInfo[1], is(areaSize));
		Assert.assertThat(actualInfo[2], is(rent));
		Assert.assertThat(actualInfo[3], is(currentTime));
		Assert.assertThat(actualInfo[4], is(expectPrice));
		System.out.println("租客当前信息显示正确！！！");
	}

	//核对备注
	public void checkNoteInformation(String name, String content) {
		String info = this.creamsAPPCustomerManagementPage.checkNoteInformation();
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String noteTime = sdf.format(new Date());
		Assert.assertThat(actualInfo[0], is(name));
		Assert.assertThat(actualInfo[1], is(noteTime));
		Assert.assertThat(actualInfo[2], is(content));
		System.out.println("备注信息显示正确");
	}



	/**
	 * 查看操作记录
	 */
	//点击客户详情页的操作按钮
	public void clickMoreButton() {
		this.creamsAPPCustomerManagementPage.clickMoreButton();
	}

	// 击操作记录
	public void clickOperateLog() {
		this.creamsAPPCustomerManagementPage.clickOperateLog();
	}

	//断言---进入操作记录页
	public void intoOperateLogPage() {
		this.creamsAPPCustomerManagementPage.intoOperateLogPage();
	}

	//核对操作记录内容
	public void checkLog(String name, String content) {
		String info = this.creamsAPPCustomerManagementPage.checkLog(name, content);
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String logDate = sdf.format(new Date());
		assertThat(actualInfo[0], is(name));
		assertThat(actualInfo[1], is(logDate));
		assertThat(actualInfo[2], is(content));
	}

	//点击返回按钮返回到客户详情页
	public void backToCustomerDetailPage() {
		this.creamsAPPCustomerManagementPage.backToCustomerDetailPage();
	}



	/**
	 * 查看备注
	 */
	//common
	//点击备注
	public void clickRemark() {
		this.creamsAPPCustomerManagementPage.clickRemark();
	}
	//common
	//进入备注列表页
	public void intoRemarkPage() {
		Assert.assertThat(this.creamsAPPCustomerManagementPage.intoRemarkPage(),is(true));
	}
	//common
	//核对是否存在一条备注
	public void checkRemark(String name){
		this.creamsAPPCustomerManagementPage.checkRemark(name);
		System.out.println("存在一条备注！！");
	}
	//android
	//核对本人标识和备注内容
	public void checkRemarkContentForAndroid(String name, String identity, String content) {
		String info = this.creamsAPPCustomerManagementPage.checkRemarkContentForAndroid(name);
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String remarkDate = sdf.format(new Date());
		System.out.println(remarkDate);
		assertThat(actualInfo[0], is(identity));
		assertThat(actualInfo[1], is(remarkDate));
		assertThat(actualInfo[2], is(content));
	}
	//ios
	//备注内容
	public void checkRemarkContentForIos(String name, String content) {
		String info = this.creamsAPPCustomerManagementPage.checkRemarkContentForIos(name);
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String remarkDate = sdf.format(new Date());
		assertThat(actualInfo[0], is(remarkDate));
		assertThat(actualInfo[1], is(content));
	}



	/**
	 * 搜索客户
	 */
	//点击客户列表顶部的搜索框
	public void clickCustomerManagerSearch() {
		this.creamsAPPCustomerManagementPage.clickCustomerManagerSearch();
	}
	//common
	//在搜索框内输入客户姓名
	public void inputCustomName(String customName) {
		this.creamsAPPCustomerManagementPage.inputCustomName(customName);
	}
	//common
	//断言
	public void checkSearchResult(String customName) {
		Assert.assertThat(this.creamsAPPCustomerManagementPage.checkSearchResult(customName), is(true));
	}
	//common
	//核对客户信息
	public void checkCustomInformation(String customName, String customStatus, String customContact,
									   String visitingTime, String customDemandArea, String customChannelType, String customIntentionHouse) {
		String info = this.creamsAPPCustomerManagementPage.checkCustomInformation(customName);
		String[] actualInfo = info.split(",");
		assertThat(actualInfo[0], is(customStatus));
		assertThat(actualInfo[1], is(customContact));
		assertThat(actualInfo[2], is(visitingTime));
		assertThat(actualInfo[3], is(customDemandArea));
		assertThat(actualInfo[4], is(customChannelType));
		assertThat(actualInfo[5], is(customIntentionHouse));
	}





	/**
	 * 新增备注
	 */
	//点击客户搜索页的客户进入详情页
	public void clickSearchCustom(String customName) {
		this.creamsAPPCustomerManagementPage.clickSearchCustom(customName);
	}

	//点击新增按钮
	public void clickRemarkNew() {
		this.creamsAPPCustomerManagementPage.clickRemarkNew();
	}

	//进入新增备注页
	public void intoRemarkNewPage(){
		Assert.assertThat(this.creamsAPPCustomerManagementPage.intoRemarkNewPage(),is(true));
	}

	//填写备注内容
	public void inputRemarkContent(String content) {
		this.creamsAPPCustomerManagementPage.inputRemarkContent(content);
	}

	//保存备注
	public void clickRemarkSave() {
		this.creamsAPPCustomerManagementPage.clickRemarkSave();
	}

	//断言-----备注新增成功
	public void checkRemarkNewSuccessful(String name,String content) {
		assertThat(this.creamsAPPCustomerManagementPage.checkRemarkEditOrDeleteOrNew(name, content), is(true));
	}



	/**
	 * 编辑备注
	 * @param name
	 */

	//选择一条备注，点击该备注的更多按钮
	public void clickRemarkMoreButton(String name) {
		this.creamsAPPCustomerManagementPage.clickRemarkMoreButton(name);
	}

	//点击编辑按钮
	public void clickRemarkEdit() {
		this.creamsAPPCustomerManagementPage.clickRemarkEdit();
	}

	//进入编辑备注页
	public void intoRemarkEditPage(){
		Assert.assertThat(this.creamsAPPCustomerManagementPage.intoRemarkEditPage(),is(true));
	}

	//断言---备注是否修改成功
	public void checkRemarkEditSuccessful(String name,String content) {
		assertThat(this.creamsAPPCustomerManagementPage.checkRemarkEditOrDeleteOrNew(name, content), is(true));
	}


	/**
	 * 删除备注
	 */
	//点击删除按钮
	public void clickRemarkDelete() {
		this.creamsAPPCustomerManagementPage.clickRemarkDelete();
	}

	//进入确定要删除该条备注吗？页面
	public void intpRemarkDeletePage(){
		Assert.assertThat(this.creamsAPPCustomerManagementPage.intpRemarkDeletePage(),is(true));
	}

	//点击取消删除按钮
	public void clickCancelRemarkDelete() {
		this.creamsAPPCustomerManagementPage.clickCancelRemarkDelete();
	}

	//点击确定删除按钮
	public void clickSureReamrkDelete() {
		this.creamsAPPCustomerManagementPage.clickSureReamrkDelete();
	}

	//断言----备注删除失败
	public void checkRemarkDeleteFail(String name, String content) {
		assertThat(this.creamsAPPCustomerManagementPage.checkRemarkEditOrDeleteOrNew(name, content), is(true));
	}

	//断言----备注删除成功
	public void checkRemarkDeleteSuccessful(String name, String content) {
		assertThat(this.creamsAPPCustomerManagementPage.checkRemarkEditOrDeleteOrNew(name, content), is(false));
	}



	/**
	 * 编辑客户
	 */
	//点击备注列表页的返回按钮返回到客户详情页
	public void clickBackButton() {
		this.creamsAPPCustomerManagementPage.clickBackButton();
	}
	//common
	//点击客户详情页更多按钮中的编辑按钮
	public void clickEditButton() {
		this.creamsAPPCustomerManagementPage.clickEditButton();
	}
	//common
	//进入编辑客户页
	public void intoEditPage() {
		Assert.assertThat(this.creamsAPPCustomerManagementPage.intoEditPage(), is(true));
	}
	//common
	//核对租客姓名的内容
	public void checkName(String name) {
		Assert.assertThat(this.creamsAPPCustomerManagementPage.checkName(), is(name));
	}
	//common
	//修改租客姓名
	public void modifyName(String name) {
		this.creamsAPPCustomerManagementPage.modifyName(name);
	}
	//common
	//点击保存按钮
	public void clickEditSave() {
		this.creamsAPPCustomerManagementPage.clickEditSave();
	}
	//common
	//核对租客姓名是否编辑成功
	public void EditNameSuccessful(String name) {
		Assert.assertThat(this.creamsAPPCustomerManagementPage.checkEditName(), is(name));
	}




	/**
	 * 快捷筛选(通过来访时间)
	 */

	//选择快捷筛选条件
	public void selectConditions(String condition){
		this.creamsAPPCustomerManagementPage.selectConditions(condition);
	}

	//检查列表中的记录是否符合
	public void checkAllVisitTime(String visitTime){
		List<String> allVisitTime = new ArrayList<String>();
		allVisitTime = this.creamsAPPCustomerManagementPage.checkAllVisitTime();
		for(String str:allVisitTime){
			Assert.assertThat(str,is(visitTime));
		}
	}




	/**
	 * 客户状态
	 */

	//选择客户状态
	public void selectCustomStatus(String customStatus){
		this.creamsAPPCustomerManagementPage.selectCustomStatus(customStatus);
	}

	public void checkAllCustomStatus(String customStatus){
		List<String> allCustomStatus = new ArrayList<String>();
		allCustomStatus = creamsAPPCustomerManagementPage.checkAllCustomStatus();
		for(String str:allCustomStatus){
			Assert.assertThat(str,is(customStatus));
		}
	}



	/**
	 * 通过渠道类型筛选
	 */
	//点击筛选按钮
	public void clickFilterButton(){
		this.creamsAPPCustomerManagementPage.clickFilterButton();
	}

	//进入筛选页
	public void intoFilterPage(){
		Assert.assertThat(this.creamsAPPCustomerManagementPage.intoFilterPage(),is(true));
	}

	//选择渠道类型
	public void filterChannelType(String channelType){
		this.creamsAPPCustomerManagementPage.filterChannelType(channelType);
	}

	//点击客户管理筛选页的确定按钮
	public void clickConfirm(){
		this.creamsAPPCustomerManagementPage.clickConfirm();
	}

	//检查列表中的记录是否符合
	public void checkAllChannerType(String channerType){
		List<String> allChannelType = new ArrayList<String>();
		allChannelType = creamsAPPCustomerManagementPage.checkAllChannerType();
		for(String str:allChannelType){
			Assert.assertThat(str,is(channerType));
		}
	}
}
