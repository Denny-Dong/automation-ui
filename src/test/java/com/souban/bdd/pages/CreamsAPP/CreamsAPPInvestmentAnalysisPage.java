package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPInvestmentAnalysisPage extends ParentPage {

    public CreamsAPPInvestmentAnalysisPage(Driver driver){
        super(driver);
    }

    private UIElement TXT_investmentAnalysis = new UIElement(
            "xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/merchantAnalyseTv' and @text='招商分析']",
            "xpath=//XCUIElementTypeStaticText[@name='招商分析']");

    private UIElement TXT_investmentAnslysisPage = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='招商分析']",
            "xpath=//XCUIElementTypeOther[@name='招商分析']");


    //在导航页点击招商分析
    public void clickInvestmentAnalysis(){
        this.driver.waitAndClick(TXT_investmentAnalysis,2);
    }
    //断言,进入招商分析页
    public boolean intoInvestmentAnalysisPage(){
        return this.driver.waitForElement(TXT_investmentAnslysisPage,2);
    }

}
