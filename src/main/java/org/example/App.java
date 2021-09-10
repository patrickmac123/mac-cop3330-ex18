package org.example;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 18 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    static double convert(String choice)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "Please enter the temperature in "+op(choice)+" ");
        String stringTemp = scan.nextLine();
        double temperature = Double.parseDouble(stringTemp);

        if(choice.equals("c") || choice.equals("C"))
        {
            double c = (temperature - 32) * 5 / 9;
            return c;
        }
        else if(choice.equals("f") || choice.equals("f"))
        {
            double f = (temperature * 9 /5) + 32;
            return f;
        }
        return 0;
    }

    static String op(String choice)
    {
        if(choice.equals("f") || choice.equals("F"))
        {
            String c = "Celsius";
            return c;
        }
        else if(choice.equals("c") || choice.equals("C"))
        {
            String f = "Fahrenheit";
            return f;
        }
        return choice;
    }

    static String type(String choice)
    {
        if(choice.equals("c") || choice.equals("C"))
        {
            String c = "Celsius";
            return c;
        }
        else if(choice.equals("f") || choice.equals("F"))
        {
            String f = "Fahrenheit";
            return f;
        }
        return choice;
    }
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Press C to convert from Fahrenheit to Celsius. \nPress F to convert from Celsius to Fahrenheit." );

        System.out.print( "Your choice: " );
        String stringChoice = scan.nextLine();

        double temp = convert(stringChoice);
        String choice = type(stringChoice);

        System.out.print("The temperature in "+choice+" is "+temp);

    }
}