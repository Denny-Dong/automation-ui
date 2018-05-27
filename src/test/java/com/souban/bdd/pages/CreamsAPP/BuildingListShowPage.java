package com.souban.bdd.pages.CreamsAPP;


import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class BuildingListShowPage extends ParentPage{

	public BuildingListShowPage(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//楼宇列表
	private UIElement BTN_NavigationItem = new UIElement("id=com.souban.creams.debug:id/navigationIv","xpath=//XCUIElementTypeButton[@name='Building NavigationItem More w']");

	private UIElement LST_BuildingElement(String building){
		return new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/name' and @text='" + building + "']","xpath=//XCUIElementTypeScrollView//XCUIElementTypeCollectionView//XCUIElementTypeStaticText[@name='" + building + "']");
	}

	private UIElement TXT_BuildingElement(String CheckBuilding){
		return new UIElement("xpath=//*[@text='" + CheckBuilding + "']","xpath=//XCUIElementTypeStaticText[@name='" + CheckBuilding +"']");
	}

	private UIElement TXT_BuildingElement2(String CheckBuilding2){
		return new UIElement("xpath=//*[@text='" + CheckBuilding2 + "']","xpath=//XCUIElementTypeStaticText[@name='" + CheckBuilding2 +"']");
	}

	private UIElement TXT_BuildingElement3(String CheckBuilding3){
		return new UIElement("xpath=//*[@text='" + CheckBuilding3 + "']","xpath=//XCUIElementTypeStaticText[@name='" + CheckBuilding3 +"']");
	}

	private UIElement TXT_BuildingAddressElement(String CheckBuilding){
		return new UIElement(
				"xpath=//*[@text='" + CheckBuilding + "']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/locationTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + CheckBuilding +"']/following-sibling::XCUIElementTypeStaticText[2]");
	}

	private UIElement TXT_BuildingTotalAreaElement(String CheckBuilding){
		return new UIElement("xpath=//*[@text='" + CheckBuilding + "']/parent::android.widget.RelativeLayout//android.widget.TextView[@resource-id='com.souban.creams.debug:id/totalAreaTv']","xpath=//XCUIElementTypeStaticText[@name='" + CheckBuilding +"']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
	}
	
	//房源列表
	private UIElement TXT_CanBeMerchant = new UIElement(
			"xpath=//android.widget.TextView[@text='可招商']",
			"xpath=//XCUIElementTypeStaticText[@name='可招商']");

	//租赁状态
	private UIElement TXT_RoomRentStateElement(String room){
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + room + "']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/tagTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + room + "']/following-sibling::XCUIElementTypeStaticText[2]");
	}
	//预租单价
	private UIElement TXT_RoomExpectedPriceAndAreaElement(String room){
		return new UIElement(
				"",
				"xpath=//XCUIElementTypeStaticText[@name='" + room + "']/following-sibling::XCUIElementTypeStaticText[1]");
	}
	//装修
	private UIElement TXT_RoomFitmentElement(String room){
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + room + "']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/dateTv']",
				"xpath=//XCUIElementTypeStaticText[@name='" + room + "']/following-sibling::XCUIElementTypeStaticText[3]");
	}
	
	//android元素
	//预租单价
	private UIElement TXT_RoomExpectedPriceElement(String room){
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + room + "']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/priceTv']",
				"");
	}
	//面积
	private UIElement TXT_RoomAreaElement(String room){
		return new UIElement(
				"xpath=//android.widget.TextView[@text='" + room + "']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/areaSizeTv']",
				"");
	}
	
	//房源详情
	private UIElement TXT_FloorAndRoom = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/titleTv']","xpath=//XCUIElementTypeButton[@name='Button cell']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_BuildingName = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/buildingNameTv']","xpath=//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
	private UIElement TXT_BuildingAddress = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/locationTv']","xpath=//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]");
	private UIElement TXT_Area = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/areaSizeTv']",
			"xpath=//XCUIElementTypeStaticText[@name='面积']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_State = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/statusTv']",
			"xpath=//XCUIElementTypeStaticText[@name='招商状态']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_ExpectedPrice = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/priceTv']",
			"xpath=//XCUIElementTypeStaticText[@name='预租单价']/following-sibling::XCUIElementTypeStaticText");
	private UIElement TXT_Fitment = new UIElement(
			"xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/fitmentTv']",
			"xpath=//XCUIElementTypeStaticText[@name='装修']/following-sibling::XCUIElementTypeStaticText");
	
	
	//编辑房源
	private UIElement BTN_Inlet = new UIElement("xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/moreIv']","xpath=//XCUIElementTypeButton[@name='Button cell']");
	private UIElement BTN_Back = new UIElement("xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/backIv']","xpath=//XCUIElementTypeButton[@name='App NavigationItem Back']");
	private UIElement BTN_EditRoom = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/editTv']","xpath=//XCUIElementTypeStaticText[@name='编辑房源']");
	private UIElement INP_Area = new UIElement("xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/area_size']","xpath=//XCUIElementTypeStaticText[@name='面积']/parent::XCUIElementTypeOther//XCUIElementTypeTextField");
	//public UIElement INP_Fitment = new UIElement("","xpath=	//XCUIElementTypeStaticText[@name='装修']");
	private UIElement INP_Fitment = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/text']","xpath=//XCUIElementTypeStaticText[@name='装修']");
	private UIElement BTN_complete = new UIElement("","xpath=//XCUIElementTypeButton[@name='Toolbar Done Button']");
	private UIElement INP_CloseFitment = new UIElement("","xpath=//XCUIElementTypeOther[@name='TopContainer']");
	private UIElement LST_Fitment = new UIElement("","xpath=//XCUIElementTypePicker");
	private UIElement BTN_Confirm = new UIElement("","xpath=//XCUIElementTypeButton[@name='确定']");
	private UIElement INP_ExpectedPrice = new UIElement("xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/price']","xpath=//XCUIElementTypeStaticText[@name='预租单价']/parent::XCUIElementTypeOther//XCUIElementTypeTextField");
	private UIElement INP_PriceUnit = new UIElement("xpath=//android.widget.ImageView[@resource-id='com.souban.creams.debug:id/arrow_down']","xpath=//XCUIElementTypeStaticText[@name='预租单价']/parent::XCUIElementTypeOther//XCUIElementTypeButton");
	private UIElement LST_PriceUnit = new UIElement("","xpath=//XCUIElementTypePicker");
	private UIElement BTN_Save = new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/saveTv']","xpath=//XCUIElementTypeButton[@name='保存']");

	private UIElement FitmentElement(String fitment){
		return new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/text' and @text='" + fitment + "']","");
	}

	private UIElement PriceUnitElement(String priceUnit){
		return new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/text' and @text='" + priceUnit + "']","");
	}
	
	//选择多个楼宇列表元素
	private UIElement TXT_AllAreaSize = new UIElement("id = com.souban.creams.debug:id/totalAreaTv","xpath=//XCUIElementTypeStaticText[@name='总面积（m²）']/following-sibling::XCUIElementTypeStaticText[2]");
	//public UIElement TXT_SelectBuilding = new UIElement("","xpath=//XCUIElementTypeCollectionView//XCUIElementTypeImage/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	
	
	//加入收藏元素
	private UIElement BTN_JoinCollection = new UIElement("xpath=//android.widget.Button[@resource-id='com.souban.creams.debug:id/addCollectBtn']","xpath=//XCUIElementTypeButton[@name='加入收藏']");
	private UIElement INP_GroupName = new UIElement("id = com.souban.creams.debug:id/inputEt","xpath=//XCUIElementTypeStaticText[@name='填写分组名称']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeTextView");
	private UIElement BTN_ConfirmJoinCollection = new UIElement("id = com.souban.creams.debug:id/makeSureBtn","xpath=//XCUIElementTypeButton[@name='确定']");
	private UIElement BTN_MyQuery = new UIElement("xpath=//android.widget.TextView[@text='我的集合']","xpath=//XCUIElementTypeStaticText[@name='我的查询']");
	private UIElement GroupElement(String group){
		return new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/name' and @text='" + group + "']","xpath=//XCUIElementTypeImage[@name='Building_Button_Room']/preceding-sibling::XCUIElementTypeStaticText[@name='" + group + "']");
	}

	private UIElement BuildingCountInGroupElement(String group){
		return new UIElement("xpath=//*[@text='" + group + "']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/drawable_rate']","xpath=//XCUIElementTypeStaticText[@name='" + group + "']/following-sibling::XCUIElementTypeStaticText");
	}
	
	//删除查询元素
	private UIElement BTN_DeleteGroup = new UIElement("","xpath=//");

	//剖面图按钮
	private UIElement BTN_Chart = new UIElement("id=com.souban.creams.debug:id/chart","");

	//剖面图标题
	private UIElement TXT_Chart = new UIElement("ID=com.souban.creams.debug:id/toolbar_title","");
	
	//楼宇列表方法
	public void GotoTheSideBar(){
		this.driver.waitAndClick(BTN_NavigationItem, 2);
	}

	public void SelectBuilding(String building){
		this.driver.sleep(2000);
		this.driver.swipeToUpAndClick(this.LST_BuildingElement(building));	
	}

	public void Clickblank(){
		int x = 0;
		int y = 0;
		this.driver.tap(x, y);
	}

	public boolean GotoBuildingList(String CheckBuilding){
		return this.driver.waitForElement(this.TXT_BuildingElement(CheckBuilding), 2);
	}

	public String CheckBuildingInfo(String CheckBuilding){
		return this.driver.elementGetText(this.TXT_BuildingTotalAreaElement(CheckBuilding));
	}
	
	//房源列表方法
	public void GotoRoomList(String CheckBuilding){
		this.driver.waitAndClick(this.TXT_BuildingElement(CheckBuilding), 2);
	}

	public boolean CheckList(){
		this.driver.sleep(1000);
		return this.driver.waitForElement(TXT_CanBeMerchant, 1);
	}

	public String CheckRoomInfo(String room){
		this.driver.waitForElement(this.TXT_RoomRentStateElement(room), 3);
		return this.driver.elementGetText(this.TXT_RoomRentStateElement(room)) + "," + this.driver.elementGetText(this.TXT_RoomExpectedPriceAndAreaElement(room)) + "," 
	+ this.driver.elementGetText(this.TXT_RoomFitmentElement(room));
	}
	
	//android
	public String CheckRoomInfo_android(String room){
		this.driver.sleep(1000);
		this.driver.swipeToUpToFindElement(this.TXT_RoomRentStateElement(room));
		return this.driver.elementGetText(this.TXT_RoomRentStateElement(room)) + "," + this.driver.elementGetText(this.TXT_RoomExpectedPriceElement(room)) + "," + this.driver.elementGetText(this.TXT_RoomAreaElement(room)) + "," 
	+ this.driver.elementGetText(this.TXT_RoomFitmentElement(room));
	}
	
	//房源详情方法
	public void GotoRoomDetail(String room){
		this.driver.swipeToUpAndClick(this.TXT_RoomRentStateElement(room));
	}

	public String CheckFloorAndRoom(){
		return this.driver.elementGetText(TXT_FloorAndRoom);
	}

	public String CheckBuildingInfo(){
		return this.driver.elementGetText(TXT_BuildingName) + "," + this.driver.elementGetText(TXT_BuildingAddress);
	}

	public String CheckRoomDetailInfo(){
		this.driver.waitForElement(TXT_Area, 3);
		return this.driver.elementGetText(TXT_Area) + "," + this.driver.elementGetText(TXT_State) + "," + this.driver.elementGetText(TXT_ExpectedPrice) + "," + this.driver.elementGetText(TXT_Fitment);
	}
	
	//房源编辑
	private Integer FitmentPickerWheelIndex = 1;
	private Integer PriceUnitPickerWheelIndex = 1;

	public void GotoEditRoomPage(){
		this.driver.waitAndClick(BTN_Inlet, 1);
		this.driver.waitAndClick(BTN_EditRoom, 1);
	}

	public void EditArea(String area){
		this.driver.sleep(1000);
		this.driver.elementClearSendText(INP_Area, area);
	}

	public void EditFitment(String fitment){
		this.driver.waitAndClick(INP_Fitment, 3);
		this.driver.selectPickerWheelValue(FitmentPickerWheelIndex, fitment);
		//System.out.println("******resultFitment : " + resultFitment);
		this.driver.click(BTN_Confirm);
	}

	public void EditPrice(String price){
		this.driver.elementClearSendText(INP_ExpectedPrice, price);
	}

	public void EditPriceUnit(String unit){
		this.driver.click(INP_PriceUnit);
		Boolean resultPriceUnit = this.driver.selectPickerWheelValue(PriceUnitPickerWheelIndex, unit);
		System.out.println("******resultPriceUnit : " + resultPriceUnit);
		this.driver.click(BTN_Confirm);
	}

	public void SaveEditRoom(){
		this.driver.waitAndClick(BTN_Save, 2);
	}

	public void BackToRoomList(){
		this.driver.click(BTN_Back);
	}
	//android修改房源信息方法
	public void EditFitment_android(String fitment){
		this.driver.click(INP_Fitment);
		this.driver.waitAndClick(this.FitmentElement(fitment), 2);
	}

	public void EditPriceUnit_android(String priceUnit){
		this.driver.click(INP_PriceUnit);
		this.driver.waitAndClick(this.PriceUnitElement(priceUnit), 2);
	}
	
	//选择多个楼宇方法
	public void SelectBuilding(String building1,String building2,String building3){
		this.driver.sleep(3000);
		this.driver.swipeToUpAndClick(this.LST_BuildingElement(building1));
		this.driver.sleep(1000);
		this.driver.swipeToUpAndClick(this.LST_BuildingElement(building2));
		this.driver.sleep(1000);
		this.driver.swipeToUpAndClick(this.LST_BuildingElement(building3));
	}

	public boolean CheckSelectBuilding2(String CheckBuilding2){
		return this.driver.waitForElement(this.TXT_BuildingElement2(CheckBuilding2), 2);
	}

	public boolean CheckSelectBuilding3(String CheckBuilding3){
		return this.driver.waitForElement(this.TXT_BuildingElement3(CheckBuilding3), 2);
	}

	public String CheckAllAreaSize(){
		return this.driver.elementGetText(TXT_AllAreaSize);
	}
	
	
	//加入收藏
	public void ClickJoinCollection(){
		this.driver.waitAndClick(BTN_JoinCollection, 2);
	}

	public void InputGroupName(String groupName){
		this.driver.sleep(1000);
		this.driver.elementSendText(INP_GroupName, groupName);
	}

	public void ConfirmJoinCollection(){
		this.driver.waitAndClick(BTN_ConfirmJoinCollection, 1);
	}

	public void GotoMyQueryList(){
		this.driver.waitAndClick(BTN_MyQuery, 1);
	}

	public boolean CheckGroupIsExist(String group){
		/*while(!this.driver.isElementFound(this.GroupElement(group))){
			int duration = 0;
			this.driver.swipeToUp(duration);
		}
		return this.driver.waitForElement(this.GroupElement(group), 3);*/
		this.driver.sleep(1000);
		return this.driver.swipeToUpToFindElement(this.GroupElement(group));
	}

	public String CheckBuildingCountInGroup(String group){
		return this.driver.elementGetText(this.BuildingCountInGroupElement(group));
	}

	//剖面图方法
	public void ClickChart(){
		this.driver.click(BTN_Chart);
	}

	public boolean CheckChart(){
		return this.driver.waitForElement(TXT_Chart,3);
	}
	
	
}
