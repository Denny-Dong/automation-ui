package com.souban.bdd.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;

public class CucumberData {
	public String getDataFromDataTableByCell(final DataTable data, final String rowName, final int rowCount) {
        return data.asMaps(String.class, String.class).get(rowCount).get(rowName);
    }

    public String returnFirstRowDataFromDataTable(final DataTable data, final String rowName) {
        return getDataFromDataTableByCell(data, rowName, 0);
    }

    public List<String> returnDataFromDataTableByRowName(final DataTable data, final String rowName) {
        List<String> dataValues = new ArrayList<String>();

        List<Map<String, String>> dataMap = data.asMaps(String.class, String.class);
        int rowCount = dataMap.size();
        for (int index = 0; index < rowCount; index++) {
            dataValues.add(getDataFromDataTableByCell(data, rowName, index));
        }
        return dataValues;
    }

    public List<Map<String, String>> returnDataTableDatas(final DataTable data) {
        return data.asMaps(String.class, String.class);
    }
}
