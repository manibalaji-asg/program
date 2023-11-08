package test3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer (N): ");
        int N = scanner.nextInt();

        // Checking if the input is negative or zero
        if (N < 0) {
            System.out.println("Error");
        } else if (N == 0) {
            System.out.println("0");
        } else {
            // Calculating and printing the Nth term of the series
            int nthTerm = N * N;
            System.out.println("The " + N + "th term in the series is: " + nthTerm);
        }

	}

}
