package com.company;

import java.util.Scanner;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempts = 3;

        while attempts>0 {


            Random random = new Random();
            int guessnum = random.nextInt(2);
            System.out.println("Guess a number");
            int guess = input.nextInt();


            if (guess == guessnum) {
                System.out.println("Well done!");
            } else {
                System.out.println("Incorrect!");
                attempts = attempts - 1;
            }

        }