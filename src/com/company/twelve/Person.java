package com.company.twelve;

public class Person {
    String name, surname, lastname;

    public Person(String name, String surname, String lastname) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public String toString(){
        if (name == null || lastname == null || name.equals("") || lastname.equals("")){
            return surname;
        }else{
            return surname + " " + name.charAt(0) + "." + lastname.charAt(0);
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov", "Ivanovich");
        System.out.println(person.toString());
        person = new Person("Ivanov");
        System.out.println(person.toString());
    }
}
