package com.perchwell.tests.BuildingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "BuildingsTests"})
public class LB18_CurrentListingSearchByStatusTest extends SampleTest {

    @Test
    public void currentListingSearchByStatus() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openAddressSearch(); //search new
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.fixListingsSearchField();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.getBedsAndBathsListingsAmount();
        user.atOpenedBuildingPage.fillInSearchFieldByFilter(Filters.ACTIVE_FILTER);
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByActiveStatus();
        user.atOpenedBuildingPage.clickOnClearFieldButton();
        user.atOpenedBuildingPage.fillInSearchFieldByFilter(Filters.IN_CONTRACT_FILTER);
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByInContractStatus();
        user.atOpenedBuildingPage.clickOnPastListingsSection();
        user.atOpenedBuildingPage.checkIfSearchFieldIsFilledByFilter(Filters.IN_CONTRACT_FILTER);
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByInContractStatusWithoutLabel();
        user.atOpenedBuildingPage.clickOnCurrentListingsSection();
        user.atOpenedBuildingPage.clickOnClearFieldButton();
        user.atOpenedBuildingPage.checkIfListingReturnedToInitialState();
    }
}
