package com.google.step_definitions;

import com.google.pages.MainPage;
import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.text.DecimalFormat;

public class LoginStepDefs {
	MainPage mainPage = new MainPage();

	@Given("the user navigates to google")
	public void theUserNavigatesToGoogle() {
		Driver.get().get(ConfigurationReader.get("url"));
	}

	@When("the user search the {string} keyword")
	public void theUserSearchTheKeyword(String wordToSearch) {
		mainPage.searchInputBox.sendKeys(wordToSearch, Keys.ENTER);
	}

	@Then("the user should see search result number must be more than {int}")
	public void theUserShouldSeeSearchResultNumberMustBeMoreThan(int number) {
		String[] text = mainPage.results.getText().split(" "); 
		String s = text[1].replaceAll("\\.", "");
		long resultNumber = Long.parseLong(s);
		Assert.assertTrue(resultNumber>number);
	}
}
