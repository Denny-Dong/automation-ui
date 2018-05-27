package com.souban.bdd.pages.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.ParentPage;
import com.souban.bdd.framework.page.UIElement;

public class CreamsAPPForgetPwdPage extends ParentPage {

    public CreamsAPPForgetPwdPage(Driver driver){
        super(driver);
    }

    //忘记密码入口
    private UIElement TXT_forgetPwd = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/forgetPwdTv' and @text='忘记密码?']",
            "xpath=//XCUIElementTypeButton[@name='忘记密码？']");
    //忘记密码页
    private UIElement TXT_forgetPwdPage = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='忘记密码']",
            "xpath=//XCUIElementTypeOther[@name='忘记密码']");
    //通过原手机号验证
    private UIElement TXT_verifyPhone = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/verifyPhoneTv']",
            "xpath=//XCUIElementTypeStaticText[@name='通过原手机号验证']");
    //通过邮箱验证
    private UIElement TXT_verifyEmail = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/verifyEmailTv']",
            "xpath=//XCUIElementTypeStaticText[@name='通过邮箱验证']");
    //返回按钮
    private UIElement TXT_back = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/toolbar_title' and @text='忘记密码']/preceding-sibling::android.widget.ImageButton[1]",
            "xpath=//XCUIElementTypeButton[@name='App NavigationItem Back']");


    //通过手机号找回密码页面
    private UIElement TXT_verifyPhonePage = new UIElement(
            "xpath=//*[@text='密码规则：8-20位字母与数字的组合，必须包含大小写']",
            "");
    private UIElement INP_phoneNum = new UIElement(
            "xpath=//*[@resouce-id='com.souban.creams.debug:id/mobileEt']",
            "");
    private UIElement INP_verifyCode = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/verifyCodeEt']",
            "");
    private UIElement INP_newPwd = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/newPwdEt']",
            "");
    //通过邮箱找回密码页面
    private UIElement TXTverifyEmailPage = new UIElement(
            "xpath=//*[@text='请输入绑定账号邮箱获取修改密码链接']",
            "");
    private UIElement INP_email = new UIElement(
            "xpath=//*[@resource-id='com.souban.creams.debug:id/emailEt']",
            "");



    /**
     * 进入忘记密码页
     */
    //点击忘记密码
    public void clickForgetPwdButton(){
        this.driver.waitAndClick(TXT_forgetPwd,2);
    }

    //进入忘记密码页
    public boolean intoForgetPwdPage(){
        return this.driver.waitForElement(TXT_forgetPwdPage,2);
    }

    //检查忘记密码页的字段
    public String checkKey(){
        return this.driver.elementGetText(TXT_verifyPhone)+","+this.driver.elementGetText(TXT_verifyEmail);
    }


}
