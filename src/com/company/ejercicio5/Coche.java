package com.company.ejercicio5;

public class Coche {

    String name;
    String marca;
    String color;
    int peso;

    public Coche() {

    }

    public Coche(String name, String marca, String color, int peso) {
        this.name = name;
        this.marca = marca;
        this.color = color;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
}
