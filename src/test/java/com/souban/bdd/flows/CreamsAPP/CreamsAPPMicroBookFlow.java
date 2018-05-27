package com.souban.bdd.flows.CreamsAPP;

import static org.hamcrest.core.Is.is;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.souban.bdd.pages.CreamsAPP.CreamsAPPMicroBookPage;
import org.junit.Assert;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;


public class CreamsAPPMicroBookFlow {
	
	private CreamsAPPMicroBookPage creamsAPPMicroBookPage = null;
	
	public CreamsAPPMicroBookFlow(final Driver driver) {
		this.creamsAPPMicroBookPage = PageFactory.getPage(CreamsAPPMicroBookPage.class, driver);
	}
	
	// 点击微楼书库
	public void clickMircoBuildingLibrary() {
		this.creamsAPPMicroBookPage.clickMircoBuildingLibrary();
		Assert.assertThat(this.creamsAPPMicroBookPage.intoMircoBuildingLibraryPage(), is(true));
		System.out.println("成功进入微楼书列表页");
	}

	// 点击添加按钮
	public void clickAddButton() {
		this.creamsAPPMicroBookPage.clickAddButton();
		Assert.assertThat(this.creamsAPPMicroBookPage.intoCreateMicrobookPage(), is(true));
	}
	
	//点击搜索楼盘进入搜索页
	public void IntoSearchParkPage(){
		this.creamsAPPMicroBookPage.IntoSearchParkPage();
	}
	
	//输入搜索楼盘的关键字
	public void InputParkKeyword(String keyword){
		this.creamsAPPMicroBookPage.InputParkKeyword(keyword);
	}
	
	//选择楼盘
	public void SelectPark(String park){
		this.creamsAPPMicroBookPage.SelectPark(park);
	}
	
