package org.eac.day1.Reviews.day01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Ex01File {

    public static void main(String[] args) {
        int n = 10; // 10  -> 11 --> 12
        System.out.println(n++); // 10
        System.out.println(n);// this will now print 11
        n = n + 1;
        System.out.println("n = " + n);
//        System.out.println(++n); // 12


        // We will recap array and collections in later days and use this loop. Remember the main idea of this loop type is to iterate through each element of the given data structure, from beginning to end. The element is represented as the given name during each iteration

        for(int i = 0; i < 5; i++) { // outer loop
            for(int j = 0; j < 3; j++) { // inner loop
                System.out.println("i " + i + " j " + j);
            }
        }
    }

}


/*
    PIC

    File name: Ex01File.java same as public class name Ex01File

    There can be other classes defined in this file, but they cannot be public
 */