package com.dicoding.javafundamental.basic.datatype;

public class Test {
    public static void typestring(){
        String greeting = " Hello World!";
        System.out.println(greeting);

        char[] dicodingChars = {'d','i','c','o','d','i','n','g'};
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);
        System.out.println(dicodingChars);

        String dicoding = "dicoding";
        int length = dicoding.length();
        System.out.println(length);

        char result = dicoding.charAt(7);
        System.out.println(result);
        int index = dicoding.indexOf('d');
        System.out.println(index);
    }
}
