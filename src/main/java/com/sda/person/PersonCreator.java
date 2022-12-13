package com.sda.person;

public class PersonCreator {
    public Person make(String name, String surname, int age, char gender) {
        if (name == null || name.equals("")) {
            if (gender == 'F') {
                name = "Kobieta";
            }
            if (gender == 'M') {
                name = "Mężczyzna";
            }
        }
        if (surname == null || surname.equals("")) {
            surname = "Anonim";
        }
        return new Person(name, surname, age, gender);
    }
}
