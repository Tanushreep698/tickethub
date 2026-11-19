
public class Event {
    private final String name;
    private final String description;

    public Event(String name, String description) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Event name cannot be empty");
        }

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Event description cannot be empty");
        }

        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
