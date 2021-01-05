package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El cliente abre la pagina web$")
    public void el_cliente_abre_la_pagina_web() {
        theActorCalled("cliente").attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }

    @When("^ El cliente (.+) y (.+)$")
    public void el_cliente_y(String usuario, String contrasena) {
    }

    @Then("^ debo ver mi cuenta (.+)$")
    public void debo_ver_mi_cuenta(String validtexto) {
    }


}
