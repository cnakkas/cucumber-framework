package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

	@FindBy(xpath = "//input[@title='Ara']")
	public WebElement searchInputBox;

	@FindBy(xpath = "//input[@title='Ara']")
	public WebElement results;
}
