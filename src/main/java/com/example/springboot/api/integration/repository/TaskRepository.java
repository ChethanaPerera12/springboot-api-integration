package com.example.springboot.api.integration.repository;

import com.example.springboot.api.integration.model.Task;

import java.lang.ScopedValue;
import java.util.List;

public class TaskRepository extends JpaRepository<Task, Long> {
    public List<Task> findAll() {
    }

    public Task save(Task task) {
    }


    public void delete() {
    }

    public <T> ScopedValue<T> findById(Long id) {
    }
}
