package com.company.nine.exceptions;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String student) {
        super("Следующий студент: " + student + " не найден");
    }
}
