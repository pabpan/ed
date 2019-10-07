 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 07/10/2019
 * DESC.: ADIVINA
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/

import java.util.Scanner; 

public class Adivina {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); /*INICIALIZAMOS EL TECLADO*/


		int num=1;
		
		while (num!=0) {
			System.out.print("Introduce un número (0 para terminar): \n");
				num=teclado.nextInt();
		}
		System.out.println("Fin del programa");

		/*
		System.out.println("Introduce un número: ");
		num=teclado.nextInt();
		
		if (num==aleatorio) 
			System.out.println("El número introducido es igual al aleatorio");
		else if (num<aleatorio)
			System.out.println("El número no es el aleatorio");
			else (num>aleatorio)
				System.out.println("El número no es el aleatorio");
		else	*/	
	}

}
