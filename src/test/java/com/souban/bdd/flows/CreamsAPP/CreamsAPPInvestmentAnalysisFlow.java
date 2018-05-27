package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsAPP.CreamsAPPInvestmentAnalysisPage;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

public class CreamsAPPInvestmentAnalysisFlow {
    private CreamsAPPInvestmentAnalysisPage creamsAPPInvestmentAnalysisPage = null;

    public CreamsAPPInvestmentAnalysisFlow(final Driver driver) {
        this.creamsAPPInvestmentAnalysisPage = PageFactory.getPage(CreamsAPPInvestmentAnalysisPage.class, driver);
    }

    //在导航页点击招商分析
    public void clickInvestmentAnalysis(){
        this.creamsAPPInvestmentAnalysisPage.clickInvestmentAnalysis();
    }
    //断言,进入招商分析页
    public void intoInvestmentAnalysisPage(){
        Assert.assertThat(this.creamsAPPInvestmentAnalysisPage.intoInvestmentAnalysisPage(),is(true));
    }
}
