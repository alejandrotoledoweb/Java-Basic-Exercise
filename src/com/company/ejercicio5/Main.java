package com.company.ejercicio5;

public class Main {

    public static void main(String[] args) {
    CocheCRUDImpl coches = new CocheCRUDImpl();

    Coche toyota = new Coche("Corolla", "Toyota", "azul", 1549);

    coches.save(toyota);

    coches.findAll();

    coches.delete(toyota);

    }


}
