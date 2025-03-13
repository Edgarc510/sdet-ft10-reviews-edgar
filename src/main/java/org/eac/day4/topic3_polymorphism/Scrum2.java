package org.eac.day4.topic3_polymorphism;

public class Scrum2 {

    public static void main(String[] args) {

        Person tester01 = new Tester("Edgar","Secret Agent",150_000);
        System.out.println(tester01);
        System.out.println(tester01.name);

        Employee tester2 = new Tester("Alex","SDET",1300_000);
        tester2.work();

        CreateSmokeTest tester4 = new Tester("Jacks","Student",100_000);
        tester4.create();


        System.out.println("-------------------------------------------------------");

        



    }

}
