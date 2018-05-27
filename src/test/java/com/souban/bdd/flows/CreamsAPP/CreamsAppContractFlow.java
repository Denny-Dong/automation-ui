package com.souban.bdd.flows.CreamsAPP;

import static org.hamcrest.core.Is.is;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.souban.bdd.pages.CreamsAPP.CreamsAppContractPage;
import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

public class CreamsAppContractFlow {

	private CreamsAppContractPage creamsAppContractPage = null;
	
	public CreamsAppContractFlow(final Driver driver) {
		this.creamsAppContractPage = PageFactory.getPage(CreamsAppContractPage.class, driver);
	}
	
	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String CurrentDate = dateFormat.format( now );
	
	//合同列表内容检查
	public void GotoNavigationPage(){
		this.creamsAppContractPage.GotoNavigationPage();
	}
	public void intoNavigationPage() {
		Assert.assertThat(this.creamsAppContractPage.intoNavigationPage(), is(true));
	}
	
	public void GotoContractList(){
		this.creamsAppContractPage.GotoContractList();
	}
	
	public void VerifyContractLessee(String lessee){
		Assert.assertThat(this.creamsAppContractPage.CheckLessee(lessee), is(true));
	}
	
	public void VerifyContractInfo(String lessee,String room,String area,String price,String startDate,String endDate){
		String[] contractInfo = this.creamsAppContractPage.CheckContractInfo(lessee).split(",");
		Assert.assertThat(contractInfo[0], is(room));
		Assert.assertThat(contractInfo[1], is(area));
		Assert.assertThat(contractInfo[2], is(price));
		Assert.assertThat(contractInfo[3], is(startDate));
		Assert.assertThat(contractInfo[4], is(endDate));
	}
	
	//android
	public void VerifyRoomBuilding(String lessee,String building){
		Assert.assertThat(this.creamsAppContractPage.CheckRoomBuilding(lessee), is(building));
	}
	
	public void VerifyContractInfo_android(String lessee,String room,String area,String price,String startDate,String endDate){
		String[] contractInfo = this.creamsAppContractPage.CheckContractInfo(lessee).split(",");
		Assert.assertThat(contractInfo[0], is(room));
		Assert.assertThat(contractInfo[1], is(area));
		Assert.assertThat(contractInfo[2], is(price));
		Assert.assertThat(contractInfo[3], is(startDate));
		Assert.assertThat(contractInfo[4], is(endDate));
	}
	
	//到期预警合同列表
	public void GotoExpiresWarningList(){
		this.creamsAppContractPage.GotoExpiresWarningList();
	}
	
	public void VerifyWarningDays(String lessee){
		String ActualWarningDays = this.creamsAppContractPage.GetActualWarningDays(lessee) + "天后到期";
		Assert.assertThat(this.creamsAppContractPage.GetWarningDays(lessee), is(ActualWarningDays));
	}
	
	//android
	public void VerifyWarningDays_android(String lessee){
		String ActualWarningDays = this.creamsAppContractPage.GetActualWarningDays(lessee) + "天到期";
		Assert.assertThat(this.creamsAppContractPage.GetWarningDays(lessee), is(ActualWarningDays));
	}
	
	//到期未处理列表
	public void GotoExpiresUntreatedList(){
		this.creamsAppContractPage.GotoExpiresUntreatedList();
	}
	
	public void VerifyUntreatedDays(String lessee){
		String ActualUntreatedDays = "已到期" + this.creamsAppContractPage.GetActualUntreatedDays(lessee) + "天";
		Assert.assertThat(this.creamsAppContractPage.GetUntreatedDays(lessee), is(ActualUntreatedDays));
	}
	
	//合同详情内容检查
	public void GotoContractDetail(String lessee){
		this.creamsAppContractPage.GotoContractDetail(lessee);
	}
	
	public void VerifyProfileInfo(String state,String leaseConsultant){
		String[] ProfileInfo = this.creamsAppContractPage.CheckProfileInfo().split(",");
		Assert.assertThat(ProfileInfo[0], is(state));
		Assert.assertThat(ProfileInfo[1], is(leaseConsultant));
	}
	
