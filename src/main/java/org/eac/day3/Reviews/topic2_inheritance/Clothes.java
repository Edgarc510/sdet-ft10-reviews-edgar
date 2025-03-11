package org.eac.day3.Reviews.topic2_inheritance;

public class Clothes {
    String company;

    public Clothes(String company) {
        this.company = company;
    }
}

class Jacket extends Clothes {
    public Jacket(String company) {
        super(company);
    }
}
