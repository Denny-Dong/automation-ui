package com.souban.bdd.flows.CreamsAPP;

import com.souban.bdd.framework.driver.Driver;
import com.souban.bdd.framework.page.PageFactory;
import com.souban.bdd.pages.CreamsAPP.ContractReviewPage;

public class ContractReviewFlow {
    private ContractReviewPage contractReviewPage= null;
    public ContractReviewFlow(final Driver driver) {
        this.contractReviewPage = PageFactory.getPage(ContractReviewPage.class, driver);
    }

}
