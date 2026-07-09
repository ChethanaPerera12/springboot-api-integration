package com.example.springboot.api.integration.repository;

import com.example.springboot.api.integration.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
