package com.example.optional;

import com.example.domain.Task;

import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class TaskRepository {


    private static final Map<String, Task> TASK_STORE = new ConcurrentHashMap<>();

    public Optional<Task> find(String taskId) {
        return Optional.ofNullable(TASK_STORE.get(taskId));
    }

    public void add(Task task) {
        TASK_STORE.put(task.getId(), task);
    }

    public String findTaskTitle(String id) throws TaskNotFoundException {
        return this.find(id)
                .map(Task::getTitle)
                .orElseThrow(() -> new TaskNotFoundException(String.format("No task exist for id '%s'",id)));
    }

//    public String taskAssignedTo(String taskId) {
//        return this.find(taskId)
//                .flatMap(task -> task.getAssignedTo().map(user -> user.getUsername())).
//                orElse("NotAssigned");
//    }
//
    public boolean isTaskDueToday(Task task) {
        return Optional.ofNullable(task).map(Task::getDueOn).filter(d -> d.isEqual(LocalDate.now())).isPresent();
    }


}
