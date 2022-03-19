package com.example.stream.examples.tasks;
import com.example.domain.Task;
import com.example.domain.TaskType;

import java.util.List;

import static java.util.Comparator.comparing;

/**
 *  Find top 5 reading tasks sorted by creation date
 */
public class Example3 {

    public static void main(String[] args) {

    }

    public List<String> topN(List<Task> tasks, int n){
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                sorted(comparing(Task::getCreatedOn)).
                map(Task::getTitle).
                limit(n).toList();
    }

    public List<String> topNPagination(List<Task> tasks, int n){
        long page = 1;

        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                sorted(comparing(Task::getCreatedOn).reversed()).
                map(Task::getTitle).
                skip(page * n).
                limit(n).
                toList();
    }


}
