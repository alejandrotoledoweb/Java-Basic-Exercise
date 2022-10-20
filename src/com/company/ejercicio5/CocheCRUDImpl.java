package com.company.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    List<Coche> allCoches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        allCoches.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        return allCoches;
    }

    @Override
    public void delete(Coche coche) {

    }
}
