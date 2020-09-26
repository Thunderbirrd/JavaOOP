package com.company.five;

import java.util.Scanner;

public class Rec9 {
    static int count = 0;
    static void sequence(int a, int b, String s){
        if(a > 0) sequence(a - 1, b, s + "0");
        if(b > 0) sequence(a, b - 1, s + "1 ");
        if(a == 0 && b == 0 && !s.contains("00")){
            count++;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        sequence(a, b,"");
        System.out.println(count);
    }
}
