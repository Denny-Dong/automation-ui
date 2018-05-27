package com.souban.bdd.flows.CreamsAPP;

import static org.hamcrest.core.Is.is;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.souban.bdd.pages.CreamsAPP.AllOfBillsPage;
import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
  
public class AllOfBillsFlow {
    private AllOfBillsPage allOfBillsPage= null;
	
	public AllOfBillsFlow(final Driver driver) {
		this.allOfBillsPage = PageFactory.getPage(AllOfBillsPage.class, driver);
	}
	
	
	//搜索账单
	public void   ClickAllBills(){
		this.allOfBillsPage.ClickAllBills();
	}
	
	public void   ClickSearch(){
		this.allOfBillsPage.ClickSearch();
	}

	public void SearchInput(String otherName){
		this.allOfBillsPage.SearchInput(otherName);
	}
	

	public void CheakBills(String otherName){
		Assert.assertThat(this.allOfBillsPage.CheakBills(otherName), is(true));
	}
	
	public void VeritySearchBillsInfo(String roomNub,String needMoney,String closeStatus,String otherName,String rentType,String buildingName,String billAmount,String actualAmount,String invoiceStatus,String invoiceAmount,String actualTime,String billingCycle){
		Assert.assertThat(this.allOfBillsPage.RoomNubInfo(otherName),is(roomNub));
		Assert.assertThat(this.allOfBillsPage.NeedMoneyInfo(otherName),is(needMoney));
		Assert.assertThat(this.allOfBillsPage.CloseStatusInfo(otherName),is(closeStatus));
		Assert.assertThat(this.allOfBillsPage.OtherNameInfo(otherName),is(otherName));
		Assert.assertThat(this.allOfBillsPage.RentTypeInfo(otherName),is(rentType));
		Assert.assertThat(this.allOfBillsPage.BuildingNameInfo(otherName),is(buildingName));
		Assert.assertThat(this.allOfBillsPage.BillAmountInfo(otherName),is(billAmount));
		Assert.assertThat(this.allOfBillsPage.ActualAmountInfo(otherName),is(actualAmount));
		Assert.assertThat(this.allOfBillsPage.InvoiceStatusInfo(otherName),is(invoiceStatus));
		Assert.assertThat(this.allOfBillsPage.InvoiceAmountInfo(otherName),is(invoiceAmount));
		Assert.assertThat(this.allOfBillsPage.ActualTime(otherName),is(actualTime));
		Assert.assertThat(this.allOfBillsPage.BillingCycleInfo(otherName),is(billingCycle));
	}
	
	public void OverdueDayInfo(String otherName) throws ParseException{
		String Text = this.allOfBillsPage.OverdueDayInfo(otherName);
		//判断逾期时间
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date now = dateFormat.parse( dateFormat.format(new Date()));
		String actual = this.allOfBillsPage.ActualTime(otherName);
		Date actualDate = dateFormat.parse(actual);
		String actualtime;
		long time = now.getTime()-actualDate.getTime();
		if(time>0) {
			time = now.getTime()-actualDate.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = "逾期"+String.valueOf(day)+"天";
		}else {
			time = actualDate.getTime()-now.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = String.valueOf(day)+"天";
		}
		Assert.assertThat(Text, is(actualtime));
		
	}
	
	//ios搜索逾期状态
	public void OverdueDaySeaIOS(String otherName) throws ParseException{
		String Text = this.allOfBillsPage.OverdueDayInfo(otherName);
		//判断逾期时间
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date now = dateFormat.parse( dateFormat.format(new Date()));
		String actual = this.allOfBillsPage.ActualTime(otherName);
		Date actualDate = dateFormat.parse(actual);
		String actualtime;
		long time = now.getTime()-actualDate.getTime();
		if(time>0) {
			time = now.getTime()-actualDate.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = "逾期"+String.valueOf(day)+"天";
		}else {
			time = actualDate.getTime()-now.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = String.valueOf(day)+"天";
		}
		Assert.assertThat(Text, is(actualtime));
		
	}
	
