package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper stringHelper  = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions()
	{
		String expectedOutputs[][]={{"AACD","CD"},
		{"ACD","CD"}, {"RRR","RRR"}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void test()
	{
		assertEquals(expectedOutput,stringHelper.truncateAInFirst2Positions(input));
	}
	
	

}
