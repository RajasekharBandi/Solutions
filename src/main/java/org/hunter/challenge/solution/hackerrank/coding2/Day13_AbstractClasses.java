package org.hunter.challenge.solution.hackerrank.coding2;

import java.util.Scanner;

/**
 * Created by Hunter on 5/04/2018.
 */


public class Day13_AbstractClasses extends Book {
    int price;

    Day13_AbstractClasses(String title, String author, int price) {
        super(title, author);
        this.price = price;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new Day13_AbstractClasses(title, author, price);
        book.display();
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}
