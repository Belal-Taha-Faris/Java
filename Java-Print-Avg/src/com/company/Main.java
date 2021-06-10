package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double n1,n2,n3,avg;
        Scanner x = new Scanner (System.in);
        System.out.println("Enter three numbers to get the Average : ");
        n1 = x.nextDouble();
        n2 = x.nextDouble();
        n3 = x.nextDouble();
        avg = (n1+n2+n3)/3;
        System.out.println("The Avg of the taken numbers is : " + avg);
        //OR
        System.out.println("The Avg of the taken numbers is : " + ((n1+n2+n3)/3));
    }
}