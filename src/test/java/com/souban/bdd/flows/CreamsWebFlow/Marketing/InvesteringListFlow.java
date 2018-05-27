package com.souban.bdd.flows.CreamsWebFlow.Marketing;

import static org.hamcrest.core.Is.is;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Assert;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsWebPage.Marketing.InvesteringListPage;

public class InvesteringListFlow {
	private InvesteringListPage investeringlistpage = null;

	public InvesteringListFlow(Driver driver) {
		this.investeringlistpage = PageFactory.getPage(InvesteringListPage.class, driver);
	}

	public void choosebuilding() {
		this.investeringlistpage.choosebuilding();
	}

	public void clickAccesstimeByAscending() {
		this.investeringlistpage.clickAccesstimeByAscending();
	}

	public boolean checkAccesstimeByAscending(String accesstime) {// for循坏比较时间
		List<String> alltime = new ArrayList<String>();
		alltime = this.investeringlistpage.accecctimeList();
		for (int i = 0; i < alltime.size(); i++) {
			if (alltime.contains("今日")) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String s = sdf.format(new Date());
				alltime.add(s);

			} else if (alltime.contains("昨日")) {
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DATE, -1); // 得到前一天
				String s = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
				alltime.add(s);
			} else {
				alltime.addAll(alltime);
			}
		}
		String[] kk = alltime.toArray(new String[alltime.size()]);
		for (int i = 0; i < alltime.size() - 1; i++) {

			if (!(kk[i].compareTo(kk[i + 1]) > 0)) {
				return false;
			}
		}
		return true;

	}

	public void clickAccesstimeByDescending() {
		this.investeringlistpage.clickAccesstimeByDescending();
	}

	public boolean checkAccesstimeByDescending(String accesstime) {
		List<String> alltime = new ArrayList<String>();
		alltime = this.investeringlistpage.accecctimeList();
		for (int i = 0; i < alltime.size(); i++) {
			if (alltime.contains("今日")) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String s = sdf.format(new Date());
				alltime.add(s);

			} else if (alltime.contains("昨日")) {
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DATE, -1); // 得到前一天
				String s = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
				alltime.add(s);
			} else {
				alltime.addAll(alltime);
			}
		}
		String[] kk = alltime.toArray(new String[alltime.size()]);
		for (int i = 0; i < alltime.size() - 1; i++) {

			if (!(kk[i].compareTo(kk[i + 1]) > 0)) {
				return false;
			}
		}
		return true;
	}

	public void selectAccesstimeperiod(String finishdate, String startdate) {
		this.investeringlistpage.selectAccesstimeperiod(finishdate, startdate);
	}

	public boolean checkListOnAccesstimeperiod(String finishdate, String startdate) {
		List<String> alltime = new ArrayList<String>();
		for (int i = 0; i < alltime.size(); i++) {
			if (alltime.contains("今日")) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String s = sdf.format(new Date());
				alltime.add(s);

			} else if (alltime.contains("昨日")) {
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DATE, -1); // 得到前一天
				String s = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
				alltime.add(s);
			} else {
				alltime.addAll(alltime);
			}
		}
		String[] kk = alltime.toArray(new String[alltime.size()]);
		for (int i = 0; i < alltime.size(); i++) {
			String s = kk[i];
			if (!(s.compareTo(startdate) < 0 && s.compareTo(finishdate) > 0 && s.compareTo(startdate) == 0
					&& s.compareTo(finishdate) == 0)) {
				return false;
			}
		}
		return true;

	}

	public void clickIconOfChannels() {
		this.investeringlistpage.clickIconOfChannels();
	}

	public void selectChannelsName(String channelsname) {
		this.investeringlistpage.selectChannelsName(channelsname);
	}

	public boolean checkChannelsNameOnList(String channelsname) {
		List<String> channels = new ArrayList<String>();
		channels = this.investeringlistpage.channelsList();
		for (int i = 0; i < channels.size(); i++) {
			if (channels.contains(channelsname))
				return true;
		}
		return false;
	}

	public void checkSortBuildingConditions() {
		this.investeringlistpage.checkSortBuildingConditions();
	}

	public void checkForSelectName() {
		this.investeringlistpage.checkForSelectName();
	}

	public void checkForSelectChannelsName() {
		this.investeringlistpage.checkForSelectChannelsName();
	}

	public void clickDemandAreaByDescending() {
		this.investeringlistpage.clickDemandAreaByDescending();

	}

	public boolean checkDemandAreaByDescending() {
		List<String> allArea = new ArrayList<String>();
		allArea = this.investeringlistpage.demandAreaList();
		String[] k = allArea.toArray(new String[allArea.size()]);
		for (int i = 0; i < allArea.size(); i++) {
			String s[] = k[i].split("-|m");
			allArea.remove(k[i]);
			allArea.add(s[1]);

		}
		String[] kk = allArea.toArray(new String[allArea.size()]);
		for (int i = 0; i < allArea.size(); i++) {
			if (!(kk[i].compareTo(kk[i + 1]) > 0))
				return false;
		}
		return true;
	}

	public void clickDemandAreaByAscending() {
		this.investeringlistpage.clickDemandAreaByAscending();
	}

	public boolean checkDemandAreaByAscending() {
		List<String> allArea = new ArrayList<String>();
		allArea = this.investeringlistpage.demandAreaList();
		String[] k = allArea.toArray(new String[allArea.size()]);
		for (int i = 0; i < allArea.size(); i++) {
			String s[] = k[i].split("-|m");
			allArea.remove(k[i]);
			allArea.add(s[1]);
		}
		String[] kk = allArea.toArray(new String[allArea.size()]);
		for (int i = 0; i < allArea.size() - 1; i++) {
			if (!(kk[i].compareTo(kk[i + 1]) < 0))
				return false;
		}
		return true;
	}

	public void checkSelectOfBuilding() {
		Assert.assertThat(this.investeringlistpage.checkSelectOfBuilding(), is(true));
	}

	public void checkSelectOfDemandArea() {
		Assert.assertThat(this.investeringlistpage.checkSelectOfDemandArea(), is(true));
	}
}
