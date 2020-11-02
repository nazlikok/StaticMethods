package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Assignment04 {

    static boolean isEven(int testnum) {
        if (testnum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static String resolveAreaCode(int inputCode) {
        switch (inputCode) {
            case 212:
                return "Istanbul-1";
            case 216:
                return "Istanbul-2";
            case 312:
                return "Ankara";
            case 232:
                return "Izmir";
            case 322:
                return "Adana";
            case 266:
                return "Balikesir";
            case 224:
                return "Bursa";
            case 462:
                return "Trabzon";
            case 532:
                return "Turkcell";
            case 542:
                return "Vodafone";
            case 505:
                return "TurkTelecom";
            default:
                return "Unknown Code";
        }
    }

    static void fibonacciSeries(int n) {
        int previous = 0;
        int add = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(previous + " + ");
            int sum = previous + add;
            previous = add;
            add = sum;
        }
        System.out.println();
    }

    static void fibonacciUntil(int max) {
        int m1 = 0;
        int m2 = 1;
        for (int i = 1; i <= max; i++) {
            System.out.print(m1 + " + ");
            int sum = m1 + m2;
            m1 = m2;
            m2 = sum;
            if (max < m1) {
                break;
            }
        }
        System.out.println();
    }

    static void squares(int n) {
        for (int i = 0; i <= n; i++) {
            int square = i * i;
            System.out.println("Squares " + i + "->" + square);
        }
    }

    static void squaresUntil(int max) {
        for (int i = 0; i <= max; i++) {
            int squareMax = i * i;
            if (max > squareMax) {
                System.out.println("Squares " + i + "->" + squareMax);
            }
        }
        System.out.println();
    }
    static void randomTest(){
        int sum = 0;
        int num=1000;
        int max=150;
        int min=50;
        for (int i = 1; i <= num; i++){
            int rand = (int)(Math.random()*(max-min)) + min;
            sum += rand;
            /*System.out.print(rand + " ");
            System.out.println();*/
        }
        System.out.println("Sum of " + num +" random numbers = "+ sum);
        System.out.println();
    }
    static void countdown(int n){
        for(int i=n; i>=0; i--){
            System.out.println(i);
        }
    }
}
