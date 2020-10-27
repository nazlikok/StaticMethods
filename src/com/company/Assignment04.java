package com.company;
import java.util.Scanner;

public class Assignment04 {

    public static void main(String[] args) {
        System.out.println("Give me a number");
        Scanner myObj = new Scanner(System.in);
        int input = (int) myObj.nextFloat();

        isEven(input);
        System.out.println(input+ " is even " +"-> "+ isEven(input));

    }

    static boolean isEven(int input) {
        if (input % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
