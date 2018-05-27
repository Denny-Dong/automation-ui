package com.souban.bdd.steps;

import java.util.List;
import java.util.Map;

import com.souban.bdd.flows.CreamsWebFlow.Marketing.AgentFlow;
import com.souban.bdd.flows.CreamsWebFlow.Authories.AuthorityFlow;
import com.souban.bdd.flows.CreamsWebFlow.Building.BuildingListFlow;
import com.souban.bdd.flows.CreamsWebFlow.Building.BuildingsFlow;
import com.souban.bdd.flows.CreamsWebFlow.Marketing.ChannelFlow;
import com.souban.bdd.flows.CreamsWebFlow.Oa.CheckFlowLatestFlow;
import com.souban.bdd.flows.CreamsWebFlow.Oa.CheckOptimizeFlow;
import com.souban.bdd.flows.CreamsWebFlow.Contract.ContractAndContractNumberFlow;
import com.souban.bdd.flows.CreamsWebFlow.Contract.ContractFlow;
import com.souban.bdd.flows.CreamsWebFlow.Contract.ContractSideboardFlow;
import com.souban.bdd.flows.CreamsAPP.*;
import com.souban.bdd.flows.CreamsWebFlow.Marketing.CreateRequirementFlow;
import com.souban.bdd.flows.CreamsWebFlow.Marketing.CustomerFlow;
import com.souban.bdd.flows.CreamsWebFlow.Export.ExportFileFlow;
import com.souban.bdd.flows.CreamsWebFlow.Finance.FlowOfIncomeFlow;
import com.souban.bdd.flows.CreamsWebFlow.Settings.InternalManagementFlow;
import com.souban.bdd.flows.CreamsWebFlow.Marketing.InvesteringListFlow;
import com.souban.bdd.flows.CreamsWebFlow.Settings.InvoicedFlow;
import com.souban.bdd.flows.CreamsWebFlow.Settings.JobSelfDefineFlow;
import com.souban.bdd.flows.CreamsWebFlow.LoginFlow;
import com.souban.bdd.flows.CreamsWebFlow.Finance.NewAndEditClosebillsFlow;
import com.souban.bdd.flows.CreamsWebFlow.Property.PropertyFlow;
import com.souban.bdd.flows.CreamsWebFlow.Contract.RenewContractFlow;
import com.souban.bdd.flows.CreamsWebFlow.Room.RoomsFlow;
import com.souban.bdd.flows.CreamsWebFlow.Room.RoomsManageFlow;
import com.souban.bdd.flows.CreamsWebFlow.Settings.RoomsSelfDefineFlow;
import com.souban.bdd.flows.CreamsWebFlow.Tenant.TenantManagementFlow;
import com.souban.bdd.flows.BOS.BosAccountManagementFlow;
import com.souban.bdd.flows.BOS.BosCustomerManagementFlow;
import com.souban.bdd.flows.CreamsWebFlow.Contract.ContractListFlow;
import com.souban.bdd.framework.CucumberData;
import com.souban.bdd.framework.Data;
import com.souban.bdd.framework.driver.Driver;

public class BaseStep {
	protected Driver driver;

	public BaseStep() {
		this.driver = Hooks.driver;
		this.initData();
		this.initFlows();
	}

	// init flows
	protected LoginFlow loginFlow;
	protected ContractFlow contractFlow;
	protected CustomerFlow customerFlow;
	protected ChannelFlow channelFlow;
	protected AgentFlow agentFlow;
	protected RenewContractFlow renewContractFlow;
	protected CreamsAPPLoginAndLogoutFlow creamsAPPLoginAndLogoutFlow;
	protected BuildingListFlow buildingListFlow;
	protected CreateRequirementFlow createRequirementFlow;
	protected PropertyFlow propertyFlow;
	protected BuildingsFlow buildingsFlow;
	protected BosAccountManagementFlow bosAccountManagementFlow;
	protected BosCustomerManagementFlow bosCustomerManagementFlow;
	protected RoomsFlow roomsFlow;
	protected InvesteringListFlow investeringListFlow;
	protected NewAndEditClosebillsFlow newandeditclosebillsFlow;
	protected ContractListFlow contractListFlow;
	protected CreamsAPPModifyPasswordFlow creamsAPPModifyPasswordFlow;
	protected ContractSideboardFlow contractSideboardFlow;
	protected CreamsAPPMyCollectionFlow creamsAPPMyCollectionFlow;
	protected CreamsAPPPersonalInformationFlow creamsAPPPersonalInformationFLow;
	protected CreamsAPPMyChannelFlow creamsAPPMyChannelFlow;
	protected CreamsAPPMicroBookFlow creamsAPPMicroBookFlow;
	protected CreamsAPPCustomerManagementFlow creamsAPPCustomerManagementFlow;
	protected BuildingListShowFlow buildingListShowFlow;
	protected SearchFlow searchFlow;
	protected CreamsAppContractFlow creamsAppContractFlow;
	protected DetailsOfContractOperationFlow detailsOfContractOperationFlow;
	protected FlowOfIncomeFlow flowOfIncomeFlow;
	protected AuthorityFlow authorityFlow;
	protected RoomsManageFlow roomsManageFlow;
	protected InvoicedFlow invoicedFlow;
	protected CreamsAppReportFlow creamsAppReportFlow;
	protected JobSelfDefineFlow jobSelfDefineFlow;
	protected TenantManagementFlow tenantManagementFlow;
	protected RoomsSelfDefineFlow roomsSelfDefineFlow;
	protected CheckOptimizeFlow checkOptimizeFlow;
	protected ContractAndContractNumberFlow contractAndContractNumberFlow;
	protected AllOfBillsFlow allOfBillsFlow;
	protected CreamsAPPMarginBalanceFlow creamsAPPMarginBalanceFlow;
	protected ExportFileFlow exportFileFlow;
	protected CheckFlowLatestFlow checkFlowLatestFlow;
	protected CreamsAPPMerchantRemindFlow creamsAPPMerchantRemindFlow;
	protected InternalManagementFlow internalManagementFlow;
	protected CreamsAPPInvestmentAnalysisFlow creamsAPPInvestmentAnalysisFlow;
	protected CreamsAPPForgetPwdFlow creamsAPPForgetPwdFlow;
	protected CreamsAPPTenantFlow creamsAPPTenantFlow;
	protected CreamsAPPAboutUsFlow creamsAPPAboutUsFlow;
	protected LatestNewsFlow latestNewsFlow;
	protected ContractReviewFlow contractReviewFlow;
	protected CreamsAPPStatisticalAnalysisFlow creamsAPPStatisticalAnalysisFlow;
	protected CreamsAPPArchivalContractFlow creamsAPPArchivalContractFlow;

