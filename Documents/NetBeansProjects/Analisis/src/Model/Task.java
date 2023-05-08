/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Task {
private String title;
private String description;
private boolean completed;

public Task(String title, String description) {
this.title = title;
this.description = description;
this.completed = false;
}

public String getTitle() {
return title;
}

public String getDescription() {
return description;
}

public boolean isCompleted() {
return completed;
}

public void complete() {
completed = true;
}

public void setTitle(String title) {
this.title = title;
}

public void setDescription(String description) {
this.description = description;
}
}
