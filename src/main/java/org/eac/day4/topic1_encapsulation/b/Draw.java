package org.eac.day4.topic1_encapsulation.b;

import org.eac.day4.topic1_encapsulation.a.Color;

public class Draw {
    public static void main(String[] args) {
        Color color = new Color(); // direct access, different package
//        color.
        System.out.println(color.a); // access only a
    }
}
