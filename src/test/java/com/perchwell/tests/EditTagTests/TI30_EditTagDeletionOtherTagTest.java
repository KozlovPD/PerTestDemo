package com.perchwell.tests.EditTagTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI30_EditTagDeletionOtherTagTest extends SampleTest {

    @Test
    public void editTagDeletionOtherTag() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.swipeUpToMyTagsLabel();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.clickOnDeleteButton();
        user.atEditTagPage.confirmRemoving();
        user.atTagsPage.shouldSeeAddTagLabel();
        user.atTagsPage.checkIfJustCreatedTagIsNotVisible();
        user.atTagsPage.checkIfJustCreatedTagsPillIsNotVisible();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeJustCreatedTag();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.shouldNotSeeJustCreatedTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkIfJustCreatedTagIsNotVisible();
    }
}