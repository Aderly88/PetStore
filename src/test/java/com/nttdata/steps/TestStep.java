package com.nttdata.steps;

public class TestStep {
    public TestStep() {
        System.out.println("Hola desde constructor");
    }

    public void metodoPrueba() {
        System.out.println("Hola pruba desde Steps");
    }

    public void abrirPagina(String url) {
        System.out.println("Imprimir: " + url);
    }

    public void iniciarSesion(String usuario, String clave) {
        System.out.println("primer: " + usuario);
        System.out.println("segundo: " + clave);
    }
}
