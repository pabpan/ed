//PABLO SUÁREZ
//24-10-19
//VECTORES EN JAVA

package iesserpis.ed;

public class Vector {

	public static void main(String[] args) {

		//int[] v = new int[] {17,12,15,9,14};
		
		//for (int index=0; index<5; index++)
		//{
		//	if (v[index]==9)
		//		System.out.printf("está en la posición: "+index);
		//}
			
			//System.out.printf("v[%s](Elemento) = %s %n(valor)", index, v[ index ]);
		
		//int index=0;
		
		//while (index<5) {
		//System.out.println(index);
		//index++;
		//}
		
		
		int[] v = new int[] {17, 12, 15, 9, 14, 9};
		int x=9;
		int posicion;
		
		posicion = indexOf(v, x);
		
		System.out.println("index=" + posicion);
		System.out.println("FIN");
		
		}
		
		public static int indexOf (int[] v, int numero) {
			int index=0;
			while (index < v.length && v[index] != numero)
				index++;
				if (index==v.length)
					return -1;
			return index;
		}

	}
