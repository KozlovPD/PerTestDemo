package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI16_BuildingTagAdditionTest extends SampleTest {

    @Test
    public void tagAddition() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.getFifthBuildingAddress();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkTagBelowOtherTagsLabel();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.justCreatedTagShouldBeChecked();
        user.atTagsPage.clearTextField();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.firstExistingTagShouldBeChecked();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldSeeAddedExistingTag();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.findAndSelectJustCreatedTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.shouldSeeTaggedBuilding();
        user.atMyTagsPage.clickOnJustCreatedTagsPill();
        user.atTagsPage.findAndSelectFirstExistingTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.shouldSeeTaggedBuilding();
    }
}