package com.nttdata.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class PetStoreStep {

    Response response;
    private String URL_BASE;

    public void definirURL(String url) {
        URL_BASE = url;

    }

    public void consultarMascota(String idMascota) {
        response = RestAssured
                .given()
                .relaxedHTTPSValidation()
                .baseUri(URL_BASE)
                .log().all()
                .get("/pet/" + idMascota)
                .then()
                .log().all()
                .extract().response();

    }

    public void validacionRespuesta(int statusCode) {
        Assert.assertEquals("validación de respuesta", statusCode, response.statusCode());
    }

    public void validarNombre(String nombre) {

    }

    public void crearmascota(String nombre, String idMascota) {

        String body = "{\n" +
                "    \"id\": " + idMascota + " ,\n" +
                "    \"name\": \"" + nombre.trim() + "\",\n" +
                "    \"status\": \"available\"\n" +
                "}";

        System.out.println(body);

        response = RestAssured
                .given()
                .baseUri(URL_BASE)
                .header("Content-Type", "application/json")
                .body(body)
                .log().all()
                .post("/pet")
                .then()
                .extract().response();

    }
}
