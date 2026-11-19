
import java.util.HashSet;
import java.util.Set;

public class SeatDemo {
    public static void main(String[] args) {
        Seat seat1 = new Seat("Main Hall", "A", 1, SeatCategory.GOLD);
        Seat seat2 = new Seat("Main Hall", "A", 1, SeatCategory.SILVER);
        Seat seat3 = new Seat("Main Hall", "A", 2, SeatCategory.GOLD);

        Set<Seat> seats = new HashSet<>();

        seats.add(seat1);
        seats.add(seat2);
        seats.add(seat3);

        System.out.println("Total unique seats: " + seats.size());
    }
}
