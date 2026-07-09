package com.example.springboot.api.integration.service;

import com.example.springboot.api.integration.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTask();
    Task createTask(Task task);
    void deleteTask(Long id);
}
