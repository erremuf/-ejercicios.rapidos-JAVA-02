package com.aepi;

import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		
		int dia, mes, year;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("\nIntroduce la fecha de tu cumpleaños \nDia: ");
		dia = lector.nextInt();
		
		System.out.println("\nMes: ");
		mes = lector.nextInt();
		
		System.out.println("\n Año: ");
		year = lector.nextInt();
		
		if ((dia > 0 && dia <= 30) && (mes >= 1 && mes <=12) && (year >= 0 && year <= 2022)) {
			System.out.println("\nLa fecha introducida es correcta");
		}else {
			System.out.println("\nLa fecha introducida no es correcta, por favor introduce una fecha válida. (00/00/0000");
		}
	}

}
