

public class Vector {

	public static void main(String[] args) {

		int vector[]= {21,14,9,18,3};
		ordenar(vector);
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");	
			if (i<vector.length-1) {
				System.out.print(", ");	
			}
		}
			
	}
	
	public static int maximo(int[] v) {
		
		int maximo = v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i] > maximo)
				maximo = v[i];		
		}return maximo;
		
		
	}

	public static int[] ordenar(int[] v) {
		int aux;
		for (int j = 0; j < v.length; j++) {
			for (int i = 0; i < v.length-j-1; i++) {
				if (v[i]>v[i+1]) {
				aux = v[i+1];
				v[i+1]=v[i];
				v[i]=aux;
			}}
				
		}return v;	
	}
}