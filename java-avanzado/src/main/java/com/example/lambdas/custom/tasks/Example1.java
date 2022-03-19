package com.example.lambdas.custom.tasks;

import com.example.domain.Task;
import com.example.domain.TaskType;
import com.example.utils.DataUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Código normal, sin programación funcional
 */
public class Example1 {

    public static void main(String[] args) {
        List<Task> tasks = DataUtils.getTasks();

        List<String> titles = taskTitles(tasks);

        for (String title : titles) {
            System.out.println(title);
        }
    }

    public static List<String> taskTitles(List<Task> tasks) {
        List<String> readingTitles = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getType() == TaskType.READING) {
                readingTitles.add(task.getTitle());
            }
        }
        return readingTitles;
    }
}
