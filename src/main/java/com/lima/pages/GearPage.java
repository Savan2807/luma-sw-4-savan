package com.lima.pages;

import com.lima.utilies.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    //Locator
    public By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    public By overNightDuffleText = By.xpath("//span[@class='base']");
    public By qty = By.id("qty");
    public By addToCartButton = By.id("product-addtocart-button");
    public By addedShoppingCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public By shoppingCartLink = By.linkText("shopping cart");
    public By overnightDufText = By.partialLinkText("Overnight Duf");
    public By qty3Text = By.xpath("//input[@class='input-text qty']");
    public By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    public By qtyBox = By.xpath("//input[@class='input-text qty']");
    public By updatedShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    public By updatedPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");

    public void clickOnOvernightDuffle() {
        clickOnElement(overnightDuffle);
    }

    public String getOverNightDuffleText() {
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQtyTo3() {
        driver.findElement(qty).clear();
        sendTextToElement(qty, "3");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getAddToShoppingCartText() {
        return getTextFromElement(addedShoppingCartText);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    public String getOverNightDufText() {
        return getTextFromElement(overnightDufText);
    }

    public String getAttributeForQty3() {
        return driver.findElement(qty3Text).getAttribute("value");
    }

    public String getProductPrice() {
        return getTextFromElement(productPrice);
    }

    public void changeQtyTo5() {
        driver.findElement(qtyBox).clear();
        sendTextToElement(qtyBox, "5");
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(updatedShoppingCart);
    }

    public String getUpdatedPrice() {
        return getTextFromElement(updatedPrice);
    }
}