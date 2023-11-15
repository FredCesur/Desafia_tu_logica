package ejercicios;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = -1;
		//Bucle while encargado de pedir un número positivo y decir sus 20 números sucesivos
		while(numero < 0) {
			System.out.print("Introduce un numero positivo: ");
			numero = sc.nextInt();
			if(numero >= 0) {
				for(int contador = 0; contador <= 20; contador++) {
					numero++;
					System.out.println(numero);
				}
			}
		}
		sc.close();
	}
}
