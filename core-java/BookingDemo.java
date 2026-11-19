import java.time.LocalDateTime;

public class BookingDemo {
    public static void main(String[] args) {

        Event event = new Event("Rock Concert", "Live music concert");
        Show show = new Show(event, LocalDateTime.of(2026, 12, 15, 19, 30));
        Seat seat = new Seat("Main Hall", "A", 1, SeatCategory.GOLD);

        Booking booking = new Booking("B001", "U001", show, seat, BookingStatus.PENDING);

        BookingService service = new BookingService();

        service.addBooking(booking);

        System.out.println("All Bookings: " + service.getAllBookings().size());

        Booking found = service.findBooking("B001");
        System.out.println("Found Booking: " + found.getBookingId());

        service.cancelBooking("B001");
        System.out.println("Booking Status: " + found.getStatus());
    }
}