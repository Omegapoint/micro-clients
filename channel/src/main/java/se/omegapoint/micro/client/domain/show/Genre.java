package se.omegapoint.micro.client.domain.show;

import java.util.Objects;

public class Genre {

    public final String value;

    public Genre(String value) {
        if (value == null || "".equals(value)){
            throw new IllegalArgumentException("Genre may not be blank.");
        }
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return Objects.equals(value, genre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
