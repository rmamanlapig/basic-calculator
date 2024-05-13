package main;

import main.impl.BasicCalculator;

public class Application {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();

        basicCalculator.add(4,2);
        basicCalculator.subtract(4,2);
        basicCalculator.multiply(4,2);
        basicCalculator.divide(4,2);

    }
}