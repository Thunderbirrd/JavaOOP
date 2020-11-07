package com.company.nine;

import com.company.nine.exceptions.ExceptionOfINN;

public class Client {
    final private String name;
    final private String surname;
    final private String inn;

    public Client(String name, String surname, String inn) throws ExceptionOfINN {
        if (inn.length() != 12) {
            throw new ExceptionOfINN();
        }
        this.name = name;
        this.surname = surname;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "имя = '" + name + '\'' + ", фамилия = '" + surname + '\'' + ", ИНН = '" + inn + '\'';
    }
}
