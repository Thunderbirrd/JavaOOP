package com.company.seven;

import java.util.*;

public class Game {
    static Scanner in = new Scanner(System.in);
    public static <T> int nextCard(Class cl, T t){
        int a = -1;
        switch (cl.toString()){
            case "class com.company.seven.MyStack":{
                MyStack stack = (MyStack)t;
                Stack<Integer> buf = new Stack<>();
                while(!stack.isEmpty()){
                    buf.push(stack.pop());
                }
                int card = buf.pop();
                while(!buf.isEmpty()){
                    stack.push(buf.pop());
                }
                a = card;
                break;
            }
            case "class com.company.seven.Deque":{
                a = ((Deque)t).pop();
                break;
            }
            case "class com.company.seven.Queue":{
                a = ((Queue)t).pop();
                break;
            }
            case "class com.company.seven.DoubleList":{
                a = ((DoubleList)t).pop();
                break;
            }
        }
        return a;
    }
    public static <T> void addCard(Class cl, T t, int a){
        switch (cl.toString()){
            case "class MyStack":{
                ((MyStack)t).push(a);
                break;
            }
            case "class MyDeque":{
                ((Deque)t).push(a);
                break;
            }
            case "class MyQueue":{
                ((Queue)t).push(a);
                break;
            }
            case "class DoubleList":{
                ((DoubleList)t).push(a);
                break;
            }
        }
    }
    public static <T> void  game(T player1,T player2){
        int card1, card2, turn = 0;
        while(!((Struct)player1).isEmpty() && !((Struct)player2).isEmpty() && turn != 181){
            card1 = nextCard(player1.getClass(), player1);
            card2 = nextCard(player2.getClass(), player2);
            if((card1 > card2 && card2 != 0) || card1 == 0 ){
                addCard(player2.getClass(), player2,card1);
                addCard(player2.getClass(), player2,card2);
            }
            else{
                addCard(player1.getClass(), player1,card1);
                addCard(player1.getClass(), player1,card2);
            }
            turn++;
        }
        if (turn < 181){
            if(((Struct) player1).isEmpty()){
                System.out.println("second " + turn);
            }else {
                System.out.println("first " + turn);
            }
        }
        else System.out.println("Ботва");

    }
    public static void main(String[] args)  {
        System.out.println("Выберите структуру для игры:\n" +
                "1 - Стек\n" +
                "2 - Очередь\n" +
                "3 - Дек\n" +
                "4 - Двусвязный список");
        int choice = in.nextInt();
        Struct player1 = null, player2 = null;
        switch (choice){
            case 1:{
                player1 = new MyStack();
                player2 = new MyStack();
                break;
            }
            case 2:{
                player1 = new Queue();
                player2 = new Queue();
                break;
            }
            case 3:{
                player1 = new Deque();
                player2 = new Deque();
                break;
            }
            case 4:{
                player1 = new DoubleList();
                player2 = new DoubleList();
                break;
            }
        }
        System.out.println("Введите 5 карт для первого игрока затем для второго игрока:");
        for (int i = 0; i < 5; i++){
            assert player1 != null;
            player1.push(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            player2.push(in.nextInt());
        }
        game(player1, player2);
    }
}
