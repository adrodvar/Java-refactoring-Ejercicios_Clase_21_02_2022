package com.example.stream.opterminales.collect;

import com.example.domain.Task;
import com.example.domain.TaskType;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupingBy {

    public static void main(String[] args) {

        // Opción 1:
        Map<TaskType, List<Task>> tasks = new HashMap<>();
        Task task1 = new Task("Example of task", TaskType.READING, LocalDate.of(2015, Month.SEPTEMBER, 20)).addTag("java").addTag("java8").addTag("books");
        Task task2 = new Task("Write factorial program in Haskell", TaskType.CODING, LocalDate.of(2015, Month.SEPTEMBER, 20)).addTag("program").addTag("haskell").addTag("functional");
        Task task3 = new Task("Read Effective Java", TaskType.READING, LocalDate.of(2015, Month.SEPTEMBER, 21)).addTag("java").addTag("books");
        Task task4 = new Task("Write a blog on Stream API", TaskType.BLOGGING, LocalDate.of(2015, Month.SEPTEMBER, 21)).addTag("writing").addTag("stream").addTag("java8");
        Task task5 = new Task("Write prime number program in Scala", TaskType.CODING, LocalDate.of(2015, Month.SEPTEMBER, 22)).addTag("scala").addTag("functional").addTag("program");

        tasks.put(TaskType.READING, List.of(task1, task3));
        tasks.put(TaskType.CODING, List.of(task2, task5));
        tasks.put(TaskType.BLOGGING, List.of(task4));

        // Opción 2
        List<Task> menu = List.of(task1, task2, task3,task4,task5);
        Map<TaskType, List<Task>> tasksByType = menu.stream().collect(groupingBy(Task::getType));

        System.out.println(tasksByType);

    }
}
