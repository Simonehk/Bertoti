import java.util.ArrayList;
import java.util.List;

public class TaskList implements TaskComponent {
    private List<TaskComponent> tasks = new ArrayList<>();

    public void addTask(TaskComponent task) {
        tasks.add(task);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Task List:\n");
        tasks.forEach(task -> description.append(task.getDescription()).append("\n"));
        return description.toString();
    }
}
