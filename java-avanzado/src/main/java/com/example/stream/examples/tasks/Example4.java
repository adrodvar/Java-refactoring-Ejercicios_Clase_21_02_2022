package com.example.stream.examples.tasks;

import com.example.domain.Task;
import com.example.domain.TaskType;

import java.util.List;

/**
 * Count all reading tasks
 */
public class Example4 {

    public static void main(String[] args) {

    }

    public long countAllReadingTasks(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                count();
    }
}
