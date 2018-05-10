package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
public class ST37_AddChartAsClientTest extends SampleTest {
    @Test
    public void addChartAsClient() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
                AppProperties.INSTANCE.getProperty("client_password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atRebnyListingsPage.addAskingPriceChartWithMKTShare();
        user.atAnalyticsPage.skipHints();
        user.atAnalyticsPage.addButtonClick();
        user.atRebnyListingsPage.addBuildingHeightChartWithMKTShare();
        user.atAnalyticsPage.isThisIsAProOnlyFeatureMessageShow();
    }
}
