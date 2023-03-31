package com.company;

public class Main {

    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager();
        pm.addProject("Проект 1", "Описание проекта 1");
        pm.addProject("Проект 2", "Описание проекта 2");
        pm.getProjectList();
// Вывод списка проектов:
// Название проекта: Проект 1
// Описание проекта: Описание проекта 1
// Название проекта: Проект 2
// Описание проекта: Описание проекта 2

        pm.editProject("Проект 1", "Новое описание проекта 1");
        pm.getProjectList();
// Вывод списка проектов:
// Название проекта: Проект 1
// Описание проекта: Новое описание проекта 1
// Название проекта: Проект 2
// Описание проекта: Описание проекта 2

        pm.deleteProject("Проект 1");
        pm.getProjectList();
// Вывод списка проектов:
// Название проекта: Проект 2
// Описание проекта: Описание проекта 2
        ToDoList todo = new ToDoList();

// Add a project
        todo.addProject("Проект 1");

// Add tasks to the project
        todo.addTask("Проект 1", "Задача 1");
        todo.addTask("Проект 1", "Задача 2");
        todo.addTask("Проект 1", "Задача 3");

// Display tasks for the project


}
}
