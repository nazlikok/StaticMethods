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
        resolveAreaCode(inputCode);

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
                System.out.println("Istanbul-1");
                break;
            case 216:
                System.out.println("Istanbul-2");
                break;
            case 312:
                System.out.println("Ankara");
                break;
            case 232:
                System.out.println("Izmir");
                break;
            case 322:
                System.out.println("Adana");
                break;
            case 266:
                System.out.println("Balikesir");
                break;
            case 224:
                System.out.println("Bursa");
                break;
            case 462:
                System.out.println("Trabzon");
                break;
            case 532:
                System.out.println("Turkcell");
                break;
            case 542:
                System.out.println("Vodafone");
                break;
            case 505:
                System.out.println("TurkTelecom");
                break;
            default:
                System.out.println("Unknown Code");
        }
        return null;
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
