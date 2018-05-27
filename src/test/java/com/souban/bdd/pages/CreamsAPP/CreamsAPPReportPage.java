package com.souban.bdd.pages.CreamsAPP;

import java.util.List;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPReportPage extends ParentPage{

	public CreamsAPPReportPage(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//报备列表元素
	private UIElement LST_ReportList = new UIElement("id=com.souban.creams.debug:id/customerReportTv","");
	private UIElement TXT_ReportPool = new UIElement("id=com.souban.creams.debug:id/reportPoolRb","");
	
	private UIElement CustomerElement(String customer){
		return new UIElement("xpath=//*[@resource-id='com.souban.creams.debug:id/nameTv' and @text='" + customer + "']","");
	}
	private UIElement GenderElement(String customer){
		return new UIElement("xpath=//*[@text='" + customer + "']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/genderTv']","");
	}
	private UIElement StateElement(String customer){
		return new UIElement("xpath=//*[@text='" + customer + "']/following-sibling::android.widget.TextView[@resource-id='com.souban.creams.debug:id/status']","");
	}
	
	private UIElement ReportInfoElement(String customer){
		return new UIElement("xpath=//*[@text='" + customer + "']/ancestor::android.widget.LinearLayout[1]//android.widget.TextView[@resource-id='com.souban.creams.debug:id/value']","");
	}
	
	//报备详情元素
	private UIElement TXT_ReportDetail = new UIElement("xpath=//android.widget.TextView[@text='报备详情']","");
	private UIElement TXT_Name =new UIElement("id=com.souban.creams.debug:id/customerTv","");
	private UIElement TXT_Gender = new UIElement("id=com.souban.creams.debug:id/genderTv","");
	private UIElement TXT_Tel = new UIElement("id=com.souban.creams.debug:id/customerTelTv","");
	private UIElement TXT_Ststus = new UIElement("id=com.souban.creams.debug:id/currentStatusTv","");
	private UIElement TXT_AreaSize = new UIElement("id=com.souban.creams.debug:id/demandAreaSizeTv","");
	private UIElement TXT_Industry = new UIElement("id=com.souban.creams.debug:id/industryTv","");
	private UIElement TXT_ReportDate = new UIElement("id=com.souban.creams.debug:id/reportDateTv","");
	private UIElement TXT_Content = new UIElement("id=com.souban.creams.debug:id/contentTv","");
	private UIElement TXT_ContractTel = new UIElement("id=com.souban.creams.debug:id/channelTelTv","");
	private UIElement TXT_Description = new UIElement("id=com.souban.creams.debug:id/customerDescriptionTv","");
	private UIElement TXT_ViewNum = new UIElement("id=com.souban.creams.debug:id/viewNumberTv","");
	private UIElement TXT_ApplyDate = new UIElement("id=com.souban.creams.debug:id/applyDateTv","");
	private UIElement TXT_Building = new UIElement("id=com.souban.creams.debug:id/buildingTv","");
	private UIElement TXT_LogTitle = new UIElement("id=com.souban.creams.debug:id/titleTv","");
	private UIElement TXT_LogTime = new UIElement("id=com.souban.creams.debug:id/timeTv","");
	
	
	//报备列表搜索元素
	private UIElement BTN_Search = new UIElement("xpath=//android.widget.TextView[@resource-id='com.souban.creams.debug:id/search']","");
	private UIElement INP_Search = new UIElement("xpath=//android.widget.EditText[@resource-id='com.souban.creams.debug:id/search']","");
	
	//报备详情方法
	public boolean GotoReportList(){
		this.driver.waitAndClick(LST_ReportList, 2);
		return this.driver.waitForElement(TXT_ReportPool, 3);
	}
	
	public boolean CheckReportCustomer(String customer){
		return this.driver.waitForElement(this.CustomerElement(customer), 3);
	}
	
	public String CheckGender(String customer){
		return this.driver.elementGetText(this.GenderElement(customer));
	}
	
	public String CheckState(String customer){
		return this.driver.elementGetText(this.StateElement(customer));
	}
	
	public List<String> ReportInfo(UIElement txt){
		return this.driver.allElementsGetText(txt);
	}
	
	public List<String> CheckReportInfo(String customer){
		return this.ReportInfo(this.ReportInfoElement(customer));
	}
	
	//报备详情方法
	public boolean GotoReportDetail(String customer){
		this.driver.waitAndClick(this.CustomerElement(customer), 3);
		return this.driver.waitForElement(TXT_ReportDetail, 3);
	}
	
	public String CheckCustomerInfo(){
		return this.driver.elementGetText(TXT_Name) + "," + this.driver.elementGetText(TXT_Gender) + "," + this.driver.elementGetText(TXT_Tel) + "," + this.driver.elementGetText(TXT_Ststus) + "," +
	this.driver.elementGetText(TXT_AreaSize) + "," + this.driver.elementGetText(TXT_Industry) + "," + this.driver.elementGetText(TXT_ReportDate) + "," + this.driver.elementGetText(TXT_Content) + "," +
				this.driver.elementGetText(TXT_ContractTel);
	}
	
	public String CheckCustomerDescription(){
		return this.driver.elementGetText(TXT_Description);
	}
	
	public String CheckViewInfo(){
		this.driver.swipeToUpToFindElement(TXT_ViewNum);
		return this.driver.elementGetText(TXT_ViewNum) + "," + this.driver.elementGetText(TXT_ApplyDate) + "," + this.driver.elementGetText(TXT_Building);
	}
	
	public String CheckLogInfo(){
		this.driver.swipeToUpToFindElement(TXT_LogTitle);
		return this.driver.elementGetText(TXT_LogTitle) + "," + this.driver.elementGetText(TXT_LogTime);
	}
	
	//根据带看编号搜索方法
	public void GotoSearchPage(){
		this.driver.waitAndClick(BTN_Search, 3);
	}
	
	public void InputViewNum(String viewNum){
		this.driver.sleep(1000);
		this.driver.elementSendText(INP_Search, viewNum);
	}
	
	public boolean CheckSearchResult(String customer){
		return this.driver.waitForElement(this.CustomerElement(customer), 5);
	}
}
