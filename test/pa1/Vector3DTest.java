package pa1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Vector3DTest {


	@Test
	void testDot() {
		Vector3D vectOne = new Vector3D(1.0, 1.0, 1.0);
		Vector3D vectTwo = new Vector3D(1.0, 1.0, 1.0);
		double result = vectOne.dot(vectTwo);
		assertEquals(3.0, result);
	}
	
	@Test
	void testMagnitude() {
		Vector3D vect = new Vector3D(10.0, 10.0, 10.0);
		double result = vect.magnitude();
		assertEquals(17.320508075688775, result);
	}
	
	@Test
    	void testScale() {
        	double f = 2.0;
        	Vector3D vectA = new Vector3D(2.0, 1.0, 7.0);  
        	Vector3D vectB = new Vector3D(f*vectA.x, f*vectA.y, f*vectA.z);  
        	Vector3D vectC  = vectA.scale(f);  
        	assertEquals(true, vectB.equals(vectC));
    	}
	
	@Test
    	void testAdd() {
        	Vector3D vectOne = new Vector3D(2.0, 1.0, 7.0);
        	Vector3D vectTwo = new Vector3D(2.0, 1.0, 7.0);
        	vectOne = vectOne.add(vectTwo);
        	assertEquals(4.0, vectOne.x);
        	assertEquals(2.0, vectOne.y);
        	assertEquals(14.0, vectOne.z);
    	}
	
	@Test
    	void testSubtract() {
        	Vector3D vectOne = new Vector3D(2.0, 1.0, 7.0);
        	Vector3D vectTwo = new Vector3D(2.0, 1.0, 7.0);
        	vectOne = vectOne.subtract(vectTwo);
        	assertEquals(0.0, vectOne.x);
        	assertEquals(0.0, vectOne.y);
        	assertEquals(0.0, vectOne.z);
    	}

	@Test
    	void testNegate() {
        	Vector3D vect = new Vector3D(2.0, 1.0, 7.0);
        	vect = vect.negate();
        	assertEquals(-2.0, vect.x);
        	assertEquals(-1.0, vect.y);
        	assertEquals(-7.0, vect.z);
    	}


    	@Test
    	void testToString() {
        	Vector3D vect = new Vector3D(2.0, 1.0, 7.0);
        	String result = vect.toString();
        	assertEquals("X: 2.0 Y: 1.0 Z: 7.0", result);
    	}
    
    
    	@Test
    	void testEquals() {
        	Vector3D vectOne = new Vector3D(2.0, 1.0, 7.0);
        	Vector3D vectTwo = new Vector3D(2.0, 1.0, 7.0);
        	assertEquals(true, vectOne.equals(vectTwo));
    	}
	
}
