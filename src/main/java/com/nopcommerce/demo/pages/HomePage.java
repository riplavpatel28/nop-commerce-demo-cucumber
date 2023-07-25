package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement LogoutLink;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement RegisterLink;

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement RegisterText;

    public void ClickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public boolean LogoutLinkDisplayed()
    {
        return LogoutLink.isDisplayed();
    }
    public void clickOnLogoutLink(){
        clickOnElement(LogoutLink);
    }
    public boolean LogInLinkDisplayed()
    {
        return loginLink.isDisplayed();
    }
    public void clickOnRegisterLink(){
        clickOnElement(RegisterLink);
    }
    public String verifyRegisterText(String registerText){
        return getTextFromElement(RegisterText);
    }


}
