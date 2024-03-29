package com.example.reactproject.service;

import com.example.reactproject.dto.PageRequestDTO;
import com.example.reactproject.dto.PageResponseDTO;
import com.example.reactproject.dto.TodoDTO;
import com.example.reactproject.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


public interface TodoService {

    Long register(TodoDTO todoDTO);

    TodoDTO get(Long tno);

    void modify(TodoDTO todoDTO);

    void remove(Long tno);

    PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO);

}
