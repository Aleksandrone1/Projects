package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private List<Project> projects;

    public ProjectManager() {
        projects = new ArrayList<Project>();
    }

    public void addProject(String name, String description) {
        projects.add(new Project(name, description));
    }

    public void deleteProject(String name) {
        for (Project project : projects) {
            if (project.getName().equals(name)) {
                projects.remove(project);
                return;
            }
        }
    }

    public void editProject(String name, String description) {
        for (Project project : projects) {
            if (project.getName().equals(name)) {
                project.setDescription(description);
                return;
            }
        }
    }

    public void getProjectList() {
        for (Project project : projects) {
            System.out.println("Название проекта: " + project.getName());
            System.out.println("Описание проекта: " + project.getDescription());
        }
    }
}

class Project {
    private String name;
    private String description;

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}