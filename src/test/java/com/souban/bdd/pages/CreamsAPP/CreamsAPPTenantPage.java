package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPTenantPage extends ParentPage {

    public CreamsAPPTenantPage(Driver driver){
        super(driver);
    }

    //租客联系人入口
    private UIElement BTN_newTenant = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/moreIv' and @text='新建']",
            "xpath=//XCUIElementTypeButton[@name='新建']");
    private UIElement TXT_newTenantPage = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='新建租客联系人']",
            "xpath=//XCUIElementTypeOther[@name='新建租客联系人']");
    //租客信息
    private UIElement INP_tenantName = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/nameTv']",
            "xpath=//XCUIElementTypeStaticText[@name='姓名']/following-sibling::XCUIElementTypeTextField[1]");
    private UIElement INP_tenantTel = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/telEt']",
            "xpath=//XCUIElementTypeStaticText[@name='电话']/following-sibling::XCUIElementTypeTextField[1]");
    private UIElement INP_tenantCompany = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/companyNameTv']",
            "xpath=//XCUIElementTypeStaticText[@name='公司']/following-sibling::XCUIElementTypeTextField[1]");
    private UIElement INP_tenantEmail = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/emailEt']",
            "xpath=//XCUIElementTypeStaticText[@name='邮箱']/following-sibling::XCUIElementTypeTextField[1]");
    private UIElement INP_tenantAddress = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/locationEt']",
            "xpath=//XCUIElementTypeStaticText[@name='通讯地址']/following-sibling::XCUIElementTypeTextField[1]");
    private UIElement BTN_save = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/saveTv']",
            "xpath=//XCUIElementTypeButton[@name='保存']");

    //断言
    private UIElement NameCompanyUIElement(String nameCompany){
        return new UIElement(
                "xpath=//*[@resource-id='com.souban.creams.debug:id/nameTv' and @text='"+nameCompany+"']",
                "xpath=//XCUIElementTypeStaticText[@name='"+nameCompany+"']");
    }
    private UIElement TelEmailUIElement(String nameCompany){
        return new UIElement(
                "xpath=//*[@text='"+nameCompany+"']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/telTv']",
                "xpath=//XCUIElementTypeStaticText[@name='"+nameCompany+"']/following-sibling::XCUIElementTypeStaticText[1]");
    }


    public void clickNewTenant(){
        this.driver.waitAndClick(BTN_newTenant,2);
    }

    public boolean intoNewTenantPage(){
        return this.driver.waitForElement(TXT_newTenantPage,2);
    }

    public void inputTenantName(String name){
        this.driver.elementClearSendText(INP_tenantName,name);
    }

    public void inputTenantTel(String tel){
        this.driver.elementClearSendText(INP_tenantTel,tel);
    }

    public void inputTenantCompany(String company){
        this.driver.elementClearSendText(INP_tenantCompany,company);
    }

    public void inputTenantEmail(String email){
        this.driver.elementClearSendText(INP_tenantEmail,email);
    }

    public void inputTenantAddress(String address){
        this.driver.elementClearSendText(INP_tenantAddress,address);
    }

    public void clickSaveButton(){
        this.driver.waitAndClick(BTN_save,2);
        this.driver.sleep(1000);
    }

    public boolean checkTenantName(String nameCompany){
        this.driver.swipeToUpToFindElement(this.NameCompanyUIElement(nameCompany));
        return this.driver.waitForElement(this.NameCompanyUIElement(nameCompany),2);
    }

    public String checkTeantTel(String nameCompany){
        return this.driver.elementGetText(this.TelEmailUIElement(nameCompany));
    }
}
