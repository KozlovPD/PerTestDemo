package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
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
		user.atRebnyListingsPage.addMedianOrLocationPriceChart();
		user.atAnalyticsPage.upTo12MillionButtonClick();
		user.atAnalyticsPage.shareButtonClick();
		user.atAnalyticsPage.clickSendButton();
		user.atAnalyticsPage.shouldFindPDFSummaryEmail();
	}
}
