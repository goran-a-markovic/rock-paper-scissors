package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner game = new Scanner(System.in);
        String flag = "yes";
        int score1 = 0;
        int score2 = 0;

        System.out.println("Hello, welcome to the game!");
        System.out.println("Your name?");
        String name1 = game.nextLine();
        System.out.println("Your name, player 2?");
        String name2 = game.nextLine();

        while (!flag.equals("no")) {
            System.out.println("Your choice?");
            String choice1 = game.nextLine();
            System.out.println("Your choice, player 2?");
            String choice2 = game.nextLine();


            if (choice1.equals("paper")) {
                if (choice2.equals(choice1)) {
                    System.out.println("It's a tie");
                } else if (choice2.equals("scissors")) {
                    System.out.println(name2 + " won");
                    score2++;
                    System.out.println(score1 + " : " + score2);
                } else {
                    System.out.println(name1 + " won");
                    score1++;
                    System.out.println(score1 + " : " + score2);
                }
            } else if (choice1.equals("rock")) {
                if (choice2.equals(choice1)) {
                    System.out.println("It's a tie");
                } else if (choice2.equals("scissors")) {
                    System.out.println(name1 + " won");
                    score1++;
                    System.out.println(score1 + " : " + score2);
                } else {
                    System.out.println(name2 + " won");
                    score2++;
                    System.out.println(score1 + " : " + score2);
                }
            } else {
                if (choice2.equals(choice1)) {
                    System.out.println("It's a tie");
                } else if (choice2.equals("paper")) {
                    System.out.println(name1 + " won");
                    score1++;
                    System.out.println(score1 + " : " + score2);
                } else {
                    System.out.println(name2 + " won");
                    score2++;
                    System.out.println(score1 + " : " + score2);
                }
            }
            System.out.println("One more?");
            flag = game.nextLine();

        }
    }
}
