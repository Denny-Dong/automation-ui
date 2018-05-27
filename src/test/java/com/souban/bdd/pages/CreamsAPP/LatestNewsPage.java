package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class LatestNewsPage extends ParentPage {
    public LatestNewsPage(Driver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    //工作流
    private UIElement BTN_WorkFlow = new UIElement("id=com.souban.creams.debug:id/work_flow",
            "");

    //最新消息入口
    private UIElement BTN_NewsTitle = new UIElement("id=com.souban.creams.debug:id/newsRl",
            "");

    //最新消息标题
    private UIElement TXT_NewsTitle = new UIElement("xpath=//android.widget.TextView[@text='最新消息']",
            "");

    //账单提醒
    private UIElement TXT_BillReminding = new UIElement("xpath=//android.widget.TextView[contains(@text,'账单提醒')]",
            "");

    //租期提醒
    private UIElement TXT_LeaseReminding = new UIElement("xpath=//android.widget.TextView[contains(@text,'租期提醒')]",
            "");

    //提醒记录
    private UIElement BTN_Bill = new UIElement("xpath=//android.support.v7.widget.RecyclerView[@resource-id='com.souban.creams.debug:id/recycler_view']/android.widget.LinearLayout[1]",
            "");

    //账单详情
    private UIElement TXT_BillInfo = new UIElement("xpath=//android.widget.TextView[@text='账单详情']","");

    //合同详情
    private UIElement TXT_ContractInfo = new UIElement("xpath=//android.widget.TextView[@text='合同详情']","");

    //方法
    public void ClickWorkFlow(){
        this.driver.click(BTN_WorkFlow);
    }

    public void ClickNewsTitle(){
        this.driver.click(BTN_NewsTitle);
    }

    public boolean CheckNewsTitle(){
        this.driver.sleep(1000);
        return this.driver.waitForElement(TXT_NewsTitle, 5);
    }

    public boolean CheckBillTab(){
        return this.driver.waitForElement(TXT_BillReminding,5);

    }

    public boolean CheckLeaseTab(){
        return this.driver.waitForElement(TXT_LeaseReminding,5);
    }

    public void ClickList(){
        this.driver.sleep(3000);
        this.driver.waitAndClick(BTN_Bill,10);
    }

    public boolean CheckBillInfo(){
        return this.driver.waitForElement(TXT_BillInfo,5);
    }

    public void ClickLeaseTab(){
        this.driver.click(TXT_LeaseReminding);
    }

    public boolean CheckContractInfo(){
        return this.driver.waitForElement(TXT_ContractInfo,5);
    }
}


