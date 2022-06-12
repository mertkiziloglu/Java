package io.kiziloglu.mert.todoapp.repository;

import io.kiziloglu.mert.todoapp.model.TodoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<TodoList, Long> {

}
