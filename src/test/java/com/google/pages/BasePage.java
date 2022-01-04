package com.google.pages;


import com.google.utilities.Driver;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}



