package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void doOnlyOncePerClass()
	{
		System.out.println("jus once before");
		System.out.println();
	}
	
	@Before
	public void setUp() {
		System.out.println("beforeTest");
	}
	
	@Test
	public void test() {
		System.out.println("hi this is a test");
	}

	@Test
	public void test2() {
		System.out.println("hi this is a test2");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("hey");
		System.out.println();
	}
	
	@AfterClass
	public static void after()
	{
		System.out.println("just once after class");
	}
}
