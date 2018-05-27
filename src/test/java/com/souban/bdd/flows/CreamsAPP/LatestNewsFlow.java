package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsAPP.LatestNewsPage;
import org.junit.Assert;

import static org.hamcrest.core.Is.is;

public class LatestNewsFlow {

    private LatestNewsPage latestNewsPage= null;

    public LatestNewsFlow(final Driver driver) {
        this.latestNewsPage = PageFactory.getPage(LatestNewsPage.class, driver);
    }

    public void ClickWorkFlow(){
        this.latestNewsPage.ClickWorkFlow();
    }

    public void ClickNewsTitle(){
        this.latestNewsPage.ClickNewsTitle();
    }

    public void CheckNewsTitle(){
        Assert.assertThat(this.latestNewsPage.CheckNewsTitle(), is(true));

    }

    public void CheckTab(){
        Assert.assertThat(this.latestNewsPage.CheckBillTab(),is(true));
        Assert.assertThat(this.latestNewsPage.CheckLeaseTab(),is(true));
    }

    public void ClickList(){
        this.latestNewsPage.ClickList();
    }

    public void CheckBillInfo(){
        Assert.assertThat(this.latestNewsPage.CheckBillInfo(),is(true));
    }

    public void ClickLeaseTab(){
        this.latestNewsPage.ClickLeaseTab();
    }

    public void CheckContractInfo(){
        Assert.assertThat(this.latestNewsPage.CheckContractInfo(),is(true));
    }

}
