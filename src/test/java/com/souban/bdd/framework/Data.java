package com.souban.bdd.framework;

import org.apache.commons.lang3.StringUtils;


public class Data {
	private DataTemplate data = null;
    private Config config = Config.getInstance();
    private String dataMode = this.config.get("data.mode");
    
    public Data() {
        if (StringUtils.isBlank(this.dataMode) || this.dataMode.equalsIgnoreCase("moco")) {
            this.data = new MocoData();
        } else {
            this.data = new E2EData();
        }
    }
}
