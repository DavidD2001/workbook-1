package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String name = getEmployeeName(scanner);
        float hours = getHoursWorked(scanner);
        float rate = getPayRate(scanner);
        float grossPay = calculateGrossPay(hours, rate);

        displayPayStub(name, grossPay);
    }
public static String getEmployeeName(Scanner scanner){
        System.out.print("Enter employee name: ");
        return scanner.nextLine();
}

public static float getHoursWorked(Scanner scanner){
        System.out.print("Enter hours worked: ");
        return scanner.nextFloat();
}

public static float getPayRate(Scanner scanner){
    System.out.print("Enter pay rate: ");
    return scanner.nextFloat();
    }
public static float calculateGrossPay(float hours, float rate) {
       return hours * rate;
}
public static void displayPayStub(String name, float grossPay) {
    System.out.println("\nEmployee name: " + name);
    System.out.println("Your gross pay is: $" + grossPay);
}
public static float calculateTax(float grossPay) {
        return grossPay * 0.2f; //example: 20% tax
}
}

