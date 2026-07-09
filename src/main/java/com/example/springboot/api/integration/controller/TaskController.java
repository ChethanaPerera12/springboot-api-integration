package com.example.springboot.api.integration.controller;

import com.example.springboot.api.integration.model.ApiResponse;
import com.example.springboot.api.integration.model.Task;
import com.example.springboot.api.integration.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/api")
    public ApiResponse homeController() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Welcome to the API");
        apiResponse.setStatus(true);
        return apiResponse;
    }
    @GetMapping("/task")
    public List<Task> getAllTask() {
        return taskService.getAllTask();
    }
    @PostMapping("/task")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
    @DeleteMapping("/task/{id}")
    public ApiResponse deleteTask(@PathVariable Long id) throws Exception {
        taskService.deleteTask(id);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("task deleted successfully");
        apiResponse.setStatus(true);
        return apiResponse;
    }

}
