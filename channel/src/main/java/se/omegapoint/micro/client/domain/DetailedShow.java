package se.omegapoint.micro.client.domain;

import java.time.LocalDateTime;


public class DetailedShow {

    public final int id;
    public final String title;
    public final LocalDateTime startTime;
    public final String description;
    public final String genre;
    public final int year;


    /**
     * Builder Pattern
     */
    private DetailedShow(Builder builder) {
        id = builder.id;
        title = builder.title;
        startTime = builder.startTime;
        description = builder.description;
        genre = builder.genre;
        year = builder.year;
    }

    public static Builder detailedShow() {
        return new Builder();
    }

    public static final class Builder {
        private int id;
        private String title;
        private LocalDateTime startTime;
        private String description;
        private String genre;
        private int year;

        private Builder() {
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder startTime(LocalDateTime val) {
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

        public Builder year(int val) {
            year = val;
            return this;
        }

        public DetailedShow build() {
            return new DetailedShow(this);
        }
    }

    /**
     * Builder Pattern
     */

}
