package com.company.five;

import java.util.Scanner;

public class Rec12 {
    public static void sequence(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(scanner.hasNext()){
            int x2 = scanner.nextInt();
            if(x == 0 && x2 == 0){
                return;
            }
            if(x2 == 0){
                x = scanner.nextInt();
                if(x != 0){
                    if(x % 2 == 1){
                        System.out.println(x);
                    }
                    sequence();
                }
            }
            else{
                if(x % 2 == 1){
                    System.out.println(x);
                }
                if(x2 % 2 == 1){
                    System.out.println(x2);
                }
                sequence();
            }
        }
    }
    public static void main(String[] args) {
        sequence();
    }
}
