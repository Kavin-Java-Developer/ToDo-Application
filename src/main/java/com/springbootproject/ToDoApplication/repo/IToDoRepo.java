package com.springbootproject.ToDoApplication.repo;

import com.springbootproject.ToDoApplication.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long> {


}
