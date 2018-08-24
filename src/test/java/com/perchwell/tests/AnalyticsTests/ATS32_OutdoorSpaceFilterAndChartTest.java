package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "ThirdAdditionalAnalytics"})
public class ATS32_OutdoorSpaceFilterAndChartTest extends SampleTest {

    @Test
    public void outdoorSpaceFilterAndChartTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectOutdoorSpaceFilter();
                user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnAnalytics();

        user.atAnalyticsPage.selectREBNYListingsSection();
        user.atRebnyListingsPage.addMKTShareOutdoorSpaceChart();
        user.atAnalyticsPage.skipHints();
        //        checkOnlyOnlyOneValueInDonutIsShown(); //TODO

        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addFeaturesOutdoorSpaceChart();
        //        checkOnlyOnlyOneColumnOutdoorIsShown(); //TODO
    }
}
