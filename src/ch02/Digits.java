/*
 * Split digits of a 4-digit number entered from keyboard and print each digit on consecutive lines
 * 
 * @author	S. Arda Bölük
 * @date	2015/01/15 
 * 
 */

package ch02;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);		
		System.out.println("Please enter a four-digit number:");

		int number = keyboard.nextInt();

		System.out.println("The first number is: " + number / 1000);
		number = number % 1000;
		System.out.println("The second number is: " + number / 100);
		number = number % 100;
		System.out.println("The third number is: " + number / 10);
		number = number % 10;
		System.out.println("The fourth number is: " + number);

		keyboard.close();	
		
	}
}
