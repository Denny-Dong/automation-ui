package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsAPP.CreamsAPPForgetPwdPage;
import org.hamcrest.core.Is;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

public class CreamsAPPForgetPwdFlow {

    private CreamsAPPForgetPwdPage creamsAPPForgetPwdPage = null;

    public CreamsAPPForgetPwdFlow(final Driver driver) {
        this.creamsAPPForgetPwdPage = PageFactory.getPage(CreamsAPPForgetPwdPage.class,driver);
    }

    /**
     * 进入忘记密码页
     */
    //点击忘记密码
    public void clickForgetPwdButton(){
        this.creamsAPPForgetPwdPage.clickForgetPwdButton();
    }

    //进入忘记密码页
    public void intoForgetPwdPage(){
        Assert.assertThat(this.creamsAPPForgetPwdPage.intoForgetPwdPage(),is(true));
    }

    //检查忘记密码页的字段
    public void checkKey(String phone, String email){
        String info = this.creamsAPPForgetPwdPage.checkKey();
        String[] actualInfo = info.split(",");
        Assert.assertThat(actualInfo[0], Is.is(phone));
        Assert.assertThat(actualInfo[1], Is.is(email));
    }



    /**
     * 检查通过手机找回密码的页面元素
     */



    /**
     * 检查通过邮箱找回密码的元素
     */
}
