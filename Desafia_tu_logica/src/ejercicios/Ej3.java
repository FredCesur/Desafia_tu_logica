package ejercicios;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una opción: ");
		System.out.println("1. Múltiplos de 2");
		System.out.println("2. Múltiplos de 3");
		int opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			for(int contador = 0; contador <= 100; contador++) {
				int resultado = 2 * contador;
				System.out.println(resultado);
			}
			break;
		case 2:
			for(int contador = 0; contador <= 100; contador++) {
				int resultado = contador * 3;
				System.out.println(resultado);
			}
			break;
		}
		sc.close();
	}
}
