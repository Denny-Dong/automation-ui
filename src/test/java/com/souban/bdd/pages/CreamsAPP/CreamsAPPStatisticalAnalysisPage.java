package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPStatisticalAnalysisPage extends ParentPage {
    public CreamsAPPStatisticalAnalysisPage(Driver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    //统计分析
    private  UIElement BTN_StatisticsAnalyse = new UIElement("id=com.souban.creams.debug:id/statisticsAnalyseTv","");

    private UIElement TXT_StatisticsAnalyse = new UIElement("id=com.souban.creams.debug:id/toolbar_title","");


    //方法
    public void ClickStatisticsAnalyse(){
        this.driver.click(BTN_StatisticsAnalyse);
    }

    public boolean CheckStatisticsAnalyse(){
        return this.driver.waitForElement(TXT_StatisticsAnalyse,3);
    }

}
