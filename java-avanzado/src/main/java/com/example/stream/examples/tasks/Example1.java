package com.example.stream.examples.tasks;

import com.example.domain.Task;
import com.example.domain.TaskType;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find all reading task titles sorted by their creation date
 */
public class Example1 {

    public static void main(String[] args) {

    }

    private static List<String> allReadingTasks(List<Task> tasks) {
        List<String> readingTaskTitles = tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                sorted((t1, t2) -> t1.getCreatedOn().compareTo(t2.getCreatedOn())).
                map(task -> task.getTitle()).
                collect(Collectors.toList());

        System.out.println(readingTaskTitles);
        return readingTaskTitles;
    }

    public List<String> allReadingTasks2(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                sorted(Comparator.comparing(Task::getCreatedOn)).
                map(Task::getTitle).
                toList();

    }

    public List<String> allReadingTasksSortedByCreatedOnDesc(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                sorted(Comparator.comparing(Task::getCreatedOn).reversed()).
                map(Task::getTitle).
                toList();
    }
}
