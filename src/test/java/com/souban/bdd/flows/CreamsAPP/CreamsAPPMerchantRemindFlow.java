package com.souban.bdd.flows.CreamsAPP;
import static org.hamcrest.core.Is.is;
import com.souban.bdd.pages.CreamsAPP.CreamsAPPMerchantRemindPage;
import org.apache.tools.ant.taskdefs.EchoXML;
import org.junit.Assert;
import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreamsAPPMerchantRemindFlow {
	private CreamsAPPMerchantRemindPage creamsAPPMerchantRemindPage = null;
	
	public CreamsAPPMerchantRemindFlow(final Driver driver) {
		this.creamsAPPMerchantRemindPage = PageFactory.getPage(CreamsAPPMerchantRemindPage.class, driver);
	}
	//点击提醒
	public void clickRemind() {
		this.creamsAPPMerchantRemindPage.clickRemind();
	}
	//进入提醒页
	public void intoRemindPage() {
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoRemindPage(), is(true));
	}
	//点击新建提醒按钮
	public void clickAddRemindButton() {
		this.creamsAPPMerchantRemindPage.clickAddRemindButton();
	}
	//进入新建提醒页
	public void intoAddRemindPage() {
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoAddRemindPage(), is(true));
	}
	//输入提醒日期
	public void clickDate() {
		this.creamsAPPMerchantRemindPage.clickDate();
	}
	public void intoDate() {
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoDate(), is(true));
	}
	public void selectDate() {
		this.creamsAPPMerchantRemindPage.selectDate();
	}
	public void saveDate() {
		this.creamsAPPMerchantRemindPage.saveDate();
	}
	//输入提醒时间
	public void clickTime() {
		this.creamsAPPMerchantRemindPage.clickTime();
	}
	public void intoTime() {
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoTime(), is(true));
	}
	public void selectTime() {
		this.creamsAPPMerchantRemindPage.selectTime();
	}
	public void saveTime() {
		this.creamsAPPMerchantRemindPage.saveTime();
	}
	//输入提醒内容
	public void inputRemindContent(String remindContent) {
		this.creamsAPPMerchantRemindPage.inputRemindContent(remindContent);
	}
	//点击保存按钮
	public void clickSave() {
		this.creamsAPPMerchantRemindPage.clickSave();
	}
	//断言
	public void checkRemindSuccessful(String content) {
		Assert.assertThat(this.creamsAPPMerchantRemindPage.checkRemind(content), is(true));
	}
	
	
	/**
	 * 编辑提醒
	 */
	//进入页面会断言下该提醒存不存在:addRemindSuccessful()
	//点击提醒的更多按钮
	public void clickRemindMore(String content) {
		this.creamsAPPMerchantRemindPage.clickRemindMore(content);
	}
	//选择编辑
	public void clickRemindEdit() {
		this.creamsAPPMerchantRemindPage.clickRemindEdit();
	}
	//进入编辑页
	public void intoRemindEditPage() {
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoRemindEditPage(), is(true));
	}
	public void eidtRemindContent(String content) {
		this.creamsAPPMerchantRemindPage.eidtRemindContent(content);
	}
	//点击保存按钮:clickSave()
	//断言:addRemindSuccessful
	
	
	
	/**
	 * 删除提醒
	 */
	//选择删除
	public void clickRemindDelete() {
		this.creamsAPPMerchantRemindPage.clickRemindDelete();
	}

	//进入是否删除页
	public void intoDeleteRemindPage(){
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoDeleteRemindPage(),is(true));
	}

	//确认删除
	public void clickSureButton(){
		this.creamsAPPMerchantRemindPage.clickSureButton();
	}

	//断言
	public void deleteRemindSuccessful(String content) {
		Assert.assertThat(this.creamsAPPMerchantRemindPage.checkRemind(content), is(false));
	}



	/**
	 * 新建完提醒后,去工作流查看
	 */
	public void clickWorkFlow(){
		this.creamsAPPMerchantRemindPage.clickWorkFlow();
	}

	public void intoWorkFlowPage(){
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoWorkFlowPage(),is(true));
	}

	public void clickRemindList(){
		this.creamsAPPMerchantRemindPage.clickRemindList();
	}

	public void intoRemindListPage(){
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoRemindListPage(),is(true));
	}

	public void clickMattersTo(){
		this.creamsAPPMerchantRemindPage.clickMattersTo();
	}

	public void checkIsRemind(String clientName){
		Assert.assertThat(this.creamsAPPMerchantRemindPage.checkIsRemind(clientName),is(true));
	}
	//android
	public void checkcheckRemindContentForAndroid(String clientName,String finishButton,String buildingName,String remindContent){
		String info = this.creamsAPPMerchantRemindPage.checkRemindContent(clientName);
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Assert.assertThat(actualInfo[0], is(finishButton));
		Assert.assertThat(actualInfo[1], is(buildingName));
		Assert.assertThat(actualInfo[2], is(sdf.format(new Date())));
		Assert.assertThat(actualInfo[3], is(sdf.format(new Date())));
		Assert.assertThat(actualInfo[4], is(remindContent));
	}
	//ios
	public void checkcheckRemindContentForIOS(String clientName,String finishButton,String buildingName,String remindContent) {
		String info = this.creamsAPPMerchantRemindPage.checkRemindContent(clientName);
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date now = new Date();
		try {
			now = sdf.parse(sdf.format(new Date()));
			now.setTime((now.getTime()+60*60*1000*24));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertThat(actualInfo[0], is(finishButton));
		Assert.assertThat(actualInfo[1], is(buildingName));
		Assert.assertThat(actualInfo[2], is(sdf.format(new Date())));
		Assert.assertThat(actualInfo[3], is(sdf.format(now)));
		Assert.assertThat(actualInfo[4], is(remindContent));
	}


	/**
	 * 在待办事项中点击完成按钮
	 */
	//点击完成按钮
	public void clickFinishButton(String clientName){
		this.creamsAPPMerchantRemindPage.clickFinishButton(clientName);
	}

	//进入确认完成页
	public void intoFinishPage(){
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoFinishPage(),is(true));
	}

	//点击确定要标记为"已完成"吗的确定按钮
	public void clickConfirmButton(){
		this.creamsAPPMerchantRemindPage.clickConfirmFinishButton();
	}

	//点击已完事项进入已完事项列表
	public void clickmattersDown(){
		this.creamsAPPMerchantRemindPage.clickmattersDown();
	}

	//检查待办事项和已完事项列
	public void checkNoRemind(String clientName){
		Assert.assertThat(this.creamsAPPMerchantRemindPage.checkIsRemind(clientName),is(false));
	}

	//检查删除按钮
	public void checkIsDeleteButton(){
		Assert.assertThat(this.creamsAPPMerchantRemindPage.checkIsDeleteButton(),is(true));
	}

	//核对内容
	//android
	public void checkDownRemindContentForAndroid(String clientName,String buildingName,String remindContent){
		String info = this.creamsAPPMerchantRemindPage.checkDownRemindContent(clientName);
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Assert.assertThat(actualInfo[0], is(buildingName));
		Assert.assertThat(actualInfo[1], is(sdf.format(new Date())));
		Assert.assertThat(actualInfo[2], is(sdf.format(new Date())));
		Assert.assertThat(actualInfo[3], is(remindContent));
	}
	//ios
	public void checkDownRemindContentForIOS(String clientName,String buildingName,String remindContent){
		String info = this.creamsAPPMerchantRemindPage.checkDownRemindContent(clientName);
		String[] actualInfo = info.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date now = new Date();
		try {
			now = sdf.parse(sdf.format(new Date()));
			now.setTime((now.getTime()+60*60*1000*24));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertThat(actualInfo[0], is(buildingName));
		Assert.assertThat(actualInfo[1], is(sdf.format(new Date())));
		Assert.assertThat(actualInfo[2], is(sdf.format(now)));
		Assert.assertThat(actualInfo[3], is(remindContent));
	}

	/**
	 * 在已完事项中点击删除
	 */
	public void clickDeleteButton(){
		this.creamsAPPMerchantRemindPage.clickDeleteButton();
	}

	public void intoDeletePage(){
		Assert.assertThat(this.creamsAPPMerchantRemindPage.intoDeletePage(),is(true));
	}

	public void clickConfirmDeleteButton(){
		this.creamsAPPMerchantRemindPage.clickConfirmDeleteButton();
	}
}
