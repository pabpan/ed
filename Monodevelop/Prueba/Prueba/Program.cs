using System;

namespace Prueba
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.Write("Introduce tu nombre: ");
            String nombre = Console.ReadLine();
            Console.WriteLine("Nombre " + nombre + "\n");

            Console.Write("Introduce tu edad: ");
            int edad = int.Parse(Console.ReadLine());
            Console.WriteLine("Edad: " + edad + "\n");

            Console.Write("Introduce un número: ");
            double num1 = int.Parse(Console.ReadLine());
            Console.Write("Introduce otro número: ");
            double num2 = int.Parse(Console.ReadLine());
            double suma = num1 + num2;
            double resta = num1 - num2;
            double division = num1 / num2;
            double resto = num1 % num2;
            Console.Write("La suma es: " + suma + "\n");
            Console.Write("La resta es: " + resta + "\n");
            Console.Write("La división es: " + division + "\n");
            Console.Write("El resto de la división es: " + resto + "\n");


            /*Console.Write("Dime el largo del vector: ");
            int largo = int.Parse(Console.ReadLine());
            int[] v = new int[largo];
            Random aleatorios = new Random(largo);
            for ( int y=0; y<v.Length; y++)
            {
                v[y] = int.Parse(aleatorios);
            }

            Console.Write("¿Qué numero quieres buscar dentro del vector?");
            int numero = int.Parse(Console.ReadLine());
            Console.Write("Vamos a recorrer el vector");
            for (int x = 0; x < v.Length; x++)
                v[x] = numero;
            {
                if (x == aleatorios)
                {
                    Console.Write("El número " + numero + " existe");
                }
                else
                {
                    Console.Write("El número " + numero + " no existe");
                }
            }*/
            
        }
    }
}
