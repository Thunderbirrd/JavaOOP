package com.company.six;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o2.grade - o1.grade;
    }

    public void quickSort(Student[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        Student prep = array[middle];
        int i = low, j = high;

        while (i <= j) {
            while (this.compare(array[i], prep) < 0) {
                i++;
            }
            while (this.compare(array[j], prep) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }
}
public class Two {
    public static void printArray(Student[] arr){
        for (Student j : arr) {
            System.out.print(j.grade + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        Student[] arr = new Student[n];
        for(int i = 0; i < n; i++){
            Student s = new Student(i, i * 2 + 1);
            arr[i] = s;
        }
        printArray(arr);
        SortingStudentsByGPA s = new SortingStudentsByGPA();
        s.quickSort(arr, 0, n - 1);
        printArray(arr);

    }
}
