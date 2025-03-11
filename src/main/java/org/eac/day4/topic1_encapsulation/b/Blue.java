package org.eac.day4.topic1_encapsulation.b;

import org.eac.day4.topic1_encapsulation.a.Color;

public class Blue extends Color {
    public static void main(String[] args) {
        Blue color = new Blue(); // inherit in different package
        System.out.println(color.b); // access a & b


        Color obj = new Color();
        System.out.println(obj.a); // only a accessible
    }
}
