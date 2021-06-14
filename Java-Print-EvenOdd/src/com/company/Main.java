package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
	    Scanner x = new Scanner(System.in);
        int [] num = new int[10];
        int [] even;
        int []odd;
	    System.out.println("Enter 10 Digits to extract even and odd between them : ");
	    for (int i = 0; i < num.length; i++)
	    {
	        num [i] = x.nextInt();
        }
        System.out.println("Even numbers is: ");
	    for (int i = 0; i < num.length; i++)
        {
            if (num[i] % 2 == 0)
            {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println("\nOdd numbers is: ");
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] % 3 == 0 || num[i] == 1)
            {
                System.out.print(num[i] + " ");
            }
        }
    }
}
