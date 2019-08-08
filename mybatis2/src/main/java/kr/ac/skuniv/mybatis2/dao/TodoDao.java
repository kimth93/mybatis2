package kr.ac.skuniv.mybatis2.dao;

import java.util.List;

import kr.ac.skuniv.mybatis2.dto.Todo;

public interface TodoDao {
	
	public List<Todo> getTodoList();
	public Todo getTodo(int id);	//한건
	public void deleteTodo(int id);
	

}
