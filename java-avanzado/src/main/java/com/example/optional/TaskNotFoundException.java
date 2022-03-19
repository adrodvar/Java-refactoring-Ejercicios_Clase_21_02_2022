package com.example.optional;

public class TaskNotFoundException extends RuntimeException  {
    public TaskNotFoundException(String id) {
        super("No task found for id: " + id);
    }
}
