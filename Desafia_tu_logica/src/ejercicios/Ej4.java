package ejercicios;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero1 = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		int numero2 = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		int numero3 = sc.nextInt();

		System.out.println("Elija una opción:");
		System.out.println("1. Orden descendente");
		System.out.println("2. Orden ascendente");
		int opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			if(numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
				System.out.print(numero1 + " " + numero2 + " " + numero3);
			}else if(numero1 > numero2 && numero1 > numero3 && numero2 < numero3) {
				System.out.print(numero1 + " " + numero3 + " " + numero2);
			}else if(numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
				System.out.print(numero2 + " " + numero1 + " " + numero3);
			}else if(numero2 > numero1 && numero2 > numero3 && numero1 < numero3) {
				System.out.print(numero2 + " " + numero3 + " " + numero1);
			}else if(numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
				System.out.print(numero3 + " " + numero1 + " " + numero2);
			}else if(numero3 > numero1 && numero3 > numero2 && numero1 < numero2) {
				System.out.print(numero3 + " " + numero2 + " " + numero1);
			}
			break;
		case 2:
			if(numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
				System.out.print(numero3 + " " + numero2 + " " + numero1);
			}else if(numero1 > numero2 && numero1 > numero3 && numero2 < numero3) {
				System.out.print(numero2 + " " + numero3 + " " + numero1);
			}else if(numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
				System.out.print(numero3 + " " + numero1 + " " + numero2);
			}else if(numero2 > numero1 && numero2 > numero3 && numero1 < numero3) {
				System.out.print(numero1 + " " + numero3 + " " + numero2);
			}else if(numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
				System.out.print(numero2 + " " + numero1 + " " + numero3);
			}else if(numero3 > numero1 && numero3 > numero2 && numero1 < numero2) {
				System.out.print(numero1 + " " + numero2 + " " + numero3);
			}
			break;
		}
		sc.close();
	}
	
}
