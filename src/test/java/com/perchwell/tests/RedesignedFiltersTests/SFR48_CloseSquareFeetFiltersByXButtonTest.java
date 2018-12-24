package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR48_CloseSquareFeetFiltersByXButtonTest extends SampleTest {

    @Test
    public void closeSquareFeetFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setSquareFeetMinFilter("100");
        user.atSearchPage.setSquareFeetMaxFilter("300");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setSquareFeetMinFilter("100");
        user.atSearchPage.setSquareFeetMaxFilter("300");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkIfFieldIsFilledByCorrectValue(Filters.SQUARE_FEET_MIN_VALUE, "100");
        user.atSearchPage.checkIfFieldIsFilledByCorrectValue(Filters.SQUARE_FEET_MAX_VALUE, "300");
        user.atSearchPage.clearSquareFeetMinFilter();
        user.atSearchPage.clearSquareFeetMaxFilter();
        user.atSearchPage.setSquareFeetMinFilter("300");
        user.atSearchPage.setSquareFeetMaxFilter("600");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clearSquareFeetMinFilter();
        user.atSearchPage.clearSquareFeetMaxFilter();
        user.atSearchPage.setSquareFeetMinFilter("300");
        user.atSearchPage.setSquareFeetMaxFilter("600");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
    }
}