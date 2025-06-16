import java.util.ArrayList;

public class taskManager {
    ArrayList<Task> list = new ArrayList<>();
    public void addTask(Task task) {
        list.add(task);
        System.out.println("Added task: " + task.getTitle());
    }
    public void removeTask(int id) {
        list.removeIf(t->t.getTaskId()==id);
        System.out.println("Removed task: " + id);
    }
    public void editTask(String name, String status) {
        for(Task t:list){
            if(t.getTitle().equalsIgnoreCase(name)){
                t.setStatus(status);
                System.out.println("Edited task: " + name);
                return;
            }
        }
        System.out.println("No task with that name");
    }
    public void SearchTask(int id) {
        for(Task t:list){
            if(t.getTaskId()==id){
                System.out.println("task Found: " + t.getTitle());
                return;
            }
        }
        System.out.println("No task with that name");
    }
    public void viewTask() {
        for(Task t:list){
            System.out.println("Id\tTitle\tDescription\tStatus\tDate");
            System.out.println(t.getTaskId()+"\t"+t.getTitle()+"\t"+t.getDescription()+"\t"+t.getStatus()+"\t"+t.getDate());
            return;
        }
        System.out.println("No task Remaining");

    }

}
