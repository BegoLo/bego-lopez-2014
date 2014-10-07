/**
 * 
 */
package org.cuatrovientos.bodymassindex;

import java.util.Scanner;

/**
 * @author Bego Lopez
 *
 */
public class BodyMassIndex {

	/**
	 * This program is going to say us if we have a healthy body mass. Its a diagnostic program.
	 * @param args
	 */
	public static void main(String[] args) {
		
		float height = 0f;
		float weight = 0f;
		float imc = 0f;
		
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		//Ask about the heigth 
		System.out.print("Enter a your heigth: ");
		//read for console
		line = reader.nextLine();
		
		//traslate de entered value to float
		height = Float.parseFloat(line);
		
		//Ask about the heigth 
		System.out.print("Enter a your weight: ");
		//read for console
		line = reader.nextLine();
		
		//traslate de entered value to float
		weight = Float.parseFloat(line);
		
		//calculate the IMC
		imc = weight / (height * height);
		System.out.println(imc);
		if (imc < 16) {
			System.out.println("Hay que comer más");
		} else if ((imc >= 16) && (imc < 25)) {
			System.out.println("Estas bien");
		} else if ((imc >= 25) && (imc < 30)) {
			System.out.println("Cuidate un poco");
		} else {
			System.out.println("Vete al hospital");
		}
		
		
	}

}
