package com.souban.bdd.flows.CreamsAPP;

import static org.hamcrest.core.Is.is;

import com.souban.bdd.pages.CreamsAPP.DetailsOfContractOperationPage;
import org.junit.Assert;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;


public class DetailsOfContractOperationFlow {

	private DetailsOfContractOperationPage detailsofcontractcperationPage = null;
	
	public DetailsOfContractOperationFlow(final Driver driver){
		this.detailsofcontractcperationPage = PageFactory.getPage(DetailsOfContractOperationPage.class, driver);
	}
	
	//【合同详情】已有历史审核的新建待审核的合同查看新建审核-方法
	public void ClickNavigation(){
		this.detailsofcontractcperationPage.ClickNavigation();
	}
	
	public void ClickContractList(){
		this.detailsofcontractcperationPage.ClickContractList();
	}
	
	public void ClickContractSearch(){
		this.detailsofcontractcperationPage.ClickContractSearch();
	}
	
	public void ClickContrack(String tenant){
		this.detailsofcontractcperationPage.ClickContrack(tenant);
	}
	
	public void ClickContractOperation(){
		this.detailsofcontractcperationPage.ClickContractOperation();
	}
	
	public void ClickViewNewAudit(){
		this.detailsofcontractcperationPage.ClickViewNewAudit();
	}
	
	public void VerityHistoricalAuditInfo(String historicalauthor,String historicaltime,String historicalStatus,String historicalName,String historicalNameTime,String notpassinginfo){
		String[] HistoricalAuditInfo = this.detailsofcontractcperationPage.HistoricalAuditInfo().split(",");
		Assert.assertThat(HistoricalAuditInfo[0], is(historicalauthor));
		Assert.assertThat(HistoricalAuditInfo[1], is(historicaltime));
		Assert.assertThat(HistoricalAuditInfo[2], is(historicalStatus));
		Assert.assertThat(HistoricalAuditInfo[3], is(historicalName));
		Assert.assertThat(HistoricalAuditInfo[4], is(historicalNameTime));
		Assert.assertThat(HistoricalAuditInfo[5], is(notpassinginfo));
	}
	
	public void VerityHistoricalAuditInfoIOS(String historicalauthor,String historicaltime,String historicalStatus,String historicalName,String notpassinginfo){
		String[] HistoricalAuditInfo = this.detailsofcontractcperationPage.HistoricalAuditInfoIOS().split(",");
		Assert.assertThat(HistoricalAuditInfo[0], is(historicalauthor));
		Assert.assertThat(HistoricalAuditInfo[1], is(historicaltime));
		Assert.assertThat(HistoricalAuditInfo[2], is(historicalStatus));
		Assert.assertThat(HistoricalAuditInfo[3], is(historicalName));		
		Assert.assertThat(HistoricalAuditInfo[4], is(notpassinginfo));
	}
	
	public void VerityCurrentAuditInfo(String currentAuthor,String currentTime,String auditWait){
		String[] CurrentAuditInfo = this.detailsofcontractcperationPage.CurrentAuditInfo().split(",");
		Assert.assertThat(CurrentAuditInfo[0], is(currentAuthor));
		Assert.assertThat(CurrentAuditInfo[1], is(currentTime));
		Assert.assertThat(CurrentAuditInfo[2], is(auditWait));
	}
	
	//【合同详情】已有历史审核的新建待审核的合同查看新建审核
	
	public void ClickViewRentAgreement(){
		this.detailsofcontractcperationPage.ClickViewRentAgreement();
	}
	
	public void VerityRenterInfo(String rentSponsor,String rentArea,String rentTime,String changeRegisteredAddress){
		String[] RenterInfo = this.detailsofcontractcperationPage.RenterInfo().split(",");
		Assert.assertThat(RenterInfo[0], is(rentSponsor));
		//Assert.assertThat(RenterInfo[1], is(rentContractID));
		Assert.assertThat(RenterInfo[1], is(rentArea));
		Assert.assertThat(RenterInfo[2], is(rentTime));
		Assert.assertThat(RenterInfo[3], is(changeRegisteredAddress));
	}
	
