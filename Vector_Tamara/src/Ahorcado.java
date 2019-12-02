import java.util.*;
 
public class Ahorcado {
 
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
//palabras del juego
String palabras[]={"hola","chao","duoc","corazon","automovil"};
//para comparar la palabra formada con las letras ingresas y la variable palabraJuego
String palabraFinal = "";
//entrada de letras desde teclado
Scanner entrada=new Scanner(System.in);
//palabra al azar sacada del array palabras
String palabraJuego= palabras[(int) (Math.random()*palabras.length)];
String letrasPalabras[] =new String[palabraJuego.length()];
//variable para almacenar los * de la palabra
String palabraOculta="";
//array para separar palabra por letras
String palabraresp[]=new String[palabraJuego.length()];
//transformando la palabra dependiendo de su largo a la cantidad de *
for(int i=0;i<palabraJuego.length();i++){
letrasPalabras[i]=String.valueOf(palabraJuego.charAt(i));
palabraOculta=palabraOculta+"*";
palabraresp[i]="*";
 
}
//inicio del juego
System.out.println("Busque la Palabra...");
System.out.println();
//muestro la los * correspondientes a la palabra oculta
System.out.println(palabraOculta);
 
//vidas
int vidas=5;
//letras ingredas por el jugador
String letraIngresada[]=new String[100];
 
// inicio del ingreso de letras llenando el array de letras ingresadas por el jugador
for(int q=0;q<letraIngresada.length;q++){
System.out.println("Ingrese una letra: ");
letraIngresada[q]=entrada.nextLine().toLowerCase();
//pariendo desde la 2ª letra ingresadacomparo con las que voy ingresando y advierto
//al jugador sies que ya ha ingresado una letra mas de una vez
if(q>=1){
for(int a=0;a<q;a++){
if(letraIngresada[a].equalsIgnoreCase(letraIngresada[q])){
System.err.println("Ya Ingresaste esa letra, Intenta denuevo...");
 
}}}
 
//si la palabra contiene la letra ingresada...
if(palabraJuego.contains(letraIngresada[q])==true){
 
//si lo que se ingresa es acertivamente la palabra fin de juego Jugador Gana
if(palabraJuego.equalsIgnoreCase(letraIngresada[q])){
 
System.out.println("GANASTE, La palabra oculta era: "+palabraJuego);
System.exit(0);
}
//recorro la palabra del juego y comparo si las letras ingresadas con las de la palabra
// y reemplazo la letra en la posicion que corresponde dentro del arreglo
for(int e=0;e<palabraJuego.length();e++){
if(letraIngresada[q].equalsIgnoreCase(letrasPalabras[e])){
palabraresp[e]=letraIngresada[q];
 
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
//si lo anterior no se cumple advierto de que la letra no se encuentra y resto una vida de un total de 5
System.out.println("no esta, una vida menos");
vidas--;
//ademas advierto mostrando el estado acual de las letras descubiertas hasta el momento
String palabraL="";
for(int z=0;z<palabraJuego.length();z++){
palabraL=palabraL+palabraresp[z];
 
}
//muestro las letras descubiertas en la palabraOculta hasta el momento
System.out.println(palabraL);
System.out.println();
//si se acaban las vidas termina el juego
if(vidas==0){
System.out.println("GAME OVER!");
System.out.println("PERDISTE, La palabra oculta era: "+palabraJuego);
System.exit(0);
}
}
//si la palabraFinal llenada despues de cada letra acertada es igual a la palabraJuego, el jugador Gana!
if(palabraFinal.equalsIgnoreCase(palabraJuego)){
 
System.out.println("GANASTE, La palabra oculta era: "+palabraJuego);
System.exit(0);
}
 
} }
 
}