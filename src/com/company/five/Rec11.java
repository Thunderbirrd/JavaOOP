package com.company.five;

import java.util.Scanner;

public class Rec11 {
    public static int sequence(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(scanner.hasNext()){
            int x2 = scanner.nextInt();
            if(x == 0 && x2 == 0){
                return 0;
            }else if(x2 == 0){
                x = scanner.nextInt();
                if(x == 0){
                    return 0;
                }else{
                    return x + sequence();
                }
            }
            else{
                return x + x2 + sequence();
            }
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int res = sequence();
        System.out.println(res);
    }
}
