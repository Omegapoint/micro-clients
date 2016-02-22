package se.omegapoint.micro.client;

public class Show {

    private final String title;
    private final String startTime;

    public Show(String title, String startTime) {
        this.title = title;
        this.startTime = startTime;
    }

    public String getTitle() {
        return title;
    }

    public String getStartTime() {
        return startTime;
    }
}
