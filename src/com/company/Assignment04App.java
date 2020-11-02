package com.company;
import java.util.Scanner;
import java.lang.Math;


public class Assignment04App {

    public static void main(String[] args) {

        Assignment04 assignment =new Assignment04();
        System.out.println("Give me a number to test whether it is even or odd");
        Scanner num1 = new Scanner(System.in);
        int input = (int) num1.nextFloat();
        //isEven(input);
        System.out.println(input+ " is even " +"-> "+ Assignment04.isEven(input));
        System.out.println("What is the area code that you'r looking for?");
        Scanner num2 = new Scanner(System.in);
        int inputCode = (int) num2.nextFloat();
        //resolveAreaCode(inputCode);
        System.out.println(Assignment04.resolveAreaCode(inputCode));

        System.out.println("Give me a number to test fibonacci");
        Scanner num3 = new Scanner(System.in);
        int fibonacci = (int) num3.nextFloat();
        Assignment04.fibonacciSeries(fibonacci);

        System.out.println("Give me a number to test Maxfibonacci");
        Scanner num4 = new Scanner(System.in);
        int max = (int) num4.nextFloat();
        Assignment04.fibonacciUntil(max);

        System.out.println("Give me a number to test Calculate squares");
        Scanner num5 = new Scanner(System.in);
        int square = (int) num5.nextFloat();
        Assignment04.squares(square);

        System.out.println("Give me a number to test Calculate squaresMax");
        Scanner num6 = new Scanner(System.in);
        int squareMax = (int) num6.nextFloat();
        Assignment04.squaresUntil(squareMax);

        Assignment04.randomTest();

        System.out.println("Give a number to countdown from");
        Scanner num7 = new Scanner(System.in);
        int n = (int) num7.nextFloat();
        Assignment04.countdown(n);

    }
}
