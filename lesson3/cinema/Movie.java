package homework.lesson3.cinema;

public class Movie {

    private String title;
    private int year;
    private int duration;
    private String description;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                '}';
    }
}
