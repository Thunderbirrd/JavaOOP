package com.company.nine;

import com.company.nine.exceptions.EmptyStringException;

public class Student implements Comparable<Student>{
    final private String name;
    final private String surname;
    private Double grade;

    public Student(String name, String surname, Double grade) throws EmptyStringException {
        if(name.isEmpty() || surname.isEmpty()){
            throw new EmptyStringException();
        }
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return grade.compareTo(o.grade);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "имя = '" + name + '\'' + ", фамилия = '" + surname + '\'' + ", оценка = " + grade;
    }
}
