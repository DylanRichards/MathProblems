package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CollatzConjecture collatzConjecture = new CollatzConjecture(new Scanner(System.in));
        collatzConjecture.compute();
    }

}
