package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsAPP.CreamsAPPArchivalContractPage;

public class CreamsAPPArchivalContractFlow {
    private CreamsAPPArchivalContractPage creamsAPPArchivalContractPage = null;

    public CreamsAPPArchivalContractFlow(final Driver driver) {
        this.creamsAPPArchivalContractPage = PageFactory.getPage(CreamsAPPArchivalContractPage.class, driver);
    }
}
