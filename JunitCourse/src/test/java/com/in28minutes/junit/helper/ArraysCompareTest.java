package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	
	
	@Test
	public void test() {
		int[] numbers = {12,3,4,1};
		
		int[] expected = {1,3,4,12};
		
		Arrays.sort(numbers);
		//needs the object to be the same
		assertEquals(expected,numbers);
	}
	
	@Test
	public void test2() {
		String x = "xyz";
		String r = "xyz";
		assertEquals(x,r);
	}
	
	@Test
	public void test3() {
		String x = new String("rrr");
		String r = new String("rrr");
		assertEquals(x,r);
	}
	
	
	@Test
	public void test6() {
		int[] numbers = {12,3,4,1};
		
		int[] expected = {3,1,4,12};
		
		Arrays.sort(numbers);
		//needs the object to be the same
		assertArrayEquals(expected,numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void test7() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void test8() {
		String x = null;
		x.charAt(3);
		System.out.println();
	}
	
	
	@Test(timeout=10) //can test performance
	public void test9() {
		int array[] = {12,23,4};
		for (int i =1; i<=1000000; i++)
		{
			array[0] = i;
			Arrays.sort(array);
		}
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions()
	{
		assertEquals("CD", new StringHelper().truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition()
	{
		assertEquals("CD", new StringHelper().truncateAInFirst2Positions("AAC"));
	}

}
