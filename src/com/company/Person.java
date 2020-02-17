package com.company;

public class Person {
    private String Name;
    private String Surname;
    private String Email;

    public Person(String name, String surname, String email) {
        Name = name;
        Surname = surname;
        Email = email;
    }
    public String getName() {
        return Name;
    }
    public String getSurname() {
        return Surname;
    }
}
