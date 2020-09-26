package com.company.five;

import java.util.Scanner;

public class Rec10 {
    public static int result = 0;
    public static void reverse(int x){
        result *= 10; result += x % 10;
        x /= 10;
        if(x != 0){
            reverse(x);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reverse(n);
        System.out.println(result);
    }
}
