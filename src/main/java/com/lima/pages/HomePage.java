package com.lima.pages;

import com.lima.utilies.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    // Locator
    By womenMenuLink = By.xpath("//span[normalize-space()='Women']");
    By topMenu = By.id("ui-id-9");
    By jacketsLink = By.id("ui-id-11");
    By menMenu = By.id("ui-id-5");
    By bottoms = By.id("ui-id-18");
    By pantsLink = By.id("ui-id-23");
    By gearMenu = By.id("ui-id-6");
    By bags = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenuLink);
    }

    public void mouseHoverOnTopMenu() {
        mouseHoverToElement(topMenu);
    }

    public void clickOnJacketLink() {
        clickOnElement(jacketsLink);
    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomMenu() {
        mouseHoverToElement(bottoms);
    }

    public void clickOnPantsLink() {
        clickOnElement(pantsLink);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBagsLink() {
        clickOnElement(bags);
    }
}