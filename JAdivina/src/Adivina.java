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


		int num=1; /*INICIALIZAMOS EL NÚMERO A LEER*/
		
		
		/*MIENTRAS EL NÚMERO SEA DISTINTO DE 0 SEGUIRÁ DENTRO DEL BUCLE*/
		
		while (num!=0) {
			System.out.print("Introduce un número (0 para terminar): \n");
				num=teclado.nextInt();
		}
		System.out.println("Fin del programa");

		teclado.close();
		
	}

}
