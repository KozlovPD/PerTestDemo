package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ACRISClosingPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
    private WebElement dealCountByHeightButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY HEIGHT_RISE_NUM_STORIES_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private  WebElement dealCountByHeightChart;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE (BY DEAL COUNT)")
    private WebElement buildingTypeByDealCountButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY TYPE_PROPERTYTYPES_PROPERTY_TYPE_CODE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement mktShareDealCountByTypeChart;

    @iOSXCUITFindBy(accessibility = "PRICE (BY DEAL COUNT)")
    private WebElement priceByDealCountButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY SEGMENT_PRICETRANCHES_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement mktSharePriceByDealCountChart;

    @iOSXCUITFindBy(accessibility = "$/FT² PERCENTILES")
    private WebElement dollarPerFTPercentilesButton;

    @iOSXCUITFindBy(accessibility = "SALE $/FT²")
    private WebElement dollarPerFTPercentilesChart;

    @iOSXCUITFindBy(accessibility = "$/FT² BY PRICE SEGMENT")
    private WebElement dollarPerFTByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "$/SQFT BY SEGMENT_MEDIANPERPRICETRANCHE_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionDollarPerFTByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "PRICE PERCENTILES")
    private WebElement pricePercentilesButton;

    @iOSXCUITFindBy(accessibility = "SALE PRICE_PERCENTILES_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionPricePercentilesChart;

    @iOSXCUITFindBy(accessibility = "PRICE BY PRICE SEGMENT")
    private WebElement priceByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "SALE PRICE BY SEGMENT_MEDIANPERPRICETRANCHE_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionPriceByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET PERCENTILES")
    private WebElement squareFeetPercentilesButton;

    @iOSXCUITFindBy(accessibility = "PRICE BY TYPE")
    private WebElement priceByTypeButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE PRICE_MEDIANPERPROPERTYCODE_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionPriceByTypeChart;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET_PERCENTILES_GROSS_SQUARE_FEET_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionSquareFeetPercentilesChart;

    @iOSXCUITFindBy(accessibility = "DEAL VOLUME (ANNUAL)")
    private WebElement dealVolumeAnnualButton;

    @iOSXCUITFindBy(accessibility = "DEAL VOLUME (QUARTERLY)")
    private WebElement dealVolumeQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT")
    private WebElement dealCountButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT_COUNTS_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement locationDealCountChart;

    @iOSXCUITFindBy(accessibility = "PRICE")
    private WebElement priceChartButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT²")
    private WebElement pricePerFT2ChartButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE PRICE_MEDIAN_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement medianPriceChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE PRICE_BAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement locationPriceChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE $/SQFT_MEDIAN_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement medianPricePerFT2Chart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE $/SQFT_BAR_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement locationPricePerFT2Chart;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT (ANNUAL)")
    private WebElement dealCountAnnualButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT (QUARTERLY)")
    private WebElement dealCountQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "PRICE (ANNUAL)")
    private WebElement priceAnnualButton;

    @iOSXCUITFindBy(accessibility = "PRICE (QUARTERLY)")
    private WebElement priceQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT² (ANNUAL)")
    private WebElement pricePerFT2AnnualButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT² (QUARTERLY)")
    private WebElement pricePerFT2QuarterlyButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME (ANNUAL)")
    private WebElement topTenPerMKTDealVolumeAnnualButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: PRICE (ANNUAL)")
    private WebElement topTenPerMKTPriceAnnualButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: PRICE (QUARTERLY)")
    private WebElement topTenPerMKTPriceQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: PRICE PER FT² (ANNUAL)")
    private WebElement topTenPerMKTPricePerFT2AnnualButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: PRICE PER FT² (QUARTERLY)")
    private WebElement topTenPerMKTPricePerFT2QuarterlyButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: UNIT SIZE (ANNUAL)")
    private WebElement topTenPerMKTUnitSizeAnnualButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: UNIT SIZE (QUARTERLY)")
    private WebElement topTenPerMKTUnitSizeQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT_STACKEDYEARLYTRENDBARCOUNTS_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement dealCountAnnualChart;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT_STACKEDQUARTERLYTRENDBARCOUNTS_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement dealCountQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "TOTAL DEAL VOLUME_STACKEDYEARLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement dealVolumeAnnualChart;

    @iOSXCUITFindBy(accessibility = "TOTAL DEAL VOLUME_STACKEDQUARTERLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement dealVolumeQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE PRICE_YEARLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement priceAnnualChart;

    @iOSXCUITFindBy(accessibility = "QTRLY MEDIAN SALE PRICE_QUARTERLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement priceQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE $/SQFT_YEARLYTRENDBAR_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement pricePerFT2AnnualChart;

    @iOSXCUITFindBy(accessibility = "QTRLY MEDIAN SALE $/SQFT_QUARTERLYTRENDBAR_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement pricePerFT2QuarterlyChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME_TOPTENSTACKEDYEARLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTDealVolumeAnnualChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: MEDIAN PRICE_TOPTENYEARLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTPriceAnnualChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: MEDIAN PRICE_TOPTENQUARTERLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTPriceQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: MEDIAN $/SQFT_TOPTENYEARLYTRENDBAR_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTPricePerFT2AnnualChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: MEDIAN $/SQFT_TOPTENQUARTERLYTRENDBAR_GROSS_SQUARE_FEET_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTPricePerFT2QuarterlyChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: MEDIAN SIZE (SQFT)_TOPTENYEARLYTRENDBAR_GROSS_SQUARE_FEET_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTUnitSizeAnnualChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: MEDIAN SIZE (SQFT)_TOPTENQUARTERLYTRENDBAR_GROSS_SQUARE_FEET_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTUnitSizeQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
    private WebElement mktShareBuildingHeightByDealCountButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY HEIGHT_RISE_NUM_STORIES_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement mktShareBuildingHeightByDealCountChart;

    @iOSXCUITFindBy(accessibility = "$/FT² PERCENTILES")
    private WebElement distributionDollarFT2PercentilesButton;

    @iOSXCUITFindBy(accessibility = "SALE $/SQFT_PERCENTILES_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionDollarFT2PercentilesChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME (QUARTERLY)")
    private WebElement trendsTopTenPerMKTDealVolumeQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME_TOPTENSTACKEDQUARTERLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement trendsTopTenPerMKTDealVolumeQuarterlyChart;

    //endregion

    public ACRISClosingPage(WebDriver driver) {
        super(driver);
    }

    public void dealVolumeAnnualButtonClick() {
        element(dealVolumeAnnualButton).click();
    }

    public void dealVolumeQuarterlyButtonClick(){
        element(dealVolumeQuarterlyButton).click();
    }

    public void dealCountByHeightButtonClick(){
        element(dealCountByHeightButton).click();
    }

    public void buildingTypeByDealCountButtonClick() throws Exception {
        this.swipeUntilButtonShown(buildingTypeByDealCountButton);
        element(buildingTypeByDealCountButton).click();
    }

    public void isDealCountByHeightChartAdd(){
        element(dealCountByHeightChart).shouldBeVisible();
    }

    public boolean isDealCountByTypeDisplayed(){
        return Helper.isElementDisplayed(mktShareDealCountByTypeChart);
    }

    public void shouldBuildingHeightChartDisplayedWithSwipe() throws Exception {
        this.swipeUntilButtonShown(dealCountByHeightChart);
        element(dealCountByHeightChart).shouldBeVisible();
    }

    public void shouldSeeMKTShareBuildingTypeByDealCountChart() {
        element(mktShareDealCountByTypeChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePriceByDealCountChart() throws Exception {
        this.swipeUntilButtonShown(priceByDealCountButton);
        element(priceByDealCountButton).click();
        element(mktSharePriceByDealCountChart).shouldBeVisible();
    }

    public void addDollarPerFTByPriceSegmentChart(){
        element(dollarPerFTByPriceSegmentButton).click();
    }

    public void shouldSeeDistributionDollarPerFTByPriceSegmentChart(){
        element(distributionDollarPerFTByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionPricePercentilesChart() throws Exception {
        this.swipeUntilButtonShown(pricePercentilesButton);
        element(pricePercentilesButton).click();
        element(distributionPricePercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionPriceByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(priceByPriceSegmentButton);
        element(priceByPriceSegmentButton).click();
        element(distributionPriceByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionSquareFeetPercentilesChart() throws Exception {
        this.swipeUntilButtonShown(squareFeetPercentilesButton);
        element(squareFeetPercentilesButton).click();
        element(distributionSquareFeetPercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionPriceByTypeChart() throws Exception {
        this.swipeUntilButtonShown(priceByTypeButton);
        element(priceByTypeButton).click();
        element(distributionPriceByTypeChart).shouldBeVisible();
    }

    public void addDealCountChart() {
        element(dealCountButton).click();
    }

    public void shouldSeeLocationDealCountChart() {
        element(locationDealCountChart).shouldBeVisible();
    }

    public void addAndVerifyLocationPriceChart() throws Exception {
        this.swipeUntilButtonShown(priceChartButton);
        element(priceChartButton).click();
        element(locationPriceChart).shouldBeVisible();
    }

    public void addAndVerifyMedianPricePerFT2Chart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2ChartButton);
        element(pricePerFT2ChartButton).click();
        element(medianPricePerFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyLocationPricePerFT2Chart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2ChartButton);
        element(pricePerFT2ChartButton).click();
        element(locationPricePerFT2Chart).shouldBeVisible();
    }

    public void addPriceChart() {
        element(priceChartButton).click();
    }

    public void shouldSeeMedianPriceChart() {
        element(medianPriceChart).shouldBeVisible();
    }

    public void addDealCountAnnualChart() throws Exception {
        this.swipeUntilButtonShown(dealCountAnnualButton);
        element(dealCountAnnualButton).click();

    }

    public void shouldSeeDealCountAnnualChart() {
        element(dealCountAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyDealCountQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(dealCountQuarterlyButton);
        element(dealCountQuarterlyButton).click();
        element(dealCountQuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyDealVolumeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(dealVolumeAnnualButton);
        element(dealVolumeAnnualButton).click();
        element(dealVolumeAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyDealVolumeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(dealVolumeQuarterlyButton);
        element(dealVolumeQuarterlyButton).click();
        element(dealVolumeQuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyPriceAnnualChart() throws Exception {
        this.swipeUntilButtonShown(priceAnnualButton);
        element(priceAnnualButton).click();
        element(priceAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyPriceQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(priceQuarterlyButton);
        element(priceQuarterlyButton).click();
        element(priceQuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyPricePerFT2AnnualChart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2AnnualButton);
        element(pricePerFT2AnnualButton).click();
        element(pricePerFT2AnnualChart).shouldBeVisible();
    }

    public void addAndVerifyPricePerFT2QuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2QuarterlyButton);
        element(pricePerFT2QuarterlyButton).click();
        element(pricePerFT2QuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTDealVolumeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTDealVolumeAnnualButton);
        element(topTenPerMKTDealVolumeAnnualButton).click();
        element(topTenPerMKTDealVolumeAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTPriceAnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPriceAnnualButton);
        element(topTenPerMKTPriceAnnualButton).click();
        element(topTenPerMKTPriceAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTPriceQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPriceQuarterlyButton);
        element(topTenPerMKTPriceQuarterlyButton).click();
        element(topTenPerMKTPriceQuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTPricePerFT2AnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPricePerFT2AnnualButton);
        element(topTenPerMKTPricePerFT2AnnualButton).click();
        element(topTenPerMKTPricePerFT2AnnualChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTPricePerFT2QuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPricePerFT2QuarterlyButton);
        element(topTenPerMKTPricePerFT2QuarterlyButton).click();
        element(topTenPerMKTPricePerFT2QuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTUnitSizeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTUnitSizeAnnualButton);
        element(topTenPerMKTUnitSizeAnnualButton).click();
        element(topTenPerMKTUnitSizeAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTUnitSizeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTUnitSizeQuarterlyButton);
        element(topTenPerMKTUnitSizeQuarterlyButton).click();
        element(topTenPerMKTUnitSizeQuarterlyChart).shouldBeVisible();
    }

    public void addPricePerFT2AnnualChart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2AnnualButton);
        element(pricePerFT2AnnualButton).click();
    }

    public void shouldSeePricePerFT2AnnualChart() {
        element(pricePerFT2AnnualChart).shouldBeVisible();
    }

    public void addTopTenPerMKTPricePerFT2QuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPricePerFT2QuarterlyButton);
        element(topTenPerMKTPricePerFT2QuarterlyButton).click();
    }

    public void shouldSeeTopTenPerMKTPricePerFT2QuarterlyChart() {
        element(topTenPerMKTPricePerFT2QuarterlyChart).shouldBeVisible();
    }

    private void swipeUntilButtonShown(WebElement button) throws Exception {
        setImplicitTimeout(1, SECONDS);
        Helper.swipeDownUntilElementVisibleForCharButtons(button);
        resetImplicitTimeout();
    }

    public void addMKTShareBuildingHeightByDealCountChart() throws Exception {
        this.swipeUntilButtonShown(mktShareBuildingHeightByDealCountButton);
        element(mktShareBuildingHeightByDealCountButton).click();
    }

    public void shouldSeeMKTShareBuildingHeightByDealCountChart() {
        element(mktShareBuildingHeightByDealCountChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionDollarFT2PercentilesChart() throws Exception {
        this.swipeUntilButtonShown(distributionDollarFT2PercentilesButton);
        element(distributionDollarFT2PercentilesButton).click();
        element(distributionDollarFT2PercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyTrendsTopTenPerMKTDealVolumeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(trendsTopTenPerMKTDealVolumeQuarterlyButton);
        element(trendsTopTenPerMKTDealVolumeQuarterlyButton).click();
        element(trendsTopTenPerMKTDealVolumeQuarterlyChart).shouldBeVisible();
    }

    public void addMKTSharePriceByDealCountChart() throws Exception {
        this.swipeUntilButtonShown(priceByDealCountButton);
        element(priceByDealCountButton).click();
    }

    public void addDistributionDollarFT2ByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(dollarPerFTByPriceSegmentButton);
        element(dollarPerFTByPriceSegmentButton).click();
    }

    public void addDistributionPriceByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(priceByPriceSegmentButton);
        element(priceByPriceSegmentButton).click();
    }

    public void addDistributionPriceByTypeChart() throws Exception {
        this.swipeUntilButtonShown(priceByTypeButton);
        element(priceByTypeButton).click();
    }

    public void addATrendsDealCountQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(dealCountQuarterlyButton);
        element(dealCountQuarterlyButton).click();
    }

    public void addTrendsDealVolumeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(dealVolumeAnnualButton);
        element(dealVolumeAnnualButton).click();
    }

    public void addTrendsTopTenPerMKTDealVolumeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTDealVolumeAnnualButton);
        element(topTenPerMKTDealVolumeAnnualButton).click();
    }

    public void addTrendsDealVolumeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(dealVolumeQuarterlyButton);
        element(dealVolumeQuarterlyButton).click();
    }

    public void addTrendsTopTenPerMKTDealVolumeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(trendsTopTenPerMKTDealVolumeQuarterlyButton);
        element(trendsTopTenPerMKTDealVolumeQuarterlyButton).click();
    }
}
