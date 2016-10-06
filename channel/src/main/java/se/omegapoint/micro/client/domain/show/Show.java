package se.omegapoint.micro.client.domain.show;

import java.time.LocalDateTime;

public class Show {

    public final Id id;
    public final Title title;
    public final LocalDateTime startTime;

    private Show(Builder builder) {
        id = builder.id;
        title = builder.title;
        startTime = builder.startTime;
    }

    public static Builder show() {
        return new Builder();
    }


    public static final class Builder {
        private Id id;
        private Title title;
        private LocalDateTime startTime;

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

        public Show build() {
            return new Show(this);
        }
    }
}
