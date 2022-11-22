package com.aepi;

import java.util.Scanner;

public class EjercicioCuatro {

	public static void main(String[] args) {
		
		// PEDIR UN NÚMERO DEL 0 AL 9999 Y DECIR SI ES CAPICÚA

		Scanner scanner = new Scanner(System.in);
		int num;
		int a, b, c, d;


		do {
			
			System.out.print("\nIntroduzca un número entre 0 y 9.999: ");
			num = scanner.nextInt();
			
			// El resto de dividir un número entre 10 da como resultado el último dígito del número.
			d = num % 10;
			c = (num / 10) % 10;
			b = (num / 100) % 10;
			a = (num / 1000) % 10;

			if (num > 0 && num < 10) {		
				
				System.out.println("\n Realmente necesito al menos 3 cifras para decirte si es capicúa");
				
			} else if (num >= 10 && num < 100) {	
				
				System.out.println("\n Realmente necesito al menos 3 cifras para decirte si es capicúa");
				
			} else if (num >= 100 && num < 1000) {	
				
				if(d == b) {  
					System.out.println("\n" + num + " es capicúa");
				}else {
					System.out.println("\n" + num + " no es capicúa");
				}
				
			} else if (num >= 1000 && num < 10000) {
				
				if(d == a && c == b) {  
					System.out.println("\n" + num + " es capicúa");
				}else {
					System.out.println("\n" + num + " no es capicúa");
				}
				
			} else {	
				
				System.out.println("\nIntroduce un número correcto entre 0 y 9.999");
				
			}

		} while (num > 0 && num < 10000);

	}

}
