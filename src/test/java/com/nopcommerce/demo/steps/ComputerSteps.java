package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerSteps {
    @When("I click On ComputerLink")
    public void iClickOnComputerLink() {
        new ComputerPage().clickOnComputer();
    }


    @Then("I should see message {string}")
    public void iShouldSeeMessage(String text) {
        Assert.assertEquals("text not verify",text,new ComputerPage().verifyComputerText());
    }

    @And("I click on Desktop Link")
    public void iClickOnDesktopLink() {
        new DesktopsPage().clickOnDesktop();
    }

    @Then("I should verify {string} Text")
    public void iShouldVerifyText(String Text) {
        Assert.assertEquals("text not verify",Text,new DesktopsPage().verifyDesktopText() );
    }
    @And("I  Click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new BuildYourOwnComputerPage().clickOnBuildOnYourOwnComputer();
    }


    @And("I  Select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().SelectProcessor(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String Ram) {
        new BuildYourOwnComputerPage().SelectRam(Ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String HddRadio) {
        new BuildYourOwnComputerPage().selectHDDRadios(HddRadio);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String osRadio) {
        new BuildYourOwnComputerPage().selectOSRadios(osRadio);
    }

    @And("ISelect Software {string}")
    public void iselectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }
    @And("I  Click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }


    @Then("I should able to receive verifyMessage {string}")
    public void iShouldAbleToReceiveVerifyMessage(String msg) {
        Assert.assertEquals("text not match",msg,new BuildYourOwnComputerPage().verifyMsgAddToCart());

    }



}