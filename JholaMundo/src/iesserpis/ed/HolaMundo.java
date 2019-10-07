package iesserpis.ed;

import java.util.Scanner;

public class HolaMundo {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Introduce tu edad: ");
		int edad = scanner.nextInt();
		System.out.print("Hola " + nombre + " el año que viene tendrás " + (edad + 1) + ".");
		
		
	}
}
