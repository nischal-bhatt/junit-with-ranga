package com.in28minutes.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.in28minutes.data.api.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void test() {

		TodoService mockTodoService = mock(TodoService.class);

		List<String> todos = Arrays.asList("Spring 1", "Dance", "Spring 3", "Spring 2");

		when(mockTodoService.retrieveTodos("Dummy")).thenReturn(todos);

		// TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);

		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

		assertEquals(3, filteredTodos.size());
	}

	@Test
	public void test2() {

		TodoService mockTodoService = mock(TodoService.class);

		List<String> todos = Arrays.asList("Spring 1", "Dance", "Spring 3", "Spring 2", "Spring 7");

		when(mockTodoService.retrieveTodos("Dummy2")).thenReturn(todos);

		// TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);

		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy2");

		assertEquals(4, filteredTodos.size());
	}

	@Test
	public void test3() {

		// given

		TodoService mockTodoService = mock(TodoService.class);

		List<String> todos = Arrays.asList("Spring 1", "Dance", "Spring 3", "Spring 2", "Spring 7");

		given(mockTodoService.retrieveTodos("Dummy2")).willReturn(todos);

		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);

		// when

		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy2");

		// then

		assertThat(filteredTodos.size(),is(2));
	}
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void test4() {

		// given

		TodoService mockTodoService = mock(TodoService.class);

		List<String> todos = Arrays.asList("Spring 1", "Dance", "Spring 3", "Spring 2", "Spring 7");

		given(mockTodoService.retrieveTodos("Dummy2")).willReturn(todos);

		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);

		// when

		todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy2");
		// then

		
		verify(mockTodoService).deleteTodo("Dance");
		
		verify(mockTodoService,times(1)).deleteTodo("Dance");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void test4_argumentCaptire() {

		ArgumentCaptor<String> stringArgumentCaptor=ArgumentCaptor.forClass(String.class);
		
		
		// given

		TodoService mockTodoService = mock(TodoService.class);

		List<String> todos = Arrays.asList("Spring 1",  "Spring 3", "Spring 2", "Spring 7","Dance 2");

		given(mockTodoService.retrieveTodos("Dummy2")).willReturn(todos);

		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);

		// when

		todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy2");
		// then

		
		verify(mockTodoService).deleteTodo(stringArgumentCaptor.capture());
		assertThat(stringArgumentCaptor.getValue(),is("Dance 2"));
		
		
	}

}
