package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper  = new StringHelper();
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void realTest() {
		//a test is successful if there are no failures!
	}
	
	@Test
	public void realTest2() {
		assertEquals("ABC","ABCD");
		//expected, actual
	}
	
	@Test
	public void realTest3() {
		assertEquals("ABC","ABC");
	}
	
	@Test
	public void realTest4() {
		StringHelper stringHelper = new StringHelper();
		
		String actual = stringHelper.truncateAInFirst2Positions("AACD");
		
		String expected = "CD";
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void realTest5() {
		StringHelper stringHelper = new StringHelper();
		
		
		
		
		
		assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));
		
	}
	
	@Test
	public void realTest6() {
		StringHelper stringHelper = new StringHelper();
		
		
		
		
		assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
		
	}
	
	
	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper stringHelper = new StringHelper();

		assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
		//dont test 2 conditions in the same test
		
	}
	
	@Test
	//test must be public void 
	public void testTruncateAInFirst2Positions_AinfirstPosition() {
		

		assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
		
		
	}
	
	
	
	
	
	
	
	@Test
	//test must be public void 
	public void testAreFirstAndLastTwoCharactersTheSame() {
		

		assertEquals(true,stringHelper.areFirstAndLastTwoCharactersTheSame("OTOT"));
		assertTrue("yes, OTOT is indeed  same for first and last 2 chars",stringHelper.areFirstAndLastTwoCharactersTheSame("OTOT"));
		
	}
	
	@Test
	//test must be public void 
	public void testAreFirstAndLastTwoCharactersTheSame2() {
		

		assertTrue("4 is indeed not the sum of 3 and 7",4==3+7);
		
	}
	
	@Test
	//test must be public void 
	public void testAreFirstAndLastTwoCharactersTheSame3() {
		

		assertTrue("4 is indeed not the sum of 3 and 7",4==3+7);
		
	}
	
	@Test
	//test must be public void 
	public void testAreFirstAndLastTwoCharactersTheSame4() {
		boolean x = (23-7 == 16);

		assertTrue(x);
	}
	

}
