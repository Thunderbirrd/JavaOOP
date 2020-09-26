package com.company.five;

import java.util.Scanner;

public class Rec8 {
    public static boolean flag = true;
    public static void check(String s) {
        if(s.length() == 1){
            return;
        }
        char begin = s.charAt(0);
        char end = s.charAt(s.length() - 1);
        if (begin == end) {
            if(s.length() != 2) {
                s = s.substring(1, s.length() - 1);
                check(s);
            }
        }else {
            flag = false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        word = word.toLowerCase();
        check(word);
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
