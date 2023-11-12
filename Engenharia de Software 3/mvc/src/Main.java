public class Main {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);

        TaskListObserver observer = new TaskListObserver(controller);
        model.addObserver(observer);

        TaskList taskList = new TaskList();
        taskList.addTask(new Task("Task 1"));
        taskList.addTask(new Task("Task 2"));

        // Adicionando a TaskList como uma tarefa ao invés de adicioná-la diretamente
        TaskComponent taskListAsTask = taskList;
        controller.addTask(taskListAsTask);

        controller.updateView(); // Exibe as tarefas na view
    }
}
