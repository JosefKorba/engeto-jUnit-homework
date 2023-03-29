package com.engeto.calculator;

public class Calculator {

    public int add (int a, int b) {
        return a + b;
    }

    public int subtract (int a, int b) {
        return a - b;
    }

    public int multiply (int a, int b) {
        return a * b;
    }

    public double divide (int a, int b) {
        if (b==0) {
            throw new ArithmeticException ("Nelze dělit nulou");
        }
        return (double) a / b;
    }

    public double squareRoot (int a) {
        if (a<0) {
            throw new ArithmeticException ("Nejde použít záporné číslo");
        }
        return Math.sqrt(a);
    }

    public double square (int a) {
        return a * a;
    }

    public double areaOfCircle (int a) {
        if (a<=0) {
            throw new ArithmeticException ("Nejde použít záporné číslo");
        }
        return a * a * Math.PI;
    }

}
