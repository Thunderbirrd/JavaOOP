package com.company.six;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Three {
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].id <= r[j].id) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    public static void printArray(Student[] arr){
        for (Student j : arr) {
            System.out.print(j.id + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массивов");
        int n = scanner.nextInt();
        Student[] arr1 = new Student[n];
        Student[] arr2 = new Student[n];
        for(int i = 0; i < n; i++){
            arr1[i] = new Student(i * 6 + 103, (i + 1) * 105 - 78);
            arr2[i] = new Student(i * 5 + 90, (i + 1) * 12 - 5);
        }
        printArray(arr1);
        printArray(arr2);
        mergeSort(arr1, n); mergeSort(arr2, n);
        Student[] res = new Student[n * 2];
        merge(res, arr1, arr2, n, n);
        printArray(res);
    }
}
