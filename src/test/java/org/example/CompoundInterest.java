/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


import java.util.Scanner;
import java.lang.Math;


public class CompoundInterest
    {
    public static void main (String[] args)
        {
        int princAmount;
        double rate;
        int year;
        int x; //will be used for # of times that interest will be compounded every year
        double result;

        Scanner reader = new Scanner (System.in);

        System.out.print("What is the principal amount? ");
        princAmount = reader.nextInt();

        System.out.print("What is the rate? ");
        rate = reader.nextDouble();

        System.out.print("What is the number of years? ");
        year = reader.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        x = reader.nextInt();

        result = princAmount * Math.pow( 1 + ( (rate*0.01) / x), x * year);

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",
                princAmount, rate, year, x, result );

        reader.close();
    }
}