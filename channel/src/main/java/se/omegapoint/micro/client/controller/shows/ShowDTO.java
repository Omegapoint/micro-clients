package se.omegapoint.micro.client.controller.shows;

/**
 * ShowDTO is used for not exposing the internal Show object to users (clients).
 *
 */
public class ShowDTO {

    public final int id;
    public final String title;
    public final String startTime;

    private ShowDTO(Builder builder) {
        id = builder.id;
        title = builder.title;
        startTime = builder.startTime;
    }

    public static Builder showDTO() {
        return new Builder();
    }


    public static final class Builder {
        private int id;
        private String title;
        private String startTime;

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

        public Builder startTime(String val) {
            startTime = val;
            return this;
        }

        public ShowDTO build() {
            return new ShowDTO(this);
        }
    }
}
