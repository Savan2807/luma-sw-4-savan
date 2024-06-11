package com.lima.testsuite;

import com.lima.pages.HomePage;
import com.lima.pages.WomenPage;
import com.lima.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Write down the following test into WomenTestclass
 * 1. verifyTheSortByProductNameFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Product Name”
 * * Verify the products name display in
 * alphabetical order
 * 2. verifyTheSortByPriceFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click o
 */
public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHoverOnTopMenu();
        //Click on Jackets
        homePage.clickOnJacketLink();
        List<String> actualText = womenPage.storeProductNamesInAscendingOrder();
        womenPage.selectFilterSortByNames();
        Thread.sleep(1000);
        List<String> expectedText = womenPage.storeProductNamesAfterFilterName();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHoverOnTopMenu();
        //Click on Jackets
        homePage.clickOnJacketLink();
        List<Double> actualText = womenPage.storeProductsNamesByPriceInAscendingOrder();
        womenPage.selectFilterSortByPriceLowToHigh();
        Thread.sleep(1000);
        List<Double> expectedText = womenPage.storeProductsNamesByPriceAfterFilterPriceLowToHigh();
        Assert.assertEquals(actualText, expectedText);
    }
}
