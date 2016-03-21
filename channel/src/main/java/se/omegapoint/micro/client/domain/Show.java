package se.omegapoint.micro.client.domain;

public class Show {

    private final int id;
    private final String title;
    private final String startTime;

    public Show(int id, String title, String startTime) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getStartTime() {
        return startTime;
    }
}
