package main;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial implements MathRunnable{

    private BigInteger input;
    private BigInteger output = BigInteger.ZERO;

    public Factorial(Scanner scanner){
        gatherInput(scanner);
    }

    private void gatherInput(Scanner scanner) {
        System.out.print("Enter a positive number to find Factorial: ");

        BigInteger input = BigInteger.ZERO;
        try {
            input = scanner.nextBigInteger();
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Input not a number");
        }

        setInput(input);
    }

    @Override
    public void compute() {
        boolean calculate = true;

        if (input.equals(BigInteger.ONE) || input.equals(BigInteger.ZERO)) {
            output = BigInteger.ONE;
            calculate = false;
        } else {
            output = input.multiply(input.subtract(BigInteger.ONE));
            input = input.subtract(BigInteger.ONE);
        }

        while(calculate) {
            if (input.equals(BigInteger.ONE) || input.equals(BigInteger.ZERO)) {
                break;
            }
            input = input.subtract(BigInteger.ONE);
            output = output.multiply(input);
        }

        System.out.printf("The factorial is %d\n", output);
    }

    public void setInput(BigInteger input){
        this.input = input.compareTo(BigInteger.ZERO) > 0 ? input : BigInteger.ONE;
    }

    public BigInteger getOutput(){
        return output;
    }

}
