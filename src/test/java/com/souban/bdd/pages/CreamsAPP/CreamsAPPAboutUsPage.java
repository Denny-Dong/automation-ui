package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPAboutUsPage extends ParentPage {

    public CreamsAPPAboutUsPage(Driver driver){
        super(driver);
    }

    private UIElement TXT_aboutUs = new UIElement(
            "xpath=//*[@text='关于我们']",
            "xpath=//XCUIElementTypeStaticText[@name='关于我们']");
    private UIElement TXT_aboutUsPage = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='关于我们']",
            "xpath=//XCUIElementTypeOther[@name='关于我们']");

    public void clickAboutUs(){
        this.driver.waitAndClick(TXT_aboutUs,2);
    }

    public boolean intoAboutUsPage(){
        return this.driver.waitForElement(TXT_aboutUsPage,2);
    }
}
