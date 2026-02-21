package org.example.abhinandanBasu;

import java.util.Scanner;

//sum of Digit

public class Sum_of_Digit {
    public static long sum_of_Digit(long n)
    {
        long x = Math.abs(n);
        int sum =0;
        while(x>0)
        {
            sum= sum+(int)(x%10);
            x=x/10;

        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = sc.nextLong();
        System.out.println("Sum of Digit: " +sum_of_Digit(n));

    }
}
