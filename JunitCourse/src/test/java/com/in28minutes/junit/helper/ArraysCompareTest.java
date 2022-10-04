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

}
