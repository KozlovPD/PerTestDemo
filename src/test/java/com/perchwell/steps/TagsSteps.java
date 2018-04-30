package com.perchwell.steps;

import com.perchwell.entity.Tag;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.tags.TagsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TagsSteps extends ScenarioSteps {

	Tag tag = new Tag();
	TagsPage onPage;

	@Step
	public void setRandomTagAndSave() {
		tag.setUniqueTagName(RandomGenerator.getRandomString("TAGNAME"));
		this.onPage.setUniqueSearchTagTextBox(tag.getUniqueTagName());
		this.onPage.clickOnCreateTagLabel();
	}

	@Step
	public void shouldNotSeeCreatedTagUpperCase() {
		Assert.assertFalse(onPage.isTagDisplayed(tag.getUniqueTagName().toUpperCase()));
	}

	@Step
	public void shouldSeeCreatedTagUpperCase() throws Exception {
		Assert.assertTrue(onPage.isTagDisplayedWithSwipe(tag.getUniqueTagName().toUpperCase()));
	}

	@Step
	public void clickOnCreatedTag() {
		onPage.clickOnTagLabel(tag.getUniqueTagName());
	}

	@Step
	public void clickOnUsedTag() {
		onPage.clickOnTagLabel(tag.getExistingTagName());
	}

	@Step
	public void clickOnBackButton() {
		onPage.clickOnBackButton();
	}

	@Step
	public void clickOnSearchButton() {
		onPage.clickOnSearchButton();
	}

	@Step
	public void clickOnExistingTagLabel() {
		WebElement element = onPage.findExistingTagLabel();
		if (element == null) {
			this.setRandomTagAndSave();
			this.onPage.clickOnCreateTagLabel();
			element = onPage.findExistingTagLabel();
		}
		element.click();
		tag.setExistingTagName(element.getAttribute("name"));
	}

	@Step
	public void shouldSeeExistingTagUpperCase() throws Exception {
		Assert.assertTrue(onPage.isTagDisplayedWithSwipe(tag.getExistingTagName().toUpperCase()));
	}
}
