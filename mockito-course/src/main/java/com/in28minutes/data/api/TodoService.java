package com.in28minutes.data.api;

import java.util.List;

//create stud
//test impl using stub
public interface TodoService {

	public List<String> retrieveTodos(String user);
	public void deleteTodo(String todo);
}
