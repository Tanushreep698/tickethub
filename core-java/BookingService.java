
import java.util.List;
import java.util.ArrayList;

public class BookingService {

    private List<Booking> bookings = new ArrayList<>();





    public List<Booking> getAllBookings() {
        return bookings;
    }

    public Booking findBooking(String bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId().equals(bookingId)) {
                return booking;
            }
        }
        return null;
    }

    public void cancelBooking(String bookingId) {
        Booking booking = findBooking(bookingId);

        if (booking == null) {
            throw new IllegalArgumentException("Booking not found");
        }

        if (booking.getStatus() == BookingStatus.CANCELLED) {
            throw new IllegalStateException("Booking is already cancelled");
        }

        booking.cancel();
    }
    public void addBooking(Booking booking) {
        if (findBooking(booking.getBookingId()) != null) {
            throw new IllegalArgumentException("Booking ID already exists");
        }

        bookings.add(booking);
    }
}
