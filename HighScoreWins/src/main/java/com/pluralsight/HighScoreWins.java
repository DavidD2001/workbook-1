package com.pluralsight;
import java.util.Scanner;
public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Step 1: Ask for the score input
        System.out.println("Please enter a game score (Home:Visitor|21:9 format): ");
        String input = scanner.nextLine().trim();

        //Step 2: Split on the pipe to separate teams from scores
        String[] parts = input.split("\\|");

        System.out.println("DEBUG: input = " + input);
        System.out.println("DEBUG: parts.length = " + parts.length);

        //Step 3: Split team names
        String[] teams = parts[0].split(":");
        String team1 = teams[0];
        String team2 = teams[1];

        //Step 4: split scores
        String[] scores = parts[1].split(":");
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        //Step 5: Compare scores and determine the winner
        String winner;
        if (score1 > score2) {
            winner = team1;
        }else if (score2 > score1) {
            winner = team2;
        }else {
            winner = "It's a tie!";
        }
        System.out.println("Winner is: " + winner);
        scanner.close();



        }

    }
