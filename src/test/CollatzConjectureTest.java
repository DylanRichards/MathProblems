package test;

import main.CollatzConjecture;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CollatzConjectureTest {

    private CollatzConjecture collatzConjecture;

    @Test
    void compute() {
        collatzConjecture = new CollatzConjecture(new Scanner("7"));
        collatzConjecture.compute();
        assertEquals(16, collatzConjecture.getIterations());

        collatzConjecture = new CollatzConjecture(new Scanner("-1"));
        collatzConjecture.compute();
        assertEquals(0, collatzConjecture.getIterations());

        collatzConjecture = new CollatzConjecture(new Scanner("0"));
        collatzConjecture.compute();
        assertEquals(0, collatzConjecture.getIterations());

        collatzConjecture = new CollatzConjecture(new Scanner("1"));
        collatzConjecture.compute();
        assertEquals(0, collatzConjecture.getIterations());

        collatzConjecture = new CollatzConjecture(new Scanner("2"));
        collatzConjecture.compute();
        assertEquals(1, collatzConjecture.getIterations());

        collatzConjecture = new CollatzConjecture(new Scanner("abc"));
        collatzConjecture.compute();
        assertEquals(0, collatzConjecture.getIterations());
    }

}