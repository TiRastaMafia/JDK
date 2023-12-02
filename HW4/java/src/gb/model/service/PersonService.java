package src.gb.model.service;

import src.gb.model.ListPersons;
import src.gb.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonService {

    ListPersons listPersons = new ListPersons();

    public List<String> findByExperience(int experience) {
        List<String> resultList = new ArrayList<>();
        for (Person person : listPersons.getPersons()){
            if (person.getExperience() == experience){
                resultList.add(person.getName() + " - " + person.getExperience());
            }
        }
        return resultList;
    }

    public List<String> findPhonesByName(String name) {
        List<String> resultList = new ArrayList<>();
        for (Person person : listPersons.getPersons()){
            if (person.getName().equalsIgnoreCase(name)){
                resultList.add(person.getName() + " - " + person.getPhone());
            }
        }
        return resultList;
    }

    public Person findSomething(int personId) {
        for(Person person : listPersons.getPersons()){
            if(person.getPersonId() == personId){
                return person;
            }
        }
        return null;
    }

    public void add(String phone, int experience, String name) {
        listPersons.getPersons().add(new Person(phone, name, experience));
        System.out.println("Успешно добавлен\n");
    }

    public ListPersons getListPersons() {
        return listPersons;
    }
}
