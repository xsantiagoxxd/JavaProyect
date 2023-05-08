/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.util.Scanner;


public class Consoleview {

 private Scanner scanner;


 public Consoleview() {
 scanner = new Scanner(System.in);

}
public void showtasks(Task[]tasks){
 System.out.println("pending works:");
 for (Task task : tasks) {
 System.out.println(task.getTitle() + " - " + task.getDescription() + " - " + (task.isCompleted() ? "Complete" : "Pending"));
 }
}
public int getTaskIndex() {
System.out.print("insert the index of the task:");
return scanner.nextInt();

}
public String getTitle() {
System.out.print("insert the topic task: ");
 return scanner.next();
 }
public String getDescription() {
System.out.print("insert the description of the task:");
 return scanner.next();

}
 public void showErrorMessage(String message) {
System.out.println("Error: " + message);

 }
}




