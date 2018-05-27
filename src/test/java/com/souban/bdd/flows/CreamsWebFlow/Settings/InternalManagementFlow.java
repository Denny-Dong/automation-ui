package com.souban.bdd.flows.CreamsWebFlow.Settings;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Settings.InternalManagementPage;

public class InternalManagementFlow {
	private InternalManagementPage internalmanagementpage = null;

	public InternalManagementFlow(Driver driver) {
		this.internalmanagementpage = PageFactory.getPage(InternalManagementPage.class, driver);
	}

	public void enterAccountSettingsPage() {
		this.internalmanagementpage.enterAccountSettingsPage();
	}

	public void returnInternalManagementPage() {
		this.internalmanagementpage.returnInternalManagementPage();
	}

	public void inputTenantName(String tenantName) {
		this.internalmanagementpage.inputTenantName(tenantName);
	}

	public void createNewKeywordOnContract(String keyword) {
		this.internalmanagementpage.createNewKeywordOnContract(keyword);
	}

	public void chooseBuildingKeywordOfContract(String building) {
		this.internalmanagementpage.chooseBuildingKeywordOfContract(building);
	}

	public void checkBuildingKeyword(String keyword) {
		this.internalmanagementpage.checkBuildingKeyword(keyword);
	}

	public void cancelDisplayOfKeyword(String keyword) {
		this.internalmanagementpage.cancelDisplayOfKeyword(keyword);
	}

	public void checkKeywordNotExist(String keyword) {
		Assert.assertThat(this.internalmanagementpage.checkKeywordNotExist(keyword), is(false));
	}

	public void deleteKeywordOnContract(String keyword) {
		this.internalmanagementpage.deleteKeywordOnContract(keyword);
	}

	public void inputDepositAndPrice(String deposit) {
		this.internalmanagementpage.inputDepositAndPrice(deposit);
	}

	public void chooseBuildingKeywordOfPropertyContract(String building) {
		this.internalmanagementpage.chooseBuildingKeywordOfPropertyContract(building);
	}

	public void deleteSellerInformation(String sname) {
		this.internalmanagementpage.deleteSellerInformation(sname);
	}

	public void sureToDeleteSellerInformation() {
		this.internalmanagementpage.sureToDeleteSellerInformation();
	}

	public void createNewContractTamplate() {
		this.internalmanagementpage.createNewContractTamplate();
	}

	public void inputContractTamplateName(String templatename) {
		this.internalmanagementpage.inputContractTamplateName(templatename);
	}

	public void uploadContractTamplate() {
		this.internalmanagementpage.uploadContractTamplate();
	}

	public void saveContractTamplate() {
		this.internalmanagementpage.saveContractTamplate();
	}

	public void checkContractTamplateOnList(String templatename) {
		Assert.assertThat(this.internalmanagementpage.checkContractTamplateOnList(templatename), is(true));
	}
	public void enterContractDetil(){
		this.internalmanagementpage.enterContractDetil();
	}
	public void clickPrintOfContract(){
		this.internalmanagementpage.clickPrintOfContract();
	}
	public void contractTemplatePrint(String templatename){
		this.internalmanagementpage.contractTemplatePrint(templatename);
	}
	public void checkContractPrintSuccessful(){
		Assert.assertThat(this.internalmanagementpage.checkContractPrintSuccessful(),is(true));
	}
	public void clickDeleteTemplate(String templatename){
		this.internalmanagementpage.clickDeleteTemplate(templatename);
	}
	public void checkTemplateDeleteSuccessful(String templatename){
		Assert.assertThat(this.internalmanagementpage.checkTemplateDeleteSuccessful(templatename),is(false));
	}
	public void inputPropertyContractTamplateName(String templatename){
		this.internalmanagementpage.inputPropertyContractTamplateName(templatename);
	}
	public void createNewPropertyContractTamplate(){
		this.internalmanagementpage.createNewPropertyContractTamplate();
	}
	public void enterPropertyContractMangement(){
		this.internalmanagementpage.enterPropertyContractMangement();
	}
    public void createNewNoticeTamplate(){
	    this.internalmanagementpage.createNewNoticeTamplate();
    }
    public void inputNoticeTamplateName(String templatename){
	    this.internalmanagementpage.inputNoticeTamplateName(templatename);
    }
    public void uploadNoticeTamplate(){
	    this.internalmanagementpage.uploadNoticeTamplate();
    }
    public void chooseOneBill(){
	    this.internalmanagementpage.chooseOneBill();
    }
    public void createNoticeTemplate(String templatename){
	    this.internalmanagementpage.createNoticeTemplate(templatename);
    }
    public void checkNoticeCreateSuccessful(){
	    Assert.assertThat(this.internalmanagementpage.checkNoticeCreateSuccessful(),is(true));
    }
    public void enterBillTypePage(){
		this.internalmanagementpage.enterBillTypePage();
	}
	public void createNewBillType(String billtype){
		this.internalmanagementpage.createNewBillType(billtype);
	}
	public void checkBillTypeCreateSuccessful(String billtype){
		Assert.assertThat(this.internalmanagementpage.checkBillTypeCreateSuccessful(billtype),is(true));
	}
	public void checkBillTypeOnDetil(String type){
		Assert.assertThat(this.internalmanagementpage.checkBillTypeOnDetil(type),is(true));
	}
	public void deleteBillType(String keyword){
		this.internalmanagementpage.deleteBillType(keyword);
	}
	public void checkBillTypeDelete(String type){
		Assert.assertThat(this.internalmanagementpage.checkBillTypeDelete(type),is(false));
	}
	public void enterTenantLabelPage(){
		this.internalmanagementpage.enterTenantLabelPage();
	}
	public void  createNewTenantLabel(String label){
		this.internalmanagementpage.createNewTenantLabel(label);
	}
	public void checkTenantLabelOnList(String label){
		Assert.assertThat(this.internalmanagementpage.checkTenantLabelOnList(label),is(true));
	}
	public void editTenantLabel(String label,String labelname){
		this.internalmanagementpage.editTenantLabel(label,labelname);
	}
	public void deleteTenantLabel(String label){
		this.internalmanagementpage.deleteTenantLabel(label);
	}
	public void  checkTenantLabelDelete(String label){
		Assert.assertThat(this.internalmanagementpage.checkTenantLabelDelete(label),is(false));
	}
}
