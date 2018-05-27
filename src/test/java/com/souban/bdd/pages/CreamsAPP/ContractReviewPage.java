package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class ContractReviewPage extends ParentPage {
    public ContractReviewPage(Driver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }


    //合同审核
    private UIElement BTN_ContractTitle = new UIElement("id=com.souban.creams.debug:id/contractTitleTv",
            "");

    //筛选按钮
    private UIElement BTN_filter = new UIElement("id=com.souban.creams.debug:id/filter","");

    //我发起的tab
    private UIElement BTN_sponsor = new UIElement("xpath=//android.widget.TextView[@text='我发起的']","");

    //带我审批
    private UIElement BTN_Review = new UIElement("xpath=//android.widget.TextView[contains(@text,'我发起的')]","");

    //我已审批
    private UIElement BTN_Approved = new UIElement("xpath=//android.widget.TextView[@text='我已审批']","");

    //审核类型
    private UIElement BTN_Type = new UIElement("id=com.souban.creams.debug:id/newApprovalCb","");

    //确定按钮
    private UIElement BTN_Confirm = new UIElement("id=com.souban.creams.debug:id/confirmTv","");

    //列表类型
    private UIElement TXT_ListType = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/type']","");

    //审批状态
    private UIElement TXT_ApprovalStatus = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/status']","");

    //搜索框
    private UIElement BTN_Search = new UIElement("id=com.souban.creams.debug:id/searchTv","");


}
