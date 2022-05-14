package com.codegym;;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static final String[] validnumber = new String[]{"84-0978489648"};
    public static final String[] invalidnumber = new String[]{"a8-22222222"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String number:
             validnumber) {
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("Number is "+number+" is valid: "+isvalid);
        }
        for (String number:
                invalidnumber) {
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("Number is "+number+" is valid: "+isvalid);
        }
    }
}
