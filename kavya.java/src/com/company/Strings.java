package com.company;

import java.util.Scanner;

public class Strings {
    static final String s = "Kavya";

    public static void main(String[] args) {

//        String s1 = "Java";
//        String s2 = "Java";
//        System.out.println(s1==s2);
//        String s3 = new String("Java").intern();
//        System.out.println(s2==s3);

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(Check(null));
    }

    public static boolean Check(String str) {
        return str.equals(s);
    }
}

