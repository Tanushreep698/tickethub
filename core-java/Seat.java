
import java.util.Objects;

public class Seat {
    private final String venueName;
    private final String row;
    private final int number;
    private final SeatCategory category;

    public Seat(String venueName, String row, int number, SeatCategory category) {
        if (venueName == null || venueName.isBlank()) {
            throw new IllegalArgumentException("Venue name cannot be empty");
        }

        if (row == null || row.isBlank()) {
            throw new IllegalArgumentException("Row cannot be empty");
        }

        if (number <= 0) {
            throw new IllegalArgumentException("Seat number must be greater than 0");
        }

        if (category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }

        this.venueName = venueName;
        this.row = row;
        this.number = number;
        this.category = category;
    }

    public String getVenueName() {
        return venueName;
    }

    public String getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    public SeatCategory getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Seat)) return false;

        Seat other = (Seat) obj;

        return number == other.number
                && venueName.equals(other.venueName)
                && row.equals(other.row);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueName, row, number);
    }

    @Override
    public String toString() {
        return "Seat{venue='" + venueName + "', row='" + row
                + "', number=" + number + ", category=" + category + "}";
    }
}
