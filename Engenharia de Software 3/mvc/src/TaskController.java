public class TaskController {
    private TaskModel model;
    private TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void addTask(TaskComponent taskListAsTask) {
        model.addTask(taskListAsTask);
    }

    public void updateView() {
        view.displayTasks(model.getTasks());
    }
}
