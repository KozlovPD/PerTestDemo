package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "First"})
public class ST6_CreateNewTagForListingTest extends SampleTest {

	@Test
	public void createNewTagForListing() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickMyTagsLabel();
		tagsSteps.setRandomTagAndSave();
		tagsSteps.clickBackButton();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickTagsLabel();
		tagsSteps.shouldSeeCreatedTagUpperCase();
		tagsSteps.clickCreatedTag();
		tagsSteps.clickSearchButton();
		tagsSteps.shouldSeeCreatedTagUpperCase();
	}
}