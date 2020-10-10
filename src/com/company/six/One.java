package com.company.six;

import com.company.six.Student;

import java.util.Scanner;

public class One {

    public static void insertion_sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        int[] idNumber = new int[n];
        for(int i = 0; i < n; i++){
            Student s = new Student(n - i, i * 2 + 1);
            idNumber[i] = s.id;
        }
        printArray(idNumber);
        insertion_sort(idNumber);
        printArray(idNumber);
    }
}