	public void initFlows() {
		this.loginFlow = new LoginFlow(this.driver);
		this.contractFlow = new ContractFlow(this.driver);
		this.customerFlow = new CustomerFlow(this.driver);
		this.channelFlow = new ChannelFlow(this.driver);
		this.agentFlow = new AgentFlow(this.driver);
		this.renewContractFlow = new RenewContractFlow(this.driver);
		this.creamsAPPLoginAndLogoutFlow = new CreamsAPPLoginAndLogoutFlow(this.driver);
		this.buildingListFlow = new BuildingListFlow(this.driver);
		this.propertyFlow = new PropertyFlow(this.driver);
		this.buildingsFlow = new BuildingsFlow(this.driver);
		this.bosAccountManagementFlow = new BosAccountManagementFlow(this.driver);
		this.bosCustomerManagementFlow = new BosCustomerManagementFlow(this.driver);
		this.roomsFlow = new RoomsFlow(this.driver);
		this.createRequirementFlow = new CreateRequirementFlow(this.driver);
		this.investeringListFlow = new InvesteringListFlow(this.driver);
		this.newandeditclosebillsFlow = new NewAndEditClosebillsFlow(this.driver);
		this.contractListFlow = new ContractListFlow(this.driver);
		this.creamsAPPModifyPasswordFlow = new CreamsAPPModifyPasswordFlow(this.driver);
		this.contractSideboardFlow = new ContractSideboardFlow(this.driver);
		this.creamsAPPMyCollectionFlow = new CreamsAPPMyCollectionFlow(this.driver);
		this.creamsAPPPersonalInformationFLow = new CreamsAPPPersonalInformationFlow(this.driver);
		this.creamsAPPMyChannelFlow = new CreamsAPPMyChannelFlow(this.driver);
		this.creamsAPPMicroBookFlow = new CreamsAPPMicroBookFlow(this.driver);
		this.creamsAPPCustomerManagementFlow = new CreamsAPPCustomerManagementFlow(this.driver);
		this.buildingListShowFlow = new BuildingListShowFlow(this.driver);
		this.searchFlow = new SearchFlow(this.driver);
		this.creamsAppContractFlow = new CreamsAppContractFlow(this.driver);
		this.detailsOfContractOperationFlow = new DetailsOfContractOperationFlow(this.driver);
		this.flowOfIncomeFlow = new FlowOfIncomeFlow(this.driver);
		this.authorityFlow = new AuthorityFlow(this.driver);
		this.roomsManageFlow = new RoomsManageFlow(this.driver);
		this.invoicedFlow = new InvoicedFlow(this.driver);
		this.creamsAppReportFlow = new CreamsAppReportFlow(this.driver);
		this.jobSelfDefineFlow = new JobSelfDefineFlow(this.driver);
		this.tenantManagementFlow = new TenantManagementFlow(this.driver);
		this.roomsSelfDefineFlow = new RoomsSelfDefineFlow(this.driver);
		this.checkOptimizeFlow = new CheckOptimizeFlow(this.driver);
		this.contractAndContractNumberFlow = new ContractAndContractNumberFlow(this.driver);
		this.allOfBillsFlow = new AllOfBillsFlow(this.driver);
		this.creamsAPPMarginBalanceFlow = new CreamsAPPMarginBalanceFlow(this.driver);
		this.exportFileFlow = new ExportFileFlow(this.driver);
		this.checkFlowLatestFlow = new CheckFlowLatestFlow(this.driver);
		this.creamsAPPMerchantRemindFlow = new CreamsAPPMerchantRemindFlow(this.driver);
		this.internalManagementFlow = new InternalManagementFlow(this.driver);
		this.creamsAPPInvestmentAnalysisFlow = new CreamsAPPInvestmentAnalysisFlow(this.driver);
		this.creamsAPPForgetPwdFlow = new CreamsAPPForgetPwdFlow(this.driver);
		this.creamsAPPTenantFlow = new CreamsAPPTenantFlow(this.driver);
		this.creamsAPPAboutUsFlow = new CreamsAPPAboutUsFlow(this.driver);
		this.latestNewsFlow = new LatestNewsFlow(this.driver);
		this.contractReviewFlow = new ContractReviewFlow(this.driver);
		this.creamsAPPStatisticalAnalysisFlow = new CreamsAPPStatisticalAnalysisFlow(this.driver);
		this.creamsAPPArchivalContractFlow = new CreamsAPPArchivalContractFlow(this.driver);
	}

	// init data
	protected Data stepData;
	protected CucumberData cucumberData;
	protected List<Map<String, String>> givenData;
	protected List<Map<String, String>> whenData;
	protected List<Map<String, String>> thenData;

	public void initData() {
		this.stepData = new Data();
		this.cucumberData = new CucumberData();
	}
}
