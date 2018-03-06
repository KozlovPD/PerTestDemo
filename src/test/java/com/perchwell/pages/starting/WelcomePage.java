package com.perchwell.pages.starting;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.perchwell.pages.base.BasePage;

public class WelcomePage extends BasePage {

    public WelcomePage(WebDriver driver) {
        super (driver);
    }

    @AndroidFindBy(id="com.perchwell.perchwellapp:id/log_in" )
    @iOSXCUITFindBy(accessibility = "LOG IN")
    private WebElement loginButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeButton")
    		//accessibility = "CONNECT WITH"
    private WebElement connectWithButton;

    @iOSXCUITFindBy(accessibility = "“Perchwell Staging” Wants to Use “google.com” to Sign In")
    private WebElement useGoogleComMsg;

	@iOSXCUITFindBy(accessibility = "Continue")
	private WebElement continueButton;

	@iOSXCUITFindBy(accessibility = "FORGOT PASSWORD")
	private WebElement forgotPassword;

    public void clickConnectWith() { element(connectWithButton).click(); }

	public void clickForgotPassword() { element(forgotPassword).click(); }

    public void clickLoginButton(){
        element(loginButton).click();
    }

	public void clickContinueButton(){
		element(continueButton).click();
	}

	public WebElement getUseGoogleComMsg() {
		return useGoogleComMsg;
	}


	public boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}