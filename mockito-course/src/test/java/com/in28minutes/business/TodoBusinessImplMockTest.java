package com.in28minutes.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;

public class TodoBusinessImplMockTest {

	@Test
	public void test() {
		
		TodoService mockTodoService = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Spring 1","Dance","Spring 3","Spring 2");
		
		when(mockTodoService.retrieveTodos("Dummy")).thenReturn(todos);
		
		//TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);
	
	List<String> filteredTodos=	todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
	
	 assertEquals(3,filteredTodos.size());
	}
	
	
	
	@Test
	public void test2() {
		
		TodoService mockTodoService = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Spring 1","Dance","Spring 3","Spring 2","Spring 7");
		
		when(mockTodoService.retrieveTodos("Dummy2")).thenReturn(todos);
		
		//TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);
	
	List<String> filteredTodos=	todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy2");
	
	 assertEquals(4,filteredTodos.size());
	}
	
	
	
	
	

}
