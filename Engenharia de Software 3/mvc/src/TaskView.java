import java.util.List;

  public class TaskView {
    public void displayTasks(List<TaskComponent> tasks) {
        System.out.println("Tasks:");
        tasks.forEach(task -> System.out.println(task.getDescription()));
        System.out.println();
    }
}
