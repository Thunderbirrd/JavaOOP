package com.company.nine;

import com.company.nine.exceptions.EmptyStringException;
import com.company.nine.exceptions.StudentNotFoundException;

import java.util.ArrayList;

public interface LabClassUI {
    void addStudent(Student student) throws EmptyStringException;
    void addStudents(ArrayList<Student> students);
    void sortByGrade();
    ArrayList<Student> getStudents();
    Student getStudent(String name, String surname) throws StudentNotFoundException;
}
