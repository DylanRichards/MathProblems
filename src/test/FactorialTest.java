package test;

import main.Factorial;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    private Factorial factorial;

    @Test
    void testCompute(){
        factorial = new Factorial(new Scanner("0"));
        factorial.compute();
        assertEquals(BigInteger.ONE, factorial.getOutput());

        factorial = new Factorial(new Scanner("1"));
        factorial.compute();
        assertEquals(BigInteger.ONE, factorial.getOutput());

        factorial = new Factorial(new Scanner("2"));
        factorial.compute();
        assertEquals(BigInteger.TWO, factorial.getOutput());

        factorial = new Factorial(new Scanner("3"));
        factorial.compute();
        assertEquals(BigInteger.valueOf(6), factorial.getOutput());

        factorial = new Factorial(new Scanner("4"));
        factorial.compute();
        assertEquals(BigInteger.valueOf(24), factorial.getOutput());

        factorial = new Factorial(new Scanner("9"));
        factorial.compute();
        assertEquals(BigInteger.valueOf(362880), factorial.getOutput());

        factorial = new Factorial(new Scanner("abc"));
        factorial.compute();
        assertEquals(BigInteger.ONE, factorial.getOutput());
    }

}