package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.pages.CreamsAPP.CreamsAPPReportPage;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;
import java.util.List;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

public class CreamsAppReportFlow {

	CreamsAPPReportPage ReportPage = null;
	
	public CreamsAppReportFlow(final Driver driver){
		this.ReportPage = PageFactory.getPage(CreamsAPPReportPage.class,driver);
	}
	
	//报备列表
	public void VerifyGotoReportList(){
		this.ReportPage.GotoReportList();
	}
	
	public void VerifyReportCustomer(String customer){
		Assert.assertThat(this.ReportPage.CheckReportCustomer(customer), is(true));
	}
	
	public void VerifyGender(String customer,String gender){
		Assert.assertThat(this.ReportPage.CheckGender(customer), is(gender));
	}
	
	public void VerifyState(String customer,String state){
		Assert.assertThat(this.ReportPage.CheckState(customer), is(state));
	}
	
	public void VerifyReportInfo(String customer,String tel,String reportTime,String area,String Contract,String industry,String description){
		List<String> ReportInfo = new ArrayList<String>();
		ReportInfo = this.ReportPage.CheckReportInfo(customer);
		Assert.assertThat(ReportInfo.get(0), is(tel));
		Assert.assertThat(ReportInfo.get(1), is(reportTime));
		Assert.assertThat(ReportInfo.get(2), is(area));
		Assert.assertThat(ReportInfo.get(3), is(Contract));
		Assert.assertThat(ReportInfo.get(4), is(industry));
		Assert.assertThat(ReportInfo.get(5), is(description));
	}
	
	//报备详情
	public void GotoReportDetail(String customer){
		this.ReportPage.GotoReportDetail(customer);
	}
	
	public void VerifyCustomerInfo(String name,String gender,String tel,String status,String areaSize,String industry,String reportDate,String content,String contentTel){
		String[] CustomerInfo = this.ReportPage.CheckCustomerInfo().split(",");
		Assert.assertThat(CustomerInfo[0], is(name));
		Assert.assertThat(CustomerInfo[1], is(gender));
		Assert.assertThat(CustomerInfo[2], is(tel));
		Assert.assertThat(CustomerInfo[3], is(status));
		Assert.assertThat(CustomerInfo[4], is(areaSize));
		Assert.assertThat(CustomerInfo[5], is(industry));
		Assert.assertThat(CustomerInfo[6], is(reportDate));
		Assert.assertThat(CustomerInfo[7], is(content));
		Assert.assertThat(CustomerInfo[8], is(contentTel));
	}
	
	public void VerifyCustomerDescription(String description){
		Assert.assertThat(this.ReportPage.CheckCustomerDescription(), is(description));
	}
	
	public void VerifyViewInfo(String viewNum,String applyDate,String park){
		String[] ViewInfo = this.ReportPage.CheckViewInfo().split(",");
		Assert.assertThat(ViewInfo[0], is(viewNum));
		Assert.assertThat(ViewInfo[1], is(applyDate));
		Assert.assertThat(ViewInfo[2], is(park));
	}
	
	public void VerifyLogInfo(String logTitle,String logTime){
		String[] LogInfo = this.ReportPage.CheckLogInfo().split(",");
		Assert.assertThat(LogInfo[0], is(logTitle));
		Assert.assertThat(LogInfo[1], is(logTime));
	}
	
	//报备列表根据带看编号搜索
	public void GotoSearchPage(){
		this.ReportPage.GotoSearchPage();
	}
	
	public void InputViewNum(String viewNum){
		this.ReportPage.InputViewNum(viewNum);
	}
	
	public void VerifySearchResult(String customer){
		Assert.assertThat(this.ReportPage.CheckSearchResult(customer), is(true));
	}
	
}
