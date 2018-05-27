package com.souban.bdd.flows.CreamsAPP;

import static org.hamcrest.core.Is.is;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import com.souban.bdd.pages.CreamsAPP.CreamsAPPMarginBalancePage;
import org.junit.Assert;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

public class CreamsAPPMarginBalanceFlow {
	private CreamsAPPMarginBalancePage creamsAPPMarginBalancePage = null;
	
	public CreamsAPPMarginBalanceFlow(final Driver driver) {
		this.creamsAPPMarginBalancePage = PageFactory.getPage(CreamsAPPMarginBalancePage.class, driver);
	}
	
	/**
	 * 搜索账单
	 */
	public void clickMarginBalance() {
		this.creamsAPPMarginBalancePage.clickMarginBalance();
	}
	public void intoMarginBalancePage() {
		Assert.assertThat(this.creamsAPPMarginBalancePage.intoMarginBalancePage(), is(true));
		//System.out.println("进入保证金列表");
	}
	public void clickSearch() {
		this.creamsAPPMarginBalancePage.clickSearch();
	}
	public void intoSearchPage() {
		Assert.assertThat(this.creamsAPPMarginBalancePage.intoSearchPage(), is(true));
		//System.out.println("进入搜索页");
	}
	public void inputCompanyName(String companyName) {
		this.creamsAPPMarginBalancePage.inputCompanyName(companyName);
	}
	//断言
	public void checkSearchResult(String companyName) {
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkSearchResult(companyName), is(true));
	}
	//android
	public void checkSearchInformation_android(String companyName, String roomNum, String needMoney, String billCloseStatus,
			String receiveTime, String parkName, String billAmount, String actualAmount){
		String info = this.creamsAPPMarginBalancePage.checkSearchInformation_android(companyName);
		String[] actualInfo = info.split(";");
		Assert.assertThat(actualInfo[0], is(roomNum));
		Assert.assertThat(actualInfo[1], is(needMoney));
		Assert.assertThat(actualInfo[2], is(billCloseStatus));
		Assert.assertThat(actualInfo[3], is(receiveTime));
		Assert.assertThat(actualInfo[4], is(parkName));
		Assert.assertThat(actualInfo[5], is(billAmount));
		Assert.assertThat(actualInfo[6], is(actualAmount));
		//System.out.println("搜索的客户数据正确！！！");
	}
	//ios
	public void checkSearchInformation_ios(String companyName, String roomNum, String needMoney, String billCloseStatus,
			String receiveTime, String parkName, String billAmount, String actualAmount, String costType){
		String info = this.creamsAPPMarginBalancePage.checkSearchInformation_ios(companyName);
		String[] actualInfo = info.split(";");
		Assert.assertThat(actualInfo[0], is(roomNum));
		Assert.assertThat(actualInfo[1], is(needMoney));
		Assert.assertThat(actualInfo[2], is(billCloseStatus));
		Assert.assertThat(actualInfo[3], is(receiveTime));
		Assert.assertThat(actualInfo[4], is(parkName));
		Assert.assertThat(actualInfo[5], is(billAmount));
		Assert.assertThat(actualInfo[6], is(actualAmount));
		Assert.assertThat(actualInfo[7], is(costType));
		//System.out.println("搜索的客户数据正确！！！");
	}
	//android
	public void checkOverDueDay_android(String companyName) throws Exception {
		//判断逾期时间
		int days = this.creamsAPPMarginBalancePage.getReceiveTime(companyName);
		String str = null;
		if(days>0) {
			str = "逾期"+String.valueOf(days)+"天";
		}else if(days<0){
			str = String.valueOf(-days)+"天";
		}else {
			str = String.valueOf(days)+"天";
		}
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkOverDueDay(companyName), is(str));
		//System.out.println("逾期时间显示正确");
	}
	//ios
	public void checkOverDueDay_ios(String companyName) throws Exception {
		//判断逾期时间
		int days = this.creamsAPPMarginBalancePage.getReceiveTime(companyName);
		String str = null;
		if(days>0) {
			str = "逾期"+String.valueOf(days)+"天";
		}else if(days<0){
			str = String.valueOf(-days)+"天";
		}else {
			str = String.valueOf(days)+"天";
		}
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkOverDueDay(companyName), is(str));
		//System.out.println("逾期时间显示正确");
	}
	
	
	/**
	 * 查看账单详情
	 */
	public void intoBillDetail(String companyName) {
		this.creamsAPPMarginBalancePage.intoBillDetail(companyName);
	}
	public void intoBillDetailSuccessful() {
		this.creamsAPPMarginBalancePage.intoBillDetailSuccessful();
		System.out.println("成功进入账单详情页，开始检查详情页内容");
	}
	//android
	public void checkBillDetail_android(String billAmount, String actualAmount, String needMoney, String depositAmount, String feeltype, String billStatus,
			String billNumber, String dateScope, String receiveTime, String createTime, String followPeople, String note) throws Exception {
		//判断逾期时间
		int days = this.creamsAPPMarginBalancePage.getReceiveTime();
		String str = null;
		if(days>0) {
			str = billStatus+"(逾期"+String.valueOf(days)+"天)";
		}else if(days<0){
			str = billStatus+"("+String.valueOf(-days)+"天)";
		}else {
			str = billStatus+"("+String.valueOf(days)+"天)";
		}
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkBillAmount(), is(billAmount));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkActualAmount(), is(actualAmount));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkNeedMoney(), is(needMoney));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkDepositAmount(), is(depositAmount));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkFeelType(), is(feeltype));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkBillStatus(), is(str));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkBillNumber(), is(billNumber));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkDateScope(), is(dateScope));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkReceiveTime(), is(receiveTime));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkCreateTime(), is(createTime));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkFollowPeople(), is(followPeople));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkNote(), is(note));
		//System.out.println("信息核对正确");
	}
	//ios
	public void checkBillDetail_ios(String billAmount, String actualAmount, String needMoney, String depositAmount, String feeltype, String billStatus,
			String billNumber, String dateScope, String receiveTime, String createTime, String followPeople, String note) throws ParseException {
		//判断逾期时间
		int days = this.creamsAPPMarginBalancePage.getReceiveTime();
		String str = null;
		if(days>0) {
			str = billStatus+"(逾期"+String.valueOf(days)+"天)";
		}else if(days<0){
			str = billStatus+"("+String.valueOf(-days)+"天)";
		}else {
			str = billStatus+"("+String.valueOf(days)+"天)";
		}
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkBillAmount(), is(billAmount));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkActualAmount(), is(actualAmount));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkNeedMoney(), is(needMoney));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkDepositAmount(), is(depositAmount));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkFeelType(), is(feeltype));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkBillStatus(), is(str));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkBillNumber(), is(billNumber));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkDateScope(), is(dateScope));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkReceiveTime(), is(receiveTime));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkCreateTime(), is(createTime));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkFollowPeople(), is(followPeople));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkNote(), is(note));
		//System.out.println("信息核对正确");
	}
	//检查付款方信息
	public void checkCompanyInformation(String comanyName, String companyTel, String contactNum) {
		String info = this.creamsAPPMarginBalancePage.checkCompanyInformation();
		String[] actualInfo = info.split(",");
		Assert.assertThat(actualInfo[0], is(comanyName));
		Assert.assertThat(actualInfo[1], is(companyTel));
		Assert.assertThat(actualInfo[2], is(contactNum));
		//System.out.println("付款方信息显示正确！！！");
	}
	
	//检查房源信息
	public void checkRoomInformation(String buildingName, String floor, String size) {
		String info = this.creamsAPPMarginBalancePage.checkRoomInformation();
		String[] actualInfo = info.split(",");
		Assert.assertThat(actualInfo[0], is(buildingName));
		Assert.assertThat(actualInfo[1], is(floor));
		Assert.assertThat(actualInfo[2], is(size));
		//System.out.println("房源信息显示正确！！！");
	}	
	//检查收支流水内容
	public void checkIncomeInformation(String companyName, String debitAndCredit, String sendAmount,
			String matchAmount, String incomeDate, String degest) {
		String info = this.creamsAPPMarginBalancePage.checkIncomeInformation();
		String[] actualInfo = info.split(",");
		Assert.assertThat(actualInfo[0], is(companyName));
		Assert.assertThat(actualInfo[1], is(debitAndCredit));
		Assert.assertThat(actualInfo[2], is(sendAmount));
		Assert.assertThat(actualInfo[3], is(matchAmount));
		Assert.assertThat(actualInfo[4], is(incomeDate));
		Assert.assertThat(actualInfo[5], is(degest));
		//System.out.println("收支流水内容显示正确！！！");
	}
	
	//检查调整内容
	public void checkAjustInformation(String ajustAmount, String ajustType, String ajustTime, String ajustNote) {
		String info = this.creamsAPPMarginBalancePage.checkAjustInformation();
		String[] actualInfo = info.split(",");
		Assert.assertThat(actualInfo[0], is(ajustAmount));
		Assert.assertThat(actualInfo[1], is(ajustType));
		Assert.assertThat(actualInfo[2], is(ajustTime));
		Assert.assertThat(actualInfo[3], is(ajustNote));
		//System.out.println("调整内容显示正确！！！");
	}
	
	
	/**
	 * 新增备注
	 */
	public void clickMoreButton() {
		this.creamsAPPMarginBalancePage.clickMoreButton();
	}
	public void clickNote() {
		this.creamsAPPMarginBalancePage.clickNote();
	}
	public void intoNotePage() {
		Assert.assertThat(this.creamsAPPMarginBalancePage.intoNotePage(), is(true));
		System.out.println("成功进入备注列表");
	}
	public void clickAddButton() {
		this.creamsAPPMarginBalancePage.clickAddButton();
	}
	public void intoAddNotePage() {
		Assert.assertThat(this.creamsAPPMarginBalancePage.intoAddNotePage(), is(true));
		System.out.println("成功进入新增备注页");
	}
	public void inputNoteContent(String content) {
		this.creamsAPPMarginBalancePage.inputNoteContent(content);
	}
	public void clickSaveButton() {
		this.creamsAPPMarginBalancePage.clickSaveButton();
	}
	public void checkAddNoteResult(String content) {
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkNoteResult(content), is(true));
		System.out.println("新增备注成功");
	}
	//android
	public void checkNoteInformation_android(String content, String name, String myIdentify) {
		String info = this.creamsAPPMarginBalancePage.checkNoteInformation_android(content);
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Assert.assertThat(actualInfo[0], is(name));
		Assert.assertThat(actualInfo[1], is(myIdentify));
		Assert.assertThat(actualInfo[2], is(sdf.format(new Date())));
	}
	//ios
	public void checkNoteInformation_ios(String content, String name) {
		String info = this.creamsAPPMarginBalancePage.checkNoteInformation_ios(content);
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Assert.assertThat(actualInfo[0], is(name));
		Assert.assertThat(actualInfo[1], is(sdf.format(new Date())));
	}
	
	
	
	/**
	 * 编辑备注
	 */
	public void clickMoreNote(String content) {
		this.creamsAPPMarginBalancePage.clickMoreNote(content);
	}
	public void clickEditButton() {
		this.creamsAPPMarginBalancePage.clickEditButton();
	}
	public void intoEditPage() {
		Assert.assertThat(this.creamsAPPMarginBalancePage.intoEditPage(), is(true));
		System.out.println("进入编辑备注页");
	}
	public void inputEditNoteContent(String editContent) {
		this.creamsAPPMarginBalancePage.inputEditNoteContent(editContent);
	}
	public void checkEditNoteResult(String content) {
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkNoteResult(content), is(true));
		System.out.println("编辑备注成功");
	}
	
	
	/**
	 * 删除备注
	 */
	public void clickDeleteButton() {
		this.creamsAPPMarginBalancePage.clickDeleteButton();
	}
	public void clickDeleteSureButton() {
		this.creamsAPPMarginBalancePage.clickDeleteSureButton();
	}
	public void checkDeleteNoteResult(String content) {
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkNoteResult(content), is(false));
		System.out.println("删除备注成功");
	}
	
	/**
	 * 点击合同编号跳转到合同详情页
	 */
	public void clickContactNum(String contactNum) {
		this.creamsAPPMarginBalancePage.clickContactNum(contactNum);
	}
	
	/**
	 * 点击房号进入房源详情页
	 */
	public void clickFloor(String floor) {
		this.creamsAPPMarginBalancePage.clickFloor(floor);
	}


	/**
	 * 账单列表字段检查
	 */
	public void checkListKeys(){
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkRoomList(),is(true));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkBillCloseList(),is(true));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkNeedMoneyList(),is(true));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkOverDueDayList(),is(true));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkOtherNameList(),is(true));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkReceiveTimeList(),is(true));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkBuildingNameList(),is(true));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkBillAmountList(),is(true));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkActualAmountList(),is(true));
		Assert.assertThat(this.creamsAPPMarginBalancePage.checkDepositTypeList(),is(true));
	}


	/**
	 * 筛选
	 */
	public void clickFilterButton(){
		this.creamsAPPMarginBalancePage.clickFilterButton();
	}

	public void intoFilterPage(){
		Assert.assertThat(this.creamsAPPMarginBalancePage.intoFilterPage(),is(true));
	}

	public void selectOverDueDayFilter(String overDueDay){
		this.creamsAPPMarginBalancePage.selectOverDueDayFilter(overDueDay);
	}

	public void selectBillCloseFilter(String billClose){
		this.creamsAPPMarginBalancePage.selectBillCloseFilter(billClose);
	}

	public void clickConfirmButton(){
		this.creamsAPPMarginBalancePage.clickConfirmButton();
	}

	public void checkOverDueDay(String overDueDay){
		List<String> allOverDueDay = creamsAPPMarginBalancePage.checkBillOverDueDay();
		for(String str:allOverDueDay){
			Assert.assertThat(str.substring(0,2),is(overDueDay));
			System.out.println(str);
		}
	}

	public void checkBillClose(String billCloe){
		List<String> allBillClose = creamsAPPMarginBalancePage.checkBillClose();
		for(String str:allBillClose){
			Assert.assertThat(str,is(billCloe));
			System.out.println(str);
		}
	}
}
