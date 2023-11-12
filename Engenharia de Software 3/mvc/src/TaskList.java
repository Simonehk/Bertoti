import java.util.List;

public class TaskList implements TaskComponent {
    private List<TaskComponent> tasks;

    public TaskList(List<TaskComponent> tasks) {
        this.tasks = tasks;
    }

    public void addTask(TaskComponent task) {
        tasks.add(task);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Task List:\n");
        tasks.forEach(task -> description.append(task.getDescription()).append("\n"));
        return description.toString();
    }

    @Override
    public int getPriority() {
        // Prioridade da lista é a menor prioridade entre suas tarefas
        return tasks.stream().mapToInt(TaskComponent::getPriority).min().orElse(0);
    }
}