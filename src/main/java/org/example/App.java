package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();
        int slices = people * pizzas;
        System.out.println(people + " people with " + pizzas + " pizzas ("+ slices + " slices)");
        int each = slices / people;

        System.out.println("Each person gets " + each + " pieces of pizzas.");
        int leftOver = slices % people;
        System.out.println("There are " + leftOver + "left over pieces.");
    }
}
