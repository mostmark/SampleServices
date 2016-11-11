package com.test;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

@Singleton
public class CarStore {

    private List<Car> cars = new ArrayList();

    public List<Car> getPersons() {
        return cars;
    }

    public void setPersons(List<Car> persons) {
        this.cars = cars;
    }

}
