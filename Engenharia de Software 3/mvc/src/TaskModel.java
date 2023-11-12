import java.util.ArrayList;
import java.util.List;

public class TaskModel {
    private List<TaskComponent> tasks = new ArrayList<>();
    private List<TaskObserver> observers = new ArrayList<>();

    public void addTask(TaskComponent task) {
        tasks.add(task);
        notifyObservers();
    }

    public List<TaskComponent> getTasks() {
        return tasks;
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        observers.forEach(TaskObserver::update);
    }
}
