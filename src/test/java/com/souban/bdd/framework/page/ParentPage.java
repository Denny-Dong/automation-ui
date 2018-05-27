package com.souban.bdd.framework.page;

import com.souban.bdd.framework.Config;
import com.souban.bdd.framework.driver.Driver;

public class ParentPage {
	
    protected Driver driver = null;
    protected Config config = null;

	public ParentPage(final Driver driver) {
		this.driver = driver;
        this.config = Config.getInstance();
	}
	
	protected void forceWaitting(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
