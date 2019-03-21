package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR60_BuildingFilterCollapseExpandTest extends SampleTest {

    @Test
    public void buildingFilterCollapseExpandTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atBuildingSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atBuildingSearchPage.clickOnFirstBuilding();
        user.atBuildingSearchPage.clickOnBackFromBuildingSearchPage();
        user.atSearchPage.collapseLocationSection();
        user.atSearchPage.checkBuildingPillIsDisplayed("240 EAST 35TH STREET");
        user.atSearchPage.expandLocationSection();
        user.atSearchPage.collapseLocationSection();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.checkBuildingPillIsDisplayed("240 EAST 35TH STREET");
    }
}
