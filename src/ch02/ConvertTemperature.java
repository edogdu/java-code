/*
 * Convert temperature in Celsius to Fahrenheit
 * 
 * @author	S. Arda Bölük
 * @date	2015/01/15 
 */

package ch02;

import java.util.*;

public class ConvertTemperature {

	public static void main(String[] args) {
		
		int celsius;
		double fahrenheit;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter temperature in Celsius: ");
		
		celsius = keyboard.nextInt();
		fahrenheit = (9 * celsius) / 5.0 + 32;
		
		System.out.println(celsius + " degree Celcius is " + fahrenheit + " degree Fahrenheit");
		
		keyboard.close();
	}

}

