package com.souban.bdd.steps.CreamsAPP;

import com.souban.bdd.steps.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreamsAPPTenantStep extends BaseStep {
    @When("^点击租客联系人搜索页的新建按钮$")
    public void 点击租客联系人搜索页的新建按钮() throws Exception {
        this.creamsAPPTenantFlow.clickNewTenant();
        this.creamsAPPTenantFlow.intoNewTenantPage();
    }

    @When("^输入租客的姓名 \"([^\"]*)\"$")
    public void 输入租客的姓名(String arg1) throws Exception {
        this.creamsAPPTenantFlow.inputTenantName(arg1);
    }

    @When("^输入租客的电话 \"([^\"]*)\"$")
    public void 输入租客的电话(String arg1) throws Exception {
        this.creamsAPPTenantFlow.inputTenantTel(arg1);
    }

    @When("^输入租客的公司 \"([^\"]*)\"$")
    public void 输入租客的公司(String arg1) throws Exception {
        this.creamsAPPTenantFlow.inputTenantCompany(arg1);
    }

    @When("^输入租客的邮箱 \"([^\"]*)\"$")
    public void 输入租客的邮箱(String arg1) throws Exception {
        this.creamsAPPTenantFlow.inputTenantEmail(arg1);
    }

    @When("^输入租客的通讯地址 \"([^\"]*)\"$")
    public void 输入租客的通讯地址(String arg1) throws Exception {
        this.creamsAPPTenantFlow.inputTenantAddress(arg1);
    }

    @When("^点击新建租客联系人页面的保存按钮$")
    public void 点击新建租客联系人页面的保存按钮() throws Exception {
        this.creamsAPPTenantFlow.clickSaveButton();
    }

    @Then("^租客联系人搜索框页上存在一个姓名和公司为 \"([^\"]*)\"的租客,租客新建成功$")
    public void 租客联系人搜索框页上存在一个姓名和公司为_的租客_租客新建成功(String arg1) throws Exception {
        this.creamsAPPTenantFlow.checkTenantName(arg1);
    }

    @Then("^电话和邮箱显示正确 \"([^\"]*)\" \"([^\"]*)\"$")
    public void 电话和邮箱显示正确(String arg1, String arg2) throws Exception {
        this.creamsAPPTenantFlow.checkTeantTel(arg1, arg2);
    }
}