package com.souban.bdd.pages.CreamsWebPage.Marketing;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreateRequirementPage extends ParentPage {
	public CreateRequirementPage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_clickInvestmentManagement = new UIElement(
			"xpath=//*[@class='ant-menu-item']/a[text()='招商管理']");
	private UIElement BTN_createNewRequirement = new UIElement("xpath=//*[@class='ant-btn addButton___1ZNVY']");
	private UIElement BTN_inputRenter = new UIElement("xpath=//*[@class='ant-select-search__field']");
	private UIElement BTN_chooseHousingForCreateReqirement = new UIElement(
			"xpath=//*[@class='merchatList___1vZyl']/li[@class='item___1UxCT']");
	private UIElement BTN_saveOfCreateRequirement = new UIElement(
			"xpath=//*[@type='submit' and @class='ant-btn ant-btn-primary ant-btn-lg']");
	private UIElement TXT_createRequirementPage = new UIElement(
			"xpath=//*[@class='ant-modal-title' and text()='新建需求']");
	// private UIElement Date_signingDate = new UIElement(
	// "xpath=//*[@class='titleName___33ZLw titleName' and
	// text()='预计签约时间']/parent::div/following-sibling::div[@class='children___3p4dt']/descendant-or-self::input[@placeholder='请选择预计签约时间']");
	private UIElement Date_visitDate = new UIElement(
			"xpath=//*[@class='ant-calendar-picker']/div/input[@placeholder='请选择来访时间']");
	private UIElement TXT_renterState = new UIElement(
			"xpath=//*[@class='ant-select-selection-selected-value' and @title='初次接触']");
	private UIElement BTN_clickSureOfCreateSuccessful = new UIElement(
			"xpath=//*[@class='souban-message-btn___u3mGi confirm___3zXXq' and text()='确认']");
	private UIElement BTN_deleteOfRequirement = new UIElement("xpath=//*[@class='btnGroup___2IZyL']/i[4]");
	private UIElement TXT_checkDeleteRequirement = new UIElement("xpath=//*[text()='确定要删除该需求吗？']");
	private UIElement TXT_clickSureOfDeleteRequirement = new UIElement(
			"xpath=//*[@class='souban-message-btn___u3mGi confirm___3zXXq' and text()='确认']");
	private UIElement BTN_reminderIcon = new UIElement("xpath=//*[@class='btnGroup___2IZyL']/span[text()='提醒']");
	private UIElement BTN_reminderDate = new UIElement(
			"xpath=//*[@class='ant-radio-group ant-radio-group-small']/label[1]");
	private UIElement BTN_reminderTime = new UIElement("xpath=//*[@class='ant-time-picker-input']");
	private UIElement BTN_clickReminderCurrentTime = new UIElement(
			"xpath=//*[@class='ant-time-picker-panel-select-option-selected']");
	private UIElement BTN_clickSureOfReminderTime = new UIElement(
			"xpath=//*[@class='ant-btn ant-btn-primary ant-btn-sm']");
	private UIElement BTN_inputReminderContent = new UIElement("xpath=//*[@label='提醒内容']");
	private UIElement BTN_saveNewReminder = new UIElement("xpath=//*[@class='ant-btn ant-btn-primary']");
	private UIElement BTN_tipOfCreateReminderSuccessful = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='新建提醒成功！']");
	private UIElement BTN_clickSureOfCreateReminderSuccessful = new UIElement(
			"xpath=//*[@class='souban-message-footer___3mG8K']/button");
	private UIElement BTN_clickWriteNewNotes = new UIElement(
			"xpath=//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]");
	private UIElement TXT_detailsOfRequirements = new UIElement("xpath=//*[@class='mes___2vjKg' and text()='客户详情']");
	private UIElement BTN_detailsOfRequirements = new UIElement("xpath=//*[@class='btnGroup___2IZyL']/span[5]");
	private UIElement BTN_clickNotesIcon = new UIElement("xpath=//*[@class='btnGroup___2IZyL']/span[text()='备注']");
	private UIElement BTN_clickTextArea = new UIElement("xpath=//*[@type='textarea' and @placeholder='请填写备注']");
	private UIElement BTN_saveNotes = new UIElement("xpath=//*[@class='ant-btn markBtn___1PCAW']");
	private UIElement TXT_tipOfSubmitNotesSuccessful = new UIElement(
			"xpath=//*[@class='souban-message-body___3aByC']/span[text()='备注提交成功！']");
	private UIElement BTN_clickSureOfSuccessfulTip = new UIElement(
			"xpath=//*[@class='souban-message-btn___u3mGi confirm___3zXXq' and text()='确认']");
	private UIElement clickiconOfDeleteNotes = new UIElement(
			"xpath=//*[@class='base___1oxy6 show___1u_-z']/div/div/div[1]/descendant::div[@class='subTitle___17In6']/span[3]");
	private UIElement TXT_checkForDeleteNotes = new UIElement("xpath=//*[text()='确定要删除该条备注吗？']");
	private UIElement BTN_clickSureForDeleteNotes = new UIElement(
			"xpath=//*[@class='souban-message-btn___u3mGi confirm___3zXXq' and text()='确认']");
	private UIElement BTN_clickRenterContact = new UIElement("xpath=//*[@placeholder='请填写客户联系人']");
	private UIElement BTN_clickCreateNewRenterContact = new UIElement("xpath=//*[@class='addNew___379m0']");
	private UIElement BTN_inputRenterContact = new UIElement("xpath=//*[@id='name']");
	private UIElement BTN_inputTellContact = new UIElement("xpath=//*[@id='tel']");
	private UIElement BTN_clickSureOfCreateNewRenterContact = new UIElement(
			"xpath=//*[@class='btns___ZertY']/button[@type='submit']/span[text()='保存到联系人']/parent::button");
	private UIElement BTN_cancelNewRenterContact = new UIElement(
			"xpath=//*[@class='contentCustomer___UVU55 card___PU7TE cardHeight___jESvC']/div[3]/descendant-or-self::i");
	private UIElement BTN_clickSureOfSuccessfulOfNewRenter = new UIElement(
			"xpath=//*[@class='souban-message-btn___u3mGi confirm___3zXXq' and text()='确认']");

	public UIElement chooseBuildingForCreateReqirement(String choosehuosing) {
		return new UIElement("xpath=//*[@class='message___1wVYg']/h3[text()='" + choosehuosing + "']");
	}

	public UIElement chooseHousingForCreateReqirement(String choosehousing) {
		return new UIElement("xpath=//*[@class='roomList___q8kFc']/descendant-or-self::li[1]/descendant::input");
	}

	public UIElement checkNewRequirementInList(String renter) {
		return new UIElement(
				"xpath=//*[@class='scrollMain___34Uwe scroll__main creams-table-scroll-main']/li[1]/descendant-or-self::span[text()='"
						+ renter + "']");
	}

	public UIElement newReminderOnList(String contents) {
		return new UIElement(
				"xpath=//*[@class='base___1oxy6 show___1u_-z']/descendant-or-self::p[text()='" + contents + "']");
	}

	public UIElement notesInformationAfterCreate(String notes) {
		return new UIElement("xpath=//div[text()='" + notes + "']");
	}

	public UIElement checkNewRenterContact(String renter) {
		return new UIElement(
				"xpath=//*[@class='contentCustomer___UVU55 card___PU7TE cardHeight___jESvC']/div[3]/descendant-or-self::span[text()='"
						+ renter + "']");
	}

	public UIElement checkrenterContactOnList(String renter) {
		return new UIElement(
				"xpath=//*[@class='item___1pcRa']/span[@class='label___1PA0E' and text()='" + renter + "']");
	}

	public void enterCreateNewRequirementPage() {
		this.driver.click(BTN_clickInvestmentManagement);
		this.driver.sleep(1000);
		this.driver.click(BTN_createNewRequirement);
		this.driver.sleep(1000);
	}

	public void checkPopupCreateRequirementPage() {
		this.driver.isElementFound(TXT_createRequirementPage);
	}

	public boolean checkDefaultItemOfDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(new Date());
		String toStr = s.toString();
		String b = this.driver.elementGetValue(Date_visitDate);
		if (this.driver.elementGetValue(Date_visitDate).compareTo(toStr) == 0) {
			return true;
		} else
			return false;
	}

	public boolean checkDefaultItemOfRenterState() {
		return this.driver.isElementFound(TXT_renterState);
	}

	public void inputNecessaryItem(String renter, String choosehousing) {
		this.driver.click(BTN_inputRenter);
		this.driver.elementSendText(BTN_inputRenter, renter);
		this.driver.sleep(1000);
		this.driver.click(chooseBuildingForCreateReqirement(choosehousing));
		this.driver.sleep(1000);
		this.driver.click(chooseHousingForCreateReqirement(choosehousing));
	}

	public void saveNewRequirement() {
		this.driver.sleep(1000);
		this.driver.click(BTN_saveOfCreateRequirement);
		this.driver.sleep(1000);
		this.driver.click(BTN_clickSureOfCreateSuccessful);
		this.driver.sleep(1000);

	}

	public boolean checkCreateSuccessful(String renter) {
		return this.driver.isElementFound(checkNewRequirementInList(renter));
	}

	public boolean enterDetilPage(String renter) {
		this.driver.click(checkNewRequirementInList(renter));
		this.driver.sleep(1000);
		return this.driver.isElementFound(TXT_detailsOfRequirements);
	}

	public boolean deleteRequirement() {
		this.driver.click(BTN_deleteOfRequirement);
		return this.driver.isElementFound(TXT_checkDeleteRequirement);

	}

	public void checkDeleteSuccessful(String renter) {
		this.driver.click(TXT_clickSureOfDeleteRequirement);
	}

	public void clickReminderIcon() {
		this.driver.click(BTN_reminderIcon);
	}

	public void inputDateTimeConTent(String contents) {
		this.driver.sleep(1000);
		this.driver.click(BTN_reminderDate);
		this.driver.sleep(1000);
		this.driver.click(BTN_reminderTime);
		this.driver.sleep(1000);
		this.driver.click(BTN_clickReminderCurrentTime);
		this.driver.sleep(1000);
		this.driver.click(BTN_clickSureOfReminderTime);
		this.driver.sleep(1000);
		this.driver.elementSendText(BTN_inputReminderContent, contents);
	}

	public void saveNewReminder() {
		this.driver.click(BTN_saveNewReminder);
	}

	public boolean checkCreateReminderSuccessful() {
		return this.driver.isElementFound(BTN_tipOfCreateReminderSuccessful);
	}

	public void clickSureOfCreateReminderSuccessful() {
		this.driver.click(BTN_clickSureOfCreateReminderSuccessful);
	}

	public boolean checkReminderOnList(String contents) {
		this.driver.sleep(1000);
		return this.driver.isElementFound(newReminderOnList(contents));
	}

	public boolean enterDemandSideslipBar() {
		this.driver.click(BTN_clickInvestmentManagement);
		this.driver.sleep(3000);
		this.driver.click(BTN_clickWriteNewNotes);
		this.driver.sleep(1000);
		return this.driver.isElementFound(TXT_detailsOfRequirements);
	}

	public void clickButtonOfNotes() {
		this.driver.click(BTN_detailsOfRequirements);
		this.driver.sleep(1000);
		this.driver.click(BTN_clickNotesIcon);
	}

	public void inputNotesInTextArea(String notes) {
		this.driver.sleep(1000);
		this.driver.click(BTN_clickTextArea);
		this.driver.elementSendText(BTN_clickTextArea, notes);
		this.driver.click(BTN_saveNotes);
	}

	public boolean checkForSubmitNotesSuccessful() {
		return this.driver.isElementFound(TXT_tipOfSubmitNotesSuccessful);
	}

	public void clickSureOfSubmitNotesSuccessful() {
		this.driver.sleep(1000);
		this.driver.click(BTN_clickSureOfSuccessfulTip);
	}

	public boolean checkNotesInformation(String notes) {
		this.driver.sleep(1000);
		return this.driver.isElementFound(notesInformationAfterCreate(notes));
	}

	public void clickButtonOfDeleteNotes() {
		this.driver.sleep(2000);
		this.driver.click(clickiconOfDeleteNotes);
	}

	public boolean checkSureForDeleteNotes() {
		return this.driver.isElementFound(TXT_checkForDeleteNotes);
	}

	public void clickSureForDeleteNotes() {
		this.driver.sleep(1000);
		this.driver.click(BTN_clickSureForDeleteNotes);
	}

	public void inputRenterContactName(String renter) {
		this.driver.click(BTN_clickRenterContact);
		this.driver.elementSendText(BTN_clickRenterContact, renter);
	}

	public void clickCreateNewRenterContact() {
		this.driver.sleep(2000);
		this.driver.click(BTN_clickCreateNewRenterContact);
	}

	public void inputRenterContactNameAndTell(String tell) {
		this.driver.elementSendText(BTN_inputTellContact, tell);
	}

	public void saveRenterContact() {
		this.driver.click(BTN_clickSureOfCreateNewRenterContact);
	}

	public boolean checkCreateNewRenterContactSuccessful(String renter) {
		this.driver.click(BTN_clickSureOfSuccessfulOfNewRenter);
		this.driver.sleep(1000);
		this.driver.click(BTN_cancelNewRenterContact);
		this.driver.sleep(1000);
		this.driver.elementSendText(BTN_clickRenterContact, renter);
		this.driver.sleep(2000);
		return this.driver.isElementFound(checkNewRenterContact(renter));
	}
}
