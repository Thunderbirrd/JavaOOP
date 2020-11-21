package com.company.twelve;

public class Shirt {
    private String id, type, color, size;


    public Shirt() {
    }

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.type = name;
        this.color = color;
        this.size = size;
    }

    private Shirt stringToShirt(String str) {
        String[] shirt = str.split(",");
        return new Shirt(shirt[0], shirt[1], shirt[2], shirt[3]);
    }

    private Shirt[] stringToShirts(String[] arr) {
        Shirt[] shirts = new Shirt[arr.length];
        for (int i = 0; i < arr.length; i++) {
            shirts[i] = stringToShirt(arr[i]);
        }
        return shirts;
    }

    @Override
    public String toString() {
        return "Shirt: id - " + id + "; type - " + type + "; color - " + color + "; size - " + size;
    }

    public static void main(String[] args) {
        String[] str = new String[11];
        str[0] = "S001,Black Polo Shirt,Black,XL";
        str[1] = "S002,Black Polo Shirt,Black,L";
        str[2] = "S003,Blue Polo Shirt,Blue,XL";
        str[3] = "S004,Blue Polo Shirt,Blue,M";
        str[4] = "S005,Tan Polo Shirt,Tan,XL";
        str[5] = "S006,Black T-Shirt,Black,XL";
        str[6] = "S007,White T-Shirt,White,XL";
        str[7] = "S008,White T-Shirt,White,L";
        str[8] = "S009,Green T-Shirt,Green,S";
        str[9] = "S010,Orange T-Shirt,Orange,S";
        str[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirts = new Shirt().stringToShirts(str);

        for (Shirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
}
