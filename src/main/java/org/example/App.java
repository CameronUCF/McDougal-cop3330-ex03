/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = scanner.nextLine();

        System.out.println("Who said it?");
        String author = scanner.nextLine();

        scanner.close();

        System.out.println(author + " says, \"" + quote + "\"");
    }
}
