package com.test;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;


@Singleton
public class PeopleStore {
    
    private List<Person> persons = new ArrayList();

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

}
