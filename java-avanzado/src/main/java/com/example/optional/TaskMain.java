package com.example.optional;

import com.example.domain.Task;
import com.example.domain.TaskType;

import java.time.LocalDate;

public class TaskMain {

    public static void main(String[] args) {

        TaskRepository repo = new TaskRepository();
        repo.add(new Task("1", "Task 1", TaskType.READING, LocalDate.now(), LocalDate.now()));
        repo.add(new Task("2", "Task 2", TaskType.READING, LocalDate.now(), LocalDate.now().minusDays(3)));
        repo.add(new Task("3", "Task 3", TaskType.READING, LocalDate.now(), LocalDate.now().plusDays(1)));

        repo.isTaskDueToday(new Task("1", "Task 1", TaskType.READING, LocalDate.now(), LocalDate.now()));
    }
}
