package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Create two variables to represent the salary for Bob and Gary. Create a new variable named highestSalary.
        // Determine whose salary is greater using MAth.max() and store the answer in highestSalary.
        double bobSalary = 55000.0;
        double garySalary = 62000.0;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary belongs to " + highestSalary + " congratulations!");

        //Find and display the smallest of two variables names carPrice and truckPrice.
        double carPrice = 50000.0;
        double truckPrice = 620000.0;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The Vehicle with the lowest price is: " + lowestPrice);

        //Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the vehicle is: " + area);

        //Find and display the square root a variable after it is set to 5.0
        double value = 5.0;
        double squareRoot = Math.sqrt(value);
        System.out.println("The square root of " + value + "is: " + squareRoot);

        //Find and display the distance between the points (5,10) and (85,50)
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is: " + distance);

        //Find and display the absolute (positive) value of a variable after it is set to -3.8
        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("The absolute value is: " + absoluteValue);

        //Find and display a random number between 0 and 1.
        double random = Math.random();
        System.out.println("The random number between 0 and 1: " + random);



    }
}
