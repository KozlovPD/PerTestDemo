package com.perchwell.tests.EditProfileTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import org.junit.Ignore;
import org.junit.Test;

@WithTag(type = "SmokeTestSuit", name = "EditProfileTests")
public class TC29_UpdateSettingsAsClient extends SampleTest {

    @Test
    public void updateSettingAsClientTest() {
        loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_test_email"),
                AppProperties.INSTANCE.getProperty("client_test_password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.openSettingsProfile();
        settingsProfileSteps.changeName();
        settingsProfileSteps.changeCompany();
        settingsProfileSteps.saveButtonClick();
        settingsProfileSteps.okButtonClick();
        settingsProfileSteps.isNameTextBoxChange();
        settingsProfileSteps.isCompanyTextBoxChange();
    }
}
