package com.pluralsight;
import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Step 1: Ask user for input
        System.out.println("Please enter your full name: ");
        String input = scanner.nextLine().trim();//2 trim the leading or trailing spaces

        //Step 3: Split the name by spaces.
        String[] nameParts = input.split("\\s+");//handles multiple spaces

        //Step 4: Identify and display parts
        if (nameParts.length ==2) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + nameParts[1]);
        } else if (nameParts.length == 3) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: " + nameParts[1]);
            System.out.println("Last name: " + nameParts[2]);
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();





    }
}