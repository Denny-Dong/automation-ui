package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPCustomerManagementStep extends BaseStep{
	/**
	 * 新建客户
	 * @throws Throwable
	 */
	//点击客户管理进入客户管理列表
	@Given("^点击客户管理进入客户管理列表$")
	public void 点击客户管理进入客户管理列表() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickCustomterManager();
	}

	//点击右上角的添加按钮
	@When("^点击客户管理右上角的添加按钮$")
	public void 点击客户管理右上角的添加按钮() throws Throwable {
		this.creamsAPPCustomerManagementFlow.clickAddCustomer();
		this.creamsAPPCustomerManagementFlow.intoNewCustomerPage();
	}


	//填写租客姓名
	@When("^填写租客姓名 \"([^\"]*)\"$")
	public void 填写租客姓名(String name) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputName(name);
	}

	//选择行业
	@When("^选择行业 \"([^\"]*)\"$")
	public void 选择行业(String industry) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.selectIndustry(industry);
	}

	//点击租客联系人显示框进入租客联系人搜索框
	@When("^点击租客联系人显示框进入租客联系人搜索框页$")
	public void 点击租客联系人显示框进入租客联系人搜索框页() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickContact();
	}

	//在搜索框中输入租客联系人姓名
	@When("^在搜索框中输入租客联系人姓名 \"([^\"]*)\"$")
	public void 在搜索框中输入租客联系人姓名(String contactName) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputContactName(contactName);
	}

	//点击结果显示列表中的租客联系人
	@When("^点击结果显示列表中的租客联系人为 \"([^\"]*)\"的租客$")
	public void 点击结果显示列表中的租客联系人为_的租客(String nameAndCompany) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.selectContact(nameAndCompany);
	}

	//ios
	//点击租客联系人搜索页的保存按钮
	@When("^点击租客联系人搜索页面的保存按钮$")
	public void 点击租客联系人搜索页面的保存按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickContactSaveButton();
	}

	//选择预计签约时间
	@When("^选择预计签约时间为今日$")
	public void 选择预计签约时间为今日() throws Throwable {
		this.creamsAPPCustomerManagementFlow.clickExpectDate();
	    this.creamsAPPCustomerManagementFlow.selectExpectDate();
	}

	//填写最小需求面积
	@When("^填写最小需求面积 \"([^\"]*)\"$")
	public void 填写最小需求面积(String minDemandSize) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputMinDemandSize(minDemandSize);
	}

	//填写最大需求面积
	@When("^填写最大需求面积 \"([^\"]*)\"$")
	public void 填写最大需求面积(String maxDemandSize) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputMaxDemandSize(maxDemandSize);
	}

	//填写来访时间
	@When("^填写来访时间为 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 填写来访时间为(String year, String month, String day) throws Throwable {
		this.creamsAPPCustomerManagementFlow.clickVisitingTime();
	    this.creamsAPPCustomerManagementFlow.selectDate(year, month, day);
	}

	//选择租客状态
	@When("^选择租客状态为 \"([^\"]*)\"$")
	public void 选择租客状态为(String status) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.selectStatus(status);
	}

	//选择来访渠道
	@When("^选择来访渠道为 \"([^\"]*)\"$")
	public void 选择来访渠道为(String channelType) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.selectChannelType(channelType);
	}

	//点击渠道联系人显示框进入渠道联系人搜索框页
	@When("^点击渠道联系人显示框进入渠道联系人搜索框页$")
	public void 点击渠道联系人显示框进入渠道联系人搜索框页() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickAgent();
	}

	//在搜索框中输入渠道联系人姓名
	@When("^在搜索框中输入渠道联系人姓名 \"([^\"]*)\"$")
	public void 在搜索框中输入渠道联系人姓名(String agentName) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputAgentName(agentName);
	}

	//点击结果显示列表中的渠道联系人姓名
	@When("^点击结果显示列表中的渠道联系人姓名为 \"([^\"]*)\"的渠道联系人$")
	public void 点击结果显示列表中的渠道联系人姓名为_的渠道联系人(String agentName) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.selectAgent(agentName);
	}

	//ios
	//点击渠道联系人搜索页面的保存按钮
	@When("^点击渠道联系人搜索页面的保存按钮$")
	public void 点击渠道联系人搜索页面的保存按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickChannelSaveButton();
	}

	//填写备注
	@When("^填写备注为 \"([^\"]*)\"$")
	public void 填写备注为(String note) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputNote(note);
	}

	//点击选择房源显示框进入选择楼宇页
	@When("^点击选择房源显示框进入选择楼宇页$")
	public void 点击选择房源显示框进入选择楼宇页() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickRoom();
	}

	//选择楼宇
	@When("^选择楼宇为 \"([^\"]*)\"$")
	public void 选择楼宇为(String buildingName) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.selectBuilding(buildingName);
	}

	//点击选择楼宇页面的确定按钮
	@When("^点击选择楼宇页面的确定按钮$")
	public void 点击选择楼宇页面的确定按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickBuildSaveButton();
	}

	//点击显示更多
	@When("^点击显示更多$")
	public void 点击显示更多() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickDisplayMoreButton();
	}

	//点击城市/区域/商圈显示框进入商圈搜索页
	@When("^点击城市/区域/商圈显示框进入商圈搜索页$")
	public void 点击城市_区域_商圈显示框进入商圈搜索页() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickLocation();
	}

	//输入商圈关键词
	@When("^输入商圈关键词 \"([^\"]*)\"$")
	public void 输入商圈关键词(String location) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputLocation(location);
	}

	//点击结果显示列表中的商圈
	@When("^点击结果显示列表中的商圈名称为 \"([^\"]*)\"的商圈$")
	public void 点击结果显示列表中的商圈名称为_的商圈(String location) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.selectLocation(location);
	}

	//点击商圈搜索页的确定按钮
	@When("^点击商圈搜索页的确定按钮$")
	public void 点击商圈搜索页的确定按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickSureButton();
	}

	//填写最小期望价格
	@When("^填写最小期望价格 \"([^\"]*)\"$")
	public void 填写最小期望价格(String minPrice) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputMinPrice(minPrice);
	}

	//填写最大期望价格
	@When("^填写最大期望价格 \"([^\"]*)\"$")
	public void 填写最大期望价格(String maxPrice) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputMaxPrice(maxPrice);
	}

	//选择期望价格的单位
	@When("^选择期望价格的单位 \"([^\"]*)\"$")
	public void 选择期望价格的单位(String expectPriceUnit) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.modifyExpectPriceUnit(expectPriceUnit);
	}

	//填写当前地址
	@When("^填写当前地址为 \"([^\"]*)\"$")
	public void 填写当前地址为(String curLocation) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputCurLocation(curLocation);
	}

	//选择当前合同到期日
	@When("^选择当前合同到期日为今日$")
	public void 选择当前合同到期日为今日() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickExporeDate();
	    this.creamsAPPCustomerManagementFlow.selectExporeDate();
	}

	//填写当前面积
	@When("^填写当前面积为 \"([^\"]*)\"$")
	public void 填写当前面积为(String curSize) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputCurSize(curSize);
	}

	//填写当前租金
	@When("^填写当前租金为 \"([^\"]*)\"$")
	public void 填写当前租金为(String curPrice) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.inputCurPrice(curPrice);
	}

	//点击新建客户页面上的保存按钮
	@When("^点击新建客户页面上的保存按钮$")
	public void 点击新建客户页面上的保存按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickNewSavebutton();
	}

	//断言，是否新建成功
	@Then("^客户管理列表中存在一条租客姓名为 \"([^\"]*)\"的客户，客户新建成功$")
	public void 客户管理列表中存在一条租客姓名为_的客户_客户新建成功(String name) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkNewContactSuccessful(name);
	}

	//核对客户信息
	@Then("^新建的客户信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 新建的客户信息显示正确(String name, String status, String consultant, String VisitingTime, String demandArea, String channelType, String house, String note) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkData(name, status, consultant, VisitingTime, demandArea, channelType, house, note);
	}

	
	
	/**
	 * 核对客户详情页数据
	 * @param name
	 * @throws Throwable
	 */
	@When("^点击租客姓名为 \"([^\"]*)\"的客户$")
	public void 点击租客姓名为_的客户(String name) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickNewContact(name);
	}

	@Then("^进入客户详情页$")
	public void 进入客户详情页() throws Throwable {
		this.creamsAPPCustomerManagementFlow.intoDetailPage();
	}

	@Then("^客户详情的概要信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 客户详情的概要信息显示正确(String name, String percent, String status, String areaSize, String consultant) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkBasicInformation(name, percent, status, areaSize, consultant);
	}

	//android
	@Then("^客户详情的租客信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 客户详情的租客信息显示正确(String name, String demandAreaSize, String status, String channelType, String industry, String content, String location) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkContactInformationForAndroid(name, demandAreaSize, status, channelType, industry, content, location);
	}

	//ios，由于ios driver的swipetoup方法不可用
	@Then("^ios客户详情的租客信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void ios客户详情的租客信息显示正确(String name, String demandAreaSize, String status, String channelType, String industry, String visitingTime, String content, String location) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkContactInformationForIos(name, demandAreaSize, status, channelType, industry, visitingTime, content, location);
	}

	@Then("^客户详情的房源信息显示正确 \"([^\"]*)\"$")
	public void 客户详情的房源信息显示正确(String houseName) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkHouseInformation(houseName);
	}

	//android
	@Then("^客户详情的租客当前信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 客户详情的租客当前信息显示正确(String address, String areaSize, String rent, String expectPrice) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkCurrentInformation_android(address, areaSize, rent, expectPrice);
	}

	//ios
	@Then("^ios客户详情的租客当前信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void ios客户详情的租客当前信息显示正确(String address, String areaSize, String rent, String expectPrice) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkCurrentInformation_ios(address, areaSize, rent, expectPrice);
	}

	@Then("^客户详情的备注信息显示正确 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 客户详情的备注信息显示正确(String name, String content) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkNoteInformation(name, content);
	}
	
	
	
	
	
	/**
	 * 查看操作记录内容
	 * @throws Throwable
	 */
	@When("^点击客户详情页上的操作按钮$")
	public void 点击客户详情页上的操作按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickMoreButton();
	}

	@When("^点击操作列表中的操作记录按钮$")
	public void 点击操作列表中的操作记录按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickOperateLog();
	    this.creamsAPPCustomerManagementFlow.intoOperateLogPage();
	}

	@Then("^操作记录中的内容显示正确 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 操作记录中的内容显示正确(String name, String content) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkLog(name, content);
	    this.creamsAPPCustomerManagementFlow.backToCustomerDetailPage();
	}
	
	
	
	
	
	/**
	 * 检查备注内容
	 * @throws Throwable
	 */
	@When("^点击操作列表中的备注$")
	public void 点击操作列表中的备注() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickRemark();
	    this.creamsAPPCustomerManagementFlow.intoRemarkPage();
	}

	@Then("^备注列表中存在一条备注姓名为 \"([^\"]*)\"的备注$")
	public void 备注列表中存在一条备注姓名为_的备注(String name) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkRemark(name);
	}

	//android
	@Then("^备注的内容显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 备注的内容显示正确(String name, String identity, String content) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkRemarkContentForAndroid(name, identity, content);
	}

	//ios，由于ios没有本人标识，so存在差异性
	@Then("^备注的内容显示正确 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 备注的内容显示正确(String name, String content) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkRemarkContentForIos(name, content);
	}




	/**
	 * 通过客户姓名搜索客户
	 * @throws Throwable
	 */
	@When("^点击客户管理页面顶部的搜索框进入搜索页$")
	public void 点击客户管理页面顶部的搜索框进入搜索页() throws Throwable {
		this.creamsAPPCustomerManagementFlow.clickCustomerManagerSearch();
	}

	@When("^在搜索框中输入客户姓名关键词 \"([^\"]*)\"$")
	public void 在搜索框中输入客户姓名关键词(String customName) throws Throwable {
		this.creamsAPPCustomerManagementFlow.inputCustomName(customName);
	}

	@Then("^搜索结果列表中存在一条客户姓名为 \"([^\"]*)\"的记录$")
	public void 搜索结果列表中存在一条客户姓名为_的记录(String customName) throws Throwable {
		this.creamsAPPCustomerManagementFlow.checkSearchResult(customName);
	}

	@Then("^该客户的信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 该客户的信息显示正确(String customName, String customStatus, String customContact, String visitingTime,String customDemandArea, String customChannelType, String customIntentionHouse) throws Throwable {
		this.creamsAPPCustomerManagementFlow.checkCustomInformation(customName, customStatus, customContact, visitingTime, customDemandArea, customChannelType, customIntentionHouse);
	}




	/**
	 * 新增备注
	 * @throws Throwable
	 */
	@When("^点击客户姓名为客户姓名为 \"([^\"]*)\"的记录，进入客户详情页$")
	public void 点击客户姓名为客户姓名为_的记录_进入客户详情页(String customName) throws Exception {
		this.creamsAPPCustomerManagementFlow.clickSearchCustom(customName);
	}
	@When("^点击备注列表页中的新增按钮$")
	public void 点击备注列表页中的新增按钮() throws Throwable {
		this.creamsAPPCustomerManagementFlow.clickRemarkNew();
		this.creamsAPPCustomerManagementFlow.intoRemarkNewPage();
	}

	@When("^填写备注内容为 \"([^\"]*)\"$")
	public void 填写备注内容为(String content) throws Throwable {
		this.creamsAPPCustomerManagementFlow.inputRemarkContent(content);
	}

	@When("^点击新增备注页面上的保存按钮$")
	public void 点击新增备注页面上的保存按钮() throws Throwable {
		this.creamsAPPCustomerManagementFlow.clickRemarkSave();
	}

	@Then("^备注列表中存在一条 \"([^\"]*)\" \"([^\"]*)\"的备注，备注新增成功$")
	public void 备注列表中存在一条_的备注_备注新增成功(String name, String content) throws Throwable {
		this.creamsAPPCustomerManagementFlow.checkRemarkNewSuccessful(name, content);
	}



	
	/**
	 * 编辑备注
	 * @param name
	 * @throws Throwable
	 */
	@When("^点击该条备注右边的操作按钮 \"([^\"]*)\"$")
	public void 点击该条备注右边的操作按钮(String name) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickRemarkMoreButton(name);
	}

	@When("^点击编辑按钮$")
	public void 点击编辑按钮() throws Throwable {
	     this.creamsAPPCustomerManagementFlow.clickRemarkEdit();
	     this.creamsAPPCustomerManagementFlow.intoRemarkEditPage();
	}

	@When("^点击编辑备注页面上的保存按钮$")
	public void 点击编辑备注页面上的保存按钮() throws Throwable {
		this.creamsAPPCustomerManagementFlow.clickRemarkSave();
	}

	@Then("^备注列表中存在一条 \"([^\"]*)\" \"([^\"]*)\"的备注，备注修改成功$")
	public void 备注列表中存在一条_的备注_备注修改成功(String name, String content) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkRemarkEditSuccessful(name, content);
	}
	
	
	
	
	
	/**
	 * 删除备注
	 * @throws Throwable
	 */
	@When("^点击删除按钮$")
	public void 点击删除按钮() throws Throwable {
	   this.creamsAPPCustomerManagementFlow.clickRemarkDelete();
	   this.creamsAPPCustomerManagementFlow.intpRemarkDeletePage();
	}

	@When("^点击确定要删除该条备注吗的取消按钮$")
	public void 点击确定要删除该条备注吗的取消按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickCancelRemarkDelete();
	}

	@Then("^备注列表中存在一条 \"([^\"]*)\" \"([^\"]*)\"的备注，备注删除失败$")
	public void 备注列表中存在一条_的备注_备注删除失败(String name, String content) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkRemarkDeleteFail(name, content);
	}

	@When("^点击确定要删除该条备注吗的确定按钮$")
	public void 点击确定要删除该条备注吗的确定按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickSureReamrkDelete();
	}

	@Then("^备注列表中不存在一条 \"([^\"]*)\" \"([^\"]*)\"的备注，备注删除成功$")
	public void 备注列表中不存在一条_的备注_备注删除成功(String name, String content) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkRemarkDeleteSuccessful(name, content);
	}

	
	
	
	
	/**
	 * 编辑客户信息
	 * @throws Throwable
	 */
	@When("^点击备注列表页的返回按钮$")
	public void 点击备注列表页的返回按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.backToCustomerDetailPage();
	}

	@When("^点击操作列表中的编辑$")
	public void 点击操作列表中的编辑() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickEditButton();
	    this.creamsAPPCustomerManagementFlow.intoEditPage();
	}

	@Then("^编辑页面填写的信息与填写的 \"([^\"]*)\"一致$")
	public void 编辑页面填写的信息与填写的_一致(String name) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.checkName(name);
	}

	@When("^修改租客姓名为 \"([^\"]*)\"$")
	public void 修改租客姓名为(String name) throws Throwable {
		this.creamsAPPCustomerManagementFlow.modifyName(name);
	}

	@When("^点击编辑客户页面的保存按钮$")
	public void 点击编辑客户页面的保存按钮() throws Throwable {
	    this.creamsAPPCustomerManagementFlow.clickEditSave();
	}

	@Then("^客户详情中的租客姓名修改为 \"([^\"]*)\"$")
	public void 客户详情中的租客姓名修改为(String name) throws Throwable {
	    this.creamsAPPCustomerManagementFlow.EditNameSuccessful(name);
	}
	



	/**
	 * 来访时间快捷筛选
	 */
	@When("^选择快捷筛选条件为 \"([^\"]*)\"$")
	public void 选择快捷筛选条件为(String arg1) throws Exception {
		this.creamsAPPCustomerManagementFlow.selectConditions(arg1);
	}

	@Then("^客户列表中所有记录的来访时间都显示 \"([^\"]*)\"$")
	public void 客户列表中所有记录的来访时间都显示(String arg1) throws Exception {
		this.creamsAPPCustomerManagementFlow.checkAllVisitTime(arg1);
	}



	/**
	 * 客户状态快捷筛选
	 */
	@When("^选择快捷客户状态为 \"([^\"]*)\"$")
	public void 选择快捷客户状态为(String arg1) throws Exception {
		this.creamsAPPCustomerManagementFlow.selectCustomStatus(arg1);
	}

	@Then("^客户列表中所有记录的客户状态都显示 \"([^\"]*)\"$")
	public void 客户列表中所有记录的客户状态都显示(String arg1) throws Exception {
		this.creamsAPPCustomerManagementFlow.checkAllCustomStatus(arg1);
	}



	/**
	 * 渠道类型筛选
	 */
	@When("^点击筛选按钮进入筛选页$")
	public void 点击筛选按钮进入筛选页() throws Exception {
		this.creamsAPPCustomerManagementFlow.clickFilterButton();
		this.creamsAPPCustomerManagementFlow.intoFilterPage();
	}

	@When("^选择渠道筛选条件为 \"([^\"]*)\"$")
	public void 选择渠道筛选条件为(String arg1) throws Exception {
		this.creamsAPPCustomerManagementFlow.filterChannelType(arg1);
	}

	@When("^点击客户管理筛选页的确定按钮")
	public void 点击客户管理筛选页的确定按钮() throws Exception {
		this.creamsAPPCustomerManagementFlow.clickConfirm();
	}

	@Then("^客户列表中所有记录的渠道类型都显示 \"([^\"]*)\"$")
	public void 客户列表中所有记录的渠道类型都显示(String arg1) throws Exception {
		this.creamsAPPCustomerManagementFlow.checkAllChannerType(arg1);
	}
}