package main.impl;

public class BasicCalculator {

    public void add(int x, int y){
        int a = x + y;

        System.out.println("Value of a is: "+ a);
    }

    public void subtract(int x, int y){
        int b = x - y;

        System.out.println("Value of b is: "+ b);
    }

    public void multiply(int x, int y){
        int c = x * y;

        System.out.println("Value of c is: "+ c);
    }

    public void divide(int x, int y){
        int d = x / y;

        System.out.println("Value of d is: "+ d);
    }
}
