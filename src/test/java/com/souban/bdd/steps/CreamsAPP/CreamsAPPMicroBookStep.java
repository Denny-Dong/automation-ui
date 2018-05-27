package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPMicroBookStep extends BaseStep{
	/**
	 * 新增微楼书
	 * @throws Exception
	 */
	@Given("^点击微楼书进入微楼书列表$")
	public void 点击微楼书进入微楼书列表() throws Exception {
	    this.creamsAPPMicroBookFlow.clickMircoBuildingLibrary();
	}
	@When("^选择微楼书列表右上角的添加按钮进入新建微楼书页面$")
	public void 选择微楼书列表右上角的添加按钮进入新建微楼书页面() throws Exception {
	    this.creamsAPPMicroBookFlow.clickAddButton();
	}
	@When("^点击搜索楼盘按钮进入搜索楼盘页$")
	public void 点击搜索楼盘按钮进入搜索楼盘页() throws Exception {
	    this.creamsAPPMicroBookFlow.IntoSearchParkPage();
	}
	@When("^在楼盘搜索框中输入楼盘关键词 \"([^\"]*)\"$")
	public void 在楼盘搜索框中输入楼盘关键词(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.InputParkKeyword(arg1);
	}
	@When("^选择楼盘 \"([^\"]*)\"$")
	public void 选择楼盘(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.SelectPark(arg1);
	}
	@Then("^楼盘名称 \"([^\"]*)\" 回填正确$")
	public void 楼盘名称回填正确(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.VerifyParkName(arg1);
	}
	@Then("^回填的楼盘照片数量和所选楼盘的照片数量 \"([^\"]*)\"一致$")
	public void 回填的楼盘照片数量和所选楼盘的照片数量_一致(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.VerifyParkPhoto(arg1);
	}
	@Then("^回填的所在位置 \"([^\"]*)\" 显示正确$")
	public void 回填的所在位置显示正确(String arg1) throws Exception {
	   this.creamsAPPMicroBookFlow.VerifyAddress(arg1);
	}
	@Then("^回填的所属商圈 \"([^\"]*)\" 显示正确$")
	public void 回填的所属商圈显示正确(String arg1) throws Exception {
	   this.creamsAPPMicroBookFlow.VerifyBlock(arg1);
	}
	@Then("^回填的在租价格和楼盘的 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"一致$")
	public void 回填的在租价格和楼盘的一致(String arg1, String arg2, String arg3) throws Exception {
	   this.creamsAPPMicroBookFlow.VerifyPrice(arg1, arg2, arg3);
	}
	@Then("^输入通知内容 \"([^\"]*)\"$")
	public void 输入通知内容(String arg1) throws Exception {
	   this.creamsAPPMicroBookFlow.InputNotice(arg1);
	}
	@Then("^通知的字符个数统计正确 \"([^\"]*)\"$")
	public void 通知的字符个数统计正确(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.VerifyNoticeCount(arg1);
	}
	@Then("^输入结佣说明 \"([^\"]*)\"$")
	public void 输入结佣说明(String arg1) throws Exception {
	   this.creamsAPPMicroBookFlow.InputBrokerageDescription(arg1);
	}
	@Then("^结佣说明的字符个数统计正确 \"([^\"]*)\"$")
	public void 结佣说明的字符个数统计正确(String arg1) throws Exception {
	   this.creamsAPPMicroBookFlow.VerifyBrokerageCount(arg1);
	}
	@Then("^点击结佣说明开关开启显示$")
	public void 点击结佣说明开关开启显示() throws Exception {
	    this.creamsAPPMicroBookFlow.OpenBrokerageShow();
	}
	@Then("^点击房源导入进入选择楼宇列表$")
	public void 点击房源导入进入选择楼宇列表() throws Exception {
	   this.creamsAPPMicroBookFlow.IntoSelectBuildingPage();
	}
	@Then("^选择要导入的楼宇 \"([^\"]*)\"$")
	public void 选择要导入的楼宇(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.SelectBuilding(arg1);
	}
	@Then("^点击确定后进入选择房源页面$")
	public void 点击确定后进入选择房源页面() throws Exception {
	    this.creamsAPPMicroBookFlow.IntoSelectRoomPage();
	}
	@Then("^点击全选选中列表的全部房源$")
	public void 点击全选选中列表的全部房源() throws Exception {
	   this.creamsAPPMicroBookFlow.SelectRoom();
	}
	@Then("^点击导入回到微楼书编辑页面$")
	public void 点击导入回到微楼书编辑页面() throws Exception {
	    this.creamsAPPMicroBookFlow.ClickImport();
	}
	//android
	@Then("^导入的房源 \"([^\"]*)\" 信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 导入的房源_信息显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
	   this.creamsAPPMicroBookFlow.VerifyRoomInfo_android(arg1, arg2, arg3, arg4, arg5, arg6);
	}
	//ios
	@Then("^导入的房源 \"([^\"]*)\" 信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 导入的房源_信息显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Exception {
		this.creamsAPPMicroBookFlow.VerifyRoomInfo_ios(arg1, arg2, arg3, arg4, arg5);
	}
	//android
	@Then("^android面积段0-100m² \"([^\"]*)\" 100-200m²\"([^\"]*)\" 200-300m²\"([^\"]*)\" 300-500m²\"([^\"]*)\" 500-1000m²\"([^\"]*)\" 1000m²以上\"([^\"]*)\" 显示正确$")
	public void android面积段统计套数显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
	   this.creamsAPPMicroBookFlow.VerifyAreaSizeCountForAndroid(arg1, arg2, arg3, arg4, arg5, arg6);
	}
	//ios
	@Then("^ios面积段0-100m² \"([^\"]*)\" 100-200m²\"([^\"]*)\" 200-300m²\"([^\"]*)\" 300-500m²\"([^\"]*)\" 500-1000m²\"([^\"]*)\" 1000m²以上\"([^\"]*)\" 显示正确$")
	public void ios面积段统计套数显示正确(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
	   this.creamsAPPMicroBookFlow.VerifyAreaSizeCountForIos(arg1, arg2, arg3, arg4, arg5, arg6);
	}
	@Then("^点击其他信息的编辑按钮进入编辑页面$")
	public void 点击其他信息的编辑按钮进入编辑页面() throws Exception {
	    this.creamsAPPMicroBookFlow.IntoOtherInfoPage();
	}
	@Then("^填写物业费的内容 \"([^\"]*)\"$")
	public void 填写物业费的内容(String arg1) throws Exception {
	   this.creamsAPPMicroBookFlow.InputPropertyContent(arg1);
	}
	@Then("^点击保存回到微楼书编辑页面$")
	public void 点击保存回到微楼书编辑页面() throws Exception {
	    this.creamsAPPMicroBookFlow.clickSaveButton();
	}
	@Then("^回填的楼盘描述和楼盘的 \"([^\"]*)\" 一致$")
	public void 回填的楼盘描述和楼盘的一致(String arg1) throws Exception {
	   this.creamsAPPMicroBookFlow.VerifyParkDescription(arg1);
	}
	@Then("^楼盘描述的字符个数统计正确 \"([^\"]*)\"$")
	public void 楼盘描述的字符个数统计正确(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.VerifyParkDescriptionCount(arg1);
	}
	@Then("^个人账户信息显示正确 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 个人账户信息显示正确(String arg1, String arg2, String arg3) throws Exception {
	    this.creamsAPPMicroBookFlow.VerifyAccountInfo(arg1, arg2, arg3);
	}
	@Then("^点击保存微楼书$")
	public void 点击保存微楼书() throws Exception {
	   this.creamsAPPMicroBookFlow.ClickSave();
	}
	@Then("^弹出的微楼书名称框默认名称显示正确 \"([^\"]*)\"$")
	public void 弹出的微楼书名称框默认名称显示正确(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.VerifyDefaultName(arg1);
	}
	@Then("^修改微楼书名称 \"([^\"]*)\"$")
	public void 修改微楼书名称(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.InputBookName(arg1);
	}
	@Then("^点击确定微楼书$")
	public void 点击确定微楼书() throws Exception {
	    this.creamsAPPMicroBookFlow.clickSureButton();
	}
	//android
	@Then("^微楼书 \"([^\"]*)\" 新建成功$")
	public void 微楼书_新建成功(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.VerifyCreateMicrobookResult_android(arg1);
	}
	//ios
	@Then("^列表中存在微楼书名称为 \"([^\"]*)\"并且带有我标识,微楼书新建成功$")
	public void 列表中存在微楼书名称为_并且带有我标识_微楼书新建成功(String arg1) throws Exception {
		this.creamsAPPMicroBookFlow.VerifyCreateMicrobookResult_ios("     "+arg1);
	}

	
	
	
	// 删除微楼书
	//android
	@When("^android点击微楼书名称为 \"([^\"]*)\"的微楼书，进入微楼书预览页$")
	public void android点击微楼书名称为_的微楼书_进入微楼书预览页(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.intoMicroBook(arg1);
	}
	//ios
	@When("^点击微楼书名称为 \"([^\"]*)\"的微楼书，进入微楼书预览页$")
	public void 点击微楼书名称为_的微楼书_进入微楼书预览页(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.intoMicroBook("     "+arg1);
	}
	@When("^点击微楼书模版页的操作$")
	public void 点击微楼书模版页的操作() throws Throwable {
	    this.creamsAPPMicroBookFlow.ClickMoreButton();
	}
	@When("^点击微楼书详情页操作列表中的删除按钮$")
	public void 点击微楼书详情页操作列表中的删除按钮() throws Throwable {
	    this.creamsAPPMicroBookFlow.clickDeleteButton();
	}
	@When("^点击确定要删除该微楼书吗的确定按钮$")
	public void 点击确定要删除该微楼书吗的确定按钮() throws Throwable {
	    this.creamsAPPMicroBookFlow.clickConfirmButton();
	}
	@Then("^微楼书列表中不存在名称为 \"([^\"]*)\"的微楼书，微楼书删除成功$")
	public void 微楼书列表中不存在名称为_的微楼书_微楼书删除成功(String arg1) throws Throwable {
	    this.creamsAPPMicroBookFlow.VerifyMyMicroBook("     "+arg1);
	}
	
	//微楼书列表检查
	@Then("^点击返回回到微楼书列表$")
	public void 点击返回回到微楼书列表() throws Exception {
	    this.creamsAPPMicroBookFlow.clickBackButton();
	}

	@Then("^列表显示刚创建的微楼书 \"([^\"]*)\"并且带有我标识$")
	public void 列表显示刚创建的微楼书并且带有我标识(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.VerifyMyMicroBookIsExsit(arg1);
	}

	@Then("^更新日期显示正确$")
	public void 更新日期显示正确() throws Exception {
	    this.creamsAPPMicroBookFlow.VerifyUpdateDate();
	}
	
	//微楼书预览页内容检查
	@Then("^区域商圈 \"([^\"]*)\" 显示正确$")
	public void 区域商圈_显示正确(String arg1) throws Exception {
	   this.creamsAPPMicroBookFlow.checkBlock(arg1);
	}

	@Then("^地址 \"([^\"]*)\" 显示正确$")
	public void 地址_显示正确(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.checkLocation(arg1);
	}

	@Then("^当前在租价格 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"显示正确$")
	public void 当前在租价格_显示正确(String arg1, String arg2, String arg3) throws Exception {
	    this.creamsAPPMicroBookFlow.checkPriceAndUnit(arg1, arg2, arg3);
	}

	@Then("^活动通知 \"([^\"]*)\"显示正确$")
	public void 活动通知_显示正确(String arg1) throws Exception {
	   this.creamsAPPMicroBookFlow.checkNotice(arg1);
	}

	@Then("^结佣说明 \"([^\"]*)\" 显示正确$")
	public void 结佣说明_显示正确(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.checkBrokerageDescription(arg1);
	}

	@Then("^各面积段全部户型 \"([^\"]*)\" 100-200m²\"([^\"]*)\" 200-300m²\"([^\"]*)\" 300-500m²\"([^\"]*)\" 500-1000m²\"([^\"]*)\" 显示正确$")
	public void 各面积段全部户型显示正确(String arg1, String arg2, String arg3, String arg4, String arg5) throws Exception {
	    this.creamsAPPMicroBookFlow.checkRoomCount(arg1, arg2, arg3, arg4, arg5);
	}

	@Then("^面积为 \"([^\"]*)\" 的房源的楼层\"([^\"]*)\" 装修\"([^\"]*)\" 价格\"([^\"]*)\" 显示正确$")
	public void 面积为_的房源的楼层_装修_价格_显示正确(String arg1, String arg2, String arg3, String arg4) throws Exception {
	    this.creamsAPPMicroBookFlow.checkRoomInformation(arg1, arg2, arg3, arg4);
	}

	@Then("^其他信息 名称和内容\"([^\"]*)\" 显示正确$")
	public void 其他信息_名称和内容_显示正确(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.checkOtherInformation(arg1);
	}
	@Then("^微楼书楼盘描述 \"([^\"]*)\" 显示正确$")
	public void 微楼书楼盘描述_显示正确(String arg1) throws Throwable {
	   this.creamsAPPMicroBookFlow.checkParkDescription(arg1);
	}
	
	
	
	//编辑微楼书
	@When("^点击微楼书详情页操作列表中的编辑按钮$")
	public void 点击微楼书详情页操作列表中的编辑按钮() throws Exception {
	    this.creamsAPPMicroBookFlow.clickEditButton();
	}
	@Then("^进入微楼书编辑页$")
	public void 进入微楼书编辑页() throws Exception {
	    this.creamsAPPMicroBookFlow.intoEditPage();
	}
	@Then("^修改微楼书的楼盘名称为 \"([^\"]*)\"$")
	public void 修改微楼书的楼盘名称为(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.editParkName(arg1);
	}
	@Then("^修改在租价格为 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 修改在租价格为(String minPrice, String maxPrice, String priceUnit) throws Exception {
		this.creamsAPPMicroBookFlow.inputMinPrice(minPrice);
	    this.creamsAPPMicroBookFlow.inputMaxPrice(maxPrice);
	    this.creamsAPPMicroBookFlow.selectPriceUnit(priceUnit);
	}
	@Then("^微楼书编辑成功 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 微楼书编辑成功(String arg1, String arg2, String arg3, String arg4) throws Exception {
	    
	}
	@Then("^微楼书编辑成功 \"([^\"]*)\"$")
	public void 微楼书编辑成功(String arg1) throws Exception {
	    this.creamsAPPMicroBookFlow.checkEdit(arg1);
	}
	
	
	//手动填写信息新建微楼书
	@When("^手动输入楼盘名称 \"([^\"]*)\"$")
	public void 手动输入楼盘名称(String parkName) throws Throwable {
		this.creamsAPPMicroBookFlow.inputParkName(parkName);
	}
	@When("^上传照片$")
	public void 上传照片() throws Exception {
		this.creamsAPPMicroBookFlow.clickUploadPicture();
		this.creamsAPPMicroBookFlow.selectPictureSource();
		this.creamsAPPMicroBookFlow.ShutterPicture();
	}
	@When("^ios上传照片$")
	public void ios上传照片() throws Exception {
		this.creamsAPPMicroBookFlow.clickUploadPicture();
		this.creamsAPPMicroBookFlow.selectPicture();
	}
	@Then("^上传的楼盘照片数量和所选楼盘的照片数量 \"([^\"]*)\"一致$")
	public void 上传的楼盘照片数量和所选楼盘的照片数量_一致(String arg1) throws Exception {
		this.creamsAPPMicroBookFlow.VerifyParkPhoto(arg1);
	}
	//android
	@When("^输入所在位置 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 输入所在位置(String address, String location) throws Exception {
		this.creamsAPPMicroBookFlow.intoLocation();
		this.creamsAPPMicroBookFlow.inputAddress(address);
		this.creamsAPPMicroBookFlow.selectLocation(location);
	}
	//ios
	@When("^输入所在位置并搜索 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 输入所在位置并搜索(String address, String location) throws Exception {
		this.creamsAPPMicroBookFlow.intoLocation();
		this.creamsAPPMicroBookFlow.inputAddress_ios(address);
		this.creamsAPPMicroBookFlow.selectLocation(location);
	}
	@When("^填写在租价格为 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 填写在租价格为(String minPrice, String maxPrice, String priceUnit) throws Exception {
	    this.creamsAPPMicroBookFlow.inputMinPrice(minPrice);
	    this.creamsAPPMicroBookFlow.inputMaxPrice(maxPrice);
	    this.creamsAPPMicroBookFlow.selectPriceUnit(priceUnit);
	}
	@When("^ios填写在租价格为 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void ios填写在租价格为(String minPrice, String maxPrice, String priceUnit) throws Exception {
	    this.creamsAPPMicroBookFlow.inputMinPrice(minPrice);
	    this.creamsAPPMicroBookFlow.inputMaxPrice(maxPrice);
	    this.creamsAPPMicroBookFlow.selectPriceUnit_ios(priceUnit);
	}
	@When("^填写通知为 \"([^\"]*)\"$")
	public void 填写通知为(String inform) throws Throwable {
	    this.creamsAPPMicroBookFlow.inputInform(inform);
	}
	//android
	@When("^填写结佣说明 \"([^\"]*)\"，并开启浏览页面显示按钮$")
	public void 填写结佣说明_并开启浏览页面显示按钮(String commission) throws Exception {
	   this.creamsAPPMicroBookFlow.inputCommission(commission);
	   this.creamsAPPMicroBookFlow.openCommissionShowButton();
	}
	//ios
	@Then("^填写结佣说明 \"([^\"]*)\"$")
	public void 填写结佣说明(String commission) throws Exception {
		this.creamsAPPMicroBookFlow.inputCommission(commission);
	}
	@When("^导入一个房源 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 导入一个房源(String buildingName, String room) throws Exception {
		this.creamsAPPMicroBookFlow.clickAddRoomButton();
		this.creamsAPPMicroBookFlow.intoSelectBuildingPage();
		this.creamsAPPMicroBookFlow.selectBuilding(buildingName);
		this.creamsAPPMicroBookFlow.intoSelectRoomPage();
		this.creamsAPPMicroBookFlow.selectRoom(room);
	}
	@When("^填写其他信息 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void 填写其他信息(String propertyFee, String heatingFee, String parkingFee) throws Exception {
	    this.creamsAPPMicroBookFlow.clickOtherInformation();
	    this.creamsAPPMicroBookFlow.intoOtherInformation();
	    this.creamsAPPMicroBookFlow.inputPropertyFee(propertyFee);
	    this.creamsAPPMicroBookFlow.inputHeatingFee(heatingFee);
	    this.creamsAPPMicroBookFlow.inputParkingFee(parkingFee);
	    this.creamsAPPMicroBookFlow.saveOtherInformation();
	}
	@When("^填写楼盘描述 \"([^\"]*)\"$")
	public void 填写楼盘描述(String parkDescribe) throws Exception {
	    this.creamsAPPMicroBookFlow.inputParkDescribe(parkDescribe);
	}


	/**
	 * 微楼书分享
	 */
	@When("^点击微楼书详情页操作列表中的分享按钮$")
	public void 点击微楼书详情页操作列表中的分享按钮() throws Exception {
		this.creamsAPPMicroBookFlow.clickShare();
	}

	//ios
	@When("^允许APP获取照片权限")
	public void 允许APP获取照片权限() throws Exception {
		this.creamsAPPMicroBookFlow.intoPermitPage();
		this.creamsAPPMicroBookFlow.allowPermit();
	}

	@Then("^成功进入微楼书分享页面$")
	public void 成功进入微楼书分享页面() throws Exception {
		this.creamsAPPMicroBookFlow.intoSharePage();
	}

	@When("^点击微楼书分享页的取消按钮$")
	public void 点击微楼书分享页的取消按钮() throws Exception {
		this.creamsAPPMicroBookFlow.clickCancel();
	}



	/**
	 * 微楼书切换背景
	 */
	@When("^点击微楼书详情页操作列表中的切换背景按钮$")
	public void 点击微楼书详情页操作列表中的切换背景按钮() throws Exception {
		this.creamsAPPMicroBookFlow.clickswitchBackground();
	}

	@Then("^成功进入微楼书切换背景页面$")
	public void 成功进入微楼书切换背景页面() throws Exception {
		this.creamsAPPMicroBookFlow.intoSwitchBackground();
	}
	@When("^点击切换背景页的取消按钮$")
	public void 点击切换背景页的取消按钮() throws Exception {
		this.creamsAPPMicroBookFlow.clickCancel();
	}

}