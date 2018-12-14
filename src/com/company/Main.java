package com.company;

import java.util.Scanner

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("What is your name?);
	String name = input.nextLine();
	System.out.println("Hello " + name + ", how are you?");
	System.out.println("How old are you " + name + "?");
	int age = input.nextInt();
	System.out.println("You are " + name + "and you are " + age + "years old.");
    }
}
