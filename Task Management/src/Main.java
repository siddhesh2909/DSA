import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        taskManager tm = new taskManager();
        while (true) {
        System.out.println("Task Management System");
        System.out.println("-----------------------------");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. View Tasks");
        System.out.println("4. Update Tasks");
        System.out.println("5. Search Task ");
        System.out.println("6. Exit");
        System.out.println("------------------------------");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter task Id:");
                int id = sc.nextInt();
                System.out.println("Enter task Title:");
                String title = sc.next();
                System.out.println("Enter task Description:");
                String description = sc.next();
                System.out.println("Enter task Status:");
                String status = sc.next();
                System.out.println("Enter task Due date:");
                String dueDate = sc.next();
                tm.addTask(new Task(id, title, description, status, dueDate));
                break;
            case 2:
                System.out.println("Enter task Id:");
                tm.removeTask(sc.nextInt());
                break;
            case 3:
                tm.viewTask();
                break;
            case 4:
                System.out.println("Enter task Name:");
                String tname = sc.next();
                System.out.println("Enter task Status:");
                String st = sc.next();
                tm.editTask(tname, st);
                break;
            case 5:
                System.out.println("Enter task Id:");
                int tid=sc.nextInt();
                tm.SearchTask(tid);
                break;
            case 6:
                System.out.println("Exiting ...");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice");
                break;
        }

        }
    }
}
