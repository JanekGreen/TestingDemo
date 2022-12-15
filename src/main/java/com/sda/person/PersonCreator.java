package com.sda.person;

public class PersonCreator {
    private static int personCounter = 0;

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
        personCounter++;
        return new Person(name, surname, age, gender);
    }

    public static int getPersonCounter() {
        return personCounter;
    }
}
