package com.example.stream.examples.tasks;

import com.example.domain.Task;

import java.util.List;
/**
 * Creating a summary of all titles
 */
public class Example7 {

    public String joinAllTaskTitles(List<Task> tasks) {
        return tasks.stream().
                map(Task::getTitle).
                reduce((first, second) -> first + " *** " + second).
                get();
    }
}
