package org.eac.day3.Reviews.topic2_inheritance;

public class Lion extends Animal{ // Lion is a Animal
    // Animal is the super class
    // Lion is the subclass

    int maneSize;
    Home home; // Lion has a Home

    Lion() {
        home = new Home();  // Initialize home if null
    }

    @Override
    public String toString() {
        return "Lion{" +
                "maneSize=" + maneSize +
                ", home=" + home +
                '}';
    }
}

