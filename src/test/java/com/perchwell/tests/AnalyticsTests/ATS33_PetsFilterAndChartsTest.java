package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class ATS33_PetsFilterAndChartsTest extends SampleTest {

    @Test
    public void petsFilterAndChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnPetsFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addMKTSHarePetsChart();
        user.atAnalyticsPage.skipHints();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addFeaturesPetsChart();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
    }
}