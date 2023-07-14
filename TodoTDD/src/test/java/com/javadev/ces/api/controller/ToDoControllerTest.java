package com.javadev.ces.api.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.javadev.ces.api.entity.ToDo;
import com.javadev.ces.api.service.ToDoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest
public class ToDoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ToDoService toDoService;

    @Test
    public void getAllToDos() throws Exception{
        List<ToDo> toDoList = new ArrayList<>();
        toDoList.add(new ToDo(1l,"Eat Thrice",true));
        toDoList.add(new ToDo(2l,"Sleep Twice", true));

        when(toDoService.findAll()).thenReturn(toDoList);

        mockMvc.perform(MockMvcRequestBuilders.get("/todos")
                .contentType(MediaType.APPLICATION_JSON)
                ).andExpect(jsonPath("$",hasSize(2))).andDo(print());
    }

    @Test
    public void successfullyCreateAToDo() throws Exception {
        ToDo eatToDo = new ToDo(1l,"Eat Thrice",true);
        when(toDoService.save(any(ToDo.class))).thenReturn(eatToDo);

        ObjectMapper objectMapper = new ObjectMapper();
        String eatToDoJson = objectMapper.writeValueAsString(eatToDo);

        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.post("/todos").contentType(MediaType.APPLICATION_JSON).content(eatToDoJson));
        result.andExpect(status().isCreated())
                .andExpect(jsonPath("$.text").value("Eat Thrice"))
                .andExpect(jsonPath("$.completed").value(true));
    }
}
