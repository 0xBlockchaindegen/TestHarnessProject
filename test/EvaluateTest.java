/*
 * Name: Amie Lacson
 * Test Harness Project
 * Date: December 9 2019
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvaluateTest {
	
	@Test
	public void testGCD() {
		assertEquals("GCD failed",2,Evaluate.GCD(150,626));
		assertEquals("GCD failed",-10,Evaluate.GCD(-30,-250));
		assertEquals("GCD failed",85,Evaluate.GCD(0,85));
		assertNotEquals("GCD failed",10,Evaluate.GCD(-30,-250));													
	}
	
	@Test
	public void testIsPrime() {
		assertEquals("Prime number failed",false,Evaluate.isPrime(0));
		assertEquals("Prime number failed",true,Evaluate.isPrime(887));
		assertFalse(Evaluate.isPrime(1));
		assertFalse(Evaluate.isPrime(-53));
		assertTrue(Evaluate.isPrime(383));
	}
	
	@Test
	public void testMaximum() {
		assertEquals("Maximum of 2 numbers failed",121,Evaluate.maximum(16,121));
		assertEquals("Maximum of 2 numbers failed",1,Evaluate.maximum(1,1));
		assertEquals("Maximum of 2 numbers failed",0,Evaluate.maximum(0,-8));
		assertEquals("Maximum of 2 numbers failed",-3,Evaluate.maximum(-19,-3));
		assertNotEquals("Maximum of 2 numbers failed",12,Evaluate.maximum(37,98));
	}

	@Test
	public void testMinimum() {
		assertEquals("Minimum of 2 numbers failed",243,Evaluate.minimum(243,689));
		assertEquals("Minimum of 2 numbers failed",0,Evaluate.minimum(0,14));
		assertEquals("Minimum of 2 numbers failed",-15,Evaluate.minimum(-6,-15));
		assertEquals("Minimum of 2 numbers failed",-20,Evaluate.average(90,-130));
		assertNotEquals("Minimum of 2 numbers failed",32,Evaluate.average(21,87));
	}
	
	@Test
	public void testAverage() {
		
		assertEquals("Average failed",75,Evaluate.average(50,100));
		assertEquals("Average failed",400,Evaluate.average(800,0));
		assertEquals("Average failed",-306,Evaluate.average(-612,0));
		assertEquals("Average failed",-39,Evaluate.average(-45,-33));
		assertNotEquals("Average failed",0,Evaluate.average(259,874));
	}
	
	@Test
	public void testIntToChar() {
		assertEquals("Convert Int to Char failed",'R',Evaluate.intToChar(82));
		assertEquals("Convert Int to Char failed",'*',Evaluate.intToChar(42));
		assertNotEquals("Convert Int to Char failed",1,Evaluate.intToChar(-85));
		assertNotEquals("Convert Int to Char failed",12,Evaluate.intToChar(65));	
		assertNotNull(Evaluate.intToChar(65));
	}
	
}


