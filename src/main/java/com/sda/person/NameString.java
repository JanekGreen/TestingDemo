package com.sda.person;

public class NameString {
    private final String name;
    private final String middleName;
    private final String surname;

    public NameString(String name, String middleName, String surname) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public boolean hasMiddleName() {
        return middleName != null;
    }

    public String getInitials() {
        return String.valueOf(name.charAt(0)) + surname.charAt(0);
    }
    public String getFullName() {
        return toString();
    }

    @Override
    public String toString() {
        return name + " " + middleName + " " + surname;
    }

}
