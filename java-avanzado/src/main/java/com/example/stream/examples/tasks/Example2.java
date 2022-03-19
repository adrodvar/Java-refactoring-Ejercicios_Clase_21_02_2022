package com.example.stream.examples.tasks;

import com.example.domain.Task;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Find distinct tasks
 */
public class Example2 {

    public static void main(String[] args) {

    }

    public List<Task> allDistinctTasks(List<Task> tasks) {
        return tasks.stream().distinct().collect(Collectors.toList());
    }
}
