package com.company.ejercicio4;

public class SmartWatch extends SmartDevice {

    String color;
    public SmartWatch() {

    }

    public SmartWatch(String name, int tamanoPantalla, String generacion,
                      String color) {
        super(name, tamanoPantalla, generacion);
        this.color = color;
    }


}
