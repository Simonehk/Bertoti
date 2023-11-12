import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);

        TaskListObserver observer = new TaskListObserver(controller);
        model.addObserver(observer);

        List<TaskComponent> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", 2)); // Prioridade 2
        tasks.add(new Task("Task 2", 1)); // Prioridade 1

        // Adicionando a TaskList como uma tarefa ao invés de adicioná-la diretamente
        TaskList taskList = new TaskList(tasks);
        TaskComponent taskListAsTask = taskList;
        controller.addTask(taskListAsTask);

        controller.updateView(); // Exibe as tarefas na view
    }
}
