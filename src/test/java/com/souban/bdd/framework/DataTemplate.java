package com.souban.bdd.framework;

import java.util.List;
import java.util.Map;

public abstract class DataTemplate {
	public abstract List<Map<String, String>> prepareTestData(final String methodName, List<Map<String, String>> data);

	public abstract List<Map<String, String>> prepareInputData(String methodName, List<Map<String, String>> data);

	public abstract List<Map<String, String>> prepareVerifyData(String methodName, List<Map<String, String>> data);
}
