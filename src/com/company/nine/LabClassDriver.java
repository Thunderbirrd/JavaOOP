package com.company.nine;

import com.company.nine.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LabClassDriver implements LabClassUI{
    private final ArrayList<Student> students;

    public LabClassDriver() {
        this.students = new ArrayList<>();
    }

    @Override
    public ArrayList<Student> getStudents() {
        return students;
    }
    @Override
    public Student getStudent(String name, String surname) throws StudentNotFoundException {
        return students.stream().filter(student -> student.getName().equals(name) && student.getSurname().equals(surname))
                .findFirst().orElseThrow(() -> new StudentNotFoundException(name + " " + surname));
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addStudents(ArrayList<Student> students) {
        this.students.addAll(students);
    }

    @Override
    public void sortByGrade() {
        students.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(students);
    }

    @Override
    public String toString() {
        StringBuilder studentsList = new StringBuilder();
        for (Student student : students) {
            studentsList.append(student.toString()).append("\n");
        }
        return studentsList.toString();
    }
}
