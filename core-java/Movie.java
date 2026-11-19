
public class Movie extends Event {
    private final String director;
    private final int duration; // in minutes

    public Movie(String title, String director, int duration) {
        super(title,"Movie");
        if (director == null || director.isBlank()) {
            throw new IllegalArgumentException("Director cannot be empty");
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be greater than 0");
        }
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Movie{title='" + getName() + "', director='" + director + "', duration=" + duration + " minutes}";
    }
}