package com.test.definition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import static com.codeborne.selenide.Selenide.*;

public class Login {
    @Given("^I open LJ$")
    public void iOpenLJ() {
        open("http://google.com/ncr");


    }


    @When("^I login to lj with$")
    public void iLoginToLjWith() {

    }

}