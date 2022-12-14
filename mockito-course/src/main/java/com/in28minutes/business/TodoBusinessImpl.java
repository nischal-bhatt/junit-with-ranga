package com.in28minutes.business;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.data.api.TodoService;

//this is SUT - system under test
public class TodoBusinessImpl {

	// this is a dependency
	private TodoService todoService;

	// how can we mock without a real implementation?
	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();

		List<String> todos = todoService.retrieveTodos(user);

		for (String todo : todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}

		return filteredTodos;
	}

	public void deleteTodosNotRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();

		List<String> todos = todoService.retrieveTodos(user);

		for (String todo : todos) {
			if (!todo.contains("Spring")) {
				todoService.deleteTodo(todo);
			}
		}

	}

}
