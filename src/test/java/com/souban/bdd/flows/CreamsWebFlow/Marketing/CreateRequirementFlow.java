package com.souban.bdd.flows.CreamsWebFlow.Marketing;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Marketing.CreateRequirementPage;

public class CreateRequirementFlow {

	private CreateRequirementPage createrequirementpage = null;

	public CreateRequirementFlow(Driver driver) {
		this.createrequirementpage = PageFactory.getPage(CreateRequirementPage.class, driver);
	}

	public void enterCreateNewRequirementPage() {
		this.createrequirementpage.enterCreateNewRequirementPage();
	}

	public void checkPopupCreateRequirementPage() {
		this.createrequirementpage.checkPopupCreateRequirementPage();
	}

	public void checkDefaultItemOfDate() {
		Assert.assertThat(this.createrequirementpage.checkDefaultItemOfDate(), is(true));
	}

	public void checkDefaultItemOfRenterState() {
		Assert.assertThat(this.createrequirementpage.checkDefaultItemOfRenterState(), is(true));
	}

	public void inputNecessaryItem(String renter, String choosehousing) {
		this.createrequirementpage.inputNecessaryItem(renter, choosehousing);
	}

	public void saveNewRequirement() {
		this.createrequirementpage.saveNewRequirement();
	}

	public void checkcheckCreateSuccessful(String renter) {
		Assert.assertThat(this.createrequirementpage.checkCreateSuccessful(renter), is(true));
	}

	public void enterDetilPage(String renter) {
		Assert.assertThat(this.createrequirementpage.enterDetilPage(renter), is(true));
	}

	public void deleteRequirement() {
		Assert.assertThat(this.createrequirementpage.deleteRequirement(), is(true));
	}

	public void checkDeleteSuccessful(String renter) {
		this.createrequirementpage.checkDeleteSuccessful(renter);
	}

	public void clickReminderIcon() {
		this.createrequirementpage.clickReminderIcon();
	}

	public void inputDateTimeConTent(String contents) {
		this.createrequirementpage.inputDateTimeConTent(contents);
	}

	public void saveNewReminder() {
		this.createrequirementpage.saveNewReminder();
	}

	public void checkCreateReminderSuccessful() {
		Assert.assertThat(this.createrequirementpage.checkCreateReminderSuccessful(), is(true));
	}

	public void clickSureOfCreateReminderSuccessful() {
		this.createrequirementpage.clickSureOfCreateReminderSuccessful();
	}

	public void checkReminderOnList(String contents) {
		Assert.assertThat(this.createrequirementpage.checkReminderOnList(contents), is(true));
	}

	public void enterDemandSideslipBar() {
		Assert.assertThat(this.createrequirementpage.enterDemandSideslipBar(), is(true));
	}

	public void clickButtonOfNotes() {

		this.createrequirementpage.clickButtonOfNotes();
	}

	public void inputNotesInTextArea(String notes) {
		this.createrequirementpage.inputNotesInTextArea(notes);
	}

	public void checkForSubmitNotesSuccessful() {
		Assert.assertThat(this.createrequirementpage.checkForSubmitNotesSuccessful(), is(true));
	}

	public void clickSureOfSubmitNotesSuccessful() {
		this.createrequirementpage.clickSureOfSubmitNotesSuccessful();
	}

	public void checkNotesInformation(String notes) {
		Assert.assertThat(this.createrequirementpage.checkNotesInformation(notes), is(true));
	}

	public void clickButtonOfDeleteNotes() {
		this.createrequirementpage.clickButtonOfDeleteNotes();
	}

	public void checkSureForDeleteNotes() {
		Assert.assertThat(this.createrequirementpage.checkSureForDeleteNotes(), is(true));
	}

	public void clickSureForDeleteNotes() {
		this.createrequirementpage.clickSureForDeleteNotes();
	}

	public void inputRenterContactName(String renter) {
		this.createrequirementpage.inputRenterContactName(renter);
	}

	public void clickCreateNewRenterContact() {
		this.createrequirementpage.clickCreateNewRenterContact();
	}

	public void inputRenterContactNameAndTell(String tell) {
		this.createrequirementpage.inputRenterContactNameAndTell(tell);
	}

	public void saveRenterContact() {
		this.createrequirementpage.saveRenterContact();
	}

	public void checkCreateNewRenterContactSuccessful(String renter) {
		Assert.assertThat(this.createrequirementpage.checkCreateNewRenterContactSuccessful(renter), is(true));
	}

}
