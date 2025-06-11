package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask for the firstName
        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine().trim();
        //Ask for the middleName
        System.out.print("Enter the middle name: ");
        String middleName = scanner.nextLine().trim();
        //Ask for the lastName
        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine().trim();
        //Ask for the Suffix
        System.out.println("Enter suffix: ");
        String suffix = scanner.nextLine().trim();

        StringBuilder fullName = new StringBuilder();

        fullName.append(firstName).append(" ");

        if (!middleName.isEmpty()) {
            fullName.append(middleName).append(" ");
        }

        fullName.append(lastName);

        if (!suffix.isEmpty());{
           fullName.append(suffix).append(" ");
        }

        System.out.println("\nFull name: " + fullName);

    scanner.close();
    }
}