	public void VerifyLeaseInfo(String tenant,String industry,String tenantContact,String legalPerson,String signer){
		String[] LeaseInfo = this.creamsAppContractPage.CheckLeaseInfo().split(",");
		Assert.assertThat(LeaseInfo[0], is(tenant));
		Assert.assertThat(LeaseInfo[1], is(industry));
		Assert.assertThat(LeaseInfo[2], is(tenantContact));
		Assert.assertThat(LeaseInfo[3], is(legalPerson));
		Assert.assertThat(LeaseInfo[4], is(signer));
	}
	
	public void VerifyRoomInfo(String buildingName,String buildingAddress,String floorAndRoom,String area){
		String[] RoomInfo = this.creamsAppContractPage.CheckRoomInfo().split(",");
		Assert.assertThat(RoomInfo[0], is(buildingName));
		Assert.assertThat(RoomInfo[1], is(buildingAddress));
		Assert.assertThat(RoomInfo[2], is(floorAndRoom));
		Assert.assertThat(RoomInfo[3], is(area));
	}
	
	public void VerifyKeyWords(String keyWord1,String note1){
		List<String> KeyWords = new ArrayList<String>();
		KeyWords = this.creamsAppContractPage.CheckKeyWords();
		Assert.assertThat(KeyWords.get(0), is(keyWord1));
		Assert.assertThat(KeyWords.get(1), is(note1));
	}
	
	public void VerifyBaseTerm(String leaseArea,String contractSignDate,String contractStartDate,String contractEndDate,String securityDeposit,String calculationAccuracy){
		String[] BaseTerm = this.creamsAppContractPage.CheckBaseTerm().split(",");
		Assert.assertThat(BaseTerm[0], is(leaseArea));
		Assert.assertThat(BaseTerm[1], is(contractSignDate));
		Assert.assertThat(BaseTerm[2], is(contractStartDate));
		Assert.assertThat(BaseTerm[3], is(contractEndDate));
		Assert.assertThat(BaseTerm[4], is(securityDeposit));
		Assert.assertThat(BaseTerm[5], is(calculationAccuracy));
	}
	
	public void VerifyLeaseTerm(String startDate,String endDate,String billingType,String daysOfOneYear,String payType,String payDate,String contractUnitPrice){
		String[] LeaseTerm = this.creamsAppContractPage.CheckLeaseTerm().split(",");
		Assert.assertThat(LeaseTerm[0], is(startDate));
		Assert.assertThat(LeaseTerm[1], is(endDate));
		Assert.assertThat(LeaseTerm[2], is(billingType));
		Assert.assertThat(LeaseTerm[3], is(daysOfOneYear));
		Assert.assertThat(LeaseTerm[4], is(payType));
		Assert.assertThat(LeaseTerm[5], is(payDate));
		Assert.assertThat(LeaseTerm[6], is(contractUnitPrice));
	}
	
	//android
	public void VerifyRoomInfo_android(String buildingName,String buildingAddress,String floor,String room,String area){
		String[] RoomInfo = this.creamsAppContractPage.CheckRoomInfo_android().split(",");
		Assert.assertThat(RoomInfo[0], is(buildingName));
		Assert.assertThat(RoomInfo[1], is(buildingAddress));
		Assert.assertThat(RoomInfo[2], is(floor));
		Assert.assertThat(RoomInfo[3], is(room));
		Assert.assertThat(RoomInfo[4], is(area));
	}
	
	public void VerifyKeyWords_android(String keyWord1,String note1){
		String[] KeyWords = this.creamsAppContractPage.CheckKeyWords_android().split(",");
		Assert.assertThat(KeyWords[0], is(keyWord1));
		Assert.assertThat(KeyWords[1], is(note1));
	}
	
	public void VerifyBaseTerm_android(String leaseArea,String contractSignDate,String contractStartDate,String contractEndDate,String securityDeposit,String calculationAccuracy){
		String[] BaseTerm = this.creamsAppContractPage.CheckBaseTerm_android().split(",");
		Assert.assertThat(BaseTerm[0] + "m²", is(leaseArea));
		Assert.assertThat(BaseTerm[1], is(contractSignDate));
		Assert.assertThat(BaseTerm[2], is(contractStartDate));
		Assert.assertThat(BaseTerm[3], is(contractEndDate));
		Assert.assertThat(BaseTerm[4] + BaseTerm[5], is(securityDeposit));
		Assert.assertThat(BaseTerm[6], is(calculationAccuracy));
	}
	
