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
		
		//Switch encargado de dar a elegir al usuario si quiere el orden de los números en ascendente o descendente
		switch(opcion) {
		//Case 1 verifica a través de varios if else if si el numero 1,2 y 3 son menores o mayores y los imprime, esto devuelve orden descendente
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
			
		//Case 2 verifica a través de varios if else if si el numero 1,2 y 3 son menores o mayores y los imprime, esto devuelve orden ascendente
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
