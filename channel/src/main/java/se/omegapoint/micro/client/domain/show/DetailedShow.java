package se.omegapoint.micro.client.domain.show;

import java.time.LocalDateTime;


public class DetailedShow {

    public final Id id;
    public final Title title;
    public final LocalDateTime startTime;
    public final Description description;
    public final Genre genre;
    public final Year year;

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
        private Id id;
        private Title title;
        private LocalDateTime startTime;
        private Description description;
        private Genre genre;
        private Year year;

        private Builder() {
        }

        public Builder withId(Id val) {
            id = val;
            return this;
        }

        public Builder withTitle(Title val) {
            title = val;
            return this;
        }

        public Builder withStartTime(LocalDateTime val) {
            startTime = val;
            return this;
        }

        public Builder withDescription(Description val) {
            description = val;
            return this;
        }

        public Builder withGenre(Genre val) {
            genre = val;
            return this;
        }

        public Builder withYear(Year val) {
            year = val;
            return this;
        }

        public DetailedShow build() {
            return new DetailedShow(this);
        }
    }


}
