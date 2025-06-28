package com.skymoon7337.toDoList.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ToDoService {
    private final List<Task> tasks = new ArrayList<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    public List<Task> getAllTasks() {
        return tasks.stream().sorted((a, b) -> a.getDday().compareTo(b.getDday())).toList();
    }

    public void addTask(String description, LocalDateTime dday) {
        if (dday == null) {
            dday = LocalDateTime.now().withHour(23).withMinute(59).withSecond(59);
        }
        tasks.add(new Task(idCounter.getAndIncrement(), description, dday));
    }

    public void toggleTaskCompletion(int taskId) {
        for (Task task: tasks) {
            if (task.getId() == taskId) {
                task.setCompleted(!task.isCompleted());

                break;
            }
        }
    }

    public void updateTask(int taskId, String newDescription, LocalDateTime newDday) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setDescription(newDescription);
                if (newDday != null) {
                    task.setDday(newDday);
                }
                break;
            }
        }
    }

    public void deleteTask(int taskId) {
        tasks.removeIf(t -> t.getId() == taskId);
    }

    public static class Task {
        private final int id;
        private String description;
        private boolean completed = false;
        private LocalDateTime dday;

        public Task(int id, String description,LocalDateTime dday) {
            this.id = id;
            this.description = description;
            this.dday= dday;
        }

        public String getLeftTime() {
            if (dday == null) return "매일 하기";
            java.time.Duration duration = java.time.Duration.between(LocalDateTime.now(), dday);
            if (duration.isNegative()) return "기한 지남";
            long days = duration.toDays();
            long hours = duration.toHours() % 24;
            long minutes = duration.toMinutes() % 60;
            return days + "일 " + hours + "시간 " + minutes + "분 남음";
        }

        public int getId() { return id; }
        public String getDescription() { return description; }
        public LocalDateTime getDday() { return dday;}

        public boolean isCompleted() { return completed; }

        public void setDescription(String description) {this.description = description;}
        public void setCompleted(boolean completed) {
            this.completed = completed;
        }
        public void setDday(LocalDateTime dday) {this.dday = dday;}
    }
}