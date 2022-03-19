package com.example.stream.examples.tasks;

import com.example.domain.Task;
import com.example.domain.TaskType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.example.utils.DataUtils.getTasks;

/**
 * Imprime todos los títulos de las tareas,
 * ordenados por la longitud de su título.
 */
public class Example0 {

    public static void main(String[] args) {
        List<Task> tasks = getTasks();

        List<Task> readingTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getType() == TaskType.READING) {
                readingTasks.add(task);
            }
        }
        Collections.sort(readingTasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getTitle().length() - t2.getTitle().length();
            }
        });
        for (Task readingTask : readingTasks) {
            System.out.println(readingTask.getTitle());
        }


        // version funcional:

        tasks = getTasks();

        List<String> titles = tasks.stream()
                .filter(task -> task.getType() == TaskType.READING)
                .sorted(Comparator.comparingInt(t -> t.getTitle().length()))
                .map(Task::getTitle)
                .toList();

        titles.forEach(System.out::println);
    }
}
