package com.company.ejercicio4;

public class SmartPhone extends SmartDevice{

    int numeroDeCamaras;
    public SmartPhone() {

    }

    public SmartPhone(String name, int tamanoPantalla, String generacion,
                      int numeroDeCamaras) {
        super(name, tamanoPantalla, generacion);
        this.numeroDeCamaras = numeroDeCamaras;
    }


}
