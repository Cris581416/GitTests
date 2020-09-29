/*
triangleExample.java

iNoobBoi

Prints a simple 45-45-90 right triangle using FOR loops
*/

import java.util.Scanner;

public class triangleExample {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a leg length of your 45-45-90 triangle: ");
		int leg = input.nextInt();
		
		if (leg < 0) {
			throw new IllegalArgumentException("Cannot make triangle of leg length " + leg);
			} //if it is negative, then break literally everything
			
		leg++; //adds one to leg because otherwise it would have 1 less than the requested leg length
		
		for (int i = 0; i < leg; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("#");
				} //prints the width of the triangle
			
			System.out.println(); //new line
			} //prints the height of the triangle
		}
	}