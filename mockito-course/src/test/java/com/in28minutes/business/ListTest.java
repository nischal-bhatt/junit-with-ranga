package com.in28minutes.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
	}
	
	@Test
	public void letsMockListSizeMethod_returnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(7);
		assertEquals(2,listMock.size());
		assertEquals(7,listMock.size());
	}
	
	
	@Test
	public void letsMockListGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("in28mins");
		assertEquals("in28mins",listMock.get(0));
		assertEquals(null,listMock.get(1));
		//nice mock!
		
	}
	
	@Test
	public void letsMockListGet2() {
		List listMock = mock(List.class);
		//argument matchers
		when(listMock.get(anyInt())).thenReturn("in28mins");
		assertEquals("in28mins",listMock.get(0));
		assertEquals("in28mins",listMock.get(9));
		//nice mock!
		
	}
	
	
	@Test(expected=RuntimeException.class)
	public void letsMockListGet3() {
		List listMock = mock(List.class);
		//argument matchers
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
		listMock.get(100);
		//nice mock!
		
	}

}
