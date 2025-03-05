package org.eac.day3.Reviews.topic2_inheritance;

public class Ex02Inheritance {
    public static void main(String[] args) {

        Lion lion1 = new Lion();
        //lion1.??   what can the lion object access?

        //Lion is a Animal
        //Lion has a Home

        lion1.home.location = "Zoo";
        lion1.maneSize = 2;

        System.out.println("lion1 = " + lion1);

    }
}
