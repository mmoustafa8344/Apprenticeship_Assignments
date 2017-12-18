/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.codingchallenges;
//
/**
 *
 * @author jesse
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jesse
 */
public class RockPaperScissors {

    public static void main(String[] args) {

        String stringNumRounds, stringChoice;
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        int ties = 0;
        int numRounds = 0;
        int wins = 0;
        int losses = 0;
        int choice = 0;

        Scanner myScanner = new Scanner(System.in);

        Random randomizer = new Random();
        //int randNum = randomizer.nextInt(2);

        System.out.println("Play a Game with me!");
        System.out.println("Rock, Paper or Scissors!!!");
        System.out.println("How many rounds do you want to play?");
        stringNumRounds = myScanner.nextLine();
        numRounds = Integer.parseInt(stringNumRounds);

        if (numRounds < 1 || numRounds > 10) {
            System.out.println("<Error>");
            System.out.println("<Run Program again>");
            System.out.println("You can only choose between 1-10 rounds");

        } else {
            
            while(numRounds >0 && numRounds < 10){

        for (int i = 0; i < numRounds && i < 10; i++) {

            int randNum = randomizer.nextInt(2);

            System.out.println("What do you choose rock, paper, or scissors?");
            stringChoice = myScanner.nextLine();

            if (stringChoice.equalsIgnoreCase("r")) {
                choice = rock;

                if (choice == randNum) {
                    ties++;

                } else if (randNum == paper) {
                    losses++;

                } else if (randNum == scissors) {
                    wins++;
                }
                
                        calculateWinner(wins, losses);
                        

            } else if (stringChoice.equalsIgnoreCase("p")) {
                choice = paper;

                if (choice == randNum) {
                    ties++;

                } else if (randNum == scissors) {
                    losses++;

                } else if (randNum == rock) {
                    wins++;
                }
                
                        calculateWinner(wins, losses);


            } else if (stringChoice.equalsIgnoreCase("s")) {
                choice = scissors;

                if (choice == randNum) {
                    ties++;

                } else if (randNum == rock) {
                    losses++;

                } else if (randNum == scissors) {
                    wins++;
                } 
                
                     calculateWinner(wins, losses);

                
            } else {
                     System.out.println("Not Valid Try Again");
                     i--;
            
            }  
        }
         System.out.println("You won " + wins + " against me");
                System.out.println("You lost " + losses + " against me");
                System.out.println("You tied " + ties + " against the me");

                if (wins > losses) {
                    System.out.println("You are the winner congrats!!");
                    wins = 0;
                    losses = 0;
                    ties = 0;
                } else if (wins < losses) {
                    System.out.println("Sorry you lost");
                    wins = 0;
                    losses = 0;
                    ties = 0;
                } else if (wins == losses) {
                    System.out.println("We've tied");
                    wins = 0;
                    ties = 0;
                    losses = 0;
                }
                
                
            System.out.println("Do you want to play again?");
            System.out.println("If so, how many times? \n Only 1 to 10 rounds \n(Enter 0 to exit)");
            stringNumRounds = myScanner.nextLine();
            numRounds = Integer.parseInt(stringNumRounds);
         System.out.println("Thanks for playing");
      }
    }
  }

    public static void calculateWinner(int wins, int losses) {
        if (wins > losses) {
            System.out.println("You Won this Round");
        } else if (wins < losses) {
            System.out.println("Sorry you lost this Rounds");
        } else {
            System.out.println("We've tied");
        }
    }
}