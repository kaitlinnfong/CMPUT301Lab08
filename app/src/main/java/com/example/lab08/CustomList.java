package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities = new ArrayList<>();

    public void addCity(City city) {
        cities.add(city);
    }



    public void deleteCity(City city) {
        cities.remove(city);
    }

    public int countCities() {
        return cities.size();
    }
}
