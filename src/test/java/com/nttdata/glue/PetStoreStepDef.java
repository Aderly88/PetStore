package com.nttdata.glue;

import com.nttdata.steps.PetStoreStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PetStoreStepDef {
    @Steps
    PetStoreStep tienda;


    @Given("la url es {string}")
    public void laUrlEs(String url) {
        tienda.definirURL(url);
    }

    @When("consulto la mascota con ID {string}")
    public void consultoLaMascotaConID(String idMascota) {

        tienda.consultarMascota(idMascota);

    }

    @Then("valido el codigo de respuesta sea {int}")
    public void validoElCodigoDeRespuestaSea(int statusCode) {
        tienda.validacionRespuesta(statusCode);
    }

    @And("valido que el nombre de la mascota sea {string}")
    public void validoQueElNombreDeLaMascotaSea(String nombre) {
        tienda.validarNombre(nombre);
    }

    @When("creo la mascota {string} con ID {string}")
    public void creoLaMascotaConID(String nombre, String idMascota) {
        tienda.crearmascota(nombre, idMascota);
    }
}