	//检查回填的楼盘名称
	public void VerifyParkName(String park){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckParkName(), is(park));
	}
	
	//检查回填的楼盘图片数量
	public void VerifyParkPhoto(String ParkPhotoCount){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckParkPhoto(), is(ParkPhotoCount));
	}
	
	//检查回填的所在位置
	public void VerifyAddress(String address){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckAddress(), is(address));
	}
	
	//检查回填的所属商圈
	public void VerifyBlock(String block){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckBlock(), is(block));
	}
	
	//检查在租价格
	public void VerifyPrice(String MinPrice,String MaxPrice,String PriceUnit){
		String[] Price = this.creamsAPPMicroBookPage.CheckPrice().split(",");
		Assert.assertThat(Price[0], is(MinPrice));
		Assert.assertThat(Price[1], is(MaxPrice));
		Assert.assertThat(Price[2], is(PriceUnit));
	}
	
	//通知
	public void InputNotice(String notice){
		this.creamsAPPMicroBookPage.InputNotice(notice);
	}
	
	//检查通知的字符个数
	public void VerifyNoticeCount(String NoticeCount){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckNoticeCount(),is(NoticeCount));
	}
	
	// 结佣说明
	public void InputBrokerageDescription(String brokerage){
		this.creamsAPPMicroBookPage.InputBrokerageDescription(brokerage);
	}
	
	//检查结佣说明的字符个数
	public void VerifyBrokerageCount(String BrokerageCount){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckBrokerageCount(), is(BrokerageCount));
	}
	
	//开启结佣说明显示
	public void OpenBrokerageShow(){
		this.creamsAPPMicroBookPage.OpenBrokerageShow();
	}
	
	//进入选择楼宇列表
	public void IntoSelectBuildingPage(){
		this.creamsAPPMicroBookPage.IntoSelectBuildingPage();
	}
	
	//选择楼宇
	public void SelectBuilding(String building){
		this.creamsAPPMicroBookPage.SelectBuilding(building);
	}
	
	//点击确定进入选择房源页面
	public void IntoSelectRoomPage(){
		this.creamsAPPMicroBookPage.IntoSelectRoomPage();
	}
	
	//选择房源
	public void SelectRoom(){
		this.creamsAPPMicroBookPage.SelectRoom();
	}
	
	//点击导入回到微楼书编辑页面
	public void ClickImport(){
		this.creamsAPPMicroBookPage.ClickImport();
	}
	
	//检查导入的房源信息
	//android
	public void VerifyRoomInfo_android(String roomNumber,String floor,String price,String area,String building,String fitment){
		String[] RoomInfo = this.creamsAPPMicroBookPage.CheckRoomInfo_android(roomNumber).split(",");
		Assert.assertThat(RoomInfo[0], is(floor));
		Assert.assertThat(RoomInfo[1], is(price + " "));
		Assert.assertThat(RoomInfo[2], is(area));
		Assert.assertThat(RoomInfo[3], is(building));
		Assert.assertThat(RoomInfo[4], is(fitment));
	}
	//检查导入的房源信息
	//ios
	public void VerifyRoomInfo_ios(String roomNumber,String price,String area,String building,String fitment){
		String[] RoomInfo = this.creamsAPPMicroBookPage.CheckRoomInfo_ios(roomNumber).split(",");
		Assert.assertThat(RoomInfo[0], is(price + " "));
		Assert.assertThat(RoomInfo[1], is(area));
		Assert.assertThat(RoomInfo[2], is(building));
		Assert.assertThat(RoomInfo[3], is(fitment));
	}
	
	//检查面积段套数
	//android
	public void VerifyAreaSizeCountForAndroid(String count1,String count2,String count3,String count4,String count5,String count6){
		List<String> AreaSizeCount = new ArrayList<String>();
		AreaSizeCount = this.creamsAPPMicroBookPage.CheckAreaSizeCountForAndroid();
		Assert.assertThat(AreaSizeCount.get(0), is(count1));
		Assert.assertThat(AreaSizeCount.get(1), is(count2));
		Assert.assertThat(AreaSizeCount.get(2), is(count3));
		Assert.assertThat(AreaSizeCount.get(3), is(count4));
		Assert.assertThat(AreaSizeCount.get(4), is(count5));
		Assert.assertThat(AreaSizeCount.get(5), is(count6));
	}
	//ios
	public void VerifyAreaSizeCountForIos(String count1,String count2,String count3,String count4,String count5,String count6){
		String[] AreaSizeCountInfo = this.creamsAPPMicroBookPage.checkAreaSizeCountForIos().split(",");
		Assert.assertThat(AreaSizeCountInfo[0], is(count1));
		Assert.assertThat(AreaSizeCountInfo[1], is(count2));
		Assert.assertThat(AreaSizeCountInfo[2], is(count3));
		Assert.assertThat(AreaSizeCountInfo[3], is(count4));
		Assert.assertThat(AreaSizeCountInfo[4], is(count5));
		Assert.assertThat(AreaSizeCountInfo[5], is(count6));
	}
	
	//编辑其他信息
	public void IntoOtherInfoPage(){
		this.creamsAPPMicroBookPage.IntoOtherInfoPage();
	}
	public void InputPropertyContent(String content){
		this.creamsAPPMicroBookPage.InputPropertyContent(content);
	}
	public void clickSaveButton() {
		this.creamsAPPMicroBookPage.clickSaveButton();
	}
	
	//检查楼盘描述
	public void VerifyParkDescription(String parkDescription){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckParkDescription(), is(parkDescription));
	}
	public void VerifyParkDescriptionCount(String ParkDescriptionCount){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckParkDescriptionCount(), is(ParkDescriptionCount));
	}
	
	//检查个人帐户信息
	public void VerifyAccountInfo(String name,String tel,String wechat){
		String[] AccountInfo = this.creamsAPPMicroBookPage.CheckAccountInfo().split(",");
		Assert.assertThat(AccountInfo[0], is(name));
		Assert.assertThat(AccountInfo[1], is(tel));
		Assert.assertThat(AccountInfo[2], is(wechat));
	}
	
	//保存微楼书
	public void ClickSave(){
		this.creamsAPPMicroBookPage.ClickSave();
	}
	public void VerifyDefaultName(String defaultName){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckDefaultName(), is(defaultName));
	}
	public void InputBookName(String bookName){
		this.creamsAPPMicroBookPage.InputBookName(bookName);
	}
	//点击微楼书命名页的确定按钮
	public void clickSureButton() {
		this.creamsAPPMicroBookPage.clickSureButton();
	}
	
	//检查微楼书创建成功
	//android
	public void VerifyCreateMicrobookResult_android(String parkName){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckCreateMicrobookResult_android(parkName), is(true));
	}
	//ios
	public void VerifyCreateMicrobookResult_ios(String microBookName) {
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckCreateMicrobookResult_ios(microBookName), is(true));
	}

		
	//删除微楼书
	//需要进入微楼书预览页
	public void intoMicroBook(String microBookName) {
		this.creamsAPPMicroBookPage.intoMicroBook(microBookName);
	}
	public void ClickMoreButton(){
		this.creamsAPPMicroBookPage.ClickMoreButton();
	}
	public void clickDeleteButton() {
		this.creamsAPPMicroBookPage.clickDeleteButton();
	}
	public void clickConfirmButton() {
		this.creamsAPPMicroBookPage.clickConfirmButton();
	}
	public void VerifyMyMicroBook(String microBookName) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkMyMicroBook(microBookName), is(false));
		
	}
	
	//断言
	public void checkMyMicroBookFail(String name) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkMyMicroBook(name), is(false));
	}

	//查看微楼书列表新建的微楼书
	public void clickBackButton() {
		this.creamsAPPMicroBookPage.clickBackButton();
	}
	
	public void VerifyMyMicroBookIsExsit(String bookName){
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckMyMicrobook(bookName), is(true));
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckMy(bookName), is(true));
	}
	
	public void VerifyUpdateDate(){
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String CurrentDate = dateFormat.format( now );
		Assert.assertThat(this.creamsAPPMicroBookPage.CheckUpdateDate(), is(CurrentDate));
	}
	
	
	//检查微楼书预览页
	public void checkBlock(String block) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkBlock(block),is(true));
	}

	public void checkLocation(String location) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkLocation(location),is(true));
		System.out.println("位置核对正确");
	}

	public void checkPriceAndUnit(String minPrice, String maxPrice, String unit) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkMinPrice(minPrice), is(true));
		Assert.assertThat(this.creamsAPPMicroBookPage.checkMaxPrice(maxPrice), is(true));
		Assert.assertThat(this.creamsAPPMicroBookPage.checkUnit(unit), is(true));
	}

	public void checkNotice(String notice) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkNotice(notice),is(true));
		System.out.println("通知核对正确");
	}

	public void checkBrokerageDescription(String brokerageDescription) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkBrokerageDescription(brokerageDescription),is(true));
		System.out.println("结佣说明核对正确");
			
	}

	public void checkRoomCount(String allRoom, String aRoom, String bRoom, String cRoom, String dRoom) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkRoomAllCount(dRoom, allRoom), is(true));
		Assert.assertThat(this.creamsAPPMicroBookPage.checkRoomACount(aRoom), is(true));
		Assert.assertThat(this.creamsAPPMicroBookPage.checkRoomBCount(bRoom), is(true));
		Assert.assertThat(this.creamsAPPMicroBookPage.checkRoomCCount(cRoom), is(true));
		Assert.assertThat(this.creamsAPPMicroBookPage.checkRoomDCount(dRoom), is(true));
		System.out.println("房源户型数量核对正确");
	}

	public void checkRoomInformation(String areaSize, String floor, String decorate, String price) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkRoomFloor(areaSize, floor), is(true));
		Assert.assertThat(this.creamsAPPMicroBookPage.checkRoomDecorate(areaSize, decorate), is(true));
		Assert.assertThat(this.creamsAPPMicroBookPage.checkRoomPrice(areaSize, price), is(true));
		System.out.println("房源信息核对正确");
	}

	public void checkOtherInformation(String otherInfo) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkOtherInformation(otherInfo),is(true));
		System.out.println("其他信息核对正确");
	}

	public void checkParkDescription(String parkDescription) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkParkDescription(parkDescription),is(true));
		System.out.println("楼盘描述核对正确");
	}
	
	
	
	//编辑微楼书
	//点击删除按钮
	public void clickEditButton() {
		this.creamsAPPMicroBookPage.clickEditButton();
	}

	//进入编辑微楼书页
	public void intoEditPage() {
		Assert.assertThat(this.creamsAPPMicroBookPage.intoEditPage(), is(true));
	}

	//修改楼盘名称
	public void editParkName(String parkName) {
		this.creamsAPPMicroBookPage.editParkName(parkName);
	}

	public void checkEdit(String microBookName) {
		Assert.assertThat(this.creamsAPPMicroBookPage.checkEdit(microBookName), is(true));
	} 
	
	
	//手动填写楼盘信息
	//common
	//输入楼盘名称
	public void inputParkName(String parkName) {
		this.creamsAPPMicroBookPage.inputParkName(parkName);
	}
		
		
		
	//common
	//点击上传照片入口
	public void clickUploadPicture() {
		this.creamsAPPMicroBookPage.clickUploadPicture();
	}
	//android
	//选择照片来源
	public void selectPictureSource() {
		this.creamsAPPMicroBookPage.selectPictureSource();
	}
	//android
	//跳过权限及拍照
	public void ShutterPicture() {
		this.creamsAPPMicroBookPage.ShutterPicture();
	}
	//ios
	//跳过权限及选择照片
	public void selectPicture() {
		this.creamsAPPMicroBookPage.selectPicture();
	}
		
		
		
	//common
	//所在位置入口
	public void intoLocation() {
		this.creamsAPPMicroBookPage.intoLocation();
	}
	//android
	//输入地址
	public void inputAddress(String address) {
		this.creamsAPPMicroBookPage.inputAddress(address);
	}
	//ios
	//输入地址
	public void inputAddress_ios(String address) {
		this.creamsAPPMicroBookPage.inputAddress_ios(address);
	}
	//common
	//选择位置
	public void selectLocation(String location) {
		this.creamsAPPMicroBookPage.selectLocation(location);
	}
		
		

	//common
	//最低在租价格
	public void inputMinPrice(String minPrice) {
		this.creamsAPPMicroBookPage.inputMinPrice(minPrice);
	}
			
	//common
	//最高在租价格
	public void inputMaxPrice(String maxPrice) {
		this.creamsAPPMicroBookPage.inputMaxPrice(maxPrice);
	}
			
	//android
	//修改在租价格单位
	public void selectPriceUnit(String priceUnit) {
		this.creamsAPPMicroBookPage.selectPriceUnit(priceUnit);
	}
	//ios
	//修改在租价格单位
	public void selectPriceUnit_ios(String priceUnit) {
		this.creamsAPPMicroBookPage.selectPriceUnit_ios(priceUnit);
	}
		
		
		
	//common
	//最新通知
	public void inputInform(String inform) {
		this.creamsAPPMicroBookPage.inputInform(inform);
	}
		
		
	//common
	//填写结佣说明
	public void inputCommission(String commission) {
		this.creamsAPPMicroBookPage.inputCommission(commission);
	}
	//android
	//开启结佣说明浏览页显示按钮
	public void openCommissionShowButton() {
		this.creamsAPPMicroBookPage.openCommissionShowButton();
	}
		
		
		
	//common
	//点击房源导入按钮
	public void clickAddRoomButton() {
		this.creamsAPPMicroBookPage.clickAddRoomButton();
	}
	//common
	//进入楼宇列表
	public void intoSelectBuildingPage() {
		Assert.assertThat(this.creamsAPPMicroBookPage.intoSelectBuildingPage(), is(true));
		System.out.println("进入选择楼宇页!");
	}
	//common
	//选择楼宇
	public void selectBuilding(String buildingName) {
		this.creamsAPPMicroBookPage.selectBuilding(buildingName);
	}
	//common
	//进入房源页
	public void intoSelectRoomPage() {
		Assert.assertThat(this.creamsAPPMicroBookPage.intoSelectRoomPage(), is(true));
		System.out.println("进入选择房源页!");
	}
	//common
	//选择房源
	public void selectRoom(String room) {
		this.creamsAPPMicroBookPage.selectRoom(room);
	}
		
		
		
		
	//common
	//其他信息
	public void clickOtherInformation() {
		this.creamsAPPMicroBookPage.clickOtherInformation();
	}
	//common
	//进入其他信息页
	public void intoOtherInformation() {
		this.creamsAPPMicroBookPage.intoOtherInformation();
		System.out.println("进入其他信息编辑页!");
	}
	//common
	//物业费
	public void inputPropertyFee(String propertyFee) {
		this.creamsAPPMicroBookPage.inputPropertyFee(propertyFee);
	}
	//common
	//取暖费
	public void inputHeatingFee(String heatingFee) {
		this.creamsAPPMicroBookPage.inputHeatingFee(heatingFee);
	}
	//common
	//停车费
	public void inputParkingFee(String parkingFee) {
		this.creamsAPPMicroBookPage.inputParkingFee(parkingFee);
	}
	//common
	//保存其他信息
	public void saveOtherInformation() {
		this.creamsAPPMicroBookPage.saveOtherInformation();
	}
		
		
		
	//common
	//填写楼盘描述
	public void inputParkDescribe(String parkDescribe) {
		this.creamsAPPMicroBookPage.inputParkDescribe(parkDescribe);
	}



	/**
	 * 微楼书分享
	 */
	public void clickShare(){
		this.creamsAPPMicroBookPage.clickShare();
	}

	//ios
	//弹出权限弹窗
	public void intoPermitPage(){
		Assert.assertThat(this.creamsAPPMicroBookPage.intoPermitPage(),is(true));
	}

	//ios
	//允许权限
	public void allowPermit(){
		this.creamsAPPMicroBookPage.allowPermit();
	}

	public void intoSharePage(){
		Assert.assertThat(this.creamsAPPMicroBookPage.intoSharePage(),is(true));
	}


	/**
	 * 微楼书切换背景
	 */
	public void clickswitchBackground(){
		this.creamsAPPMicroBookPage.clickswitchBackground();
	}

	public void intoSwitchBackground(){
		Assert.assertThat(this.creamsAPPMicroBookPage.intoSwitchBackground(),is(true));
	}


	/**
	 * 微楼书分享和切换背景的取消按钮
	 */
	public void clickCancel(){
		this.creamsAPPMicroBookPage.clickCancel();
	}
}
