package com.souban.bdd.steps;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.AfterClass;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.souban.bdd.framework.Config;

import io.restassured.http.ContentType;

public class JunitHooks {

	private static Config config = Config.getInstance();

	@AfterClass
	public static void tearDownAfterClass() throws IOException {
		uploadCucumberReport(JunitHooks.config.get("jira.uploadFlag"));
	}

	private static void uploadCucumberReport(String booleanFlag) throws IOException {
		if (booleanFlag.equals("true")) {
			File Jsonfile = new File("target/cucumberReport/json/cucumber-report.json");
			if (Jsonfile.exists()) {
				jsonObjectProducer(Jsonfile);
			} else {
				System.out.println("Jsonfile Not exist");
			}
		} else {

		}
	}

	private static void restAPIPostResult(String string) throws IOException {
		given().log().ifValidationFails().contentType(ContentType.JSON).body(string).auth().preemptive()
				.basic(JunitHooks.config.get("jira.username"), JunitHooks.config.get("jira.password")).when()
				.post("https://jira.souban.io/rest/raven/1.0/import/execution/cucumber").then().log()
				.ifValidationFails().statusCode(200);

	}

	public static JsonArray jsonObjectProducer(File Jsonfile) {
		JsonArray jsonArray = new JsonArray();
		try {
			JsonParser jsonParser = new JsonParser();
			JsonElement jsonElement = jsonParser.parse(new FileReader(Jsonfile));
			jsonArray = jsonElement.getAsJsonArray();
			restAPIPostResult(jsonArray.toString());
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonArray;
	}

}
