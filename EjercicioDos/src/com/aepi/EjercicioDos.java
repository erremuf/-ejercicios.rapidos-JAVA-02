package com.aepi;

import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		int nota;
		
		System.out.println("\nINTRODUCE TU NOTA");
		
		nota = lector.nextInt();
		
		if(nota >= 0 && nota <=5) {
			System.out.println("\nTu nota final es INSUFICIENTE");
		}else if(nota == 5) {
			System.out.println("\nTu nota final es SUFICIENTE");
		}else if(nota == 6) {
			System.out.println("\nTu nota final es BIEN");
		}else if(nota == 7 || nota == 8) {
			System.out.println("\nTu nota final es NOTABLE");
		}else if(nota == 9 || nota == 10) {
			System.out.println("\nTu nota final es SOBRESALIENTE");
		}else {
			System.out.println("\nDEBES INTRODUCIR UNA NOTA NUMÉRICA DEL 1 AL 10");
		}
	}

}
