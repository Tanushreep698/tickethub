public class Booking{

    private String bookingId;
    private String userId;
    private Show show;
    private Seat seat;
    private BookingStatus status;

    public Booking(String bookingId, String userId, Show show, Seat seat, BookingStatus status) {

        this.bookingId = bookingId;
        this.userId = userId;
        this.show = show;
        this.seat = seat;
        this.status = status;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public Show getShow() {
        return show;
    }

    public Seat getSeat() {
        return seat;
    }

    public BookingStatus getStatus() {
        return status;
    }


        public void cancel () {
            this.status = BookingStatus.CANCELLED;
        }

        public void confirm () {
            this.status = BookingStatus.CONFIRMED;
        }




    }



