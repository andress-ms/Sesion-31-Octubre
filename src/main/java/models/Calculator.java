package models;

public class Calculator {
    public int add(int a, int b) {
        int result = a + b;
        System.out.println("Data type: int");
        System.out.println("Result: " + result);
        return result;
    }

    public double add (double a, double b) {
        double result = a + b;
        System.out.println("Data type: double");
        System.out.println("Result: " + result);
        return result;
    }

    public int add (int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Data type: int");
        System.out.println("Result: " + result);
        return result;
    }


}
