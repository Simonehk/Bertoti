public class Task implements TaskComponent {
    private String description;

    public Task(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
