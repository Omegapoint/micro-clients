package se.omegapoint.micro.client.controller;

import java.time.LocalDateTime;

/**
 * Created by PNTSCOMP on 2016-04-02.
 */
public class DetailedShowApi {

    public final int id;
    public final int year;
    public final String title;
    public final String startTime;
    public final String description;
    public final String genre;

    private DetailedShowApi(Builder builder) {
        id = builder.id;
        year = builder.year;
        title = builder.title;
        startTime = builder.startTime;
        description = builder.description;
        genre = builder.genre;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private int id;
        private int year;
        private String title;
        private String startTime;
        private String description;
        private String genre;

        private Builder() {
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder year(int val) {
            year = val;
            return this;
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder startTime(String val) {
            startTime = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public Builder genre(String val) {
            genre = val;
            return this;
        }

        public DetailedShowApi build() {
            return new DetailedShowApi(this);
        }
    }
}