	public void VerityBuildingInfo(String Building,String Address,String Floor,String Area){
		String[] BuildingInfo = this.detailsofcontractcperationPage.BuildingInfo().split(",");
		Assert.assertThat(BuildingInfo[0], is(Building));
		Assert.assertThat(BuildingInfo[1], is(Address));
		Assert.assertThat(BuildingInfo[2], is(Floor));
		Assert.assertThat(BuildingInfo[3], is(Area));
		
	}
	
	
/*	public void VerityBuildingInfoAndroid(String Building,String Address,String Floor,String RoomNumber,String Area){
		String[] BuildingInfo = this.detailsofcontractcperationPage.BuildingInfoAndroid().split(",");
		Assert.assertThat(BuildingInfo[0], is(Building));
		Assert.assertThat(BuildingInfo[1], is(Address));
		Assert.assertThat(BuildingInfo[2], is(Floor));
		Assert.assertThat(BuildingInfo[3], is(RoomNumber));
		Assert.assertThat(BuildingInfo[4], is(Area));
	}*/
	public void VerityRefundAccountInfo(String RentDate,String RentBillAmount,String ReceivablesCash,String RealIncomeExpenditure,String RentTotalReceivable){
		String[] RefundAccountInfo = this.detailsofcontractcperationPage.RefundAccountInfo().split(",");
		Assert.assertThat(RefundAccountInfo[0], is(RentDate));
		Assert.assertThat(RefundAccountInfo[1], is(RentBillAmount));
		Assert.assertThat(RefundAccountInfo[2], is(ReceivablesCash));
		Assert.assertThat(RefundAccountInfo[3], is(RealIncomeExpenditure));
		Assert.assertThat(RefundAccountInfo[4], is(RentTotalReceivable));
	}
	
	public void VerityBondInfo(String BondBillAmount,String BondAmountPaid,String BondTotalRefundable){
		String[] BondInfo = this.detailsofcontractcperationPage.BondInfo().split(",");
		Assert.assertThat(BondInfo[0], is(BondBillAmount));
		Assert.assertThat(BondInfo[1], is(BondAmountPaid));
		Assert.assertThat(BondInfo[2], is(BondTotalRefundable));

	}
	
	public void VerityOtherInfo(String otherActualIncome,String otherNote,String otherTotalReceivable){
		String[] BondInfo = this.detailsofcontractcperationPage.OtherInfo().split(",");
		Assert.assertThat(BondInfo[0], is(otherActualIncome));
		Assert.assertThat(BondInfo[1], is(otherNote));
		Assert.assertThat(BondInfo[2], is(otherTotalReceivable));
	}
	
	public void VerityTotalInfo(String TotalBond,String TotalBill,String TotalOther,String TotalReceivable){
		String[] TotalInfo = this.detailsofcontractcperationPage.TotalInfo().split(",");
		Assert.assertThat(TotalInfo[0], is(TotalBond));
		Assert.assertThat(TotalInfo[1], is(TotalBill));
		Assert.assertThat(TotalInfo[2], is(TotalOther));
		Assert.assertThat(TotalInfo[3], is(TotalReceivable));
		
	}
	
	public void VerityReasonsInfo(String RentReasons){
		Assert.assertThat(this.detailsofcontractcperationPage.ReasonsInfo(), is(RentReasons));
	}
	
	public void VerityMemoInfo(String MemoInfo){
		Assert.assertThat(this.detailsofcontractcperationPage.MemoInfo(), is(MemoInfo));
	}
	
	
	//【合同详情】查看退租待修改状态下的合同退租审核
	public void ClickViewRentAuditing(){
		this.detailsofcontractcperationPage.ClickViewRentAuditing();
	}
	
	/*public void VerityRentAuditingInfo(String rentAuditingPresenter,String rentAuditingDate,String rentAuditingWait){
		String[] RentAuditingInfo = this.detailsofcontractcperationPage.RentAuditingInfo().split(",");
		Assert.assertThat(RentAuditingInfo[0], is(rentAuditingPresenter));
		Assert.assertThat(RentAuditingInfo[1], is(rentAuditingDate));
		Assert.assertThat(RentAuditingInfo[2], is(rentAuditingWait));
				
	}*/
	public void CheakCurrentAudit(){
		Assert.assertThat(this.detailsofcontractcperationPage.CheakCurrentAudit(), is(false));
	}
	
	//【合同详情】提交作废申请的合同查看作废审核
	public void ClickViewDeleteAuditing(){
		this.detailsofcontractcperationPage.ClickViewDeleteAuditing();
	}
	
	public void VerityDeleteAuditingInfo(String deleteAuditingPresenter,String deleteAuditingDate,String deleteAuditingWait){
		String[] DeleteAuditingInfo = this.detailsofcontractcperationPage.DeleteAuditingInfo().split(",");
		Assert.assertThat(DeleteAuditingInfo[0], is(deleteAuditingPresenter));
		Assert.assertThat(DeleteAuditingInfo[1], is(deleteAuditingDate));
		Assert.assertThat(DeleteAuditingInfo[2], is(deleteAuditingWait));
	}
	
	//【合同详情】提交作废审核的合同查看作废原因
	public void ClickViewDeleteReason(){
		this.detailsofcontractcperationPage.ClickViewDeleteReason();
	}
	
	public void VerityDeleteReasonInfo(String deleteReason,String deleteReasonProcessing){
		String[] DeleteReasonInfo = this.detailsofcontractcperationPage.DeleteReasonInfo().split(",");
		Assert.assertThat(DeleteReasonInfo[0], is(deleteReason));
		Assert.assertThat(DeleteReasonInfo[1], is(deleteReasonProcessing));
		
	}
	
	
	
	
	
	
}