	public void VerifyLeaseTerm_android(String startDate,String endDate,String billingType,String daysOfOneYear,String payType,String payDate,String contractUnitPrice){
		String[] LeaseTerm = this.creamsAppContractPage.CheckLeaseTerm_android().split(",");
		Assert.assertThat(LeaseTerm[0], is(startDate));
		Assert.assertThat(LeaseTerm[1], is(endDate));
		Assert.assertThat(LeaseTerm[2], is(billingType));
		Assert.assertThat(LeaseTerm[3], is(daysOfOneYear));
		Assert.assertThat(LeaseTerm[4], is(payType));
		Assert.assertThat(LeaseTerm[5] + LeaseTerm[6], is(payDate));
		Assert.assertThat(LeaseTerm[7], is(contractUnitPrice));
	}

	public void CheckRentDetail(){
		Assert.assertThat(this.creamsAppContractPage.CheckRentDetail(),is(true));
	}
	
	//合同详情增加备注
	public void ClickOperator(){
		this.creamsAppContractPage.ClickOperator();
	}
	
	public void GotoNoteList(){
		this.creamsAppContractPage.GotoNoteList();
	}
	
	public void ClickAddNote(){
		this.creamsAppContractPage.ClickAddNote();
	}
	
	
	public void VerifyDefultInfo(String account){
		List<String> DefultInfo = new ArrayList<String>();
		DefultInfo = this.creamsAppContractPage.CheckDefultInfo();
		Assert.assertThat(DefultInfo.get(0), is(account));
		Assert.assertThat(DefultInfo.get(1), is(CurrentDate));
	}
	
	public void InputNote(String text){
		this.creamsAppContractPage.InputNote(text);
	}
	
	public void ClickSaveNote(){
		this.creamsAppContractPage.ClickSaveNote();
	}
	
	public void VerifyNoteInfo(String account,String note){
		List<String> NoteInfo = new ArrayList<String>();
		NoteInfo = this.creamsAppContractPage.CheckNoteInfo();
		Assert.assertThat(NoteInfo.get(0), is(account));
		Assert.assertThat(NoteInfo.get(1), is(CurrentDate1));
		Assert.assertThat(NoteInfo.get(2), is(note));
	}
	
	//android
	
	public void checkCreatTab() {
		Assert.assertThat(this.creamsAppContractPage.checkCreatTab(), is(true));
	}
	
	SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
	String CurrentDate1 = dateFormat1.format( now );
	public void VerifyDefaultInfo_android(String defaultName){
		String[] DefaultInfo = this.creamsAppContractPage.CheckDefaultInfo_android().split(",");
		Assert.assertThat(DefaultInfo[0], is(defaultName));
		Assert.assertThat(DefaultInfo[1], is(CurrentDate1));
	}
	
	public void checkNoteTab() {
		Assert.assertThat(this.creamsAppContractPage.checkNoteTab(), is(true));
	}
	
	public void VerifyNoteInfo_android(String account,String note){
		String[] NoteInfo = this.creamsAppContractPage.CheckNoteInfo_android().split(",");
		Assert.assertThat(NoteInfo[0] + NoteInfo[1], is(account));
		Assert.assertThat(NoteInfo[2], is(CurrentDate1));
		Assert.assertThat(NoteInfo[3], is(note));
	}
	
	//编辑备注
		public void ClickContractButtonMore(){
			this.creamsAppContractPage.ClickContractButtonMore();
		}
		
		public void ClickEditNote(){
			this.creamsAppContractPage.ClickEditNote();
		}
		
		public void EditNoteContent(String text){
			this.creamsAppContractPage.EditNoteContent(text);
		}
		
		public void VerifyNoteAfterEdit(String note){
			Assert.assertThat(this.creamsAppContractPage.CheckNoteAfterEdit(), is(note));
		}
		
