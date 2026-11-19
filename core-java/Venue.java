
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venue {
    private final String name;
    private final String address;
    private final List<Seat> seats;

    public Venue(String name, String address, List<Seat> seats) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Venue name cannot be empty");
        }

        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Venue address cannot be empty");
        }

        if (seats == null) {
            throw new IllegalArgumentException("Seats cannot be null");
        }

        this.name = name;
        this.address = address;
        this.seats = Collections.unmodifiableList(new ArrayList<>(seats));
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
