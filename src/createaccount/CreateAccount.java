/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package createaccount;
import javax.swing.JOptionPane;

public class CreateAccount {
 
 public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Welcome to Easy Kanban"); 
JOptionPane.showInputDialog("Option 1) Add tasks" + "Option 2) Show report" +"Option 3)Quit" );
 }
 int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one feature: \n1. Add Tasks + \n2. Show reports + \n3. Quit"));
    
 Task task = new Task ();
 
 int taskDuration = 0;
 int totalHours = 0;
 
 while (menu ! =3) {
    if (menu ==1){
        int numTask = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks need to be performed"));
        
        for (int 1 =0; i < numTask;++1){
        String taskName = JOptionPane.showInputDialog(null, "Please enter name of task");
        int taskNumber = 1;
        String taskDescription = JOptionPane.showInputDialog(null, "Please enter the description");
        JOptionPane.showMessageDialog(null, task.checkTaskDescription(taskDescription));
        String developerDetails = JOptionPane.showInputDialog(null, "Please enter First name");
        taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter last name"));
        task.returnTotalHours();
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Select one task"));
        switch (option) {
            case 1: {
                final String taskStatus = "To Do";
                task.setTaskStatus(taskStatus);
                break;
            }
            case 2: {
                final String taskStatus = "Done";
                task.setTaskStatus(taskStatus);
                break;
            }
            case 3: {
                final String taskStatus = "Doing";
                task.setTaskStatus(taskStatus);
                break;
            }
            default: { 
                JOptionPane.showMessageDialog(null, "Incorrect Input");
            }
        }
        task.setTaskName(taskName);
        task.setTaskDescription(taskDescription);
        task.setTaskNumber(taskNumber);
        task.setdeveloperDetails(developerDetails);
        task.setTaskDuration(taskDuration);
        final String taskID = task.createTaskID(taskName,taskNumber);
        JOptionPane.showMessageDialog(null, task.printTaskdetails(taskID));
    }   }
        task.display();
    }
 else if (menu ==2){ 
    JOptionPane.showMessageDialog(null, "Coming soon!");
}}
else if (menu ==3){
System.exit
}
    
    
    
 } 

