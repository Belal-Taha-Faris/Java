package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner (System.in);
        System.out.println("Please enter length for rectangle :");
        double l = x.nextDouble();
        System.out.println("Please enter width for rectangle :");
        double w = x.nextDouble();

        double area = l*w;
        double perimeter = 2*(l+w);

        System.out.println("The area of rectangle is : " + area);
        System.out.println("The perimeter of rectangle is : "+ perimeter);
    }
}