		//删除备注
		public void ClickDeleteNote(){
			this.creamsAppContractPage.ClickDeleteNote();
		}
		
		public void DeleteConfirm(){
			this.creamsAppContractPage.DeleteConfirm();
		}
		
		public void VerifyDeleteNoteResult(String note){
			Assert.assertThat(this.creamsAppContractPage.CheckDeleteNoteResult(note), is(false));
		}
		
		//操作记录
		public void GotoOperationRecordList(){
			this.creamsAppContractPage.GotoOperationRecordList();
		}
		
		public void VerifyRecordContent(String operator,String operationTime,String operationRecord1,String operationRecord2){
			List<String> RecordContent = new ArrayList<String>();
			RecordContent = this.creamsAppContractPage.CheckRecordContent();
			Assert.assertThat(RecordContent.get(0), is(operator));
			Assert.assertThat(RecordContent.get(1), is(operationTime));
			Assert.assertThat(RecordContent.get(5), is(operationRecord1+"\n"));
			Assert.assertThat(RecordContent.get(2), is(operationRecord2+"\n"));
		}
		
		//检查查看合同账单列表按钮是否存在
		public void VerifyContractState(String contractState){
			Assert.assertThat(this.creamsAppContractPage.CheckContractState(), is(contractState));
		}
		public void VerifyIsExsitContractBillListButton(){
			Assert.assertThat(this.creamsAppContractPage.CheckIsExsitContractBillListButton(), is(false));
		}
		
		//查看合同账单列表内容显示
		public void VerifyContractBillListButton(){
			Assert.assertThat(this.creamsAppContractPage.CheckContractBillListButton(), is(true));
		}
		
		public void VerifyGotoBillList(){
			this.creamsAppContractPage.GotoContractBillList();
			Assert.assertThat(this.creamsAppContractPage.CheckGotoBillListResult(), is(true));
		}
		
		public void VerifyBillTypeIsExist(String billType1,String billType2){
			List<String> ActualBillType  = new ArrayList<String>();
			ActualBillType = this.creamsAppContractPage.CheckBillType();
			Assert.assertThat(ActualBillType.get(0), is(billType1));
			Assert.assertThat(ActualBillType.get(1), is(billType2));
		}
		
		public void VerifyBillInfo1(String billAmount,String actualAmount,String invoiceAmount,String actualTime,String billingCycle){
			
			int actualOverdueDays = this.creamsAppContractPage.GetActualOverdueDays(0);
			String ExpectBillCloseStatus;
			if(actualOverdueDays >= 0){
				 ExpectBillCloseStatus = "未结清/" + actualOverdueDays + "天";
			}else{
				 ExpectBillCloseStatus = "未结清/逾期" + (-actualOverdueDays) + "天";
			}
			
			List<String> ActualCloseStatus  = new ArrayList<String>();
			ActualCloseStatus = this.creamsAppContractPage.CheckBillCloseStatus();
			Assert.assertThat(ActualCloseStatus.get(1), is(ExpectBillCloseStatus));
			
			List<String> ActualBillAmount  = new ArrayList<String>();
			ActualBillAmount = this.creamsAppContractPage.CheckBillAmount();
			Assert.assertThat(ActualBillAmount.get(1), is(billAmount));
			
			List<String> ActualActualAmount  = new ArrayList<String>();
			ActualActualAmount = this.creamsAppContractPage.CheckActualAmount();
			Assert.assertThat(ActualActualAmount.get(1), is(actualAmount));
			
			List<String> ActualInvoiceAmount  = new ArrayList<String>();
			ActualInvoiceAmount = this.creamsAppContractPage.CheckInvoiceAmount();
			Assert.assertThat(ActualInvoiceAmount.get(1), is(invoiceAmount));
			
			List<String> ActualActualTime  = new ArrayList<String>();
			ActualActualTime = this.creamsAppContractPage.CheckActualTime();
			Assert.assertThat(ActualActualTime.get(1), is(actualTime));
			
			List<String> ActualBillingCycle  = new ArrayList<String>();
			ActualBillingCycle = this.creamsAppContractPage.CheckBillingCycle();
			Assert.assertThat(ActualBillingCycle.get(1), is(billingCycle));
		}
		
