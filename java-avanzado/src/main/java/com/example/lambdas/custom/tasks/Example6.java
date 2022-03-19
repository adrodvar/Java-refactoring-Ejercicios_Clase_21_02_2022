package com.example.lambdas.custom.tasks;

import com.example.domain.Task;
import com.example.domain.TaskType;
import com.example.utils.DataUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Utiliza una Function para extraer el título de la tarea
 */
public class Example6 {

    public static void main(String[] args) {
        List<Task> tasks = DataUtils.getTasks();

        List<Task> filteredTasks = filterAndExtract(tasks,
                task -> task.getType() == TaskType.READING,
                TaskExtractor.identityOp());

        filteredTasks.forEach(System.out::println);
    }

    public static <R> List<R> filterAndExtract(List<Task> tasks,
                                               Predicate<Task> filterTasks,
                                               TaskExtractor<R> extractor) {
        List<R> readingTitles = new ArrayList<>();
        for (Task task : tasks) {
            if (filterTasks.test(task)) {
                readingTitles.add(extractor.apply(task));
            }
        }
        return readingTitles;
    }


}


interface TaskExtractor<R> extends Function<Task, R> {

    static TaskExtractor<Task> identityOp() {
        return t -> t;
    }
}
