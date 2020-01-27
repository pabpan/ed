
import java.util.Random;
import java.util.Scanner; 

public class JAdivina2 {

	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in); /*INICIALIZAMOS EL TECLADO*/

	Random random = new Random();
	int numeroaleatorio=random.nextInt(1000) + 1;
	int numerointroducido;
	int extremoizquierdo=1;
	int extremoderecho=1000;
	int contadorintentos=0;

	System.out.println("Número aleatorio = "+numeroaleatorio);

	do {
		contadorintentos++;
		System.out.printf("Adivina el número [intentos %s] (entre %s y %s): ", contadorintentos, extremoizquierdo, extremoderecho);
		numerointroducido=teclado.nextInt();
		
		if (numerointroducido < numeroaleatorio)
			extremoizquierdo=numerointroducido+1;
		
			else if (numerointroducido > numeroaleatorio)
				extremoderecho=numerointroducido-1;

		}
	while (numerointroducido != numeroaleatorio);
			System.out.printf("¡¡Enhorabuena, has acertado en %s intentos. %n!!", contadorintentos);
	
	teclado.close();
	}
}
