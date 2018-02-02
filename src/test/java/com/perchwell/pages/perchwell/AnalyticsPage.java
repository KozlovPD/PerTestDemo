package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapAttachment;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AnalyticsPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS")
    private WebElement rebnyListingsButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE")
    private WebElement askingPriceButton;

    @iOSXCUITFindBy(accessibility = "BEDROOMS")
    private WebElement bedroomsButton;

    @iOSXCUITFindBy(accessibility = "plus white")
    private WebElement plusWhiteButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS")
    private WebElement acrisClosingsButton;

    @iOSXCUITFindBy(accessibility = "MY NEW SEARCH")
	private WebElement myNewSearch;

	@iOSXCUITFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
    private  WebElement dealCountByHeightButton;

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT")
    private  WebElement buildingHeightButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY HEIGHT")
    private  WebElement dealCountByHeightChart;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE (BY DEAL COUNT)")
    private  WebElement buildingTypeButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY TYPE")
    private  WebElement dealCountByTypeChart;

    @iOSXCUITFindBy(accessibility = "NYC TOWNHOUSES")
    private  WebElement nycTownhousesButton;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE")
    private  WebElement domByPriceButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY PRICE")
    private  WebElement dealCountByPriceButton;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT")
    private  WebElement managementButton;

    @iOSXCUITFindBy(accessibility = "DAYS ON MARKET")
    private  WebElement daysOnMarketButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[3]")
    private  WebElement deleteChartButton;

    @iOSXCUITFindBy(accessibility = "DONE MOVING CHARTS")
    private WebElement doneMovingChartsButton;

    @iOSXCUITFindBy(accessibility = "MAXIMUM 6 CHARTS ALLOWED")
    private WebElement maximumSixChartMessage;

    @iOSXCUITFindBy(accessibility = "DON'T FORGET... THE SAME SEARCH APPLIES HERE TOO. CHARTS ALWAYS REFLECT YOUR FILTERS")
    private WebElement dontForgetHint;

    @iOSXCUITFindBy(accessibility = "TAP ANY CHART TO ACCESS DETAILED DATA COMPRISING IT")
    private WebElement tapAnyChartHint;

    @iOSXCUITFindBy(accessibility = "PRESS AND HOLD ANY CHART TO REARRANGE OR DELETE")
    private WebElement pressAndHoldHint;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okButton;

    @iOSXCUITFindBy(accessibility = "MKT SHARE")
    private WebElement mktShareButton;

    @iOSXCUITFindBy(accessibility = "THIS IS A PRO-ONLY FEATURE")
    private WebElement thisIsAProOnlyFeatureMessage;

    @iOSXCUITFindBy(accessibility = "UP TO $1M")
    private WebElement upToOneMillionButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
	private WebElement firstBuildingInList;


	@iOSXCUITFindBy(accessibility = "generic_text_input_field")
	private WebElement nameThisReport;


	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement reportSentOkButton;

	@iOSXCUITFindBy(accessibility = "SAVE")
	private WebElement saveButton;

	@iOSXCUITFindBy(accessibility = "MY EMAIL")
	private WebElement myEmailOption;

	@iOSXCUITFindBy(accessibility = "CLIENT")
	private WebElement clientOption;


	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[1]")
	private WebElement buildingTable;
	//endregion

	@iOSXCUITFindBy(accessibility = "BEDROOM COUNT")
	private WebElement bedroomChart;


	@iOSXCUITFindBy(accessibility = "BUILDING TYPE")
	private WebElement buildingTypeChart;

	@iOSXCUITFindBy(accessibility = "DOM BY PRICE2")
	private WebElement domByPrice2Chart;

	@iOSXCUITFindBy(accessibility = "share")
	private WebElement shareButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    private List<WebElement> valueChartList;

	@iOSXCUITFindBy(accessibility = "SEND")
	private WebElement sendButton;

	@iOSXCUITFindBy(accessibility = "$12M+")
	private WebElement upTo12MillionButton;

	public AnalyticsPage(WebDriver driver){
        super(driver);
    }

    public void holdCharts(){
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		TouchAction action = new TouchAction(appiumDriver);
        action.longPress(dealCountByTypeChart).release().perform();
    }

    public void deleteChart(){
        element(deleteChartButton).click();
    }

    public boolean isAddIconDisplayed(){
       return element(plusWhiteButton).isDisplayed();
    }

    public void doneMovingChartsButtonClick(){
        element(doneMovingChartsButton).click();
    }

    public void rebnyListingsButtonClick(){
        element(rebnyListingsButton).click();
    }

    public void addButtonClick(){
        element(plusWhiteButton).click();
    }

    public void dealCountByHeightButtonClick(){
        element(dealCountByHeightButton).click();
    }

    public void domByPriceButtonClick(){
        element(domByPriceButton).click();
    }

    public void nycTownHousesButtonClick(){
        element(nycTownhousesButton).click();
    }

    public void managementButtonClick(){
        element(managementButton).click();
    }

    public void daysOnMarketButtonClick(){
        element(daysOnMarketButton).click();
    }

    public void bedroomsButtonClick(){
        element(bedroomsButton).click();
    }

    public void acrisClosingsButtonClick(){
        element(acrisClosingsButton).click();
    }

    public void buildingTypeButtonClick(){
        element(buildingTypeButton).click();
    }

    public boolean isMessageMaximumSixChartsDisplayed(){
        element(plusWhiteButton).click();
        return element(maximumSixChartMessage).isDisplayed();
    }

    public void skipHints(){
        element(dontForgetHint).click();
        element(tapAnyChartHint).click();
        element(pressAndHoldHint).click();
    }

    public boolean isAskingPriseChartAdd(){
        return element(askingPriceButton).isDisplayed();
    }

    public boolean isBuildingHeightCartAdd(){
        return element(dealCountByHeightChart).isDisplayed();
    }

    public boolean isDomByPriceCartAdd(){
        return element(domByPrice2Chart).isDisplayed();
    }

    public boolean isDaysOnMarketAdd(){
        return element(daysOnMarketButton).isDisplayed();
    }

    public boolean isDealCountByTypeDisplayed(){
        return Helper.isElementDisplayed(dealCountByTypeChart);
    }

    public void okButtonClick(){
        element(okButton).click();
    }

    public boolean isThisIsAProOnlyFeatureMessageShow(){
        return element(thisIsAProOnlyFeatureMessage).isDisplayed();
    }

    public void buildingHeightButton(){
        element(buildingHeightButton).click();
    }

    public void mktShareButtonClick(){
        element(mktShareButton).click();
    }

    public void askingPriceChartClick(){
        element(askingPriceButton).click();
    }

    public void upToOneMillionButtonClick(){
        element(upToOneMillionButton).click();
    }

    public void selectFirstBuildingInList(){
        element(firstBuildingInList).click();
    }

	public void clickReportSentOkButton() {
		reportSentOkButton.click();
	}

	public void addValueInSessionVariable(String name, String value) {
		Serenity.setSessionVariable(name).to(value);
	}

	public String getValueFromSessionVariable(String name) {
		return Serenity.sessionVariableCalled(name);
	}

	public void setValueSessionVariable(String name,String value){
	    Serenity.setSessionVariable(name).to(value);
    }

	public void clickSaveButton() {
		element(saveButton).click();
	}

	public void setReportName(String reportName) {
		element(nameThisReport).sendKeys(reportName);
	}

	public Boolean shouldFindSentEmail(String report_name) {
		//Waiting while report was sent
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Get last emails with HEADER_ANALYTICS
		MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(AppProperties.INSTANCE.getProperty("HEADER_ANALYTICS"));
		Boolean reportWasFound = false;
		report_name = report_name + ".pdf";
		//Get attachments
		MailTrapAttachment[] mailTrapAttachment = MailTrap.getMassageAttachment(mailTrapResponse[0].getId());
		//Find attachments with REPORT_NAME
		for (MailTrapAttachment my_attachment : mailTrapAttachment) {
			if (my_attachment.getFilename().equalsIgnoreCase(report_name)) {
				reportWasFound = true;
				break;
			}
		}
		return reportWasFound;
	}
	public void clickMyNewSearch() {
		element(myNewSearch).click();
	}

	public void clickMyEmailOption() {
		element(myEmailOption).click();
	}

	public void selectSecondBuildingInList(){
		element(buildingTable).findElement(By.className("XCUIElementTypeCell")).click();

	}
	public void shareButtonClick(){
		element(shareButton).click();

	}
	public void clickClientEmailOption() {
		element(clientOption).click();
	}


	public boolean isBuildingHeightCartDisplayedWithSwipe() {
		Helper.scrollToElement(dealCountByHeightChart);
		return element(dealCountByHeightChart).isDisplayed();
	}

	public boolean isDomByPriceCartDisplayed() {
		Helper.scrollToElement(bedroomChart);
		return element(bedroomChart).isDisplayed();
	}

	public boolean isDaysOnMarketDisplayedWithSwipe() throws Exception {
		Helper.swipeDownUntilElementVisible(daysOnMarketButton);
		//Helper.scrollToElement(daysOnMarketButton);
		return element(daysOnMarketButton).isDisplayed();
	}

	public boolean isBuildingTypeDisplayed() {
		return element(dealCountByTypeChart).isDisplayed();
	}

	public boolean shouldSeeAscingPriceChartWithSwipe() throws Exception {
		Helper.swipeDownUntilElementVisible(askingPriceButton);
		//	Helper.scrollToElement(askingPriceButton);
		return element(askingPriceButton).isDisplayed();

	}
	public boolean isDomByPrice2DisplayedWithSwipe() {
		Helper.scrollToElement(domByPrice2Chart);
		return element(domByPrice2Chart).isDisplayed();
	}

	public boolean isAskingPriseChartDisplayed() {
		Helper.scrollToElement(askingPriceButton);
		return element(askingPriceButton).isDisplayed();
	}

	public String getValueBedroomsChart(){
	    Helper.scrollToElement(valueChartList.get(0));
	  return element(valueChartList.get(0)).getText();
    }

    public String getValueAskingPriceChart(){
        Helper.scrollToElement(valueChartList.get(1));
	    return element(valueChartList.get(1)).getText();
    }

	public void clickSendButton() {
			element(sendButton).click();
	}

	public boolean shouldFindPDFSummaryEmail() {
		//Waiting while report was sent
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Get last emails with HEADER_ANALYTICS
		MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(AppProperties.INSTANCE.getProperty("HEADER_ANALYTICS"));
		Boolean reportWasFound = false;

		//Don't check report name - the report may not be
		//String report_name = AppProperties.INSTANCE.getProperty("PDF_analitics_report") + ".pdf";

		for (MailTrapResponse my_responce : mailTrapResponse) {
			if (my_responce.getTo_email().equalsIgnoreCase(AppProperties.INSTANCE.getProperty("email"))) {
				reportWasFound = true;
				break;
			}
		}
		return reportWasFound;
	}

	public void upTo12MillionButtonClick() {
		element(upToOneMillionButton).click();
	}
}