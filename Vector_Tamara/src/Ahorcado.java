

import java.util.*;
 
public class Ahorcado {
 
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		String palabras[]={"hola","chao","duoc","corazon","automovil"}; //PALABRAS DEL JUEGO
//para comparar la palabra formada con las letras ingresas y la variable palabraJuego
		String palabraFinal = "";
		String palabraJuego= palabras[(int) (Math.random()*palabras.length)]; //PALABRA ALEATORIA CON LA QUE JUGAR
		String letrasPalabras[] =new String[palabraJuego.length()];
//variable para almacenar los * de la palabra
		String palabraOculta="";
//array para separar palabra por letras
		String palabraresp[]=new String[palabraJuego.length()];
		int intentos=5;
		String palabraL="";


		for(int i=0;i<palabraJuego.length();i++){ //TRANSFORMA LA PALABRA A RAYAS
			letrasPalabras[i]=String.valueOf(palabraJuego.charAt(i));
			palabraOculta=palabraOculta+" _ ";
			palabraresp[i]=" _ ";
		}
		
		System.out.println("BIENVENIDO AL AHORCADO! AVIDIVINA LA PALABRA OCULTA!");
		System.out.println();
		System.out.println(palabraOculta); //PALABRA OCULTA
		System.out.println();

	String letrausuario[]=new String[100]; //letras ingredas por el jugador
 
// inicio del ingreso de letras llenando el array de letras ingresadas por el jugador
	for(int q=0;q<letrausuario.length;q++){
		System.out.println("INTROODUCE UNA LETRA: ");
		System.out.println();
		letrausuario[q]=teclado.nextLine().toLowerCase();
//pariendo desde la 2ª letra ingresadacomparo con las que voy ingresando y advierto
	
		if(q>=1){  //ERROR SI LA LETRA YA SE HA INGRESADO
			for(int a=0;a<q;a++){
				if(letrausuario[a].equalsIgnoreCase(letrausuario[q])){ //Compara la cadena de texto contra un objeto ignorando mayúsculas y minúsculas. 
					//Devolverá true si las cadenas comparadas son iguales. En caso contrario devolverá false. 
					System.err.println("YA HAS INTRODUCIDO ESA LETRA, INTENTA CON OTRA!");
				}
			}
		}
 
//si la palabra contiene la letra ingresada...
		if(palabraJuego.contains(letrausuario[q])==true){
 
//si lo que se ingresa es acertivamente la palabra fin de juego Jugador Gana
			if(palabraJuego.equalsIgnoreCase(letrausuario[q])){
				System.out.println("HAS GANADO! LA PALABRA OCULTA ERA: "+palabraJuego);
				System.exit(0);
			}
//recorro la palabra del juego y comparo si las letras ingresadas con las de la palabra
// y reemplazo la letra en la posicion que corresponde dentro del arreglo
				for(int e=0;e<palabraJuego.length();e++){
					if(letrausuario[q].equalsIgnoreCase(letrasPalabras[e])){
					palabraresp[e]=letrausuario[q];
					}
				}
			//guardo cada posicion del array de letras correctas y las meto solo en una variable tipo String
			String palabraW="";
			for(int z=0;z<palabraJuego.length();z++){
			palabraW=palabraW+palabraresp[z];
			 
			}
			//voy actualizando la variable cada vez que ingreso una letra para ir comparando si es = a la palabra original
			palabraFinal=palabraW;
			//muestro al jugador las letras que lleva acertadas en la posicion ej: **e**
			System.out.println(palabraW);
			System.out.println();
 
		}else{
				System.err.println("LA LETRA NO ESTÁ, TIENES UNA VIDA MENOS!"); //
				intentos--; //UNA VIDA MENOS
	//ademas advierto mostrando el estado acual de las letras descubiertas hasta el momento
					for(int z=0;z<palabraJuego.length();z++){
					palabraL=palabraL+palabraresp[z];
					}
	//muestro las letras descubiertas en la palabraOculta hasta el momento
					System.out.println(palabraL);
					System.out.println();
	//si se acaban las vidas termina el juego
					if(intentos==0){
						System.out.println("GAME OVER!");
						System.out.println("PERDISTE, La palabra oculta era: "+palabraJuego);
					}
			}
//si la palabraFinal llenada despues de cada letra acertada es igual a la palabraJuego, el jugador Gana!
		if(palabraFinal.equalsIgnoreCase(palabraJuego)){
			System.out.println("HAS GANADO! LA PALABRA OCULTA ERA: "+palabraJuego);
		}
 
	} 
}
 
}