package software.ulpgc.kata2;

public class Title {
    private final String name;
    private final int year;
    private final int duration;
    private final String type;

    public Title(String name, int year, int duration, String type) {
        this.name = name;
        this.year = year;
        this.duration = duration;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", type='" + type + '\'' +
                '}';
    }
}
