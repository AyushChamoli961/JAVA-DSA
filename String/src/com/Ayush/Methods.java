package com.Ayush;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Ayush Chamoli";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        //but original name is not changed , a new object is created instead of original.
        System.out.println(name.indexOf('i'));
        System.out.println("    Ayush Chamoli    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }

}
