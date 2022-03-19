package com.example.lambdas.custom.tasks;

import com.example.domain.Task;
import com.example.domain.TaskType;

import java.util.ArrayList;
import java.util.List;

import static com.example.utils.DataUtils.getTasks;

/**
 * Refactorizar utilizando el método forEach que acepta una interfaz funcional
 * para imprimir los títulos
 */
public class Example2 {


    public static void main(String[] args) {
        List<Task> tasks = getTasks();

        List<String> titles = taskTitles(tasks);

        titles.forEach(System.out::println);
    }

    public static List<String> taskTitles(List<Task> tasks) {
        List<String> readingTitles = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getType() == TaskType.READING) { // filtro
                readingTitles.add(task.getTitle());
            }
        }
        return readingTitles;
    }

}
