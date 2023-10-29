package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", Status.TO_DO),
                new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED));
    }

    // TODO create a method to get all opbjects

    public List<TaskItem> returnAll() {
        return this.tasks;
    }

    // TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status

    // returns only the first task with a Status
    public Optional<TaskItem> getByStatus(Status status){
        return tasks.stream()
                .filter(task ->{
                    return task.getStatus().equals(status);
                }).findFirst();
    }

    // returns a list of all tasks with a Status
    public List<TaskItem> getByStatus2(Status status){
        List<TaskItem> filteredTasks = tasks.stream()
                .filter(task -> task.getStatus().equals(status))
                .toList();
        return filteredTasks;
    }

    // TODO create a method to find tasks whose id parameter is greater than or equal to 2

    public List<TaskItem> idGreaterThan2(){
        List<TaskItem> filteredList = tasks.stream()
                .filter(tasks ->tasks.getId() >= 2)
                .toList();
        return filteredList;
    }

    // TODO create a method that will, by using the forEach stream method, print to the console the description of each task

    public void printDesc(){
        this.tasks.forEach(task -> {
            System.out.println(task.getDesc());
        });
    }
}
