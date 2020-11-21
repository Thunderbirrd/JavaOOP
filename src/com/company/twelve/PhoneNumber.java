package com.company.twelve;

public class PhoneNumber {
    private final String number;

    public PhoneNumber(String number) {
        this.number = parsePhoneNumber(number);
    }

    public String parsePhoneNumber(String number) {
        String code = number.substring(0, number.length() - 10);
        if (!(number.charAt(0) == '+')) {
            code = "+" + code;
        }
        number = number.substring(number.length() - 10);
        return code + " " + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6, 10);
    }

    @Override
    public String toString() {
        return "Phone number: " + number;
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber1 = new PhoneNumber("+104289652211");
        PhoneNumber phoneNumber2 = new PhoneNumber("89175655655");
        PhoneNumber phoneNumber3 = new PhoneNumber("+79175655655");
        System.out.println(phoneNumber1);
        System.out.println(phoneNumber2);
        System.out.println(phoneNumber3);
    }
}