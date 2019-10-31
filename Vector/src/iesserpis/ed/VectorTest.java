package iesserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;


class VectorTest {

	@Test
	void indexOf() {

	int[] v = {17, 12, 15, 9, 14};
	//int x = 15;
	//int index = Vector.indexOf(v, x);
	
	//assertEquals(2, index);
	assertEquals(0,  Vector.indexOf(v, 17));
	assertEquals(2,  Vector.indexOf(v, 15));
	assertEquals(4,  Vector.indexOf(v, 14));
	assertEquals(-1,  Vector.indexOf(v, 33));
	
	//new int [] {17, 12, 15, 9, 14} --> se podría cambiar v por el algoritmo
	}

}
