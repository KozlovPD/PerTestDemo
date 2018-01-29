package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Ignore;
import org.junit.Test;

public class TC15_ApplyingLocationFilterTest extends SampleTest {


@Ignore
	@Test
public void resultAfterApplyingLocationFilter() throws Exception {
	loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
			AppProperties.INSTANCE.getProperty("password"));
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.countItemsInListViewBeforApplyingFilter();
    perchwellSteps.clickMyNewSearch();
   // searchSteps.clickDeleteFirstLocation();
	searchSteps.clickDeleteSecondLocation();
	searchSteps.clickApplyButton();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.shoudSeeNoLessItemsInListViewAfterDeleteFilter();
	perchwellSteps.clickMap();
	mapSteps.clickNotNowButton();
	mapSteps.countItemsInMapView();
	mapSteps.itemsInListAndMapViewIsSame();

}
}
