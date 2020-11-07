package com.company.nine.exceptions;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Личные данные студента должны быть заполнены");
    }
}
