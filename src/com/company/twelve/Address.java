package com.company.twelve;

import java.util.StringTokenizer;

public class Address {
    private final String country, region, city, street, house, building, flat;

    public Address(String str) {
        String[] arr = toAddressArray(str);
        this.country = arr[0];
        this.region = arr[1];
        this.city = arr[2];
        this.street = arr[3];
        this.house = arr[4];
        this.building = arr[5];
        this.flat = arr[6];
    }

    private String[] toAddressArray(String str) {
        String[] arr = new String[7];
        str = str.replaceAll(" ", "");
        StringTokenizer st = new StringTokenizer(str, ",.;-");
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = st.nextToken();
            i++;
        }
        return arr;
    }

    public String toString() {
        return ("Адрес: страна: " + country + ", регион: " + region + ", г." + city + ", ул." + street + ", д." + house + ", к." + building + ", кв." + flat);
    }

    public static void main(String[] args) {
        Address address = new Address("   Россия, Москва, Москва, Ленина, 13, 1, 156  ");
        System.out.println(address);
        address = new Address("Россия.Москва.Москва.Ленина.13.1.156    ");
        System.out.println(address);
        address = new Address("   Россия-Москва-Москва-Ленина-13-1-156");
        System.out.println(address);
        address = new Address("Россия;Москва;Москва;Ленина;13;1;156");
        System.out.println(address);
    }
}
