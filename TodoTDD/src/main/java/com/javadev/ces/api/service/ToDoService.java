package com.javadev.ces.api.service;

import com.javadev.ces.api.entity.ToDo;
import com.javadev.ces.api.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public ToDo save(ToDo any) {
        return toDoRepository.save(any);
    }
}
