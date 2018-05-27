package com.souban.bdd.pages.CreamsWebPage.Finance;

import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class FlowOfIncomePage extends ParentPage {
	public FlowOfIncomePage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_tabFlowOfIncome = new UIElement(
			"xpath=//*[@class='ant-menu ant-menu-horizontal creams-menu menu___3RPMl third-menu___2x39Y ant-menu-light ant-menu-root']/li/a[text()='收支流水']");
	private UIElement BTN_createNewIncome = new UIElement(
			"xpath=//*[@class='ant-btn']/span[text()='收支流水']/parent::button");
	private UIElement TXT_inputIncomeAmount = new UIElement(
			"xpath=//*[@class='ant-input-number-input' and @placeholder='请输入发生额']");
	private UIElement TXT_incomeRecordingTime = new UIElement(
			"xpath=//*[@class='ant-calendar-picker-input ant-input ant-input-lg' and @placeholder='请选择日期']");
	private UIElement TXT_inputIncomeRecordingTime = new UIElement(
			"xpath=//*[@class='ant-calendar-date-input-wrap']/input");
	private UIElement TXT_incomeName = new UIElement(
			"xpath=//*[@class='ant-input ant-input-lg' and @placeholder='请输入对方单位名称']");
	private UIElement BTN_saveNewIncome = new UIElement(
			"xpath=//*[@class='ant-modal-footer']/button/span[text()='保 存']/parent::button");
	private UIElement TXT_checkCreateIncomeSuccess = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='新建收支流水成功']");
	private UIElement BTN_sureOfCreateIncome = new UIElement(
			"xpath=//*[@class='souban-message-btn___u3mGi confirm___3zXXq' and text()='确认']");
	//
	private UIElement BTN_firstListOfIncome = new UIElement(
			"xpath=//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]/ol/li/div/div/label");
	private UIElement BTN_secondtListOfIncome = new UIElement(
			"xpath=//*[@class='scrollMain___2hOkJ scroll__main']/li[2]/div/div/div/div/label");
	private UIElement BTN_bulkDeleteIncome = new UIElement("xpath=//span[text()='删 除']/parent::button");
	private UIElement TXT_checkBulkDeleteIncome = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='确定删除1条流水？']");
	//
	private UIElement BTN_oneOfFlowOfIncome = new UIElement(
			"xpath=//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]");
	private UIElement BTN_matchingBills = new UIElement(
			"xpath=//*[@class='HeadStyle___erSvG']/button[@class='ant-btn Headbutton___1JkNE']");
	private UIElement BTN_oneOfBillOnMatchingList = new UIElement(
			"xpath=//*[@class='ant-modal-header']/following-sibling::div[@class='ant-modal-body']/descendant::tbody/tr[1]/td/span/label");
	private UIElement BTN_buttonMatchingForBill = new UIElement(
			"xpath=//*[@class='buttonWidth___1V4Ze']/button/span[text()='匹 配']/parent::button");
	private UIElement BTN_saveMatchingForBill = new UIElement(
			"xpath=//*[@class='buttonWidth___1V4Ze']/button/span[text()='保 存']/parent::button");
	private UIElement BTN_checkMatchingBillSuccess = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='匹配账单金额成功']");
	// shaixuan
	private UIElement BTN_selectCreditMark = new UIElement(
			"xpath=//*[@class='ant-table-thead']/tr/th/span[text()='借贷标']/i");
	private UIElement BTN_sureForChooseMark = new UIElement(
			"xpath=//*[@class='ant-table-filter-dropdown-btns']/a[text()='确定']");
	private UIElement TXT_creditMarkList = new UIElement(
			"xpath=//*[@class='scrollMain___2hOkJ scroll__main']/li/div/div/div/span[text()='借（支出）']");
	//
	private UIElement TXT_listOfBillOnIncome = new UIElement(
			"xpath=//*[@class='insideTitleBlock___yVc86']/following-sibling::div[@class='contentCustomer___UVU55 MatchingCard___fwefZ']/descendant::tbody");
	private UIElement TXT_billDetil = new UIElement("xpath=//*[@class='mesContainer___KXpSz']/span[text()='账单详情']");
	private UIElement BTN_buttonOfBillTurnIncome = new UIElement(
			"xpath=//*[@class='TopBarContainer___1LUfK ']/div/i[@class='creamsicon_17 backArrow___1DRT5 leftBorder___3eEjH']");
	private UIElement TXT_incomeDetil = new UIElement("xpath=//*[@class='mesContainer___KXpSz']/span[text()='收支流水详情']");
	//
	private UIElement TXT_amountMatching = new UIElement(
			"xpath=//*[@class='ant-input-number ant-input-number-lg']/div/input");
	private UIElement TXT_billAmountNotMatching = new UIElement(
			"xpath=//*[@class='title___28WlQ titleHead___1IjqP crInfoTitle']/div[text()='账单未匹配']/parent::div/following-sibling::div/p");
	private UIElement TXT_incomeAmountNotMatching = new UIElement(
			"xpath=//*[@class='title___28WlQ crInfoTitle']/div[text()='流水未匹配']/parent::div/following-sibling::div/p");
	//
	private UIElement BTN_selectMatchingState = new UIElement(
			"xpath=//*[@class='ant-table-thead']/tr/th/span[text()='匹配状态']/i");
	private UIElement TXT_matchingStateList = new UIElement(
			"xpath=//*[@class='scrollMain___2hOkJ scroll__main']/li/div/div/div/span/span[text()='部分匹配']");
	//
	private UIElement BTN_deleteIncomeWithBill = new UIElement("xpath=//*[@class='ant-table-tbody']/tr[1]/td/i");

	//
	private UIElement BTN_incomeSearchBox = new UIElement(
			"xpath=//*[@class='ant-input-search ant-input-affix-wrapper']/input[@placeholder='搜索对方单位名称']");
	private UIElement TXT_searchNameList = new UIElement(
			"xpath=//*[@class='scrollMain___2hOkJ scroll__main']/li/div/div/div[@class='width100___1S4mI' and text()='lala']");
	//
	private UIElement BTN_chooseReset = new UIElement(
			"xpath=//*[@class='ant-table-filter-dropdown-btns']/a[text()='重置']");
	private UIElement BTN_chooseIncomeOfMatched = new UIElement(
			"xpath=//*[@class='ant-checkbox-wrapper']/following-sibling::span[text()='已匹配']");
	private UIElement TXT_checkDeleteIncomeOfMatched = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='是否取消这条账单和此收支流水的匹配']");

	public UIElement txtchooseDebitMark(String cmark) {
		return new UIElement(
				"xpath=//*[@class='ant-checkbox-wrapper']/following-sibling::span[text()='" + cmark + "']");
	}

	public UIElement txtChooseMatchingState(String matchstate) {
		return new UIElement(
				"xpath=//*[@class='ant-checkbox-wrapper']/following-sibling::span[text()='" + matchstate + "']");
	}

	private List<String> creditMarkListDetil(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	private List<String> matchingStateListDetil(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	private List<String> searchNameListDetil(UIElement txt) {
		return this.driver.allElementsGetText(txt);
	}

	public void flowOfIncomePage() {
		this.driver.click(BTN_tabFlowOfIncome);
	}

	public void createNewIncome() {
		this.driver.click(BTN_createNewIncome);
	}

	public void inputIncomeInformation(String iamount, String itime, String iname) {
		this.driver.elementSendText(TXT_inputIncomeAmount, iamount);
		this.driver.sleep(1000);
		this.driver.click(TXT_incomeRecordingTime);
		this.driver.sleep(1000);
		this.driver.click(TXT_inputIncomeRecordingTime);
		this.driver.elementSendText(TXT_inputIncomeRecordingTime, itime);
		this.driver.elementSendText(TXT_incomeName, iname);
	}

	public void saveAndCheckIncomeSuccessful() {
		this.driver.click(BTN_saveNewIncome);
		Assert.assertThat(this.driver.isElementFound(TXT_checkCreateIncomeSuccess), Is.is(true));
		this.driver.click(BTN_sureOfCreateIncome);
	}

	//
	public void chooseSeveralIncomeList() {
		this.driver.sleep(1000);
		this.driver.click(BTN_firstListOfIncome);
		// this.driver.click(BTN_secondtListOfIncome);
	}

	public void deleteIncomelist() {
		this.driver.click(BTN_bulkDeleteIncome);
	}

	public void checkIncomeNumberAndDelete() {
		Assert.assertThat(this.driver.isElementFound(TXT_checkBulkDeleteIncome), Is.is(true));
		this.driver.click(BTN_sureOfCreateIncome);
	}

	//
	public void clickOneFlowOfIncome() {
		this.driver.waitClickable(BTN_oneOfFlowOfIncome, 5);
		this.driver.sleep(1000);
		this.driver.click(BTN_oneOfFlowOfIncome);
	}

	public void flowOfIncomeMatchingBill() {
		this.driver.waitClickable(BTN_matchingBills, 10);
		this.driver.sleep(3000);
		this.driver.click(BTN_matchingBills);
		this.driver.sleep(1000);
		this.driver.click(BTN_oneOfBillOnMatchingList);
		this.driver.sleep(1000);
		this.driver.click(BTN_buttonMatchingForBill);

	}

	public void sureOfAmountAndSaveMatching() {
		this.driver.sleep(1000);
		this.driver.click(BTN_saveMatchingForBill);
	}

	public void checkFlowOfIncomeMatchingBillSuccess() {
		this.driver.sleep(1000);
		Assert.assertThat(this.driver.isElementFound(BTN_checkMatchingBillSuccess), Is.is(true));
		this.driver.click(BTN_sureOfCreateIncome);
	}

	//
	public void selectCreditMark(String cmark) {
		this.driver.click(BTN_selectCreditMark);
		this.driver.sleep(1000);
		this.driver.click(txtchooseDebitMark(cmark));
		this.driver.click(BTN_sureForChooseMark);
	}

	public List<String> creditMarkList() {// 获取列表
		this.driver.sleep(1000);
		return this.creditMarkListDetil(TXT_creditMarkList);
	}

	//
	public void clickSureForCheckSomething() {
		this.driver.click(BTN_sureOfCreateIncome);
	}

	public void clickBillOnIncomeList() {
		this.driver.sleep(1000);
		this.driver.click(TXT_listOfBillOnIncome);
		this.driver.sleep(1000);
		Assert.assertThat(this.driver.isElementFound(TXT_billDetil), Is.is(true));
	}

	public void billReturnToIncome() {
		this.driver.click(BTN_buttonOfBillTurnIncome);
		this.driver.sleep(1000);
		Assert.assertThat(this.driver.isElementFound(TXT_incomeDetil), Is.is(true));
	}

	//
	public void compareBillAmountAndIncomeAmount() {
		String a;
		String b;
		String c;
		Double s = null;
		a = this.driver.elementGetValue(TXT_amountMatching);
		b = this.driver.elementGetText(TXT_billAmountNotMatching);
		c = this.driver.elementGetText(TXT_incomeAmountNotMatching);
		double a1 = Double.valueOf(a);
		double b1 = Double.valueOf(b);
		double c1 = Double.valueOf(c);
		if (b1 == c1) {
			s = b1;
		} else if (b1 > c1) {
			s = c1;
		} else if (b1 < c1) {
			s = b1;
		}
		Assert.assertThat(s.equals(a1), Is.is(true));
	}

	//
	public void selectMatchingState(String matchstate) {
		this.driver.MoveToElement(BTN_selectMatchingState);
		this.driver.click(BTN_selectMatchingState);
		this.driver.sleep(1000);
		this.driver.click(txtChooseMatchingState(matchstate));
		this.driver.click(BTN_sureForChooseMark);
	}

	public List<String> matchingStateList() {// 获取列表
		this.driver.sleep(1000);
		return this.matchingStateListDetil(TXT_matchingStateList);
	}

	//
	public void clickSearchBox(String sname) {
		this.driver.elementSendText(BTN_incomeSearchBox, sname);
		this.driver.elementSendKeys(BTN_incomeSearchBox, Keys.ENTER);
	}

	public List<String> searchNameList() {// 获取列表
		this.driver.sleep(1000);
		return this.searchNameListDetil(TXT_searchNameList);
	}

	//
	public void chooseMathcedIncome() {
		this.driver.MoveToElement(BTN_selectMatchingState);
		this.driver.click(BTN_selectMatchingState);
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseReset);
		this.driver.click(BTN_selectMatchingState);
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseIncomeOfMatched);
		this.driver.click(BTN_sureForChooseMark);
	}

	public void deleteRelationOfIncomeAndBill() {
		this.driver.sleep(1000);
		this.driver.click(BTN_deleteIncomeWithBill);
		Assert.assertThat(this.driver.isElementFound(TXT_checkDeleteIncomeOfMatched), Is.is(true));
		this.driver.sleep(1000);
		this.driver.click(BTN_sureOfCreateIncome);
	}
}
