package com.souban.bdd.pages.CreamsAPP;

import java.util.List;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPMicroBookPage extends ParentPage{

	public CreamsAPPMicroBookPage(Driver driver) {
		super(driver);
	}

	// 创建微楼书元素
	//微楼书库
	private UIElement TXT_mircoBookLibrary = new UIElement(
			"id=com.souban.creams.debug:id/microBookTv",
			"xpath=//*[@name='微楼书']");
	//断言-----微楼书库列表
	private UIElement TXT_mircoBookLibraryPage = new UIElement(
			"xpath=//android.widget.TextView[@text='微楼书库' and @resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//*[@name='微楼书']");
	//微楼书库列表的添加按钮
	private UIElement BTN_add = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/addIv']",
			"xpath=//XCUIElementTypeOther[@name='微楼书']/following-sibling::XCUIElementTypeButton[1]");
	//断言-----新建微楼书页
	private UIElement TXT_CreateMicrobookPage = new UIElement(
			"xpath=//android.widget.TextView[@text='新建微楼书' and @resource-id='com.souban.creams.debug:id/microBookNameTv']",
			"xpath=//XCUIElementTypeOther[@name='新建微楼书']");
	//搜索楼盘按钮
	private UIElement BTN_SearchPark = new UIElement(
			"id=com.souban.creams.debug:id/selectParkTv",
			"xpath=//XCUIElementTypeButton[@name='搜索楼盘 >']");
	//楼盘搜索框
	private UIElement INP_SearchPark = new UIElement(
			"id=com.souban.creams.debug:id/searchEt",
			"xpath=//*[@name='请输入楼盘名称']");
	//搜索结果列表
    private UIElement ParkUIElement(String park) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/buildingNameTv' and @text='"+park+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+park+"']");
	}
	//楼盘名称(手动输入楼盘名称)
	private UIElement INP_ParkName = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/buildingTv']",
			"xpath=//XCUIElementTypeButton[@name='搜索楼盘 >']/preceding-sibling::XCUIElementTypeTextField[1]");
	//上传照片入口
	private UIElement BTN_uploadPicture = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/iv_pic']",
			"xpath=//*[@name='Mine_image_add']");
	//选择照片来源
	//android
	private UIElement BTN_selectShutterPicture = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/shootBtn' and @text='拍摄']",
			"");
	//拍摄照片
	//android
	private UIElement BTN_shutter = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.android.camera2:id/shutter_button' and@content-desc='快门']",
			"");
	//选择照片
	//android
	private UIElement BTN_selectPicture = new UIElement(
			"xpath=//android.widget.ImageButton[@resource-id='com.android.camera2:id/done_button' and@content-desc='完成']",
			"xpath=//XCUIElementTypeCollectionView/XCUIElementTypeCell[1][@name='Photo']");
	//ios
	//确定
	private UIElement BTN_pictureSure = new UIElement(
			"",
			"xpath=//XCUIElementTypeButton[@name='Done']");
	//权限问题
	private UIElement BTN_permit = new UIElement(
			"xpath=//*[@text='允许']",
			"xpath=//XCUIElementTypeButton[@name='好']");
	//nextPage
	private UIElement BTN_nextPage = new UIElement("xpath=//*[@text='下一页']","");
	//楼盘照片
	private UIElement TXT_ParkPhotoCount = new UIElement(
			"id=com.souban.creams.debug:id/photo_limit",
			"xpath=//XCUIElementTypeButton[@name='搜索楼盘 >']/ancestor::XCUIElementTypeCell[2]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	//所在位置
	private UIElement TXT_Address = new UIElement(
			"id=com.souban.creams.debug:id/addressTv",
			"xpath=//XCUIElementTypeStaticText[@name='所在位置']/following-sibling::XCUIElementTypeTextField[1]");
	//位置输入框
	private UIElement INP_address = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/searchEv']",
			"xpath=//*[@value='请输入地址']");
	//搜索按钮
	private UIElement BTN_search = new UIElement(
			"",
			"xpath=//*[@name='搜索']");
	//选择位置
    private UIElement SelectLocationUIElement(String location) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/name' and @text='"+location+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+location+"']");
	}
	//确认位置
	private UIElement BTN_ensure_location = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/ensure_button' and @text='确定']",
			"xpath=//*[@name='确定']");
	//所属商圈
	private UIElement TXT_Block = new UIElement(
			"id=com.souban.creams.debug:id/blockTv",
			"xpath=//XCUIElementTypeStaticText[@name='所属商圈']/following-sibling::XCUIElementTypeTextField[1]");
	//在租最低价格
	private UIElement INP_MinPrice = new UIElement(
			"id=com.souban.creams.debug:id/minPriceEt",
			"xpath=//XCUIElementTypeStaticText[@name='在租价格']/following-sibling::XCUIElementTypeTextField[1]");
	//在租最高价格
	private UIElement INP_MaxPrice = new UIElement(
			"id=com.souban.creams.debug:id/maxPriceEt",
			"xpath=//XCUIElementTypeStaticText[@name='在租价格']/following-sibling::XCUIElementTypeTextField[2]");
	//价格单位显示
	private UIElement TXT_PriceUnit = new UIElement(
			"id=com.souban.creams.debug:id/text",
			"xpath=//XCUIElementTypeStaticText[@name='在租价格']/following-sibling::XCUIElementTypeButton[1]");
	//修改单位入口
	private UIElement BTN_arrowDown1 = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/arrowDown1']",
			"xpath=//XCUIElementTypeStaticText[@name='在租价格']/following-sibling::XCUIElementTypeButton[1]");

	// 在租价格单位
    private UIElement PriceUnitUIElement(String priceUnit) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/text' and @text='"+priceUnit+"']",
				"xpath=//*[@type = 'XCUIElementTypePickerWheel']");
	}
	//确定
	private UIElement BTN_unitSure= new UIElement(
			"",
			"xpath=//*[@name='确定']");
	//最新通知
	private UIElement INP_Notice = new UIElement(
			"id=com.souban.creams.debug:id/noticeEv",
			"xpath=//*[@name='通知']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeTextView[1]"); 
	private UIElement TXT_NoticeCount = new UIElement(
			"id=com.souban.creams.debug:id/noticeCountTv",
			"xpath=//*[@name='通知']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	//ios键盘的完成按钮
	private UIElement BTN_complete = new UIElement("","xpath=//*[@name='Toolbar Done Button']");
	//结佣说明
	private UIElement INP_BrokerageDescription = new UIElement(
			"id=com.souban.creams.debug:id/brokerageDescriptionEv",
			"xpath=//*[@name='通知']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[3]//XCUIElementTypeTextView[1]");
	private UIElement TXT_BrokerageCount = new UIElement(
			"id=com.souban.creams.debug:id/brokerageCountTv",
			"xpath=//*[@name='通知']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[3]//XCUIElementTypeStaticText[1]");
	private UIElement BTN_Switch = new UIElement(
			"id=com.souban.creams.debug:id/brokerageSwitch","");
	//是否在浏览页面显示---关闭
	private UIElement BTN_isNotShow = new UIElement(
			"xpath=//android.widget.Switch[@resource-id='com.souban.creams.debug:id/brokerageSwitch' and @text='关闭']",
			"xpath=//XCUIElementTypeStaticText[@name='是否在浏览页面显示']/following-siling::XCUIElementTypeSwitch[@value='0']");
	//是否在浏览页面显示---开启
	private UIElement BTN_isShow = new UIElement(
			"xpath=//android.widget.Switch[@resource-id='com.souban.creams.debug:id/brokerageSwitch' and @text='开启']",
			"xpath=//XCUIElementTypeStaticText[@name='是否在浏览页面显示']/following-siling::XCUIElementTypeSwitch[@value='1']");
	
	//房源导入
	private UIElement BTN_AddRoom = new UIElement(
			"id=com.souban.creams.debug:id/addRoomTv",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/following-sibling::XCUIElementTypeButton[1]");
	//选择楼宇页
	private UIElement TXT_selectBuildPage = new UIElement(
			"xpath=//android.widget.TextView[@text='选择楼宇']",
			"xpath=//XCUIElementTypeOther[@name='选择楼宇']");
	//选择楼宇
    private UIElement LST_BuildingElement(String building){
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + building +"']/parent::android.widget.RelativeLayout/preceding-sibling::android.widget.CheckBox[@resource-id='com.souban.creams.debug:id/checkBox']",
				"xpath=//XCUIElementTypeStaticText[@name='"+building+"']/parent::XCUIElementTypeOther[1]/following-sibling::XCUIElementTypeButton[1]") ;
	}
	//选择楼宇页的确定按钮
	private UIElement BTN_Confirm = new UIElement(
			"id=com.souban.creams.debug:id/saveTv",
			"xpath=//XCUIElementTypeButton[@name='确定']");
	//选择房源页
	private UIElement TXT_selectRoomPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/microBookNameTv' and @text='房源列表']",
			"xpath=//XCUIElementTypeOther[@name='房源列表']");
	//全选房源
	private UIElement BTN_AllSelect = new UIElement(
			"id=com.souban.creams.debug:id/checkAll",
			"xpath=//XCUIElementTypeButton[@name='MircoBook selectbuilding']");
	//选择单个房源
    private UIElement SelectRoomUIElement(String room) {
		return new UIElement(
				"xpath=//*[@resource-id='com.souban.creams.debug:id/roomNumberTv' and @text='"+room+"']/ancestor::android.widget.LinearLayout[1]/preceding-sibling::android.widget.CheckBox[1]",
				"xpath=//XCUIElementTypeStaticText[@name='"+room+"']/parent::XCUIElementTypeOther[1]/following-sibling::XCUIElementTypeButton[1][@name='MircoBook selectbuilding']");
	}
	//导入按钮
	private UIElement BTN_Import = new UIElement(
			"id=com.souban.creams.debug:id/saveTv",
			"xpath=//XCUIElementTypeButton[@name='导入']");
    private UIElement TXT_RoomNumberElement(String roomNumber){
		 return new UIElement(
				 "xpath=//*[@resource-id='com.souban.creams.debug:id/roomNumberTv' and @text='" + roomNumber +"']",
				 "xpath=//XCUIElementTypeStaticText[@name='"+roomNumber+"']");
	}
    private UIElement TXT_FloorElement(String roomNumber){
		return new UIElement(
				"xpath=//*[@text='" + roomNumber +"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/floorTv']","");
	}
    private UIElement TXT_PriceElement(String roomNumber){
		return new UIElement(
				"xpath=//*[@text='" + roomNumber +"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/priceTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+roomNumber+"']/following-sibling::XCUIElementTypeStaticText[2]");
	}
    private UIElement TXT_AreaSizeElement(String roomNumber){
		return new UIElement(
				"xpath=//*[@text='" + roomNumber +"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/areaSizeTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+roomNumber+"']/following-sibling::XCUIElementTypeStaticText[3]");
	}
    private UIElement TXT_BuildingElement(String roomNumber){
		return new UIElement(
				"xpath=//*[@text='" + roomNumber +"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/buildingTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+roomNumber+"']/following-sibling::XCUIElementTypeStaticText[1]");
	}
    private UIElement TXT_Fitment(String roomNumber){
		return new UIElement(
				"xpath=//*[@text='" + roomNumber +"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/fitmentTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+roomNumber+"']/following-sibling::XCUIElementTypeStaticText[4]");
	}
	//android---统计各面积块的套数
	private UIElement TXT_AreaSizeCount = new UIElement(
			"xpath=//android.widget.GridView[@resource-id='com.souban.creams.debug:id/grid_view']//*[@resource-id='com.souban.creams.debug:id/value']","");
	//ios---统计各面积块的套数
	private UIElement TXT_AreaSizeCountOne= new UIElement("",
			"xpath=//XCUIElementTypeStaticText[@name='0-100m²']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_AreaSizeCountTwo= new UIElement("",
			"xpath=//XCUIElementTypeStaticText[@name='100-200m²']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_AreaSizeCountThree= new UIElement("",
			"xpath=//XCUIElementTypeStaticText[@name='200-300m²']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_AreaSizeCountFour= new UIElement("",
			"xpath=//XCUIElementTypeStaticText[@name='300-500m²']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_AreaSizeCountFive= new UIElement("",
			"xpath=//XCUIElementTypeStaticText[@name='500-1000m²']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_AreaSizeCountSix= new UIElement("",
			"xpath=//XCUIElementTypeStaticText[@name='1000m²以上']/following-sibling::XCUIElementTypeStaticText[1]");
	
	
	//其他信息
	private UIElement BTN_EditOtherInfo = new UIElement(
			"id=com.souban.creams.debug:id/editInfoTv",
			"xpath=//XCUIElementTypeButton[@name='编辑']");
	//断言---进入其他信息页
	private UIElement TXT_otherInformationPage = new UIElement(
			"xpath=//android.widget.TextView[@text='其他信息' and @resource-id='com.souban.creams.debug:id/microBookNameTv']",
			"xpath=//XCUIElementTypeOther[@name='其他信息']");
	//物业费
	private UIElement INP_PropertyContent = new UIElement(
			"xpath=//*[@text='物业费']/following-sibling::android.widget.EditText[@resource-id='com.souban.creams.debug:id/value']",
			"xpath=//*[@value='物业费']/following-sibling::XCUIElementTypeTextField[1]");

	//取暖费
	private UIElement INP_heatingFee = new UIElement(
			"xpath=//android.widget.EditText[@text='取暖费']/following-sibling::android.widget.EditText[1]",
			"xpath=//*[@value='取暖费']/following-sibling::XCUIElementTypeTextField[1]");
	//停车费
	private UIElement INP_parkingFee = new UIElement(
			"xpath=//android.widget.EditText[@text='停车费']/following-sibling::android.widget.EditText[1]",
			"xpath=//*[@value='停车费']/following-sibling::XCUIElementTypeTextField[1]");
	//保存
	private UIElement BTN_save_otherInfo = new UIElement(
			"id=com.souban.creams.debug:id/saveTv",
			"xpath=//XCUIElementTypeButton[@name='保存']");

	
	//楼盘描述
	private UIElement INP_ParkDescription = new UIElement(
			"id=com.souban.creams.debug:id/buildingDescriptionEv",
			"xpath=//*[@name='楼盘描述']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeTextView[1]");
	private UIElement TXT_ParkDescriptionCount = new UIElement(
			"id=com.souban.creams.debug:id/buildingCountTv",
			"xpath=//*[@name='楼盘描述']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	
	
	//个人账户信息
	private UIElement TXT_Name = new UIElement(
			"id=com.souban.creams.debug:id/nameTv",
			"xpath=//*[@name='姓名']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_Tel = new UIElement(
			"id=com.souban.creams.debug:id/telTv",
			"xpath=//*[@name='电话']/following-sibling::XCUIElementTypeStaticText[1]");
	private UIElement TXT_Wechat = new UIElement(
			"id=com.souban.creams.debug:id/weChatTv",
			"xpath=//*[@name='微信号']/following-sibling::XCUIElementTypeStaticText[1]");
	
	
	//新建微楼书页的保存按钮
	private UIElement BTN_save = new UIElement(
			"xpath=//android.widget.TextView[@text='保存' and @resource-id='com.souban.creams.debug:id/saveTv']",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	
	
	//命名输入框
	private UIElement INP_name = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/inputEt']",
			"xpath=//XCUIElementTypeStaticText[@name='微楼书命名']/parent::XCUIElementTypeOther[1]/following-sibling::XCUIElementTypeTextView[1]");
	
	
	//确定按钮
	private UIElement BTN_ensure = new UIElement(
			"xpath=//android.widget.Button[@text='确定' and @resource-id='com.souban.creams.debug:id/makeSureBtn']",
			"xpath=//XCUIElementTypeStaticText[@name='微楼书命名']/parent::XCUIElementTypeOther[1]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeButton[2][@name='确定']");
	//微楼书预览页楼盘名称
    private UIElement TXT_BuildingNameElement(String parkName){
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/microBookNameTv' and @text='" + parkName + "']",
				"xpath=//XCUIElementTypeOther[@name='"+parkName+"']");
	}
	//删除
	private UIElement BTN_More = new UIElement(
			"id=com.souban.creams.debug:id/moreIv",
			"xpath=//XCUIElementTypeButton[@name='Button cell']");
	private UIElement BTN_delete = new UIElement(
			"xpath=//android.widget.TextView[@text='删除' and @resource-id='com.souban.creams.debug:id/deleteTv']",
			"xpath=//XCUIElementTypeStaticText[@name='删除']");
	private UIElement BTN_confirm = new UIElement(
			"xpath=//android.widget.Button[@text='确定' and @resource-id='com.souban.creams.debug:id/makeSureBtn']",
			"xpath=//XCUIElementTypeButton[@name='确定']");
	//微楼书列表是否存在该名称---android断言删除，ios断言新建和删除
    private UIElement TXT_MicroBookElement(String microBookName){
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/buildingNameTv' and contains(@text,'" + microBookName + "')]",
				"xpath=//*[@name='"+microBookName+"']");
	}
	
	//编辑
	private UIElement BTN_edit = new UIElement(
			"xpath=//android.widget.TextView[@text='编辑' and @resource-id='com.souban.creams.debug:id/editTv']",
			"xpath=//XCUIElementTypeStaticText[@name='编辑']");
	//断言-----编辑微楼书页
	private UIElement TXT_EditMicrobookPage = new UIElement(
			"xpath=//android.widget.TextView[@text='编辑微楼书' and @resource-id='com.souban.creams.debug:id/microBookNameTv']",
			"xpath=//XCUIElementTypeOther[@name='编辑微楼书']");
	
	
	//微楼书列表元素
	//预览页返回按钮，Android需要,ios不需要
	private UIElement BTN_back = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/backIv']","");
	//android
	private UIElement TXT_MyElement(String bookName){
		return new UIElement(
				"xpath=//android.widget.TextView[contains(@text,'" + bookName + "') and contains(@text,'我')]","");
	}
	//ios---感觉不需要验证，因为在TXT_MicroBookElement已经间接验证了
//	private UIElement TXT_MyElement = new UIElement("","xpath=//XCUIElementTypeStaticText[@name='我']");
	//日期,都需要
	private UIElement TXT_UpdateDate = new UIElement(
			"id=com.souban.creams.debug:id/lastEditDateTv",
			"xpath=//XCUIElementTypeStaticText[@name='我']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeStaticText[2]");
	
	
	
	
	//微楼书预览页元素定位
	//区域商圈
    private UIElement ShowBlockAndBusinessUIElement(String block) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+block+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+block+"']");
	}
	//xpath=//android.view.View[@resource-id='blockName']
	//位置
    private UIElement ShowLocationUIElement(String location) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+location+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+location+"']");
	}
	//xpath=//android.view.View[@resource-id='address']
	//最小价格
    private UIElement ShowMinPriceUIElement(String minPrice) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+minPrice+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+minPrice+"']");
	}
	//xpath=//android.view.View[@reosurce-id='minPrice']
	//最大价格
    private UIElement ShowMaxPriceUIElement(String maxPrice) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+maxPrice+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+maxPrice+"']");
	}
	//xpath=//android.view.View[@reosurce-id='maxPrice']
	//租价单位
    private UIElement ShowPriceUnitUIElement(String unit) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+unit+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+unit+"']");
	}
	//xpath=//android.view.View[@reosurce-id='priceUnit']
	//通知
    private UIElement ShowNoticeUIElement(String notice) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+notice+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+notice+"']");
	}
	//xpath=//android.view.View[@reosurce-id='notice']
	//结佣说明
	private UIElement ShowBrokerageDescriptionUIElement(String description) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+description+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+description+"']");
	}
	//xpath=//android.view.View[@reosurce-id='brokerageDescription']
	//户型套数
    private UIElement ShowRoomCountAllUIElement(String allRoom) {
		return new UIElement(
			"xpath=//android.view.View[@content-desc='全部户型']/following-sibling::android.view.View[1][@content-desc='"+allRoom+"']",
			"xpath=//XCUIElementTypeWebView[@content-desc='全部户型']/following-sibling::android.view.View[1][@content-desc='"+allRoom+"']");
	}
    private UIElement ShowRoomCountAUIElement(String aRoom) {
		return  new UIElement(
			"xpath=//android.view.View[@content-desc='全部户型']/following-sibling::android.view.View[3][@content-desc='"+aRoom+"']",
			"xpath=//XCUIElementTypeWebView[@content-desc='全部户型']/following-sibling::android.view.View[3][@content-desc='"+aRoom+"']");
	}
    private UIElement ShowRoomCountBUIElement(String bRoom) {
		return new UIElement(
			"xpath=//android.view.View[@content-desc='全部户型']/following-sibling::android.view.View[5][@content-desc='"+bRoom+"']",
			"xpath=//XCUIElementTypeWebView[@content-desc='全部户型']/following-sibling::android.view.View[5][@content-desc='"+bRoom+"']");
	}
    private UIElement ShowRoomCountCUIElement(String cRoom) {
		return new UIElement(
			"xpath=//android.view.View[@content-desc='全部户型']/following-sibling::android.view.View[7][@content-desc='"+cRoom+"']",
			"xpath=//XCUIElementTypeWebView[@content-desc='全部户型']/following-sibling::android.view.View[7][@content-desc='"+cRoom+"']");
	}
    private UIElement ShowRoomCountDUIElement(String dRoom) {
	    return new UIElement(
			"xpath=//android.view.View[@content-desc='全部户型']/following-sibling::android.view.View[9][@content-desc='"+dRoom+"']",
			"xpath=//XCUIElementTypeWebView[@content-desc='全部户型']/following-sibling::android.view.View[9][@content-desc='"+dRoom+"']");
	}
	//房源信息
    private  UIElement ShowFloorUIElement(String areaSize,String floor) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+areaSize+"']/preceding-sibling::android.view.View[@content-desc='"+floor+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+areaSize+"']/preceding-sibling::android.view.View[@content-desc='"+floor+"']");
	}
    private  UIElement ShowDecorateUIElement(String areaSize, String decorate) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+areaSize+"']/following-sibling::android.view.View[@content-desc='"+decorate+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+areaSize+"']/following-sibling::android.view.View[@content-desc='"+decorate+"']");
	}
    private  UIElement ShowPriceUIElement(String areaSize, String price) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+areaSize+"']/following-sibling::android.view.View[@content-desc='"+price+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+areaSize+"']/following-sibling::android.view.View[@content-desc='"+price+"']");
	}
	//其他信息
    private UIElement ShowPropertyContentUIElement(String otherInfo) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+otherInfo+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+otherInfo+"']");
	}
	//xpath=//android.view.View[@resource-id='otherMessage']
	//楼盘描述
    private UIElement ShowParkDescriptionUIElement(String description) {
		return new UIElement(
				"xpath=//android.view.View[@content-desc='"+description+"']",
				"xpath=//XCUIElementTypeWebView[@content-desc='"+description+"']");
	}

	//微楼书分享
	private UIElement BTN_share = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/shareTv' and @text='分享']",
			"xpath=//XCUIElementTypeStaticText[@name='分享']");
    private UIElement TXT_permitPage = new UIElement("","xpath=//XCUIElementTypeStaticText[@name='我们需要使用您的相册以启用相关功能']");
    private UIElement BTN_picturePermit = new UIElement("","xpath=//XCUIElementTypeButton[@name='好']");
	private  UIElement TXT_sharePage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/titleTv' and @text='分享链接']",
			"xpath=//XCUIElementTypeStaticText[@name='分享链接']");


	//微楼书切换背景
	private UIElement BTN_switchBackground = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/switchBgTv' and @text='切换背景']",
			"xpath=//XCUIElementTypeStaticText[@name='切换背景']");
	private UIElement TXT_switchbackgroundPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/titleTv' and @text='切换背景']",
			"xpath=//XCUIElementTypeStaticText[@name='切换背景']");


	//微楼书分享页和切换背景页的取消按钮
	private UIElement BTN_cancel = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/cancelBtn' and @text='取消']",
			"xpath=//XCUIElementTypeButton[@name='取消']");





	//点击微楼书库
	public void clickMircoBuildingLibrary() {
		this.driver.waitAndClick(TXT_mircoBookLibrary, 2);
	}

	//断言-----进入微楼书列表
	public boolean intoMircoBuildingLibraryPage() {
		return this.driver.waitForElement(TXT_mircoBookLibraryPage, 2);
	}

	//点击添加按钮进入新建微楼书页面
	public void clickAddButton() {
		this.driver.waitAndClick(BTN_add, 2);
	}
	
	//断言-----进入新建微楼书页
	public boolean intoCreateMicrobookPage() {
		return this.driver.waitForElement(TXT_CreateMicrobookPage, 2);
	}
	
	//点击搜索楼盘进入搜索页
	public void IntoSearchParkPage(){
		this.driver.click(BTN_SearchPark);
	}
	
	//输入搜索楼盘的关键字
	public void InputParkKeyword(String keyword){
		this.driver.elementSendText(INP_SearchPark, keyword);
	}
	
	//选择楼盘
	public void SelectPark(String park){
		this.driver.waitAndClick(this.ParkUIElement(park), 2);
//		this.driver.hideKeyBoard();
	}
	
	//检查回填的楼盘名称
	public String CheckParkName(){
		this.driver.sleep(2000);
		return this.driver.elementGetText(INP_ParkName);
	}
	
	//检查回填的楼盘图片数量
	public String CheckParkPhoto(){
		return this.driver.elementGetText(TXT_ParkPhotoCount);
	}
	
	//检查回填的所在位置
	public String CheckAddress(){
		return this.driver.elementGetText(TXT_Address);
	}
	
	//检查回填的所属商圈
	public String CheckBlock(){
		return this.driver.elementGetText(TXT_Block);
	}
	
	//检查在租价格
	public String CheckPrice(){
		return this.driver.elementGetText(INP_MinPrice) + "," + this.driver.elementGetText(INP_MaxPrice) + "," + this.driver.elementGetText(TXT_PriceUnit);
	}
	
	//通知
	public void InputNotice(String notice){
		this.driver.elementClearSendText(INP_Notice, notice);
		try {
			if(this.driver.isElementFound(BTN_complete)) {
				this.driver.click(BTN_complete);
			}
		} catch (Exception e) {
			System.out.println("未找到该元素");
		}
	}
	
	//检查通知的字符个数
	public String CheckNoticeCount(){
		return this.driver.elementGetText(TXT_NoticeCount);
	}
	
	// 结佣说明
	public void InputBrokerageDescription(String brokerage){
		this.driver.swipeToUpToFindElement(INP_BrokerageDescription);
		this.driver.elementClearSendText(INP_BrokerageDescription, brokerage);
		try {
			if(this.driver.isElementFound(BTN_complete)) {
				this.driver.click(BTN_complete);
			}
		} catch (Exception e) {
			System.out.println("未找到该元素");
		}
	}
	
	//检查结佣说明的字符个数
	public String CheckBrokerageCount(){
		this.driver.swipeToUpToFindElement(TXT_BrokerageCount);
		return this.driver.elementGetText(TXT_BrokerageCount);
	}
	
	//开启结佣说明显示
	public void OpenBrokerageShow(){
		this.driver.swipeToUpToFindElement(BTN_Switch);
		this.driver.waitAndClick(BTN_Switch, 2);
	}
	
	//进入选择楼宇列表
	public void IntoSelectBuildingPage(){
		this.driver.swipeToUpToFindElement(BTN_AddRoom);
		this.driver.waitAndClick(BTN_AddRoom, 2);
	}
	
	//选择楼宇
	public void SelectBuilding(String building){
		this.driver.waitAndClick(this.LST_BuildingElement(building), 2);
	}
	
	//点击确定进入选择房源页面
	public void IntoSelectRoomPage(){
		this.driver.click(BTN_Confirm);
	}
	
	//选择房源
	public void SelectRoom(){
		this.driver.waitAndClick(BTN_AllSelect, 2);
	}
	
	//点击导入回到微楼书编辑页面
	public void ClickImport(){
		this.driver.click(BTN_Import);
	}
	
	//检查导入的房源信息
	//android
	public String CheckRoomInfo_android(String roomNumber){
		this.driver.sleep(1000);
		this.driver.swipeToUpToFindElement(this.TXT_Fitment(roomNumber));
		return this.driver.elementGetText(this.TXT_FloorElement(roomNumber)) + "," + this.driver.elementGetText(this.TXT_PriceElement(roomNumber)) + "," + 
				this.driver.elementGetText(this.TXT_AreaSizeElement(roomNumber)) + "," + this.driver.elementGetText(this.TXT_BuildingElement(roomNumber)) + "," + 
		this.driver.elementGetText(this.TXT_Fitment(roomNumber));
	}
	//检查导入的房源信息
	//ios
	public String CheckRoomInfo_ios(String roomNumber){
		this.driver.sleep(1000);
		this.driver.swipeToUpToFindElement(this.TXT_RoomNumberElement(roomNumber));
		return this.driver.elementGetText(this.TXT_PriceElement(roomNumber)) + "," + this.driver.elementGetText(this.TXT_AreaSizeElement(roomNumber)) + "," + 
		this.driver.elementGetText(this.TXT_BuildingElement(roomNumber)) + "," + this.driver.elementGetText(this.TXT_Fitment(roomNumber));
		}
	
	//检查面积段套数
	//android
	public List<String> AreaSizeCount(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}
	public List<String> CheckAreaSizeCountForAndroid(){
		return this.AreaSizeCount(TXT_AreaSizeCount);
	}
	//ios
	public String  checkAreaSizeCountForIos() {
		return this.driver.elementGetText(TXT_AreaSizeCountOne)+","+this.driver.elementGetText(TXT_AreaSizeCountTwo)
		+","+this.driver.elementGetText(TXT_AreaSizeCountThree)+","+this.driver.elementGetText(TXT_AreaSizeCountFour)
		+","+this.driver.elementGetText(TXT_AreaSizeCountFive)+","+this.driver.elementGetText(TXT_AreaSizeCountSix);
	}
	
	//编辑其他信息
	public void IntoOtherInfoPage(){
		this.driver.swipeToUpToFindElement(BTN_EditOtherInfo);
		this.driver.waitAndClick(BTN_EditOtherInfo, 2);
	}
	public void InputPropertyContent(String content){
		this.driver.elementSendText(INP_PropertyContent, content);
	}
	public void clickSaveButton() {
		this.driver.waitAndClick(BTN_save_otherInfo, 1);
	}
	
	//检查楼盘描述
	public String CheckParkDescription(){
		this.driver.sleep(1000);
		this.driver.swipeToUpToFindElement(INP_ParkDescription);
		return this.driver.elementGetText(INP_ParkDescription);
	}
	public String CheckParkDescriptionCount(){
		this.driver.swipeToUpToFindElement(TXT_ParkDescriptionCount);
		return this.driver.elementGetText(TXT_ParkDescriptionCount);
	}
	
	//检查个人帐户信息
	public String CheckAccountInfo(){
		this.driver.swipeToUpToFindElement(TXT_Wechat);
		return this.driver.elementGetText(TXT_Name) + "," + this.driver.elementGetText(TXT_Tel) + "," + this.driver.elementGetText(TXT_Wechat);
	}
	
	//保存微楼书
	public void ClickSave(){
		this.driver.sleep(2000);
		this.driver.click(BTN_save);
	}
	public String CheckDefaultName(){
		this.driver.waitForElement(INP_name, 2);
		return this.driver.elementGetText(INP_name);
	}
	public void InputBookName(String bookName){
		this.driver.elementClearSendText(INP_name, bookName);
		try {
			if(this.driver.isElementFound(BTN_complete)) {
				this.driver.click(BTN_complete);
			}
		} catch (Exception e) {
			System.out.println("未找到该元素");
		}
	}

	//点击微楼书命名页的确定按钮
	public void clickSureButton() {
		this.driver.waitAndClick(BTN_ensure, 2);
		this.driver.sleep(5000);
	}
	
	//检查微楼书创建成功
	//android
	public boolean CheckCreateMicrobookResult_android(String parkName){
		return this.driver.waitForElement(this.TXT_BuildingNameElement(parkName), 5);
	}
	//ios
	public boolean CheckCreateMicrobookResult_ios(String microBookName) {
		return this.driver.waitForElement(this.TXT_MicroBookElement(microBookName), 5);
//		return this.driver.elementGetText(this.TXT_MicroBookElement(microBookName));
	}
		
	//删除微楼书
	//ios---需要进入微楼书预览页
	public void intoMicroBook(String microBookName) {
		this.driver.waitAndClick(this.TXT_MicroBookElement(microBookName), 2);
		this.driver.sleep(3000);
	}
	public void ClickMoreButton(){
		this.driver.waitAndClick(BTN_More, 2);
	}
	public void clickDeleteButton() {
		this.driver.waitAndClick(BTN_delete, 2);
	}
	public void clickConfirmButton() {
		this.driver.waitAndClick(BTN_confirm, 2);
		this.driver.sleep(2000);
	}
	public boolean checkMyMicroBook(String microBookName) {
		return this.driver.isElementFound(this.TXT_MicroBookElement(microBookName));
	}
	
	//微楼书列表查看新建的微楼书-----android需要,ios只需要CheckUpdateDate
	public void clickBackButton() {
		this.driver.waitAndClick(BTN_back, 2);
		this.driver.sleep(2000);
	}
	
	public boolean CheckMyMicrobook(String microBookName){
		this.driver.sleep(2000);
		return this.driver.waitForElement(this.TXT_MicroBookElement(microBookName), 2);
	}
	
	public boolean CheckMy(String microBookName){
		return this.driver.waitForElement(this.TXT_MyElement(microBookName), 2);
	}
	public String CheckUpdateDate(){
		return this.driver.elementGetText(TXT_UpdateDate);
	}
	
	
	
	//检查微楼书预览页
	public boolean checkBlock(String block) {
		return this.driver.isElementFound(this.ShowBlockAndBusinessUIElement(block));
	}
	
	public boolean checkLocation(String location) {
		return this.driver.isElementFound(this.ShowLocationUIElement(location));
	}
	public boolean checkMinPrice(String minPrice) {
		return this.driver.isElementFound(this.ShowMinPriceUIElement(minPrice));
	}
	public boolean checkMaxPrice(String maxPrice) {
		return this.driver.isElementFound(this.ShowMaxPriceUIElement(maxPrice));
	}
	public boolean checkUnit(String unit) {
		return this.driver.isElementFound(this.ShowPriceUnitUIElement(unit));
	}
	public boolean checkNotice(String notice) {
		return this.driver.isElementFound(this.ShowNoticeUIElement(notice));
	}
	public boolean checkBrokerageDescription(String description) {
		this.driver.swipeToUpToFindElement(this.ShowBrokerageDescriptionUIElement(description));
		return this.driver.isElementFound(this.ShowBrokerageDescriptionUIElement(description));
	}
	public boolean checkRoomAllCount(String dRoom, String allRoom) {
		this.driver.swipeToUpToFindElement(this.ShowRoomCountAllUIElement(dRoom));
		return this.driver.isElementFound(this.ShowRoomCountAllUIElement(allRoom));
	}
	public boolean checkRoomACount(String aRoom) {
		return this.driver.isElementFound(this.ShowRoomCountAllUIElement(aRoom));
	}
	public boolean checkRoomBCount(String bRoom) {
		return this.driver.isElementFound(this.ShowRoomCountAllUIElement(bRoom));
	}
	public boolean checkRoomCCount(String cRoom) {
		return this.driver.isElementFound(this.ShowRoomCountAllUIElement(cRoom));
	}
	public boolean checkRoomDCount(String dRoom) {
		return this.driver.isElementFound(this.ShowRoomCountAllUIElement(dRoom));
	}
	public boolean checkRoomFloor(String areaSize, String floor) {
		this.driver.swipeToUpToFindElement(this.ShowFloorUIElement(areaSize, floor));
		return this.driver.isElementFound(this.ShowFloorUIElement(areaSize, floor));
	}
	public boolean checkRoomDecorate(String areaSize, String decorate) {
		return this.driver.isElementFound(this.ShowDecorateUIElement(areaSize, decorate));
	}
	public boolean checkRoomPrice(String areaSize, String price) {
		return this.driver.isElementFound(this.ShowPriceUIElement(areaSize, price));
	}
	public boolean checkOtherInformation(String otherInfo) {
		this.driver.swipeToUpToFindElement(this.ShowPropertyContentUIElement(otherInfo));
		return this.driver.isElementFound(this.ShowPropertyContentUIElement(otherInfo));
	}
	public boolean checkParkDescription(String description) {
		this.driver.swipeToUpToFindElement(this.ShowParkDescriptionUIElement(description));
		return this.driver.isElementFound(this.ShowParkDescriptionUIElement(description));
	}
	
	
	
	
	//编辑微楼书
	//点击删除按钮
	public void clickEditButton() {
		this.driver.waitAndClick(BTN_edit, 1);
	}
	//进入编辑微楼书页
	public boolean intoEditPage() {
		return this.driver.waitForElement(TXT_EditMicrobookPage, 1);
	}
	//修改楼盘名称
	public void editParkName(String parkName) {
		this.driver.elementClearSendText(INP_ParkName, parkName);
		this.driver.sleep(3000);
	}
	public boolean checkEdit(String parkName) {
		return this.driver.isElementFound(this.TXT_BuildingNameElement(parkName));
	}
	
	
	
	//手动填写信息新建微楼书
	//common
	//输入楼盘名称
	public void inputParkName(String parkName) {
		this.driver.elementClearSendText(INP_ParkName, parkName);
	}
	
	//common
	//点击上传照片入口
	public void clickUploadPicture() {
		this.driver.waitAndClick(BTN_uploadPicture, 1); 
	}
	//android
	//选择照片来源
	public void selectPictureSource() {
		this.driver.waitAndClick(BTN_selectShutterPicture, 1);
	}
	//android
	//跳过权限及拍照
	public void ShutterPicture() {
		try {
			for(int i=0;i<3;i++) {
				if(this.driver.isElementFound(BTN_permit)) {
					this.driver.click(BTN_permit);
				}else if(this.driver.isElementFound(BTN_shutter)){
					System.out.println("已跳过权限!");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			this.driver.click(BTN_nextPage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.driver.waitAndClick(BTN_shutter, 1); //拍照
		this.driver.waitAndClick(BTN_selectPicture, 1); //选择照片
	}
	//ios
	//跳过权限及选择照片
	public void selectPicture() {
		try {
			for(int i=0;i<3;i++) {
				if(this.driver.isElementFound(BTN_permit)) {
					this.driver.click(BTN_permit);
				}else if(this.driver.isElementFound(BTN_shutter)){
					System.out.println("已跳过权限!");
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.driver.waitAndClick(BTN_selectPicture, 2);
		this.driver.waitAndClick(BTN_pictureSure, 2);
	}
	
	
	
	//common
	//所在位置入口
	public void intoLocation() {
		this.driver.waitAndClick(TXT_Address, 1);
	}
	//android
	//输入地址
	public void inputAddress(String address) {
		try {
			if(this.driver.isElementFound(BTN_permit)) {
				this.driver.click(BTN_permit);
			}else {
				System.out.println("over");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.driver.elementClearSendText(INP_address, address);
	}
	//ios
	//输入地址
	public void inputAddress_ios(String address) {
		try {
			if(this.driver.isElementFound(BTN_permit)) {
				this.driver.click(BTN_permit);
			}else {
				System.out.println("over");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.driver.elementClearSendText(INP_address, address);
		this.driver.waitAndClick(BTN_search, 2);
	}
	//common
	//选择位置
	public void selectLocation(String location) {
		this.driver.waitAndClick(this.SelectLocationUIElement(location), 2);
		this.driver.waitAndClick(BTN_ensure_location, 2);
	}

	


	//common
	//最低在租价格
	public void inputMinPrice(String minPrice) {
		this.driver.waitAndClick(INP_MinPrice, 1);
		this.driver.elementClearSendText(INP_MinPrice, minPrice);
	}
	//common
	//最高在租价格
	public void inputMaxPrice(String maxPrice) {
		this.driver.waitAndClick(INP_MaxPrice, 1);
		this.driver.elementClearSendText(INP_MaxPrice, maxPrice);
	}
	//android
	//修改在租价格单位
	public void selectPriceUnit(String priceUnit) {
		this.driver.waitAndClick(BTN_arrowDown1, 1);
		this.driver.waitAndClick(this.PriceUnitUIElement(priceUnit), 1);
	}
	//ios
	//修改在租价格单位
	public void selectPriceUnit_ios(String priceUnit) {
		this.driver.waitAndClick(TXT_PriceUnit, 1);
		this.driver.elementSendText(this.PriceUnitUIElement(priceUnit), priceUnit);
		this.driver.waitAndClick(BTN_unitSure, 2);
	}

	
	
	//common
	//填写最新通知
	public void inputInform(String inform) {
		// this.driver.waitAndClick(INP_inform, 1);
		this.driver.elementClearSendText(INP_Notice, inform);
		try {
			if(this.driver.isElementFound(BTN_complete)) {
				this.driver.click(BTN_complete);
			}
		} catch (Exception e) {
			System.out.println("未找到该元素");
		}
	}

	
	
	//common
	//填写结佣说明
	public void inputCommission(String commission) {
		this.driver.swipeToUpToFindElement(INP_BrokerageDescription);
		this.driver.elementClearSendText(INP_BrokerageDescription, commission);
		try {
			if(this.driver.isElementFound(BTN_complete)) {
				this.driver.click(BTN_complete);
			}
		} catch (Exception e) {
			System.out.println("未找到该元素");
		}
	}
	//android
	//开启结佣说明浏览页显示按钮
	public void openCommissionShowButton() {
		this.driver.swipeToUpToFindElement(BTN_isNotShow)	;	
		try {
			if (this.driver.waitForElement(BTN_isNotShow, 2)) {
				this.driver.click(BTN_isNotShow);
			} else if (this.driver.waitForElement(BTN_isShow, 2)) {
				System.out.println("已开启结佣说明展示按钮");
			} else {
				System.out.println("元素未找到,发生未知错误!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//common
	//点击房源导入按钮
	public void clickAddRoomButton() {
		this.driver.swipeToUpToFindElement(BTN_AddRoom);
		this.driver.waitAndClick(BTN_AddRoom, 1);
	}
	//common
	//进入楼宇列表
	public boolean intoSelectBuildingPage() {
		return this.driver.waitForElement(TXT_selectBuildPage, 2);
	}
	//common
	//选择楼宇
	public void selectBuilding(String buildingName) {
		this.driver.waitAndClick(this.LST_BuildingElement(buildingName), 1);
		this.driver.waitAndClick(BTN_Confirm, 1);
	}
	//common
	//进入房源页
	public boolean intoSelectRoomPage() {
		return this.driver.waitForElement(TXT_selectRoomPage, 2);
	}
	//common
	//选择房源
	public void selectRoom(String room) {
		this.driver.waitAndClick(this.SelectRoomUIElement(room), 2);
		this.driver.waitAndClick(BTN_Import, 1);
	}
	//common
	//其他信息
	public void clickOtherInformation() {
		this.driver.swipeToUpToFindElement(BTN_EditOtherInfo);
		this.driver.waitAndClick(BTN_EditOtherInfo, 1);
	}
	//common
	//进入其他信息页
	public boolean intoOtherInformation() {
		return this.driver.waitForElement(TXT_otherInformationPage, 2);
	}
	//common
	//物业费
	public void inputPropertyFee(String propertyFee) {
		this.driver.elementClearSendText(INP_PropertyContent, propertyFee);
	}
	//common
	//取暖费
	public void inputHeatingFee(String heatingFee) {
		this.driver.elementClearSendText(INP_heatingFee,heatingFee);
	}
	//common
	//停车费
	public void inputParkingFee(String parkingFee) {
		this.driver.elementClearSendText(INP_parkingFee, parkingFee);
	}
	//common
	//保存其他信息
	public void saveOtherInformation() {
		this.driver.waitAndClick(BTN_save_otherInfo, 1);
	}
	
	//common
	//填写楼盘描述
	public void inputParkDescribe(String parkDescribe) {
		this.driver.swipeToUpToFindElement(INP_ParkDescription);
		this.driver.elementClearSendText(INP_ParkDescription, parkDescribe);
	}


	/**
	 * 微楼书分享
	 */
	public void clickShare(){
		this.driver.waitAndClick(BTN_share,2);
	}

	//ios
	//弹出权限弹窗
	public boolean intoPermitPage(){
		return this.driver.waitForElement(TXT_permitPage,2);
	}

	//ios
	//允许权限
	public void allowPermit(){
		this.driver.waitAndClick(BTN_picturePermit,2);
	}

	public boolean intoSharePage(){
		return this.driver.waitForElement(TXT_sharePage,10);
	}




	/**
	 * 微楼书切换背景
	 */
	public void clickswitchBackground(){
		this.driver.waitAndClick(BTN_switchBackground,2);
	}

	public boolean intoSwitchBackground(){
		return this.driver.waitForElement(TXT_switchbackgroundPage,5);
	}


	/**
	 * 微楼书分享页和切换背景的取消按钮
	 */
	public void clickCancel(){
		this.driver.waitAndClick(BTN_cancel,2);
	}

}
