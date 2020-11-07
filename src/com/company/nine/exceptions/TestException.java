package com.company.nine.exceptions;

import com.company.nine.Client;

public class TestException {
    public static void main(String[] args) throws ExceptionOfINN {
        Client client1 = new Client("Иван", "Иванов",  "123456789123");
        System.out.println(client1);
        Client client2 = new Client("Петр", "Петров", "123");
    }
}
