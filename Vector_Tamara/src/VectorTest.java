import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	/*@Test
	void maximo() {
		assertEquals(21, Vector.maximo(new int[] {14,21,8,9}));
		assertEquals(21, Vector.maximo(new int[] {21,8,9,21}));
		assertEquals(21, Vector.maximo(new int[] {8,9,16,21}));
		assertEquals(21, Vector.maximo(new int[] {0,21}));
	}*/
	
	@Test
	void ordenar() {
 
		assertArrayEquals(new int[] {1,2,3,5}, Vector.ordenar(new int[] {3,5,2,1}));
	}

}
