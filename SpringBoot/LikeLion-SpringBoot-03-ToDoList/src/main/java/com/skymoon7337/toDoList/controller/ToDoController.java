package com.skymoon7337.toDoList.controller;

import com.skymoon7337.toDoList.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @GetMapping("/")
    public String showToDoList(Model model) {
        model.addAttribute("todos", toDoService.getAllTasks());

        return "todolist";
    }

    @PostMapping("/todos")
    public String addTask(
            @RequestParam("task") String task,
            @RequestParam(value = "dday", required = false) String ddayStr
    ) {
        LocalDateTime dday = null;
        if (ddayStr != null && !ddayStr.isEmpty()) {
            dday = LocalDateTime.parse(ddayStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        }
        toDoService.addTask(task, dday);
        return "redirect:/";
    }

    @PostMapping("/todos/toggle")
    public String toggleComplete(@RequestParam("taskId") int taskId) {
        toDoService.toggleTaskCompletion(taskId);
        return "redirect:/";
    }

    @PostMapping("/todos/update")
    public String updateTask(
            @RequestParam("taskId") int taskId,
            @RequestParam("newDescription") String newDescription,
            @RequestParam(value = "newDday", required = false) String newDdayStr
    ) {
        LocalDateTime newDday = null;
        if (newDdayStr != null && !newDdayStr.isEmpty()) {
            newDday = LocalDateTime.parse(newDdayStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        }
        toDoService.updateTask(taskId, newDescription, newDday);

        return "redirect:/";
    }

    @PostMapping("/todos/delete")
    public String deleteTask(@RequestParam("taskId") int taskId) {
        toDoService.deleteTask(taskId);

        return "redirect:/";
    }
}