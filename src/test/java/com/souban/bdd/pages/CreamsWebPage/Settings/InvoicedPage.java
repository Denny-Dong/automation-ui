package com.souban.bdd.pages.CreamsWebPage.Settings;

import org.hamcrest.core.Is;
import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class InvoicedPage extends ParentPage {
	public InvoicedPage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_chooseOneBillCheckBox = new UIElement(
			"xpath=//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]/descendant-or-self::span/input");
	private UIElement BTN_getInvoiceInformationOnList = new UIElement("xpath=//*[text()='生成发票信息']/parent::button");
	private UIElement BTN_chooseInvoiceCheckBox = new UIElement(
			"xpath=//*[@class='ant-table-thead']/tr/th[@class='ant-table-selection-column']/descendant-or-self::span[@class='ant-checkbox']/input");
	private UIElement BTN_saveInvoice = new UIElement(
			"xpath=//*[@class='ant-btn ant-btn-primary']/span[text()='保 存']/parent::button");
	private UIElement TXT_checkInvoiceSuccessful = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='新建成功']");
	private UIElement BTN_buttonSure = new UIElement(
			"xpath=//*[@class='souban-message-btn___u3mGi confirm___3zXXq' and text()='确认']");
	private UIElement BTN_clearOptions = new UIElement("xpath=//a[text()='清除选项']");

	private UIElement BTN_imageOfInternalManagement = new UIElement("xpath=//*[@class='userBox___2sNx6']");
	private UIElement BTN_chooseInvoicingSettings = new UIElement(
			"xpath=//*[@class='ant-dropdown-menu-item-group-list']/li/div[text()='开票设置']");
	private UIElement BTN_expandInvoicingSetting = new UIElement(
			"xpath=//*[@class='ant-menu-submenu-title']/div/span[text()='开票设置']");
	private UIElement BTN_chooseSellersInformation = new UIElement(
			"xpath=//*[@class='ant-menu-item item___2PPmK smallItem___1ZeiN']/a/span[text()='售方信息']/parent::a");
	private UIElement BTN_chooseGoodsName = new UIElement(
			"xpath=//*[@class='ant-menu-item item___2PPmK smallItem___1ZeiN']/a/span[text()='货物名称']/parent::a");
	private UIElement BTN_createInvoicingSetting = new UIElement("xpath=//*[@class='header___3d8LE']/button");
	private UIElement BTN_inputSellersName = new UIElement("xpath=//*[@placeholder='请填写售方名称']");
	private UIElement BTN_taxpayerIdentificationNumber = new UIElement("xpath=//*[@placeholder='请填写纳税人识别号']");
	private UIElement BTN_sellersAddress = new UIElement("xpath=//*[@placeholder='请填写地址']");
	private UIElement BTN_sellersTell = new UIElement("xpath=//*[@placeholder='请填写电话']");
	private UIElement BTN_nameOfBankOfAccount = new UIElement("xpath=//*[@placeholder='请填写开户行名称']");
	private UIElement BTN_bankAccount = new UIElement("xpath=//*[@placeholder='请填写开户行账号']");
	private UIElement BTN_saveSellersInformation = new UIElement(
			"xpath=//*[@class='ant-btn saveBtn___kH15z ant-btn-primary']/span[text()='保 存']/parent::button");
	//
	private UIElement BTN_chooseSelfBuilt = new UIElement(
			"xpath=//*[@class='ant-menu ant-menu-vertical ant-menu-light ant-menu-root']/li[text()='自建']");
	private UIElement BTN_goodsName = new UIElement("xpath=//*[@placeholder='请填写货物名称']");
	private UIElement BTN_itemNumber = new UIElement("xpath=//*[@placeholder='请填写商品编码']");
	private UIElement BTN_taxOnNewGoods = new UIElement("xpath=//*[@placeholder='请填写税率']");
	//

	private UIElement BTN_editSellerInformation = new UIElement(
			"xpath=//*[@class='ant-table-tbody']/tr[1]/td/div/span[text()='编辑']");

	public UIElement checkNewSellersInformation(String sname) {
		return new UIElement("xpath=//*[@class='ant-table-tbody']/tr[1]/td[2 and text()='" + sname + "']");
	}

	public void clearOptions() {
		this.driver.sleep(2000);
		this.driver.waitAndClick(BTN_clearOptions, 5);
	}

	public void chooseBillToInvoice() {
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseOneBillCheckBox);
	}

	public void getInvoiceInformationOnList() {
		this.driver.click(BTN_getInvoiceInformationOnList);
	}

	public void finishAndCheckInvoiceIn() {
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseInvoiceCheckBox);
		this.driver.click(BTN_saveInvoice);
		this.driver.sleep(1000);
		Assert.assertThat(this.driver.isElementFound(TXT_checkInvoiceSuccessful), Is.is(true));
		this.driver.click(BTN_buttonSure);
	}

	//
	public void enterInvoicingSettings() {
		this.driver.click(BTN_imageOfInternalManagement);
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseInvoicingSettings);
	}

	public void enterSellersInformation() {

		this.driver.click(BTN_expandInvoicingSetting);
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseSellersInformation);
	}

	public void createSellersInformation() {
		this.driver.click(BTN_createInvoicingSetting);
	}

	public void inputSellersInformation(String sname, String taxpayerN, String address, String tell, String bank,
			String account) {
		this.driver.sleep(1000);
		this.driver.elementSendText(BTN_inputSellersName, sname);
		this.driver.elementSendText(BTN_taxpayerIdentificationNumber, taxpayerN);
		this.driver.elementSendText(BTN_sellersAddress, address);
		this.driver.elementSendText(BTN_sellersTell, tell);
		this.driver.elementSendText(BTN_nameOfBankOfAccount, bank);
		this.driver.elementSendText(BTN_bankAccount, account);
		this.driver.click(BTN_saveSellersInformation);
	}

	public void checkNewSellersInformationExist(String sname) {
		Assert.assertThat(this.driver.isElementFound(checkNewSellersInformation(sname)), Is.is(true));
	}

	//
	public void enterGoodsName() {
		this.driver.sleep(1000);
		this.driver.click(BTN_expandInvoicingSetting);
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseGoodsName);
	}

	public void chooseGoodsNameAndSlefBuilt() {
		this.driver.click(BTN_createInvoicingSetting);
		this.driver.sleep(1000);
		this.driver.click(BTN_chooseSelfBuilt);
	}

	public void inputGoodsInformation(String gname, String number, String tax) {
		this.driver.elementSendText(BTN_goodsName, gname);
		this.driver.elementSendText(BTN_itemNumber, number);
		this.driver.elementSendText(BTN_taxOnNewGoods, tax);
	}

	public void saveGoodsName() {
		this.driver.click(BTN_saveSellersInformation);
	}

	//
	public void editSellerInformation(String sname) {
		this.driver.click(BTN_editSellerInformation);
		this.driver.sleep(1000);
		this.driver.elementClearText(BTN_inputSellersName);
		this.driver.elementSendText(BTN_inputSellersName, sname);
		this.driver.click(BTN_saveSellersInformation);
	}

	public void checkEditSellerInformationSuccess(String sname) {
		Assert.assertThat(this.driver.isElementFound(checkNewSellersInformation(sname)), Is.is(true));
	}
}
