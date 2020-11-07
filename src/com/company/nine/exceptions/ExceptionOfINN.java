package com.company.nine.exceptions;

public class ExceptionOfINN extends Exception{
    public ExceptionOfINN(){
        super("ИНН должен состоять из 12-ти цифр");
    }
}
