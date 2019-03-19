package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR59_BuildingFilterSaveSearchAndReopen extends SampleTest {

    @Test
    public void buildingFilterSaveSearchAndReopen() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnFirstBuilding();
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.saveCurrentSearch();
        user.atPerchwellPage.checkFilterIsApplied();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.createNewSearchClick();
        user.atPerchwellPage.checkIfListingsWereNotChanged();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.checkFilterIsApplied();
        user.inSearchMenu.openSearchPage();
//        user.atSearchPage.checkBuildingPillIsDisplayedAtSearchPage("240 EAST 35TH ST.");
//        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.checkBuildingPillIsDisplayedAtBuildingSearchPage("240 EAST 35TH ST.");




    }
}
