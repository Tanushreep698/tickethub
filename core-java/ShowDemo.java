import java.time.LocalDateTime;
public class ShowDemo {
    public static void main(String[]args){

        Event event = new Event("Rock Concert", "Live music concert");
        Show show = new Show(event, LocalDateTime.of(2024, 7, 15, 19, 30));
        System.out.println("Show Event: " + show.getEvent());
        System.out.println("Show Date and Time: " + show.getDateTime());
    }
    
}
