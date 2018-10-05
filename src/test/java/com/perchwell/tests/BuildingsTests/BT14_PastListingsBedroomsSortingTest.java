package com.perchwell.tests.BuildingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "Buildings"})
public class BT14_PastListingsBedroomsSortingTest extends SampleTest {

    @Test
    public void pastListingsBedroomsSorting() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.fixListingsSearchField();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.clickOnPastListingsSection();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnSortByBedroomsButton();
        user.atPerchwellPage.shouldListingBeSortedByBedroomsInBuilding();
        user.atOpenedBuildingPage.clickOnCurrentListingsSection();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.bedroomsSortButtonShouldBeEnabled();
        user.atOpenedBuildingPage.closeSortWindow();
        user.atPerchwellPage.shouldListingBeSortedByBedroomsInBuilding();
        user.atOpenedBuildingPage.clickOnPastListingsSection();
        user.atPerchwellPage.shouldListingBeSortedByBedroomsInBuilding();
    }
}
