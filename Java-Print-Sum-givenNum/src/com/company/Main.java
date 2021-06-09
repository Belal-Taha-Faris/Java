package com.company;
public class Main
{
    public static void main(String[] args)
    {
        int num1 = 25;
        float num2 = (float)16.5;
        float num3 = (float)0.65;
        float sum = num1 + num2 + num3;

        System.out.println("the sum of the given 3 numbers is: " + sum);
        // OR
        System.out.print("the sum of the given 3 numbers is: " + (num1+num2+num3));
    }
}