		public void VerifyBillInfo2(String billAmount,String actualAmount,String invoiceAmount,String actualTime,String billingCycle){
			
			int actualOverdueDays = this.creamsAppContractPage.GetActualOverdueDays(1);
			String ExpectBillCloseStatus;
			if(actualOverdueDays >= 0){
				 ExpectBillCloseStatus = "未结清/" + actualOverdueDays + "天";
			}else{
				 ExpectBillCloseStatus = "未结清/逾期" + (-actualOverdueDays) + "天";
			}
			
			List<String> ActualCloseStatus  = new ArrayList<String>();
			ActualCloseStatus = this.creamsAppContractPage.CheckBillCloseStatus();
			Assert.assertThat(ActualCloseStatus.get(0), is(ExpectBillCloseStatus));
			
			List<String> ActualBillAmount  = new ArrayList<String>();
			ActualBillAmount = this.creamsAppContractPage.CheckBillAmount();
			Assert.assertThat(ActualBillAmount.get(0), is(billAmount));
			
			List<String> ActualActualAmount  = new ArrayList<String>();
			ActualActualAmount = this.creamsAppContractPage.CheckActualAmount();
			Assert.assertThat(ActualActualAmount.get(0), is(actualAmount));
			
			List<String> ActualInvoiceAmount  = new ArrayList<String>();
			ActualInvoiceAmount = this.creamsAppContractPage.CheckInvoiceAmount();
			Assert.assertThat(ActualInvoiceAmount.get(0), is(invoiceAmount));
			
			List<String> ActualActualTime  = new ArrayList<String>();
			ActualActualTime = this.creamsAppContractPage.CheckActualTime();
			Assert.assertThat(ActualActualTime.get(0), is(actualTime));
			
			List<String> ActualBillingCycle  = new ArrayList<String>();
			ActualBillingCycle = this.creamsAppContractPage.CheckBillingCycle();
			Assert.assertThat(ActualBillingCycle.get(0), is(billingCycle));
		}

		//合同详情查看租金明细报表内容
	public void ClickRentDetail(){
		this.creamsAppContractPage.ClickRentDetail();
	}

	public void VerifyCheckDeposit(String deposit){
		String[] DepositInfo = this.creamsAppContractPage.CheckDeposit(deposit).split(",");
		Assert.assertThat(DepositInfo[0], is(deposit));
	}

	public void VerifyCheckSectionA(String sectionA,String finalPriceA,String paymentDayA,String finalAmountA){
		String[] SectionAInfo = this.creamsAppContractPage.CheckSectionA(sectionA).split(",");
		Assert.assertThat(SectionAInfo[0], is(sectionA));
		Assert.assertThat(SectionAInfo[1], is(finalPriceA));
		Assert.assertThat(SectionAInfo[2], is(paymentDayA));
		Assert.assertThat(SectionAInfo[3], is(finalAmountA));
	}

	public void VerifyCheckSectionB(String sectionB,String finalPriceB,String paymentDayB,String finalAmountB){
		String[] SectionBInfo = this.creamsAppContractPage.CheckSectionB(sectionB).split(",");
		Assert.assertThat(SectionBInfo[0], is(sectionB));
		Assert.assertThat(SectionBInfo[1], is(finalPriceB));
		Assert.assertThat(SectionBInfo[2], is(paymentDayB));
		Assert.assertThat(SectionBInfo[3], is(finalAmountB));
	}

	//合同审核
	public void ClickFilter(){
		this.creamsAppContractPage.ClickFilter();
	}

	public void ClickReviweState(String reviewState){
		this.creamsAppContractPage.ClickReviweState(reviewState);
	}

	public void ClickConfirm(){
		this.creamsAppContractPage.ClickConfirm();
	}

	public void ClickList(){
		this.creamsAppContractPage.ClickList();
	}
	public void CheckState(String reviewStateInfo){
		Assert.assertThat(this.creamsAppContractPage.CheckState(reviewStateInfo),is(true));
	}

}
