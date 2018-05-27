package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.pages.CreamsAPP.SearchPage;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;

public class SearchFlow {
    private SearchPage searchPage= null;
	
	public SearchFlow(final Driver driver) {
		this.searchPage = PageFactory.getPage(SearchPage.class, driver);
	}
	
	public void   ClickSearchBox(){
		this.searchPage.ClickSearchBox();
	}
	
	public void checkSearch() {
		Assert.assertThat(this.searchPage.checkSearch(), is(true));
	}
	public void ClickSendRoom(String RoomNub){
		//this.searchPage.ClickSearchBox1();
		this.searchPage.SendRoom(RoomNub);
	}
	
/*	public void Room1(String RoomNub){
		this.searchPage.Room1(RoomNub);
	}*/
	
	/*public void  Room2(String RoomNub2){
		this.searchPage.Room2(RoomNub2);
	}*/
	public void CheakRoom(String Room){
		Assert.assertThat(this.searchPage.CheakRoom(Room), is(true));
	}
	
	public void VerityText(String Room,String area,String state){
		String[] Text=this.searchPage.Text(Room).split(",");
		Assert.assertThat(Text[0],is(area));
		Assert.assertThat(Text[1],is(state));
	}
	
	public void VerityRoomInfoAndroid(String Room,String price,String area,String state){
		String[] Text=this.searchPage.RoomInfoAndroid(Room).split(",");
		Assert.assertThat(Text[0],is(price));
		Assert.assertThat(Text[1],is(area));
		Assert.assertThat(Text[2],is(state));
	}
	
	

	//合同搜索
	public void ClickTenanl(){
		this.searchPage.ClickTenanl();
	}
	
	public void Tenant(String tenant){
		this.searchPage.Tenant(tenant);
	}
	
	public void checkTenant(String tenant){
		Assert.assertThat(this.searchPage.checkTenant(tenant), is(true));
	}
	
	public void VerityContractText(String tenant,String room,String area,String price,String startday,String endday){
		String[] Text=this.searchPage.ContractText(tenant).split(",");
		Assert.assertThat(Text[0], is(tenant));
		Assert.assertThat(Text[1], is(room));
		Assert.assertThat(Text[2], is(area));
		Assert.assertThat(Text[3], is(price));
		Assert.assertThat(Text[4], is(startday));
		Assert.assertThat(Text[5], is(endday));
		
	}
	
	public void VerityContractTextAndroid(String tenant,String building,String room,String area,String price,String startday,String endday){
		String[] Text=this.searchPage.ContractTextAndroid(tenant).split(",");
		
		Assert.assertThat(Text[0], is(building));
		Assert.assertThat(Text[1], is(room));
		Assert.assertThat(Text[2]+"m²", is(area));
		Assert.assertThat(Text[3], is(price));
		Assert.assertThat(Text[4], is(startday));
		Assert.assertThat(Text[5], is(endday));
		
	}
	
	
	//客户搜索
	public void ClickCustomer(){
		this.searchPage.ClickCustomer();
	}
	
	public void Customer(String customer){
		this.searchPage.Customer(customer);
	}
	
	public void CheckCustomer(String customer){
		this.searchPage.CheckCustomer(customer);
	}
	
	public void VerityCustomerText(String customer,String customerstate,String leaseconsultant,String visitingtime,String demandarea,String channel,String intentionofhousing,String latesnote){
		String[] Text=this.searchPage.CustomerInfo(customer).split(",");
		
		Assert.assertThat(Text[0], is(customerstate));
		Assert.assertThat(Text[1], is(leaseconsultant));
		Assert.assertThat(Text[2], is(visitingtime));
		Assert.assertThat(Text[3], is(demandarea));
		Assert.assertThat(Text[4], is(channel));
		Assert.assertThat(Text[5], is(intentionofhousing));
		Assert.assertThat(Text[6], is(latesnote));
	}
	
	
	public void VerityCustomerTextAndroid(String customer,String customerstate,String leaseconsultant,String visitingtime,String demandarea,String channel,String intentionofhousing){
		String[] Text=this.searchPage.CustomerTextAndroid(customer).split(",");
		
		Assert.assertThat(Text[0], is(customerstate));
		Assert.assertThat(Text[1], is(leaseconsultant));
		Assert.assertThat(Text[2], is(visitingtime));
		Assert.assertThat(Text[3], is(demandarea));
		Assert.assertThat(Text[4], is(channel));
		Assert.assertThat(Text[5], is(intentionofhousing));
		
	}
}
