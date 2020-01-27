
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VectorTest {
	
	

	@Test
	void maximo() {
		assertEquals(21, Vector.maximo(new int[] { 14, 21, 8, 9 }));
		assertEquals(21, Vector.maximo(new int[] { 21, 8, 9, 21 }));
		assertEquals(21, Vector.maximo(new int[] { 8, 9, 16, 21 }));
		assertEquals(21, Vector.maximo(new int[] { 0, 21 }));
		
		//Caso del vector vacío
		Assertions.assertThrows(IllegalArgumentException.class, () -> Vector.maximo(new int[] {}));
	}

	@Test
	void ordenar() {

		assertArrayEquals(new int[] { 1, 2, 3, 5 }, Vector.ordenar(new int[] { 3, 5, 2, 1 }));
		assertArrayEquals(new int[] { -1, 3, 3, 5 }, Vector.ordenar(new int[] { 5, 3, -1, 3 }));
		Assertions.assertThrows(IllegalArgumentException.class, () -> Vector.maximo(new int[] {}));
	}
	
	void ordenar2() {

		assertArrayEquals(new int[] { 1, 2, 3, 5 }, Vector.ordenar2(new int[] { 3, 5, 2, 1 }));
		assertArrayEquals(new int[] { -1, 3, 3, 5 }, Vector.ordenar2(new int[] { 5, 3, -1, 3 }));
	}
	
}