	//账单列表
	public void   ClickFilter(){
		this.allOfBillsPage.ClickFilter();
	}
	
	/*public void   ClickReset(){
		this.allOfBillsPage.ClickReset();
	}*/
	public void   ClickScreeningConditions(String condition){
		this.allOfBillsPage.ClickScreeningConditions(condition);
	}
	
	public void   ClickConfirm(){
		this.allOfBillsPage.ClickConfirm();
	}
	
	public void   ClickManualSet(){
		this.allOfBillsPage.ClickManualSet();
	}
	
	//IOS账单列表
	public void VerityIOSBillsListInfo(String iosroomNub,String iosneedMoney,String ioscloseStatus,String otherName,String rentType,String buildingName,String billAmount,String actualAmount,String invoiceStatus,String invoiceAmount,String actualTime,String billingCycle){
		Assert.assertThat(this.allOfBillsPage.IOSRoomNubInfo(otherName),is(iosroomNub));
		Assert.assertThat(this.allOfBillsPage.IOSNeedMoneyInfo(otherName),is(iosneedMoney));
		Assert.assertThat(this.allOfBillsPage.IOSCloseStatusInfo(otherName),is(ioscloseStatus));
		Assert.assertThat(this.allOfBillsPage.OtherNameInfo(otherName),is(otherName));
		Assert.assertThat(this.allOfBillsPage.RentTypeInfo(otherName),is(rentType));
		Assert.assertThat(this.allOfBillsPage.BuildingNameInfo(otherName),is(buildingName));
		Assert.assertThat(this.allOfBillsPage.BillAmountInfo(otherName),is(billAmount));
		Assert.assertThat(this.allOfBillsPage.ActualAmountInfo(otherName),is(actualAmount));
		Assert.assertThat(this.allOfBillsPage.InvoiceStatusInfo(otherName),is(invoiceStatus));
		Assert.assertThat(this.allOfBillsPage.InvoiceAmountInfo(otherName),is(invoiceAmount));
		Assert.assertThat(this.allOfBillsPage.ActualTime(otherName),is(actualTime));
		Assert.assertThat(this.allOfBillsPage.BillingCycleInfo(otherName),is(billingCycle));
	}
	
	//ios列表逾期状态
	public void OverdueDayIOS(String otherName) throws ParseException{
		String Text = this.allOfBillsPage.IOSOverdueDayInfo(otherName);
		//判断逾期时间
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date now = dateFormat.parse( dateFormat.format(new Date()));
		String actual = this.allOfBillsPage.ActualTime(otherName);
		Date actualDate = dateFormat.parse(actual);
		String actualtime;
		long time = now.getTime()-actualDate.getTime();
		if(time>0) {
			time = now.getTime()-actualDate.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = "逾期"+String.valueOf(day)+"天";
		}else {
			time = actualDate.getTime()-now.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = String.valueOf(day)+"天";
		}
		Assert.assertThat(Text, is(actualtime));
		
	}
	
	//账单详情
	public void ClickBills(String otherName){
		this.allOfBillsPage.ClickBills(otherName);
	}
	
	public void VerityBillDetailsTopInfo(String billAmountDetails,String payedAmountDetails,String needIncomeDetails,String typeDetails,String dateScopeDetails){
		String[] Text=this.allOfBillsPage.BillDetailsTopInfo().split(",");
		Assert.assertThat(Text[0],is(billAmountDetails));
		Assert.assertThat(Text[1],is(payedAmountDetails));
		Assert.assertThat(Text[2],is(needIncomeDetails));
		Assert.assertThat(Text[3],is(typeDetails));
		//Assert.assertThat(Text[4],is(billNumberDetails));
		Assert.assertThat(Text[4],is(dateScopeDetails));
	}
	
	public void VerityBillDetailsInfo(String primeDateDetails,String createDateDetails,String followPeopleDetails,String noteDetails){
		String[] Text=this.allOfBillsPage.BillDetailsInfo().split(",");
		Assert.assertThat(Text[0],is(primeDateDetails));
		Assert.assertThat(Text[1],is(createDateDetails));
		Assert.assertThat(Text[2],is(followPeopleDetails));
		Assert.assertThat(Text[3],is(noteDetails));
	}
	
