package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "First"})
public class ST9_DeleteCreatedTagTest extends SampleTest {

	@Test
	public void deleteCreatedTag() throws Exception {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickMyTagsLabel();
		tagsSteps.setRandomTagAndSave();
		tagsSteps.clickOnBackButton();
		openedBuildingSteps.ckickDeleteTagButton();
		tagsSteps.shouldNotSeeCreatedTagUpperCase();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.clickOnOpenAccountButton();
		accountSteps.clickOnTagsLabel();
		tagsSteps.shouldNotSeeCreatedTagUpperCase();
	}
}