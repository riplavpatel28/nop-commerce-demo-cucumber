package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//img[@title='Show details for Build your own computer']")
    WebElement buildYourOwnComputer;
    @FindBy(id = "product_attribute_1")
    WebElement Processor;

    @FindBy(id = "product_attribute_2")
    WebElement Ram;

    @FindBy(xpath = " //input[@id='product_attribute_3_6']")
    WebElement radio320;

    @FindBy(xpath = " //input[@id='product_attribute_3_7']")
    WebElement radio400;

    @FindBy(xpath = " //input[@id='product_attribute_4_8']")
    WebElement osVistaHome;

    @FindBy(xpath = " //input[@id='product_attribute_4_9']")
    WebElement osVistaPremium;

    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//ul[@class='option-list']")
    List<WebElement> softwareSelection;


    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @FindBy(xpath = "//p[@class='content']")
    WebElement ShoppingCartMsg;
    public void clickOnBuildOnYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
    }

    public void SelectProcessor(String processor) {
        selectByVisibleTextFromDropDown(Processor, processor);

    }

    public void SelectRam(String ram) {
        selectByVisibleTextFromDropDown(Ram, ram);
    }
    public void selectHDDRadios(String hddRadio) {

        switch (hddRadio) {
            case "320 GB":
                clickOnElement(radio320);
                break;
            case "400 GB [+$100.00]":
                clickOnElement(radio400);
                break;
        }
    }


    public void selectOSRadios(String osRadio) {
        switch (osRadio) {
            case "Vista Home [+$50.00]":
                clickOnElement(osVistaHome);
                break;
            case "Vista Premium [+$60.00]":
                clickOnElement(osVistaPremium);
                break;
        }

    }

    public void selectSoftware(String software) {
        for (WebElement allType : softwareSelection) {
            if (allType.getText().contains(software)) {
                clickOnElement(allType);
                break;
            }
        }
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String verifyMsgAddToCart(){
        return getTextFromElement(ShoppingCartMsg);
    }

}