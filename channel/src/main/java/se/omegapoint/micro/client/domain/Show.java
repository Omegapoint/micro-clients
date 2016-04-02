package se.omegapoint.micro.client.domain;

import java.time.LocalDateTime;

public class Show {

    public final int id;
    public final String title;
    public final LocalDateTime startTime;

    public Show(int id, String title, LocalDateTime startTime) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
    }

}
