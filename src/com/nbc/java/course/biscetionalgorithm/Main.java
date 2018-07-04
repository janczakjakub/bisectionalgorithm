package com.nbc.java.course.biscetionalgorithm;

public class Main {


    public static void main(String... args) {
        double lowerLimit = -4;
        double upperLimit = 2;
        double precision = 0;
        double result;

        System.out.println("Bisection Algotithm");
        result = bisection(lowerLimit, upperLimit, precision);
        System.out.println("Result is " + result);

    }

    private static double function1(double x) {
        return x + 2;
    }

    private static double bisection(double a, double b, double epsilon) {

        double middlePoint;

        if (function1(a) * function1(b) < 0) {

            middlePoint = a;

            while ((b - a) > epsilon) {

                middlePoint = (a + b) / 2;

                if (function1(a) * function1(middlePoint) < 0) {

                    b = middlePoint;

                } else if (function1(b) * function1(middlePoint) < 0) {

                    a = middlePoint;

                } else break;

            }

        } else {
            middlePoint = 0;
        }

        return middlePoint;
    }


}
