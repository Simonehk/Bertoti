public class TaskListObserver implements TaskObserver {
    private TaskController controller;

    public TaskListObserver(TaskController controller) {
        this.controller = controller;
    }

    @Override
    public void update() {
        controller.updateView();
    }
}
