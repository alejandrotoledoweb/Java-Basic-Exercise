package com.company;

import java.util.ArrayList;

public class Ejercicio3 {

    static String getTotalString(ArrayList<String> nombres) {
        String totalName = "";
        for (String nombre: nombres) {
            totalName += nombre;
        }
        return totalName;
    }
}