	public void VerityOtherDetailsInfo(String otherDetails,String contentDetails){
		String[] Text=this.allOfBillsPage.OtherDetailsInfo().split(",");
		Assert.assertThat(Text[0],is(otherDetails));
		Assert.assertThat(Text[1],is(contentDetails));
		//Assert.assertThat(Text[2],is(contractNumberDetails));
	}
	
	public void VerityOtherDetailsInfoIOS(String otherDetails,String contentDetails){
		String[] Text=this.allOfBillsPage.OtherDetailsInfo().split(",");
		Assert.assertThat(Text[0],is(otherDetails));
		Assert.assertThat(Text[1],is("  "+contentDetails+"  "));
		//Assert.assertThat(Text[2],is(contractNumberDetails));
	}
	
	public void VerityBuildingDetailsInfo(String buildingNameDetails,String buildingLocationDetails,String floorDetails,String areaDetails){
		String[] Text=this.allOfBillsPage.BuildingDetailsInfo().split(",");
		Assert.assertThat(Text[0],is(buildingNameDetails));
		Assert.assertThat(Text[1],is(buildingLocationDetails));
		Assert.assertThat(Text[2],is(floorDetails));
		Assert.assertThat(Text[3],is(areaDetails));
	}
	
	public void VerityOppositeDetailsInfo(String oppositeNameDetails,String debitCreditDetails,String occurrenceAmountDetails,String matchedAmountDetails,String incomeDateDetails,String digestDetails){
		String[] Text=this.allOfBillsPage.OppositeDetailsInfo().split(",");
		Assert.assertThat(Text[0],is(oppositeNameDetails));
		Assert.assertThat(Text[1],is(debitCreditDetails));
		Assert.assertThat(Text[2],is(occurrenceAmountDetails));
		Assert.assertThat(Text[3],is(matchedAmountDetails));
		Assert.assertThat(Text[4],is(incomeDateDetails));
		Assert.assertThat(Text[5],is(digestDetails));
	}
	
	public void VerityInvoiceDetailsInfo(String invoiceNameDetails,String invoiceNumberDetails,String invoiceAmountDetails,String invoiceStatusDetails,String invoiceDateDetails,String invoiceNoteDetails){
		String[] Text=this.allOfBillsPage.InvoiceDetailsInfo().split(",");
		Assert.assertThat(Text[0],is(invoiceNameDetails));
		Assert.assertThat(Text[1],is(invoiceNumberDetails));
		Assert.assertThat(Text[2],is(invoiceAmountDetails));
		Assert.assertThat(Text[3],is(invoiceStatusDetails));
		Assert.assertThat(Text[4],is(invoiceDateDetails));
		Assert.assertThat(Text[5],is(invoiceNoteDetails));
	}
	
	public void VerityAdjustDetailsInfo(String adjustAmountDetails,String adjustTypeDetails,String adjustDateDetails,String adjustNoteDetails){
		String[] Text=this.allOfBillsPage.AdjustDetailsInfo().split(",");
		Assert.assertThat(Text[0],is(adjustAmountDetails));
		Assert.assertThat(Text[1],is(adjustTypeDetails));
		Assert.assertThat(Text[2],is(adjustDateDetails));
		Assert.assertThat(Text[3],is(adjustNoteDetails));
	}
	
	//账单状态Android
	public void BillStatusDetails(String billStatus) throws ParseException{
		String Text = this.allOfBillsPage.BillStatusDetails();
		//判断逾期时间
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date now = dateFormat.parse( dateFormat.format(new Date()));
		String actual = this.allOfBillsPage.PrimeDateDetails();
		Date actualDate = dateFormat.parse(actual);
		String actualtime;
		long time = now.getTime()-actualDate.getTime();
		if(time>0) {
			time = now.getTime()-actualDate.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = billStatus+"(逾期"+String.valueOf(day)+"天)";
		}
		else {
			time = actualDate.getTime()-now.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = billStatus+"(正常"+String.valueOf(day)+"天)";
		}
		Assert.assertThat(Text, is(actualtime));
	}
	
