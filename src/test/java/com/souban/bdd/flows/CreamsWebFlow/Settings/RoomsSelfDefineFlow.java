package com.souban.bdd.flows.CreamsWebFlow.Settings;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Settings.RoomsSelfDefinePage;

public class RoomsSelfDefineFlow {
	private RoomsSelfDefinePage roomsSelfDefinePage = null;

	public RoomsSelfDefineFlow(Driver driver) {
		this.roomsSelfDefinePage = PageFactory.getPage(RoomsSelfDefinePage.class, driver);

	}

	public void enterSlefDefineRoomsTag() {
		this.roomsSelfDefinePage.enterSelfDefine();
	}

	public void addNewTag(String RoomTag) {
		this.roomsSelfDefinePage.addNewRoomTag(RoomTag);
	}

	public void deleteNewTag(String RoomTag) {
		this.roomsSelfDefinePage.deleteTag(RoomTag);
	}

	public void delightTag(String RoomTag) {
		this.roomsSelfDefinePage.delightTag(RoomTag);
	}

	public void cancelTag(String RoomTag) {
		this.roomsSelfDefinePage.cancelTag(RoomTag);
	}

	public void save() {
		this.roomsSelfDefinePage.saveInformation();
	}

	public void checkTagSucced(String RoomTag) {
		Assert.assertThat(this.roomsSelfDefinePage.checkHaveTag(RoomTag), is(true));
	}

	public void checkTagCancelSucced(String RoomTag) {
		Assert.assertThat(this.roomsSelfDefinePage.checkHaveTag(RoomTag), is(false));
	}

}
