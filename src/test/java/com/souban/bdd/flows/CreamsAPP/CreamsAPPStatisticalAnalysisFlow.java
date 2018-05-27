package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsAPP.CreamsAPPStatisticalAnalysisPage;
import org.junit.Assert;

import static org.hamcrest.core.Is.is;

public class CreamsAPPStatisticalAnalysisFlow {
    private CreamsAPPStatisticalAnalysisPage creamsAPPStatisticalAnalysisPage = null;

    public CreamsAPPStatisticalAnalysisFlow(final Driver driver) {
        this.creamsAPPStatisticalAnalysisPage = PageFactory.getPage(CreamsAPPStatisticalAnalysisPage.class, driver);
    }

    public void ClickStatisticsAnalyse(){
        this.creamsAPPStatisticalAnalysisPage.ClickStatisticsAnalyse();
    }

    public void CheckStatisticsAnalyse(){
        Assert.assertThat(this.creamsAPPStatisticalAnalysisPage.CheckStatisticsAnalyse(),is(true));
    }
}
