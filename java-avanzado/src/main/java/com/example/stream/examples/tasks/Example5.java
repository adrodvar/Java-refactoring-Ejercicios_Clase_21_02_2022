package com.example.stream.examples.tasks;

import com.example.domain.Task;

import java.util.List;

/**
 * Find all unique tags from all tasks
 */
public class Example5 {

    public static void main(String[] args) {

    }

    private static List<String> allDistinctTags(List<Task> tasks) {
        return tasks.stream().flatMap(task -> task.getTags().stream()).distinct().toList();
    }
}
