package com.company.nine;

import com.company.nine.exceptions.EmptyStringException;
import com.company.nine.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        LabClassUI labClassUI = new LabClass().getLabClassUI();
        labClassUI.addStudent(new Student("Иван", "Иванов",  2.5));
        labClassUI.addStudent(new Student("Петр", "Петров",  3.0));
        labClassUI.addStudent(new Student("Василий", "Васильев",  4.0));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Александр", "Сидоров", 3.5));
        students.add(new Student("Андрей", "Козлов", 4.5));
        students.add(new Student("Дмитрий", "Орлов", 5.0));

        labClassUI.addStudents(students);
        System.out.println(labClassUI);
        labClassUI.sortByGrade();
        System.out.println(labClassUI);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя и фамилию студента, данные которого хотите увидеть: ");
        System.out.println(labClassUI.getStudent(scanner.next(), scanner.next()));
    }
}
