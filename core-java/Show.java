import java.time.LocalDateTime;
public class Show {
    private final Event event;
    private final LocalDateTime dateTime;

    public Show(Event event, LocalDateTime dateTime) {
        if (event == null ) {
            throw new IllegalArgumentException("Show event cannot be empty");
        }
        if(dateTime == null) {
            throw new IllegalArgumentException("Show date and time cannot be null");
        }
        this.event = event;
        this.dateTime = dateTime;
    }

    public Event getEvent() {
        return event;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
