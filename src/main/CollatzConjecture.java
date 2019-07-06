package main;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Collatz_conjecture">Wikipedia Link</a>
 */
public class CollatzConjecture implements MathRunnable{

    private BigInteger input;
    private int iterations;

    public CollatzConjecture(Scanner scanner){
        gatherInput(scanner);
    }

    private void gatherInput(Scanner scanner) {
        System.out.print("Enter a positive number: ");

        BigInteger input = BigInteger.ZERO;
        try {
            input = scanner.nextBigInteger();
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Input not a number");
        }

        System.out.println(input);
        setInput(input);
    }

    @Override
    public void compute() {
        while (!input.equals(BigInteger.ONE)) {
            input = (input.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) ?
                    input.divide(BigInteger.TWO) : input.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            System.out.println(input);
            iterations++;
        }
        System.out.printf("Iterations: %d\n", iterations);
    }

    public void setInput(BigInteger input){
        this.input = input.compareTo(BigInteger.ZERO) > 0 ? input : BigInteger.ONE;
    }

    public int getIterations(){
        return iterations;
    }

}
