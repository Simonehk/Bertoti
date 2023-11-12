import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrioritySortingStrategy implements TaskSortingStrategy {
    @Override
    public void sort(List<TaskComponent> tasks) {
        Collections.sort(tasks, Comparator.comparingInt(task -> ((Task) task).getPriority()));
    }

}
