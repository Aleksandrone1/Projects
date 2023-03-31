package com.company;
import java.util.ArrayList;
import java.util.HashMap;
public class ToDoList {

     private HashMap<String, ArrayList<HashMap<String, Object>>> projects;

        public ToDoList() {
            this.projects = new HashMap<String, ArrayList<HashMap<String, Object>>>();
        }

        public void addProject(String project_name) {
            if (!projects.containsKey(project_name)) {
                projects.put(project_name, new ArrayList<HashMap<String, Object>>());
            }
        }

        public void addTask(String project_name, String task_description) {
            if (projects.containsKey(project_name)) {
                HashMap<String, Object> task = new HashMap<String, Object>();
                task.put("описание", task_description);
                task.put("завершенная", false);
                projects.get(project_name).add(task);
            } else {
                System.out.println("Проекта не существует. Пожалуйста, сначала создайте проект.");
            }
        }
        public void completeTask(String project_name, int task_number) {
            if (projects.containsKey(project_name)) {
                ArrayList<HashMap<String, Object>> tasks = projects.get(project_name);
                if (task_number <= tasks.size()) {
                    HashMap<String, Object> task = tasks.get(task_number - 1);
                    task.put("завершенная", true);
                } else {
                    System.out.println("Задачи не существует.");
                }
            } else {
                System.out.println("Проекта не существует.");
            }
        }

        public void editTask(String project_name, int task_number, String new_description) {
            if (projects.containsKey(project_name)) {
                ArrayList<HashMap<String, Object>> tasks = projects.get(project_name);
                if (task_number <= tasks.size()) {
                    HashMap<String, Object> task = tasks.get(task_number - 1);
                    task.put("описание", new_description);
                } else {
                    System.out.println("Задачи не существует.");
                }
            } else {
                System.out.println("Проекта не существует.");
            }
        }

        public void displayTasks(String project_name) {
            if (projects.containsKey(project_name)) {
                ArrayList<HashMap<String, Object>> tasks = projects.get(project_name);
                if (tasks.size() == 0) {
                    System.out.println("Никаких заданий.");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        HashMap<String, Object> task = tasks.get(i);
                        String completed = task.get("completed").equals(true) ? "Завершено" : "Не Завершено";
                        System.out.println((i + 1) + ". " + task.get("описание") + " - " + completed);
                    }
                }
            } else {
                System.out.println("Проекта не существует.");
            }
        }

}
