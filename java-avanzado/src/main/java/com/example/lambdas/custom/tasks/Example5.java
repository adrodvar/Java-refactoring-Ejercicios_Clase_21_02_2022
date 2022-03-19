package com.example.lambdas.custom.tasks;

import com.example.domain.Task;
import com.example.domain.TaskType;
import com.example.utils.DataUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Utiliza una Function para extraer el título de la tarea
 */
public class Example5 {

    public static void main(String[] args) {
        List<Task> tasks = DataUtils.getTasks();

        // Extraer títulos
        List<String> titles = filterAndExtract(tasks,
                task -> task.getType() == TaskType.READING,
                Task::getTitle);
        titles.forEach(System.out::println);

        // Extraer fechas
        List<LocalDate> createdOnDates = filterAndExtract(tasks,
                task -> task.getType() == TaskType.READING,
                Task::getCreatedOn);
        createdOnDates.forEach(System.out::println);

        // Extraer las propias tareas
        List<Task> filteredTasks = filterAndExtract(tasks,
                task -> task.getType() == TaskType.READING,
                Function.identity());

        filteredTasks.forEach(System.out::println);
    }

    public static <R> List<R> filterAndExtract(List<Task> tasks,
                                               Predicate<Task> filterTasks,
                                               Function<Task, R> extractor) {
        List<R> readingTitles = new ArrayList<>();
        for (Task task : tasks) {
            if (filterTasks.test(task)) {
                readingTitles.add(extractor.apply(task));
            }
        }
        return readingTitles;
    }


}
