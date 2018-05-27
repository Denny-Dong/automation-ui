package com.souban.bdd.pages.CreamsWebPage.Settings;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class RoomsSelfDefinePage extends ParentPage {

	public RoomsSelfDefinePage(Driver driver) {
		super(driver);
	}

	private UIElement BTN_yesDelete = new UIElement("//span[text()='是']/parent::button");
	private UIElement BTN_ownerSetting = new UIElement("//*[@id='headDownLoadCenter']/following-sibling::*");
	private UIElement BTN_selfDefine = new UIElement("//*[text()='自定义管理']");
	private UIElement BTN_roomDefine = new UIElement("//*[@id='自定义管理$Menu']/li[1]");
	private UIElement BTN_addNewRoomTag = new UIElement("//div[text()='房源标签']/button");
	private UIElement TXT_roomTagName = new UIElement("//*[@placeholder='请输入标签名称']");
	private UIElement BTN_save = new UIElement("//span[text()='保 存']/parent::button");
	private UIElement BTN_sure = new UIElement("//button[text()='确认']");

	// 进入房源标签自定义界面
	public void enterSelfDefine() {
		this.driver.sleep(1000);
		this.driver.mouseOver(BTN_ownerSetting);
		// this.driver.sleep(2000);
		this.driver.waitClickable(BTN_selfDefine, 5);
		this.driver.click(BTN_selfDefine);
		this.driver.sleep(1000);
		this.driver.click(BTN_selfDefine);
		// this.driver.sleep(1000);
		this.driver.waitClickable(BTN_roomDefine, 5);
		this.driver.click(BTN_roomDefine);
		// this.driver.sleep(2000);

	}

	// 新增房源标签
	public void addNewRoomTag(String RoomTag) {
		this.driver.waitClickable(BTN_addNewRoomTag, 5);
		this.driver.click(BTN_addNewRoomTag);
		this.driver.sleep(1000);
		this.driver.elementSendText(TXT_roomTagName, RoomTag);
		this.driver.sleep(1000);
		this.driver.click(BTN_save);

	}

	private UIElement roomTagDelete(String RoomTag) {
		this.driver.sleep(1000);
		return new UIElement("//*[text()='" + RoomTag + "']/following-sibling::td/div");
	}

	// 删除新房源标签
	public void deleteTag(String RoomTag) {
		this.driver.waitClickable(this.roomTagDelete(RoomTag), 5);
		this.driver.click(this.roomTagDelete(RoomTag));
		// this.driver.sleep(1000);
		this.driver.waitClickable(BTN_yesDelete, 5);
		this.driver.click(BTN_yesDelete);
		this.driver.sleep(2000);
	}

	private UIElement chooseRoomTag(String RoomTag) {
		return new UIElement("//*[text()='" + RoomTag + "' and @class='ant-tag ant-tag-checkable']");
	}

	private UIElement choosedRoomTag(String RoomTag) {
		return new UIElement(
				"//*[text()='" + RoomTag + "' and @class='ant-tag ant-tag-checkable ant-tag-checkable-checked']");
	}

	private UIElement chooseBeenChosenRoomTag(String RoomTag) {
		return new UIElement("//*[@class='crTagBox___3nIpQ']/child::*//*[text()='" + RoomTag + "']");
	}

	private UIElement checkRoomTag(String RoomTag) {
		return new UIElement("//*[text()='" + RoomTag + "']");
	}

	// 点亮标签
	public void delightTag(String RoomTag) {
		this.driver.sleep(3000);
		if (this.driver.isElementFound(this.choosedRoomTag(RoomTag))) {
			this.driver.click(this.chooseBeenChosenRoomTag(RoomTag));
		}
		this.driver.click(this.chooseRoomTag(RoomTag));
		this.driver.sleep(1000);
	}

	// 取消标签
	public void cancelTag(String RoomTag) {
		this.driver.sleep(3000);
		this.driver.click(this.chooseBeenChosenRoomTag(RoomTag));
		this.driver.sleep(1000);
	}

	// 保存
	public void saveInformation() {
		this.driver.sleep(2000);
		this.driver.click(BTN_save);
		this.driver.sleep(2000);
		this.driver.click(BTN_sure);
		this.driver.sleep(2000);
	}

	// 查看是否有该标签
	public boolean checkHaveTag(String RoomTag) {
		this.driver.sleep(1000);
		return this.driver.waitForElement(this.checkRoomTag(RoomTag), 5);
	}

}
