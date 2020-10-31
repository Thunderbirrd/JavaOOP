package com.company.eight;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //Task 1
        FileWriter fileWriter = new FileWriter("src\\com\\company\\eight\\file.txt");
        String s = scanner.nextLine();
        fileWriter.write(s);
        fileWriter.append('\n');
        fileWriter.close();
        //Task 2
        FileReader fileReader = new FileReader("src\\com\\company\\eight\\file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while(line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        fileReader.close();
        //Task 3
        fileWriter = new FileWriter("src\\com\\company\\eight\\file.txt");
        fileWriter.write(scanner.nextLine());
        fileWriter.close();
        //Task4
        fileWriter = new FileWriter("src\\com\\company\\eight\\file.txt", true);
        BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
        bufferWriter.write(scanner.nextLine());
        bufferWriter.close();
    }
}
