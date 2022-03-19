package com.example.stream.examples.tasks;

import com.example.domain.Task;
import com.example.domain.TaskType;

import java.util.List;
/**
 * Check if all reading tasks have tag books
 */
public class Example6 {

    public boolean isAllReadingTasksWithTagBooks(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                allMatch(task -> task.getTags().contains("books"));
    }

    public boolean isAnyReadingTasksWithTagJava8(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                anyMatch(task -> task.getTags().contains("java8"));
    }
}