	//账单状态IOS
	public void BillStatusIOS(String billStatus) throws ParseException{
		String Text = this.allOfBillsPage.BillStatusDetails();
		//判断逾期时间
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date now = dateFormat.parse( dateFormat.format(new Date()));
		String actual = this.allOfBillsPage.PrimeDateDetails();
		Date actualDate = dateFormat.parse(actual);
		String actualtime;
		long time = now.getTime()-actualDate.getTime();
		if(time>0) {
			time = now.getTime()-actualDate.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = billStatus+"(逾期"+String.valueOf(day)+"天)";
		}
		else {
			time = actualDate.getTime()-now.getTime();
			int day = (int)(time/1000/24/60/60);
			actualtime = billStatus+"(正常"+String.valueOf(day)+"天)";
		}
		Assert.assertThat(Text, is(actualtime));
	}
	
	
	//备注操作
	public void   ClickMore(){
		this.allOfBillsPage.ClickMore();
	}
	
	public void   ClickNote(){
		this.allOfBillsPage.ClickNote();
	}
	
	//合同跳转
	public void   ClickContractNub(){
		this.allOfBillsPage.ClickContractNub();
	}
	
	public void CheakContract(){
		Assert.assertThat(this.allOfBillsPage.CheakContract(), is(true));
	}
	
	public void VerityTenantInfo(String tenant){
		Assert.assertThat(this.allOfBillsPage.TenantInfo(),is(tenant));
	}
	
	//房源跳转
	public void   ClickFloor(){
		this.allOfBillsPage.ClickFloor();
	}
	
	public void CheakTabLayout(){
		Assert.assertThat(this.allOfBillsPage.CheakTabLayout(), is(true));
	}
	
	public void VerityTitleInfo(String tenant){
		Assert.assertThat(this.allOfBillsPage.TitleInfo(),is(tenant));
	}

	//费用类型筛选
	public void ClickReset(){
		this.allOfBillsPage.ClickReset();
	}

	public void ClickRent(String rent){
		this.allOfBillsPage.ClickRent(rent);
	}

	public void checkCostType(String costType){
		List<String> allcostType = allOfBillsPage.checkCostType();
		for (String str:allcostType){
			Assert.assertThat(str,is(costType));
			System.out.println(str);
		}
	}

	//账单类型筛选
	public void ClickBillType(String billType){
		this.allOfBillsPage.ClickBillType(billType);
	}

	public void CheckBillType(String billType){
		List<String> allBillType = allOfBillsPage.checkBillType();
		for(String str:allBillType){
			Assert.assertThat(str.substring(0,2),is(billType));
			System.out.println(str);
		}
	}

	//逾期状态筛选
	public void ClickOverdueState(String overdueState){
		this.allOfBillsPage.ClickOverdueState(overdueState);
	}

	public void CheckOverdueState(String OverdueState){
		List<String> allOverdueState = allOfBillsPage.CheckOverdueState();
		for(String str:allOverdueState){
			Assert.assertThat(str.substring(0,2),is(OverdueState));
			System.out.println(str);
		}
	}

	//结清状态
	public void ClickSettleState(String settleState){
		this.allOfBillsPage.ClickSettleState(settleState);
	}

	public void CheckSettleState(String SettleState){
		List<String> allSettleState = allOfBillsPage.CheckSettleState();
		for(String str:allSettleState){
			Assert.assertThat(str,is(SettleState));
			System.out.println(str);
		}
	}

	//账单显示筛选
	public void ClickClosedBill(String closedBill){
		this.allOfBillsPage.ClickClosedBill(closedBill);
	}

	public void CheckClosedBill(String otherName){
		Assert.assertThat(this.allOfBillsPage.CheckClosedBill(otherName),is(true));
	}

	//折叠按钮
	public void ClickCollapse(){
		this.allOfBillsPage.ClickCollapse();
	}

	public void CheckCollapse(){
		Assert.assertThat(this.allOfBillsPage.CheckCollapse(),is(false));
	}
}
