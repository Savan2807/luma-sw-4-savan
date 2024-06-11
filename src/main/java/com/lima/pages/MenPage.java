package com.lima.pages;

import com.lima.utilies.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    //Locator
    public By cronusYogaPants = By.xpath("//a[normalize-space()='Cronus Yoga Pant']/parent::strong/parent::div");
    public By size32 = By.id("option-label-size-143-item-175");
    public By colourBlack = By.id("option-label-color-93-item-49");
    public By addToCartButton = By.xpath("//span[text()='Add to Cart']");
    public By addedShoppingCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public By shoppingCartLink = By.linkText("shopping cart");
    public By shoppingCartText = By.xpath("//span[@class='base']");
    public By cronusYogaPantsText = By.partialLinkText("Cronus Yoga");
    public By sizeText32 = By.xpath("//dd[contains(text(),'32')]");
    public By blackColourText = By.xpath("//dd[contains(text(),'Black')]");

    public void mouseHoverOnCronusYogaPants() {
        mouseHoverToElement(cronusYogaPants);
    }

    public void selectSize32() {
        clickOnElement(size32);
    }

    public void selectColourBlack() {
        clickOnElement(colourBlack);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String shoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    public String cronusYogaPantText() {
        return getTextFromElement(cronusYogaPantsText);
    }

    public String size32Text() {
        return getTextFromElement(sizeText32);
    }

    public String addToShoppingCartText() {
        return getTextFromElement(addedShoppingCartText);
    }

    public String colourBlackText() {
        return getTextFromElement(blackColourText);
    }

}
