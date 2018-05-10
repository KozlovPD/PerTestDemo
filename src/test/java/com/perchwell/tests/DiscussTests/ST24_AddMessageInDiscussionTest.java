package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Second"})
public class ST24_AddMessageInDiscussionTest extends SampleTest {

	@Test
	public void addMessageInDiscussionTest() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.usingComplexSteps.startShareAndDiscussWithMyClientOptionForFirstBuilding();
		user.usingComplexSteps.sendMessageToClientAndCloseDiscussion(DiscussionMessages.HELLO);
		user.atOpenedBuildingPage.openExistingDiscussion();
		user.atDiscussionPage.sendMessage(DiscussionMessages.LETS_START_DISCUSSION);
		user.atDiscussionPage.shouldSeeMessageInDiscussion();
	}
}
