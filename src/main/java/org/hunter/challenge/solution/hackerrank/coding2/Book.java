package org.hunter.challenge.solution.hackerrank.coding2;
/**
 * Created by Hunter on 5/04/2018.
 */

import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
