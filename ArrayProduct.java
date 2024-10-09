package JavaProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayProduct {
    
	// Recursive method to find the product of elements in the array
    public static double product(double[] numbers, int index) {
        
    	// Base case: if last element reached then return 1
        if (index == numbers.length) {
            return 1;
        }
        // Recursive case: product of array
        return numbers[index] * product(numbers, index + 1);
    }

    public static void main(String[] args) {
        
    	Scanner scnr = new Scanner(System.in);
    	double[] numbers = new double[5];
    	
    	// Loop for user to input the 5 integers
    	for (int i = 0; i < 5; i++) {
    		boolean validIP = false;
    	
    		// Ensuring inputs are valid
    		while (!validIP) {
    			try {
    				System.out.print("Enter integer " +(i+1) +":");
    				numbers[i] = scnr.nextDouble();
    				validIP = true;
    			} catch (InputMismatchException e) {
    				System.out.println("Invalid input.");
    				scnr.next();
    			}
    		}
    	}
    	
    	// Calculate the array product using method and display
    	double product = product(numbers,0);
    	
    	System.out.print("\nThe product of the array is: " +product);
    	
    	scnr.close();
    }
}