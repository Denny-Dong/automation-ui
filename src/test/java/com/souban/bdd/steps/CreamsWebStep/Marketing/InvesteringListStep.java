package com.souban.bdd.steps.CreamsWebStep.Marketing;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvesteringListStep extends BaseStep {
	@Given("^左侧楼宇在选择两个楼宇的情况下，用户进入portfolio的招商列表页$")
	public void 左侧楼宇在选择两个楼宇的情况下_用户进入portfolio的招商列表页() throws Throwable {
		this.investeringListFlow.choosebuilding();
	}

	@When("^点击来访时间升序并检查列表$")
	public void 点击来访时间升序并检查列表() throws Throwable {
		this.investeringListFlow.clickAccesstimeByAscending();
		this.investeringListFlow.checkAccesstimeByAscending(null);

	}

	@When("^点击来访时间降序并检查列表$")
	public void 点击来访时间降序并检查列表() throws Throwable {
		this.investeringListFlow.clickAccesstimeByDescending();
		this.investeringListFlow.checkAccesstimeByDescending(null);
	}

	@When("^点击选择来访时间旁边的筛选时间按钮按钮相对应的时间 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 点击选择来访时间旁边的筛选时间按钮按钮相对应的时间(String arg1, String arg2) throws Throwable {
		this.investeringListFlow.selectAccesstimeperiod(arg1, arg2);
	}

	@Then("^来访时间的排序显示在这一时间段内的来访时间 \"([^\"]*)\" \"([^\"]*)\"$")
	public void 来访时间的排序显示在这一时间段内的来访时间(String arg1, String arg2) throws Throwable {
		this.investeringListFlow.checkListOnAccesstimeperiod(arg1, arg2);
	}

	@When("^点击渠道筛选按钮$")
	public void 点击渠道筛选按钮() throws Throwable {
		this.investeringListFlow.clickIconOfChannels();
	}

	@Then("^选择筛选条件 \"([^\"]*)\"$")
	public void 选择筛选条件(String arg1) throws Throwable {
		this.investeringListFlow.selectChannelsName(arg1);
	}

	@Then("^列表数据展示效果为筛选结果展示效果 \"([^\"]*)\"$")
	public void 列表数据展示效果为筛选结果展示效果(String arg1) throws Throwable {
		this.investeringListFlow.checkChannelsNameOnList(arg1);
	}

	@Then("^在筛选条件处显示“选择大楼：某某大楼/选择大楼：某某大楼/排序：渠道”$")
	public void 在筛选条件处显示_选择大楼_某某大楼_选择大楼_某某大楼_排序_渠道() throws Throwable {
		this.investeringListFlow.checkSortBuildingConditions();
		this.investeringListFlow.checkForSelectName();
		this.investeringListFlow.checkForSelectChannelsName();
	}

	@When("^点击需求面积段从大到小排序按钮$")
	public void 点击需求面积段从大到小排序按钮() throws Throwable {
		this.investeringListFlow.clickDemandAreaByDescending();
	}

	@When("^需求列表根据从大到小排列$")
	public void 需求列表根据从大到小排列() throws Throwable {
		this.investeringListFlow.checkDemandAreaByDescending();
	}

	@When("^点击需求面积段从小到大排序按钮$")
	public void 点击需求面积段从小到大排序按钮() throws Throwable {
		this.investeringListFlow.clickDemandAreaByAscending();
	}

	@When("^需求列表根据从小到大排列$")
	public void 需求列表根据从小到大排列() throws Throwable {
		this.investeringListFlow.checkDemandAreaByAscending();
	}

	@Then("^在筛选条件处显示“选择大楼：某某大楼/选择大楼：某某大楼/排序：需求面积段”$")
	public void 在筛选条件处显示_选择大楼_某某大楼_选择大楼_某某大楼_排序_需求面积段() throws Throwable {
		this.investeringListFlow.checkSelectOfBuilding();
		this.investeringListFlow.checkSelectOfDemandArea();
	}

}
