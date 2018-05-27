package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsAPP.CreamsAPPTenantPage;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

public class CreamsAPPTenantFlow {
    private CreamsAPPTenantPage creamsAPPTenantPage = null;

    public CreamsAPPTenantFlow(final Driver driver){
        this.creamsAPPTenantPage = PageFactory.getPage(CreamsAPPTenantPage.class,driver);
    }

    public void clickNewTenant(){
        this.creamsAPPTenantPage.clickNewTenant();
    }

    public void intoNewTenantPage(){
        Assert.assertThat(this.creamsAPPTenantPage.intoNewTenantPage(),is(true));
    }

    public void inputTenantName(String name){
        this.creamsAPPTenantPage.inputTenantName(name);
    }

    public void inputTenantTel(String tel){
        this.creamsAPPTenantPage.inputTenantTel(tel);
    }

    public void inputTenantCompany(String company){
        this.creamsAPPTenantPage.inputTenantCompany(company);
    }

    public void inputTenantEmail(String email){
        this.creamsAPPTenantPage.inputTenantEmail(email);
    }

    public void inputTenantAddress(String address){
        this.creamsAPPTenantPage.inputTenantAddress(address);
    }

    public void clickSaveButton(){
        this.creamsAPPTenantPage.clickSaveButton();
    }

    public void checkTenantName(String nameCompany){
        Assert.assertThat(this.creamsAPPTenantPage.checkTenantName(nameCompany),is(true));
    }

    public void checkTeantTel(String nameCompany,String telEmail){
        Assert.assertThat(this.creamsAPPTenantPage.checkTeantTel(nameCompany),is(telEmail));
    }


}
