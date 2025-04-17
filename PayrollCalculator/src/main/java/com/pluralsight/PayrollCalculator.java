package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your hours worked: ");
        float workHours = scanner.nextFloat();

        System.out.println("Enter your pay rate: ");
        float payRate = scanner.nextFloat();

        float grossPay = workHours * payRate;

        System.out.println("Employee name: " + name);
        System.out.println("Your Gross pay rate: " + grossPay);

    }
}
