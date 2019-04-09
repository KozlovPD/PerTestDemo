package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "iOS_Third", "Android_Third", "Third"})
public class ST36_SendReportDetailsPDF extends SampleTest {

	@Test
	public void sendReportDetailsPDF() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnAnalytics();
		user.atRebnyListingsPage.addChartFromREBNYSection();
		user.atAnalyticsPage.skipHints();
		user.inSearchMenu.openSearchPage();
		user.atSearchPage.selectBedroomsRangeOption();
		user.atSearchPage.selectFilterStudioBeds();
		user.atSearchPage.clickOnApplyButton();
		user.atRebnyListingsPage.rebnyMKTShareAskingPriceChartTitle();
		user.atAnalyticsPage.clickOnLegend12PlusMillionButton();
		user.atAnalyticsPage.getMessageIdOfLastReportDetailEmail();
		user.atAnalyticsPage.shareButtonInChartClick();
		user.atAnalyticsPage.clickSendButton();
		user.atAnalyticsPage.shouldFindPDFSummaryEmail();
	}
}
