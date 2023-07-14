package com.javadev.ces.api.service;

import com.javadev.ces.api.entity.ToDo;
import com.javadev.ces.api.repository.ToDoRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ToDoServiceTest {

    @Autowired
    private ToDoRepository toDoRepository;

    @AfterEach
    void tearDown(){
        toDoRepository.deleteAll();
    }

    @Test
    public void getAllToDosTest() {
        ToDo toDoSample = new ToDo();
        toDoSample.setText("Todo Sample 1");
        toDoSample.setCompleted(true);
        toDoRepository.save(toDoSample);
        ToDoService toDoService = new ToDoService(toDoRepository);

        List<ToDo> toDoList = toDoService.findAll();
        ToDo lastToDo = toDoList.get(0);

        assertEquals(toDoSample.getText(), lastToDo.getText());
        assertEquals(toDoSample.isCompleted(), lastToDo.isCompleted());
        assertEquals(toDoSample.getId(), lastToDo.getId());
    }

    @Test
    public void saveAToDo() {
        ToDoService toDoService = new ToDoService(toDoRepository);
        ToDo toDoSample = new ToDo();
        toDoSample.setText("Todo Sample 1");
        toDoSample.setCompleted(true);

        toDoService.save(toDoSample);

        assertEquals(1.0,toDoRepository.count());
    }

}
