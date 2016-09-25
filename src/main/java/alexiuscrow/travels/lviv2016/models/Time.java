package alexiuscrow.travels.lviv2016.models;


public class Time {
    private String title;
    private String time;

    public Time(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public Time() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
