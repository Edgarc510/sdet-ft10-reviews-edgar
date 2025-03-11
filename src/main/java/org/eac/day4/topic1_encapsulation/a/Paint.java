package org.eac.day4.topic1_encapsulation.a;

public class Paint {
    public static void main(String[] args) {
        Color color = new Color(); // direct access, same package
//        color.
        System.out.println(color.c); // access: a, b, c
    }
}
