package com.example.lambdas.custom.tasks;

import com.example.domain.Task;
import com.example.domain.TaskType;
import com.example.utils.DataUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Aplicando filtros sobre las tareas
 */
public class Example3 {

    public static void main(String[] args) {
        List<Task> tasks = DataUtils.getTasks();

        List<String> titles = taskTitles(tasks,
                task -> task.getType() == TaskType.READING);

        titles.forEach(System.out::println);
    }

    public static List<String> taskTitles(List<Task> tasks, Predicate<Task> filterTasks) {
        List<String> readingTitles = new ArrayList<>();
        for (Task task : tasks) {
            if (filterTasks.test(task)) { // filtro refactorizado usando un Predicate
                readingTitles.add(task.getTitle()); // extraer título
            }
        }
        return readingTitles;
    }


}
