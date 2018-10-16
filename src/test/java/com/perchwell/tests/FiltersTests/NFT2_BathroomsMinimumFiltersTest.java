package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class NFT2_BathroomsMinimumFiltersTest extends SampleTest {

    @Test
    public void bathroomsMinimumFilters() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectOneBathMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsWereChanged();
        user.atPerchwellPage.verifyThatThereIsNoListingsWithoutBaths();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.checkIfOneBathMinimumFilterIsDeselected();
        user.atSearchPage.selectOneAndHalfBathroomsFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinimumBaths(Filters.ONE_AND_HALF_BATHS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectTwoBathsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinimumBaths(Filters.TWO_BATHS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectThreeBathsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinimumBaths(Filters.THREE_BATHS_MINIMUM_FILTER);
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectFourBathsMinimumFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMinimumBaths(Filters.FOUR_BATHS_MINIMUM_FILTER);
    }
}
