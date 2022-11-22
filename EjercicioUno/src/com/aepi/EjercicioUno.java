package com.aepi;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		// PEDIR UN NÚMERO DEL 0 AL 9999 Y MOSTRARLO CON LAS CIFRAS AL REVÉS

		Scanner scanner = new Scanner(System.in);
		int num;
		int a, b, c, d;


		do {
			
			System.out.print("\nIntroduzca un número entre 0 y 9.999: ");
			num = scanner.nextInt();
			
			// El resto de dividir un número entre 10 es el último dígito del número.
			d = num % 10;
			c = (num / 10) % 10;
			b = (num / 100) % 10;
			a = (num / 1000) % 10;

			if (num > 0 && num < 10) {	
				System.out.println("\n" + num + " al revés es: " + d);
				
			} else if (num >= 10 && num < 100) {				
				System.out.println("\n" + num + " al revés es: " + d + " " + c);
				
			} else if (num >= 100 && num < 1000) {				
				System.out.println("\n" + num + " al revés es: " + d + " " + c + " " + b);
				
			} else if (num >= 1000 && num < 10000) {				
				System.out.println("\n" + num + " al revés es: " + d + " " + c + " " + b + " " + a);
				
			} else {			
				System.out.println("\nIntroduce un número correcto");
				
			}
			
		} while (num > 0 && num < 10000);
		

	}

}
