package com.perchwell.tests.ListingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "Listings"})
public class LT1_SimilarListingsSearchByBedroomsTest extends SampleTest {

    @Test
    public void similarListingsSearchByBedroomsTest(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atPerchwellPage.swipeToTheSimilarListings();
        user.atPerchwellPage.clickOnTestListing();
        user.atPerchwellPage.skipDiscussWithClientHint();
        user.atPerchwellPage.swipeToTheSimilarListings();
        user.atPerchwellPage.getBedsAndBathsListingsAmount();
        user.atPerchwellPage.fillInSearchFieldByFilter(Filters.TWO_BEDS_FILTER);
        user.atPerchwellPage.checkIfListingsAreFilteredByBeds();
        user.atPerchwellPage.clickOnClearFieldButton();
        user.atPerchwellPage.checkIfListingReturnedToInitialState();
    }
}
