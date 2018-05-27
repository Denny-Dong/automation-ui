package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsAPP.CreamsAPPAboutUsPage;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

public class CreamsAPPAboutUsFlow {

    private CreamsAPPAboutUsPage creamsAPPAboutUsPage = null;

    public CreamsAPPAboutUsFlow(final Driver driver){
        this.creamsAPPAboutUsPage = PageFactory.getPage(CreamsAPPAboutUsPage.class, driver);
    }

    public void clickAboutUs(){
        this.creamsAPPAboutUsPage.clickAboutUs();
    }

    public void intoAboutUsPage(){
        Assert.assertThat(this.creamsAPPAboutUsPage.intoAboutUsPage(),is(true));
    }
}
