package com.souban.bdd.flows.CreamsWebFlow.Settings;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Settings.JobSelfDefinePage;

public class JobSelfDefineFlow {
	private JobSelfDefinePage jobSelfDefinePage = null;

	public JobSelfDefineFlow(Driver driver) {
		this.jobSelfDefinePage = PageFactory.getPage(JobSelfDefinePage.class, driver);

	}

	public void enterSlefDefineJob() {
		this.jobSelfDefinePage.enterSelfDefine();
	}

	public void createJob(String JobName) {
		this.jobSelfDefinePage.addNewJob(JobName);
	}

	public void deleteJob(String JobName) {
		this.jobSelfDefinePage.deleteJob(JobName);
	}

	public void JobRepeat() {
		Assert.assertThat(this.jobSelfDefinePage.JobRepeat(), is(true));
	}

	public void enterNotExistJob(String myCustomer, String NotExistJob) {
		this.jobSelfDefinePage.writeNotExistJob(myCustomer, NotExistJob);
	}

	public void notExistReminder() {
		Assert.assertThat(this.jobSelfDefinePage.jobNotExistReminder(), is(true));
	}

	public void canNotNextStep() {
		Assert.assertThat(this.jobSelfDefinePage.canNotNextStep(), is(false));
	}

}
