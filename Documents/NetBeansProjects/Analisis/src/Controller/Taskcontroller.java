/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Task;
import java.util.ArrayList;

public class TaskController {
private ArrayList<Task> tasks;
private ConsoleView view;

public TaskController() {
tasks = new ArrayList<>();
view = new ConsoleView();
}

public void run() {
boolean running = true;
while (running) {
view.showTasks(tasks);
System.out.println("1. Agree work");
System.out.println("2. Complete work");
System.out.println("3. Update work");
System.out.println("4. Delete work");
System.out.println("5. quit");
int choice = getChoice();
switch (choice) {
case 1:
addTask();
break;
case 2:
completeTask();
break;
case 3:
updateTask();
break;
case 4:
deleteTask();
break;
case 5:
running = false;
break;
}
}
}

private int getChoice() {
int choice = 0;
boolean valid = false;
hile (!valid) {
System.out.print("Insert an option: ");
try {
choice = Integer.parseInt(view.getInput());
valid = true;
} catch (NumberFormatException e) {
view.showErrorMessage("Add a whole number:");
}
}
return choice;
}

private void addTask() {
String title = view.getTitle();
String description = view.getDescription();
Task task = new Task(title, description);
tasks.add(task);
}

private void completeTask() {
int index = view.getIndex(tasks.size());
Task task = tasks.get(index);
task.setCompleted(true);
}

private void updateTask() {
int index = view.getIndex(tasks.size());
Task task = tasks.get(index);
String title = view.getNewTitle();
String description = view.getNewDescription();
task.setTitle(title);
task.setDescription(description);
}

private void deleteTask() {
int index = view.getIndex(tasks.size());
tasks.remove(index);
}
}