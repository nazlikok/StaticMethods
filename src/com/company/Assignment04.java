package com.company;
import java.util.Scanner;

public class Assignment04 {

    public static void main(String[] args) {

        System.out.println("Give me a number");
        Scanner num1 = new Scanner(System.in);
        int input = (int) num1.nextFloat();
        //isEven(input);
        System.out.println(input+ " is even " +"-> "+ isEven(input));

        System.out.println("What is the area code that you'r looking for?");
        Scanner num2 = new Scanner(System.in);
        int inputCode = (int) num2.nextFloat();
        //resolveAreaCode(inputCode);
        System.out.println(resolveAreaCode(inputCode));

        System.out.println("Give me a number to test fibonacci");
        Scanner num3 = new Scanner(System.in);
        int fibonacci = (int) num3.nextFloat();
        fibonacciSeries(fibonacci);

        System.out.println("Give me a number to test Maxfibonacci");
        Scanner num4 = new Scanner(System.in);
        int max = (int) num4.nextFloat();
        fibonacciUntil(max);

    }

    static boolean isEven(int testnum) {
        if (testnum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static String resolveAreaCode(int inputCode){
        switch (inputCode){
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

    static void fibonacciSeries(int n){
        int previous = 0;
        int add = 1;
        for (int i = 1; i <= n; i++)
        {
            System.out.print(previous + " + ");
            int sum = previous + add;
            previous = add;
            add = sum;
        }
        System.out.println();
    }

    static void fibonacciUntil(int max){
        int m1 = 0;
        int m2 = 1;
        for (int i = 1; i <=max ; i++) {
            System.out.print(m1 + " + ");
            int sum = m1 + m2;
            m1 = m2;
            m2 = sum;
            if (max < m1) {
                break;
            }

        }
    }
}
