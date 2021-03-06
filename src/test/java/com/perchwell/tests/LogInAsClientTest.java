package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class LogInAsClientTest extends SampleTest {

@Test
public void logInAsClient() throws Exception {

	loginSteps.loginAsClient();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.clickOpenAccountButton();
	accountSteps.shouldSeeOptionAgents();
	accountSteps.shouldSeeOptionDisscussions();
	accountSteps.shouldSeeOptionTags();
	accountSteps.shouldSeeOptionCompare();
}
}