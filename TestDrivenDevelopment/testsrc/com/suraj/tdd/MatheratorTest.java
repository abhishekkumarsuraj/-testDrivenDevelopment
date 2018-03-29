package com.suraj.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatheratorTest {

	private Matherator classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest =new Matherator();
	}

	@Test
	public void testSubtract() {
	
		long result=101-2-4-23-7-4;
		
		assertEquals(result, classUnderTest.subtract(101,2,4,23,7,4));
		
		result=0;
		
		assertEquals(result, classUnderTest.subtract(0,0,0,0));
		
	}

	@Test
	public void testAdd() {
		// let Java add it up
		
		long result=10+20+(-33)+43+(-76)+65;
		
		//compare the result that the matherator gives us
		
		assertEquals(result,classUnderTest.add(10,20,-33,43,-76,65));
	    
		result=102+201;
		
		assertEquals(result, classUnderTest.add(102,201));
		result=0;
		
		assertEquals(result,classUnderTest.add(0));
		
	}

}
