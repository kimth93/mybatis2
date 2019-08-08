package kr.ac.skuniv.mybatis2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.skuniv.mybatis2.dto.Todo;

@Repository	//bean을 알아서 자동으로 등록 -> applicationContext.mybatis.xml의 component-scan 설정
public class TodoDaoImpl implements TodoDao {
	@Autowired		//bean을 얻어와야함!
	private SqlMapClientTemplate template;
	@Override
	public List<Todo> getTodoList() {
		return template.queryForList("todoList");	//쿼리 id알려주기
	}
	@Override
	public Todo getTodo(int id) {
		//쿼리를 알려줘야 함 todo.xml에 등록		
		return (Todo)template.queryForObject("getTodo", id);	//template이 제공
	}
	@Override
	public void deleteTodo(int id) {
		
		template.delete("deleteTodo", id);
	}
	
	

}
