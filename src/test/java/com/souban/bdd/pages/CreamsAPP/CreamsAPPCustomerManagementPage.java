package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

import java.util.List;

public class CreamsAPPCustomerManagementPage extends ParentPage {

	public CreamsAPPCustomerManagementPage(Driver driver) {
		super(driver);
	}

	/*
	 * 新建客户
	 */
	//导航页-客户管理
	private UIElement TXT_customerManager = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/customerTv']",
			"xpath=//XCUIElementTypeStaticText[@name='客户管理']");
	//客户管理新建客户入口
	private UIElement TXT_addNewCustomer = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/addIv']",
			"xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem Add']");
	//进入新建客户页
	private UIElement TXT_newCustomerPage = new UIElement(
			"xpath=//android.widget.TextView[@text='新建客户']",
			"xpath=//XCUIElementTypeOther[@name='新建客户']");
	//租客姓名
	private UIElement INP_name = new UIElement(
			"xpath=//android.widget.EditText[@text='请填写姓名或公司' and @resource-id='com.souban.creams.debug:id/nameEt']",
			"xpath=//XCUIElementTypeStaticText[@name='租客']/following-sibling::XCUIElementTypeTextField");
	//行业类型显示框
	private UIElement TXT_industry = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/industryTv']",
			"xpath=//XCUIElementTypeStaticText[@name='行业']/following-sibling::XCUIElementTypeTextField[1]") ;
	//NumberPicker
	private UIElement TXT_numberPicker = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='android:id/numberpicker_input']/parent::android.widget.NumberPicker",
			"xpath=//*[@type = 'XCUIElementTypePickerWheel']");
	//单个滚轮页的确人按钮
	private UIElement BTN_confirm_NumberPicker = new UIElement(
			"xpath=//android.widget.TextView[@text='确认' and @resource-id='com.souban.creams.debug:id/confirmTv']",
			"xpath=//XCUIElementTypeButton[@name='确定']");
	//租客联系人显示框
	private UIElement TXT_contact = new UIElement(
			"xpath=//android.widget.TextView[@text='请填写租客联系人' and @resource-id='com.souban.creams.debug:id/contactTv']",
			"xpath=//XCUIElementTypeStaticText[@name='租客联系人']/following-sibling::XCUIElementTypeImage[@name='Merchant_Indicator_Right']");
	//租客联系人搜索框的输入框
	private UIElement INP_toolbar_contact = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//XCUIElementTypeSearchField[@name='请输入租客联系人姓名']");
	//搜索结果显示列表
	private UIElement SelectContactUIElement(String nameAndCompany) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/nameTv' and @text='"+nameAndCompany+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+nameAndCompany+"']");
	}
	//ios----租客联系人保存按钮,android不需要点击保存
	private UIElement BTN_save_contact = new UIElement(
			"",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	//预计签约时间显示框
	private UIElement TXT_expectDate = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/expectDateTv']",
			"xpath=//XCUIElementTypeStaticText[@name='预计签约时间']/following-sibling::XCUIElementTypeTextField");
	//来访时间显示框
	private UIElement TXT_VisitingTime = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/visitDateTv']",
			"xpath=//XCUIElementTypeStaticText[@name='来访时间']/following-sibling::XCUIElementTypeTextField[1]");
	//pickerWheel---year
	private UIElement TXT_pickerWheel_year = new UIElement(
			"xpath=//android.widget.LinearLayout[@resource-id='android:id/pickers']/child::android.widget.NumberPicker[1]",
			"xpath=//XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]");
	//pickerWheel---month
	private UIElement TXT_pickerWheel_month = new UIElement(
			"xpath=//android.widget.LinearLayout[@resource-id='android:id/pickers']/child::android.widget.NumberPicker[2]",
			"xpath=//XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[2]");
	//pickerWheel---day
	private UIElement TXT_pickerWheel_day = new UIElement(
			"xpath=//android.widget.LinearLayout[@resource-id='android:id/pickers']/child::android.widget.NumberPicker[3]",
			"xpath=//XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]");
	//三个滚轮页面的确人按钮
	private UIElement BTN_confirm_pickerWheel = new UIElement(
			"xpath=//android.widget.TextView[@text='确认' and @resource-id='com.souban.creams.debug:id/confirmTv']",
			"xpath=//XCUIElementTypeButton[@name='确定']");
	//最小需求面积
	private UIElement INP_minDemandSize = new UIElement(
			"xpath=//android.widget.EditText[@text='最小面积' and @resource-id='com.souban.creams.debug:id/minDemandSizeEt']",
			"xpath=//XCUIElementTypeStaticText[@name='需求面积']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeTextField[1]");
	//最大需求面积
	private UIElement INP_maxDemandSize = new UIElement(
			"xpath=//android.widget.EditText[@text='最大面积' and @resource-id='com.souban.creams.debug:id/maxDemandSizeEt']",
			"xpath=//XCUIElementTypeStaticText[@name='需求面积']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeTextField[2]");
	//ios隐藏数字键盘
	private UIElement BTN_hideKeyBoard = new UIElement(
			"xpath=//*[@text='完成']",
			"xpath=//XCUIElementTypeButton[@name='Toolbar Done Button']");
	//租客状态显示框
	private UIElement TXT_status = new UIElement(
			"xpath=//android.widget.TextView[@text='初次接触' and @resource-id='com.souban.creams.debug:id/statusTv']",
			"xpath=//XCUIElementTypeStaticText[@name='租客状态']/following-sibling::XCUIElementTypeTextField[1]") ;
	//来访渠道显示框
	private UIElement TXT_channelType = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/channelTv']",
			"xpath=//XCUIElementTypeStaticText[@name='来访渠道']/following-sibling::XCUIElementTypeTextField[1]");
	//渠道联系人显示框
	private UIElement TXT_agent = new UIElement(
			"xpath=//android.widget.TextView[@text='请填写渠道联系人' and @resource-id='com.souban.creams.debug:id/agentTv']",
			"xpath=//XCUIElementTypeStaticText[@name='渠道联系人']/following-sibling::XCUIElementTypeImage[@name='Merchant_Indicator_Right']");
	//渠道联系人搜索框
	private UIElement INP_toolbar_channel = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//XCUIElementTypeSearchField[@name='请输入渠道联系人姓名']");
	//渠道搜索结果显示列表
	private UIElement SelectAgentUIElement(String agentName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/nameTv' and @text='"+agentName+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+agentName+"']");
	}
	//ios----渠道联系人搜索页的保存按钮
	private UIElement BTN_save_channel = new UIElement(
			"",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	//备注
	private UIElement INP_note = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/noteEt']",
			"xpath=//XCUIElementTypeStaticText[@name='备注']/following-sibling::XCUIElementTypeTextView[1]");
	//选择房源入口
	private UIElement TXT_room = new UIElement(
			"xpath=//android.widget.FrameLayout[@resource-id='com.souban.creams.debug:id/roomLayout']",
			"xpath=//*[@value='选择楼宇/房源']");
	//挑选房源
	private UIElement SelectRoomUIElement(String buildingName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/nameTv' and @text='"+buildingName+"']/parent::android.widget.RelativeLayout[@resource-id='com.souban.creams.debug:id/contentLayout']/preceding-sibling::android.widget.CheckBox[@resource-id='com.souban.creams.debug:id/checkBox']",
				"xpath=//XCUIElementTypeStaticText[@name='"+buildingName+"']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeButton[@name='Merchant Button Checkbox UnSel']");
	}
	//选择楼宇页面的确定按钮----感觉像是保存
	private UIElement BTN_buildSure = new UIElement(
			"xpath=//android.widget.TextView[@text='确定' and @resource-id='com.souban.creams.debug:id/saveTv']",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	//android----显示更多,ios-------展开
	private UIElement BTN_displayMore = new UIElement(
			"xpath=//android.widget.TextView[@text='显示更多' and @resource-id='com.souban.creams.debug:id/moreTv']",
			"xpath=//XCUIElementTypeButton[@name='展开']");
	//城市/区域/商圈显示框
	private UIElement TXT_location = new UIElement(
			"xpath=//android.widget.TextView[@text='请选择城市/区域/商圈' and @resource-id='com.souban.creams.debug:id/locationTv']",
			"xpath=//XCUIElementTypeStaticText[@value='城市/区域/商圈']");
	//商圈搜索框
	private UIElement INP_toolbar_location = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='请输入城市/区域/商圈']",
			"xpath=//XCUIElementTypeSearchField[@name='请输入城市/区域/商圈名字']");
	//商圈结果显示列表
	private UIElement SelectLocationUIElement(String location) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv' and @text='"+location+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+location+"']");
	}
	//android是确定按钮,ios显示的是保存按钮
	private UIElement BTN_sure = new UIElement(
			"xpath=//android.widget.TextView[@text='确定' and @resource-id='com.souban.creams.debug:id/confirmTv']",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	//最小期望价格
	private UIElement INP_minPrice = new UIElement(
			"xpath=//android.widget.EditText[@text='最小价格' and @resource-id='com.souban.creams.debug:id/minPriceEt']",
			"xpath=//XCUIElementTypeStaticText[@name='期望价格']/preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
	//最大期望价格
	private UIElement INP_maxPrice = new UIElement(
			"xpath=//android.widget.EditText[@text='最大价格' and @resource-id='com.souban.creams.debug:id/maxPriceEt']",
			"xpath=//XCUIElementTypeStaticText[@name='期望价格']/preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]");
	//期望价格单位入口
	private UIElement BTN_expectPriceUnit = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/expectPriceUnitTv']",
			"xpath=//XCUIElementTypeStaticText[@name='期望价格']/preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	//期望价格单位
	private UIElement ExpectPriceUnitUIElement(String priceUnit) {
		return new UIElement(
				"",
				"xpath=//XCUIElementTypeStaticText[@name='"+priceUnit+"']"); }
	//当前地址
	private UIElement INP_curLocation = new UIElement(
			"xpath=//android.widget.EditText[@text='请输入当前地址' and @resource-id='com.souban.creams.debug:id/curLocationTv']",
			"xpath=//XCUIElementTypeStaticText[@name='当前地址']/following-sibling::XCUIElementTypeTextField[1]");
	//当前合同到期日
	private UIElement TXT_exporeDate = new UIElement(
			"xpath=//android.widget.TextView[@text='请选择合同到期日' and @resource-id='com.souban.creams.debug:id/expireDateTv']",
			"xpath=//*[@value='请选择合同到期日']");
	//当前面积
	private UIElement INP_curSize = new UIElement(
			"xpath=//android.widget.EditText[@text='请输入当前面积' and @resource-id='com.souban.creams.debug:id/curSizeEt']",
			"xpath=//XCUIElementTypeStaticText[@name='当前面积']/following-sibling::XCUIElementTypeTextField[1]");
	//当前租金
	private UIElement INP_curPrice = new UIElement(
			"xpath=//android.widget.EditText[@text='请输入当前租金' and @resource-id='com.souban.creams.debug:id/curPriceEt']",
			"xpath=//XCUIElementTypeStaticText[@name='当前租金']/following-sibling::XCUIElementTypeTextField[1]");
	//新建客户页的保存按钮
	private UIElement BTN_save = new UIElement(
			"xpath=//*[@text='保存' and @resource-id='com.souban.creams.debug:id/saveTv']",
			"xpath=//XCUIElementTypeButton[@name='保存']");


	/*
	 * 客户管理列表中的断言以及检查数据
	 */
	//租客姓名
	private UIElement NameUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1][@resource-id='com.souban.creams.debug:id/companyTv' and @text='"+name+"']",
				"xpath=//XCUIElementTypeCell[1]//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1][@name='"+name+"']");
	}
	//租客状态
	private UIElement StatusUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1][@text='"+name+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/statusTv']",
				"xpath=//*[@name='"+name+"']/following-sibling::XCUIElementTypeStaticText[1]");
	}
	//租赁顾问
	private UIElement ConsultantUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1][@text='"+name+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/creatorNameTv']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[4]");
	}
	//来访时间
	private UIElement VisitingTimeUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1][@text='"+name+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/visitDateTv']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[5]");
	}
	//需求面积段
	private UIElement DemandAreaUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1][@text='"+name+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/intentAreaSizeTv']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[6]");
	}
	//渠道类型
	private UIElement ChannelTypeUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1][@text='"+name+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/sourceTypeTv']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[3]");
	}
	//意向房源
	private UIElement HouseUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1][@text='"+name+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/demandRoomTv']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[4]");
	}
	//最新备注
	private UIElement NoteUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1][@text='"+name+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[3]/android.widget.TextView[@resource-id='com.souban.creams.debug:id/remarkTv']",
				"xpath=//*[@name='"+name+"']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[3]//XCUIElementTypeStaticText[2]");
	}


	/*
	 * 在客户详情中检查数据
	 */
	//概要信息
	//客户详情页
	private UIElement TXT_detailPageTitle = new UIElement(
			"xpath=//android.widget.TextView[@text='客户详情' and @resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//XCUIElementTypeOther[@name='客户详情']");
	//租客姓名
	private UIElement TXT_detailBasicName = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/nameTv']",
			"xpath=//XCUIElementTypeStaticText[@name='租客']/following-sibling::XCUIElementTypeStaticText[2]");
	//成交几率
	private UIElement TXT_detailBasicPercent = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/percentTv']",
			"xpath=//XCUIElementTypeStaticText[@name='租客']/following-sibling::XCUIElementTypeOther[1]");
	//租客状态
	private UIElement TXT_detailBasicStatus = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/statusTv']",
			"xpath=//XCUIElementTypeStaticText[@name='需求面积段']/following-sibling::XCUIElementTypeStaticText[1]");
	//需求面积段
	private UIElement TXT_detailBasicAreaSize = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/areaSizeTv']",
			"xpath=//XCUIElementTypeStaticText[@name='需求面积段']/following-sibling::XCUIElementTypeOther[1]");
	//租赁顾问
	private UIElement TXT_detailBasicConsultant = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/consultantTv']",
			"xpath=//XCUIElementTypeStaticText[@name='租赁顾问']/following-sibling::XCUIElementTypeStaticText[1]");
	
	
	
	//租客信息
	//租客联系人
	private UIElement TXT_detailContactContactName = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv']",
			"xpath=//XCUIElementTypeStaticText[@name='租客联系人']/preceding-sibling::XCUIElementTypeCollectionView[1]//XCUIElementTypeStaticText[1]");
	//需求面积
	private UIElement TXT_detailContactDemandAreaSize = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/demandAreaSizeTv']",
			"xpath=//XCUIElementTypeStaticText[@name='需求面积']/following-sibling::XCUIElementTypeStaticText[1]");
	//租客状态
	private UIElement TXT_detailContactStatus = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/statusInfoTv']",
			"xpath=//XCUIElementTypeStaticText[@name='需求面积']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");
	//来访渠道
	private UIElement TXT_detailContactChannelType = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/channelTv']",
			"xpath=//XCUIElementTypeStaticText[@name='来访渠道']/following-sibling::XCUIElementTypeStaticText[1]");
	//行业
	private UIElement TXT_detailContactIndustry = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/industryTv']",
			"xpath=//XCUIElementTypeStaticText[@name='行业']/following-sibling::XCUIElementTypeStaticText[1]");
	//预计入驻时间
	private UIElement TXT_detailContactExpectDate = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/expectDateTv']",
			"xpath=//XCUIElementTypeStaticText[@name='预计入住时间']/following-sibling::XCUIElementTypeStaticText[1]");
	//来访时间
	private UIElement TXT_detailContactVisitDate = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/visitDateTv']",
			"xpath=//XCUIElementTypeStaticText[@name='来访时间']/following-sibling::XCUIElementTypeStaticText[1]");
	//渠道联系人
	private UIElement TXT_detailContactChannelContact = new UIElement(
			"xpath=//android.widget.ListView[@resource-id='com.souban.creams.debug:id/agentLv']//android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv']",
			"xpath=//XCUIElementTypeStaticText[@name='渠道联系人']/preceding-sibling::XCUIElementTypeCollectionView[1]//XCUIElementTypeStaticText[1]");
	//商圈
	private UIElement TXT_detailContactLocation = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/demandLocationTv']",
			"xpath=//XCUIElementTypeStaticText[@name='城市/区域/商圈']/following-sibling::XCUIElementTypeStaticText[1]");

	


	//房源信息
	//楼盘名称
	private UIElement TXT_detailHouseName = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/buildingNameTv']",
			"xpath=//XCUIElementTypeStaticText[@name='房源信息']/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");

	


	//租客当前信息
	//当前地址
	private UIElement TXT_detailCurrentAddress = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/currentAddressTv']",
			"xpath=//XCUIElementTypeStaticText[@name='当前地址']/following-sibling::XCUIElementTypeStaticText[1]");
	//当前面积
	private UIElement TXT_detailCurrentAreaSize = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/currentAreaTv']",
			"xpath=//XCUIElementTypeStaticText[@name='当前面积']/following-sibling::XCUIElementTypeStaticText[1]");
	//当前租金
	private UIElement TXT_detailCurrentRent = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/currentRentTv']",
			"xpath=//XCUIElementTypeStaticText[@name='当前租金']/following-sibling::XCUIElementTypeStaticText[1]");
	//当前合同到期日
	private UIElement TXT_detailCurrentContactMaturityTime = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/currentDeadlineTv']",
			"xpath=//XCUIElementTypeStaticText[@name='当前合同到期日']/following-sibling::XCUIElementTypeStaticText[1]");
	//期望价格
	private UIElement TXT_detailCurrentExpectPrice = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/expectPriceTv']",
			"xpath=//XCUIElementTypeStaticText[@name='期望价格']/following-sibling::XCUIElementTypeStaticText[1]");

	
	
	//备注
	//姓名
	private UIElement TXT_detailNoteName = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/nameTv']",
			"xpath=//XCUIElementTypeStaticText[@name='备注']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	//时间
	private UIElement TXT_detailNoteTime = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/dateTv']",
			"xpath=//XCUIElementTypeStaticText[@name='备注']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");
	//内容
	private UIElement TXT_detailNoteContent = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv']",
			"xpath=//XCUIElementTypeStaticText[@name='备注']/ancestor::XCUIElementTypeCell/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[3]");


	/*
	 * 详情页操作
	 */
	//更多按钮
	private UIElement BTN_more = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/moreIv']",
			"xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem More']");
	//编辑
	private UIElement BTN_edit = new UIElement(
			"xpath=//android.widget.TextView[@text='编辑' and @resource-id='com.souban.creams.debug:id/editTv']",
			"xpath=//XCUIElementTypeStaticText[@name='编辑']");
	//备注
	private UIElement BTN_remark = new UIElement(
			"xpath=//android.widget.TextView[@text='备注' and @resource-id='com.souban.creams.debug:id/remarkTv']",
			"xpath=//XCUIElementTypeStaticText[@name='备注']");
	//操作记录
	private UIElement BTN_log = new UIElement(
			"xpath=//android.widget.TextView[@text='操作记录' and @resource-id='com.souban.creams.debug:id/logTv']",
			"xpath=//XCUIElementTypeStaticText[@name='操作记录']");
    //提醒
    private UIElement TXT_remind = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/remindTv']",
            "");
	//所有的返回按钮
	private UIElement BTN_back = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/backIv']",
			"xpath=//XCUIElementTypeButton[@name='App NavigationItem Back']");


	/*
	 * 操作记录页
	 */
	//页面标题
	private UIElement TXT_logPageHead = new UIElement(
			"xpath=//android.widget.TextView[@text='操作记录' and @resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//XCUIElementTypeOther[@name='操作记录']");
	//姓名
	private UIElement TXT_logName = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/nameTv']",
			"xpath=//XCUIElementTypeNavigationBar[@name='操作记录']/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeStaticText[1]");
	//时间
	private UIElement TXT_logDate = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/dateTv']",
			"xpath=//XCUIElementTypeNavigationBar[@name='操作记录']/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeStaticText[2]");
	//内容
	private UIElement TXT_logContent = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv']",
			"xpath=//XCUIElementTypeNavigationBar[@name='操作记录']/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeStaticText[3]");


	/*
	 * 编辑客户页
	 */
	//页面标题
	private UIElement TXT_editPageHead = new UIElement(
			"xpath=//android.widget.TextView[@text='编辑客户' and @resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//XCUIElementTypeOther[@name='编辑客户']");
	//租客输入框
	private UIElement INP_editName = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/nameEt']",
			"xpath=//XCUIElementTypeStaticText[@name='租客']/following-sibling::XCUIElementTypeTextField[1]");
	//保存
	private UIElement BTN_editSave = new UIElement(
			"xpath=//android.widget.TextView[@text='保存' and @resource-id='com.souban.creams.debug:id/saveTv']",
			"xpath=//XCUIElementTypeButton[@name='保存']");


	/*
	 * 提醒页
	 */
	//页面标题
	private UIElement TXT_remindPageHead = new UIElement(
			"xpath=//android.widget.TextView[@text='提醒' and @resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//XCUIElementTypeOther[@name='提醒']");
	//添加按钮
	private UIElement BTN_remindAdd = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/addIv']",
			"xpath=//XCUIElementTypeOther[@name='提醒']/following-sibling::XCUIElementTypeButton[1]");


	/*
	 * 备注页
	 */
	//页面标题-----断言
	private UIElement TXT_remarkPageHead = new UIElement(
			"xpath=//android.widget.TextView[@text='备注' and @resource-id='com.souban.creams.debug:id/toolbar_title']",
			"xpath=//XCUIElementTypeOther[@name='备注']");
	//备注姓名
	private UIElement RemarkNameUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/nameTv' and @text='"+name+"']",
				"xpath=//XCUIElementTypeNavigationBar[@name='备注']/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeStaticText[1]");
	}
	//本人标识
	private UIElement PersonalIdentityUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='"+name+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/self']",
				"");
	}
	//时间
	private UIElement RemarkDateUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='"+name+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/dateTv']",
				"xpath=//XCUIElementTypeNavigationBar[@name='备注']/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeStaticText[2]");
	}
	//内容
	private UIElement RemarkContentUIElement(String name) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='"+name+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv']",
				"xpath=//XCUIElementTypeNavigationBar[@name='备注']/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeStaticText[3]");
	}
	//更多按钮
	private UIElement RemarkMoreUIEment(String name) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='"+name+"']/following-sibling::android.widget.ImageView[@resource-id='com.souban.creams.debug:id/moreIv']",
				"xpath=//XCUIElementTypeNavigationBar[@name='备注']/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeButton[1][@name='Contract Button More']");
	}



	/*
	 * 客户搜索
	 */
	//客户列表顶部搜索框
	private UIElement TXT_search = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/searchTv' and @text='搜索客户']",
			"xpath=//XCUIElementTypeStaticText[@name='搜索客户']");
	//搜索页面的搜素框
	private UIElement INP_search = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/search' and @text='搜索客户']",
			"xpath=//XCUIElementTypeImage[@name='App_SearchBar_Icon']/following-sibling::XCUIElementTypeTextField[1][@value='搜索客户']");
	//客户姓名
	private UIElement SearchCustomNameUIElement(String customName) {
		return new UIElement(
				"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/companyTv' and @text='"+customName+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+customName+"']");
	}
	//租客状态
	private UIElement SearchCustomStatusUIElement(String customName) {
		return new UIElement(
				"xpath=//*[@text='"+customName+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/statusTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+customName+"']/following-sibling::XCUIElementTypeStaticText[1]");
	}
	//租赁顾问
	private UIElement SearchCustomContactUIElement(String customName) {
		return new UIElement(
				"xpath=//*[@text='"+customName+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/creatorNameTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+customName+"']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[4]");
	}
	//来访时间
	private UIElement SearchCustomVisitingTimeUIElement(String customName) {
		return new UIElement(
				"xpath=//*[@text='"+customName+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/visitDateTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+customName+"']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[5]");
	}
	//需求面积段
	private UIElement SearchCustomDemandAreaUIElement(String customName) {
		return new UIElement(
				"xpath=//*[@text='"+customName+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/intentAreaSizeTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+customName+"']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[6]");
	}
	//渠道类型
	private UIElement SearchCustomChannelTypeUIElement(String customName) {
		return new UIElement(
				"xpath=//*[@text='"+customName+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/sourceTypeTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+customName+"']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[3]");
	}
	//意向房源
	private UIElement SearchCustomIntentionHouseUIElement(String customName) {
		return new UIElement(
				"xpath=//*[@text='"+customName+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2][@resource-id='com.souban.creams.debug:id/demandRoomTv']",
				"xpath=//XCUIElementTypeStaticText[@name='"+customName+"']/ancestor::XCUIElementTypeCell[1]/following-sibling::XCUIElementTypeCell[2]//XCUIElementTypeStaticText[4]");
	}



	/*
	 * 新建备注
	 */
	//新建按钮
	private UIElement BTN_remarkNew = new UIElement(
			"xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/addIv']",
			"xpath=//XCUIElementTypeButton[@name='Merchant NavigationItem Add']");
	//新建备注页
	private UIElement TXT_remarkNewPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='新增备注']",
			"xpath=//XCUIElementTypeOther[@name='新增备注']");
	//备注内容
	private UIElement INP_remarkEditContent = new UIElement(
			"xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/contentEt']",
			"xpath=//XCUIElementTypeButton[@name='保存']/parent::XCUIElementTypeNavigationBar/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeTextView[1]");
	//保存
	private UIElement BTN_remarkSave = new UIElement(
			"xpath=//android.widget.TextView[@text='保存' and @resource-id='com.souban.creams.debug:id/saveTv']",
			"xpath=//XCUIElementTypeButton[@name='保存']");
	//备注断言内容
	private UIElement CheckRemarkContentUIElement(String name, String content) {
		return new UIElement(
				"xpath=//android.widget.TextView[@text='"+name+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/contentTv' and @text='"+content+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+name+"']/following-sibling::XCUIElementTypeStaticText[2][@name='"+content+"']");
	}

	/*
	 * 编辑备注
	 */
	//编辑按钮
	private UIElement BTN_remarkEdit = new UIElement(
			"xpath=//android.widget.TextView[@text='编辑' and @resource-id='com.souban.creams.debug:id/editTv']",
			"xpath=//XCUIElementTypeStaticText[@name='编辑']");
	private UIElement TXT_remarkEditPage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='编辑备注']",
			"xpath=//XCUIElementTypeOther[@name='新增备注']");


	/*
	 * 删除备注
	 */
	//删除
	private UIElement BTN_remarkDelete = new UIElement(
			"xpath=//android.widget.TextView[@text='删除' and @resource-id='com.souban.creams.debug:id/delTv']",
			"xpath=//XCUIElementTypeStaticText[@name='删除']");
	//删除备注弹窗
	private UIElement TXT_remarkDeletePage = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/messageTv' and @text='确定要删除该条备注吗？']",
			"xpath=//XCUIElementTypeStaticText[@name='确定要删除这条备注吗?']");
	//取消按钮
	private UIElement BTN_cancleRemarkDelete = new UIElement(
			"xpath=//android.widget.TextView[@text='取消' and @resource-id='com.souban.creams.debug:id/cancel_button']",
			"xpath=//XCUIElementTypeButton[@name='取消']");
	//确定按钮
	private UIElement BTN_sureRemarkDelete = new UIElement(
			"xpath=//android.widget.Button[@text='确定' and @resource-id='com.souban.creams.debug:id/makeSureBtn']",
			"xpath=//XCUIElementTypeButton[@name='确定']");


	/*
	 * 来访时间快捷筛选
	 */
	private UIElement FilterConditionUIElement(String condition){
		return new UIElement(
				"xpath=//android.widget.RadioButton[@text='"+condition+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+condition+"']");
	}
	private UIElement TXT_allVisitTime = new UIElement(
			"xpath=//*[@resource-id='com.souban.creams.debug:id/visitDateTv']",
			"xpath=//XCUIElementTypeStaticText[@name='来访时间']/following-sibling::XCUIElementTypeStaticText[3]");


	/*
	 * 客户状态快捷筛选
	 */
	private UIElement FilterCustomStatusUIElement(String customStatus){
		return new UIElement(
				"xpath=//android.widget.TextView[@text='"+customStatus+"']",
				"xpath=//XCUIElementTypeStaticText[@name='"+customStatus+"']");
	}
	private UIElement TXT_allCustomStatus = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/statusTv']",
			"xpath=//XCUIElementTypeStaticText[@name='租赁顾问']/ancestor::XCUIElementTypeCell[1]/preceding-sibling::XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");


	/*
	 * 渠道类型
	 */
    private UIElement BTN_filter = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/filterIv']",
            "xpath=//XCUIElementTypeButton[@name='Merchant Button Filter']");
    private UIElement TXT_filterPage = new UIElement(
            "xpath=//android.widget.TextView[@text='渠道']",
            "xpath=//XCUIElementTypeStaticText[@name='渠道']");
    private UIElement FilterChannelTypeUIElement(String filter){
        return new UIElement(
                "xpath=//android.widget.CheckBox[@text='"+filter+"']",
                "xpath=//XCUIElementTypeStaticText[@name='老客户介绍']");
    }
    private UIElement BTN_confirm = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/confirmTv']",
            "xpath=//XCUIElementTypeButton[@name='确定']");
    private UIElement TXT_allChannelType = new UIElement(
            "xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/sourceTypeTv']",
            "xpath=//XCUIElementTypeStaticText[@name='渠道']/following-sibling::XCUIElementTypeStaticText[2]");






	/**
	 * 新建客户,填写全部信息
	 */
	//点击客户管理
	public void clickCustomterManager() {
		this.driver.waitAndClick(TXT_customerManager, 2);
	}

	//客户管理的新建按钮
	public void clickAddCustomer(){
		this.driver.waitAndClick(TXT_addNewCustomer,2);
	}

	//进入新建客户页
	public boolean intoNewCustomerPage(){
		return this.driver.waitForElement(TXT_newCustomerPage,2);
	}

	//输入租客姓名
	public void inputName(String name) {
		this.driver.elementClearSendText(INP_name, name);
		//针对ios优化
		this.driver.isElementFound(BTN_hideKeyBoard);
		try {
			this.driver.click(BTN_hideKeyBoard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//选择行业
	private Integer FitmentPickerWheelIndex =1;
	public void selectIndustry(String industry) {
		this.driver.waitAndClick(TXT_industry,2);
		this.driver.selectPickerWheelValue(FitmentPickerWheelIndex, industry);
		this.driver.click(BTN_confirm_NumberPicker);
	}

	// 点击租客联系人显示框
	public void clickContact() {
		this.driver.waitAndClick(TXT_contact, 2);
	}

	// 在搜索框中输入租客联系人姓名
	public void inputContactName(String contactName) {
		//this.driver.waitAndClick(INP_toolbar_contact, 1);
		this.driver.elementClearSendText(INP_toolbar_contact, contactName);
	}

	// 选择租客联系人
	public void selectContact(String nameAndCompany) {
		this.driver.waitAndClick(this.SelectContactUIElement(nameAndCompany), 2);
	}

	//ios
	//点击租客联系人搜索页的保存按钮
	public void clickContactSaveButton() {
		this.driver.waitAndClick(BTN_save_contact, 1);
	}

	//点击预计签约时间
	public void clickExpectDate() {
		this.driver.waitAndClick(TXT_expectDate, 2);
	}

	//选择签约时间
	public void selectExpectDate() {
		//this.driver.elementSendText(TXT_pickerWheel_year, year);
		//this.driver.elementSendText(TXT_pickerWheel_month, month);
		//this.driver.elementSendText(TXT_pickerWheel_day, day);
		this.driver.waitAndClick(BTN_confirm_pickerWheel, 2);
	}

	//填写最小需求面积
	public void inputMinDemandSize(String minDemandSize) {
		this.driver.elementClearSendText(INP_minDemandSize, minDemandSize);
	}

	//填写最大需求面积
	public void inputMaxDemandSize(String maxDemandSize) {
		this.driver.elementClearSendText(INP_maxDemandSize, maxDemandSize);
		//针对ios优化
		this.driver.isElementFound(BTN_hideKeyBoard);
		try {
			this.driver.click(BTN_hideKeyBoard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//点击来访时间
	public void clickVisitingTime() {
		this.driver.waitAndClick(TXT_VisitingTime, 1);
	}

	//选择采访时间
	public void selectDate(String year, String month, String day) {
		this.driver.elementSendText(TXT_pickerWheel_year, year);
		this.driver.elementSendText(TXT_pickerWheel_month, month);
		this.driver.elementSendText(TXT_pickerWheel_day, day);
		this.driver.waitAndClick(BTN_confirm_pickerWheel, 1);
	}

	//选择租客状态
	public void selectStatus(String status) {
		this.driver.waitAndClick(TXT_status, 1);
		this.driver.elementSendText(TXT_numberPicker, status);
		this.driver.waitAndClick(BTN_confirm_pickerWheel, 1);
	}

	//选择来访渠道
	public void selectChannelType(String channelType) {
		this.driver.waitAndClick(TXT_channelType, 1);
		this.driver.elementSendText(TXT_numberPicker, channelType);
		this.driver.waitAndClick(BTN_confirm_pickerWheel, 1);
	}

	//点击渠道联系人显示框
	public void clickAgent() {
		this.driver.waitAndClick(TXT_agent, 1);
	}

	//在输入框中输入渠道联系人关键词
	public void inputAgentName(String agentName) {
		//this.driver.waitAndClick(INP_toolbar_channel, 1);
		this.driver.elementClearSendText(INP_toolbar_channel, agentName);
	}

	//选择渠道联系人
	public void selectAgent(String agentName) {
		this.driver.waitAndClick(this.SelectAgentUIElement(agentName), 1);
	}

	//ios
	//点击渠道联系人搜索页的保存按钮
	public void clickChannelSaveButton(){
		this.driver.waitAndClick(BTN_save_channel, 1);
	}

	//填写备注
	public void inputNote(String note) {
		this.driver.elementClearSendText(INP_note, note);
		//针对ios优化
		this.driver.isElementFound(BTN_hideKeyBoard);
		try {
			this.driver.click(BTN_hideKeyBoard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//点击选择房源
	public void clickRoom() {
		this.driver.swipeToUpToFindElement(TXT_room);
		this.driver.waitAndClick(TXT_room, 2);
	}

	//选择楼盘
	public void selectBuilding(String buildingName) {
		this.driver.waitAndClick(this.SelectRoomUIElement(buildingName), 1);
	}

	//保存按钮
	public void clickBuildSaveButton() {
		this.driver.waitAndClick(BTN_buildSure, 1);
		this.driver.sleep(1000);
	}

	//点击显示更多按钮
	public void clickDisplayMoreButton() {
		this.driver.swipeToUpToFindElement(BTN_displayMore);
		this.driver.waitAndClick(BTN_displayMore, 2);
	}

	//点击城市/区域/商圈显示框
	public void clickLocation() {
		this.driver.swipeToUpAndClick(TXT_location);
	}

	//搜索商圈
	public void inputLocation(String location) {
		//this.driver.waitAndClick(INP_toolbar_location, 1);
		this.driver.elementClearSendText(INP_toolbar_location, location);
	}

	//选择商圈
	public void selectLocation(String location) {
		this.driver.waitAndClick(this.SelectLocationUIElement(location), 1);
	}

	//点击确定按钮
	public void clickSureButton() {
		this.driver.waitAndClick(BTN_sure, 2);
	}

	//填写最小期望价格
	public void inputMinPrice(String minPrice) {
		this.driver.swipeToUpToFindElement(INP_minPrice);
		this.driver.elementClearSendText(INP_minPrice, minPrice);
		//针对ios优化
		this.driver.isElementFound(BTN_hideKeyBoard);
		try {
			this.driver.click(BTN_hideKeyBoard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//填写最大期望价格
	public void inputMaxPrice(String maxPrice) {
		this.driver.swipeToUpToFindElement(INP_maxPrice);
		this.driver.elementClearSendText(INP_maxPrice, maxPrice);
		//针对ios优化
		this.driver.isElementFound(BTN_hideKeyBoard);
		try {
			this.driver.click(BTN_hideKeyBoard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//修改期望价格单位
	public void modifyExpectPriceUnit(String expectPriceUnit) {
		this.driver.waitAndClick(BTN_expectPriceUnit, 1);
		this.driver.elementSendText(TXT_numberPicker, expectPriceUnit);
	}

	//当前地址
	public void inputCurLocation(String curLocation) {
		this.driver.swipeToUpToFindElement(INP_curLocation);
		this.driver.elementClearSendText(INP_curLocation, curLocation);
		//针对ios优化
		this.driver.isElementFound(BTN_hideKeyBoard);
		try {
			this.driver.click(BTN_hideKeyBoard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//点击当前合同到期日显示框
	public void clickExporeDate() {
		this.driver.swipeToUpToFindElement(TXT_exporeDate);
		this.driver.waitAndClick(TXT_exporeDate, 2);
	}

	//选择合同日期
	public void selectExporeDate() {
		//this.driver.elementSendText(TXT_pickerWheel_year, year);
		//this.driver.elementSendText(TXT_pickerWheel_month, month);
		//this.driver.elementSendText(TXT_pickerWheel_day, day);
		this.driver.waitAndClick(BTN_confirm_pickerWheel, 1);
	}

	//填写当前面积
	public void inputCurSize(String curSize) {
		this.driver.swipeToUpToFindElement(INP_curSize);
		this.driver.elementClearSendText(INP_curSize, curSize);
		//针对ios优化
		this.driver.isElementFound(BTN_hideKeyBoard);
		try {
			this.driver.click(BTN_hideKeyBoard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//填写当前租金
	public void inputCurPrice(String curPrice) {
		this.driver.swipeToUpToFindElement(INP_curPrice);
		this.driver.elementClearSendText(INP_curPrice, curPrice);
		//针对ios优化
		this.driver.isElementFound(BTN_hideKeyBoard);
		try {
			this.driver.click(BTN_hideKeyBoard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//点击新建楼盘的保存按钮
	public void clickNewSavebutton() {
		this.driver.waitAndClick(BTN_save, 2);
		this.driver.sleep(3000);
	}

	//断言是否新建成功
	public boolean checkNewContact(String name) {
		return this.driver.isElementFound(this.NameUIElement(name));
	}

	//检查数据----填写所有信息
	public String checkData(String name) {
		this.driver.isElementFound(this.StatusUIElement(name));
		return this.driver.elementGetText(this.StatusUIElement(name)) + ","
				+ this.driver.elementGetText(this.ConsultantUIElement(name)) + ","
				+ this.driver.elementGetText(this.VisitingTimeUIElement(name)) + ","
				+ this.driver.elementGetText(this.DemandAreaUIElement(name)) + ","
				+ this.driver.elementGetText(this.ChannelTypeUIElement(name)) + ","
				+ this.driver.elementGetText(this.HouseUIElement(name)) + ","
				+ this.driver.elementGetText(this.NoteUIElement(name));
	}

	

	/**
	 * 进入客户详情页，核对客户详情页展示的所有信息
	 * @param name 租赁顾问的姓名
	 */

	//进入客户详情页
	public void clickNewContact(String name) {
		this.driver.waitAndClick(this.NameUIElement(name), 1);
	}

	//断言，成功进入客户详情页
	public boolean intoDetailPage() {
		return this.driver.isElementFound(TXT_detailPageTitle);
	}

	// 核对客户概要数据
	public String checkBasicInformation() {
		this.driver.isElementFound(TXT_detailBasicName);
		return this.driver.elementGetText(TXT_detailBasicName) + ","
				+ this.driver.elementGetText(TXT_detailBasicPercent) + ","
				+ this.driver.elementGetText(TXT_detailBasicStatus) + ","
				+ this.driver.elementGetText(TXT_detailBasicAreaSize) + ","
				+ this.driver.elementGetText(TXT_detailBasicConsultant);
	}
	// android
	//核对租客信息
	 public String checkContactInformation() {
		int duration = 1000;
	    this.driver.swipeToUp(duration);
	    this.driver.isElementFound(TXT_detailContactContactName); 
	    return this.driver.elementGetText(TXT_detailContactContactName)+","+this.driver.elementGetText(TXT_detailContactDemandAreaSize)
	            +","+this.driver.elementGetText(TXT_detailContactStatus)+","+this.driver.elementGetText(TXT_detailContactChannelType)
	            +","+this.driver.elementGetText(TXT_detailContactIndustry)+","+this.driver.elementGetText(TXT_detailContactExpectDate)
	            +","+this.driver.elementGetText(TXT_detailContactVisitDate)+","+this.driver.elementGetText(TXT_detailContactChannelContact)
	            +","+this.driver.elementGetText(TXT_detailContactLocation);
	    }
	//ios
	public String checkContactInformationForIos() {
		this.driver.isElementFound(TXT_detailContactContactName);
		return this.driver.elementGetText(TXT_detailContactContactName)+","+this.driver.elementGetText(TXT_detailContactDemandAreaSize)
        +","+this.driver.elementGetText(TXT_detailContactStatus)+","+this.driver.elementGetText(TXT_detailContactChannelType)
        +","+this.driver.elementGetText(TXT_detailContactIndustry)+","+this.driver.elementGetText(TXT_detailContactExpectDate)
        +","+this.driver.elementGetText(TXT_detailContactVisitDate)+","+this.driver.elementGetText(TXT_detailContactChannelContact)
        +","+this.driver.elementGetText(TXT_detailContactLocation);
	}

	//核对房源信息
	public String checkHouseInformation() {
		this.driver.swipeToUp(1000);
		return this.driver.elementGetText(TXT_detailHouseName);
	}

	//核对租客当前信息
	public String checkCurrentInformation() {
		this.driver.swipeToUpToFindElement(TXT_detailCurrentExpectPrice);
		return this.driver.elementGetText(TXT_detailCurrentAddress) + ","
				+ this.driver.elementGetText(TXT_detailCurrentAreaSize) + ","
				+ this.driver.elementGetText(TXT_detailCurrentRent) + ","
				+ this.driver.elementGetText(TXT_detailCurrentContactMaturityTime)+","
				+ this.driver.elementGetText(TXT_detailCurrentExpectPrice);
	}

	//核对租客备注信息
	public String checkNoteInformation() {
		this.driver.swipeToUpToFindElement(TXT_detailNoteName);
		this.driver.waitForElement(TXT_detailNoteName, 1);
		return this.driver.elementGetText(TXT_detailNoteName)+","
				+this.driver.elementGetText(TXT_detailNoteTime)+","
				+this.driver.elementGetText(TXT_detailNoteContent);
	}
	
	

	/**
	 * 查看客户的操作记录
	 */
	//点击客户详情页的操作按钮
	public void clickMoreButton() {
		this.driver.waitAndClick(BTN_more, 1);
	}

	//点击操作记录
	public void clickOperateLog() {
		this.driver.waitAndClick(BTN_log, 1);
	}

	//断言---进入操作记录页
	public boolean intoOperateLogPage() {
		return this.driver.waitForElement(TXT_logPageHead, 1);
	}

	//核对操作内容
	public String checkLog(String name, String content) {
		this.driver.isElementFound(TXT_logName);
		return this.driver.elementGetText(TXT_logName)+","+this.driver .elementGetText(TXT_logDate)
		+","+this.driver.elementGetText(TXT_logContent);
	}

	//点击返回按钮返回到客户详情页
	public void backToCustomerDetailPage() {
		this.driver.waitAndClick(BTN_back, 2);
	}
	
	

	/**
	 * 核对备注内容
	 */
	//点击备注
	public void clickRemark() {
		this.driver.waitAndClick(BTN_remark, 1);
	}

	//进入备注列表页
	public boolean intoRemarkPage() {
		return this.driver.waitForElement(TXT_remarkPageHead,2);
	}

	//核对是否存在一条备注
	public boolean checkRemark(String name){
		return this.driver.isElementFound(this.RemarkNameUIElement(name));
	}
	//android
	//核对本人标识和备注内容
	public String checkRemarkContentForAndroid(String name) {
		return this.driver.elementGetText(this.PersonalIdentityUIElement(name))+","+this.driver.elementGetText(this.RemarkDateUIElement(name))
	           +","+this.driver.elementGetText(this.RemarkContentUIElement(name));
	}
	//ios
	//核对备注内容
	public String checkRemarkContentForIos(String name) {
		return this.driver.elementGetText(this.RemarkDateUIElement(name))+","+this.driver.elementGetText(this.RemarkContentUIElement(name));
	}




	/**
	 * 通过客户名称来搜索客户
	 */

	//点击客户列表顶部的搜索框
	public void clickCustomerManagerSearch() {
		this.driver.waitAndClick(TXT_search, 5);
	}

	//在搜索框内输入客户姓名
	public void inputCustomName(String customName) {
		this.driver.waitAndClick(INP_search, 3);
		this.driver.elementClearSendText(INP_search, customName);
		this.driver.sleep(1000);
	}

	//断言
	public boolean checkSearchResult(String customName) {
		return this.driver.waitForElement(this.SearchCustomNameUIElement(customName), 2);
	}

	//核对客户信息
	public String checkCustomInformation(String customName) {
		return this.driver.elementGetText(this.SearchCustomStatusUIElement(customName))+","+this.driver.elementGetText(this.SearchCustomContactUIElement(customName))
				+","+this.driver.elementGetText(this.SearchCustomVisitingTimeUIElement(customName))+","+this.driver.elementGetText(this.SearchCustomDemandAreaUIElement(customName))
				+","+this.driver.elementGetText(this.SearchCustomChannelTypeUIElement(customName))+","+this.driver.elementGetText(this.SearchCustomIntentionHouseUIElement(customName));
	}





	/**
	 * 新增备注
	 * @param customName 租客姓名
	 */
	//点击搜索结果页中的客户进入客户详情页
	public void clickSearchCustom(String customName) {
		this.driver.waitAndClick(this.SearchCustomNameUIElement(customName), 2);
	}

	//点击新增按钮
	public void clickRemarkNew() {
		this.driver.waitAndClick(BTN_remarkNew, 1);
	}

	//进入新增备注页
	public boolean intoRemarkNewPage(){
		return this.driver.waitForElement(TXT_remarkNewPage,2);
	}

	//填写备注内容
	public void inputRemarkContent(String content) {
		this.driver.waitAndClick(INP_remarkEditContent, 1);
		this.driver.elementClearSendText(INP_remarkEditContent, content);
	}

	//保存备注
	public void clickRemarkSave() {
		this.driver.waitAndClick(BTN_remarkSave, 2);
	}

	//断言---备注是否编辑或者新增或者删除成功
	public boolean checkRemarkEditOrDeleteOrNew(String name, String content) {
		this.driver.sleep(1000);
		return this.driver.isElementFound(this.CheckRemarkContentUIElement(name, content));
	}


	/**
	 * 编辑备注
	 * @param name 租客姓名
	 */
	//选择一条备注，点击该备注的更多按钮
	public void clickRemarkMoreButton(String name) {
		this.driver.waitAndClick(this.RemarkMoreUIEment(name), 1);
	}

	//点击编辑按钮
	public void clickRemarkEdit() {
		this.driver.waitAndClick(BTN_remarkEdit, 1);
	}

	//进入编辑备注页
	public boolean intoRemarkEditPage(){
		return this.driver.waitForElement(TXT_remarkEditPage,2);
	}




	//点击删除按钮
	public void clickRemarkDelete() {
		this.driver.waitAndClick(BTN_remarkDelete, 2);
	}

	//进入确定要删除该条备注吗？页面
	public boolean intpRemarkDeletePage(){
		return this.driver.waitForElement(TXT_remarkDeletePage,2);
	}

	//点击取消删除按钮
	public void clickCancelRemarkDelete() {
		this.driver.waitAndClick(BTN_cancleRemarkDelete, 2);
	}

	//点击确定删除按钮
	public void clickSureReamrkDelete() {
		this.driver.waitAndClick(BTN_sureRemarkDelete, 2);
	}


	
	
	
	
	
	/**
	 * 编辑客户详情内容
	 * 只编辑租客姓名
	 */

	//点击备注列表页的返回按钮返回到客户详情页
	public void clickBackButton() {
		this.driver.waitAndClick(BTN_back, 2);
	}

	//点击客户详情页更多按钮中的编辑按钮
	public void clickEditButton() {
		this.driver.waitAndClick(BTN_edit, 1);
	}

	//进入编辑客户页
	public boolean intoEditPage() {
		return this.driver.waitForElement(TXT_editPageHead, 1);
	}

	//核对租客姓名的内容
	public String checkName() {
		return this.driver.elementGetText(INP_editName);
	}

	//修改租客姓名
	public void modifyName(String name) {
		this.driver.waitAndClick(INP_editName, 1);
		this.driver.elementClearSendText(INP_editName, name);
	}

	//点击保存按钮
	public void clickEditSave() {
		this.driver.waitAndClick(BTN_editSave, 1);
		this.driver.sleep(3000);
	}

	//核对租客姓名是否编辑成功
	public String checkEditName() {
		return this.driver.elementGetText(TXT_detailBasicName);
	}
	




	/**
	 * 通过来访时间快捷筛选
	 */

	//选择快捷筛选条件
	public void selectConditions(String condition){
		this.driver.waitAndClick(this.FilterConditionUIElement(condition),2);
	}

	//检查列表中的记录是否符合
	private List<String> visitTime(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}

	public List<String> checkAllVisitTime(){
		return this.visitTime(TXT_allVisitTime);
	}



	/**
	 * 通过客户状态快捷筛选
	 */

	//选择客户状态
	public void selectCustomStatus(String customStatus){
		this.driver.waitAndClick(this.FilterCustomStatusUIElement(customStatus),2);
	}

	//检查列表中的记录是否符合
	private List<String> customStatus(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}

	public List<String> checkAllCustomStatus(){
		return this.customStatus(TXT_allCustomStatus);
	}


    /**
     * 通过渠道类型筛选
     */
    //点击筛选按钮
    public void clickFilterButton(){
        this.driver.waitAndClick(BTN_filter,2);
    }

    //进入筛选页
    public boolean intoFilterPage(){
        return this.driver.waitForElement(TXT_filterPage,2);
    }

    //选择渠道类型
    public void filterChannelType(String channelType){
        this.driver.waitAndClick(this.FilterChannelTypeUIElement(channelType),2);
    }

    //点击客户管理筛选页的确定按钮
    public void clickConfirm(){
        this.driver.waitAndClick(BTN_confirm,2);
    }

    //检查列表中的记录是否符合
    private List<String> channelType(UIElement txt){
        return this.driver.allElementsGetText(txt);
    }

    public List<String> checkAllChannerType(){
        return this.channelType(TXT_allChannelType);
    }
}